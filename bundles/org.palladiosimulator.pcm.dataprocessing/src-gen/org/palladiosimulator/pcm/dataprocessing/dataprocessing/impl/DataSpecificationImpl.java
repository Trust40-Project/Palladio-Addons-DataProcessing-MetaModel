/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecificationExtension;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicTypeContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.RelatedCharacteristics;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.StoreCharacteristicContainer;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectSpecification;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataProcessingContainer;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.OperationSignatureDataRefinement;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.StoreContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl#getProcessingEffects <em>Processing Effects</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl#getDataProcessingContainers <em>Data Processing Containers</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl#getCharacteristicTypeContainers <em>Characteristic Type Containers</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl#getStoreContainers <em>Store Containers</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl#getCharacteristicContainer <em>Characteristic Container</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl#getRelatedCharacteristics <em>Related Characteristics</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl#getOperationSignatureDataRefinement <em>Operation Signature Data Refinement</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl#getStoreCharacteristicContainers <em>Store Characteristic Containers</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataSpecificationImpl#getExternalDataProcessingEffects <em>External Data Processing Effects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSpecificationImpl extends CDOObjectImpl implements DataSpecification
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSpecificationImpl()
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
		return DataprocessingPackage.Literals.DATA_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount()
	{
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProcessingEffect> getProcessingEffects()
	{
		return (EList<ProcessingEffect>)eGet(EffectspecificationPackage.Literals.PROCESSING_EFFECT_PROVIDER__PROCESSING_EFFECTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataProcessingContainer> getDataProcessingContainers()
	{
		return (EList<DataProcessingContainer>)eGet(DataprocessingPackage.Literals.DATA_SPECIFICATION__DATA_PROCESSING_CONTAINERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CharacteristicTypeContainer> getCharacteristicTypeContainers()
	{
		return (EList<CharacteristicTypeContainer>)eGet(DataprocessingPackage.Literals.DATA_SPECIFICATION__CHARACTERISTIC_TYPE_CONTAINERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StoreContainer> getStoreContainers()
	{
		return (EList<StoreContainer>)eGet(DataprocessingPackage.Literals.DATA_SPECIFICATION__STORE_CONTAINERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CharacteristicContainer> getCharacteristicContainer()
	{
		return (EList<CharacteristicContainer>)eGet(DataprocessingPackage.Literals.DATA_SPECIFICATION__CHARACTERISTIC_CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RelatedCharacteristics> getRelatedCharacteristics()
	{
		return (EList<RelatedCharacteristics>)eGet(DataprocessingPackage.Literals.DATA_SPECIFICATION__RELATED_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OperationSignatureDataRefinement> getOperationSignatureDataRefinement()
	{
		return (EList<OperationSignatureDataRefinement>)eGet(DataprocessingPackage.Literals.DATA_SPECIFICATION__OPERATION_SIGNATURE_DATA_REFINEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StoreCharacteristicContainer> getStoreCharacteristicContainers()
	{
		return (EList<StoreCharacteristicContainer>)eGet(DataprocessingPackage.Literals.DATA_SPECIFICATION__STORE_CHARACTERISTIC_CONTAINERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataSpecificationExtension> getExtensions()
	{
		return (EList<DataSpecificationExtension>)eGet(DataprocessingPackage.Literals.DATA_SPECIFICATION__EXTENSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProcessingEffectSpecification> getExternalDataProcessingEffects()
	{
		return (EList<ProcessingEffectSpecification>)eGet(DataprocessingPackage.Literals.DATA_SPECIFICATION__EXTERNAL_DATA_PROCESSING_EFFECTS, true);
	}

	/**
	 * The cached invocation delegate for the '{@link #determineProcessingEffects() <em>Determine Processing Effects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #determineProcessingEffects()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DETERMINE_PROCESSING_EFFECTS__EINVOCATION_DELEGATE = ((EOperation.Internal)DataprocessingPackage.Literals.DATA_SPECIFICATION.getEOperations().get(0)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProcessingEffect> determineProcessingEffects()
	{
		try
		{
			return (EList<ProcessingEffect>)DETERMINE_PROCESSING_EFFECTS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite)
		{
			throw new WrappedException(ite);
		}
	}

} //DataSpecificationImpl
