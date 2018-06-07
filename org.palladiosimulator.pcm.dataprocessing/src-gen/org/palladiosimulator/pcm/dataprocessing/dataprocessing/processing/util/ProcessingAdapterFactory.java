/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicType;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage
 * @generated
 */
public class ProcessingAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProcessingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = ProcessingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingSwitch<Adapter> modelSwitch =
		new ProcessingSwitch<Adapter>()
		{
			@Override
			public Adapter caseDataProcessingContainer(DataProcessingContainer object)
			{
				return createDataProcessingContainerAdapter();
			}
			@Override
			public Adapter caseDataOperation(DataOperation object)
			{
				return createDataOperationAdapter();
			}
			@Override
			public Adapter caseCreateDataOperation(CreateDataOperation object)
			{
				return createCreateDataOperationAdapter();
			}
			@Override
			public Adapter caseLoadDataOperation(LoadDataOperation object)
			{
				return createLoadDataOperationAdapter();
			}
			@Override
			public Adapter caseLoadAllDataOperation(LoadAllDataOperation object)
			{
				return createLoadAllDataOperationAdapter();
			}
			@Override
			public Adapter casePerformDataTransmissionOperation(PerformDataTransmissionOperation object)
			{
				return createPerformDataTransmissionOperationAdapter();
			}
			@Override
			public Adapter caseConsumeDataOperation(ConsumeDataOperation object)
			{
				return createConsumeDataOperationAdapter();
			}
			@Override
			public Adapter caseStoreDataOperation(StoreDataOperation object)
			{
				return createStoreDataOperationAdapter();
			}
			@Override
			public Adapter caseReturnDataOperation(ReturnDataOperation object)
			{
				return createReturnDataOperationAdapter();
			}
			@Override
			public Adapter caseDataMapping(DataMapping object)
			{
				return createDataMappingAdapter();
			}
			@Override
			public Adapter caseDataParameterMapping(DataParameterMapping object)
			{
				return createDataParameterMappingAdapter();
			}
			@Override
			public Adapter caseDataResultMapping(DataResultMapping object)
			{
				return createDataResultMappingAdapter();
			}
			@Override
			public Adapter caseManyToOneDataOperation(ManyToOneDataOperation object)
			{
				return createManyToOneDataOperationAdapter();
			}
			@Override
			public Adapter caseJoinDataOperation(JoinDataOperation object)
			{
				return createJoinDataOperationAdapter();
			}
			@Override
			public Adapter caseUnionDataOperation(UnionDataOperation object)
			{
				return createUnionDataOperationAdapter();
			}
			@Override
			public Adapter caseTransformDataOperation(TransformDataOperation object)
			{
				return createTransformDataOperationAdapter();
			}
			@Override
			public Adapter caseProjectionDataOperation(ProjectionDataOperation object)
			{
				return createProjectionDataOperationAdapter();
			}
			@Override
			public Adapter caseSelectionDataOperation(SelectionDataOperation object)
			{
				return createSelectionDataOperationAdapter();
			}
			@Override
			public <T extends CharacteristicType> Adapter caseCharacteristicChangingDataOperation(CharacteristicChangingDataOperation<T> object)
			{
				return createCharacteristicChangingDataOperationAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object)
			{
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object)
			{
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object)
			{
				return createEntityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataProcessingContainer <em>Data Processing Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataProcessingContainer
	 * @generated
	 */
	public Adapter createDataProcessingContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation <em>Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation
	 * @generated
	 */
	public Adapter createDataOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CreateDataOperation <em>Create Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CreateDataOperation
	 * @generated
	 */
	public Adapter createCreateDataOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.LoadDataOperation <em>Load Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.LoadDataOperation
	 * @generated
	 */
	public Adapter createLoadDataOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.LoadAllDataOperation <em>Load All Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.LoadAllDataOperation
	 * @generated
	 */
	public Adapter createLoadAllDataOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation <em>Perform Data Transmission Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation
	 * @generated
	 */
	public Adapter createPerformDataTransmissionOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ConsumeDataOperation <em>Consume Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ConsumeDataOperation
	 * @generated
	 */
	public Adapter createConsumeDataOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.StoreDataOperation <em>Store Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.StoreDataOperation
	 * @generated
	 */
	public Adapter createStoreDataOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ReturnDataOperation <em>Return Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ReturnDataOperation
	 * @generated
	 */
	public Adapter createReturnDataOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataMapping <em>Data Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataMapping
	 * @generated
	 */
	public Adapter createDataMappingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataParameterMapping <em>Data Parameter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataParameterMapping
	 * @generated
	 */
	public Adapter createDataParameterMappingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataResultMapping <em>Data Result Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataResultMapping
	 * @generated
	 */
	public Adapter createDataResultMappingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ManyToOneDataOperation <em>Many To One Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ManyToOneDataOperation
	 * @generated
	 */
	public Adapter createManyToOneDataOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.JoinDataOperation <em>Join Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.JoinDataOperation
	 * @generated
	 */
	public Adapter createJoinDataOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.UnionDataOperation <em>Union Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.UnionDataOperation
	 * @generated
	 */
	public Adapter createUnionDataOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation <em>Transform Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation
	 * @generated
	 */
	public Adapter createTransformDataOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProjectionDataOperation <em>Projection Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProjectionDataOperation
	 * @generated
	 */
	public Adapter createProjectionDataOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.SelectionDataOperation <em>Selection Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.SelectionDataOperation
	 * @generated
	 */
	public Adapter createSelectionDataOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangingDataOperation <em>Characteristic Changing Data Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.CharacteristicChangingDataOperation
	 * @generated
	 */
	public Adapter createCharacteristicChangingDataOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.core.entity.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.core.entity.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //ProcessingAdapterFactory
