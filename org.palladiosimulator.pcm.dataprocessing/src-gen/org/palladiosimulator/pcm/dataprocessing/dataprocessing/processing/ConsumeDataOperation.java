/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consume Data Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ConsumeDataOperation#getConsumedData <em>Consumed Data</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getConsumeDataOperation()
 * @model abstract="true"
 * @generated
 */
public interface ConsumeDataOperation extends DataOperation
{
	/**
	 * Returns the value of the '<em><b>Consumed Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumed Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumed Data</em>' reference.
	 * @see #setConsumedData(Data)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getConsumeDataOperation_ConsumedData()
	 * @model required="true"
	 * @generated
	 */
	Data getConsumedData();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ConsumeDataOperation#getConsumedData <em>Consumed Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumed Data</em>' reference.
	 * @see #getConsumedData()
	 * @generated
	 */
	void setConsumedData(Data value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.consumedData-&gt;asSet()'"
	 * @generated
	 */
	EList<Data> determineIncomingData();

} // ConsumeDataOperation
