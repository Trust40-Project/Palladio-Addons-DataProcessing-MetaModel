package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl;

public class DataImplCustom extends DataImpl {

	private static final String IMPL_SUFFIX = "Impl";
	
	@Override
	public String toString() {
		String className = getClass().getSimpleName();
		if (className.endsWith(IMPL_SUFFIX)) {
			className = className.substring(0, className.length() - IMPL_SUFFIX.length());
		}
		
		return String.format("%s (Name: %s, Id: %s)", className, getEntityName(), getId());
	}

}
