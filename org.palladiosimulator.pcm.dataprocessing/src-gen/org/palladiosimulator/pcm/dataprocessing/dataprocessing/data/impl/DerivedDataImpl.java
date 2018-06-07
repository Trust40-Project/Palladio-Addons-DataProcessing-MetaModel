/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DerivedData;

import org.palladiosimulator.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DerivedDataImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DerivedDataImpl#getResultingDataType <em>Resulting Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedDataImpl extends DataImpl implements DerivedData
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedDataImpl()
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
		return DataPackage.Literals.DERIVED_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Data> getSources()
	{
		return (EList<Data>)eGet(DataPackage.Literals.DERIVED_DATA__SOURCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getResultingDataType()
	{
		return (DataType)eGet(DataPackage.Literals.DERIVED_DATA__RESULTING_DATA_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultingDataType(DataType newResultingDataType)
	{
		eSet(DataPackage.Literals.DERIVED_DATA__RESULTING_DATA_TYPE, newResultingDataType);
	}

	/**
	 * The cached invocation delegate for the '{@link #determineDataType() <em>Determine Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #determineDataType()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DETERMINE_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)DataPackage.Literals.DERIVED_DATA.getEOperations().get(0)).getInvocationDelegate();

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

} //DerivedDataImpl
