/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ParameterBasedData;

import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Based Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.ParameterBasedDataImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterBasedDataImpl extends DataImpl implements ParameterBasedData
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterBasedDataImpl()
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
		return DataPackage.Literals.PARAMETER_BASED_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter()
	{
		return (Parameter)eGet(DataPackage.Literals.PARAMETER_BASED_DATA__PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter)
	{
		eSet(DataPackage.Literals.PARAMETER_BASED_DATA__PARAMETER, newParameter);
	}

	/**
	 * The cached invocation delegate for the '{@link #determineDataType() <em>Determine Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #determineDataType()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DETERMINE_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)DataPackage.Literals.PARAMETER_BASED_DATA.getEOperations().get(0)).getInvocationDelegate();

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

} //ParameterBasedDataImpl
