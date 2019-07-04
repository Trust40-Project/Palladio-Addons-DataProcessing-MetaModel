package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class DataCreationProcessingEffectItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.provider.DataCreationProcessingEffectItemProvider {

	public DataCreationProcessingEffectItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_DataCreationProcessingEffect_type"), super::getText);
	}
	
}
