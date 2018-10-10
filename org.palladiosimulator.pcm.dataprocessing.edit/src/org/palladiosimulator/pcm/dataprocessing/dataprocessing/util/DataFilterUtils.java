package org.palladiosimulator.pcm.dataprocessing.dataprocessing.util;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ParameterBasedData;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataProcessingContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.OperationSignatureDataRefinement;
import org.palladiosimulator.pcm.dataprocessing.profile.api.ProfileConstants;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.pcm.usagemodel.ScenarioBehaviour;

public final class DataFilterUtils {

	private DataFilterUtils() {
		// intentionally left blank
	}

	public static <T> Collection<T> filterOutputDataByRefinements(Collection<T> originalValues,
			Object dataProcessingElement) {
		if (!(dataProcessingElement instanceof EObject)) {
			return originalValues;
		}

		EObject behavior = findBehavior((EObject) dataProcessingElement);
		Optional<Signature> signature = Optional.ofNullable(behavior)
				.filter(ServiceEffectSpecification.class::isInstance).map(ServiceEffectSpecification.class::cast)
				.map(ServiceEffectSpecification::getDescribedService__SEFF);
		Optional<OperationSignatureDataRefinement> refinement = signature.map(s -> StereotypeAPI.getTaggedValue(s,
				ProfileConstants.TAGGED_VALUE_NAME_OPERATION_SIGNATURE_DATA_REFINEMENT,
				ProfileConstants.STEREOTYPE_NAME_OPERATION_SIGNATURE_DATA_REFINEMENT));
		Collection<?> whitelist = refinement.map(OperationSignatureDataRefinement::getResultRefinements)
				.map(HashSet::new).map(Collection.class::cast).orElse(Collections.emptyList());
		List<T> result = originalValues.stream().filter(whitelist::contains).collect(Collectors.toList());
		if (!result.isEmpty()) {
			return result;
		}
		return originalValues;
	}

	public static <T> Collection<T> filterInputDataBySameBehavior(Collection<T> originalValues,
			Object dataProcessingElement) {
		if (!(dataProcessingElement instanceof EObject)) {
			return originalValues;
		}
		EObject mappingBehaviour = findBehavior((EObject) dataProcessingElement);
		Collection<Data> valueWhitelist = new HashSet<>();
		if (mappingBehaviour instanceof ServiceEffectSpecification) {
			Signature serviceSignature = ((ServiceEffectSpecification) mappingBehaviour).getDescribedService__SEFF();
			OperationSignatureDataRefinement refinement = StereotypeAPI.getTaggedValue(serviceSignature,
					ProfileConstants.TAGGED_VALUE_NAME_OPERATION_SIGNATURE_DATA_REFINEMENT,
					ProfileConstants.STEREOTYPE_NAME_OPERATION_SIGNATURE_DATA_REFINEMENT);
			refinement.getParameterRefinements().stream().filter(ParameterBasedData.class::isInstance)
					.forEach(valueWhitelist::add);
		}
		@SuppressWarnings("unchecked")
		Collection<T> result = originalValues.stream().filter(EObject.class::isInstance).map(EObject.class::cast)
				.filter(v -> valueWhitelist.contains(v)
						|| (findBehavior(v) == mappingBehaviour && v.eContainer() != dataProcessingElement))
				.map(o -> (T) o).collect(Collectors.toList());
		if (!result.isEmpty()) {
			return result;
		}
		return originalValues;
	}

	public static <T> Collection<T> filterDataBySameBehavior(Collection<T> originalValues,
			Object dataProcessingElement) {
		if (!(dataProcessingElement instanceof EObject)) {
			return originalValues;
		}
		
		EObject mappingBehaviour = findBehavior((EObject) dataProcessingElement);

		Collection<Data> valueWhitelist = new HashSet<>();
		if (mappingBehaviour instanceof ServiceEffectSpecification) {
			Signature serviceSignature = ((ServiceEffectSpecification) mappingBehaviour).getDescribedService__SEFF();
			OperationSignatureDataRefinement refinement = StereotypeAPI.getTaggedValue(serviceSignature,
					ProfileConstants.TAGGED_VALUE_NAME_OPERATION_SIGNATURE_DATA_REFINEMENT,
					ProfileConstants.STEREOTYPE_NAME_OPERATION_SIGNATURE_DATA_REFINEMENT);
			StreamSupport
					.stream(Spliterators.spliteratorUnknownSize(refinement.eAllContents(), Spliterator.ORDERED), false)
					.filter(Data.class::isInstance).map(Data.class::cast).forEach(valueWhitelist::add);
		}

		return originalValues.stream().filter(EObject.class::isInstance)
				.filter(d -> valueWhitelist.contains(d) || findBehavior((EObject)d) == mappingBehaviour)
				.collect(Collectors.toList());
	}

	public static EObject findBehavior(EObject dataProcessingElement) {
		Collection<EObject> actions = findCallActions(dataProcessingElement);
		Stream<EObject> seffs = actions.stream().map(a -> EcoreUtils.findParent(a, ServiceEffectSpecification.class))
				.filter(Optional::isPresent).map(Optional::get).distinct().map(EObject.class::cast);
		Stream<EObject> scenarioBehaviours = actions.stream()
				.map(a -> EcoreUtils.findParent(a, ScenarioBehaviour.class)).filter(Optional::isPresent)
				.map(Optional::get).map(EObject.class::cast);
		return Stream.concat(seffs, scenarioBehaviours).findFirst().orElse(null);
	}

	public static Optional<OperationSignature> findCalledSignature(DataMapping mapping) {
		Collection<EObject> callActions = findCallActions(mapping);
		Stream<OperationSignature> ecaSignatures = callActions.stream().filter(ExternalCallAction.class::isInstance)
				.map(ExternalCallAction.class::cast).map(ExternalCallAction::getCalledService_ExternalService);
		Stream<OperationSignature> elscSignatures = callActions.stream().filter(EntryLevelSystemCall.class::isInstance)
				.map(EntryLevelSystemCall.class::cast)
				.map(EntryLevelSystemCall::getOperationSignature__EntryLevelSystemCall);
		Optional<OperationSignature> calledSignature = Stream.concat(ecaSignatures, elscSignatures).findFirst();
		return calledSignature;
	}

	public static Collection<EObject> findCallActions(EObject dataProcessingElement) {
		Optional<DataProcessingContainer> processingContainer = EcoreUtils.findParent(dataProcessingElement,
				DataProcessingContainer.class);
		return processingContainer
				.map(pc -> EcoreUtils.getStereotypedElements(ProfileConstants.STEREOTYPE_NAME_DATA_PROCESSING, pc))
				.orElse(Collections.emptyList());
	}

	public static List<EObject> filterParameterValuesBySignature(Collection<EObject> originalValues,
			Optional<OperationSignature> calledSignature) {
		return originalValues.stream().filter(ParameterBasedData.class::isInstance).map(ParameterBasedData.class::cast)
				.filter(d -> calledSignature.map(s -> s.getParameters__OperationSignature().contains(d.getParameter()))
						.orElse(false))
				.collect(Collectors.toList());
	}

	public static List<EObject> filterResultValuesBySignature(Collection<EObject> originalValues,
			Optional<OperationSignature> calledSignature) {
		return originalValues.stream().filter(ResultBasedData.class::isInstance).map(ResultBasedData.class::cast)
				.filter(d -> d.eContainer() instanceof OperationSignatureDataRefinement)
				.filter(d -> calledSignature.map(d.getOperation()::equals).orElse(false)).collect(Collectors.toList());
	}

}
