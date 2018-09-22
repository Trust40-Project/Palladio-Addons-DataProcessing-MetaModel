package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl;

public class EnumCharacteristicLiteralImplCustom extends EnumCharacteristicLiteralImpl {

	@Override
	public String toString() {
		return String.format("%s (Name: %s, Id: %s)", eClass().getName(), getEntityName(), getId());
	}
	
}
