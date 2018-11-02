/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EffectspecificationFactoryImpl extends EFactoryImpl implements EffectspecificationFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EffectspecificationFactory init()
	{
		try
		{
			EffectspecificationFactory theEffectspecificationFactory = (EffectspecificationFactory)EPackage.Registry.INSTANCE.getEFactory(EffectspecificationPackage.eNS_URI);
			if (theEffectspecificationFactory != null)
			{
				return theEffectspecificationFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EffectspecificationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectspecificationFactoryImpl()
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
			case EffectspecificationPackage.PROCESSING_EFFECT_SPECIFICATION: return (EObject)createProcessingEffectSpecification();
			case EffectspecificationPackage.PROCESSING_EFFECT_OPERATION_TYPE: return (EObject)createProcessingEffectOperationType();
			case EffectspecificationPackage.OPERATION_TYPE_DATA_PROCESSING_EFFECT: return (EObject)createOperationTypeDataProcessingEffect();
			case EffectspecificationPackage.DATA_CREATION_PROCESSING_EFFECT: return (EObject)createDataCreationProcessingEffect();
			case EffectspecificationPackage.CHARACTERISTIC_CHANGE: return (EObject)createCharacteristicChange();
			case EffectspecificationPackage.DIRECT_CHARACTERISTIC: return (EObject)createDirectCharacteristic();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingEffectSpecification createProcessingEffectSpecification()
	{
		ProcessingEffectSpecificationImpl processingEffectSpecification = new ProcessingEffectSpecificationImpl();
		return processingEffectSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingEffectOperationType createProcessingEffectOperationType()
	{
		ProcessingEffectOperationTypeImpl processingEffectOperationType = new ProcessingEffectOperationTypeImpl();
		return processingEffectOperationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationTypeDataProcessingEffect createOperationTypeDataProcessingEffect()
	{
		OperationTypeDataProcessingEffectImpl operationTypeDataProcessingEffect = new OperationTypeDataProcessingEffectImpl();
		return operationTypeDataProcessingEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCreationProcessingEffect createDataCreationProcessingEffect()
	{
		DataCreationProcessingEffectImpl dataCreationProcessingEffect = new DataCreationProcessingEffectImpl();
		return dataCreationProcessingEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicChange createCharacteristicChange()
	{
		CharacteristicChangeImpl characteristicChange = new CharacteristicChangeImpl();
		return characteristicChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectCharacteristic createDirectCharacteristic()
	{
		DirectCharacteristicImpl directCharacteristic = new DirectCharacteristicImpl();
		return directCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectspecificationPackage getEffectspecificationPackage()
	{
		return (EffectspecificationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EffectspecificationPackage getPackage()
	{
		return EffectspecificationPackage.eINSTANCE;
	}

} //EffectspecificationFactoryImpl
