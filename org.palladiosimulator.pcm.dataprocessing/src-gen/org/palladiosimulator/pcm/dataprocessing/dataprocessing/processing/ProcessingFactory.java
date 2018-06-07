/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing;

import org.eclipse.emf.ecore.EFactory;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage
 * @generated
 */
public interface ProcessingFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessingFactory eINSTANCE = org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Processing Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Processing Container</em>'.
	 * @generated
	 */
	DataProcessingContainer createDataProcessingContainer();

	/**
	 * Returns a new object of class '<em>Create Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Data Operation</em>'.
	 * @generated
	 */
	CreateDataOperation createCreateDataOperation();

	/**
	 * Returns a new object of class '<em>Load Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Data Operation</em>'.
	 * @generated
	 */
	LoadDataOperation createLoadDataOperation();

	/**
	 * Returns a new object of class '<em>Load All Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load All Data Operation</em>'.
	 * @generated
	 */
	LoadAllDataOperation createLoadAllDataOperation();

	/**
	 * Returns a new object of class '<em>Perform Data Transmission Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perform Data Transmission Operation</em>'.
	 * @generated
	 */
	PerformDataTransmissionOperation createPerformDataTransmissionOperation();

	/**
	 * Returns a new object of class '<em>Store Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Store Data Operation</em>'.
	 * @generated
	 */
	StoreDataOperation createStoreDataOperation();

	/**
	 * Returns a new object of class '<em>Return Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Data Operation</em>'.
	 * @generated
	 */
	ReturnDataOperation createReturnDataOperation();

	/**
	 * Returns a new object of class '<em>Data Parameter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Parameter Mapping</em>'.
	 * @generated
	 */
	DataParameterMapping createDataParameterMapping();

	/**
	 * Returns a new object of class '<em>Data Result Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Result Mapping</em>'.
	 * @generated
	 */
	DataResultMapping createDataResultMapping();

	/**
	 * Returns a new object of class '<em>Join Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Data Operation</em>'.
	 * @generated
	 */
	JoinDataOperation createJoinDataOperation();

	/**
	 * Returns a new object of class '<em>Union Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Data Operation</em>'.
	 * @generated
	 */
	UnionDataOperation createUnionDataOperation();

	/**
	 * Returns a new object of class '<em>Projection Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Projection Data Operation</em>'.
	 * @generated
	 */
	ProjectionDataOperation createProjectionDataOperation();

	/**
	 * Returns a new object of class '<em>Selection Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Data Operation</em>'.
	 * @generated
	 */
	SelectionDataOperation createSelectionDataOperation();

	/**
	 * Returns a new object of class '<em>Characteristic Changing Data Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characteristic Changing Data Operation</em>'.
	 * @generated
	 */
	<T extends CharacteristicType> CharacteristicChangingDataOperation<T> createCharacteristicChangingDataOperation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProcessingPackage getProcessingPackage();

} //ProcessingFactory
