package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class SelectionDataOperationItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.SelectionDataOperationItemProvider {

	public SelectionDataOperationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_SelectionDataOperation_type"), super::getText);
	}

}
