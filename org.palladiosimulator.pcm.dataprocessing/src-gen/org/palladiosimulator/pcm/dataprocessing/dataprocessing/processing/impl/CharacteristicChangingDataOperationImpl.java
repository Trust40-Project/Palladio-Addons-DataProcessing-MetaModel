/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Characteristic;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicType;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangeOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangingDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristic Changing Data Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.CharacteristicChangingDataOperationImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.CharacteristicChangingDataOperationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.CharacteristicChangingDataOperationImpl#getCharacteristic <em>Characteristic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacteristicChangingDataOperationImpl<T extends CharacteristicType> extends DataOperationImpl implements CharacteristicChangingDataOperation<T>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicChangingDataOperationImpl()
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
		return ProcessingPackage.Literals.CHARACTERISTIC_CHANGING_DATA_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getData()
	{
		return (Data)eGet(ProcessingPackage.Literals.CHARACTERISTIC_CHANGING_DATA_OPERATION__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Data newData)
	{
		eSet(ProcessingPackage.Literals.CHARACTERISTIC_CHANGING_DATA_OPERATION__DATA, newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicChangeOperation getOperation()
	{
		return (CharacteristicChangeOperation)eGet(ProcessingPackage.Literals.CHARACTERISTIC_CHANGING_DATA_OPERATION__OPERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(CharacteristicChangeOperation newOperation)
	{
		eSet(ProcessingPackage.Literals.CHARACTERISTIC_CHANGING_DATA_OPERATION__OPERATION, newOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characteristic getCharacteristic()
	{
		return (Characteristic)eGet(ProcessingPackage.Literals.CHARACTERISTIC_CHANGING_DATA_OPERATION__CHARACTERISTIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacteristic(Characteristic newCharacteristic)
	{
		eSet(ProcessingPackage.Literals.CHARACTERISTIC_CHANGING_DATA_OPERATION__CHARACTERISTIC, newCharacteristic);
	}

} //CharacteristicChangingDataOperationImpl
