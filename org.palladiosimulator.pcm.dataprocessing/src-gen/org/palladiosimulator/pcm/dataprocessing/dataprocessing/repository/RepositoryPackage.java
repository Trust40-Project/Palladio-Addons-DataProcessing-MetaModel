/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository;

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
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.RepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface RepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "repository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palladiosimulator.org/pcm/dataprocessing/repository/0.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "repository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepositoryPackage eINSTANCE = org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.RepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.StoreContainerImpl <em>Store Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.StoreContainerImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.RepositoryPackageImpl#getStoreContainer()
	 * @generated
	 */
	int STORE_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_CONTAINER__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Stores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_CONTAINER__STORES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Store Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_CONTAINER_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.StoreImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.RepositoryPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__CONTAINER = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__DATA_TYPE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.StoreContainer <em>Store Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Container</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.StoreContainer
	 * @generated
	 */
	EClass getStoreContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.StoreContainer#getStores <em>Stores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stores</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.StoreContainer#getStores()
	 * @see #getStoreContainer()
	 * @generated
	 */
	EReference getStoreContainer_Stores();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.Store#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.Store#getContainer()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Container();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.Store#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.Store#getDataType()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_DataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepositoryFactory getRepositoryFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.StoreContainerImpl <em>Store Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.StoreContainerImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.RepositoryPackageImpl#getStoreContainer()
		 * @generated
		 */
		EClass STORE_CONTAINER = eINSTANCE.getStoreContainer();

		/**
		 * The meta object literal for the '<em><b>Stores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_CONTAINER__STORES = eINSTANCE.getStoreContainer_Stores();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.StoreImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.RepositoryPackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__CONTAINER = eINSTANCE.getStore_Container();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__DATA_TYPE = eINSTANCE.getStore_DataType();

	}

} //RepositoryPackage
