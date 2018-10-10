/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.StoreCharacteristicContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.StoreCharacteristics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store Characteristic Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.StoreCharacteristicContainerImpl#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreCharacteristicContainerImpl extends EntityImpl implements StoreCharacteristicContainer
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreCharacteristicContainerImpl()
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
		return CharacteristicsPackage.Literals.STORE_CHARACTERISTIC_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StoreCharacteristics> getCharacteristics()
	{
		return (EList<StoreCharacteristics>)eGet(CharacteristicsPackage.Literals.STORE_CHARACTERISTIC_CONTAINER__CHARACTERISTICS, true);
	}

} //StoreCharacteristicContainerImpl
