package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class ParameterBasedDataItemProvider
		extends org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.provider.ParameterBasedDataItemProvider {

	public ParameterBasedDataItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_ParameterBasedData_type"), super::getText);
	}

}
