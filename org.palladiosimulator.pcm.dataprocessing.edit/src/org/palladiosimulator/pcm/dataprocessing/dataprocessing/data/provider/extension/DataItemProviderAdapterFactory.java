package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.provider.extension;

import org.eclipse.emf.common.notify.Adapter;

public class DataItemProviderAdapterFactory
		extends org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.provider.DataItemProviderAdapterFactory {

	@Override
	public Adapter createOriginalDataAdapter() {
		if (originalDataItemProvider == null) {
			originalDataItemProvider = new OriginalDataItemProvider(this);
		}
		return originalDataItemProvider;
	}

	@Override
	public Adapter createParameterBasedDataAdapter() {
		if (parameterBasedDataItemProvider == null) {
			parameterBasedDataItemProvider = new ParameterBasedDataItemProvider(this);
		}
		return parameterBasedDataItemProvider;
	}

	@Override
	public Adapter createResultBasedDataAdapter() {
		if (resultBasedDataItemProvider == null) {
			resultBasedDataItemProvider = new ResultBasedDataItemProvider(this);
		}
		return resultBasedDataItemProvider;
	}

}
