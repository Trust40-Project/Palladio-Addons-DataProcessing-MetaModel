/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataMapping;

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
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.PerformDataTransmissionOperationImpl#getOutputData <em>Output Data</em>}</li>
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResultBasedData> getOutputData()
	{
		return (EList<ResultBasedData>)eGet(ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_DATA, true);
	}

	/**
	 * The cached invocation delegate for the '{@link #determineOutgoingData() <em>Determine Outgoing Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #determineOutgoingData()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DETERMINE_OUTGOING_DATA__EINVOCATION_DELEGATE = ((EOperation.Internal)ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION.getEOperations().get(0)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Data> determineOutgoingData()
	{
		try
		{
			return (EList<Data>)DETERMINE_OUTGOING_DATA__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite)
		{
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #determineIncomingData() <em>Determine Incoming Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #determineIncomingData()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DETERMINE_INCOMING_DATA__EINVOCATION_DELEGATE = ((EOperation.Internal)ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION.getEOperations().get(1)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Data> determineIncomingData()
	{
		try
		{
			return (EList<Data>)DETERMINE_INCOMING_DATA__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite)
		{
			throw new WrappedException(ite);
		}
	}

} //PerformDataTransmissionOperationImpl
