/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DerivedData#getSources <em>Sources</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DerivedData#getResultingDataType <em>Resulting Data Type</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage#getDerivedData()
 * @model
 * @generated
 */
public interface DerivedData extends Data
{
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage#getDerivedData_Sources()
	 * @model required="true"
	 * @generated
	 */
	EList<Data> getSources();

	/**
	 * Returns the value of the '<em><b>Resulting Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resulting Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resulting Data Type</em>' reference.
	 * @see #setResultingDataType(DataType)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage#getDerivedData_ResultingDataType()
	 * @model required="true"
	 * @generated
	 */
	DataType getResultingDataType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DerivedData#getResultingDataType <em>Resulting Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resulting Data Type</em>' reference.
	 * @see #getResultingDataType()
	 * @generated
	 */
	void setResultingDataType(DataType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='resultingDataType'"
	 * @generated
	 */
	DataType determineDataType();

} // DerivedData
