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
public class ProcessingValidator extends EObjectValidator {
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
	public ProcessingValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ProcessingPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
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
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataProcessingContainer(DataProcessingContainer dataProcessingContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)dataProcessingContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataOperation(DataOperation dataOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)dataOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateDataOperation(CreateDataOperation createDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)createDataOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadDataOperation(LoadDataOperation loadDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)loadDataOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadAllDataOperation(LoadAllDataOperation loadAllDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	protected static final String LOAD_ALL_DATA_OPERATION__RESULT_TYPE_MUST_BE_COLLECTION__EEXPRESSION = "self.resultingData.oclIsKindOf(repository_1::CollectionDataType)";

	/**
	 * Validates the resultTypeMustBeCollection constraint of '<em>Load All Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadAllDataOperation_resultTypeMustBeCollection(LoadAllDataOperation loadAllDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validatePerformDataTransmissionOperation(PerformDataTransmissionOperation performDataTransmissionOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)performDataTransmissionOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsumeDataOperation(ConsumeDataOperation consumeDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)consumeDataOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoreDataOperation(StoreDataOperation storeDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)storeDataOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataMapping(DataMapping dataMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)dataMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataParameterMapping(DataParameterMapping dataParameterMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)dataParameterMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataResultMapping(DataResultMapping dataResultMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)dataResultMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManyToOneDataOperation(ManyToOneDataOperation manyToOneDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)manyToOneDataOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinDataOperation(JoinDataOperation joinDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)joinDataOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)joinDataOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateJoinDataOperation_resultMustBeComposite(joinDataOperation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the resultMustBeComposite constraint of '<em>Join Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JOIN_DATA_OPERATION__RESULT_MUST_BE_COMPOSITE__EEXPRESSION = "\n" +
		"\t\t\t\tlet resultType = self.resultingData.oclAsType(repository_1::CompositeDataType) in\n" +
		"\t\t\t\t\tlet requiredDataTypes = resultType->closure(c | c.parentType_CompositeDataType)->including(resultType)->collect(innerDeclaration_CompositeDataType).datatype_InnerDeclaration in\n" +
		"\t\t\t\t\t\t/*requiredDataTypes->size() = self.consumedData and requiredDataTypes->includesAll();*/\n" +
		"\t\t\t\t\t\ttrue";

	/**
	 * Validates the resultMustBeComposite constraint of '<em>Join Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinDataOperation_resultMustBeComposite(JoinDataOperation joinDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProcessingPackage.Literals.JOIN_DATA_OPERATION,
				 (EObject)joinDataOperation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "resultMustBeComposite",
				 JOIN_DATA_OPERATION__RESULT_MUST_BE_COMPOSITE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnionDataOperation(UnionDataOperation unionDataOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)unionDataOperation, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ProcessingValidator
