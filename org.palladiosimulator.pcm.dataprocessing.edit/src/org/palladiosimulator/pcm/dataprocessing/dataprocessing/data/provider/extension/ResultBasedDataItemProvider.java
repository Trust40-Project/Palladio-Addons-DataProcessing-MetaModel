package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class ResultBasedDataItemProvider
		extends org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.provider.ResultBasedDataItemProvider {

	public ResultBasedDataItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_ResultBasedData_type"), super::getText);
	}

}
