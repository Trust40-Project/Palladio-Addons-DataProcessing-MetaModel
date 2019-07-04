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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL resultMustBeCompositeOfInputs='self.resultingData.type.oclAsType(pcm::repository::CompositeDataType).innerDeclaration_CompositeDataType.datatype_InnerDeclaration-&gt;asSet() = self.consumedData.type-&gt;asSet()'"
 * @generated
 */
public interface JoinDataOperation extends ManyToOneDataOperation
{
} // JoinDataOperation
