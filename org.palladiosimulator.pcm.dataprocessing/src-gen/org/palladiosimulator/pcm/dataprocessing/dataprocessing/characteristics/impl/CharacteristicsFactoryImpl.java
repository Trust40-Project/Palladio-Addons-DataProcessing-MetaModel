/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CharacteristicsFactoryImpl extends EFactoryImpl implements CharacteristicsFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CharacteristicsFactory init()
	{
		try
		{
			CharacteristicsFactory theCharacteristicsFactory = (CharacteristicsFactory)EPackage.Registry.INSTANCE.getEFactory(CharacteristicsPackage.eNS_URI);
			if (theCharacteristicsFactory != null)
			{
				return theCharacteristicsFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CharacteristicsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicsFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case CharacteristicsPackage.CHARACTERISTIC_TYPE_CONTAINER: return (EObject)createCharacteristicTypeContainer();
			case CharacteristicsPackage.ENUM_CHARACTERISTIC_TYPE: return (EObject)createEnumCharacteristicType();
			case CharacteristicsPackage.ENUM_CHARACTERISTIC_LITERAL: return (EObject)createEnumCharacteristicLiteral();
			case CharacteristicsPackage.CHARACTERISTIC_CONTAINER: return (EObject)createCharacteristicContainer();
			case CharacteristicsPackage.ENUM_CHARACTERISTIC: return (EObject)createEnumCharacteristic();
			case CharacteristicsPackage.ENUMERATION: return (EObject)createEnumeration();
			case CharacteristicsPackage.RELATED_CHARACTERISTICS: return (EObject)createRelatedCharacteristics();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicTypeContainer createCharacteristicTypeContainer()
	{
		CharacteristicTypeContainerImpl characteristicTypeContainer = new CharacteristicTypeContainerImpl();
		return characteristicTypeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumCharacteristicType createEnumCharacteristicType()
	{
		EnumCharacteristicTypeImpl enumCharacteristicType = new EnumCharacteristicTypeImpl();
		return enumCharacteristicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumCharacteristicLiteral createEnumCharacteristicLiteral()
	{
		EnumCharacteristicLiteralImpl enumCharacteristicLiteral = new EnumCharacteristicLiteralImpl();
		return enumCharacteristicLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicContainer createCharacteristicContainer()
	{
		CharacteristicContainerImpl characteristicContainer = new CharacteristicContainerImpl();
		return characteristicContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumCharacteristic createEnumCharacteristic()
	{
		EnumCharacteristicImpl enumCharacteristic = new EnumCharacteristicImpl();
		return enumCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration()
	{
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedCharacteristics createRelatedCharacteristics()
	{
		RelatedCharacteristicsImpl relatedCharacteristics = new RelatedCharacteristicsImpl();
		return relatedCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicsPackage getCharacteristicsPackage()
	{
		return (CharacteristicsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CharacteristicsPackage getPackage()
	{
		return CharacteristicsPackage.eINSTANCE;
	}

} //CharacteristicsFactoryImpl
