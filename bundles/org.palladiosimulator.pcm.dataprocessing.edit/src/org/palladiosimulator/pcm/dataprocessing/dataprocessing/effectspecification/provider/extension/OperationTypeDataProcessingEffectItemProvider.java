package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class OperationTypeDataProcessingEffectItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.provider.OperationTypeDataProcessingEffectItemProvider {

	public OperationTypeDataProcessingEffectItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_OperationTypeDataProcessingEffect_type"), super::getText);
	}
}
