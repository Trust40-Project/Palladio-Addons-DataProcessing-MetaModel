/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.*;

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
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage
 * @generated
 */
public class ProcessingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProcessingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingSwitch() {
		if (modelPackage == null) {
			modelPackage = ProcessingPackage.eINSTANCE;
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
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProcessingPackage.DATA_PROCESSING_CONTAINER: {
				DataProcessingContainer dataProcessingContainer = (DataProcessingContainer)theEObject;
				T result = caseDataProcessingContainer(dataProcessingContainer);
				if (result == null) result = caseIdentifier(dataProcessingContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.DATA_OPERATION: {
				DataOperation dataOperation = (DataOperation)theEObject;
				T result = caseDataOperation(dataOperation);
				if (result == null) result = caseEntity(dataOperation);
				if (result == null) result = caseIdentifier(dataOperation);
				if (result == null) result = caseNamedElement(dataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.CREATE_DATA_OPERATION: {
				CreateDataOperation createDataOperation = (CreateDataOperation)theEObject;
				T result = caseCreateDataOperation(createDataOperation);
				if (result == null) result = caseDataOperation(createDataOperation);
				if (result == null) result = caseEntity(createDataOperation);
				if (result == null) result = caseIdentifier(createDataOperation);
				if (result == null) result = caseNamedElement(createDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.LOAD_DATA_OPERATION: {
				LoadDataOperation loadDataOperation = (LoadDataOperation)theEObject;
				T result = caseLoadDataOperation(loadDataOperation);
				if (result == null) result = caseCreateDataOperation(loadDataOperation);
				if (result == null) result = caseDataOperation(loadDataOperation);
				if (result == null) result = caseEntity(loadDataOperation);
				if (result == null) result = caseIdentifier(loadDataOperation);
				if (result == null) result = caseNamedElement(loadDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.LOAD_ALL_DATA_OPERATION: {
				LoadAllDataOperation loadAllDataOperation = (LoadAllDataOperation)theEObject;
				T result = caseLoadAllDataOperation(loadAllDataOperation);
				if (result == null) result = caseLoadDataOperation(loadAllDataOperation);
				if (result == null) result = caseCreateDataOperation(loadAllDataOperation);
				if (result == null) result = caseDataOperation(loadAllDataOperation);
				if (result == null) result = caseEntity(loadAllDataOperation);
				if (result == null) result = caseIdentifier(loadAllDataOperation);
				if (result == null) result = caseNamedElement(loadAllDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.PERFORM_DATA_TRANSMISSION_OPERATION: {
				PerformDataTransmissionOperation performDataTransmissionOperation = (PerformDataTransmissionOperation)theEObject;
				T result = casePerformDataTransmissionOperation(performDataTransmissionOperation);
				if (result == null) result = caseDataOperation(performDataTransmissionOperation);
				if (result == null) result = caseEntity(performDataTransmissionOperation);
				if (result == null) result = caseIdentifier(performDataTransmissionOperation);
				if (result == null) result = caseNamedElement(performDataTransmissionOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.CONSUME_DATA_OPERATION: {
				ConsumeDataOperation consumeDataOperation = (ConsumeDataOperation)theEObject;
				T result = caseConsumeDataOperation(consumeDataOperation);
				if (result == null) result = caseDataOperation(consumeDataOperation);
				if (result == null) result = caseEntity(consumeDataOperation);
				if (result == null) result = caseIdentifier(consumeDataOperation);
				if (result == null) result = caseNamedElement(consumeDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.STORE_DATA_OPERATION: {
				StoreDataOperation storeDataOperation = (StoreDataOperation)theEObject;
				T result = caseStoreDataOperation(storeDataOperation);
				if (result == null) result = caseConsumeDataOperation(storeDataOperation);
				if (result == null) result = caseDataOperation(storeDataOperation);
				if (result == null) result = caseEntity(storeDataOperation);
				if (result == null) result = caseIdentifier(storeDataOperation);
				if (result == null) result = caseNamedElement(storeDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.DATA_MAPPING: {
				DataMapping dataMapping = (DataMapping)theEObject;
				T result = caseDataMapping(dataMapping);
				if (result == null) result = caseIdentifier(dataMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.DATA_PARAMETER_MAPPING: {
				DataParameterMapping dataParameterMapping = (DataParameterMapping)theEObject;
				T result = caseDataParameterMapping(dataParameterMapping);
				if (result == null) result = caseDataMapping(dataParameterMapping);
				if (result == null) result = caseIdentifier(dataParameterMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.DATA_RESULT_MAPPING: {
				DataResultMapping dataResultMapping = (DataResultMapping)theEObject;
				T result = caseDataResultMapping(dataResultMapping);
				if (result == null) result = caseDataMapping(dataResultMapping);
				if (result == null) result = caseIdentifier(dataResultMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.MANY_TO_ONE_DATA_OPERATION: {
				ManyToOneDataOperation manyToOneDataOperation = (ManyToOneDataOperation)theEObject;
				T result = caseManyToOneDataOperation(manyToOneDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.JOIN_DATA_OPERATION: {
				JoinDataOperation joinDataOperation = (JoinDataOperation)theEObject;
				T result = caseJoinDataOperation(joinDataOperation);
				if (result == null) result = caseManyToOneDataOperation(joinDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.UNION_DATA_OPERATION: {
				UnionDataOperation unionDataOperation = (UnionDataOperation)theEObject;
				T result = caseUnionDataOperation(unionDataOperation);
				if (result == null) result = caseManyToOneDataOperation(unionDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Processing Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Processing Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataProcessingContainer(DataProcessingContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataOperation(DataOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Data Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateDataOperation(CreateDataOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Data Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadDataOperation(LoadDataOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load All Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load All Data Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadAllDataOperation(LoadAllDataOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perform Data Transmission Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform Data Transmission Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformDataTransmissionOperation(PerformDataTransmissionOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consume Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consume Data Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumeDataOperation(ConsumeDataOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store Data Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoreDataOperation(StoreDataOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataMapping(DataMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Parameter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Parameter Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataParameterMapping(DataParameterMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Result Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Result Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataResultMapping(DataResultMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Many To One Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Many To One Data Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManyToOneDataOperation(ManyToOneDataOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Data Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinDataOperation(JoinDataOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Data Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionDataOperation(UnionDataOperation object) {
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
	public T caseIdentifier(Identifier object) {
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
	public T caseNamedElement(NamedElement object) {
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
	public T caseEntity(Entity object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //ProcessingSwitch
