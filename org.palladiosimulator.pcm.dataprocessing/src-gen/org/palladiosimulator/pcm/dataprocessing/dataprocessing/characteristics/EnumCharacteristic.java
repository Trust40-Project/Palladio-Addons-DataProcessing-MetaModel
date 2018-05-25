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
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristic#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getEnumCharacteristic()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='valueCountMustMatchTypeRestriction literalsMustBelongToCorrectEnum'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot valueCountMustMatchTypeRestriction='self.values-&gt;size() &lt; 2 or self.type.oclAsType(EnumCharacteristicType).multipleChoice' literalsMustBelongToCorrectEnum='self.type.oclAsType(EnumCharacteristicType).enum.literals-&gt;includesAll(self.values)'"
 * @generated
 */
public interface EnumCharacteristic extends Characteristic<EnumCharacteristicType> {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getEnumCharacteristic_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumCharacteristicLiteral> getValues();

} // EnumCharacteristic
