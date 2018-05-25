/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicType;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicTypeContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Enumeration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristic Type Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.CharacteristicTypeContainerImpl#getCharacteristicTypes <em>Characteristic Types</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.CharacteristicTypeContainerImpl#getEnumerations <em>Enumerations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacteristicTypeContainerImpl extends IdentifierImpl implements CharacteristicTypeContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicTypeContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CharacteristicsPackage.Literals.CHARACTERISTIC_TYPE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CharacteristicType> getCharacteristicTypes() {
		return (EList<CharacteristicType>)eGet(CharacteristicsPackage.Literals.CHARACTERISTIC_TYPE_CONTAINER__CHARACTERISTIC_TYPES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Enumeration> getEnumerations() {
		return (EList<Enumeration>)eGet(CharacteristicsPackage.Literals.CHARACTERISTIC_TYPE_CONTAINER__ENUMERATIONS, true);
	}

} //CharacteristicTypeContainerImpl
