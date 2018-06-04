package org.palladiosimulator.pcm.dataprocessing.mwe2.component;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.mwe.utils.Mapping;

public class Replacement {

	private String filename;
	private Collection<Mapping> mappings = new ArrayList<>();
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public Collection<Mapping> getMappings() {
		return mappings;
	}
	public void addMapping(Mapping mapping) {
		mappings.add(mapping);
	}
	
}
