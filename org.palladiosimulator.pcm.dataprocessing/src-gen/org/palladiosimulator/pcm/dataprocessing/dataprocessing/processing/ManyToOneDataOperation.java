/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Many To One Data Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ManyToOneDataOperation#getConsumedData <em>Consumed Data</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ManyToOneDataOperation#getResultingData <em>Resulting Data</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getManyToOneDataOperation()
 * @model abstract="true"
 * @generated
 */
public interface ManyToOneDataOperation extends DataOperation
{
	/**
	 * Returns the value of the '<em><b>Consumed Data</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumed Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumed Data</em>' reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getManyToOneDataOperation_ConsumedData()
	 * @model lower="2"
	 * @generated
	 */
	EList<Data> getConsumedData();

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
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getManyToOneDataOperation_ResultingData()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Data getResultingData();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ManyToOneDataOperation#getResultingData <em>Resulting Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resulting Data</em>' containment reference.
	 * @see #getResultingData()
	 * @generated
	 */
	void setResultingData(Data value);

} // ManyToOneDataOperation
