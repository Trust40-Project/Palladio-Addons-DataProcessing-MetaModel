/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Data Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ReturnDataOperation#getReturnDestination <em>Return Destination</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getReturnDataOperation()
 * @model
 * @generated
 */
public interface ReturnDataOperation extends ConsumeDataOperation
{
	/**
	 * Returns the value of the '<em><b>Return Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Destination</em>' reference.
	 * @see #setReturnDestination(ResultBasedData)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getReturnDataOperation_ReturnDestination()
	 * @model required="true"
	 * @generated
	 */
	ResultBasedData getReturnDestination();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ReturnDataOperation#getReturnDestination <em>Return Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Destination</em>' reference.
	 * @see #getReturnDestination()
	 * @generated
	 */
	void setReturnDestination(ResultBasedData value);

} // ReturnDataOperation
