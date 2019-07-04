/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Characteristic Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.StoreCharacteristicContainer#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getStoreCharacteristicContainer()
 * @model
 * @generated
 */
public interface StoreCharacteristicContainer extends Entity
{
	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.StoreCharacteristics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristics</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getStoreCharacteristicContainer_Characteristics()
	 * @model containment="true"
	 * @generated
	 */
	EList<StoreCharacteristics> getCharacteristics();

} // StoreCharacteristicContainer
