/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Characteristic;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.DirectCharacteristic;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.DirectCharacteristicImpl#getCharacteristic <em>Characteristic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectCharacteristicImpl extends CharacteristicSpecificationImpl implements DirectCharacteristic
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectCharacteristicImpl()
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
		return EffectspecificationPackage.Literals.DIRECT_CHARACTERISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characteristic getCharacteristic()
	{
		return (Characteristic)eGet(EffectspecificationPackage.Literals.DIRECT_CHARACTERISTIC__CHARACTERISTIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacteristic(Characteristic newCharacteristic)
	{
		eSet(EffectspecificationPackage.Literals.DIRECT_CHARACTERISTIC__CHARACTERISTIC, newCharacteristic);
	}

} //DirectCharacteristicImpl
