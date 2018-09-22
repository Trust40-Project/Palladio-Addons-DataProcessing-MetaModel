package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.impl;

public class DataImplCustom extends DataImpl {

	@Override
	public String toString() {
		return String.format("%s (Name: %s, Id: %s)", eClass().getName(), getEntityName(), getId());
	}

}
