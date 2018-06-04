/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform Data Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation#getInputData <em>Input Data</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation#getOutputData <em>Output Data</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation#getParameterData <em>Parameter Data</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getTransformDataOperation()
 * @model abstract="true"
 * @generated
 */
public interface TransformDataOperation extends DataOperation
{
	/**
	 * Returns the value of the '<em><b>Input Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Data</em>' reference.
	 * @see #setInputData(Data)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getTransformDataOperation_InputData()
	 * @model required="true"
	 * @generated
	 */
	Data getInputData();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation#getInputData <em>Input Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Data</em>' reference.
	 * @see #getInputData()
	 * @generated
	 */
	void setInputData(Data value);

	/**
	 * Returns the value of the '<em><b>Output Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Data</em>' reference.
	 * @see #setOutputData(Data)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getTransformDataOperation_OutputData()
	 * @model required="true"
	 * @generated
	 */
	Data getOutputData();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation#getOutputData <em>Output Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Data</em>' reference.
	 * @see #getOutputData()
	 * @generated
	 */
	void setOutputData(Data value);

	/**
	 * Returns the value of the '<em><b>Parameter Data</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Data</em>' reference list.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getTransformDataOperation_ParameterData()
	 * @model
	 * @generated
	 */
	EList<Data> getParameterData();

} // TransformDataOperation
