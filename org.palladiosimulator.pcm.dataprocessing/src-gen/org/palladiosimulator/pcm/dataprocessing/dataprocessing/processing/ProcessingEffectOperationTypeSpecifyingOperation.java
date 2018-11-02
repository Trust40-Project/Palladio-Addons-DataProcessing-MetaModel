/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectOperationType;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectProvider;

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
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingEffectOperationTypeSpecifyingOperation#getCustomProcessingEffectProvider <em>Custom Processing Effect Provider</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingEffectOperationTypeSpecifyingOperation#getProcessingEffectProvider <em>Processing Effect Provider</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Custom Processing Effect Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Processing Effect Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Processing Effect Provider</em>' reference.
	 * @see #setCustomProcessingEffectProvider(ProcessingEffectProvider)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getProcessingEffectOperationTypeSpecifyingOperation_CustomProcessingEffectProvider()
	 * @model
	 * @generated
	 */
	ProcessingEffectProvider getCustomProcessingEffectProvider();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingEffectOperationTypeSpecifyingOperation#getCustomProcessingEffectProvider <em>Custom Processing Effect Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Processing Effect Provider</em>' reference.
	 * @see #getCustomProcessingEffectProvider()
	 * @generated
	 */
	void setCustomProcessingEffectProvider(ProcessingEffectProvider value);

	/**
	 * Returns the value of the '<em><b>Processing Effect Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Effect Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Effect Provider</em>' reference.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getProcessingEffectOperationTypeSpecifyingOperation_ProcessingEffectProvider()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='let defaultProvider = self.container.oclContainer.oclAsType(dataprocessing::effectspecification::ProcessingEffectProvider) in\n\tcustomProcessingEffectProvider-&gt;asOrderedSet()-&gt;including(defaultProvider)-&gt;select(not oclIsUndefined())-&gt;first()'"
	 * @generated
	 */
	ProcessingEffectProvider getProcessingEffectProvider();

} // ProcessingEffectOperationTypeSpecifyingOperation
