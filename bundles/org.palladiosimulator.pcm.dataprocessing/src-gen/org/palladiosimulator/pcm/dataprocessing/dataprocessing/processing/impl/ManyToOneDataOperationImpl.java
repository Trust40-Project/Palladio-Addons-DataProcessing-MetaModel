/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ManyToOneDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Many To One Data Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ManyToOneDataOperationImpl#getConsumedData <em>Consumed Data</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ManyToOneDataOperationImpl#getResultingData <em>Resulting Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ManyToOneDataOperationImpl extends DataOperationImpl implements ManyToOneDataOperation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManyToOneDataOperationImpl()
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
		return ProcessingPackage.Literals.MANY_TO_ONE_DATA_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Data> getConsumedData()
	{
		return (EList<Data>)eGet(ProcessingPackage.Literals.MANY_TO_ONE_DATA_OPERATION__CONSUMED_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getResultingData()
	{
		return (Data)eGet(ProcessingPackage.Literals.MANY_TO_ONE_DATA_OPERATION__RESULTING_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultingData(Data newResultingData)
	{
		eSet(ProcessingPackage.Literals.MANY_TO_ONE_DATA_OPERATION__RESULTING_DATA, newResultingData);
	}

	/**
	 * The cached invocation delegate for the '{@link #determineIncomingData() <em>Determine Incoming Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #determineIncomingData()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DETERMINE_INCOMING_DATA__EINVOCATION_DELEGATE = ((EOperation.Internal)ProcessingPackage.Literals.MANY_TO_ONE_DATA_OPERATION.getEOperations().get(0)).getInvocationDelegate();

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

	/**
	 * The cached invocation delegate for the '{@link #determineOutgoingData() <em>Determine Outgoing Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #determineOutgoingData()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DETERMINE_OUTGOING_DATA__EINVOCATION_DELEGATE = ((EOperation.Internal)ProcessingPackage.Literals.MANY_TO_ONE_DATA_OPERATION.getEOperations().get(1)).getInvocationDelegate();

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

} //ManyToOneDataOperationImpl
