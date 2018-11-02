package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.provider.extension;

import org.eclipse.emf.common.notify.Adapter;

public class EffectspecificationItemProviderAdapterFactory extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.provider.EffectspecificationItemProviderAdapterFactory {

	@Override
	public Adapter createProcessingEffectOperationTypeAdapter() {
		if (processingEffectOperationTypeItemProvider == null) {
			processingEffectOperationTypeItemProvider = new ProcessingEffectOperationTypeItemProvider(this);
		}
		return processingEffectOperationTypeItemProvider;
	}

	@Override
	public Adapter createOperationTypeDataProcessingEffectAdapter() {
		if (operationTypeDataProcessingEffectItemProvider == null) {
			operationTypeDataProcessingEffectItemProvider = new OperationTypeDataProcessingEffectItemProvider(this);
		}
		return operationTypeDataProcessingEffectItemProvider;
	}

	@Override
	public Adapter createDirectCharacteristicAdapter() {
		if (directCharacteristicItemProvider == null) {
			directCharacteristicItemProvider = new DirectCharacteristicItemProvider(this);
		}
		return directCharacteristicItemProvider;
	}

	@Override
	public Adapter createCharacteristicChangeAdapter() {
		if (characteristicChangeItemProvider == null) {
			characteristicChangeItemProvider = new CharacteristicChangeItemProvider(this);
		}
		return characteristicChangeItemProvider;
	}

}
