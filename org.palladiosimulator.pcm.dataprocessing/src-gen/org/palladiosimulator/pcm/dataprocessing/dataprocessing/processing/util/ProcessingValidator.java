/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.util;

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingValidator()
	{
		super();
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
			case ProcessingPackage.DATA_MAPPING:
				return validateDataMapping((DataMapping)value, diagnostics, context);
			case ProcessingPackage.DATA_PARAMETER_MAPPING:
				return validateDataParameterMapping((DataParameterMapping)value, diagnostics, context);
			case ProcessingPackage.DATA_RESULT_MAPPING:
				return validateDataResultMapping((DataResultMapping)value, diagnostics, context);
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
		return validate_EveryDefaultConstraint((EObject)dataProcessingContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataOperation(DataOperation dataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint((EObject)dataOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateDataOperation(CreateDataOperation createDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint((EObject)createDataOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadDataOperation(LoadDataOperation loadDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint((EObject)loadDataOperation, diagnostics, context);
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
		return validate_EveryDefaultConstraint((EObject)performDataTransmissionOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsumeDataOperation(ConsumeDataOperation consumeDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint((EObject)consumeDataOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoreDataOperation(StoreDataOperation storeDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint((EObject)storeDataOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnDataOperation(ReturnDataOperation returnDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint((EObject)returnDataOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserReadData(UserReadData userReadData, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint((EObject)userReadData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataMapping(DataMapping dataMapping, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint((EObject)dataMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataParameterMapping(DataParameterMapping dataParameterMapping, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint((EObject)dataParameterMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataResultMapping(DataResultMapping dataResultMapping, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)dataResultMapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)dataResultMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)dataResultMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)dataResultMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)dataResultMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)dataResultMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)dataResultMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)dataResultMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)dataResultMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataResultMapping_mappedDataMustBeInReceivedData(dataResultMapping, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mappedDataMustBeInReceivedData constraint of '<em>Data Result Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_RESULT_MAPPING__MAPPED_DATA_MUST_BE_IN_RECEIVED_DATA__EEXPRESSION = "self.receivedData->includes(self.data)";

	/**
	 * Validates the mappedDataMustBeInReceivedData constraint of '<em>Data Result Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataResultMapping_mappedDataMustBeInReceivedData(DataResultMapping dataResultMapping, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(ProcessingPackage.Literals.DATA_RESULT_MAPPING,
				 (EObject)dataResultMapping,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mappedDataMustBeInReceivedData",
				 DATA_RESULT_MAPPING__MAPPED_DATA_MUST_BE_IN_RECEIVED_DATA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManyToOneDataOperation(ManyToOneDataOperation manyToOneDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint((EObject)manyToOneDataOperation, diagnostics, context);
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
		"\t\t\t\tlet resultInnerDeclarations = self.resultingData.oclAsType(repository_1::CompositeDataType).innerDeclaration_CompositeDataType in\n" +
		"\t\t\t\t\tresultInnerDeclarations.datatype_InnerDeclaration = self.consumedData.type";

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
		return validate_EveryDefaultConstraint((EObject)transformDataOperation, diagnostics, context);
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
	protected static final String PROJECTION_DATA_OPERATION__OUTPUT_IS_COMPOSED_IN_INPUT__EEXPRESSION = "self.inputs.type.oclAsType(repository_1::CompositeDataType).innerDeclaration_CompositeDataType.datatype_InnerDeclaration->includes(self.output.type)";

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
		if (result || diagnostics != null) result &= validateSelectionDataOperation_inputAndOutputHaveSameEntityType(selectionDataOperation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the inputAndOutputHaveSameEntityType constraint of '<em>Selection Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SELECTION_DATA_OPERATION__INPUT_AND_OUTPUT_HAVE_SAME_ENTITY_TYPE__EEXPRESSION = "self.inputs.type->oclAsSet() = self.output.type->oclAsSet() or self.inputs.type.oclAsType(repository_1::CollectionDataType).innerType_CollectionDataType->oclAsSet() = self.output.type->oclAsSet()";

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
		return validate_EveryDefaultConstraint((EObject)characteristicChangingDataOperation, diagnostics, context);
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
