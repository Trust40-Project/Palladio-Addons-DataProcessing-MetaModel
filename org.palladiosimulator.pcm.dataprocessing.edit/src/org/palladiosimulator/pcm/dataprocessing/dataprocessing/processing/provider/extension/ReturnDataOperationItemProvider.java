package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class ReturnDataOperationItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.ReturnDataOperationItemProvider {

	public ReturnDataOperationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_ReturnDataOperation_type"), super::getText);
	}

}
