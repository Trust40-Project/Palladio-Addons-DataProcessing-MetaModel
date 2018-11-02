/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage
 * @generated
 */
public interface EffectspecificationFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EffectspecificationFactory eINSTANCE = org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Processing Effect Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Effect Specification</em>'.
	 * @generated
	 */
	ProcessingEffectSpecification createProcessingEffectSpecification();

	/**
	 * Returns a new object of class '<em>Processing Effect Operation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Effect Operation Type</em>'.
	 * @generated
	 */
	ProcessingEffectOperationType createProcessingEffectOperationType();

	/**
	 * Returns a new object of class '<em>Operation Type Data Processing Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Type Data Processing Effect</em>'.
	 * @generated
	 */
	OperationTypeDataProcessingEffect createOperationTypeDataProcessingEffect();

	/**
	 * Returns a new object of class '<em>Characteristic Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characteristic Change</em>'.
	 * @generated
	 */
	CharacteristicChange createCharacteristicChange();

	/**
	 * Returns a new object of class '<em>Direct Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Characteristic</em>'.
	 * @generated
	 */
	DirectCharacteristic createDirectCharacteristic();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EffectspecificationPackage getEffectspecificationPackage();

} //EffectspecificationFactory
