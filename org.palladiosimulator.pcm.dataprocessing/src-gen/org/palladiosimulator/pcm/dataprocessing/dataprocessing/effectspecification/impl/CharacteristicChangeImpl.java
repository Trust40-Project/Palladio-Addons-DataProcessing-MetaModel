/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicSpecification;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangeOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristic Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.CharacteristicChangeImpl#getChangeOperation <em>Change Operation</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.CharacteristicChangeImpl#getCharacteristicSpecifications <em>Characteristic Specifications</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.CharacteristicChangeImpl#getProcessingEffect <em>Processing Effect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacteristicChangeImpl extends EntityImpl implements CharacteristicChange
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicChangeImpl()
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
		return EffectspecificationPackage.Literals.CHARACTERISTIC_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicChangeOperation getChangeOperation()
	{
		return (CharacteristicChangeOperation)eGet(EffectspecificationPackage.Literals.CHARACTERISTIC_CHANGE__CHANGE_OPERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeOperation(CharacteristicChangeOperation newChangeOperation)
	{
		eSet(EffectspecificationPackage.Literals.CHARACTERISTIC_CHANGE__CHANGE_OPERATION, newChangeOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CharacteristicSpecification> getCharacteristicSpecifications()
	{
		return (EList<CharacteristicSpecification>)eGet(EffectspecificationPackage.Literals.CHARACTERISTIC_CHANGE__CHARACTERISTIC_SPECIFICATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingEffect getProcessingEffect()
	{
		return (ProcessingEffect)eGet(EffectspecificationPackage.Literals.CHARACTERISTIC_CHANGE__PROCESSING_EFFECT, true);
	}

} //CharacteristicChangeImpl
