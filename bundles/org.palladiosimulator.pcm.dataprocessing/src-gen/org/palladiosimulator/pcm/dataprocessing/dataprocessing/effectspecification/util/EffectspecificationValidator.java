/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.util;

import de.uka.ipd.sdq.identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage
 * @generated
 */
public class EffectspecificationValidator extends EObjectValidator
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EffectspecificationValidator INSTANCE = new EffectspecificationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierValidator identifierValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectspecificationValidator()
	{
		super();
		identifierValidator = IdentifierValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage()
	{
	  return EffectspecificationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		switch (classifierID)
		{
			case EffectspecificationPackage.PROCESSING_EFFECT_SPECIFICATION:
				return validateProcessingEffectSpecification((ProcessingEffectSpecification)value, diagnostics, context);
			case EffectspecificationPackage.PROCESSING_EFFECT_OPERATION_TYPE:
				return validateProcessingEffectOperationType((ProcessingEffectOperationType)value, diagnostics, context);
			case EffectspecificationPackage.PROCESSING_EFFECT:
				return validateProcessingEffect((ProcessingEffect)value, diagnostics, context);
			case EffectspecificationPackage.OPERATION_TYPE_DATA_PROCESSING_EFFECT:
				return validateOperationTypeDataProcessingEffect((OperationTypeDataProcessingEffect)value, diagnostics, context);
			case EffectspecificationPackage.DATA_CREATION_PROCESSING_EFFECT:
				return validateDataCreationProcessingEffect((DataCreationProcessingEffect)value, diagnostics, context);
			case EffectspecificationPackage.CHARACTERISTIC_CHANGE:
				return validateCharacteristicChange((CharacteristicChange)value, diagnostics, context);
			case EffectspecificationPackage.CHARACTERISTIC_SPECIFICATION:
				return validateCharacteristicSpecification((CharacteristicSpecification)value, diagnostics, context);
			case EffectspecificationPackage.DIRECT_CHARACTERISTIC:
				return validateDirectCharacteristic((DirectCharacteristic)value, diagnostics, context);
			case EffectspecificationPackage.PROCESSING_EFFECT_PROVIDER:
				return validateProcessingEffectProvider((ProcessingEffectProvider)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingEffectSpecification(ProcessingEffectSpecification processingEffectSpecification, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)processingEffectSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)processingEffectSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)processingEffectSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)processingEffectSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)processingEffectSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)processingEffectSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)processingEffectSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)processingEffectSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)processingEffectSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(processingEffectSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingEffectOperationType(ProcessingEffectOperationType processingEffectOperationType, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)processingEffectOperationType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)processingEffectOperationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)processingEffectOperationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)processingEffectOperationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)processingEffectOperationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)processingEffectOperationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)processingEffectOperationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)processingEffectOperationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)processingEffectOperationType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(processingEffectOperationType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingEffect(ProcessingEffect processingEffect, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)processingEffect, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)processingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)processingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)processingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)processingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)processingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)processingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)processingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)processingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(processingEffect, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationTypeDataProcessingEffect(OperationTypeDataProcessingEffect operationTypeDataProcessingEffect, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)operationTypeDataProcessingEffect, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)operationTypeDataProcessingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)operationTypeDataProcessingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)operationTypeDataProcessingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)operationTypeDataProcessingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)operationTypeDataProcessingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)operationTypeDataProcessingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)operationTypeDataProcessingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)operationTypeDataProcessingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(operationTypeDataProcessingEffect, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCreationProcessingEffect(DataCreationProcessingEffect dataCreationProcessingEffect, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)dataCreationProcessingEffect, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)dataCreationProcessingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)dataCreationProcessingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)dataCreationProcessingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)dataCreationProcessingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)dataCreationProcessingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)dataCreationProcessingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)dataCreationProcessingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)dataCreationProcessingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(dataCreationProcessingEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataCreationProcessingEffect_fromDataTypeHasToBeUndefined(dataCreationProcessingEffect, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the fromDataTypeHasToBeUndefined constraint of '<em>Data Creation Processing Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_CREATION_PROCESSING_EFFECT__FROM_DATA_TYPE_HAS_TO_BE_UNDEFINED__EEXPRESSION = "fromDataType.oclIsUndefined()";

	/**
	 * Validates the fromDataTypeHasToBeUndefined constraint of '<em>Data Creation Processing Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCreationProcessingEffect_fromDataTypeHasToBeUndefined(DataCreationProcessingEffect dataCreationProcessingEffect, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(EffectspecificationPackage.Literals.DATA_CREATION_PROCESSING_EFFECT,
				 (EObject)dataCreationProcessingEffect,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "fromDataTypeHasToBeUndefined",
				 DATA_CREATION_PROCESSING_EFFECT__FROM_DATA_TYPE_HAS_TO_BE_UNDEFINED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicChange(CharacteristicChange characteristicChange, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)characteristicChange, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)characteristicChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)characteristicChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)characteristicChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)characteristicChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)characteristicChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)characteristicChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)characteristicChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)characteristicChange, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(characteristicChange, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicSpecification(CharacteristicSpecification characteristicSpecification, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)characteristicSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)characteristicSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)characteristicSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)characteristicSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)characteristicSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)characteristicSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)characteristicSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)characteristicSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)characteristicSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(characteristicSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectCharacteristic(DirectCharacteristic directCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)directCharacteristic, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)directCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)directCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)directCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)directCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)directCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)directCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)directCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)directCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(directCharacteristic, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingEffectProvider(ProcessingEffectProvider processingEffectProvider, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint((EObject)processingEffectProvider, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EffectspecificationValidator
