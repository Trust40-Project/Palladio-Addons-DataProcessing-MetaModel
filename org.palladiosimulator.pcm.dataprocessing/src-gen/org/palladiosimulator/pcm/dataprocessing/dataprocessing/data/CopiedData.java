/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data;

import org.palladiosimulator.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copied Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.CopiedData#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage#getCopiedData()
 * @model
 * @generated
 */
public interface CopiedData extends Data
{
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Data)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage#getCopiedData_Source()
	 * @model required="true"
	 * @generated
	 */
	Data getSource();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.CopiedData#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Data value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='source.type'"
	 * @generated
	 */
	DataType determineDataType();

} // CopiedData
