/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicTypeContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.RelatedCharacteristics;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.StoreCharacteristicContainer;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataProcessingContainer;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.OperationSignatureDataRefinement;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.StoreContainer;

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
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getStoreContainers <em>Store Containers</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getCharacteristicContainer <em>Characteristic Container</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getRelatedCharacteristics <em>Related Characteristics</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getOperationSignatureDataRefinement <em>Operation Signature Data Refinement</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getStoreCharacteristicContainers <em>Store Characteristic Containers</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage#getDataSpecification()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface DataSpecification extends CDOObject
{
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

	/**
	 * Returns the value of the '<em><b>Related Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.RelatedCharacteristics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Characteristics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Characteristics</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage#getDataSpecification_RelatedCharacteristics()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelatedCharacteristics> getRelatedCharacteristics();

	/**
	 * Returns the value of the '<em><b>Operation Signature Data Refinement</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.OperationSignatureDataRefinement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Signature Data Refinement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Signature Data Refinement</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage#getDataSpecification_OperationSignatureDataRefinement()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationSignatureDataRefinement> getOperationSignatureDataRefinement();

	/**
	 * Returns the value of the '<em><b>Store Characteristic Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.StoreCharacteristicContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Characteristic Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Characteristic Containers</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage#getDataSpecification_StoreCharacteristicContainers()
	 * @model containment="true"
	 * @generated
	 */
	EList<StoreCharacteristicContainer> getStoreCharacteristicContainers();

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecificationExtension}.
	 * It is bidirectional and its opposite is '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecificationExtension#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage#getDataSpecification_Extensions()
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecificationExtension#getSpecification
	 * @model opposite="specification" containment="true"
	 * @generated
	 */
	EList<DataSpecificationExtension> getExtensions();

} // DataSpecification
