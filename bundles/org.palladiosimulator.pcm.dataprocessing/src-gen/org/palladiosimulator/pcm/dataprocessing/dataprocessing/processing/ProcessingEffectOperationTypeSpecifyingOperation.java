/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectOperationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Operation Type Specifying Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingEffectOperationTypeSpecifyingOperation#getProcessingEffectOperationType <em>Processing Effect Operation Type</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getProcessingEffectOperationTypeSpecifyingOperation()
 * @model abstract="true"
 * @generated
 */
public interface ProcessingEffectOperationTypeSpecifyingOperation extends DataOperation
{
	/**
	 * Returns the value of the '<em><b>Processing Effect Operation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Effect Operation Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Effect Operation Type</em>' reference.
	 * @see #setProcessingEffectOperationType(ProcessingEffectOperationType)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getProcessingEffectOperationTypeSpecifyingOperation_ProcessingEffectOperationType()
	 * @model required="true"
	 * @generated
	 */
	ProcessingEffectOperationType getProcessingEffectOperationType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingEffectOperationTypeSpecifyingOperation#getProcessingEffectOperationType <em>Processing Effect Operation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Effect Operation Type</em>' reference.
	 * @see #getProcessingEffectOperationType()
	 * @generated
	 */
	void setProcessingEffectOperationType(ProcessingEffectOperationType value);

} // ProcessingEffectOperationTypeSpecifyingOperation
