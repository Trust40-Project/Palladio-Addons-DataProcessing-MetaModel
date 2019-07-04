/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation;

import org.palladiosimulator.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectImpl#getFromDataType <em>From Data Type</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectImpl#getToDataType <em>To Data Type</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectImpl#getCharacteristicChanges <em>Characteristic Changes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProcessingEffectImpl extends EntityImpl implements ProcessingEffect
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingEffectImpl()
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
		return EffectspecificationPackage.Literals.PROCESSING_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getFromDataType()
	{
		return (DataType)eGet(EffectspecificationPackage.Literals.PROCESSING_EFFECT__FROM_DATA_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDataType(DataType newFromDataType)
	{
		eSet(EffectspecificationPackage.Literals.PROCESSING_EFFECT__FROM_DATA_TYPE, newFromDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getToDataType()
	{
		return (DataType)eGet(EffectspecificationPackage.Literals.PROCESSING_EFFECT__TO_DATA_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDataType(DataType newToDataType)
	{
		eSet(EffectspecificationPackage.Literals.PROCESSING_EFFECT__TO_DATA_TYPE, newToDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CharacteristicChange> getCharacteristicChanges()
	{
		return (EList<CharacteristicChange>)eGet(EffectspecificationPackage.Literals.PROCESSING_EFFECT__CHARACTERISTIC_CHANGES, true);
	}

	/**
	 * The cached invocation delegate for the '{@link #isApplicableTo(org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation, org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data) <em>Is Applicable To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicableTo(org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation, org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_APPLICABLE_TO_DATA_OPERATION_DATA__EINVOCATION_DELEGATE = ((EOperation.Internal)EffectspecificationPackage.Literals.PROCESSING_EFFECT.getEOperations().get(0)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicableTo(DataOperation operation, Data resultData)
	{
		try
		{
			return (Boolean)IS_APPLICABLE_TO_DATA_OPERATION_DATA__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{operation, resultData}));
		}
		catch (InvocationTargetException ite)
		{
			throw new WrappedException(ite);
		}
	}

} //ProcessingEffectImpl
