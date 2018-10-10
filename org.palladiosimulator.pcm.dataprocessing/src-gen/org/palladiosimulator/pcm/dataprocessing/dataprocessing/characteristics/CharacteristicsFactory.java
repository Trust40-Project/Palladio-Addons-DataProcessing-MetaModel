/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage
 * @generated
 */
public interface CharacteristicsFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CharacteristicsFactory eINSTANCE = org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.CharacteristicsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Characteristic Type Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characteristic Type Container</em>'.
	 * @generated
	 */
	CharacteristicTypeContainer createCharacteristicTypeContainer();

	/**
	 * Returns a new object of class '<em>Enum Characteristic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Characteristic Type</em>'.
	 * @generated
	 */
	EnumCharacteristicType createEnumCharacteristicType();

	/**
	 * Returns a new object of class '<em>Enum Characteristic Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Characteristic Literal</em>'.
	 * @generated
	 */
	EnumCharacteristicLiteral createEnumCharacteristicLiteral();

	/**
	 * Returns a new object of class '<em>Characteristic Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characteristic Container</em>'.
	 * @generated
	 */
	CharacteristicContainer createCharacteristicContainer();

	/**
	 * Returns a new object of class '<em>Enum Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Characteristic</em>'.
	 * @generated
	 */
	EnumCharacteristic createEnumCharacteristic();

	/**
	 * Returns a new object of class '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration</em>'.
	 * @generated
	 */
	Enumeration createEnumeration();

	/**
	 * Returns a new object of class '<em>Related Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Characteristics</em>'.
	 * @generated
	 */
	RelatedCharacteristics createRelatedCharacteristics();

	/**
	 * Returns a new object of class '<em>Store Characteristic Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Store Characteristic Container</em>'.
	 * @generated
	 */
	StoreCharacteristicContainer createStoreCharacteristicContainer();

	/**
	 * Returns a new object of class '<em>Store Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Store Characteristics</em>'.
	 * @generated
	 */
	StoreCharacteristics createStoreCharacteristics();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CharacteristicsPackage getCharacteristicsPackage();

} //CharacteristicsFactory
