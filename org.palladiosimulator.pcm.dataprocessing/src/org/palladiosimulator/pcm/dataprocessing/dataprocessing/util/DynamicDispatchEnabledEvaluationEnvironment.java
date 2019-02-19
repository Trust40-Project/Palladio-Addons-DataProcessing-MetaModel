package org.palladiosimulator.pcm.dataprocessing.dataprocessing.util;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.EcoreEvaluationEnvironment;
import org.eclipse.ocl.ecore.internal.OCLStandardLibraryImpl;
import org.eclipse.ocl.options.EvaluationOptions;
import org.eclipse.ocl.util.Bag;

public class DynamicDispatchEnabledEvaluationEnvironment extends EcoreEvaluationEnvironment {

	@Deprecated
	public DynamicDispatchEnabledEvaluationEnvironment() {
		super();
		enableDynamicDispatching();
	}

	public DynamicDispatchEnabledEvaluationEnvironment(EcoreEnvironmentFactory factory) {
		super(factory);
		enableDynamicDispatching();
	}

	public DynamicDispatchEnabledEvaluationEnvironment(
			EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject> parent) {
		super(parent);
		enableDynamicDispatching();
	}

	protected void enableDynamicDispatching() {
		setOption(EvaluationOptions.DYNAMIC_DISPATCH, true);
	}

	@Override
	public EClassifier getType(Object object) {
		if (object instanceof HashSet) {
			return OCLStandardLibraryImpl.INSTANCE.getSet();
		} else if (object instanceof LinkedHashSet) {
			return OCLStandardLibraryImpl.INSTANCE.getOrderedSet();
		} else if (object instanceof List) {
			return OCLStandardLibraryImpl.INSTANCE.getSequence();
		} else if (object instanceof Bag) {
			return OCLStandardLibraryImpl.INSTANCE.getBag();
		}
		return super.getType(object);
	}

}
