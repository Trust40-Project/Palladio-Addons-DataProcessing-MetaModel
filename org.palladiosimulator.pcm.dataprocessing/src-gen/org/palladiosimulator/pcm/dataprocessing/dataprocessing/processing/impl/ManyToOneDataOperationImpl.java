/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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

} //ManyToOneDataOperationImpl
