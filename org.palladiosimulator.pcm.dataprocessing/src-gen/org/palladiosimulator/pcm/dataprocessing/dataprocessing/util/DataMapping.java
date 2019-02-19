/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.util;

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
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataMapping#getFrom <em>From</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataMapping#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.UtilPackage#getDataMapping()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='dataTypesMustBeTheSame'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL dataTypesMustBeTheSame='from.type = to.type'"
 * @generated
 */
public interface DataMapping extends Identifier
{
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Data)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.UtilPackage#getDataMapping_From()
	 * @model required="true"
	 * @generated
	 */
	Data getFrom();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataMapping#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Data value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Data)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.UtilPackage#getDataMapping_To()
	 * @model required="true"
	 * @generated
	 */
	Data getTo();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataMapping#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Data value);

} // DataMapping
