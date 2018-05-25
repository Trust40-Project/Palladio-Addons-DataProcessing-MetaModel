/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.util;

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
public class CharacteristicsValidator extends EObjectValidator {
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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CharacteristicsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
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
				return validateCharacteristic((Characteristic<?>)value, diagnostics, context);
			case CharacteristicsPackage.ENUM_CHARACTERISTIC:
				return validateEnumCharacteristic((EnumCharacteristic)value, diagnostics, context);
			case CharacteristicsPackage.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterizable(Characterizable characterizable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)characterizable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicTypeContainer(CharacteristicTypeContainer characteristicTypeContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)characteristicTypeContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicType(CharacteristicType characteristicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)characteristicType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumCharacteristicType(EnumCharacteristicType enumCharacteristicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)enumCharacteristicType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumCharacteristicLiteral(EnumCharacteristicLiteral enumCharacteristicLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)enumCharacteristicLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicContainer(CharacteristicContainer characteristicContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)characteristicContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristic(Characteristic<?> characteristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)characteristic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumCharacteristic(EnumCharacteristic enumCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)enumCharacteristic, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)enumCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)enumCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)enumCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)enumCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)enumCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)enumCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)enumCharacteristic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)enumCharacteristic, diagnostics, context);
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
	protected static final String ENUM_CHARACTERISTIC__VALUE_COUNT_MUST_MATCH_TYPE_RESTRICTION__EEXPRESSION = "self.values->size() < 2 or self.type.oclAsType(EnumCharacteristicType).multipleChoice";

	/**
	 * Validates the valueCountMustMatchTypeRestriction constraint of '<em>Enum Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumCharacteristic_valueCountMustMatchTypeRestriction(EnumCharacteristic enumCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CharacteristicsPackage.Literals.ENUM_CHARACTERISTIC,
				 (EObject)enumCharacteristic,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
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
	protected static final String ENUM_CHARACTERISTIC__LITERALS_MUST_BELONG_TO_CORRECT_ENUM__EEXPRESSION = "self.type.oclAsType(EnumCharacteristicType).enum.literals->includesAll(self.values)";

	/**
	 * Validates the literalsMustBelongToCorrectEnum constraint of '<em>Enum Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumCharacteristic_literalsMustBelongToCorrectEnum(EnumCharacteristic enumCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CharacteristicsPackage.Literals.ENUM_CHARACTERISTIC,
				 (EObject)enumCharacteristic,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
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
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)enumeration, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CharacteristicsValidator
