/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ReturnDataOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Data Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ReturnDataOperationImpl#getReturnDestination <em>Return Destination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnDataOperationImpl extends ConsumeDataOperationImpl implements ReturnDataOperation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnDataOperationImpl()
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
		return ProcessingPackage.Literals.RETURN_DATA_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultBasedData getReturnDestination()
	{
		return (ResultBasedData)eGet(ProcessingPackage.Literals.RETURN_DATA_OPERATION__RETURN_DESTINATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnDestination(ResultBasedData newReturnDestination)
	{
		eSet(ProcessingPackage.Literals.RETURN_DATA_OPERATION__RETURN_DESTINATION, newReturnDestination);
	}

} //ReturnDataOperationImpl
