/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Characteristic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.DirectCharacteristic#getCharacteristic <em>Characteristic</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getDirectCharacteristic()
 * @model
 * @generated
 */
public interface DirectCharacteristic extends CharacteristicSpecification
{
	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic</em>' containment reference.
	 * @see #setCharacteristic(Characteristic)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getDirectCharacteristic_Characteristic()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Characteristic getCharacteristic();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.DirectCharacteristic#getCharacteristic <em>Characteristic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristic</em>' containment reference.
	 * @see #getCharacteristic()
	 * @generated
	 */
	void setCharacteristic(Characteristic value);

} // DirectCharacteristic
