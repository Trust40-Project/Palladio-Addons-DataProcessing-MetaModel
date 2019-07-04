/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ParameterBasedData;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Signature Data Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.OperationSignatureDataRefinement#getParameterRefinements <em>Parameter Refinements</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.OperationSignatureDataRefinement#getResultRefinements <em>Result Refinements</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.RepositoryPackage#getOperationSignatureDataRefinement()
 * @model
 * @generated
 */
public interface OperationSignatureDataRefinement extends Entity
{
	/**
	 * Returns the value of the '<em><b>Parameter Refinements</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ParameterBasedData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Refinements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Refinements</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.RepositoryPackage#getOperationSignatureDataRefinement_ParameterRefinements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBasedData> getParameterRefinements();

	/**
	 * Returns the value of the '<em><b>Result Refinements</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Refinements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Refinements</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.RepositoryPackage#getOperationSignatureDataRefinement_ResultRefinements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResultBasedData> getResultRefinements();

} // OperationSignatureDataRefinement
