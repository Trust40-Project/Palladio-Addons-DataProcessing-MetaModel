package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.provider.extension;

import java.util.Optional;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristic;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicType;

public class EnumCharacteristicItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.provider.EnumCharacteristicItemProvider {

	public EnumCharacteristicItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
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
