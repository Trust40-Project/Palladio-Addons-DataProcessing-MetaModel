/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perform Data Transmission Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation#getInputMappings <em>Input Mappings</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation#getOutputMappings <em>Output Mappings</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation#getReceivedData <em>Received Data</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getPerformDataTransmissionOperation()
 * @model
 * @generated
 */
public interface PerformDataTransmissionOperation extends DataOperation {
	/**
	 * Returns the value of the '<em><b>Input Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Mappings</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getPerformDataTransmissionOperation_InputMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataMapping> getInputMappings();

	/**
	 * Returns the value of the '<em><b>Output Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Mappings</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getPerformDataTransmissionOperation_OutputMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataMapping> getOutputMappings();

	/**
	 * Returns the value of the '<em><b>Received Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Data</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getPerformDataTransmissionOperation_ReceivedData()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getReceivedData();

} // PerformDataTransmissionOperation
