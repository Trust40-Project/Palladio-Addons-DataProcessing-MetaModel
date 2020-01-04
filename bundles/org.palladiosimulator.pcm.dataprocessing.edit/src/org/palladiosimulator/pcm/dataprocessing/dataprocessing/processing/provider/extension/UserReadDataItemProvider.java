package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;
import org.palladiosimulator.pcm.dataprocessing.edit.icons.Activator;

public class UserReadDataItemProvider
		extends org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.UserReadDataItemProvider {

	public UserReadDataItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_UserReadData_type"), super::getText);
	}
	
    @Override
    public Object getImage(Object object) {
        Object image = Activator.getInstance().getResourceLocator().getImage("obj16/UserReadData");
        return overlayImage(object, image);
    }
	
}
