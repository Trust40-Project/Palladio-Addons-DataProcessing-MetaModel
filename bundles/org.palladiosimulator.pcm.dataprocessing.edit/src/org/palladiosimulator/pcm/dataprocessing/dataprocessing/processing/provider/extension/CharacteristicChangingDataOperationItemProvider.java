package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.extension;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataFilterUtils;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.ItemPropertyDescriptorWrapper;

public class CharacteristicChangingDataOperationItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.CharacteristicChangingDataOperationItemProvider {

	public CharacteristicChangingDataOperationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	protected void addDataPropertyDescriptor(Object object) {
		super.addDataPropertyDescriptor(object);
		IItemPropertyDescriptor originalDescriptor = itemPropertyDescriptors.remove(itemPropertyDescriptors.size()-1);
		ItemPropertyDescriptorWrapper wrapper = new ItemPropertyDescriptorWrapper(originalDescriptor) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				return DataFilterUtils.filterDataBySameBehavior(super.getChoiceOfValues(object), object);
			}
		};
		itemPropertyDescriptors.add(wrapper);
	}

}
