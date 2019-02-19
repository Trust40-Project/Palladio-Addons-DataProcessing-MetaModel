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
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecificationExtension;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.CharacteristicsPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl;

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
public class DataprocessingPackageImpl extends EPackageImpl implements DataprocessingPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSpecificationExtensionEClass = null;

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
		Object registeredDataprocessingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataprocessingPackageImpl theDataprocessingPackage = registeredDataprocessingPackage instanceof DataprocessingPackageImpl ? (DataprocessingPackageImpl)registeredDataprocessingPackage : new DataprocessingPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(registeredPackage instanceof RepositoryPackageImpl ? registeredPackage : RepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProcessingPackage.eNS_URI);
		ProcessingPackageImpl theProcessingPackage = (ProcessingPackageImpl)(registeredPackage instanceof ProcessingPackageImpl ? registeredPackage : ProcessingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CharacteristicsPackage.eNS_URI);
		CharacteristicsPackageImpl theCharacteristicsPackage = (CharacteristicsPackageImpl)(registeredPackage instanceof CharacteristicsPackageImpl ? registeredPackage : CharacteristicsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		DataPackageImpl theDataPackage = (DataPackageImpl)(registeredPackage instanceof DataPackageImpl ? registeredPackage : DataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(registeredPackage instanceof UtilPackageImpl ? registeredPackage : UtilPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EffectspecificationPackage.eNS_URI);
		EffectspecificationPackageImpl theEffectspecificationPackage = (EffectspecificationPackageImpl)(registeredPackage instanceof EffectspecificationPackageImpl ? registeredPackage : EffectspecificationPackage.eINSTANCE);

		// Create package meta-data objects
		theDataprocessingPackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theProcessingPackage.createPackageContents();
		theCharacteristicsPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theEffectspecificationPackage.createPackageContents();

		// Initialize created meta-data
		theDataprocessingPackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theProcessingPackage.initializePackageContents();
		theCharacteristicsPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theEffectspecificationPackage.initializePackageContents();

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
	public EReference getDataSpecification_StoreContainers()
	{
		return (EReference)dataSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSpecification_CharacteristicContainer()
	{
		return (EReference)dataSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSpecification_RelatedCharacteristics()
	{
		return (EReference)dataSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSpecification_OperationSignatureDataRefinement()
	{
		return (EReference)dataSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSpecification_StoreCharacteristicContainers()
	{
		return (EReference)dataSpecificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSpecification_Extensions()
	{
		return (EReference)dataSpecificationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSpecification_ExternalDataProcessingEffects()
	{
		return (EReference)dataSpecificationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSpecificationExtension()
	{
		return dataSpecificationExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSpecificationExtension_Specification()
	{
		return (EReference)dataSpecificationExtensionEClass.getEStructuralFeatures().get(0);
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
		createEReference(dataSpecificationEClass, DATA_SPECIFICATION__STORE_CONTAINERS);
		createEReference(dataSpecificationEClass, DATA_SPECIFICATION__CHARACTERISTIC_CONTAINER);
		createEReference(dataSpecificationEClass, DATA_SPECIFICATION__RELATED_CHARACTERISTICS);
		createEReference(dataSpecificationEClass, DATA_SPECIFICATION__OPERATION_SIGNATURE_DATA_REFINEMENT);
		createEReference(dataSpecificationEClass, DATA_SPECIFICATION__STORE_CHARACTERISTIC_CONTAINERS);
		createEReference(dataSpecificationEClass, DATA_SPECIFICATION__EXTENSIONS);
		createEReference(dataSpecificationEClass, DATA_SPECIFICATION__EXTERNAL_DATA_PROCESSING_EFFECTS);

		dataSpecificationExtensionEClass = createEClass(DATA_SPECIFICATION_EXTENSION);
		createEReference(dataSpecificationExtensionEClass, DATA_SPECIFICATION_EXTENSION__SPECIFICATION);
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
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		EffectspecificationPackage theEffectspecificationPackage = (EffectspecificationPackage)EPackage.Registry.INSTANCE.getEPackage(EffectspecificationPackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRepositoryPackage);
		getESubpackages().add(theProcessingPackage);
		getESubpackages().add(theCharacteristicsPackage);
		getESubpackages().add(theDataPackage);
		getESubpackages().add(theUtilPackage);
		getESubpackages().add(theEffectspecificationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataSpecificationEClass.getESuperTypes().add(theEffectspecificationPackage.getProcessingEffectProvider());
		dataSpecificationExtensionEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(dataSpecificationEClass, DataSpecification.class, "DataSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSpecification_DataProcessingContainers(), theProcessingPackage.getDataProcessingContainer(), null, "dataProcessingContainers", null, 0, -1, DataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpecification_CharacteristicTypeContainers(), theCharacteristicsPackage.getCharacteristicTypeContainer(), null, "characteristicTypeContainers", null, 0, -1, DataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpecification_StoreContainers(), theRepositoryPackage.getStoreContainer(), null, "storeContainers", null, 0, -1, DataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpecification_CharacteristicContainer(), theCharacteristicsPackage.getCharacteristicContainer(), null, "characteristicContainer", null, 0, -1, DataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpecification_RelatedCharacteristics(), theCharacteristicsPackage.getRelatedCharacteristics(), null, "relatedCharacteristics", null, 0, -1, DataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpecification_OperationSignatureDataRefinement(), theRepositoryPackage.getOperationSignatureDataRefinement(), null, "operationSignatureDataRefinement", null, 0, -1, DataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpecification_StoreCharacteristicContainers(), theCharacteristicsPackage.getStoreCharacteristicContainer(), null, "storeCharacteristicContainers", null, 0, -1, DataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpecification_Extensions(), this.getDataSpecificationExtension(), this.getDataSpecificationExtension_Specification(), "extensions", null, 0, -1, DataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSpecification_ExternalDataProcessingEffects(), theEffectspecificationPackage.getProcessingEffectSpecification(), null, "externalDataProcessingEffects", null, 0, -1, DataSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(dataSpecificationEClass, theEffectspecificationPackage.getProcessingEffect(), "determineProcessingEffects", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(dataSpecificationExtensionEClass, DataSpecificationExtension.class, "DataSpecificationExtension", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSpecificationExtension_Specification(), this.getDataSpecification(), this.getDataSpecification_Extensions(), "specification", null, 1, 1, DataSpecificationExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
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
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations()
	{
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation
		  (this,
		   source,
		   new String[]
		   {
			   "environmentFactoryClass", "org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DynamicDispatchEnablingEcoreEnvironmentFactory"
		   });
		addAnnotation
		  (dataSpecificationEClass.getEOperations().get(0),
		   source,
		   new String[]
		   {
			   "body", "externalDataProcessingEffects.processingEffects->asSet()->union(extensions->selectByKind(dataprocessing::effectspecification::ProcessingEffectSpecification).processingEffects->asSet())"
		   });
	}

} //DataprocessingPackageImpl
