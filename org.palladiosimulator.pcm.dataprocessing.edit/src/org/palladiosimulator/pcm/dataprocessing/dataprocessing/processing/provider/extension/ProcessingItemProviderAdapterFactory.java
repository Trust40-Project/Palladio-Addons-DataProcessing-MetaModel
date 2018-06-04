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
	public Adapter createDataParameterMappingAdapter() {
		if (dataParameterMappingItemProvider == null) {
			dataParameterMappingItemProvider = new DataParameterMappingItemProvider(this);
		}
		return dataParameterMappingItemProvider;
	}

}
