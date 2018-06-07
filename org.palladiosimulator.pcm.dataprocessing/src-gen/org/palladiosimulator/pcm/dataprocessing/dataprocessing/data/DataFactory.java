/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage
 * @generated
 */
public interface DataFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataFactory eINSTANCE = org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Original Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Original Data</em>'.
	 * @generated
	 */
	OriginalData createOriginalData();

	/**
	 * Returns a new object of class '<em>Parameter Based Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Based Data</em>'.
	 * @generated
	 */
	ParameterBasedData createParameterBasedData();

	/**
	 * Returns a new object of class '<em>Result Based Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Based Data</em>'.
	 * @generated
	 */
	ResultBasedData createResultBasedData();

	/**
	 * Returns a new object of class '<em>Derived Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Data</em>'.
	 * @generated
	 */
	DerivedData createDerivedData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataPackage getDataPackage();

} //DataFactory
