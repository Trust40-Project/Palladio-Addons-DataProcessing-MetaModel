/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.RepositoryPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.Store;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.StoreContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.StoreContainerImpl#getStores <em>Stores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreContainerImpl extends EntityImpl implements StoreContainer
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreContainerImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return RepositoryPackage.Literals.STORE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Store> getStores()
	{
		return (EList<Store>)eGet(RepositoryPackage.Literals.STORE_CONTAINER__STORES, true);
	}

} //StoreContainerImpl
