/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl;

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

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Characteristic;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicType;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicTypeContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Characterizable;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristic;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicType;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Enumeration;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.RelatedCharacteristics;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.StoreCharacteristicContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.StoreCharacteristics;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.util.CharacteristicsValidator;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl;

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
public class CharacteristicsPackageImpl extends EPackageImpl implements CharacteristicsPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterizableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicTypeContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumCharacteristicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumCharacteristicLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedCharacteristicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeCharacteristicContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeCharacteristicsEClass = null;

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
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CharacteristicsPackageImpl()
	{
		super(eNS_URI, CharacteristicsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CharacteristicsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CharacteristicsPackage init()
	{
		if (isInited) return (CharacteristicsPackage)EPackage.Registry.INSTANCE.getEPackage(CharacteristicsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCharacteristicsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CharacteristicsPackageImpl theCharacteristicsPackage = registeredCharacteristicsPackage instanceof CharacteristicsPackageImpl ? (CharacteristicsPackageImpl)registeredCharacteristicsPackage : new CharacteristicsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		DataPackageImpl theDataPackage = (DataPackageImpl)(registeredPackage instanceof DataPackageImpl ? registeredPackage : DataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(registeredPackage instanceof UtilPackageImpl ? registeredPackage : UtilPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EffectspecificationPackage.eNS_URI);
		EffectspecificationPackageImpl theEffectspecificationPackage = (EffectspecificationPackageImpl)(registeredPackage instanceof EffectspecificationPackageImpl ? registeredPackage : EffectspecificationPackage.eINSTANCE);

		// Create package meta-data objects
		theCharacteristicsPackage.createPackageContents();
		theDataprocessingPackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theProcessingPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theEffectspecificationPackage.createPackageContents();

		// Initialize created meta-data
		theCharacteristicsPackage.initializePackageContents();
		theDataprocessingPackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theProcessingPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theEffectspecificationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCharacteristicsPackage,
			 new EValidator.Descriptor()
			 {
				 public EValidator getEValidator()
				 {
					 return CharacteristicsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCharacteristicsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CharacteristicsPackage.eNS_URI, theCharacteristicsPackage);
		return theCharacteristicsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterizable()
	{
		return characterizableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacterizable_CharacteristicContainers()
	{
		return (EReference)characterizableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacterizable_Characteristics()
	{
		return (EReference)characterizableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristicTypeContainer()
	{
		return characteristicTypeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristicTypeContainer_CharacteristicTypes()
	{
		return (EReference)characteristicTypeContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristicTypeContainer_Enumerations()
	{
		return (EReference)characteristicTypeContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristicType()
	{
		return characteristicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumCharacteristicType()
	{
		return enumCharacteristicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumCharacteristicType_MultipleChoice()
	{
		return (EAttribute)enumCharacteristicTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumCharacteristicType_Enum()
	{
		return (EReference)enumCharacteristicTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumCharacteristicLiteral()
	{
		return enumCharacteristicLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristicContainer()
	{
		return characteristicContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristicContainer_OwnedCharacteristics()
	{
		return (EReference)characteristicContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristic()
	{
		return characteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristic_CharacteristicType()
	{
		return (EReference)characteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumCharacteristic()
	{
		return enumCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumCharacteristic_Literals()
	{
		return (EReference)enumCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumCharacteristic_Type()
	{
		return (EReference)enumCharacteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration()
	{
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_Literals()
	{
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatedCharacteristics()
	{
		return relatedCharacteristicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedCharacteristics_Characteristics()
	{
		return (EReference)relatedCharacteristicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedCharacteristics_RelatedEntity()
	{
		return (EReference)relatedCharacteristicsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoreCharacteristicContainer()
	{
		return storeCharacteristicContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoreCharacteristicContainer_Characteristics()
	{
		return (EReference)storeCharacteristicContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoreCharacteristics()
	{
		return storeCharacteristicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoreCharacteristics_Store()
	{
		return (EReference)storeCharacteristicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicsFactory getCharacteristicsFactory()
	{
		return (CharacteristicsFactory)getEFactoryInstance();
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
		characterizableEClass = createEClass(CHARACTERIZABLE);
		createEReference(characterizableEClass, CHARACTERIZABLE__CHARACTERISTIC_CONTAINERS);
		createEReference(characterizableEClass, CHARACTERIZABLE__CHARACTERISTICS);

		characteristicTypeContainerEClass = createEClass(CHARACTERISTIC_TYPE_CONTAINER);
		createEReference(characteristicTypeContainerEClass, CHARACTERISTIC_TYPE_CONTAINER__CHARACTERISTIC_TYPES);
		createEReference(characteristicTypeContainerEClass, CHARACTERISTIC_TYPE_CONTAINER__ENUMERATIONS);

		characteristicTypeEClass = createEClass(CHARACTERISTIC_TYPE);

		enumCharacteristicTypeEClass = createEClass(ENUM_CHARACTERISTIC_TYPE);
		createEAttribute(enumCharacteristicTypeEClass, ENUM_CHARACTERISTIC_TYPE__MULTIPLE_CHOICE);
		createEReference(enumCharacteristicTypeEClass, ENUM_CHARACTERISTIC_TYPE__ENUM);

		enumCharacteristicLiteralEClass = createEClass(ENUM_CHARACTERISTIC_LITERAL);

		characteristicContainerEClass = createEClass(CHARACTERISTIC_CONTAINER);
		createEReference(characteristicContainerEClass, CHARACTERISTIC_CONTAINER__OWNED_CHARACTERISTICS);

		characteristicEClass = createEClass(CHARACTERISTIC);
		createEReference(characteristicEClass, CHARACTERISTIC__CHARACTERISTIC_TYPE);

		enumCharacteristicEClass = createEClass(ENUM_CHARACTERISTIC);
		createEReference(enumCharacteristicEClass, ENUM_CHARACTERISTIC__LITERALS);
		createEReference(enumCharacteristicEClass, ENUM_CHARACTERISTIC__TYPE);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__LITERALS);

		relatedCharacteristicsEClass = createEClass(RELATED_CHARACTERISTICS);
		createEReference(relatedCharacteristicsEClass, RELATED_CHARACTERISTICS__CHARACTERISTICS);
		createEReference(relatedCharacteristicsEClass, RELATED_CHARACTERISTICS__RELATED_ENTITY);

		storeCharacteristicContainerEClass = createEClass(STORE_CHARACTERISTIC_CONTAINER);
		createEReference(storeCharacteristicContainerEClass, STORE_CHARACTERISTIC_CONTAINER__CHARACTERISTICS);

		storeCharacteristicsEClass = createEClass(STORE_CHARACTERISTICS);
		createEReference(storeCharacteristicsEClass, STORE_CHARACTERISTICS__STORE);
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
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		characteristicTypeContainerEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		characteristicTypeEClass.getESuperTypes().add(theEntityPackage.getEntity());
		enumCharacteristicTypeEClass.getESuperTypes().add(this.getCharacteristicType());
		enumCharacteristicLiteralEClass.getESuperTypes().add(theEntityPackage.getEntity());
		characteristicContainerEClass.getESuperTypes().add(theEntityPackage.getEntity());
		characteristicEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		enumCharacteristicEClass.getESuperTypes().add(this.getCharacteristic());
		enumerationEClass.getESuperTypes().add(theEntityPackage.getEntity());
		relatedCharacteristicsEClass.getESuperTypes().add(theEntityPackage.getEntity());
		storeCharacteristicContainerEClass.getESuperTypes().add(theEntityPackage.getEntity());
		storeCharacteristicsEClass.getESuperTypes().add(this.getCharacteristicContainer());

		// Initialize classes and features; add operations and parameters
		initEClass(characterizableEClass, Characterizable.class, "Characterizable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacterizable_CharacteristicContainers(), this.getCharacteristicContainer(), null, "characteristicContainers", null, 1, -1, Characterizable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacterizable_Characteristics(), this.getCharacteristic(), null, "characteristics", null, 0, -1, Characterizable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(characteristicTypeContainerEClass, CharacteristicTypeContainer.class, "CharacteristicTypeContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacteristicTypeContainer_CharacteristicTypes(), this.getCharacteristicType(), null, "characteristicTypes", null, 0, -1, CharacteristicTypeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacteristicTypeContainer_Enumerations(), this.getEnumeration(), null, "enumerations", null, 0, -1, CharacteristicTypeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characteristicTypeEClass, CharacteristicType.class, "CharacteristicType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(characteristicTypeEClass, ecorePackage.getEBoolean(), "hasCompatibleValueRange", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCharacteristicType(), "characteristicType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(enumCharacteristicTypeEClass, EnumCharacteristicType.class, "EnumCharacteristicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumCharacteristicType_MultipleChoice(), ecorePackage.getEBoolean(), "multipleChoice", "false", 1, 1, EnumCharacteristicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumCharacteristicType_Enum(), this.getEnumeration(), null, "enum", null, 1, 1, EnumCharacteristicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(enumCharacteristicTypeEClass, ecorePackage.getEBoolean(), "hasCompatibleValueRange", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCharacteristicType(), "characteristicType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(enumCharacteristicLiteralEClass, EnumCharacteristicLiteral.class, "EnumCharacteristicLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(characteristicContainerEClass, CharacteristicContainer.class, "CharacteristicContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacteristicContainer_OwnedCharacteristics(), this.getCharacteristic(), null, "ownedCharacteristics", null, 0, -1, CharacteristicContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characteristicEClass, Characteristic.class, "Characteristic", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacteristic_CharacteristicType(), this.getCharacteristicType(), null, "characteristicType", null, 1, 1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumCharacteristicEClass, EnumCharacteristic.class, "EnumCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumCharacteristic_Literals(), this.getEnumCharacteristicLiteral(), null, "literals", null, 0, -1, EnumCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumCharacteristic_Type(), this.getEnumCharacteristicType(), null, "type", null, 0, 1, EnumCharacteristic.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_Literals(), this.getEnumCharacteristicLiteral(), null, "literals", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relatedCharacteristicsEClass, RelatedCharacteristics.class, "RelatedCharacteristics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelatedCharacteristics_Characteristics(), this.getCharacteristicContainer(), null, "characteristics", null, 1, 1, RelatedCharacteristics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedCharacteristics_RelatedEntity(), theEntityPackage.getEntity(), null, "relatedEntity", null, 1, 1, RelatedCharacteristics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storeCharacteristicContainerEClass, StoreCharacteristicContainer.class, "StoreCharacteristicContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStoreCharacteristicContainer_Characteristics(), this.getStoreCharacteristics(), null, "characteristics", null, 0, -1, StoreCharacteristicContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storeCharacteristicsEClass, StoreCharacteristics.class, "StoreCharacteristics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStoreCharacteristics_Store(), theRepositoryPackage.getStore(), null, "store", null, 1, 1, StoreCharacteristics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
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
		  (enumCharacteristicEClass,
		   source,
		   new String[]
		   {
			   "constraints", "valueCountMustMatchTypeRestriction literalsMustBelongToCorrectEnum"
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
		  (getCharacterizable_Characteristics(),
		   source,
		   new String[]
		   {
			   "derivation", "self.characteristicContainers->collect(characteristics)->asOrderedSet()"
		   });
		addAnnotation
		  (characteristicTypeEClass.getEOperations().get(0),
		   source,
		   new String[]
		   {
			   "body", "false"
		   });
		addAnnotation
		  (enumCharacteristicTypeEClass.getEOperations().get(0),
		   source,
		   new String[]
		   {
			   "body", "multipleChoice = characteristicType.oclAsType(EnumCharacteristicType).multipleChoice and\nenum = characteristicType.oclAsType(EnumCharacteristicType).enum"
		   });
		addAnnotation
		  (enumCharacteristicEClass,
		   source,
		   new String[]
		   {
			   "valueCountMustMatchTypeRestriction", "self.literals->size() < 2 or self.type.multipleChoice",
			   "literalsMustBelongToCorrectEnum", "self.type.enum.literals->includesAll(self.literals)"
		   });
		addAnnotation
		  (getEnumCharacteristic_Type(),
		   source,
		   new String[]
		   {
			   "derivation", "if self.characteristicType.oclIsUndefined() or not self.characteristicType.oclIsKindOf(EnumCharacteristicType) then\n\tnull\nelse\n\tself.characteristicType.oclAsType(EnumCharacteristicType)\nendif"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations()
	{
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation
		  (getCharacterizable_Characteristics(),
		   source,
		   new String[]
		   {
			   "nullFree", "false"
		   });
	}

} //CharacteristicsPackageImpl
