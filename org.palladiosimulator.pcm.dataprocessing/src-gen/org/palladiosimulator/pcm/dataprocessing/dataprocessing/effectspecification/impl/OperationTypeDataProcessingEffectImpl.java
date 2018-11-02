/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.OperationTypeDataProcessingEffect;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectOperationType;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Type Data Processing Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.OperationTypeDataProcessingEffectImpl#getRelevantOperationTypes <em>Relevant Operation Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationTypeDataProcessingEffectImpl extends ProcessingEffectImpl implements OperationTypeDataProcessingEffect
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationTypeDataProcessingEffectImpl()
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
		return EffectspecificationPackage.Literals.OPERATION_TYPE_DATA_PROCESSING_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProcessingEffectOperationType> getRelevantOperationTypes()
	{
		return (EList<ProcessingEffectOperationType>)eGet(EffectspecificationPackage.Literals.OPERATION_TYPE_DATA_PROCESSING_EFFECT__RELEVANT_OPERATION_TYPES, true);
	}

	/**
	 * The cached invocation delegate for the '{@link #isApplicableTo(org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation, org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data) <em>Is Applicable To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicableTo(org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation, org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_APPLICABLE_TO_DATA_OPERATION_DATA__EINVOCATION_DELEGATE = ((EOperation.Internal)EffectspecificationPackage.Literals.OPERATION_TYPE_DATA_PROCESSING_EFFECT.getEOperations().get(0)).getInvocationDelegate();

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

} //OperationTypeDataProcessingEffectImpl
