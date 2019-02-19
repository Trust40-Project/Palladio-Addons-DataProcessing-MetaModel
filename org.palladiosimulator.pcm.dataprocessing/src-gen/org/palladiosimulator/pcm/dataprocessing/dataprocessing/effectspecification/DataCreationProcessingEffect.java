/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Creation Processing Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage#getDataCreationProcessingEffect()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='fromDataTypeHasToBeUndefined'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL fromDataTypeHasToBeUndefined='fromDataType.oclIsUndefined()'"
 * @generated
 */
public interface DataCreationProcessingEffect extends ProcessingEffect
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" operationRequired="true" resultDataRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='operation.oclIsTypeOf(processing::CreateDataOperation) and\ntoDataType = operation.oclAsType(processing::CreateDataOperation).resultingData.type'"
	 * @generated
	 */
	boolean isApplicableTo(DataOperation operation, Data resultData);

} // DataCreationProcessingEffect
