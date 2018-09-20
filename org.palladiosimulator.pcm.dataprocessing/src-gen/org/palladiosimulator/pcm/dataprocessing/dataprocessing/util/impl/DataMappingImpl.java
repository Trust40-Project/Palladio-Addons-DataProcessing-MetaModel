/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataMapping;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.UtilPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.impl.DataMappingImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.impl.DataMappingImpl#getTo <em>To</em>}</li>
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
		return UtilPackage.Literals.DATA_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getFrom()
	{
		return (Data)eGet(UtilPackage.Literals.DATA_MAPPING__FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Data newFrom)
	{
		eSet(UtilPackage.Literals.DATA_MAPPING__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getTo()
	{
		return (Data)eGet(UtilPackage.Literals.DATA_MAPPING__TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Data newTo)
	{
		eSet(UtilPackage.Literals.DATA_MAPPING__TO, newTo);
	}

} //DataMappingImpl
