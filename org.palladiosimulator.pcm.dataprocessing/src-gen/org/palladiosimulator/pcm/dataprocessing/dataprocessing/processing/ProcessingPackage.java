/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EClass;
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
public interface ProcessingPackage extends EPackage {
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
	int DATA_PROCESSING_CONTAINER__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_CONTAINER__OPERATIONS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Processing Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_CONTAINER_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

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
	 * The number of structural features of the '<em>Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Received Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_DATA_TRANSMISSION_OPERATION__RECEIVED_DATA = DATA_OPERATION_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataMappingImpl <em>Data Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataMappingImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getDataMapping()
	 * @generated
	 */
	int DATA_MAPPING = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING__DATA = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataParameterMappingImpl <em>Data Parameter Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataParameterMappingImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getDataParameterMapping()
	 * @generated
	 */
	int DATA_PARAMETER_MAPPING = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER_MAPPING__ID = DATA_MAPPING__ID;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER_MAPPING__DATA = DATA_MAPPING__DATA;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER_MAPPING__PARAMETER = DATA_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Parameter Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARAMETER_MAPPING_FEATURE_COUNT = DATA_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataResultMappingImpl <em>Data Result Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataResultMappingImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getDataResultMapping()
	 * @generated
	 */
	int DATA_RESULT_MAPPING = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESULT_MAPPING__ID = DATA_MAPPING__ID;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESULT_MAPPING__DATA = DATA_MAPPING__DATA;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESULT_MAPPING__OPERATION = DATA_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Result Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESULT_MAPPING_FEATURE_COUNT = DATA_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ManyToOneDataOperationImpl <em>Many To One Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ManyToOneDataOperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getManyToOneDataOperation()
	 * @generated
	 */
	int MANY_TO_ONE_DATA_OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Consumed Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_DATA_OPERATION__CONSUMED_DATA = 0;

	/**
	 * The feature id for the '<em><b>Resulting Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_DATA_OPERATION__RESULTING_DATA = 1;

	/**
	 * The number of structural features of the '<em>Many To One Data Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_DATA_OPERATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.JoinDataOperationImpl <em>Join Data Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.JoinDataOperationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getJoinDataOperation()
	 * @generated
	 */
	int JOIN_DATA_OPERATION = 12;

	/**
	 * The feature id for the '<em><b>Consumed Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_DATA_OPERATION__CONSUMED_DATA = MANY_TO_ONE_DATA_OPERATION__CONSUMED_DATA;

	/**
	 * The feature id for the '<em><b>Resulting Data</b></em>' reference.
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
	int UNION_DATA_OPERATION = 13;

	/**
	 * The feature id for the '<em><b>Consumed Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_DATA_OPERATION__CONSUMED_DATA = MANY_TO_ONE_DATA_OPERATION__CONSUMED_DATA;

	/**
	 * The feature id for the '<em><b>Resulting Data</b></em>' reference.
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
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation#getReceivedData <em>Received Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Received Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation#getReceivedData()
	 * @see #getPerformDataTransmissionOperation()
	 * @generated
	 */
	EReference getPerformDataTransmissionOperation_ReceivedData();

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
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataMapping <em>Data Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Mapping</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataMapping
	 * @generated
	 */
	EClass getDataMapping();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataMapping#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataMapping#getData()
	 * @see #getDataMapping()
	 * @generated
	 */
	EReference getDataMapping_Data();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataParameterMapping <em>Data Parameter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Parameter Mapping</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataParameterMapping
	 * @generated
	 */
	EClass getDataParameterMapping();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataParameterMapping#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataParameterMapping#getParameter()
	 * @see #getDataParameterMapping()
	 * @generated
	 */
	EReference getDataParameterMapping_Parameter();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataResultMapping <em>Data Result Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Result Mapping</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataResultMapping
	 * @generated
	 */
	EClass getDataResultMapping();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataResultMapping#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataResultMapping#getOperation()
	 * @see #getDataResultMapping()
	 * @generated
	 */
	EReference getDataResultMapping_Operation();

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
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ManyToOneDataOperation#getResultingData <em>Resulting Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resulting Data</em>'.
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
	interface Literals {
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
		 * The meta object literal for the '<em><b>Received Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM_DATA_TRANSMISSION_OPERATION__RECEIVED_DATA = eINSTANCE.getPerformDataTransmissionOperation_ReceivedData();

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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataMappingImpl <em>Data Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataMappingImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getDataMapping()
		 * @generated
		 */
		EClass DATA_MAPPING = eINSTANCE.getDataMapping();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MAPPING__DATA = eINSTANCE.getDataMapping_Data();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataParameterMappingImpl <em>Data Parameter Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataParameterMappingImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getDataParameterMapping()
		 * @generated
		 */
		EClass DATA_PARAMETER_MAPPING = eINSTANCE.getDataParameterMapping();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PARAMETER_MAPPING__PARAMETER = eINSTANCE.getDataParameterMapping_Parameter();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataResultMappingImpl <em>Data Result Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataResultMappingImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl#getDataResultMapping()
		 * @generated
		 */
		EClass DATA_RESULT_MAPPING = eINSTANCE.getDataResultMapping();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESULT_MAPPING__OPERATION = eINSTANCE.getDataResultMapping_Operation();

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
		 * The meta object literal for the '<em><b>Resulting Data</b></em>' reference feature.
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

	}

} //ProcessingPackage
