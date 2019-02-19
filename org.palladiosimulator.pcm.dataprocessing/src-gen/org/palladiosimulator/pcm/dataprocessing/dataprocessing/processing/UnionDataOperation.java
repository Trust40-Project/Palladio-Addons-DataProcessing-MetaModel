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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL inputsMustBeResultTypeOrResultEntityType='self.consumedData.type-&gt;forAll(t |\n\tt = self.resultingData.oclAsType(pcm::repository::CollectionDataType).innerType_CollectionDataType or\n\tt.oclAsType(pcm::repository::CollectionDataType).innerType_CollectionDataType = self.resultingData.oclAsType(pcm::repository::CollectionDataType).innerType_CollectionDataType)'"
 * @generated
 */
public interface UnionDataOperation extends ManyToOneDataOperation
{
} // UnionDataOperation
