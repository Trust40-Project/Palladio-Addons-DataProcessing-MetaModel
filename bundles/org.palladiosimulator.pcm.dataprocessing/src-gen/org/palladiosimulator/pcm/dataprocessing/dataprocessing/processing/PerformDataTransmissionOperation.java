/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataMapping;

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
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation#getOutputData <em>Output Data</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getPerformDataTransmissionOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='outputMappingsAndOutputDataHasToMatch'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL outputMappingsAndOutputDataHasToMatch='outputMappings.to-&gt;asSet() = outputData-&gt;asSet()'"
 * @generated
 */
public interface PerformDataTransmissionOperation extends DataOperation
{
	/**
	 * Returns the value of the '<em><b>Input Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataMapping}.
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
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataMapping}.
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
	 * Returns the value of the '<em><b>Output Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Data</em>' containment reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getPerformDataTransmissionOperation_OutputData()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResultBasedData> getOutputData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.outputMappings.to-&gt;asSet()'"
	 * @generated
	 */
	EList<Data> determineOutgoingData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.inputMappings.from-&gt;asSet()'"
	 * @generated
	 */
	EList<Data> determineIncomingData();

} // PerformDataTransmissionOperation
