/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import org.eclipse.emf.ecore.EClass;

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

} //ConsumeDataOperationImpl
