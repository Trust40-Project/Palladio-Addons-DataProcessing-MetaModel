/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DataPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palladiosimulator.org/pcm/dataprocessing/data/0.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl#getData()
	 * @generated
	 */
	int DATA = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TYPE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.OriginalDataImpl <em>Original Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.OriginalDataImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl#getOriginalData()
	 * @generated
	 */
	int ORIGINAL_DATA = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_DATA__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_DATA__ENTITY_NAME = DATA__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_DATA__TYPE = DATA__TYPE;

	/**
	 * The feature id for the '<em><b>Original Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_DATA__ORIGINAL_TYPE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Original Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.ParameterBasedDataImpl <em>Parameter Based Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.ParameterBasedDataImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl#getParameterBasedData()
	 * @generated
	 */
	int PARAMETER_BASED_DATA = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASED_DATA__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASED_DATA__ENTITY_NAME = DATA__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASED_DATA__TYPE = DATA__TYPE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASED_DATA__PARAMETER = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Based Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASED_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.ResultBasedDataImpl <em>Result Based Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.ResultBasedDataImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl#getResultBasedData()
	 * @generated
	 */
	int RESULT_BASED_DATA = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_BASED_DATA__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_BASED_DATA__ENTITY_NAME = DATA__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_BASED_DATA__TYPE = DATA__TYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_BASED_DATA__OPERATION = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Result Based Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_BASED_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DerivedDataImpl <em>Derived Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DerivedDataImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl#getDerivedData()
	 * @generated
	 */
	int DERIVED_DATA = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_DATA__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_DATA__ENTITY_NAME = DATA__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_DATA__TYPE = DATA__TYPE;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_DATA__SOURCES = DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resulting Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_DATA__RESULTING_DATA_TYPE = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Derived Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.RefinedResultBasedDataImpl <em>Refined Result Based Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.RefinedResultBasedDataImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl#getRefinedResultBasedData()
	 * @generated
	 */
	int REFINED_RESULT_BASED_DATA = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_RESULT_BASED_DATA__ID = RESULT_BASED_DATA__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_RESULT_BASED_DATA__ENTITY_NAME = RESULT_BASED_DATA__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_RESULT_BASED_DATA__TYPE = RESULT_BASED_DATA__TYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_RESULT_BASED_DATA__OPERATION = RESULT_BASED_DATA__OPERATION;

	/**
	 * The feature id for the '<em><b>Refining Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_RESULT_BASED_DATA__REFINING_DATA_TYPE = RESULT_BASED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Refined Result Based Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_RESULT_BASED_DATA_FEATURE_COUNT = RESULT_BASED_DATA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.RefinedParameterBasedDataImpl <em>Refined Parameter Based Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.RefinedParameterBasedDataImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl#getRefinedParameterBasedData()
	 * @generated
	 */
	int REFINED_PARAMETER_BASED_DATA = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_PARAMETER_BASED_DATA__ID = PARAMETER_BASED_DATA__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_PARAMETER_BASED_DATA__ENTITY_NAME = PARAMETER_BASED_DATA__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_PARAMETER_BASED_DATA__TYPE = PARAMETER_BASED_DATA__TYPE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_PARAMETER_BASED_DATA__PARAMETER = PARAMETER_BASED_DATA__PARAMETER;

	/**
	 * The feature id for the '<em><b>Refining Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_PARAMETER_BASED_DATA__REFINING_DATA_TYPE = PARAMETER_BASED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Refined Parameter Based Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_PARAMETER_BASED_DATA_FEATURE_COUNT = PARAMETER_BASED_DATA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.CopiedDataImpl <em>Copied Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.CopiedDataImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl#getCopiedData()
	 * @generated
	 */
	int COPIED_DATA = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIED_DATA__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIED_DATA__ENTITY_NAME = DATA__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIED_DATA__TYPE = DATA__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIED_DATA__SOURCE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Copied Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIED_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data#getType()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Type();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.OriginalData <em>Original Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Original Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.OriginalData
	 * @generated
	 */
	EClass getOriginalData();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.OriginalData#getOriginalType <em>Original Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Type</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.OriginalData#getOriginalType()
	 * @see #getOriginalData()
	 * @generated
	 */
	EReference getOriginalData_OriginalType();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ParameterBasedData <em>Parameter Based Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Based Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ParameterBasedData
	 * @generated
	 */
	EClass getParameterBasedData();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ParameterBasedData#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ParameterBasedData#getParameter()
	 * @see #getParameterBasedData()
	 * @generated
	 */
	EReference getParameterBasedData_Parameter();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData <em>Result Based Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Based Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData
	 * @generated
	 */
	EClass getResultBasedData();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData#getOperation()
	 * @see #getResultBasedData()
	 * @generated
	 */
	EReference getResultBasedData_Operation();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DerivedData <em>Derived Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DerivedData
	 * @generated
	 */
	EClass getDerivedData();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DerivedData#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sources</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DerivedData#getSources()
	 * @see #getDerivedData()
	 * @generated
	 */
	EReference getDerivedData_Sources();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DerivedData#getResultingDataType <em>Resulting Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resulting Data Type</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DerivedData#getResultingDataType()
	 * @see #getDerivedData()
	 * @generated
	 */
	EReference getDerivedData_ResultingDataType();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.RefinedResultBasedData <em>Refined Result Based Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refined Result Based Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.RefinedResultBasedData
	 * @generated
	 */
	EClass getRefinedResultBasedData();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.RefinedResultBasedData#getRefiningDataType <em>Refining Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refining Data Type</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.RefinedResultBasedData#getRefiningDataType()
	 * @see #getRefinedResultBasedData()
	 * @generated
	 */
	EReference getRefinedResultBasedData_RefiningDataType();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.RefinedParameterBasedData <em>Refined Parameter Based Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refined Parameter Based Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.RefinedParameterBasedData
	 * @generated
	 */
	EClass getRefinedParameterBasedData();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.RefinedParameterBasedData#getRefiningDataType <em>Refining Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refining Data Type</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.RefinedParameterBasedData#getRefiningDataType()
	 * @see #getRefinedParameterBasedData()
	 * @generated
	 */
	EReference getRefinedParameterBasedData_RefiningDataType();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.CopiedData <em>Copied Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copied Data</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.CopiedData
	 * @generated
	 */
	EClass getCopiedData();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.CopiedData#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.CopiedData#getSource()
	 * @see #getCopiedData()
	 * @generated
	 */
	EReference getCopiedData_Source();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__TYPE = eINSTANCE.getData_Type();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.OriginalDataImpl <em>Original Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.OriginalDataImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl#getOriginalData()
		 * @generated
		 */
		EClass ORIGINAL_DATA = eINSTANCE.getOriginalData();

		/**
		 * The meta object literal for the '<em><b>Original Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORIGINAL_DATA__ORIGINAL_TYPE = eINSTANCE.getOriginalData_OriginalType();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.ParameterBasedDataImpl <em>Parameter Based Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.ParameterBasedDataImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl#getParameterBasedData()
		 * @generated
		 */
		EClass PARAMETER_BASED_DATA = eINSTANCE.getParameterBasedData();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BASED_DATA__PARAMETER = eINSTANCE.getParameterBasedData_Parameter();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.ResultBasedDataImpl <em>Result Based Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.ResultBasedDataImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl#getResultBasedData()
		 * @generated
		 */
		EClass RESULT_BASED_DATA = eINSTANCE.getResultBasedData();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_BASED_DATA__OPERATION = eINSTANCE.getResultBasedData_Operation();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DerivedDataImpl <em>Derived Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DerivedDataImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl#getDerivedData()
		 * @generated
		 */
		EClass DERIVED_DATA = eINSTANCE.getDerivedData();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_DATA__SOURCES = eINSTANCE.getDerivedData_Sources();

		/**
		 * The meta object literal for the '<em><b>Resulting Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_DATA__RESULTING_DATA_TYPE = eINSTANCE.getDerivedData_ResultingDataType();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.RefinedResultBasedDataImpl <em>Refined Result Based Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.RefinedResultBasedDataImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl#getRefinedResultBasedData()
		 * @generated
		 */
		EClass REFINED_RESULT_BASED_DATA = eINSTANCE.getRefinedResultBasedData();

		/**
		 * The meta object literal for the '<em><b>Refining Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINED_RESULT_BASED_DATA__REFINING_DATA_TYPE = eINSTANCE.getRefinedResultBasedData_RefiningDataType();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.RefinedParameterBasedDataImpl <em>Refined Parameter Based Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.RefinedParameterBasedDataImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl#getRefinedParameterBasedData()
		 * @generated
		 */
		EClass REFINED_PARAMETER_BASED_DATA = eINSTANCE.getRefinedParameterBasedData();

		/**
		 * The meta object literal for the '<em><b>Refining Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINED_PARAMETER_BASED_DATA__REFINING_DATA_TYPE = eINSTANCE.getRefinedParameterBasedData_RefiningDataType();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.CopiedDataImpl <em>Copied Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.CopiedDataImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl#getCopiedData()
		 * @generated
		 */
		EClass COPIED_DATA = eINSTANCE.getCopiedData();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPIED_DATA__SOURCE = eINSTANCE.getCopiedData_Source();

	}

} //DataPackage
