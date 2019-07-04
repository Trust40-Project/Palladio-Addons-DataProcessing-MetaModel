package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class RefinedParameterBasedDataItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.provider.RefinedParameterBasedDataItemProvider {

	public RefinedParameterBasedDataItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_RefinedParameterBasedData_type"), super::getText);
	}

}
