package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.provider.extension;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.extension.ParameterChoiceItePropertyDescriptorWrapper;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.OperationSignatureDataRefinement;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;
import org.palladiosimulator.pcm.dataprocessing.profile.api.ProfileConstants;
import org.palladiosimulator.pcm.repository.OperationSignature;

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
		IItemPropertyDescriptor descriptor = new ParameterChoiceItePropertyDescriptorWrapper(originalDescriptor, OperationSignatureDataRefinement.class, ProfileConstants.STEREOTYPE_NAME_OPERATION_SIGNATURE_DATA_REFINEMENT) {
			
			@Override
			protected Collection<Object> processStereotypedElement(EObject stereotypedElement) {
				if (stereotypedElement instanceof OperationSignature) {
					OperationSignature signature = (OperationSignature) stereotypedElement;
						return Collections.unmodifiableCollection(signature.getParameters__OperationSignature());
				}
				return Collections.emptyList();
			}
			
		};
		itemPropertyDescriptors.add(descriptor);
	}


}
