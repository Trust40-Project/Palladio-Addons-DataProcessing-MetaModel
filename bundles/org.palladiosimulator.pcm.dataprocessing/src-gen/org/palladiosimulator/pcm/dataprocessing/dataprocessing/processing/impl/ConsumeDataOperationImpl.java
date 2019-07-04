/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ConsumeDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consume Data Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ConsumeDataOperationImpl#getConsumedData <em>Consumed Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConsumeDataOperationImpl extends DataOperationImpl implements ConsumeDataOperation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsumeDataOperationImpl()
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
		return ProcessingPackage.Literals.CONSUME_DATA_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getConsumedData()
	{
		return (Data)eGet(ProcessingPackage.Literals.CONSUME_DATA_OPERATION__CONSUMED_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumedData(Data newConsumedData)
	{
		eSet(ProcessingPackage.Literals.CONSUME_DATA_OPERATION__CONSUMED_DATA, newConsumedData);
	}

	/**
	 * The cached invocation delegate for the '{@link #determineIncomingData() <em>Determine Incoming Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #determineIncomingData()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DETERMINE_INCOMING_DATA__EINVOCATION_DELEGATE = ((EOperation.Internal)ProcessingPackage.Literals.CONSUME_DATA_OPERATION.getEOperations().get(0)).getInvocationDelegate();

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

} //ConsumeDataOperationImpl
