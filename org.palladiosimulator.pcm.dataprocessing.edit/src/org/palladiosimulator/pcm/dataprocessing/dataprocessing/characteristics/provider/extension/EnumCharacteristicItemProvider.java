package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.provider.extension;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristic;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicType;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Enumeration;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.ItemPropertyDescriptorWrapper;

public class EnumCharacteristicItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.provider.EnumCharacteristicItemProvider {

	public EnumCharacteristicItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	protected void addLiteralsPropertyDescriptor(Object object) {
		super.addLiteralsPropertyDescriptor(object);
		IItemPropertyDescriptor originalDescriptor = itemPropertyDescriptors.remove(itemPropertyDescriptors.size() - 1);
		ItemPropertyDescriptorWrapper wrapper = new ItemPropertyDescriptorWrapper(originalDescriptor) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (!(object instanceof EnumCharacteristic)) {
					return super.getChoiceOfValues(object);
				}
				EnumCharacteristic characteristic = (EnumCharacteristic) object;
				Collection<?> whitelist = Optional.ofNullable(characteristic.getType()).map(EnumCharacteristicType::getEnum).map(Enumeration::getLiterals).map(Collection.class::cast).orElse(Collections.emptyList());
				return super.getChoiceOfValues(object).stream().filter(whitelist::contains).collect(Collectors.toList());
			}
		};
		itemPropertyDescriptors.add(wrapper);
	}

	@Override
	public String getText(Object object) {
		if (object instanceof EnumCharacteristic) {
			EnumCharacteristic characteristic = (EnumCharacteristic)object;
			return String.format("%s %s (%s)", getString("_UI_EnumCharacteristic_type"), Optional.ofNullable(characteristic.getType()).map(EnumCharacteristicType::getEntityName).orElse(""), characteristic.getId());
		}
		return super.getText(object);
	}

}
