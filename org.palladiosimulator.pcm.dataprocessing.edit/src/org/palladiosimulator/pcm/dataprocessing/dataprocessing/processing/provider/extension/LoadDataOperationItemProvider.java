package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.extension;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.StoreContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataFilterUtils;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.ItemPropertyDescriptorWrapper;
import org.palladiosimulator.pcm.dataprocessing.profile.api.ProfileConstants;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;

public class LoadDataOperationItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.LoadDataOperationItemProvider {

	public LoadDataOperationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_LoadDataOperation_type"), super::getText);
	}

	@Override
	protected void addStorePropertyDescriptor(Object object) {
		super.addStorePropertyDescriptor(object);
		IItemPropertyDescriptor originalDescriptor = itemPropertyDescriptors.remove(itemPropertyDescriptors.size() - 1);
		ItemPropertyDescriptorWrapper wrapper = new ItemPropertyDescriptorWrapper(originalDescriptor) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (!(object instanceof EObject)) {
					return super.getChoiceOfValues(object);
				}
				return filterChoiceOfStores(super.getChoiceOfValues(object), object);
			}
		};
		itemPropertyDescriptors.add(wrapper);
	}

	public static Collection<?> filterChoiceOfStores(Collection<?> choice, Object operation) {
		if (!(operation instanceof EObject)) {
			return choice;
		}

		Collection<?> whitelist = Optional.ofNullable(DataFilterUtils.findBehavior((EObject) operation))
				.filter(ServiceEffectSpecification.class::isInstance)
				.map(ServiceEffectSpecification.class::cast)
				.map(ServiceEffectSpecification::getBasicComponent_ServiceEffectSpecification)
				.filter(c -> StereotypeAPI.isStereotypeApplied(c,
						ProfileConstants.STEREOTYPE_NAME_STORE_HAVING))
				.map(c -> StereotypeAPI.getTaggedValue(c,
						ProfileConstants.TAGGED_VALUE_NAME_STORE_HAVING_CONTAINER,
						ProfileConstants.STEREOTYPE_NAME_STORE_HAVING))
				.filter(StoreContainer.class::isInstance).map(StoreContainer.class::cast)
				.map(StoreContainer::getStores).map(Collection.class::cast).orElse(Collections.emptyList());

		return choice.stream().filter(whitelist::contains)
				.collect(Collectors.toList());
	}
	
}
