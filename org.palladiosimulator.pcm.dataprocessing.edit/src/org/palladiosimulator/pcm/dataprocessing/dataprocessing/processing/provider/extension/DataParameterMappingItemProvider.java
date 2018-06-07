package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.extension;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataParameterMapping;
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
		ItemPropertyDescriptorWrapper descriptor = new ParameterChoiceItePropertyDescriptorWrapper(originalDescriptor) {

			@Override
			protected Collection<Object> processStereotypedElement(EObject pcmElement) {
				OperationSignature signature = null;
				if (pcmElement instanceof EntryLevelSystemCall) {
					signature = ((EntryLevelSystemCall) pcmElement).getOperationSignature__EntryLevelSystemCall();
				} else if (pcmElement instanceof ExternalCallAction) {
					signature = ((ExternalCallAction) pcmElement).getCalledService_ExternalService();
				}
				if (signature == null) {
					return Collections.emptyList();
				}
				return Collections.unmodifiableCollection(signature.getParameters__OperationSignature());
			}
		};
		itemPropertyDescriptors.add(descriptor);
	}
	
	@Override
	public String getText(Object object) {
		if (object instanceof DataParameterMapping) {
			DataParameterMapping mapping = (DataParameterMapping) object;
			return String.format("%s %s -> %s (%s)", getString("_UI_DataParameterMapping_type"),
					Optional.ofNullable(mapping.getParameter()).map(Parameter::getParameterName).orElse(""),
					Optional.ofNullable(mapping.getData()).map(Entity::getEntityName).orElse(""),
					mapping.getId());
		}
		return super.getText(object);
	}

}
