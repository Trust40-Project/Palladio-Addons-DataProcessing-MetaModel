/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicType;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessingFactoryImpl extends EFactoryImpl implements ProcessingFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessingFactory init()
	{
		try
		{
			ProcessingFactory theProcessingFactory = (ProcessingFactory)EPackage.Registry.INSTANCE.getEFactory(ProcessingPackage.eNS_URI);
			if (theProcessingFactory != null)
			{
				return theProcessingFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProcessingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingFactoryImpl()
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
			case ProcessingPackage.DATA_PROCESSING_CONTAINER: return (EObject)createDataProcessingContainer();
			case ProcessingPackage.CREATE_DATA_OPERATION: return (EObject)createCreateDataOperation();
			case ProcessingPackage.LOAD_DATA_OPERATION: return (EObject)createLoadDataOperation();
			case ProcessingPackage.LOAD_ALL_DATA_OPERATION: return (EObject)createLoadAllDataOperation();
			case ProcessingPackage.PERFORM_DATA_TRANSMISSION_OPERATION: return (EObject)createPerformDataTransmissionOperation();
			case ProcessingPackage.STORE_DATA_OPERATION: return (EObject)createStoreDataOperation();
			case ProcessingPackage.RETURN_DATA_OPERATION: return (EObject)createReturnDataOperation();
			case ProcessingPackage.USER_READ_DATA: return (EObject)createUserReadData();
			case ProcessingPackage.DATA_PARAMETER_MAPPING: return (EObject)createDataParameterMapping();
			case ProcessingPackage.DATA_RESULT_MAPPING: return (EObject)createDataResultMapping();
			case ProcessingPackage.JOIN_DATA_OPERATION: return (EObject)createJoinDataOperation();
			case ProcessingPackage.UNION_DATA_OPERATION: return (EObject)createUnionDataOperation();
			case ProcessingPackage.PROJECTION_DATA_OPERATION: return (EObject)createProjectionDataOperation();
			case ProcessingPackage.SELECTION_DATA_OPERATION: return (EObject)createSelectionDataOperation();
			case ProcessingPackage.CHARACTERISTIC_CHANGING_DATA_OPERATION: return (EObject)createCharacteristicChangingDataOperation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case ProcessingPackage.CHARACTERISTIC_CHANGE_OPERATION:
				return createCharacteristicChangeOperationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case ProcessingPackage.CHARACTERISTIC_CHANGE_OPERATION:
				return convertCharacteristicChangeOperationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProcessingContainer createDataProcessingContainer()
	{
		DataProcessingContainerImpl dataProcessingContainer = new DataProcessingContainerImpl();
		return dataProcessingContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateDataOperation createCreateDataOperation()
	{
		CreateDataOperationImpl createDataOperation = new CreateDataOperationImpl();
		return createDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadDataOperation createLoadDataOperation()
	{
		LoadDataOperationImpl loadDataOperation = new LoadDataOperationImpl();
		return loadDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadAllDataOperation createLoadAllDataOperation()
	{
		LoadAllDataOperationImpl loadAllDataOperation = new LoadAllDataOperationImpl();
		return loadAllDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformDataTransmissionOperation createPerformDataTransmissionOperation()
	{
		PerformDataTransmissionOperationImpl performDataTransmissionOperation = new PerformDataTransmissionOperationImpl();
		return performDataTransmissionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreDataOperation createStoreDataOperation()
	{
		StoreDataOperationImpl storeDataOperation = new StoreDataOperationImpl();
		return storeDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnDataOperation createReturnDataOperation()
	{
		ReturnDataOperationImpl returnDataOperation = new ReturnDataOperationImpl();
		return returnDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserReadData createUserReadData()
	{
		UserReadDataImpl userReadData = new UserReadDataImpl();
		return userReadData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataParameterMapping createDataParameterMapping()
	{
		DataParameterMappingImpl dataParameterMapping = new DataParameterMappingImpl();
		return dataParameterMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResultMapping createDataResultMapping()
	{
		DataResultMappingImpl dataResultMapping = new DataResultMappingImpl();
		return dataResultMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinDataOperation createJoinDataOperation()
	{
		JoinDataOperationImpl joinDataOperation = new JoinDataOperationImpl();
		return joinDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionDataOperation createUnionDataOperation()
	{
		UnionDataOperationImpl unionDataOperation = new UnionDataOperationImpl();
		return unionDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectionDataOperation createProjectionDataOperation()
	{
		ProjectionDataOperationImpl projectionDataOperation = new ProjectionDataOperationImpl();
		return projectionDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionDataOperation createSelectionDataOperation()
	{
		SelectionDataOperationImpl selectionDataOperation = new SelectionDataOperationImpl();
		return selectionDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends CharacteristicType> CharacteristicChangingDataOperation<T> createCharacteristicChangingDataOperation()
	{
		CharacteristicChangingDataOperationImpl<T> characteristicChangingDataOperation = new CharacteristicChangingDataOperationImpl<T>();
		return characteristicChangingDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicChangeOperation createCharacteristicChangeOperationFromString(EDataType eDataType, String initialValue)
	{
		CharacteristicChangeOperation result = CharacteristicChangeOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacteristicChangeOperationToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingPackage getProcessingPackage()
	{
		return (ProcessingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProcessingPackage getPackage()
	{
		return ProcessingPackage.eINSTANCE;
	}

} //ProcessingFactoryImpl
