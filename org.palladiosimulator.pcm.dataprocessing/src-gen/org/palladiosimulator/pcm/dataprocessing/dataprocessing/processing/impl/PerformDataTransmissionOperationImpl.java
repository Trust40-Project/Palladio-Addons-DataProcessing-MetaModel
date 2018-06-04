/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataMapping;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perform Data Transmission Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.PerformDataTransmissionOperationImpl#getInputMappings <em>Input Mappings</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.PerformDataTransmissionOperationImpl#getOutputMappings <em>Output Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformDataTransmissionOperationImpl extends DataOperationImpl implements PerformDataTransmissionOperation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformDataTransmissionOperationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataMapping> getInputMappings()
	{
		return (EList<DataMapping>)eGet(ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION__INPUT_MAPPINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataMapping> getOutputMappings()
	{
		return (EList<DataMapping>)eGet(ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_MAPPINGS, true);
	}

} //PerformDataTransmissionOperationImpl
