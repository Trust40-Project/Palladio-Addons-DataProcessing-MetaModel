package org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class StoreContainerItemProvider
		extends org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.provider.StoreContainerItemProvider {

	public StoreContainerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_StoreContainer_type"), super::getText);
	}
}
