/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicType;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CharacteristicTypeImpl extends EntityImpl implements CharacteristicType
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicTypeImpl()
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
		return CharacteristicsPackage.Literals.CHARACTERISTIC_TYPE;
	}

	/**
	 * The cached invocation delegate for the '{@link #hasCompatibleValueRange(org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicType) <em>Has Compatible Value Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasCompatibleValueRange(org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate HAS_COMPATIBLE_VALUE_RANGE_CHARACTERISTIC_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)CharacteristicsPackage.Literals.CHARACTERISTIC_TYPE.getEOperations().get(0)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasCompatibleValueRange(CharacteristicType characteristicType)
	{
		try
		{
			return (Boolean)HAS_COMPATIBLE_VALUE_RANGE_CHARACTERISTIC_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{characteristicType}));
		}
		catch (InvocationTargetException ite)
		{
			throw new WrappedException(ite);
		}
	}

} //CharacteristicTypeImpl
