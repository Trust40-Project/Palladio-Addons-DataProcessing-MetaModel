/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage;

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
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL environmentFactoryClass='org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DynamicDispatchEnablingEcoreEnvironmentFactory'"
 * @generated
 */
public interface EffectspecificationPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "effectspecification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palladiosimulator.org/pcm/dataprocessing/effectspecification/0.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "effectspecification";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EffectspecificationPackage eINSTANCE = org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectSpecificationImpl <em>Processing Effect Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectSpecificationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getProcessingEffectSpecification()
	 * @generated
	 */
	int PROCESSING_EFFECT_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_EFFECT_SPECIFICATION__ID = DataprocessingPackage.DATA_SPECIFICATION_EXTENSION__ID;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_EFFECT_SPECIFICATION__SPECIFICATION = DataprocessingPackage.DATA_SPECIFICATION_EXTENSION__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Operation Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_EFFECT_SPECIFICATION__OPERATION_TYPES = DataprocessingPackage.DATA_SPECIFICATION_EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processing Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_EFFECT_SPECIFICATION__PROCESSING_EFFECTS = DataprocessingPackage.DATA_SPECIFICATION_EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Processing Effect Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_EFFECT_SPECIFICATION_FEATURE_COUNT = DataprocessingPackage.DATA_SPECIFICATION_EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectOperationTypeImpl <em>Processing Effect Operation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectOperationTypeImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getProcessingEffectOperationType()
	 * @generated
	 */
	int PROCESSING_EFFECT_OPERATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_EFFECT_OPERATION_TYPE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_EFFECT_OPERATION_TYPE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Processing Effect Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_EFFECT_OPERATION_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectImpl <em>Processing Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getProcessingEffect()
	 * @generated
	 */
	int PROCESSING_EFFECT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_EFFECT__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_EFFECT__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>From Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_EFFECT__FROM_DATA_TYPE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_EFFECT__TO_DATA_TYPE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Characteristic Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_EFFECT__CHARACTERISTIC_CHANGES = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Processing Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_EFFECT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.OperationTypeDataProcessingEffectImpl <em>Operation Type Data Processing Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.OperationTypeDataProcessingEffectImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getOperationTypeDataProcessingEffect()
	 * @generated
	 */
	int OPERATION_TYPE_DATA_PROCESSING_EFFECT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_DATA_PROCESSING_EFFECT__ID = PROCESSING_EFFECT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_DATA_PROCESSING_EFFECT__ENTITY_NAME = PROCESSING_EFFECT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>From Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_DATA_PROCESSING_EFFECT__FROM_DATA_TYPE = PROCESSING_EFFECT__FROM_DATA_TYPE;

	/**
	 * The feature id for the '<em><b>To Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_DATA_PROCESSING_EFFECT__TO_DATA_TYPE = PROCESSING_EFFECT__TO_DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Characteristic Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_DATA_PROCESSING_EFFECT__CHARACTERISTIC_CHANGES = PROCESSING_EFFECT__CHARACTERISTIC_CHANGES;

	/**
	 * The feature id for the '<em><b>Relevant Operation Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_DATA_PROCESSING_EFFECT__RELEVANT_OPERATION_TYPES = PROCESSING_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Type Data Processing Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_DATA_PROCESSING_EFFECT_FEATURE_COUNT = PROCESSING_EFFECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.DataCreationProcessingEffectImpl <em>Data Creation Processing Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.DataCreationProcessingEffectImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getDataCreationProcessingEffect()
	 * @generated
	 */
	int DATA_CREATION_PROCESSING_EFFECT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CREATION_PROCESSING_EFFECT__ID = PROCESSING_EFFECT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CREATION_PROCESSING_EFFECT__ENTITY_NAME = PROCESSING_EFFECT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>From Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CREATION_PROCESSING_EFFECT__FROM_DATA_TYPE = PROCESSING_EFFECT__FROM_DATA_TYPE;

	/**
	 * The feature id for the '<em><b>To Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CREATION_PROCESSING_EFFECT__TO_DATA_TYPE = PROCESSING_EFFECT__TO_DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Characteristic Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CREATION_PROCESSING_EFFECT__CHARACTERISTIC_CHANGES = PROCESSING_EFFECT__CHARACTERISTIC_CHANGES;

	/**
	 * The number of structural features of the '<em>Data Creation Processing Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CREATION_PROCESSING_EFFECT_FEATURE_COUNT = PROCESSING_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.CharacteristicChangeImpl <em>Characteristic Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.CharacteristicChangeImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getCharacteristicChange()
	 * @generated
	 */
	int CHARACTERISTIC_CHANGE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CHANGE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CHANGE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Change Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CHANGE__CHANGE_OPERATION = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Characteristic Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CHANGE__CHARACTERISTIC_SPECIFICATIONS = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Processing Effect</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CHANGE__PROCESSING_EFFECT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Characteristic Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_CHANGE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.CharacteristicSpecificationImpl <em>Characteristic Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.CharacteristicSpecificationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getCharacteristicSpecification()
	 * @generated
	 */
	int CHARACTERISTIC_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_SPECIFICATION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_SPECIFICATION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Characteristic Change</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_SPECIFICATION__CHARACTERISTIC_CHANGE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Characteristic Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_SPECIFICATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.DirectCharacteristicImpl <em>Direct Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.DirectCharacteristicImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getDirectCharacteristic()
	 * @generated
	 */
	int DIRECT_CHARACTERISTIC = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_CHARACTERISTIC__ID = CHARACTERISTIC_SPECIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_CHARACTERISTIC__ENTITY_NAME = CHARACTERISTIC_SPECIFICATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Characteristic Change</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_CHARACTERISTIC__CHARACTERISTIC_CHANGE = CHARACTERISTIC_SPECIFICATION__CHARACTERISTIC_CHANGE;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_CHARACTERISTIC__CHARACTERISTIC = CHARACTERISTIC_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Direct Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_CHARACTERISTIC_FEATURE_COUNT = CHARACTERISTIC_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectProvider <em>Processing Effect Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectProvider
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getProcessingEffectProvider()
	 * @generated
	 */
	int PROCESSING_EFFECT_PROVIDER = 8;

	/**
	 * The feature id for the '<em><b>Processing Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_EFFECT_PROVIDER__PROCESSING_EFFECTS = 0;

	/**
	 * The number of structural features of the '<em>Processing Effect Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_EFFECT_PROVIDER_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectSpecification <em>Processing Effect Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Effect Specification</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectSpecification
	 * @generated
	 */
	EClass getProcessingEffectSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectSpecification#getOperationTypes <em>Operation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Types</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectSpecification#getOperationTypes()
	 * @see #getProcessingEffectSpecification()
	 * @generated
	 */
	EReference getProcessingEffectSpecification_OperationTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectSpecification#getProcessingEffects <em>Processing Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processing Effects</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectSpecification#getProcessingEffects()
	 * @see #getProcessingEffectSpecification()
	 * @generated
	 */
	EReference getProcessingEffectSpecification_ProcessingEffects();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectOperationType <em>Processing Effect Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Effect Operation Type</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectOperationType
	 * @generated
	 */
	EClass getProcessingEffectOperationType();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect <em>Processing Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Effect</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect
	 * @generated
	 */
	EClass getProcessingEffect();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect#getFromDataType <em>From Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Data Type</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect#getFromDataType()
	 * @see #getProcessingEffect()
	 * @generated
	 */
	EReference getProcessingEffect_FromDataType();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect#getToDataType <em>To Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Data Type</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect#getToDataType()
	 * @see #getProcessingEffect()
	 * @generated
	 */
	EReference getProcessingEffect_ToDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect#getCharacteristicChanges <em>Characteristic Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characteristic Changes</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffect#getCharacteristicChanges()
	 * @see #getProcessingEffect()
	 * @generated
	 */
	EReference getProcessingEffect_CharacteristicChanges();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.OperationTypeDataProcessingEffect <em>Operation Type Data Processing Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Type Data Processing Effect</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.OperationTypeDataProcessingEffect
	 * @generated
	 */
	EClass getOperationTypeDataProcessingEffect();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.OperationTypeDataProcessingEffect#getRelevantOperationTypes <em>Relevant Operation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relevant Operation Types</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.OperationTypeDataProcessingEffect#getRelevantOperationTypes()
	 * @see #getOperationTypeDataProcessingEffect()
	 * @generated
	 */
	EReference getOperationTypeDataProcessingEffect_RelevantOperationTypes();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.DataCreationProcessingEffect <em>Data Creation Processing Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Creation Processing Effect</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.DataCreationProcessingEffect
	 * @generated
	 */
	EClass getDataCreationProcessingEffect();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange <em>Characteristic Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic Change</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange
	 * @generated
	 */
	EClass getCharacteristicChange();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange#getChangeOperation <em>Change Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Operation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange#getChangeOperation()
	 * @see #getCharacteristicChange()
	 * @generated
	 */
	EAttribute getCharacteristicChange_ChangeOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange#getCharacteristicSpecifications <em>Characteristic Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characteristic Specifications</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange#getCharacteristicSpecifications()
	 * @see #getCharacteristicChange()
	 * @generated
	 */
	EReference getCharacteristicChange_CharacteristicSpecifications();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange#getProcessingEffect <em>Processing Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Processing Effect</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange#getProcessingEffect()
	 * @see #getCharacteristicChange()
	 * @generated
	 */
	EReference getCharacteristicChange_ProcessingEffect();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicSpecification <em>Characteristic Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic Specification</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicSpecification
	 * @generated
	 */
	EClass getCharacteristicSpecification();

	/**
	 * Returns the meta object for the container reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicSpecification#getCharacteristicChange <em>Characteristic Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Characteristic Change</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicSpecification#getCharacteristicChange()
	 * @see #getCharacteristicSpecification()
	 * @generated
	 */
	EReference getCharacteristicSpecification_CharacteristicChange();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.DirectCharacteristic <em>Direct Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Characteristic</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.DirectCharacteristic
	 * @generated
	 */
	EClass getDirectCharacteristic();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.DirectCharacteristic#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Characteristic</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.DirectCharacteristic#getCharacteristic()
	 * @see #getDirectCharacteristic()
	 * @generated
	 */
	EReference getDirectCharacteristic_Characteristic();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectProvider <em>Processing Effect Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Effect Provider</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectProvider
	 * @generated
	 */
	EClass getProcessingEffectProvider();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectProvider#getProcessingEffects <em>Processing Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processing Effects</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectProvider#getProcessingEffects()
	 * @see #getProcessingEffectProvider()
	 * @generated
	 */
	EReference getProcessingEffectProvider_ProcessingEffects();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EffectspecificationFactory getEffectspecificationFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectSpecificationImpl <em>Processing Effect Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectSpecificationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getProcessingEffectSpecification()
		 * @generated
		 */
		EClass PROCESSING_EFFECT_SPECIFICATION = eINSTANCE.getProcessingEffectSpecification();

		/**
		 * The meta object literal for the '<em><b>Operation Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_EFFECT_SPECIFICATION__OPERATION_TYPES = eINSTANCE.getProcessingEffectSpecification_OperationTypes();

		/**
		 * The meta object literal for the '<em><b>Processing Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_EFFECT_SPECIFICATION__PROCESSING_EFFECTS = eINSTANCE.getProcessingEffectSpecification_ProcessingEffects();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectOperationTypeImpl <em>Processing Effect Operation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectOperationTypeImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getProcessingEffectOperationType()
		 * @generated
		 */
		EClass PROCESSING_EFFECT_OPERATION_TYPE = eINSTANCE.getProcessingEffectOperationType();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectImpl <em>Processing Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.ProcessingEffectImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getProcessingEffect()
		 * @generated
		 */
		EClass PROCESSING_EFFECT = eINSTANCE.getProcessingEffect();

		/**
		 * The meta object literal for the '<em><b>From Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_EFFECT__FROM_DATA_TYPE = eINSTANCE.getProcessingEffect_FromDataType();

		/**
		 * The meta object literal for the '<em><b>To Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_EFFECT__TO_DATA_TYPE = eINSTANCE.getProcessingEffect_ToDataType();

		/**
		 * The meta object literal for the '<em><b>Characteristic Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_EFFECT__CHARACTERISTIC_CHANGES = eINSTANCE.getProcessingEffect_CharacteristicChanges();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.OperationTypeDataProcessingEffectImpl <em>Operation Type Data Processing Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.OperationTypeDataProcessingEffectImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getOperationTypeDataProcessingEffect()
		 * @generated
		 */
		EClass OPERATION_TYPE_DATA_PROCESSING_EFFECT = eINSTANCE.getOperationTypeDataProcessingEffect();

		/**
		 * The meta object literal for the '<em><b>Relevant Operation Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_TYPE_DATA_PROCESSING_EFFECT__RELEVANT_OPERATION_TYPES = eINSTANCE.getOperationTypeDataProcessingEffect_RelevantOperationTypes();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.DataCreationProcessingEffectImpl <em>Data Creation Processing Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.DataCreationProcessingEffectImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getDataCreationProcessingEffect()
		 * @generated
		 */
		EClass DATA_CREATION_PROCESSING_EFFECT = eINSTANCE.getDataCreationProcessingEffect();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.CharacteristicChangeImpl <em>Characteristic Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.CharacteristicChangeImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getCharacteristicChange()
		 * @generated
		 */
		EClass CHARACTERISTIC_CHANGE = eINSTANCE.getCharacteristicChange();

		/**
		 * The meta object literal for the '<em><b>Change Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC_CHANGE__CHANGE_OPERATION = eINSTANCE.getCharacteristicChange_ChangeOperation();

		/**
		 * The meta object literal for the '<em><b>Characteristic Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC_CHANGE__CHARACTERISTIC_SPECIFICATIONS = eINSTANCE.getCharacteristicChange_CharacteristicSpecifications();

		/**
		 * The meta object literal for the '<em><b>Processing Effect</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC_CHANGE__PROCESSING_EFFECT = eINSTANCE.getCharacteristicChange_ProcessingEffect();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.CharacteristicSpecificationImpl <em>Characteristic Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.CharacteristicSpecificationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getCharacteristicSpecification()
		 * @generated
		 */
		EClass CHARACTERISTIC_SPECIFICATION = eINSTANCE.getCharacteristicSpecification();

		/**
		 * The meta object literal for the '<em><b>Characteristic Change</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC_SPECIFICATION__CHARACTERISTIC_CHANGE = eINSTANCE.getCharacteristicSpecification_CharacteristicChange();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.DirectCharacteristicImpl <em>Direct Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.DirectCharacteristicImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getDirectCharacteristic()
		 * @generated
		 */
		EClass DIRECT_CHARACTERISTIC = eINSTANCE.getDirectCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECT_CHARACTERISTIC__CHARACTERISTIC = eINSTANCE.getDirectCharacteristic_Characteristic();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectProvider <em>Processing Effect Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectProvider
		 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.impl.EffectspecificationPackageImpl#getProcessingEffectProvider()
		 * @generated
		 */
		EClass PROCESSING_EFFECT_PROVIDER = eINSTANCE.getProcessingEffectProvider();

		/**
		 * The meta object literal for the '<em><b>Processing Effects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_EFFECT_PROVIDER__PROCESSING_EFFECTS = eINSTANCE.getProcessingEffectProvider_ProcessingEffects();

	}

} //EffectspecificationPackage
