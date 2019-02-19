package org.palladiosimulator.pcm.dataprocessing.dataprocessing.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.ecore.internal.OCLStandardLibraryImpl;
import org.eclipse.ocl.internal.evaluation.CachedTypeChecker;

public class DynamicDispatchEnabledCachedTypeChecker<C, O, P, PM> extends CachedTypeChecker<C, O, P, PM> {

	public DynamicDispatchEnabledCachedTypeChecker(Environment<?, C, O, P, ?, PM, ?, ?, ?, ?, ?, ?> environment) {
		super(environment);
	}

	@Override
	public List<O> getOperations(C owner) {
		List<O> operations = new ArrayList<>(super.getOperations(owner));
		if (owner == OCLStandardLibraryImpl.INSTANCE.getOclAny()) {
			// TODO we should add all operations of EObject here
			operations.add((O) EcorePackage.Literals.EOBJECT___ECONTAINER);
		}
		return operations;
	}

}
