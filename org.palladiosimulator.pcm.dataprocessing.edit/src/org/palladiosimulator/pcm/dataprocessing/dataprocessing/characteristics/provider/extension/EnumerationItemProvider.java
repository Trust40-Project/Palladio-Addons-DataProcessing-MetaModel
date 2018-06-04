package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class EnumerationItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.provider.EnumerationItemProvider {

	public EnumerationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_Enumeration_type"), super::getText);
	}

}
