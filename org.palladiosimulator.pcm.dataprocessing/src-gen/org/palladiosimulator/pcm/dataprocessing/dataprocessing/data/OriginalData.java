/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data;

import org.palladiosimulator.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Original Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.OriginalData#getOriginalType <em>Original Type</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage#getOriginalData()
 * @model
 * @generated
 */
public interface OriginalData extends Data
{
	/**
	 * Returns the value of the '<em><b>Original Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Type</em>' reference.
	 * @see #setOriginalType(DataType)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage#getOriginalData_OriginalType()
	 * @model required="true"
	 * @generated
	 */
	DataType getOriginalType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.OriginalData#getOriginalType <em>Original Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Type</em>' reference.
	 * @see #getOriginalType()
	 * @generated
	 */
	void setOriginalType(DataType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='originalType'"
	 * @generated
	 */
	DataType determineDataType();

} // OriginalData
