/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Effect Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectProvider#getProcessingEffects <em>Processing Effects</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getProcessingEffectProvider()
 * @model interface="true" abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ProcessingEffectProvider extends CDOObject
{
	/**
	 * Returns the value of the '<em><b>Processing Effects</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Effects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Effects</em>' reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getProcessingEffectProvider_ProcessingEffects()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='determineProcessingEffects()'"
	 * @generated
	 */
	EList<ProcessingEffect> getProcessingEffects();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self-&gt;selectByKind(dataprocessing::effectspecification::ProcessingEffect)'"
	 * @generated
	 */
	EList<ProcessingEffect> determineProcessingEffects();

} // ProcessingEffectProvider
