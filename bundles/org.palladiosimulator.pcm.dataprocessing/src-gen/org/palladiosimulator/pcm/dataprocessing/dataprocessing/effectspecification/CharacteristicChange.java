/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangeOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange#getChangeOperation <em>Change Operation</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange#getCharacteristicSpecifications <em>Characteristic Specifications</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange#getProcessingEffect <em>Processing Effect</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getCharacteristicChange()
 * @model
 * @generated
 */
public interface CharacteristicChange extends Entity
{
	/**
	 * Returns the value of the '<em><b>Change Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangeOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Operation</em>' attribute.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangeOperation
	 * @see #setChangeOperation(CharacteristicChangeOperation)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getCharacteristicChange_ChangeOperation()
	 * @model required="true"
	 * @generated
	 */
	CharacteristicChangeOperation getChangeOperation();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange#getChangeOperation <em>Change Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Operation</em>' attribute.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangeOperation
	 * @see #getChangeOperation()
	 * @generated
	 */
	void setChangeOperation(CharacteristicChangeOperation value);

	/**
	 * Returns the value of the '<em><b>Characteristic Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicSpecification}.
	 * It is bidirectional and its opposite is '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicSpecification#getCharacteristicChange <em>Characteristic Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic Specifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic Specifications</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getCharacteristicChange_CharacteristicSpecifications()
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicSpecification#getCharacteristicChange
	 * @model opposite="characteristicChange" containment="true"
	 * @generated
	 */
	EList<CharacteristicSpecification> getCharacteristicSpecifications();

	/**
	 * Returns the value of the '<em><b>Processing Effect</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect#getCharacteristicChanges <em>Characteristic Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Effect</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Effect</em>' container reference.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getCharacteristicChange_ProcessingEffect()
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect#getCharacteristicChanges
	 * @model opposite="characteristicChanges" changeable="false" volatile="true"
	 * @generated
	 */
	ProcessingEffect getProcessingEffect();

} // CharacteristicChange
