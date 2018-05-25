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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='resultMustBeComposite'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot resultMustBeComposite='\n\t\t\t\tlet resultType = self.resultingData.oclAsType(repository_1::CompositeDataType) in\n\t\t\t\t\tlet requiredDataTypes = resultType-&gt;closure(c | c.parentType_CompositeDataType)-&gt;including(resultType)-&gt;collect(innerDeclaration_CompositeDataType).datatype_InnerDeclaration in\n\t\t\t\t\t\t/*requiredDataTypes-&gt;size() = self.consumedData and requiredDataTypes-&gt;includesAll();\052/\n\t\t\t\t\t\ttrue'"
 * @generated
 */
public interface JoinDataOperation extends ManyToOneDataOperation {
} // JoinDataOperation
