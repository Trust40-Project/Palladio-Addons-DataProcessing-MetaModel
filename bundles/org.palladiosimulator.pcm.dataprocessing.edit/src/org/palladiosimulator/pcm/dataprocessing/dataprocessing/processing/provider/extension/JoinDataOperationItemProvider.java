package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.extension;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataFilterUtils;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.ItemPropertyDescriptorWrapper;
import org.palladiosimulator.pcm.dataprocessing.edit.icons.Activator;

public class JoinDataOperationItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.JoinDataOperationItemProvider {

	public JoinDataOperationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	protected void addConsumedDataPropertyDescriptor(Object object) {
		super.addConsumedDataPropertyDescriptor(object);
		IItemPropertyDescriptor originalDescriptor = itemPropertyDescriptors.remove(itemPropertyDescriptors.size()-1);
		ItemPropertyDescriptorWrapper wrapper = new ItemPropertyDescriptorWrapper(originalDescriptor) {
			@SuppressWarnings("unchecked")
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				return DataFilterUtils.filterInputDataBySameBehavior((Collection<Object>)super.getChoiceOfValues(object), object);
			}
		};
		itemPropertyDescriptors.add(wrapper);
	}
	
	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_JoinDataOperation_type"), super::getText);
	}
	
    @Override
    public Object getImage(Object object) {
        Object image = Activator.getInstance().getResourceLocator().getImage("obj16/JoinDataOperation");
        return overlayImage(object, image);
    }

}
