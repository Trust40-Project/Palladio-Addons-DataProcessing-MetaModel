package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;

public class ProcessingEffectOperationTypeItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.provider.ProcessingEffectOperationTypeItemProvider {

	public ProcessingEffectOperationTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_ProcessingEffectOperationType_type"), super::getText);
	}

}
