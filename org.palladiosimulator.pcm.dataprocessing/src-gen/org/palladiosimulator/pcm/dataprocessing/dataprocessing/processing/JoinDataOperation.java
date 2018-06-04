/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Data Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getJoinDataOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='resultMustBeCompositeOfInputs'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot resultMustBeCompositeOfInputs='\n\t\t\t\tlet resultInnerDeclarations = self.resultingData.oclAsType(repository_1::CompositeDataType).innerDeclaration_CompositeDataType in\n\t\t\t\t\tresultInnerDeclarations.datatype_InnerDeclaration = self.consumedData.type'"
 * @generated
 */
public interface JoinDataOperation extends ManyToOneDataOperation
{
} // JoinDataOperation
