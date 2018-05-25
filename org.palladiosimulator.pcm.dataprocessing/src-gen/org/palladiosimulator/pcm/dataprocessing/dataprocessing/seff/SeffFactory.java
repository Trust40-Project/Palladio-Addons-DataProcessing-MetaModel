/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.SeffPackage
 * @generated
 */
public interface SeffFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeffFactory eINSTANCE = org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.impl.SeffFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data SEFF Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data SEFF Specification</em>'.
	 * @generated
	 */
	DataSEFFSpecification createDataSEFFSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SeffPackage getSeffPackage();

} //SeffFactory
