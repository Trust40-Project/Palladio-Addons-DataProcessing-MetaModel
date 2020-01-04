package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.provider.extension;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.palladiosimulator.pcm.dataprocessing.edit.icons.Activator;

public class CharacteristicTypeContainerItemProvider extends
        org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.provider.CharacteristicTypeContainerItemProvider {

    public CharacteristicTypeContainerItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    @Override
    public Object getImage(Object object) {
        Object image = Activator.getInstance().getResourceLocator().getImage("obj16/CharacteristicTypeContainer");
        return overlayImage(object, image);
    }
    
}
