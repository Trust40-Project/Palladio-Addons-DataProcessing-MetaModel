/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.RelatedCharacteristics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.RelatedCharacteristicsImpl#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.RelatedCharacteristicsImpl#getRelatedEntity <em>Related Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatedCharacteristicsImpl extends EntityImpl implements RelatedCharacteristics
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedCharacteristicsImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return CharacteristicsPackage.Literals.RELATED_CHARACTERISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicContainer getCharacteristics()
	{
		return (CharacteristicContainer)eGet(CharacteristicsPackage.Literals.RELATED_CHARACTERISTICS__CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacteristics(CharacteristicContainer newCharacteristics)
	{
		eSet(CharacteristicsPackage.Literals.RELATED_CHARACTERISTICS__CHARACTERISTICS, newCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getRelatedEntity()
	{
		return (Entity)eGet(CharacteristicsPackage.Literals.RELATED_CHARACTERISTICS__RELATED_ENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedEntity(Entity newRelatedEntity)
	{
		eSet(CharacteristicsPackage.Literals.RELATED_CHARACTERISTICS__RELATED_ENTITY, newRelatedEntity);
	}

} //RelatedCharacteristicsImpl
