/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessingFactoryImpl extends EFactoryImpl implements ProcessingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessingFactory init() {
		try {
			ProcessingFactory theProcessingFactory = (ProcessingFactory)EPackage.Registry.INSTANCE.getEFactory(ProcessingPackage.eNS_URI);
			if (theProcessingFactory != null) {
				return theProcessingFactory;
			}
		}
		catch (Exception exception) {
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
	public ProcessingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProcessingPackage.DATA_PROCESSING_CONTAINER: return (EObject)createDataProcessingContainer();
			case ProcessingPackage.CREATE_DATA_OPERATION: return (EObject)createCreateDataOperation();
			case ProcessingPackage.LOAD_DATA_OPERATION: return (EObject)createLoadDataOperation();
			case ProcessingPackage.LOAD_ALL_DATA_OPERATION: return (EObject)createLoadAllDataOperation();
			case ProcessingPackage.PERFORM_DATA_TRANSMISSION_OPERATION: return (EObject)createPerformDataTransmissionOperation();
			case ProcessingPackage.STORE_DATA_OPERATION: return (EObject)createStoreDataOperation();
			case ProcessingPackage.DATA_PARAMETER_MAPPING: return (EObject)createDataParameterMapping();
			case ProcessingPackage.DATA_RESULT_MAPPING: return (EObject)createDataResultMapping();
			case ProcessingPackage.JOIN_DATA_OPERATION: return (EObject)createJoinDataOperation();
			case ProcessingPackage.UNION_DATA_OPERATION: return (EObject)createUnionDataOperation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProcessingContainer createDataProcessingContainer() {
		DataProcessingContainerImpl dataProcessingContainer = new DataProcessingContainerImpl();
		return dataProcessingContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateDataOperation createCreateDataOperation() {
		CreateDataOperationImpl createDataOperation = new CreateDataOperationImpl();
		return createDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadDataOperation createLoadDataOperation() {
		LoadDataOperationImpl loadDataOperation = new LoadDataOperationImpl();
		return loadDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadAllDataOperation createLoadAllDataOperation() {
		LoadAllDataOperationImpl loadAllDataOperation = new LoadAllDataOperationImpl();
		return loadAllDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformDataTransmissionOperation createPerformDataTransmissionOperation() {
		PerformDataTransmissionOperationImpl performDataTransmissionOperation = new PerformDataTransmissionOperationImpl();
		return performDataTransmissionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreDataOperation createStoreDataOperation() {
		StoreDataOperationImpl storeDataOperation = new StoreDataOperationImpl();
		return storeDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataParameterMapping createDataParameterMapping() {
		DataParameterMappingImpl dataParameterMapping = new DataParameterMappingImpl();
		return dataParameterMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResultMapping createDataResultMapping() {
		DataResultMappingImpl dataResultMapping = new DataResultMappingImpl();
		return dataResultMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinDataOperation createJoinDataOperation() {
		JoinDataOperationImpl joinDataOperation = new JoinDataOperationImpl();
		return joinDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionDataOperation createUnionDataOperation() {
		UnionDataOperationImpl unionDataOperation = new UnionDataOperationImpl();
		return unionDataOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingPackage getProcessingPackage() {
		return (ProcessingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProcessingPackage getPackage() {
		return ProcessingPackage.eINSTANCE;
	}

} //ProcessingFactoryImpl
