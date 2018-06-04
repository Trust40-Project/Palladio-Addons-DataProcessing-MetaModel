package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class OriginalDataItemProvider
		extends org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.provider.OriginalDataItemProvider {

	public OriginalDataItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_OriginalData_type"), super::getText);
	}

}
