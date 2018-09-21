/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ProcessingPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "processing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palladiosimulator.org/pcm/dataprocessing/processing/0.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "processing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessingPackage eINSTANCE = org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataProcessingContainerImpl <em>Data Processing Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataProcessingContainerImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getDataProcessingContainer()
	 * @generated
	 */
	int DATA_PROCESSING_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_CONTAINER__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_CONTAINER__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_CONTAINER__OPERATIONS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Processing Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_CONTAINER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataOperationImpl <em>Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataOperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getDataOperation()
	 * @generated
	 */
	int DATA_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION__CONTAINER = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION__INCOMING_DATA = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION__OUTGOING_DATA = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.CreateDataOperationImpl <em>Create Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.CreateDataOperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getCreateDataOperation()
	 * @generated
	 */
	int CREATE_DATA_OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_DATA_OPERATION__ID = DATA_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_DATA_OPERATION__ENTITY_NAME = DATA_OPERATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_DATA_OPERATION__CONTAINER = DATA_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_DATA_OPERATION__INCOMING_DATA = DATA_OPERATION__INCOMING_DATA;

	/**
	 * The feature id for the '<em><b>Outgoing Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_DATA_OPERATION__OUTGOING_DATA = DATA_OPERATION__OUTGOING_DATA;

	/**
	 * The feature id for the '<em><b>Resulting Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_DATA_OPERATION__RESULTING_DATA = DATA_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_DATA_OPERATION_FEATURE_COUNT = DATA_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.LoadDataOperationImpl <em>Load Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.LoadDataOperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getLoadDataOperation()
	 * @generated
	 */
	int LOAD_DATA_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_OPERATION__ID = CREATE_DATA_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_OPERATION__ENTITY_NAME = CREATE_DATA_OPERATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_OPERATION__CONTAINER = CREATE_DATA_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_OPERATION__INCOMING_DATA = CREATE_DATA_OPERATION__INCOMING_DATA;

	/**
	 * The feature id for the '<em><b>Outgoing Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_OPERATION__OUTGOING_DATA = CREATE_DATA_OPERATION__OUTGOING_DATA;

	/**
	 * The feature id for the '<em><b>Resulting Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_OPERATION__RESULTING_DATA = CREATE_DATA_OPERATION__RESULTING_DATA;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_OPERATION__STORE = CREATE_DATA_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DATA_OPERATION_FEATURE_COUNT = CREATE_DATA_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.LoadAllDataOperationImpl <em>Load All Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.LoadAllDataOperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getLoadAllDataOperation()
	 * @generated
	 */
	int LOAD_ALL_DATA_OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_ALL_DATA_OPERATION__ID = LOAD_DATA_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_ALL_DATA_OPERATION__ENTITY_NAME = LOAD_DATA_OPERATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_ALL_DATA_OPERATION__CONTAINER = LOAD_DATA_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_ALL_DATA_OPERATION__INCOMING_DATA = LOAD_DATA_OPERATION__INCOMING_DATA;

	/**
	 * The feature id for the '<em><b>Outgoing Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_ALL_DATA_OPERATION__OUTGOING_DATA = LOAD_DATA_OPERATION__OUTGOING_DATA;

	/**
	 * The feature id for the '<em><b>Resulting Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_ALL_DATA_OPERATION__RESULTING_DATA = LOAD_DATA_OPERATION__RESULTING_DATA;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_ALL_DATA_OPERATION__STORE = LOAD_DATA_OPERATION__STORE;

	/**
	 * The number of structural features of the '<em>Load All Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_ALL_DATA_OPERATION_FEATURE_COUNT = LOAD_DATA_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.PerformDataTransmissionOperationImpl <em>Perform Data Transmission Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.PerformDataTransmissionOperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getPerformDataTransmissionOperation()
	 * @generated
	 */
	int PERFORM_DATA_TRANSMISSION_OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_DATA_TRANSMISSION_OPERATION__ID = DATA_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_DATA_TRANSMISSION_OPERATION__ENTITY_NAME = DATA_OPERATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_DATA_TRANSMISSION_OPERATION__CONTAINER = DATA_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_DATA_TRANSMISSION_OPERATION__INCOMING_DATA = DATA_OPERATION__INCOMING_DATA;

	/**
	 * The feature id for the '<em><b>Outgoing Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_DATA_TRANSMISSION_OPERATION__OUTGOING_DATA = DATA_OPERATION__OUTGOING_DATA;

	/**
	 * The feature id for the '<em><b>Input Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_DATA_TRANSMISSION_OPERATION__INPUT_MAPPINGS = DATA_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_MAPPINGS = DATA_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_DATA = DATA_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Perform Data Transmission Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_DATA_TRANSMISSION_OPERATION_FEATURE_COUNT = DATA_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ConsumeDataOperationImpl <em>Consume Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ConsumeDataOperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getConsumeDataOperation()
	 * @generated
	 */
	int CONSUME_DATA_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_DATA_OPERATION__ID = DATA_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_DATA_OPERATION__ENTITY_NAME = DATA_OPERATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_DATA_OPERATION__CONTAINER = DATA_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_DATA_OPERATION__INCOMING_DATA = DATA_OPERATION__INCOMING_DATA;

	/**
	 * The feature id for the '<em><b>Outgoing Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_DATA_OPERATION__OUTGOING_DATA = DATA_OPERATION__OUTGOING_DATA;

	/**
	 * The feature id for the '<em><b>Consumed Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_DATA_OPERATION__CONSUMED_DATA = DATA_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Consume Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_DATA_OPERATION_FEATURE_COUNT = DATA_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.StoreDataOperationImpl <em>Store Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.StoreDataOperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getStoreDataOperation()
	 * @generated
	 */
	int STORE_DATA_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATA_OPERATION__ID = CONSUME_DATA_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATA_OPERATION__ENTITY_NAME = CONSUME_DATA_OPERATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATA_OPERATION__CONTAINER = CONSUME_DATA_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATA_OPERATION__INCOMING_DATA = CONSUME_DATA_OPERATION__INCOMING_DATA;

	/**
	 * The feature id for the '<em><b>Outgoing Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATA_OPERATION__OUTGOING_DATA = CONSUME_DATA_OPERATION__OUTGOING_DATA;

	/**
	 * The feature id for the '<em><b>Consumed Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATA_OPERATION__CONSUMED_DATA = CONSUME_DATA_OPERATION__CONSUMED_DATA;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATA_OPERATION__STORE = CONSUME_DATA_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Store Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DATA_OPERATION_FEATURE_COUNT = CONSUME_DATA_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ReturnDataOperationImpl <em>Return Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ReturnDataOperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getReturnDataOperation()
	 * @generated
	 */
	int RETURN_DATA_OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_DATA_OPERATION__ID = CONSUME_DATA_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_DATA_OPERATION__ENTITY_NAME = CONSUME_DATA_OPERATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_DATA_OPERATION__CONTAINER = CONSUME_DATA_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_DATA_OPERATION__INCOMING_DATA = CONSUME_DATA_OPERATION__INCOMING_DATA;

	/**
	 * The feature id for the '<em><b>Outgoing Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_DATA_OPERATION__OUTGOING_DATA = CONSUME_DATA_OPERATION__OUTGOING_DATA;

	/**
	 * The feature id for the '<em><b>Consumed Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_DATA_OPERATION__CONSUMED_DATA = CONSUME_DATA_OPERATION__CONSUMED_DATA;

	/**
	 * The feature id for the '<em><b>Return Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_DATA_OPERATION__RETURN_DESTINATION = CONSUME_DATA_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_DATA_OPERATION_FEATURE_COUNT = CONSUME_DATA_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.UserReadDataImpl <em>User Read Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.UserReadDataImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getUserReadData()
	 * @generated
	 */
	int USER_READ_DATA = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_READ_DATA__ID = CONSUME_DATA_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_READ_DATA__ENTITY_NAME = CONSUME_DATA_OPERATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_READ_DATA__CONTAINER = CONSUME_DATA_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_READ_DATA__INCOMING_DATA = CONSUME_DATA_OPERATION__INCOMING_DATA;

	/**
	 * The feature id for the '<em><b>Outgoing Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_READ_DATA__OUTGOING_DATA = CONSUME_DATA_OPERATION__OUTGOING_DATA;

	/**
	 * The feature id for the '<em><b>Consumed Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_READ_DATA__CONSUMED_DATA = CONSUME_DATA_OPERATION__CONSUMED_DATA;

	/**
	 * The number of structural features of the '<em>User Read Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_READ_DATA_FEATURE_COUNT = CONSUME_DATA_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ManyToOneDataOperationImpl <em>Many To One Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ManyToOneDataOperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getManyToOneDataOperation()
	 * @generated
	 */
	int MANY_TO_ONE_DATA_OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_DATA_OPERATION__ID = DATA_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_DATA_OPERATION__ENTITY_NAME = DATA_OPERATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_DATA_OPERATION__CONTAINER = DATA_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_DATA_OPERATION__INCOMING_DATA = DATA_OPERATION__INCOMING_DATA;

	/**
	 * The feature id for the '<em><b>Outgoing Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_DATA_OPERATION__OUTGOING_DATA = DATA_OPERATION__OUTGOING_DATA;

	/**
	 * The feature id for the '<em><b>Consumed Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_DATA_OPERATION__CONSUMED_DATA = DATA_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resulting Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_DATA_OPERATION__RESULTING_DATA = DATA_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Many To One Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_DATA_OPERATION_FEATURE_COUNT = DATA_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.JoinDataOperationImpl <em>Join Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.JoinDataOperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getJoinDataOperation()
	 * @generated
	 */
	int JOIN_DATA_OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_DATA_OPERATION__ID = MANY_TO_ONE_DATA_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_DATA_OPERATION__ENTITY_NAME = MANY_TO_ONE_DATA_OPERATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_DATA_OPERATION__CONTAINER = MANY_TO_ONE_DATA_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_DATA_OPERATION__INCOMING_DATA = MANY_TO_ONE_DATA_OPERATION__INCOMING_DATA;

	/**
	 * The feature id for the '<em><b>Outgoing Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_DATA_OPERATION__OUTGOING_DATA = MANY_TO_ONE_DATA_OPERATION__OUTGOING_DATA;

	/**
	 * The feature id for the '<em><b>Consumed Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_DATA_OPERATION__CONSUMED_DATA = MANY_TO_ONE_DATA_OPERATION__CONSUMED_DATA;

	/**
	 * The feature id for the '<em><b>Resulting Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_DATA_OPERATION__RESULTING_DATA = MANY_TO_ONE_DATA_OPERATION__RESULTING_DATA;

	/**
	 * The number of structural features of the '<em>Join Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_DATA_OPERATION_FEATURE_COUNT = MANY_TO_ONE_DATA_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.UnionDataOperationImpl <em>Union Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.UnionDataOperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getUnionDataOperation()
	 * @generated
	 */
	int UNION_DATA_OPERATION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DATA_OPERATION__ID = MANY_TO_ONE_DATA_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DATA_OPERATION__ENTITY_NAME = MANY_TO_ONE_DATA_OPERATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DATA_OPERATION__CONTAINER = MANY_TO_ONE_DATA_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DATA_OPERATION__INCOMING_DATA = MANY_TO_ONE_DATA_OPERATION__INCOMING_DATA;

	/**
	 * The feature id for the '<em><b>Outgoing Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DATA_OPERATION__OUTGOING_DATA = MANY_TO_ONE_DATA_OPERATION__OUTGOING_DATA;

	/**
	 * The feature id for the '<em><b>Consumed Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DATA_OPERATION__CONSUMED_DATA = MANY_TO_ONE_DATA_OPERATION__CONSUMED_DATA;

	/**
	 * The feature id for the '<em><b>Resulting Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DATA_OPERATION__RESULTING_DATA = MANY_TO_ONE_DATA_OPERATION__RESULTING_DATA;

	/**
	 * The number of structural features of the '<em>Union Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DATA_OPERATION_FEATURE_COUNT = MANY_TO_ONE_DATA_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.TransformDataOperationImpl <em>Transform Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.TransformDataOperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getTransformDataOperation()
	 * @generated
	 */
	int TRANSFORM_DATA_OPERATION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_DATA_OPERATION__ID = DATA_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_DATA_OPERATION__ENTITY_NAME = DATA_OPERATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_DATA_OPERATION__CONTAINER = DATA_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_DATA_OPERATION__INCOMING_DATA = DATA_OPERATION__INCOMING_DATA;

	/**
	 * The feature id for the '<em><b>Outgoing Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_DATA_OPERATION__OUTGOING_DATA = DATA_OPERATION__OUTGOING_DATA;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_DATA_OPERATION__INPUT = DATA_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_DATA_OPERATION__OUTPUT = DATA_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_DATA_OPERATION__PARAMETER_DATA = DATA_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transform Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_DATA_OPERATION_FEATURE_COUNT = DATA_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProjectionDataOperationImpl <em>Projection Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProjectionDataOperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getProjectionDataOperation()
	 * @generated
	 */
	int PROJECTION_DATA_OPERATION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_DATA_OPERATION__ID = TRANSFORM_DATA_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_DATA_OPERATION__ENTITY_NAME = TRANSFORM_DATA_OPERATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_DATA_OPERATION__CONTAINER = TRANSFORM_DATA_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_DATA_OPERATION__INCOMING_DATA = TRANSFORM_DATA_OPERATION__INCOMING_DATA;

	/**
	 * The feature id for the '<em><b>Outgoing Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_DATA_OPERATION__OUTGOING_DATA = TRANSFORM_DATA_OPERATION__OUTGOING_DATA;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_DATA_OPERATION__INPUT = TRANSFORM_DATA_OPERATION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_DATA_OPERATION__OUTPUT = TRANSFORM_DATA_OPERATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Parameter Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_DATA_OPERATION__PARAMETER_DATA = TRANSFORM_DATA_OPERATION__PARAMETER_DATA;

	/**
	 * The number of structural features of the '<em>Projection Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_DATA_OPERATION_FEATURE_COUNT = TRANSFORM_DATA_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.SelectionDataOperationImpl <em>Selection Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.SelectionDataOperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getSelectionDataOperation()
	 * @generated
	 */
	int SELECTION_DATA_OPERATION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DATA_OPERATION__ID = TRANSFORM_DATA_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DATA_OPERATION__ENTITY_NAME = TRANSFORM_DATA_OPERATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DATA_OPERATION__CONTAINER = TRANSFORM_DATA_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DATA_OPERATION__INCOMING_DATA = TRANSFORM_DATA_OPERATION__INCOMING_DATA;

	/**
	 * The feature id for the '<em><b>Outgoing Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DATA_OPERATION__OUTGOING_DATA = TRANSFORM_DATA_OPERATION__OUTGOING_DATA;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DATA_OPERATION__INPUT = TRANSFORM_DATA_OPERATION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DATA_OPERATION__OUTPUT = TRANSFORM_DATA_OPERATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Parameter Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DATA_OPERATION__PARAMETER_DATA = TRANSFORM_DATA_OPERATION__PARAMETER_DATA;

	/**
	 * The number of structural features of the '<em>Selection Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DATA_OPERATION_FEATURE_COUNT = TRANSFORM_DATA_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.CharacteristicChangingDataOperationImpl <em>Characteristic Changing Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.CharacteristicChangingDataOperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getCharacteristicChangingDataOperation()
	 * @generated
	 */
	int CHARACTERISTIC_CHANGING_DATA_OPERATION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CHANGING_DATA_OPERATION__ID = DATA_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CHANGING_DATA_OPERATION__ENTITY_NAME = DATA_OPERATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CHANGING_DATA_OPERATION__CONTAINER = DATA_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Incoming Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CHANGING_DATA_OPERATION__INCOMING_DATA = DATA_OPERATION__INCOMING_DATA;

	/**
	 * The feature id for the '<em><b>Outgoing Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CHANGING_DATA_OPERATION__OUTGOING_DATA = DATA_OPERATION__OUTGOING_DATA;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CHANGING_DATA_OPERATION__DATA = DATA_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CHANGING_DATA_OPERATION__OPERATION = DATA_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CHANGING_DATA_OPERATION__CHARACTERISTIC = DATA_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Characteristic Changing Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CHANGING_DATA_OPERATION_FEATURE_COUNT = DATA_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangeOperation <em>Characteristic Change Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangeOperation
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getCharacteristicChangeOperation()
	 * @generated
	 */
	int CHARACTERISTIC_CHANGE_OPERATION = 17;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataProcessingContainer <em>Data Processing Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Processing Container</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataProcessingContainer
	 * @generated
	 */
	EClass getDataProcessingContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataProcessingContainer#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataProcessingContainer#getOperations()
	 * @see #getDataProcessingContainer()
	 * @generated
	 */
	EReference getDataProcessingContainer_Operations();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation <em>Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation
	 * @generated
	 */
	EClass getDataOperation();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation#getContainer()
	 * @see #getDataOperation()
	 * @generated
	 */
	EReference getDataOperation_Container();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation#getIncomingData <em>Incoming Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation#getIncomingData()
	 * @see #getDataOperation()
	 * @generated
	 */
	EReference getDataOperation_IncomingData();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation#getOutgoingData <em>Outgoing Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation#getOutgoingData()
	 * @see #getDataOperation()
	 * @generated
	 */
	EReference getDataOperation_OutgoingData();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CreateDataOperation <em>Create Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Data Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CreateDataOperation
	 * @generated
	 */
	EClass getCreateDataOperation();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CreateDataOperation#getResultingData <em>Resulting Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resulting Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CreateDataOperation#getResultingData()
	 * @see #getCreateDataOperation()
	 * @generated
	 */
	EReference getCreateDataOperation_ResultingData();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.LoadDataOperation <em>Load Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Data Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.LoadDataOperation
	 * @generated
	 */
	EClass getLoadDataOperation();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.LoadDataOperation#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Store</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.LoadDataOperation#getStore()
	 * @see #getLoadDataOperation()
	 * @generated
	 */
	EReference getLoadDataOperation_Store();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.LoadAllDataOperation <em>Load All Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load All Data Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.LoadAllDataOperation
	 * @generated
	 */
	EClass getLoadAllDataOperation();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation <em>Perform Data Transmission Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform Data Transmission Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation
	 * @generated
	 */
	EClass getPerformDataTransmissionOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation#getInputMappings <em>Input Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Mappings</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation#getInputMappings()
	 * @see #getPerformDataTransmissionOperation()
	 * @generated
	 */
	EReference getPerformDataTransmissionOperation_InputMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation#getOutputMappings <em>Output Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Mappings</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation#getOutputMappings()
	 * @see #getPerformDataTransmissionOperation()
	 * @generated
	 */
	EReference getPerformDataTransmissionOperation_OutputMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation#getOutputData <em>Output Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation#getOutputData()
	 * @see #getPerformDataTransmissionOperation()
	 * @generated
	 */
	EReference getPerformDataTransmissionOperation_OutputData();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ConsumeDataOperation <em>Consume Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consume Data Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ConsumeDataOperation
	 * @generated
	 */
	EClass getConsumeDataOperation();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ConsumeDataOperation#getConsumedData <em>Consumed Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consumed Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ConsumeDataOperation#getConsumedData()
	 * @see #getConsumeDataOperation()
	 * @generated
	 */
	EReference getConsumeDataOperation_ConsumedData();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.StoreDataOperation <em>Store Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Data Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.StoreDataOperation
	 * @generated
	 */
	EClass getStoreDataOperation();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.StoreDataOperation#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Store</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.StoreDataOperation#getStore()
	 * @see #getStoreDataOperation()
	 * @generated
	 */
	EReference getStoreDataOperation_Store();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ReturnDataOperation <em>Return Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Data Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ReturnDataOperation
	 * @generated
	 */
	EClass getReturnDataOperation();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ReturnDataOperation#getReturnDestination <em>Return Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Destination</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ReturnDataOperation#getReturnDestination()
	 * @see #getReturnDataOperation()
	 * @generated
	 */
	EReference getReturnDataOperation_ReturnDestination();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.UserReadData <em>User Read Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Read Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.UserReadData
	 * @generated
	 */
	EClass getUserReadData();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ManyToOneDataOperation <em>Many To One Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To One Data Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ManyToOneDataOperation
	 * @generated
	 */
	EClass getManyToOneDataOperation();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ManyToOneDataOperation#getConsumedData <em>Consumed Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumed Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ManyToOneDataOperation#getConsumedData()
	 * @see #getManyToOneDataOperation()
	 * @generated
	 */
	EReference getManyToOneDataOperation_ConsumedData();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ManyToOneDataOperation#getResultingData <em>Resulting Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resulting Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ManyToOneDataOperation#getResultingData()
	 * @see #getManyToOneDataOperation()
	 * @generated
	 */
	EReference getManyToOneDataOperation_ResultingData();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.JoinDataOperation <em>Join Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Data Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.JoinDataOperation
	 * @generated
	 */
	EClass getJoinDataOperation();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.UnionDataOperation <em>Union Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Data Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.UnionDataOperation
	 * @generated
	 */
	EClass getUnionDataOperation();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation <em>Transform Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Data Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation
	 * @generated
	 */
	EClass getTransformDataOperation();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation#getInput()
	 * @see #getTransformDataOperation()
	 * @generated
	 */
	EReference getTransformDataOperation_Input();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation#getOutput()
	 * @see #getTransformDataOperation()
	 * @generated
	 */
	EReference getTransformDataOperation_Output();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation#getParameterData <em>Parameter Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation#getParameterData()
	 * @see #getTransformDataOperation()
	 * @generated
	 */
	EReference getTransformDataOperation_ParameterData();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProjectionDataOperation <em>Projection Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projection Data Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProjectionDataOperation
	 * @generated
	 */
	EClass getProjectionDataOperation();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.SelectionDataOperation <em>Selection Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Data Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.SelectionDataOperation
	 * @generated
	 */
	EClass getSelectionDataOperation();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangingDataOperation <em>Characteristic Changing Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic Changing Data Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangingDataOperation
	 * @generated
	 */
	EClass getCharacteristicChangingDataOperation();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangingDataOperation#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangingDataOperation#getData()
	 * @see #getCharacteristicChangingDataOperation()
	 * @generated
	 */
	EReference getCharacteristicChangingDataOperation_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangingDataOperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangingDataOperation#getOperation()
	 * @see #getCharacteristicChangingDataOperation()
	 * @generated
	 */
	EAttribute getCharacteristicChangingDataOperation_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangingDataOperation#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Characteristic</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangingDataOperation#getCharacteristic()
	 * @see #getCharacteristicChangingDataOperation()
	 * @generated
	 */
	EReference getCharacteristicChangingDataOperation_Characteristic();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangeOperation <em>Characteristic Change Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Characteristic Change Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangeOperation
	 * @generated
	 */
	EEnum getCharacteristicChangeOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcessingFactory getProcessingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataProcessingContainerImpl <em>Data Processing Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataProcessingContainerImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getDataProcessingContainer()
		 * @generated
		 */
		EClass DATA_PROCESSING_CONTAINER = eINSTANCE.getDataProcessingContainer();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROCESSING_CONTAINER__OPERATIONS = eINSTANCE.getDataProcessingContainer_Operations();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataOperationImpl <em>Data Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataOperationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getDataOperation()
		 * @generated
		 */
		EClass DATA_OPERATION = eINSTANCE.getDataOperation();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OPERATION__CONTAINER = eINSTANCE.getDataOperation_Container();

		/**
		 * The meta object literal for the '<em><b>Incoming Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OPERATION__INCOMING_DATA = eINSTANCE.getDataOperation_IncomingData();

		/**
		 * The meta object literal for the '<em><b>Outgoing Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OPERATION__OUTGOING_DATA = eINSTANCE.getDataOperation_OutgoingData();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.CreateDataOperationImpl <em>Create Data Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.CreateDataOperationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getCreateDataOperation()
		 * @generated
		 */
		EClass CREATE_DATA_OPERATION = eINSTANCE.getCreateDataOperation();

		/**
		 * The meta object literal for the '<em><b>Resulting Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_DATA_OPERATION__RESULTING_DATA = eINSTANCE.getCreateDataOperation_ResultingData();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.LoadDataOperationImpl <em>Load Data Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.LoadDataOperationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getLoadDataOperation()
		 * @generated
		 */
		EClass LOAD_DATA_OPERATION = eINSTANCE.getLoadDataOperation();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_DATA_OPERATION__STORE = eINSTANCE.getLoadDataOperation_Store();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.LoadAllDataOperationImpl <em>Load All Data Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.LoadAllDataOperationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getLoadAllDataOperation()
		 * @generated
		 */
		EClass LOAD_ALL_DATA_OPERATION = eINSTANCE.getLoadAllDataOperation();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.PerformDataTransmissionOperationImpl <em>Perform Data Transmission Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.PerformDataTransmissionOperationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getPerformDataTransmissionOperation()
		 * @generated
		 */
		EClass PERFORM_DATA_TRANSMISSION_OPERATION = eINSTANCE.getPerformDataTransmissionOperation();

		/**
		 * The meta object literal for the '<em><b>Input Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM_DATA_TRANSMISSION_OPERATION__INPUT_MAPPINGS = eINSTANCE.getPerformDataTransmissionOperation_InputMappings();

		/**
		 * The meta object literal for the '<em><b>Output Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_MAPPINGS = eINSTANCE.getPerformDataTransmissionOperation_OutputMappings();

		/**
		 * The meta object literal for the '<em><b>Output Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_DATA = eINSTANCE.getPerformDataTransmissionOperation_OutputData();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ConsumeDataOperationImpl <em>Consume Data Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ConsumeDataOperationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getConsumeDataOperation()
		 * @generated
		 */
		EClass CONSUME_DATA_OPERATION = eINSTANCE.getConsumeDataOperation();

		/**
		 * The meta object literal for the '<em><b>Consumed Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUME_DATA_OPERATION__CONSUMED_DATA = eINSTANCE.getConsumeDataOperation_ConsumedData();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.StoreDataOperationImpl <em>Store Data Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.StoreDataOperationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getStoreDataOperation()
		 * @generated
		 */
		EClass STORE_DATA_OPERATION = eINSTANCE.getStoreDataOperation();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_DATA_OPERATION__STORE = eINSTANCE.getStoreDataOperation_Store();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ReturnDataOperationImpl <em>Return Data Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ReturnDataOperationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getReturnDataOperation()
		 * @generated
		 */
		EClass RETURN_DATA_OPERATION = eINSTANCE.getReturnDataOperation();

		/**
		 * The meta object literal for the '<em><b>Return Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_DATA_OPERATION__RETURN_DESTINATION = eINSTANCE.getReturnDataOperation_ReturnDestination();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.UserReadDataImpl <em>User Read Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.UserReadDataImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getUserReadData()
		 * @generated
		 */
		EClass USER_READ_DATA = eINSTANCE.getUserReadData();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ManyToOneDataOperationImpl <em>Many To One Data Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ManyToOneDataOperationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getManyToOneDataOperation()
		 * @generated
		 */
		EClass MANY_TO_ONE_DATA_OPERATION = eINSTANCE.getManyToOneDataOperation();

		/**
		 * The meta object literal for the '<em><b>Consumed Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANY_TO_ONE_DATA_OPERATION__CONSUMED_DATA = eINSTANCE.getManyToOneDataOperation_ConsumedData();

		/**
		 * The meta object literal for the '<em><b>Resulting Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANY_TO_ONE_DATA_OPERATION__RESULTING_DATA = eINSTANCE.getManyToOneDataOperation_ResultingData();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.JoinDataOperationImpl <em>Join Data Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.JoinDataOperationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getJoinDataOperation()
		 * @generated
		 */
		EClass JOIN_DATA_OPERATION = eINSTANCE.getJoinDataOperation();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.UnionDataOperationImpl <em>Union Data Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.UnionDataOperationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getUnionDataOperation()
		 * @generated
		 */
		EClass UNION_DATA_OPERATION = eINSTANCE.getUnionDataOperation();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.TransformDataOperationImpl <em>Transform Data Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.TransformDataOperationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getTransformDataOperation()
		 * @generated
		 */
		EClass TRANSFORM_DATA_OPERATION = eINSTANCE.getTransformDataOperation();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM_DATA_OPERATION__INPUT = eINSTANCE.getTransformDataOperation_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM_DATA_OPERATION__OUTPUT = eINSTANCE.getTransformDataOperation_Output();

		/**
		 * The meta object literal for the '<em><b>Parameter Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM_DATA_OPERATION__PARAMETER_DATA = eINSTANCE.getTransformDataOperation_ParameterData();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProjectionDataOperationImpl <em>Projection Data Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProjectionDataOperationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getProjectionDataOperation()
		 * @generated
		 */
		EClass PROJECTION_DATA_OPERATION = eINSTANCE.getProjectionDataOperation();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.SelectionDataOperationImpl <em>Selection Data Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.SelectionDataOperationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getSelectionDataOperation()
		 * @generated
		 */
		EClass SELECTION_DATA_OPERATION = eINSTANCE.getSelectionDataOperation();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.CharacteristicChangingDataOperationImpl <em>Characteristic Changing Data Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.CharacteristicChangingDataOperationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getCharacteristicChangingDataOperation()
		 * @generated
		 */
		EClass CHARACTERISTIC_CHANGING_DATA_OPERATION = eINSTANCE.getCharacteristicChangingDataOperation();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC_CHANGING_DATA_OPERATION__DATA = eINSTANCE.getCharacteristicChangingDataOperation_Data();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC_CHANGING_DATA_OPERATION__OPERATION = eINSTANCE.getCharacteristicChangingDataOperation_Operation();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC_CHANGING_DATA_OPERATION__CHARACTERISTIC = eINSTANCE.getCharacteristicChangingDataOperation_Characteristic();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangeOperation <em>Characteristic Change Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangeOperation
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getCharacteristicChangeOperation()
		 * @generated
		 */
		EEnum CHARACTERISTIC_CHANGE_OPERATION = eINSTANCE.getCharacteristicChangeOperation();

	}

} //ProcessingPackage
