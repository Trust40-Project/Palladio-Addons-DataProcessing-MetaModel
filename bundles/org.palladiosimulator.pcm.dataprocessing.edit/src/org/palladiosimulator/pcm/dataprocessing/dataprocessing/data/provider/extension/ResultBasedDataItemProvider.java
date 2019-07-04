package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.provider.extension;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.OperationSignatureDataRefinement;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.EcoreUtils;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.ItemPropertyDescriptorWrapper;
import org.palladiosimulator.pcm.dataprocessing.profile.api.ProfileConstants;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;

public class ResultBasedDataItemProvider
		extends org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.provider.ResultBasedDataItemProvider {

	public ResultBasedDataItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_ResultBasedData_type"), super::getText);
	}

	@Override
	protected void addOperationPropertyDescriptor(Object object) {
		super.addOperationPropertyDescriptor(object);
		IItemPropertyDescriptor originalDescriptor = itemPropertyDescriptors.remove(itemPropertyDescriptors.size() - 1);
		IItemPropertyDescriptor descriptor = new ItemPropertyDescriptorWrapper(originalDescriptor) {

			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (object instanceof ResultBasedData) {
					ResultBasedData data = (ResultBasedData)object;
					if (data.eContainer() instanceof PerformDataTransmissionOperation) {
						EObject dataProcessingContainer = data.eContainer().eContainer();
						Collection<EObject> callActions = EcoreUtils.getStereotypedElements(ProfileConstants.STEREOTYPE_NAME_DATA_PROCESSING, dataProcessingContainer);
						Stream<OperationSignature> elscSignatures = callActions.stream().filter(EntryLevelSystemCall.class::isInstance).map(EntryLevelSystemCall.class::cast).map(EntryLevelSystemCall::getOperationSignature__EntryLevelSystemCall);
						Stream<OperationSignature> ecaSignatures = callActions.stream().filter(ExternalCallAction.class::isInstance).map(ExternalCallAction.class::cast).map(ExternalCallAction::getCalledService_ExternalService);
						Collection<OperationSignature> candidates = Stream.concat(elscSignatures, ecaSignatures).collect(Collectors.toList());
						if (!candidates.isEmpty()) {
							return candidates;
						}
					}
					if (data.eContainer() instanceof OperationSignatureDataRefinement) {
						Collection<EObject> signature = EcoreUtils.getStereotypedElements(ProfileConstants.STEREOTYPE_NAME_OPERATION_SIGNATURE_DATA_REFINEMENT, data.eContainer());
						Collection<OperationSignature> result = signature.stream().filter(OperationSignature.class::isInstance).map(OperationSignature.class::cast).distinct().collect(Collectors.toList());
						if (!result.isEmpty()) {
							return result;
						}
					}
				}
				return super.getChoiceOfValues(object);
			}
			
		};
		itemPropertyDescriptors.add(descriptor);
	}

	
}
