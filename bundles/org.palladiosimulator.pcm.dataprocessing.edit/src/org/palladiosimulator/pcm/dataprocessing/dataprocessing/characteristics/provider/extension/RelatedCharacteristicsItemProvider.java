package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class RelatedCharacteristicsItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.provider.RelatedCharacteristicsItemProvider {

	public RelatedCharacteristicsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_RelatedCharacteristics_type"), super::getText);
	}

}
