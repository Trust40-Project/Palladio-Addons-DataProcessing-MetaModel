/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFactoryImpl extends EFactoryImpl implements DataFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataFactory init()
	{
		try
		{
			DataFactory theDataFactory = (DataFactory)EPackage.Registry.INSTANCE.getEFactory(DataPackage.eNS_URI);
			if (theDataFactory != null)
			{
				return theDataFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case DataPackage.ORIGINAL_DATA: return (EObject)createOriginalData();
			case DataPackage.PARAMETER_BASED_DATA: return (EObject)createParameterBasedData();
			case DataPackage.RESULT_BASED_DATA: return (EObject)createResultBasedData();
			case DataPackage.DERIVED_DATA: return (EObject)createDerivedData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginalData createOriginalData()
	{
		OriginalDataImpl originalData = new OriginalDataImpl();
		return originalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBasedData createParameterBasedData()
	{
		ParameterBasedDataImpl parameterBasedData = new ParameterBasedDataImpl();
		return parameterBasedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultBasedData createResultBasedData()
	{
		ResultBasedDataImpl resultBasedData = new ResultBasedDataImpl();
		return resultBasedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedData createDerivedData()
	{
		DerivedDataImpl derivedData = new DerivedDataImpl();
		return derivedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPackage getDataPackage()
	{
		return (DataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataPackage getPackage()
	{
		return DataPackage.eINSTANCE;
	}

} //DataFactoryImpl
