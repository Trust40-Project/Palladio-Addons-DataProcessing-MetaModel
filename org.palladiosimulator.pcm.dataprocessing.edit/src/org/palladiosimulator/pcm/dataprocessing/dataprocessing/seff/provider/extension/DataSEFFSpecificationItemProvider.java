package org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class DataSEFFSpecificationItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.provider.DataSEFFSpecificationItemProvider {

	public DataSEFFSpecificationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_DataSEFFSpecification_type"), super::getText);
	}

}
