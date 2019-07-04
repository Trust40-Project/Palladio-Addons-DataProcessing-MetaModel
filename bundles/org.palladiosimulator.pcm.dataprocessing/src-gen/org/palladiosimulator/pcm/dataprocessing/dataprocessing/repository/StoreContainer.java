/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.StoreContainer#getStores <em>Stores</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.RepositoryPackage#getStoreContainer()
 * @model
 * @generated
 */
public interface StoreContainer extends Entity
{
	/**
	 * Returns the value of the '<em><b>Stores</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.Store}.
	 * It is bidirectional and its opposite is '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.Store#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stores</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.RepositoryPackage#getStoreContainer_Stores()
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.Store#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Store> getStores();

} // StoreContainer
