package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class EnumCharacteristicLiteralItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.provider.EnumCharacteristicLiteralItemProvider {

	public EnumCharacteristicLiteralItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_EnumCharacteristicLiteral_type"), super::getText);
	}

}
