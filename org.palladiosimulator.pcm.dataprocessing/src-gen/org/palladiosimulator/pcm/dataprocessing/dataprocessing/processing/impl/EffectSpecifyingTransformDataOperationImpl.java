/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectOperationType;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectProvider;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.EffectSpecifyingTransformDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingEffectOperationTypeSpecifyingOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Specifying Transform Data Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.EffectSpecifyingTransformDataOperationImpl#getProcessingEffectOperationType <em>Processing Effect Operation Type</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.EffectSpecifyingTransformDataOperationImpl#getCustomProcessingEffectProvider <em>Custom Processing Effect Provider</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.EffectSpecifyingTransformDataOperationImpl#getProcessingEffectProvider <em>Processing Effect Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectSpecifyingTransformDataOperationImpl extends TransformDataOperationImpl implements EffectSpecifyingTransformDataOperation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectSpecifyingTransformDataOperationImpl()
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
		return ProcessingPackage.Literals.EFFECT_SPECIFYING_TRANSFORM_DATA_OPERATION;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == ProcessingEffectOperationTypeSpecifyingOperation.class)
		{
			switch (derivedFeatureID)
			{
				case ProcessingPackage.EFFECT_SPECIFYING_TRANSFORM_DATA_OPERATION__PROCESSING_EFFECT_OPERATION_TYPE: return ProcessingPackage.PROCESSING_EFFECT_OPERATION_TYPE_SPECIFYING_OPERATION__PROCESSING_EFFECT_OPERATION_TYPE;
				case ProcessingPackage.EFFECT_SPECIFYING_TRANSFORM_DATA_OPERATION__CUSTOM_PROCESSING_EFFECT_PROVIDER: return ProcessingPackage.PROCESSING_EFFECT_OPERATION_TYPE_SPECIFYING_OPERATION__CUSTOM_PROCESSING_EFFECT_PROVIDER;
				case ProcessingPackage.EFFECT_SPECIFYING_TRANSFORM_DATA_OPERATION__PROCESSING_EFFECT_PROVIDER: return ProcessingPackage.PROCESSING_EFFECT_OPERATION_TYPE_SPECIFYING_OPERATION__PROCESSING_EFFECT_PROVIDER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == ProcessingEffectOperationTypeSpecifyingOperation.class)
		{
			switch (baseFeatureID)
			{
				case ProcessingPackage.PROCESSING_EFFECT_OPERATION_TYPE_SPECIFYING_OPERATION__PROCESSING_EFFECT_OPERATION_TYPE: return ProcessingPackage.EFFECT_SPECIFYING_TRANSFORM_DATA_OPERATION__PROCESSING_EFFECT_OPERATION_TYPE;
				case ProcessingPackage.PROCESSING_EFFECT_OPERATION_TYPE_SPECIFYING_OPERATION__CUSTOM_PROCESSING_EFFECT_PROVIDER: return ProcessingPackage.EFFECT_SPECIFYING_TRANSFORM_DATA_OPERATION__CUSTOM_PROCESSING_EFFECT_PROVIDER;
				case ProcessingPackage.PROCESSING_EFFECT_OPERATION_TYPE_SPECIFYING_OPERATION__PROCESSING_EFFECT_PROVIDER: return ProcessingPackage.EFFECT_SPECIFYING_TRANSFORM_DATA_OPERATION__PROCESSING_EFFECT_PROVIDER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EffectSpecifyingTransformDataOperationImpl
