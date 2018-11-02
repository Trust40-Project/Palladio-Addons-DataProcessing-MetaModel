/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Type Data Processing Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.OperationTypeDataProcessingEffect#getRelevantOperationTypes <em>Relevant Operation Types</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getOperationTypeDataProcessingEffect()
 * @model
 * @generated
 */
public interface OperationTypeDataProcessingEffect extends ProcessingEffect
{
	/**
	 * Returns the value of the '<em><b>Relevant Operation Types</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectOperationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relevant Operation Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relevant Operation Types</em>' reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getOperationTypeDataProcessingEffect_RelevantOperationTypes()
	 * @model required="true"
	 * @generated
	 */
	EList<ProcessingEffectOperationType> getRelevantOperationTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" operationRequired="true" resultDataRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let typedOperation = operation.oclAsType(processing::ProcessingEffectOperationTypeSpecifyingOperation) in\n\trelevantOperationTypes-&gt;includes(typedOperation.processingEffectOperationType) and\n\t(toDataType.oclIsUndefined() or toDataType = resultData.type) and\n\t(fromDataType.oclIsUndefined() or operation.incomingData.type-&gt;includes(fromDataType))'"
	 * @generated
	 */
	boolean isApplicableTo(DataOperation operation, Data resultData);

} // OperationTypeDataProcessingEffect
