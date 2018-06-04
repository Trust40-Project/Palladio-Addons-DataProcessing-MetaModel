/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Result Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataResultMapping#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataResultMapping#getReceivedData <em>Received Data</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getDataResultMapping()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mappedDataMustBeInReceivedData'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mappedDataMustBeInReceivedData='self.receivedData-&gt;includes(self.data)'"
 * @generated
 */
public interface DataResultMapping extends DataMapping
{
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(OperationSignature)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getDataResultMapping_Operation()
	 * @model required="true"
	 * @generated
	 */
	OperationSignature getOperation();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataResultMapping#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(OperationSignature value);

	/**
	 * Returns the value of the '<em><b>Received Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Data</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getDataResultMapping_ReceivedData()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getReceivedData();

} // DataResultMapping
