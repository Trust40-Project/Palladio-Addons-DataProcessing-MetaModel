/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CreateDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Data Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.CreateDataOperationImpl#getResultingData <em>Resulting Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateDataOperationImpl extends DataOperationImpl implements CreateDataOperation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateDataOperationImpl()
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
		return ProcessingPackage.Literals.CREATE_DATA_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getResultingData()
	{
		return (Data)eGet(ProcessingPackage.Literals.CREATE_DATA_OPERATION__RESULTING_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultingData(Data newResultingData)
	{
		eSet(ProcessingPackage.Literals.CREATE_DATA_OPERATION__RESULTING_DATA, newResultingData);
	}

} //CreateDataOperationImpl
