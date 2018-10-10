package org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.provider.extension;

import static org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataFilterUtils.filterParameterValuesBySignature;
import static org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataFilterUtils.filterResultValuesBySignature;
import static org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataFilterUtils.findCalledSignature;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataFilterUtils;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataMapping;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.ItemPropertyDescriptorWrapper;
import org.palladiosimulator.pcm.repository.OperationSignature;

public class DataMappingItemProvider
		extends org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.provider.DataMappingItemProvider {

	public DataMappingItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	protected void addFromPropertyDescriptor(Object object) {
		super.addFromPropertyDescriptor(object);
		IItemPropertyDescriptor originalDescriptor = itemPropertyDescriptors.remove(itemPropertyDescriptors.size() - 1);

		IItemPropertyDescriptor descriptor = new ItemPropertyDescriptorWrapper(originalDescriptor) {

			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<EObject> originalValues = super.getChoiceOfValues(object).stream()
						.filter(EObject.class::isInstance).map(EObject.class::cast).collect(Collectors.toList());
				if (object instanceof DataMapping) {
					DataMapping mapping = (DataMapping) object;
					Collection<EObject> result = Collections.emptyList();
					if (isInput(mapping)) {
						// values have to be in same behaviour
						result = DataFilterUtils.filterInputDataBySameBehavior(originalValues, mapping).stream().filter(o -> o.eContainer() != mapping.eContainer()).collect(Collectors.toList());
					} else if (isOutput(mapping)) {
						// values have to be in operation signature refinement
						Optional<OperationSignature> calledSignature = findCalledSignature(mapping);
						result = filterResultValuesBySignature(originalValues, calledSignature);
					}

					if (!result.isEmpty()) {
						return result;
					}
				}
				return originalValues;
			}

		};

		itemPropertyDescriptors.add(descriptor);
	}

	@Override
	protected void addToPropertyDescriptor(Object object) {
		super.addToPropertyDescriptor(object);
		IItemPropertyDescriptor originalDescriptor = itemPropertyDescriptors.remove(itemPropertyDescriptors.size() - 1);

		IItemPropertyDescriptor descriptor = new ItemPropertyDescriptorWrapper(originalDescriptor) {

			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<EObject> originalValues = super.getChoiceOfValues(object).stream()
						.filter(EObject.class::isInstance).map(EObject.class::cast).collect(Collectors.toList());
				if (object instanceof DataMapping) {
					DataMapping mapping = (DataMapping) object;
					Collection<EObject> result = Collections.emptyList();
					if (isInput(mapping)) {
						// values have to be in operation signature refinement
						Optional<OperationSignature> calledSignature = findCalledSignature(mapping);
						result = filterParameterValuesBySignature(originalValues, calledSignature);
					} else if (isOutput(mapping)) {
						// values have to be defined in the data transmission operation
						Collection<ResultBasedData> targetData = Optional.ofNullable(mapping.eContainer())
								.filter(PerformDataTransmissionOperation.class::isInstance)
								.map(PerformDataTransmissionOperation.class::cast)
								.map(PerformDataTransmissionOperation::getOutputData)
								.map(l -> (Collection<ResultBasedData>) l).orElse(Collections.emptyList());
						return originalValues.stream().filter(targetData::contains).collect(Collectors.toList());
					}

					if (!result.isEmpty()) {
						return result;
					}
				}
				return originalValues;
			}

		};

		itemPropertyDescriptors.add(descriptor);
	}

	@Override
	public String getText(Object object) {
		String originalText = super.getText(object);
		Optional<String> containmentReferenceName = Optional.ofNullable(object).filter(EObject.class::isInstance)
				.map(EObject.class::cast).map(EObject::eContainmentFeature).map(EReference::getName);
		return containmentReferenceName.map(n -> String.format("%s (%s)", originalText, n)).orElse(originalText);
	}

	protected boolean isOutput(DataMapping mapping) {
		return mapping
				.eContainmentFeature() == ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_MAPPINGS;
	}

	protected boolean isInput(DataMapping mapping) {
		return mapping
				.eContainmentFeature() == ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION__INPUT_MAPPINGS;
	}

}
