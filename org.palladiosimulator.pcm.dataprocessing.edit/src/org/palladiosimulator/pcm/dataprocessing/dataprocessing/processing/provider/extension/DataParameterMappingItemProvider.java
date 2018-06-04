package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.extension;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataProcessingContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.EcoreUtils;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.ItemPropertyDescriptorWrapper;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;

public class DataParameterMappingItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.DataParameterMappingItemProvider {

	public DataParameterMappingItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	protected void addParameterPropertyDescriptor(Object object) {
		super.addParameterPropertyDescriptor(object);
		IItemPropertyDescriptor originalDescriptor = itemPropertyDescriptors.remove(itemPropertyDescriptors.size() - 1);
		ItemPropertyDescriptorWrapper descriptor = new ItemPropertyDescriptorWrapper(originalDescriptor) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (object instanceof EObject) {
					EObject eobject = (EObject) object;
					Collection<EObject> stereotypedElements = EcoreUtils
							.findParent(eobject, DataProcessingContainer.class)
							.map(c -> EcoreUtils.getStereotypedElements("DataProcessingSpecification", c))
							.orElse(Collections.emptyList());
					List<Parameter> choiceOfValues = stereotypedElements.stream().map(this::findMatchingParameters).flatMap(Collection::stream).collect(Collectors.toList());
					if (!choiceOfValues.isEmpty()) {
						return choiceOfValues;
					}
				}
				return super.getChoiceOfValues(object);
			}
			
			private Collection<Parameter> findMatchingParameters(EObject pcmElement) {
				OperationSignature signature = null;
				if (pcmElement instanceof EntryLevelSystemCall) {
					signature = ((EntryLevelSystemCall) pcmElement).getOperationSignature__EntryLevelSystemCall();
				} else if (pcmElement instanceof ExternalCallAction) {
					signature = ((ExternalCallAction) pcmElement).getCalledService_ExternalService();
				}
				return Optional.ofNullable(signature).map(OperationSignature::getParameters__OperationSignature).map(l -> (Collection<Parameter>)l).orElse(Collections.emptyList());
			}

		};
		itemPropertyDescriptors.add(descriptor);
	}
	
	

}
