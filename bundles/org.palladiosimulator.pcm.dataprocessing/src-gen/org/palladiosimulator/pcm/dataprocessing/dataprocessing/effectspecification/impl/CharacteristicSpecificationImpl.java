/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicSpecification;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristic Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.CharacteristicSpecificationImpl#getCharacteristicChange <em>Characteristic Change</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CharacteristicSpecificationImpl extends EntityImpl implements CharacteristicSpecification
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicSpecificationImpl()
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
		return EffectspecificationPackage.Literals.CHARACTERISTIC_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicChange getCharacteristicChange()
	{
		return (CharacteristicChange)eGet(EffectspecificationPackage.Literals.CHARACTERISTIC_SPECIFICATION__CHARACTERISTIC_CHANGE, true);
	}

} //CharacteristicSpecificationImpl
