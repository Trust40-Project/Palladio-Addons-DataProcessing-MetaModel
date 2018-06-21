/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.CharacteristicsPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl.DataPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.impl.DataprocessingPackageImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangeOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangingDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ConsumeDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CreateDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataMapping;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataParameterMapping;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataProcessingContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataResultMapping;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.JoinDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.LoadAllDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.LoadDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ManyToOneDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProjectionDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ReturnDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.SelectionDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.StoreDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.UnionDataOperation;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.util.ProcessingValidator;

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
public class ProcessingPackageImpl extends EPackageImpl implements ProcessingPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataProcessingContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createDataOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadDataOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadAllDataOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performDataTransmissionOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumeDataOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeDataOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnDataOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataParameterMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataResultMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manyToOneDataOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinDataOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionDataOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformDataOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectionDataOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionDataOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicChangingDataOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum characteristicChangeOperationEEnum = null;

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
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProcessingPackageImpl()
	{
		super(eNS_URI, ProcessingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProcessingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProcessingPackage init()
	{
		if (isInited) return (ProcessingPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessingPackage.eNS_URI);

		// Obtain or create and register package
		ProcessingPackageImpl theProcessingPackage = (ProcessingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProcessingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProcessingPackageImpl());

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
		CharacteristicsPackageImpl theCharacteristicsPackage = (CharacteristicsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CharacteristicsPackage.eNS_URI) instanceof CharacteristicsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CharacteristicsPackage.eNS_URI) : CharacteristicsPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		SeffPackageImpl theSeffPackage = (SeffPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI) instanceof SeffPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI) : SeffPackage.eINSTANCE);

		// Create package meta-data objects
		theProcessingPackage.createPackageContents();
		theDataprocessingPackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theCharacteristicsPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theSeffPackage.createPackageContents();

		// Initialize created meta-data
		theProcessingPackage.initializePackageContents();
		theDataprocessingPackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theCharacteristicsPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theSeffPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theProcessingPackage, 
			 new EValidator.Descriptor()
			 {
				 public EValidator getEValidator()
				 {
					 return ProcessingValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theProcessingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProcessingPackage.eNS_URI, theProcessingPackage);
		return theProcessingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataProcessingContainer()
	{
		return dataProcessingContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataProcessingContainer_Operations()
	{
		return (EReference)dataProcessingContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataOperation()
	{
		return dataOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataOperation_Container()
	{
		return (EReference)dataOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateDataOperation()
	{
		return createDataOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateDataOperation_ResultingData()
	{
		return (EReference)createDataOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadDataOperation()
	{
		return loadDataOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadDataOperation_Store()
	{
		return (EReference)loadDataOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadAllDataOperation()
	{
		return loadAllDataOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformDataTransmissionOperation()
	{
		return performDataTransmissionOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformDataTransmissionOperation_InputMappings()
	{
		return (EReference)performDataTransmissionOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformDataTransmissionOperation_OutputMappings()
	{
		return (EReference)performDataTransmissionOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsumeDataOperation()
	{
		return consumeDataOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsumeDataOperation_ConsumedData()
	{
		return (EReference)consumeDataOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoreDataOperation()
	{
		return storeDataOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoreDataOperation_Store()
	{
		return (EReference)storeDataOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnDataOperation()
	{
		return returnDataOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMapping()
	{
		return dataMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMapping_Data()
	{
		return (EReference)dataMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataParameterMapping()
	{
		return dataParameterMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataParameterMapping_Parameter()
	{
		return (EReference)dataParameterMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataResultMapping()
	{
		return dataResultMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataResultMapping_Operation()
	{
		return (EReference)dataResultMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataResultMapping_ReceivedData()
	{
		return (EReference)dataResultMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManyToOneDataOperation()
	{
		return manyToOneDataOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToOneDataOperation_ConsumedData()
	{
		return (EReference)manyToOneDataOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToOneDataOperation_ResultingData()
	{
		return (EReference)manyToOneDataOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinDataOperation()
	{
		return joinDataOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionDataOperation()
	{
		return unionDataOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformDataOperation()
	{
		return transformDataOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformDataOperation_Inputs()
	{
		return (EReference)transformDataOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformDataOperation_Output()
	{
		return (EReference)transformDataOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformDataOperation_ParameterData()
	{
		return (EReference)transformDataOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectionDataOperation()
	{
		return projectionDataOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionDataOperation()
	{
		return selectionDataOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristicChangingDataOperation()
	{
		return characteristicChangingDataOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristicChangingDataOperation_Data()
	{
		return (EReference)characteristicChangingDataOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristicChangingDataOperation_Operation()
	{
		return (EAttribute)characteristicChangingDataOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristicChangingDataOperation_Characteristic()
	{
		return (EReference)characteristicChangingDataOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCharacteristicChangeOperation()
	{
		return characteristicChangeOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingFactory getProcessingFactory()
	{
		return (ProcessingFactory)getEFactoryInstance();
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
		dataProcessingContainerEClass = createEClass(DATA_PROCESSING_CONTAINER);
		createEReference(dataProcessingContainerEClass, DATA_PROCESSING_CONTAINER__OPERATIONS);

		dataOperationEClass = createEClass(DATA_OPERATION);
		createEReference(dataOperationEClass, DATA_OPERATION__CONTAINER);

		createDataOperationEClass = createEClass(CREATE_DATA_OPERATION);
		createEReference(createDataOperationEClass, CREATE_DATA_OPERATION__RESULTING_DATA);

		loadDataOperationEClass = createEClass(LOAD_DATA_OPERATION);
		createEReference(loadDataOperationEClass, LOAD_DATA_OPERATION__STORE);

		loadAllDataOperationEClass = createEClass(LOAD_ALL_DATA_OPERATION);

		performDataTransmissionOperationEClass = createEClass(PERFORM_DATA_TRANSMISSION_OPERATION);
		createEReference(performDataTransmissionOperationEClass, PERFORM_DATA_TRANSMISSION_OPERATION__INPUT_MAPPINGS);
		createEReference(performDataTransmissionOperationEClass, PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_MAPPINGS);

		consumeDataOperationEClass = createEClass(CONSUME_DATA_OPERATION);
		createEReference(consumeDataOperationEClass, CONSUME_DATA_OPERATION__CONSUMED_DATA);

		storeDataOperationEClass = createEClass(STORE_DATA_OPERATION);
		createEReference(storeDataOperationEClass, STORE_DATA_OPERATION__STORE);

		returnDataOperationEClass = createEClass(RETURN_DATA_OPERATION);

		dataMappingEClass = createEClass(DATA_MAPPING);
		createEReference(dataMappingEClass, DATA_MAPPING__DATA);

		dataParameterMappingEClass = createEClass(DATA_PARAMETER_MAPPING);
		createEReference(dataParameterMappingEClass, DATA_PARAMETER_MAPPING__PARAMETER);

		dataResultMappingEClass = createEClass(DATA_RESULT_MAPPING);
		createEReference(dataResultMappingEClass, DATA_RESULT_MAPPING__OPERATION);
		createEReference(dataResultMappingEClass, DATA_RESULT_MAPPING__RECEIVED_DATA);

		manyToOneDataOperationEClass = createEClass(MANY_TO_ONE_DATA_OPERATION);
		createEReference(manyToOneDataOperationEClass, MANY_TO_ONE_DATA_OPERATION__CONSUMED_DATA);
		createEReference(manyToOneDataOperationEClass, MANY_TO_ONE_DATA_OPERATION__RESULTING_DATA);

		joinDataOperationEClass = createEClass(JOIN_DATA_OPERATION);

		unionDataOperationEClass = createEClass(UNION_DATA_OPERATION);

		transformDataOperationEClass = createEClass(TRANSFORM_DATA_OPERATION);
		createEReference(transformDataOperationEClass, TRANSFORM_DATA_OPERATION__INPUTS);
		createEReference(transformDataOperationEClass, TRANSFORM_DATA_OPERATION__OUTPUT);
		createEReference(transformDataOperationEClass, TRANSFORM_DATA_OPERATION__PARAMETER_DATA);

		projectionDataOperationEClass = createEClass(PROJECTION_DATA_OPERATION);

		selectionDataOperationEClass = createEClass(SELECTION_DATA_OPERATION);

		characteristicChangingDataOperationEClass = createEClass(CHARACTERISTIC_CHANGING_DATA_OPERATION);
		createEReference(characteristicChangingDataOperationEClass, CHARACTERISTIC_CHANGING_DATA_OPERATION__DATA);
		createEAttribute(characteristicChangingDataOperationEClass, CHARACTERISTIC_CHANGING_DATA_OPERATION__OPERATION);
		createEReference(characteristicChangingDataOperationEClass, CHARACTERISTIC_CHANGING_DATA_OPERATION__CHARACTERISTIC);

		// Create enums
		characteristicChangeOperationEEnum = createEEnum(CHARACTERISTIC_CHANGE_OPERATION);
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
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		org.palladiosimulator.pcm.repository.RepositoryPackage theRepositoryPackage_1 = (org.palladiosimulator.pcm.repository.RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(org.palladiosimulator.pcm.repository.RepositoryPackage.eNS_URI);
		CharacteristicsPackage theCharacteristicsPackage = (CharacteristicsPackage)EPackage.Registry.INSTANCE.getEPackage(CharacteristicsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter characteristicChangingDataOperationEClass_T = addETypeParameter(characteristicChangingDataOperationEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theCharacteristicsPackage.getCharacteristicType());
		characteristicChangingDataOperationEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		dataProcessingContainerEClass.getESuperTypes().add(theEntityPackage.getEntity());
		dataOperationEClass.getESuperTypes().add(theEntityPackage.getEntity());
		createDataOperationEClass.getESuperTypes().add(this.getDataOperation());
		loadDataOperationEClass.getESuperTypes().add(this.getCreateDataOperation());
		loadAllDataOperationEClass.getESuperTypes().add(this.getLoadDataOperation());
		performDataTransmissionOperationEClass.getESuperTypes().add(this.getDataOperation());
		consumeDataOperationEClass.getESuperTypes().add(this.getDataOperation());
		storeDataOperationEClass.getESuperTypes().add(this.getConsumeDataOperation());
		returnDataOperationEClass.getESuperTypes().add(this.getConsumeDataOperation());
		dataMappingEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		dataParameterMappingEClass.getESuperTypes().add(this.getDataMapping());
		dataResultMappingEClass.getESuperTypes().add(this.getDataMapping());
		manyToOneDataOperationEClass.getESuperTypes().add(this.getDataOperation());
		joinDataOperationEClass.getESuperTypes().add(this.getManyToOneDataOperation());
		unionDataOperationEClass.getESuperTypes().add(this.getManyToOneDataOperation());
		transformDataOperationEClass.getESuperTypes().add(this.getDataOperation());
		projectionDataOperationEClass.getESuperTypes().add(this.getTransformDataOperation());
		selectionDataOperationEClass.getESuperTypes().add(this.getTransformDataOperation());
		characteristicChangingDataOperationEClass.getESuperTypes().add(this.getDataOperation());

		// Initialize classes and features; add operations and parameters
		initEClass(dataProcessingContainerEClass, DataProcessingContainer.class, "DataProcessingContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataProcessingContainer_Operations(), this.getDataOperation(), this.getDataOperation_Container(), "operations", null, 0, -1, DataProcessingContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataOperationEClass, DataOperation.class, "DataOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataOperation_Container(), this.getDataProcessingContainer(), this.getDataProcessingContainer_Operations(), "container", null, 0, 1, DataOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createDataOperationEClass, CreateDataOperation.class, "CreateDataOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateDataOperation_ResultingData(), theDataPackage.getData(), null, "resultingData", null, 1, 1, CreateDataOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadDataOperationEClass, LoadDataOperation.class, "LoadDataOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoadDataOperation_Store(), theRepositoryPackage.getStore(), null, "store", null, 1, 1, LoadDataOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadAllDataOperationEClass, LoadAllDataOperation.class, "LoadAllDataOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(performDataTransmissionOperationEClass, PerformDataTransmissionOperation.class, "PerformDataTransmissionOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerformDataTransmissionOperation_InputMappings(), this.getDataMapping(), null, "inputMappings", null, 0, -1, PerformDataTransmissionOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerformDataTransmissionOperation_OutputMappings(), this.getDataMapping(), null, "outputMappings", null, 0, -1, PerformDataTransmissionOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consumeDataOperationEClass, ConsumeDataOperation.class, "ConsumeDataOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsumeDataOperation_ConsumedData(), theDataPackage.getData(), null, "consumedData", null, 1, 1, ConsumeDataOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storeDataOperationEClass, StoreDataOperation.class, "StoreDataOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStoreDataOperation_Store(), theRepositoryPackage.getStore(), null, "store", null, 1, 1, StoreDataOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnDataOperationEClass, ReturnDataOperation.class, "ReturnDataOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataMappingEClass, DataMapping.class, "DataMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataMapping_Data(), theDataPackage.getData(), null, "data", null, 1, 1, DataMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataParameterMappingEClass, DataParameterMapping.class, "DataParameterMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataParameterMapping_Parameter(), theRepositoryPackage_1.getParameter(), null, "parameter", null, 1, 1, DataParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataResultMappingEClass, DataResultMapping.class, "DataResultMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataResultMapping_Operation(), theRepositoryPackage_1.getOperationSignature(), null, "operation", null, 1, 1, DataResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataResultMapping_ReceivedData(), theDataPackage.getData(), null, "receivedData", null, 1, 1, DataResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manyToOneDataOperationEClass, ManyToOneDataOperation.class, "ManyToOneDataOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManyToOneDataOperation_ConsumedData(), theDataPackage.getData(), null, "consumedData", null, 2, -1, ManyToOneDataOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManyToOneDataOperation_ResultingData(), theDataPackage.getData(), null, "resultingData", null, 1, 1, ManyToOneDataOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinDataOperationEClass, JoinDataOperation.class, "JoinDataOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unionDataOperationEClass, UnionDataOperation.class, "UnionDataOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transformDataOperationEClass, TransformDataOperation.class, "TransformDataOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformDataOperation_Inputs(), theDataPackage.getData(), null, "inputs", null, 1, 1, TransformDataOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformDataOperation_Output(), theDataPackage.getData(), null, "output", null, 1, 1, TransformDataOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformDataOperation_ParameterData(), theDataPackage.getData(), null, "parameterData", null, 0, -1, TransformDataOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectionDataOperationEClass, ProjectionDataOperation.class, "ProjectionDataOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionDataOperationEClass, SelectionDataOperation.class, "SelectionDataOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(characteristicChangingDataOperationEClass, CharacteristicChangingDataOperation.class, "CharacteristicChangingDataOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacteristicChangingDataOperation_Data(), theDataPackage.getData(), null, "data", null, 1, 1, CharacteristicChangingDataOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacteristicChangingDataOperation_Operation(), this.getCharacteristicChangeOperation(), "operation", null, 1, 1, CharacteristicChangingDataOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacteristicChangingDataOperation_Characteristic(), theCharacteristicsPackage.getCharacteristic(), null, "characteristic", null, 1, 1, CharacteristicChangingDataOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(characteristicChangeOperationEEnum, CharacteristicChangeOperation.class, "CharacteristicChangeOperation");
		addEEnumLiteral(characteristicChangeOperationEEnum, CharacteristicChangeOperation.ADD);
		addEEnumLiteral(characteristicChangeOperationEEnum, CharacteristicChangeOperation.REMOVE);
		addEEnumLiteral(characteristicChangeOperationEEnum, CharacteristicChangeOperation.REPLACE);

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
		addAnnotation
		  (loadAllDataOperationEClass, 
		   source, 
		   new String[] 
		   {
			 "constraints", "resultTypeMustBeCollection"
		   });	
		addAnnotation
		  (dataResultMappingEClass, 
		   source, 
		   new String[] 
		   {
			 "constraints", "mappedDataMustBeInReceivedData"
		   });	
		addAnnotation
		  (joinDataOperationEClass, 
		   source, 
		   new String[] 
		   {
			 "constraints", "resultMustBeCompositeOfInputs"
		   });	
		addAnnotation
		  (unionDataOperationEClass, 
		   source, 
		   new String[] 
		   {
			 "constraints", "inputsMustBeResultTypeOrResultEntityType"
		   });	
		addAnnotation
		  (projectionDataOperationEClass, 
		   source, 
		   new String[] 
		   {
			 "constraints", "noParameters outputIsComposedInInput"
		   });	
		addAnnotation
		  (selectionDataOperationEClass, 
		   source, 
		   new String[] 
		   {
			 "constraints", "inputAndOutputHaveSameEntityType"
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
		  (loadAllDataOperationEClass, 
		   source, 
		   new String[] 
		   {
			 "resultTypeMustBeCollection", "self.resultingData.type.oclIsKindOf(repository_1::CollectionDataType)"
		   });	
		addAnnotation
		  (dataResultMappingEClass, 
		   source, 
		   new String[] 
		   {
			 "mappedDataMustBeInReceivedData", "self.receivedData->includes(self.data)"
		   });	
		addAnnotation
		  (joinDataOperationEClass, 
		   source, 
		   new String[] 
		   {
			 "resultMustBeCompositeOfInputs", "\n\t\t\t\tlet resultInnerDeclarations = self.resultingData.oclAsType(repository_1::CompositeDataType).innerDeclaration_CompositeDataType in\n\t\t\t\t\tresultInnerDeclarations.datatype_InnerDeclaration = self.consumedData.type"
		   });	
		addAnnotation
		  (unionDataOperationEClass, 
		   source, 
		   new String[] 
		   {
			 "inputsMustBeResultTypeOrResultEntityType", "\n\t\t\t\tlet entityType = self.resultingData.oclAsType(repository_1::CollectionDataType).innerType_CollectionDataType in\n\t\t\t\t\tself.consumedData.type->forAll(t |\n\t\t\t\t\t\tt = entityType or t.oclAsType(repository_1::CollectionDataType).innerType_CollectionDataType = entityType)"
		   });	
		addAnnotation
		  (projectionDataOperationEClass, 
		   source, 
		   new String[] 
		   {
			 "noParameters", "self.parameterData->isEmpty()",
			 "outputIsComposedInInput", "self.inputs.type.oclAsType(repository_1::CompositeDataType).innerDeclaration_CompositeDataType.datatype_InnerDeclaration->includes(self.output.type)"
		   });	
		addAnnotation
		  (selectionDataOperationEClass, 
		   source, 
		   new String[] 
		   {
			 "inputAndOutputHaveSameEntityType", "self.inputs.type->oclAsSet() = self.output.type->oclAsSet() or self.inputs.type.oclAsType(repository_1::CollectionDataType).innerType_CollectionDataType->oclAsSet() = self.output.type->oclAsSet()"
		   });
	}

} //ProcessingPackageImpl
