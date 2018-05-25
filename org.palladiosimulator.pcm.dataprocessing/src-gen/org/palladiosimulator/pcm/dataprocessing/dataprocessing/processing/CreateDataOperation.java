/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Data Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CreateDataOperation#getResultingData <em>Resulting Data</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getCreateDataOperation()
 * @model
 * @generated
 */
public interface CreateDataOperation extends DataOperation {
	/**
	 * Returns the value of the '<em><b>Resulting Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resulting Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resulting Data</em>' containment reference.
	 * @see #setResultingData(Data)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getCreateDataOperation_ResultingData()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Data getResultingData();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CreateDataOperation#getResultingData <em>Resulting Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resulting Data</em>' containment reference.
	 * @see #getResultingData()
	 * @generated
	 */
	void setResultingData(Data value);

} // CreateDataOperation
