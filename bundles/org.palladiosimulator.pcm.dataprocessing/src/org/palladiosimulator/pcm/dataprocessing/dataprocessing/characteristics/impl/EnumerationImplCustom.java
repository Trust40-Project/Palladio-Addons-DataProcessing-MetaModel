package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.EnumerationImpl;

public class EnumerationImplCustom extends EnumerationImpl {

	@Override
	public String toString() {
		return String.format("%s (Name: %s, Id: %s)", eClass().getName(), getEntityName(), getId());
	}

}
