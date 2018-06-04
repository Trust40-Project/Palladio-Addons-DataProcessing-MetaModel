/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.OriginalData;

import org.palladiosimulator.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Original Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.OriginalDataImpl#getOriginalType <em>Original Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OriginalDataImpl extends DataImpl implements OriginalData
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OriginalDataImpl()
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
		return DataPackage.Literals.ORIGINAL_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getOriginalType()
	{
		return (DataType)eGet(DataPackage.Literals.ORIGINAL_DATA__ORIGINAL_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalType(DataType newOriginalType)
	{
		eSet(DataPackage.Literals.ORIGINAL_DATA__ORIGINAL_TYPE, newOriginalType);
	}

	/**
	 * The cached invocation delegate for the '{@link #determineDataType() <em>Determine Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #determineDataType()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DETERMINE_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)DataPackage.Literals.ORIGINAL_DATA.getEOperations().get(0)).getInvocationDelegate();

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

} //OriginalDataImpl
