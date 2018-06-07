package org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.provider.extension;

import org.eclipse.emf.common.notify.Adapter;

public class SeffItemProviderAdapterFactory
		extends org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.provider.SeffItemProviderAdapterFactory {

	@Override
	public Adapter createDataSEFFSpecificationAdapter() {
		if (dataSEFFSpecificationItemProvider == null) {
			dataSEFFSpecificationItemProvider = new DataSEFFSpecificationItemProvider(this);
		}
		return dataSEFFSpecificationItemProvider;
	}

}
