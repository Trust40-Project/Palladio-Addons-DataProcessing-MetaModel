/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform Data Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.TransformDataOperationImpl#getInputData <em>Input Data</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.TransformDataOperationImpl#getOutputData <em>Output Data</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.TransformDataOperationImpl#getParameterData <em>Parameter Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransformDataOperationImpl extends DataOperationImpl implements TransformDataOperation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformDataOperationImpl()
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
		return ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getInputData()
	{
		return (Data)eGet(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__INPUT_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputData(Data newInputData)
	{
		eSet(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__INPUT_DATA, newInputData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getOutputData()
	{
		return (Data)eGet(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__OUTPUT_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputData(Data newOutputData)
	{
		eSet(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__OUTPUT_DATA, newOutputData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Data> getParameterData()
	{
		return (EList<Data>)eGet(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__PARAMETER_DATA, true);
	}

} //TransformDataOperationImpl
