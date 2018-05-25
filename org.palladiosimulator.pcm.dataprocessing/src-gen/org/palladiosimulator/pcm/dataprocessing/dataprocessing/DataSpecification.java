/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicTypeContainer;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataProcessingContainer;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.StoreContainer;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.DataSEFFSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getDataProcessingContainers <em>Data Processing Containers</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getCharacteristicTypeContainers <em>Characteristic Type Containers</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getDataSEFFSpecifications <em>Data SEFF Specifications</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getStoreContainers <em>Store Containers</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getCharacteristicContainer <em>Characteristic Container</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage#getDataSpecification()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface DataSpecification extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Data Processing Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataProcessingContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Processing Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Processing Containers</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage#getDataSpecification_DataProcessingContainers()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataProcessingContainer> getDataProcessingContainers();

	/**
	 * Returns the value of the '<em><b>Characteristic Type Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicTypeContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic Type Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic Type Containers</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage#getDataSpecification_CharacteristicTypeContainers()
	 * @model containment="true"
	 * @generated
	 */
	EList<CharacteristicTypeContainer> getCharacteristicTypeContainers();

	/**
	 * Returns the value of the '<em><b>Data SEFF Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.DataSEFFSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data SEFF Specifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data SEFF Specifications</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage#getDataSpecification_DataSEFFSpecifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSEFFSpecification> getDataSEFFSpecifications();

	/**
	 * Returns the value of the '<em><b>Store Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.StoreContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Containers</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage#getDataSpecification_StoreContainers()
	 * @model containment="true"
	 * @generated
	 */
	EList<StoreContainer> getStoreContainers();

	/**
	 * Returns the value of the '<em><b>Characteristic Container</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic Container</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage#getDataSpecification_CharacteristicContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<CharacteristicContainer> getCharacteristicContainer();

} // DataSpecification
