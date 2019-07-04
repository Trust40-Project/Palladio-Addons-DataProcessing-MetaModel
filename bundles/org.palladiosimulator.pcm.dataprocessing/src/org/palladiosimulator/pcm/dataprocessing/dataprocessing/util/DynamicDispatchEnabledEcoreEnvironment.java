package org.palladiosimulator.pcm.dataprocessing.dataprocessing.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.TypeChecker;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironment;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.eclipse.ocl.types.OCLStandardLibrary;
import org.eclipse.ocl.utilities.PredefinedType;

public class DynamicDispatchEnabledEcoreEnvironment extends EcoreEnvironment {

	public DynamicDispatchEnabledEcoreEnvironment(EcoreEnvironmentFactory fac, Resource resource) {
		super(fac, resource);
	}

	public DynamicDispatchEnabledEcoreEnvironment(
			Environment<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> parent) {
		super(parent);
	}

	protected TypeChecker<EClassifier, EOperation, EStructuralFeature> createTypeChecker() {
		return new DynamicDispatchEnabledCachedTypeChecker<EClassifier, EOperation, EStructuralFeature, EParameter>(
				this);
	}

	@Override
	public List<EOperation> getAdditionalOperations(EClassifier classifier) {
		ArrayList<EOperation> result = new ArrayList<>(super.getAdditionalOperations(classifier));
		if ("EClass".equals(classifier.getName())) {
			OCLStandardLibrary<EClassifier> stdlib = getOCLStandardLibrary();
			EOperation allInstancesOp = getUMLReflection().createOperation(PredefinedType.ALL_INSTANCES_NAME,
					stdlib.getSet(), Collections.emptyList(), Collections.emptyList());
			result.add(allInstancesOp);
		}
		return result;
	}

}
