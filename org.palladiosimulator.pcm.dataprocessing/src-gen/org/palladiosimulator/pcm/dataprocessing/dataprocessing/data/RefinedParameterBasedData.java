/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data;

import org.palladiosimulator.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refined Parameter Based Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.RefinedParameterBasedData#getRefiningDataType <em>Refining Data Type</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage#getRefinedParameterBasedData()
 * @model
 * @generated
 */
public interface RefinedParameterBasedData extends ParameterBasedData
{
	/**
	 * Returns the value of the '<em><b>Refining Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refining Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refining Data Type</em>' reference.
	 * @see #setRefiningDataType(DataType)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage#getRefinedParameterBasedData_RefiningDataType()
	 * @model required="true"
	 * @generated
	 */
	DataType getRefiningDataType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.RefinedParameterBasedData#getRefiningDataType <em>Refining Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refining Data Type</em>' reference.
	 * @see #getRefiningDataType()
	 * @generated
	 */
	void setRefiningDataType(DataType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='refiningDataType'"
	 * @generated
	 */
	DataType determineDataType();

} // RefinedParameterBasedData
