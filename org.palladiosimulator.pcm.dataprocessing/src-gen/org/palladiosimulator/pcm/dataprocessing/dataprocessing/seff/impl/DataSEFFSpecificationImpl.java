/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ParameterBasedData;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.DataSEFFSpecification;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.SeffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data SEFF Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.impl.DataSEFFSpecificationImpl#getInputData <em>Input Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSEFFSpecificationImpl extends EntityImpl implements DataSEFFSpecification
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSEFFSpecificationImpl()
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
		return SeffPackage.Literals.DATA_SEFF_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParameterBasedData> getInputData()
	{
		return (EList<ParameterBasedData>)eGet(SeffPackage.Literals.DATA_SEFF_SPECIFICATION__INPUT_DATA, true);
	}

} //DataSEFFSpecificationImpl
