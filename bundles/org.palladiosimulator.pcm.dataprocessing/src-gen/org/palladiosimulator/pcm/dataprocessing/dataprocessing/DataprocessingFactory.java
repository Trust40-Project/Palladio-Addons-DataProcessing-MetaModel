/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage
 * @generated
 */
public interface DataprocessingFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataprocessingFactory eINSTANCE = org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataprocessingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Specification</em>'.
	 * @generated
	 */
	DataSpecification createDataSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataprocessingPackage getDataprocessingPackage();

} //DataprocessingFactory
