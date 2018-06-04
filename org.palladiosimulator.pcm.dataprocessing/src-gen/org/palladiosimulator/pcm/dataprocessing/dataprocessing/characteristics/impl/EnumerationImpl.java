/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Enumeration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.EnumerationImpl#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl extends EntityImpl implements Enumeration
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationImpl()
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
		return CharacteristicsPackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EnumCharacteristicLiteral> getLiterals()
	{
		return (EList<EnumCharacteristicLiteral>)eGet(CharacteristicsPackage.Literals.ENUMERATION__LITERALS, true);
	}

} //EnumerationImpl
