/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.DataCreationProcessingEffect;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Creation Processing Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DataCreationProcessingEffectImpl extends ProcessingEffectImpl implements DataCreationProcessingEffect
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCreationProcessingEffectImpl()
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
		return EffectspecificationPackage.Literals.DATA_CREATION_PROCESSING_EFFECT;
	}

	/**
	 * The cached invocation delegate for the '{@link #isApplicableTo(org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation, org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data) <em>Is Applicable To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicableTo(org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation, org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_APPLICABLE_TO_DATA_OPERATION_DATA__EINVOCATION_DELEGATE = ((EOperation.Internal)EffectspecificationPackage.Literals.DATA_CREATION_PROCESSING_EFFECT.getEOperations().get(0)).getInvocationDelegate();

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

} //DataCreationProcessingEffectImpl
