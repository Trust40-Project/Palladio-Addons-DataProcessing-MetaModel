package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class CharacteristicContainerItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.provider.CharacteristicContainerItemProvider {

	public CharacteristicContainerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_CharacteristicContainer_type"), super::getText);
	}

}
