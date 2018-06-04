/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicType;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Enumeration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Characteristic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.EnumCharacteristicTypeImpl#isMultipleChoice <em>Multiple Choice</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.EnumCharacteristicTypeImpl#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumCharacteristicTypeImpl extends CharacteristicTypeImpl implements EnumCharacteristicType
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumCharacteristicTypeImpl()
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
		return CharacteristicsPackage.Literals.ENUM_CHARACTERISTIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultipleChoice()
	{
		return (Boolean)eGet(CharacteristicsPackage.Literals.ENUM_CHARACTERISTIC_TYPE__MULTIPLE_CHOICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleChoice(boolean newMultipleChoice)
	{
		eSet(CharacteristicsPackage.Literals.ENUM_CHARACTERISTIC_TYPE__MULTIPLE_CHOICE, newMultipleChoice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getEnum()
	{
		return (Enumeration)eGet(CharacteristicsPackage.Literals.ENUM_CHARACTERISTIC_TYPE__ENUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnum(Enumeration newEnum)
	{
		eSet(CharacteristicsPackage.Literals.ENUM_CHARACTERISTIC_TYPE__ENUM, newEnum);
	}

} //EnumCharacteristicTypeImpl
