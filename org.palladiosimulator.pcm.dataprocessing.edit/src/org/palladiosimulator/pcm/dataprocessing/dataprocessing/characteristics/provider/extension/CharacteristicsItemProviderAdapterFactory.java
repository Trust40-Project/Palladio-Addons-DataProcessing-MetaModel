package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.provider.extension;

import org.eclipse.emf.common.notify.Adapter;

public class CharacteristicsItemProviderAdapterFactory extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.provider.CharacteristicsItemProviderAdapterFactory {

	@Override
	public Adapter createEnumCharacteristicTypeAdapter() {
		if (enumCharacteristicTypeItemProvider == null) {
			enumCharacteristicTypeItemProvider = new EnumCharacteristicTypeItemProvider(this);
		}
		return enumCharacteristicTypeItemProvider;
	}

	@Override
	public Adapter createEnumerationAdapter() {
		if (enumerationItemProvider == null) {
			enumerationItemProvider = new EnumerationItemProvider(this);
		}
		return enumerationItemProvider;
	}

	@Override
	public Adapter createEnumCharacteristicLiteralAdapter() {
		if (enumCharacteristicLiteralItemProvider == null) {
			enumCharacteristicLiteralItemProvider = new EnumCharacteristicLiteralItemProvider(this);
		}
		return enumCharacteristicLiteralItemProvider;
	}

	@Override
	public Adapter createEnumCharacteristicAdapter() {
		if (enumCharacteristicItemProvider == null) {
			enumCharacteristicItemProvider = new EnumCharacteristicItemProvider(this);
		}
		return enumCharacteristicItemProvider;
	}

	@Override
	public Adapter createCharacteristicContainerAdapter() {
		if (characteristicContainerItemProvider == null) {
			characteristicContainerItemProvider = new CharacteristicContainerItemProvider(this);
		}
		return characteristicContainerItemProvider;
	}

	@Override
	public Adapter createRelatedCharacteristicsAdapter() {
		if (relatedCharacteristicsItemProvider == null) {
			relatedCharacteristicsItemProvider = new RelatedCharacteristicsItemProvider(this);
		}
		return relatedCharacteristicsItemProvider;
	}

}
