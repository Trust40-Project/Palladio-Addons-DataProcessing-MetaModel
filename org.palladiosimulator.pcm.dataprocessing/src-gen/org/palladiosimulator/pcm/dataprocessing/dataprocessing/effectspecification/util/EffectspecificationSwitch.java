/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecificationExtension;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage
 * @generated
 */
public class EffectspecificationSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EffectspecificationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectspecificationSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = EffectspecificationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case EffectspecificationPackage.PROCESSING_EFFECT_SPECIFICATION:
			{
				ProcessingEffectSpecification processingEffectSpecification = (ProcessingEffectSpecification)theEObject;
				T result = caseProcessingEffectSpecification(processingEffectSpecification);
				if (result == null) result = caseDataSpecificationExtension(processingEffectSpecification);
				if (result == null) result = caseIdentifier(processingEffectSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EffectspecificationPackage.PROCESSING_EFFECT_OPERATION_TYPE:
			{
				ProcessingEffectOperationType processingEffectOperationType = (ProcessingEffectOperationType)theEObject;
				T result = caseProcessingEffectOperationType(processingEffectOperationType);
				if (result == null) result = caseEntity(processingEffectOperationType);
				if (result == null) result = caseIdentifier(processingEffectOperationType);
				if (result == null) result = caseNamedElement(processingEffectOperationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EffectspecificationPackage.PROCESSING_EFFECT:
			{
				ProcessingEffect processingEffect = (ProcessingEffect)theEObject;
				T result = caseProcessingEffect(processingEffect);
				if (result == null) result = caseEntity(processingEffect);
				if (result == null) result = caseIdentifier(processingEffect);
				if (result == null) result = caseNamedElement(processingEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EffectspecificationPackage.OPERATION_TYPE_DATA_PROCESSING_EFFECT:
			{
				OperationTypeDataProcessingEffect operationTypeDataProcessingEffect = (OperationTypeDataProcessingEffect)theEObject;
				T result = caseOperationTypeDataProcessingEffect(operationTypeDataProcessingEffect);
				if (result == null) result = caseProcessingEffect(operationTypeDataProcessingEffect);
				if (result == null) result = caseEntity(operationTypeDataProcessingEffect);
				if (result == null) result = caseIdentifier(operationTypeDataProcessingEffect);
				if (result == null) result = caseNamedElement(operationTypeDataProcessingEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EffectspecificationPackage.DATA_CREATION_PROCESSING_EFFECT:
			{
				DataCreationProcessingEffect dataCreationProcessingEffect = (DataCreationProcessingEffect)theEObject;
				T result = caseDataCreationProcessingEffect(dataCreationProcessingEffect);
				if (result == null) result = caseProcessingEffect(dataCreationProcessingEffect);
				if (result == null) result = caseEntity(dataCreationProcessingEffect);
				if (result == null) result = caseIdentifier(dataCreationProcessingEffect);
				if (result == null) result = caseNamedElement(dataCreationProcessingEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EffectspecificationPackage.CHARACTERISTIC_CHANGE:
			{
				CharacteristicChange characteristicChange = (CharacteristicChange)theEObject;
				T result = caseCharacteristicChange(characteristicChange);
				if (result == null) result = caseEntity(characteristicChange);
				if (result == null) result = caseIdentifier(characteristicChange);
				if (result == null) result = caseNamedElement(characteristicChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EffectspecificationPackage.CHARACTERISTIC_SPECIFICATION:
			{
				CharacteristicSpecification characteristicSpecification = (CharacteristicSpecification)theEObject;
				T result = caseCharacteristicSpecification(characteristicSpecification);
				if (result == null) result = caseEntity(characteristicSpecification);
				if (result == null) result = caseIdentifier(characteristicSpecification);
				if (result == null) result = caseNamedElement(characteristicSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EffectspecificationPackage.DIRECT_CHARACTERISTIC:
			{
				DirectCharacteristic directCharacteristic = (DirectCharacteristic)theEObject;
				T result = caseDirectCharacteristic(directCharacteristic);
				if (result == null) result = caseCharacteristicSpecification(directCharacteristic);
				if (result == null) result = caseEntity(directCharacteristic);
				if (result == null) result = caseIdentifier(directCharacteristic);
				if (result == null) result = caseNamedElement(directCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EffectspecificationPackage.PROCESSING_EFFECT_PROVIDER:
			{
				ProcessingEffectProvider processingEffectProvider = (ProcessingEffectProvider)theEObject;
				T result = caseProcessingEffectProvider(processingEffectProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Effect Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Effect Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingEffectSpecification(ProcessingEffectSpecification object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Effect Operation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Effect Operation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingEffectOperationType(ProcessingEffectOperationType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingEffect(ProcessingEffect object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Type Data Processing Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Type Data Processing Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationTypeDataProcessingEffect(OperationTypeDataProcessingEffect object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Creation Processing Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Creation Processing Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCreationProcessingEffect(DataCreationProcessingEffect object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristicChange(CharacteristicChange object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristicSpecification(CharacteristicSpecification object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectCharacteristic(DirectCharacteristic object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Effect Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Effect Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingEffectProvider(ProcessingEffectProvider object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Specification Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Specification Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSpecificationExtension(DataSpecificationExtension object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //EffectspecificationSwitch
