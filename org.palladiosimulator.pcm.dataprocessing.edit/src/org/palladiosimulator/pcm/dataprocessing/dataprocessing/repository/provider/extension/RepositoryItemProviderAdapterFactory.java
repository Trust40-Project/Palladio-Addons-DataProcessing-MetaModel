package org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.provider.extension;

import org.eclipse.emf.common.notify.Adapter;

public class RepositoryItemProviderAdapterFactory extends org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.provider.RepositoryItemProviderAdapterFactory {
	
	@Override
	public Adapter createStoreAdapter()
	{
		if (storeItemProvider == null)
		{
			storeItemProvider = new StoreItemProvider(this);
		}

		return storeItemProvider;
	}
	
}
