/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectOperationType;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectProvider;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingEffectOperationTypeSpecifyingOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Operation Type Specifying Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingEffectOperationTypeSpecifyingOperationImpl#getProcessingEffectOperationType <em>Processing Effect Operation Type</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingEffectOperationTypeSpecifyingOperationImpl#getCustomProcessingEffectProvider <em>Custom Processing Effect Provider</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingEffectOperationTypeSpecifyingOperationImpl#getProcessingEffectProvider <em>Processing Effect Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProcessingEffectOperationTypeSpecifyingOperationImpl extends DataOperationImpl implements ProcessingEffectOperationTypeSpecifyingOperation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingEffectOperationTypeSpecifyingOperationImpl()
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
		return ProcessingPackage.Literals.PROCESSING_EFFECT_OPERATION_TYPE_SPECIFYING_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingEffectOperationType getProcessingEffectOperationType()
	{
		return (ProcessingEffectOperationType)eGet(ProcessingPackage.Literals.PROCESSING_EFFECT_OPERATION_TYPE_SPECIFYING_OPERATION__PROCESSING_EFFECT_OPERATION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingEffectOperationType(ProcessingEffectOperationType newProcessingEffectOperationType)
	{
		eSet(ProcessingPackage.Literals.PROCESSING_EFFECT_OPERATION_TYPE_SPECIFYING_OPERATION__PROCESSING_EFFECT_OPERATION_TYPE, newProcessingEffectOperationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingEffectProvider getCustomProcessingEffectProvider()
	{
		return (ProcessingEffectProvider)eGet(ProcessingPackage.Literals.PROCESSING_EFFECT_OPERATION_TYPE_SPECIFYING_OPERATION__CUSTOM_PROCESSING_EFFECT_PROVIDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomProcessingEffectProvider(ProcessingEffectProvider newCustomProcessingEffectProvider)
	{
		eSet(ProcessingPackage.Literals.PROCESSING_EFFECT_OPERATION_TYPE_SPECIFYING_OPERATION__CUSTOM_PROCESSING_EFFECT_PROVIDER, newCustomProcessingEffectProvider);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingEffectProvider getProcessingEffectProvider()
	{
		return (ProcessingEffectProvider)eGet(ProcessingPackage.Literals.PROCESSING_EFFECT_OPERATION_TYPE_SPECIFYING_OPERATION__PROCESSING_EFFECT_PROVIDER, true);
	}

} //ProcessingEffectOperationTypeSpecifyingOperationImpl
