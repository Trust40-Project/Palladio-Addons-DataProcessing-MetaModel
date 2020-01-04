package org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;
import org.palladiosimulator.pcm.dataprocessing.edit.icons.Activator;

public class StoreItemProvider
		extends org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.provider.StoreItemProvider {

	public StoreItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_StoreContainer_type"), super::getText);
	}

    @Override
    public Object getImage(Object object) {
        Object image = Activator.getInstance().getResourceLocator().getImage("obj16/Store");
        return overlayImage(object, image);
    }
	
}
