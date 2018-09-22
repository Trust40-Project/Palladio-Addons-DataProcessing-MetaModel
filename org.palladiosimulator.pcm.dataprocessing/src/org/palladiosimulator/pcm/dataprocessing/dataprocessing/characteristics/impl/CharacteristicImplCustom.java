package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl;

public class CharacteristicImplCustom extends CharacteristicImpl {

	@Override
	public String toString() {
		return String.format("%s (Type: %s, Id: %s)", eClass().getName(), getCharacteristicType(), getId());
	}
	
}
