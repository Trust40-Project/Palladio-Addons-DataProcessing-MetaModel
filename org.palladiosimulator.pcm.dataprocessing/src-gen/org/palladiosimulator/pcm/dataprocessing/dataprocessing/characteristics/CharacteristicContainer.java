/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicContainer#getOwnedCharacteristics <em>Owned Characteristics</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getCharacteristicContainer()
 * @model
 * @generated
 */
public interface CharacteristicContainer extends Entity
{
	/**
	 * Returns the value of the '<em><b>Owned Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Characteristic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Characteristics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Characteristics</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getCharacteristicContainer_OwnedCharacteristics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Characteristic> getOwnedCharacteristics();

} // CharacteristicContainer
