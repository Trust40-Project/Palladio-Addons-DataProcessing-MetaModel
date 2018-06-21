/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.CharacteristicsPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.ProcessingPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.RepositoryPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.impl.RepositoryPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.SeffPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.seff.impl.SeffPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataprocessingPackageImpl extends EPackageImpl implements DataprocessingPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSpecificationEClass = null;

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
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataprocessingPackageImpl()
	{
		super(eNS_URI, DataprocessingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataprocessingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataprocessingPackage init()
	{
		if (isInited) return (DataprocessingPackage)EPackage.Registry.INSTANCE.getEPackage(DataprocessingPackage.eNS_URI);

		// Obtain or create and register package
		DataprocessingPackageImpl theDataprocessingPackage = (DataprocessingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataprocessingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataprocessingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) instanceof RepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) : RepositoryPackage.eINSTANCE);
		ProcessingPackageImpl theProcessingPackage = (ProcessingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessingPackage.eNS_URI) instanceof ProcessingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessingPackage.eNS_URI) : ProcessingPackage.eINSTANCE);
		CharacteristicsPackageImpl theCharacteristicsPackage = (CharacteristicsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CharacteristicsPackage.eNS_URI) instanceof CharacteristicsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CharacteristicsPackage.eNS_URI) : CharacteristicsPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		SeffPackageImpl theSeffPackage = (SeffPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI) instanceof SeffPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI) : SeffPackage.eINSTANCE);

		// Create package meta-data objects
		theDataprocessingPackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theProcessingPackage.createPackageContents();
		theCharacteristicsPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theSeffPackage.createPackageContents();

		// Initialize created meta-data
		theDataprocessingPackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theProcessingPackage.initializePackageContents();
		theCharacteristicsPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theSeffPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataprocessingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataprocessingPackage.eNS_URI, theDataprocessingPackage);
		return theDataprocessingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSpecification()
	{
		return dataSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSpecification_DataProcessingContainers()
	{
		return (EReference)dataSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSpecification_CharacteristicTypeContainers()
	{
		return (EReference)dataSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSpecification_DataSEFFSpecifications()
	{
		return (EReference)dataSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSpecification_StoreContainers()
	{
		return (EReference)dataSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSpecification_CharacteristicContainer()
	{
		return (EReference)dataSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSpecification_RelatedCharacteristics()
	{
		return (EReference)dataSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataprocessingFactory getDataprocessingFactory()
	{
		return (DataprocessingFactory)getEFactoryInstance();
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
		dataSpecificationEClass = createEClass(DATA_SPECIFICATION);
		createEReference(dataSpecificationEClass, DATA_SPECIFICATION__DATA_PROCESSING_CONTAINERS);
		createEReference(dataSpecificationEClass, DATA_SPECIFICATION__CHARACTERISTIC_TYPE_CONTAINERS);
		createEReference(dataSpecificationEClass, DATA_SPECIFICATION__DATA_SEFF_SPECIFICATIONS);
		createEReference(dataSpecificationEClass, DATA_SPECIFICATION__STORE_CONTAINERS);
		createEReference(dataSpecificationEClass, DATA_SPECIFICATION__CHARACTERISTIC_CONTAINER);
		createEReference(dataSpecificationEClass, DATA_SPECIFICATION__RELATED_CHARACTERISTICS);
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
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		ProcessingPackage theProcessingPackage = (ProcessingPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessingPackage.eNS_URI);
		CharacteristicsPackage theCharacteristicsPackage = (CharacteristicsPackage)EPackage.Registry.INSTANCE.getEPackage(CharacteristicsPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		SeffPackage theSeffPackage = (SeffPackage)EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRepositoryPackage);
		getESubpackages().add(theProcessingPackage);
		getESubpackages().add(theCharacteristicsPackage);
		getESubpackages().add(theDataPackage);
		getESubpackages().add(theSeffPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(dataSpecificationEClass, DataSpecification.class, "DataSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSpecification_DataProcessingContainers(), theProcessingPackage.getDataProcessingContainer(), null, "dataProcessingContainers", null, 0, -1, DataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpecification_CharacteristicTypeContainers(), theCharacteristicsPackage.getCharacteristicTypeContainer(), null, "characteristicTypeContainers", null, 0, -1, DataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpecification_DataSEFFSpecifications(), theSeffPackage.getDataSEFFSpecification(), null, "dataSEFFSpecifications", null, 0, -1, DataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpecification_StoreContainers(), theRepositoryPackage.getStoreContainer(), null, "storeContainers", null, 0, -1, DataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpecification_CharacteristicContainer(), theCharacteristicsPackage.getCharacteristicContainer(), null, "characteristicContainer", null, 0, -1, DataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpecification_RelatedCharacteristics(), theCharacteristicsPackage.getRelatedCharacteristics(), null, "relatedCharacteristics", null, 0, -1, DataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "entity", "../../org.palladiosimulator.pcm/model/pcm.ecore#//core/entity",
			 "identifier", "../../../plugin/de.uka.ipd.sdq.identifier/model/identifier.ecore#/",
			 "repository_1", "../../org.palladiosimulator.pcm/model/pcm.ecore#//repository",
			 "seff_1", "../../org.palladiosimulator.pcm/model/pcm.ecore#//seff"
		   });
	}

} //DataprocessingPackageImpl
