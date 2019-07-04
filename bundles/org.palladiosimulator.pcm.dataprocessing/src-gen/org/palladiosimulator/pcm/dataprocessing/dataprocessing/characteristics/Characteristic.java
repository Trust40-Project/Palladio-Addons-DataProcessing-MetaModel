/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Characteristic#getCharacteristicType <em>Characteristic Type</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getCharacteristic()
 * @model abstract="true"
 * @generated
 */
public interface Characteristic extends Identifier
{
	/**
	 * Returns the value of the '<em><b>Characteristic Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic Type</em>' reference.
	 * @see #setCharacteristicType(CharacteristicType)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getCharacteristic_CharacteristicType()
	 * @model required="true"
	 * @generated
	 */
	CharacteristicType getCharacteristicType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Characteristic#getCharacteristicType <em>Characteristic Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristic Type</em>' reference.
	 * @see #getCharacteristicType()
	 * @generated
	 */
	void setCharacteristicType(CharacteristicType value);

} // Characteristic
