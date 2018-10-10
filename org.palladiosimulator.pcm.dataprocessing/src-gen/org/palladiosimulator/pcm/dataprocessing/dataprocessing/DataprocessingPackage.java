/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import entity='http://palladiosimulator.org/PalladioComponentModel/Core/Entity/5.2' identifier='http://sdq.ipd.uka.de/Identifier/2.1' repository_1='http://palladiosimulator.org/PalladioComponentModel/Repository/5.2' seff_1='http://palladiosimulator.org/PalladioComponentModel/SEFF/5.2'"
 * @generated
 */
public interface DataprocessingPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataprocessing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palladiosimulator.org/pcm/dataprocessing/0.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dataprocessing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataprocessingPackage eINSTANCE = org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataprocessingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl <em>Data Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataprocessingPackageImpl#getDataSpecification()
	 * @generated
	 */
	int DATA_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Data Processing Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION__DATA_PROCESSING_CONTAINERS = 0;

	/**
	 * The feature id for the '<em><b>Characteristic Type Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION__CHARACTERISTIC_TYPE_CONTAINERS = 1;

	/**
	 * The feature id for the '<em><b>Store Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION__STORE_CONTAINERS = 2;

	/**
	 * The feature id for the '<em><b>Characteristic Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION__CHARACTERISTIC_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Related Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION__RELATED_CHARACTERISTICS = 4;

	/**
	 * The feature id for the '<em><b>Operation Signature Data Refinement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION__OPERATION_SIGNATURE_DATA_REFINEMENT = 5;

	/**
	 * The feature id for the '<em><b>Store Characteristic Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION__STORE_CHARACTERISTIC_CONTAINERS = 6;

	/**
	 * The number of structural features of the '<em>Data Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPECIFICATION_FEATURE_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification <em>Data Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Specification</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification
	 * @generated
	 */
	EClass getDataSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getDataProcessingContainers <em>Data Processing Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Processing Containers</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getDataProcessingContainers()
	 * @see #getDataSpecification()
	 * @generated
	 */
	EReference getDataSpecification_DataProcessingContainers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getCharacteristicTypeContainers <em>Characteristic Type Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characteristic Type Containers</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getCharacteristicTypeContainers()
	 * @see #getDataSpecification()
	 * @generated
	 */
	EReference getDataSpecification_CharacteristicTypeContainers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getStoreContainers <em>Store Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Store Containers</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getStoreContainers()
	 * @see #getDataSpecification()
	 * @generated
	 */
	EReference getDataSpecification_StoreContainers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getCharacteristicContainer <em>Characteristic Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characteristic Container</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getCharacteristicContainer()
	 * @see #getDataSpecification()
	 * @generated
	 */
	EReference getDataSpecification_CharacteristicContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getRelatedCharacteristics <em>Related Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Characteristics</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getRelatedCharacteristics()
	 * @see #getDataSpecification()
	 * @generated
	 */
	EReference getDataSpecification_RelatedCharacteristics();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getOperationSignatureDataRefinement <em>Operation Signature Data Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Signature Data Refinement</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getOperationSignatureDataRefinement()
	 * @see #getDataSpecification()
	 * @generated
	 */
	EReference getDataSpecification_OperationSignatureDataRefinement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getStoreCharacteristicContainers <em>Store Characteristic Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Store Characteristic Containers</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getStoreCharacteristicContainers()
	 * @see #getDataSpecification()
	 * @generated
	 */
	EReference getDataSpecification_StoreCharacteristicContainers();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataprocessingFactory getDataprocessingFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl <em>Data Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataprocessingPackageImpl#getDataSpecification()
		 * @generated
		 */
		EClass DATA_SPECIFICATION = eINSTANCE.getDataSpecification();

		/**
		 * The meta object literal for the '<em><b>Data Processing Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPECIFICATION__DATA_PROCESSING_CONTAINERS = eINSTANCE.getDataSpecification_DataProcessingContainers();

		/**
		 * The meta object literal for the '<em><b>Characteristic Type Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPECIFICATION__CHARACTERISTIC_TYPE_CONTAINERS = eINSTANCE.getDataSpecification_CharacteristicTypeContainers();

		/**
		 * The meta object literal for the '<em><b>Store Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPECIFICATION__STORE_CONTAINERS = eINSTANCE.getDataSpecification_StoreContainers();

		/**
		 * The meta object literal for the '<em><b>Characteristic Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPECIFICATION__CHARACTERISTIC_CONTAINER = eINSTANCE.getDataSpecification_CharacteristicContainer();

		/**
		 * The meta object literal for the '<em><b>Related Characteristics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPECIFICATION__RELATED_CHARACTERISTICS = eINSTANCE.getDataSpecification_RelatedCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Operation Signature Data Refinement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPECIFICATION__OPERATION_SIGNATURE_DATA_REFINEMENT = eINSTANCE.getDataSpecification_OperationSignatureDataRefinement();

		/**
		 * The meta object literal for the '<em><b>Store Characteristic Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SPECIFICATION__STORE_CHARACTERISTIC_CONTAINERS = eINSTANCE.getDataSpecification_StoreCharacteristicContainers();

	}

} //DataprocessingPackage
