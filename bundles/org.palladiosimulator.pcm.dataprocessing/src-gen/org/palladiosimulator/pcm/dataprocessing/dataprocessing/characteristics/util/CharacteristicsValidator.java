/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.util;

import de.uka.ipd.sdq.identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage
 * @generated
 */
public class CharacteristicsValidator extends EObjectValidator
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CharacteristicsValidator INSTANCE = new CharacteristicsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierValidator identifierValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicsValidator()
	{
		super();
		identifierValidator = IdentifierValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage()
	{
	  return CharacteristicsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		switch (classifierID)
		{
			case CharacteristicsPackage.CHARACTERIZABLE:
				return validateCharacterizable((Characterizable)value, diagnostics, context);
			case CharacteristicsPackage.CHARACTERISTIC_TYPE_CONTAINER:
				return validateCharacteristicTypeContainer((CharacteristicTypeContainer)value, diagnostics, context);
			case CharacteristicsPackage.CHARACTERISTIC_TYPE:
				return validateCharacteristicType((CharacteristicType)value, diagnostics, context);
			case CharacteristicsPackage.ENUM_CHARACTERISTIC_TYPE:
				return validateEnumCharacteristicType((EnumCharacteristicType)value, diagnostics, context);
			case CharacteristicsPackage.ENUM_CHARACTERISTIC_LITERAL:
				return validateEnumCharacteristicLiteral((EnumCharacteristicLiteral)value, diagnostics, context);
			case CharacteristicsPackage.CHARACTERISTIC_CONTAINER:
				return validateCharacteristicContainer((CharacteristicContainer)value, diagnostics, context);
			case CharacteristicsPackage.CHARACTERISTIC:
				return validateCharacteristic((Characteristic)value, diagnostics, context);
			case CharacteristicsPackage.ENUM_CHARACTERISTIC:
				return validateEnumCharacteristic((EnumCharacteristic)value, diagnostics, context);
			case CharacteristicsPackage.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			case CharacteristicsPackage.RELATED_CHARACTERISTICS:
				return validateRelatedCharacteristics((RelatedCharacteristics)value, diagnostics, context);
			case CharacteristicsPackage.STORE_CHARACTERISTIC_CONTAINER:
				return validateStoreCharacteristicContainer((StoreCharacteristicContainer)value, diagnostics, context);
			case CharacteristicsPackage.STORE_CHARACTERISTICS:
				return validateStoreCharacteristics((StoreCharacteristics)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterizable(Characterizable characterizable, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint((EObject)characterizable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicTypeContainer(CharacteristicTypeContainer characteristicTypeContainer, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)characteristicTypeContainer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)characteristicTypeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)characteristicTypeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)characteristicTypeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)characteristicTypeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)characteristicTypeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)characteristicTypeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)characteristicTypeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)characteristicTypeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(characteristicTypeContainer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicType(CharacteristicType characteristicType, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)characteristicType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)characteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)characteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)characteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)characteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)characteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)characteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)characteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)characteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(characteristicType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumCharacteristicType(EnumCharacteristicType enumCharacteristicType, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)enumCharacteristicType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)enumCharacteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)enumCharacteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)enumCharacteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)enumCharacteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)enumCharacteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)enumCharacteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)enumCharacteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)enumCharacteristicType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(enumCharacteristicType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumCharacteristicLiteral(EnumCharacteristicLiteral enumCharacteristicLiteral, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)enumCharacteristicLiteral, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)enumCharacteristicLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)enumCharacteristicLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)enumCharacteristicLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)enumCharacteristicLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)enumCharacteristicLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)enumCharacteristicLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)enumCharacteristicLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)enumCharacteristicLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(enumCharacteristicLiteral, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicContainer(CharacteristicContainer characteristicContainer, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)characteristicContainer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)characteristicContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)characteristicContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)characteristicContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)characteristicContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)characteristicContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)characteristicContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)characteristicContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)characteristicContainer, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(characteristicContainer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristic(Characteristic characteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)characteristic, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)characteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)characteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)characteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)characteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)characteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)characteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)characteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)characteristic, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(characteristic, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumCharacteristic(EnumCharacteristic enumCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)enumCharacteristic, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)enumCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)enumCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)enumCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)enumCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)enumCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)enumCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)enumCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)enumCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(enumCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumCharacteristic_valueCountMustMatchTypeRestriction(enumCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumCharacteristic_literalsMustBelongToCorrectEnum(enumCharacteristic, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the valueCountMustMatchTypeRestriction constraint of '<em>Enum Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENUM_CHARACTERISTIC__VALUE_COUNT_MUST_MATCH_TYPE_RESTRICTION__EEXPRESSION = "self.literals->size() < 2 or self.type.multipleChoice";

	/**
	 * Validates the valueCountMustMatchTypeRestriction constraint of '<em>Enum Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumCharacteristic_valueCountMustMatchTypeRestriction(EnumCharacteristic enumCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(CharacteristicsPackage.Literals.ENUM_CHARACTERISTIC,
				 (EObject)enumCharacteristic,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "valueCountMustMatchTypeRestriction",
				 ENUM_CHARACTERISTIC__VALUE_COUNT_MUST_MATCH_TYPE_RESTRICTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the literalsMustBelongToCorrectEnum constraint of '<em>Enum Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENUM_CHARACTERISTIC__LITERALS_MUST_BELONG_TO_CORRECT_ENUM__EEXPRESSION = "self.type.enum.literals->includesAll(self.literals)";

	/**
	 * Validates the literalsMustBelongToCorrectEnum constraint of '<em>Enum Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumCharacteristic_literalsMustBelongToCorrectEnum(EnumCharacteristic enumCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return
			validate
				(CharacteristicsPackage.Literals.ENUM_CHARACTERISTIC,
				 (EObject)enumCharacteristic,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "literalsMustBelongToCorrectEnum",
				 ENUM_CHARACTERISTIC__LITERALS_MUST_BELONG_TO_CORRECT_ENUM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)enumeration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(enumeration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedCharacteristics(RelatedCharacteristics relatedCharacteristics, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)relatedCharacteristics, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)relatedCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)relatedCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)relatedCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)relatedCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)relatedCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)relatedCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)relatedCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)relatedCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(relatedCharacteristics, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoreCharacteristicContainer(StoreCharacteristicContainer storeCharacteristicContainer, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)storeCharacteristicContainer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)storeCharacteristicContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)storeCharacteristicContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)storeCharacteristicContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)storeCharacteristicContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)storeCharacteristicContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)storeCharacteristicContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)storeCharacteristicContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)storeCharacteristicContainer, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(storeCharacteristicContainer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoreCharacteristics(StoreCharacteristics storeCharacteristics, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment((EObject)storeCharacteristics, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)storeCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)storeCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)storeCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)storeCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)storeCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)storeCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)storeCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)storeCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(storeCharacteristics, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CharacteristicsValidator
