package org.palladiosimulator.pcm.dataprocessing.dataprocessing.util;

import java.util.function.Function;

import org.palladiosimulator.pcm.core.entity.Entity;

public class DefaultLabelProvider {

	public static String getLabel(Object object, String typeString, Function<Object, String> defaultLabelProvider) {
		if (object instanceof Entity) {
			Entity entity = (Entity)object;
			return String.format("%s %s (%s)", typeString, entity.getEntityName(), entity.getId());
		}
		return defaultLabelProvider.apply(object);
	}
	
}
