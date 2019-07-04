package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl;

public class CharacteristicTypeImplCustom extends CharacteristicTypeImpl {

	public String toString() {
		return String.format("%s (Name: %s, Id: %s)", eClass().getName(), getEntityName(), getId());
	}
	
}
