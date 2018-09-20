/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Data Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getSelectionDataOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='inputAndOutputHaveSameEntityType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot inputAndOutputHaveSameEntityType='self.input.type-&gt;oclAsSet() = self.output.type-&gt;oclAsSet() or self.input.type.oclAsType(repository_1::CollectionDataType).innerType_CollectionDataType-&gt;oclAsSet() = self.output.type-&gt;oclAsSet()'"
 * @generated
 */
public interface SelectionDataOperation extends TransformDataOperation
{
} // SelectionDataOperation
