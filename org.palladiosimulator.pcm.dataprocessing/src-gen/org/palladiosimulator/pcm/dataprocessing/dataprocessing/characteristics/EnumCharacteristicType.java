/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Characteristic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicType#isMultipleChoice <em>Multiple Choice</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicType#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getEnumCharacteristicType()
 * @model
 * @generated
 */
public interface EnumCharacteristicType extends CharacteristicType {
	/**
	 * Returns the value of the '<em><b>Multiple Choice</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Choice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Choice</em>' attribute.
	 * @see #setMultipleChoice(boolean)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getEnumCharacteristicType_MultipleChoice()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isMultipleChoice();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicType#isMultipleChoice <em>Multiple Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Choice</em>' attribute.
	 * @see #isMultipleChoice()
	 * @generated
	 */
	void setMultipleChoice(boolean value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' reference.
	 * @see #setEnum(Enumeration)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getEnumCharacteristicType_Enum()
	 * @model required="true"
	 * @generated
	 */
	Enumeration getEnum();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicType#getEnum <em>Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' reference.
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(Enumeration value);

} // EnumCharacteristicType
