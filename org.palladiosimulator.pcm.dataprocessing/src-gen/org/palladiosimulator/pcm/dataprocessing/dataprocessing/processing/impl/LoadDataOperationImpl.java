/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.LoadDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.Store;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Data Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.LoadDataOperationImpl#getStore <em>Store</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadDataOperationImpl extends CreateDataOperationImpl implements LoadDataOperation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadDataOperationImpl()
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
		return ProcessingPackage.Literals.LOAD_DATA_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Store getStore()
	{
		return (Store)eGet(ProcessingPackage.Literals.LOAD_DATA_OPERATION__STORE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStore(Store newStore)
	{
		eSet(ProcessingPackage.Literals.LOAD_DATA_OPERATION__STORE, newStore);
	}

} //LoadDataOperationImpl
