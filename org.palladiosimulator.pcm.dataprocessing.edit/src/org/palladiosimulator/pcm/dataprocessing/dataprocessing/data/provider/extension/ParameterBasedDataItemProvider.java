package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.provider.extension;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.extension.ParameterChoiceItePropertyDescriptorWrapper;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.DataSEFFSpecification;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.ProfileConstants;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;

public class ParameterBasedDataItemProvider
		extends org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.provider.ParameterBasedDataItemProvider {

	public ParameterBasedDataItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_ParameterBasedData_type"), super::getText);
	}
	
	@Override
	protected void addParameterPropertyDescriptor(Object object) {
		super.addParameterPropertyDescriptor(object);
		IItemPropertyDescriptor originalDescriptor = itemPropertyDescriptors.remove(itemPropertyDescriptors.size() - 1);
		IItemPropertyDescriptor descriptor = new ParameterChoiceItePropertyDescriptorWrapper(originalDescriptor, DataSEFFSpecification.class, ProfileConstants.STEREOTYPE_NAME_DATA_SEFF_SPECIFICATION) {
			
			@Override
			protected Collection<Object> processStereotypedElement(EObject stereotypedElement) {
				if (stereotypedElement instanceof ServiceEffectSpecification) {
					ServiceEffectSpecification seff = (ServiceEffectSpecification) stereotypedElement;
					Optional<OperationSignature> signature = Optional.ofNullable(seff.getDescribedService__SEFF()).filter(OperationSignature.class::isInstance).map(OperationSignature.class::cast);
					if (signature.isPresent()) {
						return Collections.unmodifiableCollection(signature.get().getParameters__OperationSignature());
					}
				}
				return Collections.emptyList();
			}
			
		};
		itemPropertyDescriptors.add(descriptor);
	}


}
