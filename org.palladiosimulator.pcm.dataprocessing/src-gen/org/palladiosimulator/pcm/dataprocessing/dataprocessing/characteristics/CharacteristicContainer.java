/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicContainer#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getCharacteristicContainer()
 * @model
 * @generated
 */
public interface CharacteristicContainer extends Identifier {
	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Characteristic}<code>&lt;org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicType&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristics</em>' reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getCharacteristicContainer_Characteristics()
	 * @model
	 * @generated
	 */
	EList<Characteristic<CharacteristicType>> getCharacteristics();

} // CharacteristicContainer
