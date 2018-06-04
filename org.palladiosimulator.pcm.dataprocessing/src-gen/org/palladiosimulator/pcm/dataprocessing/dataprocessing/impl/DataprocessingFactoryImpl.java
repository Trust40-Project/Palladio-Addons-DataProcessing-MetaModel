/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataprocessingFactoryImpl extends EFactoryImpl implements DataprocessingFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataprocessingFactory init()
	{
		try
		{
			DataprocessingFactory theDataprocessingFactory = (DataprocessingFactory)EPackage.Registry.INSTANCE.getEFactory(DataprocessingPackage.eNS_URI);
			if (theDataprocessingFactory != null)
			{
				return theDataprocessingFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataprocessingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataprocessingFactoryImpl()
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
			case DataprocessingPackage.DATA_SPECIFICATION: return (EObject)createDataSpecification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSpecification createDataSpecification()
	{
		DataSpecificationImpl dataSpecification = new DataSpecificationImpl();
		return dataSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataprocessingPackage getDataprocessingPackage()
	{
		return (DataprocessingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataprocessingPackage getPackage()
	{
		return DataprocessingPackage.eINSTANCE;
	}

} //DataprocessingFactoryImpl
