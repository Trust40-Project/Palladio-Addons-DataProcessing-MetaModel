/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.RelatedCharacteristics#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.RelatedCharacteristics#getRelatedEntity <em>Related Entity</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getRelatedCharacteristics()
 * @model
 * @generated
 */
public interface RelatedCharacteristics extends Entity
{
	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristics</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristics</em>' reference.
	 * @see #setCharacteristics(CharacteristicContainer)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getRelatedCharacteristics_Characteristics()
	 * @model required="true"
	 * @generated
	 */
	CharacteristicContainer getCharacteristics();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.RelatedCharacteristics#getCharacteristics <em>Characteristics</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristics</em>' reference.
	 * @see #getCharacteristics()
	 * @generated
	 */
	void setCharacteristics(CharacteristicContainer value);

	/**
	 * Returns the value of the '<em><b>Related Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Entity</em>' reference.
	 * @see #setRelatedEntity(Entity)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getRelatedCharacteristics_RelatedEntity()
	 * @model required="true"
	 * @generated
	 */
	Entity getRelatedEntity();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.RelatedCharacteristics#getRelatedEntity <em>Related Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Entity</em>' reference.
	 * @see #getRelatedEntity()
	 * @generated
	 */
	void setRelatedEntity(Entity value);

} // RelatedCharacteristics
