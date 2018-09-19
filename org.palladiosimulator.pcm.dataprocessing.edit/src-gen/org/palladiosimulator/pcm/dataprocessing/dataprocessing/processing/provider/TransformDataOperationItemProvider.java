/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataFactory;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformDataOperationItemProvider extends DataOperationItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformDataOperationItemProvider(AdapterFactory adapterFactory)
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

			addInputsPropertyDescriptor(object);
			addParameterDataPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Inputs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputsPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransformDataOperation_inputs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransformDataOperation_inputs_feature", "_UI_TransformDataOperation_type"),
				 ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__INPUTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterDataPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransformDataOperation_parameterData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransformDataOperation_parameterData_feature", "_UI_TransformDataOperation_type"),
				 ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__PARAMETER_DATA,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__OUTPUT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
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
		String label = ((TransformDataOperation)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_TransformDataOperation_type") :
			getString("_UI_TransformDataOperation_type") + " " + label;
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

		switch (notification.getFeatureID(TransformDataOperation.class))
		{
			case ProcessingPackage.TRANSFORM_DATA_OPERATION__OUTPUT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
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

		newChildDescriptors.add
			(createChildParameter
				(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__OUTPUT,
				 DataFactory.eINSTANCE.createOriginalData()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__OUTPUT,
				 DataFactory.eINSTANCE.createParameterBasedData()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__OUTPUT,
				 DataFactory.eINSTANCE.createResultBasedData()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__OUTPUT,
				 DataFactory.eINSTANCE.createDerivedData()));
	}

}
