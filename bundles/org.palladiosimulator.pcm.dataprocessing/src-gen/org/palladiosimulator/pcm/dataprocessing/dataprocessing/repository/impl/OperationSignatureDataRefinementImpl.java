/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ParameterBasedData;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.OperationSignatureDataRefinement;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Signature Data Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.OperationSignatureDataRefinementImpl#getParameterRefinements <em>Parameter Refinements</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.OperationSignatureDataRefinementImpl#getResultRefinements <em>Result Refinements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationSignatureDataRefinementImpl extends EntityImpl implements OperationSignatureDataRefinement
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationSignatureDataRefinementImpl()
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
		return RepositoryPackage.Literals.OPERATION_SIGNATURE_DATA_REFINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParameterBasedData> getParameterRefinements()
	{
		return (EList<ParameterBasedData>)eGet(RepositoryPackage.Literals.OPERATION_SIGNATURE_DATA_REFINEMENT__PARAMETER_REFINEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResultBasedData> getResultRefinements()
	{
		return (EList<ResultBasedData>)eGet(RepositoryPackage.Literals.OPERATION_SIGNATURE_DATA_REFINEMENT__RESULT_REFINEMENTS, true);
	}

} //OperationSignatureDataRefinementImpl
