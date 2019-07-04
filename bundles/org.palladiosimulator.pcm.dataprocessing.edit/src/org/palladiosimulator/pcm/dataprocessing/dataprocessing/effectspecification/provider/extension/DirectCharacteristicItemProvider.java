package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class DirectCharacteristicItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.provider.DirectCharacteristicItemProvider {

	public DirectCharacteristicItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_DirectCharacteristic_type"), super::getText);
	}
}
