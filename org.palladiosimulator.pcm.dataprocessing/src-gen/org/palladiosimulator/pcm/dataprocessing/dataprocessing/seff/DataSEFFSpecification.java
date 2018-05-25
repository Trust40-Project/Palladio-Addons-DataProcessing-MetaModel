/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ParameterBasedData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data SEFF Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.DataSEFFSpecification#getInputData <em>Input Data</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.SeffPackage#getDataSEFFSpecification()
 * @model
 * @generated
 */
public interface DataSEFFSpecification extends Identifier {
	/**
	 * Returns the value of the '<em><b>Input Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ParameterBasedData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Data</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.SeffPackage#getDataSEFFSpecification_InputData()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBasedData> getInputData();

} // DataSEFFSpecification
