package org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.provider.extension;

import org.eclipse.emf.common.notify.Adapter;

public class UtilItemProviderAdapterFactory
		extends org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.provider.UtilItemProviderAdapterFactory {

	@Override
	public Adapter createDataMappingAdapter() {
		if (dataMappingItemProvider == null) {
			dataMappingItemProvider = new DataMappingItemProvider(this);
		}
		return dataMappingItemProvider;
	}

}
