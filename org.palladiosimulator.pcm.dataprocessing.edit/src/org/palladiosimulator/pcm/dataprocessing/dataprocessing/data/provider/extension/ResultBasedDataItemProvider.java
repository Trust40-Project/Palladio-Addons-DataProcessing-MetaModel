package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.provider.extension;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataResultMapping;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.ItemPropertyDescriptorWrapper;

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
					if (data.eContainer() instanceof DataResultMapping) {
						DataResultMapping parentMapping = (DataResultMapping) data.eContainer();
						return Arrays.asList(parentMapping.getOperation());
					}
				}
				return super.getChoiceOfValues(object);
			}
			
		};
		itemPropertyDescriptors.add(descriptor);
	}

	
}
