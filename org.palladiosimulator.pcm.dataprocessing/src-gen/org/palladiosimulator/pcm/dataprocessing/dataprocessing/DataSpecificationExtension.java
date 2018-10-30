/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Specification Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecificationExtension#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage#getDataSpecificationExtension()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DataSpecificationExtension extends Identifier
{
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' container reference.
	 * @see #setSpecification(DataSpecification)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage#getDataSpecificationExtension_Specification()
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification#getExtensions
	 * @model opposite="extensions" required="true" transient="false"
	 * @generated
	 */
	DataSpecification getSpecification();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecificationExtension#getSpecification <em>Specification</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' container reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(DataSpecification value);

} // DataSpecificationExtension
