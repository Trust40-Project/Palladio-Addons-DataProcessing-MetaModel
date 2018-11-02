/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicType;
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
public class EnumCharacteristicTypeImpl extends CharacteristicTypeImplCustom implements EnumCharacteristicType
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

	/**
	 * The cached invocation delegate for the '{@link #hasCompatibleValueRange(org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicType) <em>Has Compatible Value Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasCompatibleValueRange(org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate HAS_COMPATIBLE_VALUE_RANGE_CHARACTERISTIC_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)CharacteristicsPackage.Literals.ENUM_CHARACTERISTIC_TYPE.getEOperations().get(0)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasCompatibleValueRange(CharacteristicType characteristicType)
	{
		try
		{
			return (Boolean)HAS_COMPATIBLE_VALUE_RANGE_CHARACTERISTIC_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{characteristicType}));
		}
		catch (InvocationTargetException ite)
		{
			throw new WrappedException(ite);
		}
	}

} //EnumCharacteristicTypeImpl
