/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.CharacteristicsPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicSpecification;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.DataCreationProcessingEffect;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.DirectCharacteristic;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.OperationTypeDataProcessingEffect;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectOperationType;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectProvider;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectSpecification;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.util.EffectspecificationValidator;

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
public class EffectspecificationPackageImpl extends EPackageImpl implements EffectspecificationPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingEffectSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingEffectOperationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationTypeDataProcessingEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCreationProcessingEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingEffectProviderEClass = null;

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
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EffectspecificationPackageImpl()
	{
		super(eNS_URI, EffectspecificationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EffectspecificationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EffectspecificationPackage init()
	{
		if (isInited) return (EffectspecificationPackage)EPackage.Registry.INSTANCE.getEPackage(EffectspecificationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEffectspecificationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EffectspecificationPackageImpl theEffectspecificationPackage = registeredEffectspecificationPackage instanceof EffectspecificationPackageImpl ? (EffectspecificationPackageImpl)registeredEffectspecificationPackage : new EffectspecificationPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		DataPackageImpl theDataPackage = (DataPackageImpl)(registeredPackage instanceof DataPackageImpl ? registeredPackage : DataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(registeredPackage instanceof UtilPackageImpl ? registeredPackage : UtilPackage.eINSTANCE);

		// Create package meta-data objects
		theEffectspecificationPackage.createPackageContents();
		theDataprocessingPackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theProcessingPackage.createPackageContents();
		theCharacteristicsPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theUtilPackage.createPackageContents();

		// Initialize created meta-data
		theEffectspecificationPackage.initializePackageContents();
		theDataprocessingPackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theProcessingPackage.initializePackageContents();
		theCharacteristicsPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEffectspecificationPackage,
			 new EValidator.Descriptor()
			 {
				 public EValidator getEValidator()
				 {
					 return EffectspecificationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEffectspecificationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EffectspecificationPackage.eNS_URI, theEffectspecificationPackage);
		return theEffectspecificationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingEffectSpecification()
	{
		return processingEffectSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingEffectSpecification_OperationTypes()
	{
		return (EReference)processingEffectSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingEffectSpecification_ProcessingEffects()
	{
		return (EReference)processingEffectSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingEffectOperationType()
	{
		return processingEffectOperationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingEffect()
	{
		return processingEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingEffect_FromDataType()
	{
		return (EReference)processingEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingEffect_ToDataType()
	{
		return (EReference)processingEffectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingEffect_CharacteristicChanges()
	{
		return (EReference)processingEffectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationTypeDataProcessingEffect()
	{
		return operationTypeDataProcessingEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationTypeDataProcessingEffect_RelevantOperationTypes()
	{
		return (EReference)operationTypeDataProcessingEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCreationProcessingEffect()
	{
		return dataCreationProcessingEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristicChange()
	{
		return characteristicChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristicChange_ChangeOperation()
	{
		return (EAttribute)characteristicChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristicChange_CharacteristicSpecifications()
	{
		return (EReference)characteristicChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristicChange_ProcessingEffect()
	{
		return (EReference)characteristicChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristicSpecification()
	{
		return characteristicSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristicSpecification_CharacteristicChange()
	{
		return (EReference)characteristicSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectCharacteristic()
	{
		return directCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectCharacteristic_Characteristic()
	{
		return (EReference)directCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingEffectProvider()
	{
		return processingEffectProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingEffectProvider_ProcessingEffects()
	{
		return (EReference)processingEffectProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectspecificationFactory getEffectspecificationFactory()
	{
		return (EffectspecificationFactory)getEFactoryInstance();
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
		processingEffectSpecificationEClass = createEClass(PROCESSING_EFFECT_SPECIFICATION);
		createEReference(processingEffectSpecificationEClass, PROCESSING_EFFECT_SPECIFICATION__OPERATION_TYPES);
		createEReference(processingEffectSpecificationEClass, PROCESSING_EFFECT_SPECIFICATION__PROCESSING_EFFECTS);

		processingEffectOperationTypeEClass = createEClass(PROCESSING_EFFECT_OPERATION_TYPE);

		processingEffectEClass = createEClass(PROCESSING_EFFECT);
		createEReference(processingEffectEClass, PROCESSING_EFFECT__FROM_DATA_TYPE);
		createEReference(processingEffectEClass, PROCESSING_EFFECT__TO_DATA_TYPE);
		createEReference(processingEffectEClass, PROCESSING_EFFECT__CHARACTERISTIC_CHANGES);

		operationTypeDataProcessingEffectEClass = createEClass(OPERATION_TYPE_DATA_PROCESSING_EFFECT);
		createEReference(operationTypeDataProcessingEffectEClass, OPERATION_TYPE_DATA_PROCESSING_EFFECT__RELEVANT_OPERATION_TYPES);

		dataCreationProcessingEffectEClass = createEClass(DATA_CREATION_PROCESSING_EFFECT);

		characteristicChangeEClass = createEClass(CHARACTERISTIC_CHANGE);
		createEAttribute(characteristicChangeEClass, CHARACTERISTIC_CHANGE__CHANGE_OPERATION);
		createEReference(characteristicChangeEClass, CHARACTERISTIC_CHANGE__CHARACTERISTIC_SPECIFICATIONS);
		createEReference(characteristicChangeEClass, CHARACTERISTIC_CHANGE__PROCESSING_EFFECT);

		characteristicSpecificationEClass = createEClass(CHARACTERISTIC_SPECIFICATION);
		createEReference(characteristicSpecificationEClass, CHARACTERISTIC_SPECIFICATION__CHARACTERISTIC_CHANGE);

		directCharacteristicEClass = createEClass(DIRECT_CHARACTERISTIC);
		createEReference(directCharacteristicEClass, DIRECT_CHARACTERISTIC__CHARACTERISTIC);

		processingEffectProviderEClass = createEClass(PROCESSING_EFFECT_PROVIDER);
		createEReference(processingEffectProviderEClass, PROCESSING_EFFECT_PROVIDER__PROCESSING_EFFECTS);
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
		DataprocessingPackage theDataprocessingPackage = (DataprocessingPackage)EPackage.Registry.INSTANCE.getEPackage(DataprocessingPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		org.palladiosimulator.pcm.repository.RepositoryPackage theRepositoryPackage_1 = (org.palladiosimulator.pcm.repository.RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(org.palladiosimulator.pcm.repository.RepositoryPackage.eNS_URI);
		ProcessingPackage theProcessingPackage = (ProcessingPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessingPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		CharacteristicsPackage theCharacteristicsPackage = (CharacteristicsPackage)EPackage.Registry.INSTANCE.getEPackage(CharacteristicsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		processingEffectSpecificationEClass.getESuperTypes().add(theDataprocessingPackage.getDataSpecificationExtension());
		processingEffectOperationTypeEClass.getESuperTypes().add(theEntityPackage.getEntity());
		processingEffectEClass.getESuperTypes().add(theEntityPackage.getEntity());
		operationTypeDataProcessingEffectEClass.getESuperTypes().add(this.getProcessingEffect());
		dataCreationProcessingEffectEClass.getESuperTypes().add(this.getProcessingEffect());
		characteristicChangeEClass.getESuperTypes().add(theEntityPackage.getEntity());
		characteristicSpecificationEClass.getESuperTypes().add(theEntityPackage.getEntity());
		directCharacteristicEClass.getESuperTypes().add(this.getCharacteristicSpecification());

		// Initialize classes and features; add operations and parameters
		initEClass(processingEffectSpecificationEClass, ProcessingEffectSpecification.class, "ProcessingEffectSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessingEffectSpecification_OperationTypes(), this.getProcessingEffectOperationType(), null, "operationTypes", null, 0, -1, ProcessingEffectSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingEffectSpecification_ProcessingEffects(), this.getProcessingEffect(), null, "processingEffects", null, 0, -1, ProcessingEffectSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingEffectOperationTypeEClass, ProcessingEffectOperationType.class, "ProcessingEffectOperationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processingEffectEClass, ProcessingEffect.class, "ProcessingEffect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessingEffect_FromDataType(), theRepositoryPackage_1.getDataType(), null, "fromDataType", null, 0, 1, ProcessingEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingEffect_ToDataType(), theRepositoryPackage_1.getDataType(), null, "toDataType", null, 0, 1, ProcessingEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingEffect_CharacteristicChanges(), this.getCharacteristicChange(), this.getCharacteristicChange_ProcessingEffect(), "characteristicChanges", null, 0, -1, ProcessingEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(processingEffectEClass, ecorePackage.getEBoolean(), "isApplicableTo", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theProcessingPackage.getDataOperation(), "operation", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getData(), "resultData", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(operationTypeDataProcessingEffectEClass, OperationTypeDataProcessingEffect.class, "OperationTypeDataProcessingEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationTypeDataProcessingEffect_RelevantOperationTypes(), this.getProcessingEffectOperationType(), null, "relevantOperationTypes", null, 1, -1, OperationTypeDataProcessingEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(operationTypeDataProcessingEffectEClass, ecorePackage.getEBoolean(), "isApplicableTo", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theProcessingPackage.getDataOperation(), "operation", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getData(), "resultData", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataCreationProcessingEffectEClass, DataCreationProcessingEffect.class, "DataCreationProcessingEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dataCreationProcessingEffectEClass, ecorePackage.getEBoolean(), "isApplicableTo", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theProcessingPackage.getDataOperation(), "operation", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getData(), "resultData", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(characteristicChangeEClass, CharacteristicChange.class, "CharacteristicChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacteristicChange_ChangeOperation(), theProcessingPackage.getCharacteristicChangeOperation(), "changeOperation", null, 1, 1, CharacteristicChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacteristicChange_CharacteristicSpecifications(), this.getCharacteristicSpecification(), this.getCharacteristicSpecification_CharacteristicChange(), "characteristicSpecifications", null, 0, -1, CharacteristicChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacteristicChange_ProcessingEffect(), this.getProcessingEffect(), this.getProcessingEffect_CharacteristicChanges(), "processingEffect", null, 0, 1, CharacteristicChange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characteristicSpecificationEClass, CharacteristicSpecification.class, "CharacteristicSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacteristicSpecification_CharacteristicChange(), this.getCharacteristicChange(), this.getCharacteristicChange_CharacteristicSpecifications(), "characteristicChange", null, 0, 1, CharacteristicSpecification.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directCharacteristicEClass, DirectCharacteristic.class, "DirectCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectCharacteristic_Characteristic(), theCharacteristicsPackage.getCharacteristic(), null, "characteristic", null, 1, 1, DirectCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingEffectProviderEClass, ProcessingEffectProvider.class, "ProcessingEffectProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessingEffectProvider_ProcessingEffects(), this.getProcessingEffect(), null, "processingEffects", null, 0, -1, ProcessingEffectProvider.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		addEOperation(processingEffectProviderEClass, this.getProcessingEffect(), "determineProcessingEffects", 0, -1, IS_UNIQUE, !IS_ORDERED);

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
		addAnnotation
		  (dataCreationProcessingEffectEClass,
		   source,
		   new String[]
		   {
			   "constraints", "fromDataTypeHasToBeUndefined"
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
		  (processingEffectEClass.getEOperations().get(0),
		   source,
		   new String[]
		   {
			   "body", "false"
		   });
		addAnnotation
		  (operationTypeDataProcessingEffectEClass.getEOperations().get(0),
		   source,
		   new String[]
		   {
			   "body", "operation.oclIsKindOf(processing::ProcessingEffectOperationTypeSpecifyingOperation) and \nrelevantOperationTypes->includes(operation.oclAsType(processing::ProcessingEffectOperationTypeSpecifyingOperation).processingEffectOperationType) and\n(toDataType.oclIsUndefined() or toDataType = resultData.type) and\n(fromDataType.oclIsUndefined() or operation.incomingData.type->includes(fromDataType))"
		   });
		addAnnotation
		  (dataCreationProcessingEffectEClass,
		   source,
		   new String[]
		   {
			   "fromDataTypeHasToBeUndefined", "fromDataType.oclIsUndefined()"
		   });
		addAnnotation
		  (dataCreationProcessingEffectEClass.getEOperations().get(0),
		   source,
		   new String[]
		   {
			   "body", "operation.oclIsTypeOf(processing::CreateDataOperation) and\ntoDataType = operation.oclAsType(processing::CreateDataOperation).resultingData.type"
		   });
		addAnnotation
		  (processingEffectProviderEClass.getEOperations().get(0),
		   source,
		   new String[]
		   {
			   "body", "self->selectByKind(dataprocessing::effectspecification::ProcessingEffect)"
		   });
		addAnnotation
		  (getProcessingEffectProvider_ProcessingEffects(),
		   source,
		   new String[]
		   {
			   "derivation", "determineProcessingEffects()"
		   });
	}

} //EffectspecificationPackageImpl
