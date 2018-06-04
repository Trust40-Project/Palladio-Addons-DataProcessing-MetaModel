/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union Data Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage#getUnionDataOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='inputsMustBeResultTypeOrResultEntityType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot inputsMustBeResultTypeOrResultEntityType='\n\t\t\t\tlet entityType = self.resultingData.oclAsType(repository_1::CollectionDataType).innerType_CollectionDataType in\n\t\t\t\t\tself.consumedData.type-&gt;forAll(t |\n\t\t\t\t\t\tt = entityType or t.oclAsType(repository_1::CollectionDataType).innerType_CollectionDataType = entityType)'"
 * @generated
 */
public interface UnionDataOperation extends ManyToOneDataOperation
{
} // UnionDataOperation
