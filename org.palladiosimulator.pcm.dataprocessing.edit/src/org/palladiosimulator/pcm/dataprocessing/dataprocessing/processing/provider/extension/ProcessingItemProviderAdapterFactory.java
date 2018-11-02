package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.extension;

import org.eclipse.emf.common.notify.Adapter;

public class ProcessingItemProviderAdapterFactory extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.ProcessingItemProviderAdapterFactory {

	@Override
	public Adapter createDataProcessingContainerAdapter() {
		if (dataProcessingContainerItemProvider == null) {
			dataProcessingContainerItemProvider = new DataProcessingContainerItemProvider(this);
		}
		return dataProcessingContainerItemProvider;
	}

	@Override
	public Adapter createSelectionDataOperationAdapter() {
		if (selectionDataOperationItemProvider == null) {
			selectionDataOperationItemProvider = new SelectionDataOperationItemProvider(this);
		}
		return selectionDataOperationItemProvider;
	}

	@Override
	public Adapter createCreateDataOperationAdapter() {
		if (createDataOperationItemProvider == null) {
			createDataOperationItemProvider = new CreateDataOperationItemProvider(this);
		}
		return createDataOperationItemProvider;
	}

	@Override
	public Adapter createPerformDataTransmissionOperationAdapter() {
		if (performDataTransmissionOperationItemProvider == null) {
			performDataTransmissionOperationItemProvider = new PerformDataTransmissionOperationItemProvider(this);
		}
		return performDataTransmissionOperationItemProvider;
	}

	@Override
	public Adapter createReturnDataOperationAdapter() {
		if (returnDataOperationItemProvider == null) {
			returnDataOperationItemProvider = new ReturnDataOperationItemProvider(this);
		}
		return returnDataOperationItemProvider;
	}

	@Override
	public Adapter createProjectionDataOperationAdapter() {
		if (projectionDataOperationItemProvider == null) {
			projectionDataOperationItemProvider = new ProjectionDataOperationItemProvider(this);
		}
		return projectionDataOperationItemProvider;
	}

	@Override
	public Adapter createCharacteristicChangingDataOperationAdapter() {
		if (characteristicChangingDataOperationItemProvider == null) {
			characteristicChangingDataOperationItemProvider = new CharacteristicChangingDataOperationItemProvider(this);
		}
		return characteristicChangingDataOperationItemProvider;
	}

	@Override
	public Adapter createLoadDataOperationAdapter() {
		if (loadDataOperationItemProvider == null) {
			loadDataOperationItemProvider = new LoadDataOperationItemProvider(this);
		}
		return loadDataOperationItemProvider;
	}

	@Override
	public Adapter createLoadAllDataOperationAdapter() {
		if (loadAllDataOperationItemProvider == null) {
			loadAllDataOperationItemProvider = new LoadAllDataOperationItemProvider(this);
		}
		return loadAllDataOperationItemProvider;
	}

	@Override
	public Adapter createSystemDiscardDataAdapter() {
		if (systemDiscardDataItemProvider == null) {
			systemDiscardDataItemProvider = new SystemDiscardDataItemProvider(this);
		}
		return systemDiscardDataItemProvider;
	}

	@Override
	public Adapter createJoinDataOperationAdapter() {
		if (joinDataOperationItemProvider == null) {
			joinDataOperationItemProvider = new JoinDataOperationItemProvider(this);
		}
		return joinDataOperationItemProvider;
	}

	@Override
	public Adapter createEffectSpecifyingTransformDataOperationAdapter() {
		if (effectSpecifyingTransformDataOperationItemProvider == null) {
			effectSpecifyingTransformDataOperationItemProvider = new EffectSpecifyingTransformDataOperationItemProvider(
					this);
		}
		return effectSpecifyingTransformDataOperationItemProvider;
	}

	@Override
	public Adapter createStoreDataOperationAdapter() {
		if (storeDataOperationItemProvider == null) {
			storeDataOperationItemProvider = new StoreDataOperationItemProvider(this);
		}
		return storeDataOperationItemProvider;
	}

}
