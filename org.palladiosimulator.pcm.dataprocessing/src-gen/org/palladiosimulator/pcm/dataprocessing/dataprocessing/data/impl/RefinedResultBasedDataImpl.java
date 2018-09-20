/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.RefinedResultBasedData;

import org.palladiosimulator.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refined Result Based Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.RefinedResultBasedDataImpl#getRefiningDataType <em>Refining Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefinedResultBasedDataImpl extends ResultBasedDataImpl implements RefinedResultBasedData
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinedResultBasedDataImpl()
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
		return DataPackage.Literals.REFINED_RESULT_BASED_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getRefiningDataType()
	{
		return (DataType)eGet(DataPackage.Literals.REFINED_RESULT_BASED_DATA__REFINING_DATA_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefiningDataType(DataType newRefiningDataType)
	{
		eSet(DataPackage.Literals.REFINED_RESULT_BASED_DATA__REFINING_DATA_TYPE, newRefiningDataType);
	}

	/**
	 * The cached invocation delegate for the '{@link #determineDataType() <em>Determine Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #determineDataType()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DETERMINE_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)DataPackage.Literals.REFINED_RESULT_BASED_DATA.getEOperations().get(0)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType determineDataType()
	{
		try
		{
			return (DataType)DETERMINE_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite)
		{
			throw new WrappedException(ite);
		}
	}

} //RefinedResultBasedDataImpl
