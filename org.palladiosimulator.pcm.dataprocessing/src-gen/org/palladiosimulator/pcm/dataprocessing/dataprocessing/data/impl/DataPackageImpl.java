/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.CharacteristicsPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.CopiedData;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DerivedData;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.OriginalData;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ParameterBasedData;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.RefinedParameterBasedData;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.RefinedResultBasedData;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataprocessingPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.RepositoryPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.RepositoryPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.UtilPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.impl.UtilPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataPackageImpl extends EPackageImpl implements DataPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass originalDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterBasedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultBasedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinedResultBasedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinedParameterBasedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copiedDataEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataPackageImpl()
	{
		super(eNS_URI, DataFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataPackage init()
	{
		if (isInited) return (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataPackageImpl theDataPackage = registeredDataPackage instanceof DataPackageImpl ? (DataPackageImpl)registeredDataPackage : new DataPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataprocessingPackage.eNS_URI);
		DataprocessingPackageImpl theDataprocessingPackage = (DataprocessingPackageImpl)(registeredPackage instanceof DataprocessingPackageImpl ? registeredPackage : DataprocessingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(registeredPackage instanceof RepositoryPackageImpl ? registeredPackage : RepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProcessingPackage.eNS_URI);
		ProcessingPackageImpl theProcessingPackage = (ProcessingPackageImpl)(registeredPackage instanceof ProcessingPackageImpl ? registeredPackage : ProcessingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CharacteristicsPackage.eNS_URI);
		CharacteristicsPackageImpl theCharacteristicsPackage = (CharacteristicsPackageImpl)(registeredPackage instanceof CharacteristicsPackageImpl ? registeredPackage : CharacteristicsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(registeredPackage instanceof UtilPackageImpl ? registeredPackage : UtilPackage.eINSTANCE);

		// Create package meta-data objects
		theDataPackage.createPackageContents();
		theDataprocessingPackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theProcessingPackage.createPackageContents();
		theCharacteristicsPackage.createPackageContents();
		theUtilPackage.createPackageContents();

		// Initialize created meta-data
		theDataPackage.initializePackageContents();
		theDataprocessingPackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theProcessingPackage.initializePackageContents();
		theCharacteristicsPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataPackage.eNS_URI, theDataPackage);
		return theDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData()
	{
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Type()
	{
		return (EReference)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOriginalData()
	{
		return originalDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOriginalData_OriginalType()
	{
		return (EReference)originalDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterBasedData()
	{
		return parameterBasedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterBasedData_Parameter()
	{
		return (EReference)parameterBasedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultBasedData()
	{
		return resultBasedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultBasedData_Operation()
	{
		return (EReference)resultBasedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedData()
	{
		return derivedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedData_Sources()
	{
		return (EReference)derivedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedData_ResultingDataType()
	{
		return (EReference)derivedDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinedResultBasedData()
	{
		return refinedResultBasedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinedResultBasedData_RefiningDataType()
	{
		return (EReference)refinedResultBasedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinedParameterBasedData()
	{
		return refinedParameterBasedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinedParameterBasedData_RefiningDataType()
	{
		return (EReference)refinedParameterBasedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopiedData()
	{
		return copiedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCopiedData_Source()
	{
		return (EReference)copiedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFactory getDataFactory()
	{
		return (DataFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__TYPE);

		originalDataEClass = createEClass(ORIGINAL_DATA);
		createEReference(originalDataEClass, ORIGINAL_DATA__ORIGINAL_TYPE);

		parameterBasedDataEClass = createEClass(PARAMETER_BASED_DATA);
		createEReference(parameterBasedDataEClass, PARAMETER_BASED_DATA__PARAMETER);

		resultBasedDataEClass = createEClass(RESULT_BASED_DATA);
		createEReference(resultBasedDataEClass, RESULT_BASED_DATA__OPERATION);

		derivedDataEClass = createEClass(DERIVED_DATA);
		createEReference(derivedDataEClass, DERIVED_DATA__SOURCES);
		createEReference(derivedDataEClass, DERIVED_DATA__RESULTING_DATA_TYPE);

		refinedResultBasedDataEClass = createEClass(REFINED_RESULT_BASED_DATA);
		createEReference(refinedResultBasedDataEClass, REFINED_RESULT_BASED_DATA__REFINING_DATA_TYPE);

		refinedParameterBasedDataEClass = createEClass(REFINED_PARAMETER_BASED_DATA);
		createEReference(refinedParameterBasedDataEClass, REFINED_PARAMETER_BASED_DATA__REFINING_DATA_TYPE);

		copiedDataEClass = createEClass(COPIED_DATA);
		createEReference(copiedDataEClass, COPIED_DATA__SOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		org.palladiosimulator.pcm.repository.RepositoryPackage theRepositoryPackage_1 = (org.palladiosimulator.pcm.repository.RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(org.palladiosimulator.pcm.repository.RepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataEClass.getESuperTypes().add(theEntityPackage.getEntity());
		originalDataEClass.getESuperTypes().add(this.getData());
		parameterBasedDataEClass.getESuperTypes().add(this.getData());
		resultBasedDataEClass.getESuperTypes().add(this.getData());
		derivedDataEClass.getESuperTypes().add(this.getData());
		refinedResultBasedDataEClass.getESuperTypes().add(this.getResultBasedData());
		refinedParameterBasedDataEClass.getESuperTypes().add(this.getParameterBasedData());
		copiedDataEClass.getESuperTypes().add(this.getData());

		// Initialize classes and features; add operations and parameters
		initEClass(dataEClass, Data.class, "Data", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_Type(), theRepositoryPackage_1.getDataType(), null, "type", null, 1, 1, Data.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(dataEClass, theRepositoryPackage_1.getDataType(), "determineDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(originalDataEClass, OriginalData.class, "OriginalData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOriginalData_OriginalType(), theRepositoryPackage_1.getDataType(), null, "originalType", null, 1, 1, OriginalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(originalDataEClass, theRepositoryPackage_1.getDataType(), "determineDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterBasedDataEClass, ParameterBasedData.class, "ParameterBasedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterBasedData_Parameter(), theRepositoryPackage_1.getParameter(), null, "parameter", null, 1, 1, ParameterBasedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(parameterBasedDataEClass, theRepositoryPackage_1.getDataType(), "determineDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resultBasedDataEClass, ResultBasedData.class, "ResultBasedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultBasedData_Operation(), theRepositoryPackage_1.getOperationSignature(), null, "operation", null, 1, 1, ResultBasedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(resultBasedDataEClass, theRepositoryPackage_1.getDataType(), "determineDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(derivedDataEClass, DerivedData.class, "DerivedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedData_Sources(), this.getData(), null, "sources", null, 1, -1, DerivedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivedData_ResultingDataType(), theRepositoryPackage_1.getDataType(), null, "resultingDataType", null, 1, 1, DerivedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(derivedDataEClass, theRepositoryPackage_1.getDataType(), "determineDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(refinedResultBasedDataEClass, RefinedResultBasedData.class, "RefinedResultBasedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinedResultBasedData_RefiningDataType(), theRepositoryPackage_1.getDataType(), null, "refiningDataType", null, 1, 1, RefinedResultBasedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(refinedResultBasedDataEClass, theRepositoryPackage_1.getDataType(), "determineDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(refinedParameterBasedDataEClass, RefinedParameterBasedData.class, "RefinedParameterBasedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinedParameterBasedData_RefiningDataType(), theRepositoryPackage_1.getDataType(), null, "refiningDataType", null, 1, 1, RefinedParameterBasedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(refinedParameterBasedDataEClass, theRepositoryPackage_1.getDataType(), "determineDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(copiedDataEClass, CopiedData.class, "CopiedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCopiedData_Source(), this.getData(), null, "source", null, 1, 1, CopiedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(copiedDataEClass, theRepositoryPackage_1.getDataType(), "determineDataType", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations()
	{
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations()
	{
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (dataEClass.getEOperations().get(0),
		   source,
		   new String[]
		   {
			   "body", "null"
		   });
		addAnnotation
		  (getData_Type(),
		   source,
		   new String[]
		   {
			   "derivation", "determineDataType()"
		   });
		addAnnotation
		  (originalDataEClass.getEOperations().get(0),
		   source,
		   new String[]
		   {
			   "body", "originalType"
		   });
		addAnnotation
		  (parameterBasedDataEClass.getEOperations().get(0),
		   source,
		   new String[]
		   {
			   "body", "parameter.dataType__Parameter"
		   });
		addAnnotation
		  (resultBasedDataEClass.getEOperations().get(0),
		   source,
		   new String[]
		   {
			   "body", "operation.returnType__OperationSignature"
		   });
		addAnnotation
		  (derivedDataEClass.getEOperations().get(0),
		   source,
		   new String[]
		   {
			   "body", "resultingDataType"
		   });
		addAnnotation
		  (refinedResultBasedDataEClass.getEOperations().get(0),
		   source,
		   new String[]
		   {
			   "body", "refiningDataType"
		   });
		addAnnotation
		  (refinedParameterBasedDataEClass.getEOperations().get(0),
		   source,
		   new String[]
		   {
			   "body", "refiningDataType"
		   });
		addAnnotation
		  (copiedDataEClass.getEOperations().get(0),
		   source,
		   new String[]
		   {
			   "body", "source.type"
		   });
	}

} //DataPackageImpl
