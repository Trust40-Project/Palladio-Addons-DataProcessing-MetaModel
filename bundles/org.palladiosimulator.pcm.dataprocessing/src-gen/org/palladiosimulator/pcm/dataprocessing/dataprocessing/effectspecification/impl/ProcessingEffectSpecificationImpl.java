/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectOperationType;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Effect Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectSpecificationImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectSpecificationImpl#getOperationTypes <em>Operation Types</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectSpecificationImpl#getProcessingEffects <em>Processing Effects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessingEffectSpecificationImpl extends IdentifierImpl implements ProcessingEffectSpecification
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingEffectSpecificationImpl()
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
		return EffectspecificationPackage.Literals.PROCESSING_EFFECT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSpecification getSpecification()
	{
		return (DataSpecification)eGet(DataprocessingPackage.Literals.DATA_SPECIFICATION_EXTENSION__SPECIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(DataSpecification newSpecification)
	{
		eSet(DataprocessingPackage.Literals.DATA_SPECIFICATION_EXTENSION__SPECIFICATION, newSpecification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProcessingEffectOperationType> getOperationTypes()
	{
		return (EList<ProcessingEffectOperationType>)eGet(EffectspecificationPackage.Literals.PROCESSING_EFFECT_SPECIFICATION__OPERATION_TYPES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProcessingEffect> getProcessingEffects()
	{
		return (EList<ProcessingEffect>)eGet(EffectspecificationPackage.Literals.PROCESSING_EFFECT_SPECIFICATION__PROCESSING_EFFECTS, true);
	}

} //ProcessingEffectSpecificationImpl
