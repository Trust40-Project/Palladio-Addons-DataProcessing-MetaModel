/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.util;

import de.uka.ipd.sdq.identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage
 * @generated
 */
public class ProcessingValidator extends EObjectValidator
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProcessingValidator INSTANCE = new ProcessingValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing";

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
	public ProcessingValidator()
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
	  return ProcessingPackage.eINSTANCE;
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
			case ProcessingPackage.DATA_PROCESSING_CONTAINER:
				return validateDataProcessingContainer((DataProcessingContainer)value, diagnostics, context);
			case ProcessingPackage.DATA_OPERATION:
				return validateDataOperation((DataOperation)value, diagnostics, context);
			case ProcessingPackage.CREATE_DATA_OPERATION:
				return validateCreateDataOperation((CreateDataOperation)value, diagnostics, context);
			case ProcessingPackage.LOAD_DATA_OPERATION:
				return validateLoadDataOperation((LoadDataOperation)value, diagnostics, context);
			case ProcessingPackage.LOAD_ALL_DATA_OPERATION:
				return validateLoadAllDataOperation((LoadAllDataOperation)value, diagnostics, context);
			case ProcessingPackage.PERFORM_DATA_TRANSMISSION_OPERATION:
				return validatePerformDataTransmissionOperation((PerformDataTransmissionOperation)value, diagnostics, context);
			case ProcessingPackage.CONSUME_DATA_OPERATION:
				return validateConsumeDataOperation((ConsumeDataOperation)value, diagnostics, context);
			case ProcessingPackage.STORE_DATA_OPERATION:
				return validateStoreDataOperation((StoreDataOperation)value, diagnostics, context);
			case ProcessingPackage.RETURN_DATA_OPERATION:
				return validateReturnDataOperation((ReturnDataOperation)value, diagnostics, context);
			case ProcessingPackage.USER_READ_DATA:
				return validateUserReadData((UserReadData)value, diagnostics, context);
			case ProcessingPackage.SYSTEM_DISCARD_DATA:
				return validateSystemDiscardData((SystemDiscardData)value, diagnostics, context);
			case ProcessingPackage.MANY_TO_ONE_DATA_OPERATION:
				return validateManyToOneDataOperation((ManyToOneDataOperation)value, diagnostics, context);
			case ProcessingPackage.JOIN_DATA_OPERATION:
				return validateJoinDataOperation((JoinDataOperation)value, diagnostics, context);
			case ProcessingPackage.UNION_DATA_OPERATION:
				return validateUnionDataOperation((UnionDataOperation)value, diagnostics, context);
			case ProcessingPackage.TRANSFORM_DATA_OPERATION:
				return validateTransformDataOperation((TransformDataOperation)value, diagnostics, context);
			case ProcessingPackage.PROJECTION_DATA_OPERATION:
				return validateProjectionDataOperation((ProjectionDataOperation)value, diagnostics, context);
			case ProcessingPackage.SELECTION_DATA_OPERATION:
				return validateSelectionDataOperation((SelectionDataOperation)value, diagnostics, context);
			case ProcessingPackage.CHARACTERISTIC_CHANGING_DATA_OPERATION:
				return validateCharacteristicChangingDataOperation((CharacteristicChangingDataOperation<?>)value, diagnostics, context);
			case ProcessingPackage.CHARACTERISTIC_CHANGE_OPERATION:
				return validateCharacteristicChangeOperation((CharacteristicChangeOperation)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataProcessingContainer(DataProcessingContainer dataProcessingContainer, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)dataProcessingContainer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)dataProcessingContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)dataProcessingContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)dataProcessingContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)dataProcessingContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)dataProcessingContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)dataProcessingContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)dataProcessingContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)dataProcessingContainer, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(dataProcessingContainer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataOperation(DataOperation dataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)dataOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)dataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)dataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)dataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)dataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)dataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)dataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)dataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)dataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(dataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOperation_outgoingDataIsUsed(dataOperation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the outgoingDataIsUsed constraint of '<em>Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_OPERATION__OUTGOING_DATA_IS_USED__EEXPRESSION = "self.outgoingData->size() = 0 or DataOperation.allInstances()->select(do | do.incomingData->exists(inData | self.outgoingData->includes(inData)))->excluding(self)->size() > 0";

	/**
	 * Validates the outgoingDataIsUsed constraint of '<em>Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataOperation_outgoingDataIsUsed(DataOperation dataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(ProcessingPackage.Literals.DATA_OPERATION,
				 (EObject)dataOperation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "outgoingDataIsUsed",
				 DATA_OPERATION__OUTGOING_DATA_IS_USED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateDataOperation(CreateDataOperation createDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)createDataOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)createDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)createDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)createDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)createDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)createDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)createDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)createDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)createDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(createDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOperation_outgoingDataIsUsed(createDataOperation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadDataOperation(LoadDataOperation loadDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)loadDataOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)loadDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)loadDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)loadDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)loadDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)loadDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)loadDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)loadDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)loadDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(loadDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOperation_outgoingDataIsUsed(loadDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadDataOperation_noManualCharacteristics(loadDataOperation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noManualCharacteristics constraint of '<em>Load Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOAD_DATA_OPERATION__NO_MANUAL_CHARACTERISTICS__EEXPRESSION = "self.initialCharacteristics->size() = 0";

	/**
	 * Validates the noManualCharacteristics constraint of '<em>Load Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadDataOperation_noManualCharacteristics(LoadDataOperation loadDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(ProcessingPackage.Literals.LOAD_DATA_OPERATION,
				 (EObject)loadDataOperation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noManualCharacteristics",
				 LOAD_DATA_OPERATION__NO_MANUAL_CHARACTERISTICS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadAllDataOperation(LoadAllDataOperation loadAllDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)loadAllDataOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)loadAllDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)loadAllDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)loadAllDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)loadAllDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)loadAllDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)loadAllDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)loadAllDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)loadAllDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(loadAllDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOperation_outgoingDataIsUsed(loadAllDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadDataOperation_noManualCharacteristics(loadAllDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadAllDataOperation_resultTypeMustBeCollection(loadAllDataOperation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the resultTypeMustBeCollection constraint of '<em>Load All Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOAD_ALL_DATA_OPERATION__RESULT_TYPE_MUST_BE_COLLECTION__EEXPRESSION = "self.resultingData.type.oclIsKindOf(repository_1::CollectionDataType)";

	/**
	 * Validates the resultTypeMustBeCollection constraint of '<em>Load All Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadAllDataOperation_resultTypeMustBeCollection(LoadAllDataOperation loadAllDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(ProcessingPackage.Literals.LOAD_ALL_DATA_OPERATION,
				 (EObject)loadAllDataOperation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "resultTypeMustBeCollection",
				 LOAD_ALL_DATA_OPERATION__RESULT_TYPE_MUST_BE_COLLECTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformDataTransmissionOperation(PerformDataTransmissionOperation performDataTransmissionOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)performDataTransmissionOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)performDataTransmissionOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)performDataTransmissionOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)performDataTransmissionOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)performDataTransmissionOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)performDataTransmissionOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)performDataTransmissionOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)performDataTransmissionOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)performDataTransmissionOperation, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(performDataTransmissionOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOperation_outgoingDataIsUsed(performDataTransmissionOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerformDataTransmissionOperation_outputMappingsAndOutputDataHasToMatch(performDataTransmissionOperation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the outputMappingsAndOutputDataHasToMatch constraint of '<em>Perform Data Transmission Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_MAPPINGS_AND_OUTPUT_DATA_HAS_TO_MATCH__EEXPRESSION = "outputMappings.to->asSet() = outputData->asSet()";

	/**
	 * Validates the outputMappingsAndOutputDataHasToMatch constraint of '<em>Perform Data Transmission Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformDataTransmissionOperation_outputMappingsAndOutputDataHasToMatch(PerformDataTransmissionOperation performDataTransmissionOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION,
				 (EObject)performDataTransmissionOperation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "outputMappingsAndOutputDataHasToMatch",
				 PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_MAPPINGS_AND_OUTPUT_DATA_HAS_TO_MATCH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsumeDataOperation(ConsumeDataOperation consumeDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)consumeDataOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)consumeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)consumeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)consumeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)consumeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)consumeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)consumeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)consumeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)consumeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(consumeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOperation_outgoingDataIsUsed(consumeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsumeDataOperation_noDataEmission(consumeDataOperation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noDataEmission constraint of '<em>Consume Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONSUME_DATA_OPERATION__NO_DATA_EMISSION__EEXPRESSION = "self.outgoingData->size() = 0";

	/**
	 * Validates the noDataEmission constraint of '<em>Consume Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsumeDataOperation_noDataEmission(ConsumeDataOperation consumeDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(ProcessingPackage.Literals.CONSUME_DATA_OPERATION,
				 (EObject)consumeDataOperation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noDataEmission",
				 CONSUME_DATA_OPERATION__NO_DATA_EMISSION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoreDataOperation(StoreDataOperation storeDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)storeDataOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)storeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)storeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)storeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)storeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)storeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)storeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)storeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)storeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(storeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOperation_outgoingDataIsUsed(storeDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsumeDataOperation_noDataEmission(storeDataOperation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnDataOperation(ReturnDataOperation returnDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)returnDataOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)returnDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)returnDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)returnDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)returnDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)returnDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)returnDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)returnDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)returnDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(returnDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOperation_outgoingDataIsUsed(returnDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsumeDataOperation_noDataEmission(returnDataOperation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserReadData(UserReadData userReadData, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)userReadData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)userReadData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)userReadData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)userReadData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)userReadData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)userReadData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)userReadData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)userReadData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)userReadData, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(userReadData, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOperation_outgoingDataIsUsed(userReadData, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsumeDataOperation_noDataEmission(userReadData, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemDiscardData(SystemDiscardData systemDiscardData, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)systemDiscardData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)systemDiscardData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)systemDiscardData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)systemDiscardData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)systemDiscardData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)systemDiscardData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)systemDiscardData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)systemDiscardData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)systemDiscardData, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(systemDiscardData, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOperation_outgoingDataIsUsed(systemDiscardData, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsumeDataOperation_noDataEmission(systemDiscardData, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManyToOneDataOperation(ManyToOneDataOperation manyToOneDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)manyToOneDataOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)manyToOneDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)manyToOneDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)manyToOneDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)manyToOneDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)manyToOneDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)manyToOneDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)manyToOneDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)manyToOneDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(manyToOneDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOperation_outgoingDataIsUsed(manyToOneDataOperation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinDataOperation(JoinDataOperation joinDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)joinDataOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOperation_outgoingDataIsUsed(joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateJoinDataOperation_resultMustBeCompositeOfInputs(joinDataOperation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the resultMustBeCompositeOfInputs constraint of '<em>Join Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JOIN_DATA_OPERATION__RESULT_MUST_BE_COMPOSITE_OF_INPUTS__EEXPRESSION = "\n" +
		"\t\t\t\tlet resultInnerDeclarationTypes = self.resultingData.type.oclAsType(repository_1::CompositeDataType).innerDeclaration_CompositeDataType.datatype_InnerDeclaration in\n" +
		"\t\t\t\t\tlet consumedDataTypes = self.consumedData.type in\n" +
		"\t\t\t\t\t\tresultInnerDeclarationTypes->asSet() = consumedDataTypes->asSet()";

	/**
	 * Validates the resultMustBeCompositeOfInputs constraint of '<em>Join Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinDataOperation_resultMustBeCompositeOfInputs(JoinDataOperation joinDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(ProcessingPackage.Literals.JOIN_DATA_OPERATION,
				 (EObject)joinDataOperation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "resultMustBeCompositeOfInputs",
				 JOIN_DATA_OPERATION__RESULT_MUST_BE_COMPOSITE_OF_INPUTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnionDataOperation(UnionDataOperation unionDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)unionDataOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)unionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)unionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)unionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)unionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)unionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)unionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)unionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)unionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(unionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOperation_outgoingDataIsUsed(unionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnionDataOperation_inputsMustBeResultTypeOrResultEntityType(unionDataOperation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the inputsMustBeResultTypeOrResultEntityType constraint of '<em>Union Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNION_DATA_OPERATION__INPUTS_MUST_BE_RESULT_TYPE_OR_RESULT_ENTITY_TYPE__EEXPRESSION = "\n" +
		"\t\t\t\tlet entityType = self.resultingData.oclAsType(repository_1::CollectionDataType).innerType_CollectionDataType in\n" +
		"\t\t\t\t\tself.consumedData.type->forAll(t |\n" +
		"\t\t\t\t\t\tt = entityType or t.oclAsType(repository_1::CollectionDataType).innerType_CollectionDataType = entityType)";

	/**
	 * Validates the inputsMustBeResultTypeOrResultEntityType constraint of '<em>Union Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnionDataOperation_inputsMustBeResultTypeOrResultEntityType(UnionDataOperation unionDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(ProcessingPackage.Literals.UNION_DATA_OPERATION,
				 (EObject)unionDataOperation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "inputsMustBeResultTypeOrResultEntityType",
				 UNION_DATA_OPERATION__INPUTS_MUST_BE_RESULT_TYPE_OR_RESULT_ENTITY_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformDataOperation(TransformDataOperation transformDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)transformDataOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)transformDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)transformDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)transformDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)transformDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)transformDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)transformDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)transformDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)transformDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(transformDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOperation_outgoingDataIsUsed(transformDataOperation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectionDataOperation(ProjectionDataOperation projectionDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)projectionDataOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)projectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)projectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)projectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)projectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)projectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)projectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)projectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)projectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(projectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOperation_outgoingDataIsUsed(projectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProjectionDataOperation_noParameters(projectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProjectionDataOperation_outputIsComposedInInput(projectionDataOperation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noParameters constraint of '<em>Projection Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROJECTION_DATA_OPERATION__NO_PARAMETERS__EEXPRESSION = "self.parameterData->isEmpty()";

	/**
	 * Validates the noParameters constraint of '<em>Projection Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectionDataOperation_noParameters(ProjectionDataOperation projectionDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(ProcessingPackage.Literals.PROJECTION_DATA_OPERATION,
				 (EObject)projectionDataOperation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noParameters",
				 PROJECTION_DATA_OPERATION__NO_PARAMETERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the outputIsComposedInInput constraint of '<em>Projection Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROJECTION_DATA_OPERATION__OUTPUT_IS_COMPOSED_IN_INPUT__EEXPRESSION = "self.input.type.oclAsType(repository_1::CompositeDataType).innerDeclaration_CompositeDataType.datatype_InnerDeclaration->includes(self.output.type)";

	/**
	 * Validates the outputIsComposedInInput constraint of '<em>Projection Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectionDataOperation_outputIsComposedInInput(ProjectionDataOperation projectionDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(ProcessingPackage.Literals.PROJECTION_DATA_OPERATION,
				 (EObject)projectionDataOperation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "outputIsComposedInInput",
				 PROJECTION_DATA_OPERATION__OUTPUT_IS_COMPOSED_IN_INPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionDataOperation(SelectionDataOperation selectionDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)selectionDataOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)selectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)selectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)selectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)selectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)selectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)selectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)selectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)selectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(selectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOperation_outgoingDataIsUsed(selectionDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelectionDataOperation_inputAndOutputHaveSameEntityType(selectionDataOperation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the inputAndOutputHaveSameEntityType constraint of '<em>Selection Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SELECTION_DATA_OPERATION__INPUT_AND_OUTPUT_HAVE_SAME_ENTITY_TYPE__EEXPRESSION = "self.input.type->oclAsSet() = self.output.type->oclAsSet() or self.input.type.oclAsType(repository_1::CollectionDataType).innerType_CollectionDataType->oclAsSet() = self.output.type->oclAsSet()";

	/**
	 * Validates the inputAndOutputHaveSameEntityType constraint of '<em>Selection Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionDataOperation_inputAndOutputHaveSameEntityType(SelectionDataOperation selectionDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(ProcessingPackage.Literals.SELECTION_DATA_OPERATION,
				 (EObject)selectionDataOperation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "inputAndOutputHaveSameEntityType",
				 SELECTION_DATA_OPERATION__INPUT_AND_OUTPUT_HAVE_SAME_ENTITY_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicChangingDataOperation(CharacteristicChangingDataOperation<?> characteristicChangingDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)characteristicChangingDataOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)characteristicChangingDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)characteristicChangingDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)characteristicChangingDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)characteristicChangingDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)characteristicChangingDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)characteristicChangingDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)characteristicChangingDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)characteristicChangingDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(characteristicChangingDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOperation_outgoingDataIsUsed(characteristicChangingDataOperation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicChangeOperation(CharacteristicChangeOperation characteristicChangeOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return true;
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

} //ProcessingValidator
