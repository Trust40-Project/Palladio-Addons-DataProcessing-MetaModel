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
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.TransformDataOperationImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.TransformDataOperationImpl#getOutput <em>Output</em>}</li>
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
	public Data getInputs()
	{
		return (Data)eGet(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__INPUTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputs(Data newInputs)
	{
		eSet(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__INPUTS, newInputs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getOutput()
	{
		return (Data)eGet(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__OUTPUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(Data newOutput)
	{
		eSet(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__OUTPUT, newOutput);
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
