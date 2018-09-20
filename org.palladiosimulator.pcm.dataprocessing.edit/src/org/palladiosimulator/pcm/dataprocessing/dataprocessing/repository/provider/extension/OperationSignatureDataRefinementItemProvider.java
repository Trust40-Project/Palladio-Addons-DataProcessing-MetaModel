package org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class OperationSignatureDataRefinementItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.provider.OperationSignatureDataRefinementItemProvider {

	public OperationSignatureDataRefinementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_OperationSignatureDataRefinement_type"), super::getText);
	}
	
}
