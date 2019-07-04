/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicSpecification#getCharacteristicChange <em>Characteristic Change</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getCharacteristicSpecification()
 * @model abstract="true"
 * @generated
 */
public interface CharacteristicSpecification extends Entity
{
	/**
	 * Returns the value of the '<em><b>Characteristic Change</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange#getCharacteristicSpecifications <em>Characteristic Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic Change</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic Change</em>' container reference.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getCharacteristicSpecification_CharacteristicChange()
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange#getCharacteristicSpecifications
	 * @model opposite="characteristicSpecifications" changeable="false" volatile="true"
	 * @generated
	 */
	CharacteristicChange getCharacteristicChange();

} // CharacteristicSpecification
