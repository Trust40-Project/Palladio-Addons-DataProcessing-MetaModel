package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class PerformDataTransmissionOperationItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.PerformDataTransmissionOperationItemProvider {

	public PerformDataTransmissionOperationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_PerformDataTransmissionOperation_type"), super::getText);
	}

}
