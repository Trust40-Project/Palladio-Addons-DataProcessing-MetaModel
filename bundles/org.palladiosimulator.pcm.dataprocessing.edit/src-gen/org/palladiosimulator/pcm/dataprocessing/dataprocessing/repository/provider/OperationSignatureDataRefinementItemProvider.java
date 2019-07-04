/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.core.entity.provider.EntityItemProvider;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataFactory;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.OperationSignatureDataRefinement;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.RepositoryPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.OperationSignatureDataRefinement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationSignatureDataRefinementItemProvider extends EntityItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignatureDataRefinementItemProvider(AdapterFactory adapterFactory)
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(RepositoryPackage.Literals.OPERATION_SIGNATURE_DATA_REFINEMENT__PARAMETER_REFINEMENTS);
			childrenFeatures.add(RepositoryPackage.Literals.OPERATION_SIGNATURE_DATA_REFINEMENT__RESULT_REFINEMENTS);
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
	 * This returns OperationSignatureDataRefinement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OperationSignatureDataRefinement"));
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
		String label = ((OperationSignatureDataRefinement)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_OperationSignatureDataRefinement_type") :
			getString("_UI_OperationSignatureDataRefinement_type") + " " + label;
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

		switch (notification.getFeatureID(OperationSignatureDataRefinement.class))
		{
			case RepositoryPackage.OPERATION_SIGNATURE_DATA_REFINEMENT__PARAMETER_REFINEMENTS:
			case RepositoryPackage.OPERATION_SIGNATURE_DATA_REFINEMENT__RESULT_REFINEMENTS:
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
				(RepositoryPackage.Literals.OPERATION_SIGNATURE_DATA_REFINEMENT__PARAMETER_REFINEMENTS,
				 DataFactory.eINSTANCE.createParameterBasedData()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.OPERATION_SIGNATURE_DATA_REFINEMENT__PARAMETER_REFINEMENTS,
				 DataFactory.eINSTANCE.createRefinedParameterBasedData()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.OPERATION_SIGNATURE_DATA_REFINEMENT__RESULT_REFINEMENTS,
				 DataFactory.eINSTANCE.createResultBasedData()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.OPERATION_SIGNATURE_DATA_REFINEMENT__RESULT_REFINEMENTS,
				 DataFactory.eINSTANCE.createRefinedResultBasedData()));
	}

}
