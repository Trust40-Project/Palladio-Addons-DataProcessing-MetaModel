/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.EffectSpecifyingTransformDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.EffectSpecifyingTransformDataOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EffectSpecifyingTransformDataOperationItemProvider extends TransformDataOperationItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectSpecifyingTransformDataOperationItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

			addProcessingEffectOperationTypePropertyDescriptor(object);
			addCustomProcessingEffectProviderPropertyDescriptor(object);
			addProcessingEffectProviderPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Processing Effect Operation Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessingEffectOperationTypePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingEffectOperationTypeSpecifyingOperation_processingEffectOperationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingEffectOperationTypeSpecifyingOperation_processingEffectOperationType_feature", "_UI_ProcessingEffectOperationTypeSpecifyingOperation_type"),
				 ProcessingPackage.Literals.PROCESSING_EFFECT_OPERATION_TYPE_SPECIFYING_OPERATION__PROCESSING_EFFECT_OPERATION_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Custom Processing Effect Provider feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomProcessingEffectProviderPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingEffectOperationTypeSpecifyingOperation_customProcessingEffectProvider_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingEffectOperationTypeSpecifyingOperation_customProcessingEffectProvider_feature", "_UI_ProcessingEffectOperationTypeSpecifyingOperation_type"),
				 ProcessingPackage.Literals.PROCESSING_EFFECT_OPERATION_TYPE_SPECIFYING_OPERATION__CUSTOM_PROCESSING_EFFECT_PROVIDER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Processing Effect Provider feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessingEffectProviderPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingEffectOperationTypeSpecifyingOperation_processingEffectProvider_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingEffectOperationTypeSpecifyingOperation_processingEffectProvider_feature", "_UI_ProcessingEffectOperationTypeSpecifyingOperation_type"),
				 ProcessingPackage.Literals.PROCESSING_EFFECT_OPERATION_TYPE_SPECIFYING_OPERATION__PROCESSING_EFFECT_PROVIDER,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns EffectSpecifyingTransformDataOperation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EffectSpecifyingTransformDataOperation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		String label = ((EffectSpecifyingTransformDataOperation)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_EffectSpecifyingTransformDataOperation_type") :
			getString("_UI_EffectSpecifyingTransformDataOperation_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
