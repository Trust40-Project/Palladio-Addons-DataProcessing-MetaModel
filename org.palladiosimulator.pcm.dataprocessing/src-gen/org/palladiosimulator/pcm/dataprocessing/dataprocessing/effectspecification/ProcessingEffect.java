/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation;

import org.palladiosimulator.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect#getFromDataType <em>From Data Type</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect#getToDataType <em>To Data Type</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect#getCharacteristicChanges <em>Characteristic Changes</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getProcessingEffect()
 * @model abstract="true"
 * @generated
 */
public interface ProcessingEffect extends Entity
{
	/**
	 * Returns the value of the '<em><b>From Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Data Type</em>' reference.
	 * @see #setFromDataType(DataType)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getProcessingEffect_FromDataType()
	 * @model
	 * @generated
	 */
	DataType getFromDataType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect#getFromDataType <em>From Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Data Type</em>' reference.
	 * @see #getFromDataType()
	 * @generated
	 */
	void setFromDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>To Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Data Type</em>' reference.
	 * @see #setToDataType(DataType)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getProcessingEffect_ToDataType()
	 * @model
	 * @generated
	 */
	DataType getToDataType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect#getToDataType <em>To Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Data Type</em>' reference.
	 * @see #getToDataType()
	 * @generated
	 */
	void setToDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Characteristic Changes</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange}.
	 * It is bidirectional and its opposite is '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange#getProcessingEffect <em>Processing Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic Changes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic Changes</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getProcessingEffect_CharacteristicChanges()
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange#getProcessingEffect
	 * @model opposite="processingEffect" containment="true"
	 * @generated
	 */
	EList<CharacteristicChange> getCharacteristicChanges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" operationRequired="true" resultDataRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='false'"
	 * @generated
	 */
	boolean isApplicableTo(DataOperation operation, Data resultData);

} // ProcessingEffect
