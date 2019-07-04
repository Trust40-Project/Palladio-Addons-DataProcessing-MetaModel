/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristic;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.EnumCharacteristicImpl#getLiterals <em>Literals</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.EnumCharacteristicImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumCharacteristicImpl extends CharacteristicImplCustom implements EnumCharacteristic
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumCharacteristicImpl()
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
		return CharacteristicsPackage.Literals.ENUM_CHARACTERISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EnumCharacteristicLiteral> getLiterals()
	{
		return (EList<EnumCharacteristicLiteral>)eGet(CharacteristicsPackage.Literals.ENUM_CHARACTERISTIC__LITERALS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumCharacteristicType getType()
	{
		return (EnumCharacteristicType)eGet(CharacteristicsPackage.Literals.ENUM_CHARACTERISTIC__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EnumCharacteristicType newType)
	{
		eSet(CharacteristicsPackage.Literals.ENUM_CHARACTERISTIC__TYPE, newType);
	}

} //EnumCharacteristicImpl
