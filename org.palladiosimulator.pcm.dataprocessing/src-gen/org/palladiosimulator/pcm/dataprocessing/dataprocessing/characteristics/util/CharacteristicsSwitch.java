/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.*;

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
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage
 * @generated
 */
public class CharacteristicsSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CharacteristicsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicsSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = CharacteristicsPackage.eINSTANCE;
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
			case CharacteristicsPackage.CHARACTERIZABLE:
			{
				Characterizable characterizable = (Characterizable)theEObject;
				T result = caseCharacterizable(characterizable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CharacteristicsPackage.CHARACTERISTIC_TYPE_CONTAINER:
			{
				CharacteristicTypeContainer characteristicTypeContainer = (CharacteristicTypeContainer)theEObject;
				T result = caseCharacteristicTypeContainer(characteristicTypeContainer);
				if (result == null) result = caseIdentifier(characteristicTypeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CharacteristicsPackage.CHARACTERISTIC_TYPE:
			{
				CharacteristicType characteristicType = (CharacteristicType)theEObject;
				T result = caseCharacteristicType(characteristicType);
				if (result == null) result = caseEntity(characteristicType);
				if (result == null) result = caseIdentifier(characteristicType);
				if (result == null) result = caseNamedElement(characteristicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CharacteristicsPackage.ENUM_CHARACTERISTIC_TYPE:
			{
				EnumCharacteristicType enumCharacteristicType = (EnumCharacteristicType)theEObject;
				T result = caseEnumCharacteristicType(enumCharacteristicType);
				if (result == null) result = caseCharacteristicType(enumCharacteristicType);
				if (result == null) result = caseEntity(enumCharacteristicType);
				if (result == null) result = caseIdentifier(enumCharacteristicType);
				if (result == null) result = caseNamedElement(enumCharacteristicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CharacteristicsPackage.ENUM_CHARACTERISTIC_LITERAL:
			{
				EnumCharacteristicLiteral enumCharacteristicLiteral = (EnumCharacteristicLiteral)theEObject;
				T result = caseEnumCharacteristicLiteral(enumCharacteristicLiteral);
				if (result == null) result = caseEntity(enumCharacteristicLiteral);
				if (result == null) result = caseIdentifier(enumCharacteristicLiteral);
				if (result == null) result = caseNamedElement(enumCharacteristicLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CharacteristicsPackage.CHARACTERISTIC_CONTAINER:
			{
				CharacteristicContainer characteristicContainer = (CharacteristicContainer)theEObject;
				T result = caseCharacteristicContainer(characteristicContainer);
				if (result == null) result = caseEntity(characteristicContainer);
				if (result == null) result = caseIdentifier(characteristicContainer);
				if (result == null) result = caseNamedElement(characteristicContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CharacteristicsPackage.CHARACTERISTIC:
			{
				Characteristic characteristic = (Characteristic)theEObject;
				T result = caseCharacteristic(characteristic);
				if (result == null) result = caseIdentifier(characteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CharacteristicsPackage.ENUM_CHARACTERISTIC:
			{
				EnumCharacteristic enumCharacteristic = (EnumCharacteristic)theEObject;
				T result = caseEnumCharacteristic(enumCharacteristic);
				if (result == null) result = caseCharacteristic(enumCharacteristic);
				if (result == null) result = caseIdentifier(enumCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CharacteristicsPackage.ENUMERATION:
			{
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseEntity(enumeration);
				if (result == null) result = caseIdentifier(enumeration);
				if (result == null) result = caseNamedElement(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CharacteristicsPackage.RELATED_CHARACTERISTICS:
			{
				RelatedCharacteristics relatedCharacteristics = (RelatedCharacteristics)theEObject;
				T result = caseRelatedCharacteristics(relatedCharacteristics);
				if (result == null) result = caseEntity(relatedCharacteristics);
				if (result == null) result = caseIdentifier(relatedCharacteristics);
				if (result == null) result = caseNamedElement(relatedCharacteristics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characterizable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characterizable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterizable(Characterizable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic Type Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic Type Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristicTypeContainer(CharacteristicTypeContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristicType(CharacteristicType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Characteristic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Characteristic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumCharacteristicType(EnumCharacteristicType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Characteristic Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Characteristic Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumCharacteristicLiteral(EnumCharacteristicLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristicContainer(CharacteristicContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristic(Characteristic object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumCharacteristic(EnumCharacteristic object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Characteristics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedCharacteristics(RelatedCharacteristics object)
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

} //CharacteristicsSwitch
