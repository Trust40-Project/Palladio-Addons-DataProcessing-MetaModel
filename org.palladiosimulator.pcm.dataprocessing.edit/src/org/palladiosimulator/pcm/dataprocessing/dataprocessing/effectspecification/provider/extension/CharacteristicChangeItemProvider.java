package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class CharacteristicChangeItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.provider.CharacteristicChangeItemProvider {

	public CharacteristicChangeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_CharacteristicChange_type"), super::getText);
	}
	
}
