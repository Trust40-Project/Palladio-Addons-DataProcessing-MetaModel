package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.extension;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataResultMapping;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.ItemPropertyDescriptorWrapper;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;

public class DataResultMappingItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.DataResultMappingItemProvider {

	public DataResultMappingItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	protected void addOperationPropertyDescriptor(Object object) {
		super.addOperationPropertyDescriptor(object);
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
				return Arrays.asList(signature);
			}
		};
		itemPropertyDescriptors.add(descriptor);
	}

	@Override
	public String getText(Object object) {
		if (object instanceof DataResultMapping) {
			DataResultMapping mapping = (DataResultMapping) object;
			return String.format("%s %s -> %s (%s)", getString("_UI_DataResultMapping_type"),
					Optional.ofNullable(mapping.getOperation()).map(OperationSignature::getEntityName).orElse(""),
					Optional.ofNullable(mapping.getData()).map(Entity::getEntityName).orElse(""),
					mapping.getId());
		}
		return super.getText(object);
	}
}
