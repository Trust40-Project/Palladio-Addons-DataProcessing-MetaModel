/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicType;

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
public class ProcessingSwitch<T1> extends Switch<T1>
{
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
	public ProcessingSwitch()
	{
		if (modelPackage == null)
		{
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
	protected T1 doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case ProcessingPackage.DATA_PROCESSING_CONTAINER:
			{
				DataProcessingContainer dataProcessingContainer = (DataProcessingContainer)theEObject;
				T1 result = caseDataProcessingContainer(dataProcessingContainer);
				if (result == null) result = caseEntity(dataProcessingContainer);
				if (result == null) result = caseIdentifier(dataProcessingContainer);
				if (result == null) result = caseNamedElement(dataProcessingContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.DATA_OPERATION:
			{
				DataOperation dataOperation = (DataOperation)theEObject;
				T1 result = caseDataOperation(dataOperation);
				if (result == null) result = caseEntity(dataOperation);
				if (result == null) result = caseIdentifier(dataOperation);
				if (result == null) result = caseNamedElement(dataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.CREATE_DATA_OPERATION:
			{
				CreateDataOperation createDataOperation = (CreateDataOperation)theEObject;
				T1 result = caseCreateDataOperation(createDataOperation);
				if (result == null) result = caseDataOperation(createDataOperation);
				if (result == null) result = caseEntity(createDataOperation);
				if (result == null) result = caseIdentifier(createDataOperation);
				if (result == null) result = caseNamedElement(createDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.LOAD_DATA_OPERATION:
			{
				LoadDataOperation loadDataOperation = (LoadDataOperation)theEObject;
				T1 result = caseLoadDataOperation(loadDataOperation);
				if (result == null) result = caseCreateDataOperation(loadDataOperation);
				if (result == null) result = caseDataOperation(loadDataOperation);
				if (result == null) result = caseEntity(loadDataOperation);
				if (result == null) result = caseIdentifier(loadDataOperation);
				if (result == null) result = caseNamedElement(loadDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.LOAD_ALL_DATA_OPERATION:
			{
				LoadAllDataOperation loadAllDataOperation = (LoadAllDataOperation)theEObject;
				T1 result = caseLoadAllDataOperation(loadAllDataOperation);
				if (result == null) result = caseLoadDataOperation(loadAllDataOperation);
				if (result == null) result = caseCreateDataOperation(loadAllDataOperation);
				if (result == null) result = caseDataOperation(loadAllDataOperation);
				if (result == null) result = caseEntity(loadAllDataOperation);
				if (result == null) result = caseIdentifier(loadAllDataOperation);
				if (result == null) result = caseNamedElement(loadAllDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.PERFORM_DATA_TRANSMISSION_OPERATION:
			{
				PerformDataTransmissionOperation performDataTransmissionOperation = (PerformDataTransmissionOperation)theEObject;
				T1 result = casePerformDataTransmissionOperation(performDataTransmissionOperation);
				if (result == null) result = caseDataOperation(performDataTransmissionOperation);
				if (result == null) result = caseEntity(performDataTransmissionOperation);
				if (result == null) result = caseIdentifier(performDataTransmissionOperation);
				if (result == null) result = caseNamedElement(performDataTransmissionOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.CONSUME_DATA_OPERATION:
			{
				ConsumeDataOperation consumeDataOperation = (ConsumeDataOperation)theEObject;
				T1 result = caseConsumeDataOperation(consumeDataOperation);
				if (result == null) result = caseDataOperation(consumeDataOperation);
				if (result == null) result = caseEntity(consumeDataOperation);
				if (result == null) result = caseIdentifier(consumeDataOperation);
				if (result == null) result = caseNamedElement(consumeDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.STORE_DATA_OPERATION:
			{
				StoreDataOperation storeDataOperation = (StoreDataOperation)theEObject;
				T1 result = caseStoreDataOperation(storeDataOperation);
				if (result == null) result = caseConsumeDataOperation(storeDataOperation);
				if (result == null) result = caseDataOperation(storeDataOperation);
				if (result == null) result = caseEntity(storeDataOperation);
				if (result == null) result = caseIdentifier(storeDataOperation);
				if (result == null) result = caseNamedElement(storeDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.RETURN_DATA_OPERATION:
			{
				ReturnDataOperation returnDataOperation = (ReturnDataOperation)theEObject;
				T1 result = caseReturnDataOperation(returnDataOperation);
				if (result == null) result = caseConsumeDataOperation(returnDataOperation);
				if (result == null) result = caseDataOperation(returnDataOperation);
				if (result == null) result = caseEntity(returnDataOperation);
				if (result == null) result = caseIdentifier(returnDataOperation);
				if (result == null) result = caseNamedElement(returnDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.DATA_MAPPING:
			{
				DataMapping dataMapping = (DataMapping)theEObject;
				T1 result = caseDataMapping(dataMapping);
				if (result == null) result = caseIdentifier(dataMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.DATA_PARAMETER_MAPPING:
			{
				DataParameterMapping dataParameterMapping = (DataParameterMapping)theEObject;
				T1 result = caseDataParameterMapping(dataParameterMapping);
				if (result == null) result = caseDataMapping(dataParameterMapping);
				if (result == null) result = caseIdentifier(dataParameterMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.DATA_RESULT_MAPPING:
			{
				DataResultMapping dataResultMapping = (DataResultMapping)theEObject;
				T1 result = caseDataResultMapping(dataResultMapping);
				if (result == null) result = caseDataMapping(dataResultMapping);
				if (result == null) result = caseIdentifier(dataResultMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.MANY_TO_ONE_DATA_OPERATION:
			{
				ManyToOneDataOperation manyToOneDataOperation = (ManyToOneDataOperation)theEObject;
				T1 result = caseManyToOneDataOperation(manyToOneDataOperation);
				if (result == null) result = caseDataOperation(manyToOneDataOperation);
				if (result == null) result = caseEntity(manyToOneDataOperation);
				if (result == null) result = caseIdentifier(manyToOneDataOperation);
				if (result == null) result = caseNamedElement(manyToOneDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.JOIN_DATA_OPERATION:
			{
				JoinDataOperation joinDataOperation = (JoinDataOperation)theEObject;
				T1 result = caseJoinDataOperation(joinDataOperation);
				if (result == null) result = caseManyToOneDataOperation(joinDataOperation);
				if (result == null) result = caseDataOperation(joinDataOperation);
				if (result == null) result = caseEntity(joinDataOperation);
				if (result == null) result = caseIdentifier(joinDataOperation);
				if (result == null) result = caseNamedElement(joinDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.UNION_DATA_OPERATION:
			{
				UnionDataOperation unionDataOperation = (UnionDataOperation)theEObject;
				T1 result = caseUnionDataOperation(unionDataOperation);
				if (result == null) result = caseManyToOneDataOperation(unionDataOperation);
				if (result == null) result = caseDataOperation(unionDataOperation);
				if (result == null) result = caseEntity(unionDataOperation);
				if (result == null) result = caseIdentifier(unionDataOperation);
				if (result == null) result = caseNamedElement(unionDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.TRANSFORM_DATA_OPERATION:
			{
				TransformDataOperation transformDataOperation = (TransformDataOperation)theEObject;
				T1 result = caseTransformDataOperation(transformDataOperation);
				if (result == null) result = caseDataOperation(transformDataOperation);
				if (result == null) result = caseEntity(transformDataOperation);
				if (result == null) result = caseIdentifier(transformDataOperation);
				if (result == null) result = caseNamedElement(transformDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.PROJECTION_DATA_OPERATION:
			{
				ProjectionDataOperation projectionDataOperation = (ProjectionDataOperation)theEObject;
				T1 result = caseProjectionDataOperation(projectionDataOperation);
				if (result == null) result = caseTransformDataOperation(projectionDataOperation);
				if (result == null) result = caseDataOperation(projectionDataOperation);
				if (result == null) result = caseEntity(projectionDataOperation);
				if (result == null) result = caseIdentifier(projectionDataOperation);
				if (result == null) result = caseNamedElement(projectionDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.SELECTION_DATA_OPERATION:
			{
				SelectionDataOperation selectionDataOperation = (SelectionDataOperation)theEObject;
				T1 result = caseSelectionDataOperation(selectionDataOperation);
				if (result == null) result = caseTransformDataOperation(selectionDataOperation);
				if (result == null) result = caseDataOperation(selectionDataOperation);
				if (result == null) result = caseEntity(selectionDataOperation);
				if (result == null) result = caseIdentifier(selectionDataOperation);
				if (result == null) result = caseNamedElement(selectionDataOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessingPackage.CHARACTERISTIC_CHANGING_DATA_OPERATION:
			{
				CharacteristicChangingDataOperation<?> characteristicChangingDataOperation = (CharacteristicChangingDataOperation<?>)theEObject;
				T1 result = caseCharacteristicChangingDataOperation(characteristicChangingDataOperation);
				if (result == null) result = caseDataOperation(characteristicChangingDataOperation);
				if (result == null) result = caseEntity(characteristicChangingDataOperation);
				if (result == null) result = caseIdentifier(characteristicChangingDataOperation);
				if (result == null) result = caseNamedElement(characteristicChangingDataOperation);
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
	public T1 caseDataProcessingContainer(DataProcessingContainer object)
	{
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
	public T1 caseDataOperation(DataOperation object)
	{
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
	public T1 caseCreateDataOperation(CreateDataOperation object)
	{
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
	public T1 caseLoadDataOperation(LoadDataOperation object)
	{
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
	public T1 caseLoadAllDataOperation(LoadAllDataOperation object)
	{
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
	public T1 casePerformDataTransmissionOperation(PerformDataTransmissionOperation object)
	{
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
	public T1 caseConsumeDataOperation(ConsumeDataOperation object)
	{
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
	public T1 caseStoreDataOperation(StoreDataOperation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Data Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReturnDataOperation(ReturnDataOperation object)
	{
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
	public T1 caseDataMapping(DataMapping object)
	{
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
	public T1 caseDataParameterMapping(DataParameterMapping object)
	{
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
	public T1 caseDataResultMapping(DataResultMapping object)
	{
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
	public T1 caseManyToOneDataOperation(ManyToOneDataOperation object)
	{
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
	public T1 caseJoinDataOperation(JoinDataOperation object)
	{
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
	public T1 caseUnionDataOperation(UnionDataOperation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Data Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTransformDataOperation(TransformDataOperation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projection Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projection Data Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProjectionDataOperation(ProjectionDataOperation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Data Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSelectionDataOperation(SelectionDataOperation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic Changing Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic Changing Data Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends CharacteristicType> T1 caseCharacteristicChangingDataOperation(CharacteristicChangingDataOperation<T> object)
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
	public T1 caseIdentifier(Identifier object)
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
	public T1 caseNamedElement(NamedElement object)
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
	public T1 caseEntity(Entity object)
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
	public T1 defaultCase(EObject object)
	{
		return null;
	}

} //ProcessingSwitch
