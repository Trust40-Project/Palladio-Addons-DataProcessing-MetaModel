package org.palladiosimulator.pcm.dataprocessing.edit.icons;

import org.eclipse.emf.common.util.ResourceLocator;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    private static Activator instance;
    private ResourceLocator resourceLocatorSingleton;
    
    @Override
    public void start(BundleContext context) throws Exception {
        setInstance(this);
        initResourceLocator();
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        setInstance(null);
    }

    public ResourceLocator getResourceLocator() {
        return resourceLocatorSingleton;
    }
    
    private void initResourceLocator() {
        resourceLocatorSingleton = new DataProcessingEditIconsResourceLocator();
    }
    
    public static Activator getInstance() {
        return Activator.instance;
    }

    private static void setInstance(Activator instance) {
        Activator.instance = instance;
    }
}
