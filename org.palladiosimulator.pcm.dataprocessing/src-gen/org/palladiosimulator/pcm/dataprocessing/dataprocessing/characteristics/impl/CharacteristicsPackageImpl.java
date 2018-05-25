/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
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

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.util.CharacteristicsValidator;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataprocessingPackageImpl;

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
public class CharacteristicsPackageImpl extends EPackageImpl implements CharacteristicsPackage {
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
	private CharacteristicsPackageImpl() {
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
	public static CharacteristicsPackage init() {
		if (isInited) return (CharacteristicsPackage)EPackage.Registry.INSTANCE.getEPackage(CharacteristicsPackage.eNS_URI);

		// Obtain or create and register package
		CharacteristicsPackageImpl theCharacteristicsPackage = (CharacteristicsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CharacteristicsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CharacteristicsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DataprocessingPackageImpl theDataprocessingPackage = (DataprocessingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataprocessingPackage.eNS_URI) instanceof DataprocessingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataprocessingPackage.eNS_URI) : DataprocessingPackage.eINSTANCE);
		RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) instanceof RepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI) : RepositoryPackage.eINSTANCE);
		ProcessingPackageImpl theProcessingPackage = (ProcessingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessingPackage.eNS_URI) instanceof ProcessingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessingPackage.eNS_URI) : ProcessingPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		SeffPackageImpl theSeffPackage = (SeffPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI) instanceof SeffPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI) : SeffPackage.eINSTANCE);

		// Create package meta-data objects
		theCharacteristicsPackage.createPackageContents();
		theDataprocessingPackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theProcessingPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theSeffPackage.createPackageContents();

		// Initialize created meta-data
		theCharacteristicsPackage.initializePackageContents();
		theDataprocessingPackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theProcessingPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theSeffPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCharacteristicsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
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
	public EClass getCharacterizable() {
		return characterizableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacterizable_CharacteristicContainers() {
		return (EReference)characterizableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacterizable_Characteristics() {
		return (EReference)characterizableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristicTypeContainer() {
		return characteristicTypeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristicTypeContainer_CharacteristicTypes() {
		return (EReference)characteristicTypeContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristicTypeContainer_Enumerations() {
		return (EReference)characteristicTypeContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristicType() {
		return characteristicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumCharacteristicType() {
		return enumCharacteristicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumCharacteristicType_MultipleChoice() {
		return (EAttribute)enumCharacteristicTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumCharacteristicType_Enum() {
		return (EReference)enumCharacteristicTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumCharacteristicLiteral() {
		return enumCharacteristicLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristicContainer() {
		return characteristicContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristicContainer_Characteristics() {
		return (EReference)characteristicContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristic() {
		return characteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristic_Type() {
		return (EReference)characteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumCharacteristic() {
		return enumCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumCharacteristic_Values() {
		return (EReference)enumCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_Literals() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicsFactory getCharacteristicsFactory() {
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
	public void createPackageContents() {
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
		createEReference(characteristicContainerEClass, CHARACTERISTIC_CONTAINER__CHARACTERISTICS);

		characteristicEClass = createEClass(CHARACTERISTIC);
		createEReference(characteristicEClass, CHARACTERISTIC__TYPE);

		enumCharacteristicEClass = createEClass(ENUM_CHARACTERISTIC);
		createEReference(enumCharacteristicEClass, ENUM_CHARACTERISTIC__VALUES);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__LITERALS);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Create type parameters
		ETypeParameter characteristicEClass_T = addETypeParameter(characteristicEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getCharacteristicType());
		characteristicEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		characteristicTypeContainerEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		characteristicTypeEClass.getESuperTypes().add(theEntityPackage.getEntity());
		enumCharacteristicTypeEClass.getESuperTypes().add(this.getCharacteristicType());
		enumCharacteristicLiteralEClass.getESuperTypes().add(theEntityPackage.getEntity());
		characteristicContainerEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		characteristicEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		g1 = createEGenericType(this.getCharacteristic());
		EGenericType g2 = createEGenericType(this.getEnumCharacteristicType());
		g1.getETypeArguments().add(g2);
		enumCharacteristicEClass.getEGenericSuperTypes().add(g1);
		enumerationEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(characterizableEClass, Characterizable.class, "Characterizable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacterizable_CharacteristicContainers(), this.getCharacteristicContainer(), null, "characteristicContainers", null, 1, -1, Characterizable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getCharacteristic());
		g2 = createEGenericType(this.getCharacteristicType());
		g1.getETypeArguments().add(g2);
		initEReference(getCharacterizable_Characteristics(), g1, null, "characteristics", null, 0, -1, Characterizable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(characteristicTypeContainerEClass, CharacteristicTypeContainer.class, "CharacteristicTypeContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacteristicTypeContainer_CharacteristicTypes(), this.getCharacteristicType(), null, "characteristicTypes", null, 0, -1, CharacteristicTypeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacteristicTypeContainer_Enumerations(), this.getEnumeration(), null, "enumerations", null, 0, -1, CharacteristicTypeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characteristicTypeEClass, CharacteristicType.class, "CharacteristicType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumCharacteristicTypeEClass, EnumCharacteristicType.class, "EnumCharacteristicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumCharacteristicType_MultipleChoice(), ecorePackage.getEBoolean(), "multipleChoice", "false", 1, 1, EnumCharacteristicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumCharacteristicType_Enum(), this.getEnumeration(), null, "enum", null, 1, 1, EnumCharacteristicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumCharacteristicLiteralEClass, EnumCharacteristicLiteral.class, "EnumCharacteristicLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(characteristicContainerEClass, CharacteristicContainer.class, "CharacteristicContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getCharacteristic());
		g2 = createEGenericType(this.getCharacteristicType());
		g1.getETypeArguments().add(g2);
		initEReference(getCharacteristicContainer_Characteristics(), g1, null, "characteristics", null, 0, -1, CharacteristicContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characteristicEClass, Characteristic.class, "Characteristic", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(characteristicEClass_T);
		initEReference(getCharacteristic_Type(), g1, null, "type", null, 1, 1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumCharacteristicEClass, EnumCharacteristic.class, "EnumCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumCharacteristic_Values(), this.getEnumCharacteristicLiteral(), null, "values", null, 0, -1, EnumCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_Literals(), this.getEnumCharacteristicLiteral(), null, "literals", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (enumCharacteristicEClass, 
		   source, 
		   new String[] {
			 "constraints", "valueCountMustMatchTypeRestriction literalsMustBelongToCorrectEnum"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (getCharacterizable_Characteristics(), 
		   source, 
		   new String[] {
			 "derivation", "self.characteristicContainers->collect(characteristics)"
		   });	
		addAnnotation
		  (enumCharacteristicEClass, 
		   source, 
		   new String[] {
			 "valueCountMustMatchTypeRestriction", "self.values->size() < 2 or self.type.oclAsType(EnumCharacteristicType).multipleChoice",
			 "literalsMustBelongToCorrectEnum", "self.type.oclAsType(EnumCharacteristicType).enum.literals->includesAll(self.values)"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";	
		addAnnotation
		  (getCharacterizable_Characteristics(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });
	}

} //CharacteristicsPackageImpl
