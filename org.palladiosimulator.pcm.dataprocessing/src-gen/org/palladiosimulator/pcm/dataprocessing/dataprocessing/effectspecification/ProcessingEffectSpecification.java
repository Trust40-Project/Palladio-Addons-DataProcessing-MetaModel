/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecificationExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Effect Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectSpecification#getOperationTypes <em>Operation Types</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectSpecification#getProcessingEffects <em>Processing Effects</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getProcessingEffectSpecification()
 * @model
 * @generated
 */
public interface ProcessingEffectSpecification extends DataSpecificationExtension
{
	/**
	 * Returns the value of the '<em><b>Operation Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectOperationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Types</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getProcessingEffectSpecification_OperationTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessingEffectOperationType> getOperationTypes();

	/**
	 * Returns the value of the '<em><b>Processing Effects</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Effects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Effects</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getProcessingEffectSpecification_ProcessingEffects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessingEffect> getProcessingEffects();

} // ProcessingEffectSpecification
