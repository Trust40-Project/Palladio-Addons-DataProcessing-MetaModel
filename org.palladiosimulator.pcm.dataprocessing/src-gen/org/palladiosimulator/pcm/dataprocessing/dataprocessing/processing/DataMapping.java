/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing;

import de.uka.ipd.sdq.identifier.Identifier;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataMapping#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getDataMapping()
 * @model abstract="true"
 * @generated
 */
public interface DataMapping extends Identifier
{
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Data)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getDataMapping_Data()
	 * @model required="true"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataMapping#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

} // DataMapping
