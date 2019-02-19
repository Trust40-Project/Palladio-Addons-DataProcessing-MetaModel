/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getCharacteristicType()
 * @model abstract="true"
 * @generated
 */
public interface CharacteristicType extends Entity
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" characteristicTypeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='false'"
	 * @generated
	 */
	boolean hasCompatibleValueRange(CharacteristicType characteristicType);

} // CharacteristicType
