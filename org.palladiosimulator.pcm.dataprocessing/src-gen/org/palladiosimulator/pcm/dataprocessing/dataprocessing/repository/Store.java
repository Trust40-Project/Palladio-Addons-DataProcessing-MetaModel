/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.Store#getContainer <em>Container</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.Store#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.RepositoryPackage#getStore()
 * @model
 * @generated
 */
public interface Store extends Entity
{
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.StoreContainer#getStores <em>Stores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(StoreContainer)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.RepositoryPackage#getStore_Container()
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.StoreContainer#getStores
	 * @model opposite="stores" transient="false"
	 * @generated
	 */
	StoreContainer getContainer();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.Store#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(StoreContainer value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.RepositoryPackage#getStore_DataType()
	 * @model required="true"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.Store#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

} // Store
