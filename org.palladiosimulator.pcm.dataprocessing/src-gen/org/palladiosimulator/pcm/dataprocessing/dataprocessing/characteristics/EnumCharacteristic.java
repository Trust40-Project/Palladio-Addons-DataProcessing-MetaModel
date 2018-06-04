/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristic#getLiterals <em>Literals</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristic#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getEnumCharacteristic()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='valueCountMustMatchTypeRestriction literalsMustBelongToCorrectEnum'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot valueCountMustMatchTypeRestriction='self.literals-&gt;size() &lt; 2 or self.type.multipleChoice' literalsMustBelongToCorrectEnum='self.type.enum.literals-&gt;includesAll(self.literals)'"
 * @generated
 */
public interface EnumCharacteristic extends Characteristic
{
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getEnumCharacteristic_Literals()
	 * @model
	 * @generated
	 */
	EList<EnumCharacteristicLiteral> getLiterals();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EnumCharacteristicType)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getEnumCharacteristic_Type()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='let type = self.characteristicType.oclAsType(EnumCharacteristicType)\n\t\t\t\tin if type.oclIsInvalid()\n\t\t\t\tthen null\n\t\t\t\telse type\n\t\t\t\tendif'"
	 * @generated
	 */
	EnumCharacteristicType getType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristic#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EnumCharacteristicType value);

} // EnumCharacteristic
