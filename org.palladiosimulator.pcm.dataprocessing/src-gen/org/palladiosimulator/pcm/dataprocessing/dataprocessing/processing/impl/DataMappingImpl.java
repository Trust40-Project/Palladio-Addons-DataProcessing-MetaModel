/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataMapping;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataMappingImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataMappingImpl extends IdentifierImpl implements DataMapping
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataMappingImpl()
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
		return ProcessingPackage.Literals.DATA_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getData()
	{
		return (Data)eGet(ProcessingPackage.Literals.DATA_MAPPING__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Data newData)
	{
		eSet(ProcessingPackage.Literals.DATA_MAPPING__DATA, newData);
	}

} //DataMappingImpl
