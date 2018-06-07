package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.extension;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataProcessingContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.EcoreUtils;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.ItemPropertyDescriptorWrapper;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.ProfileConstants;

public abstract class ParameterChoiceItePropertyDescriptorWrapper extends ItemPropertyDescriptorWrapper {

	private final Class<? extends EObject> parentClass;
	private final String parentStereotype;
	
	public ParameterChoiceItePropertyDescriptorWrapper(IItemPropertyDescriptor descriptor) {
		this(descriptor, DataProcessingContainer.class, ProfileConstants.STEREOTYPE_NAME_DATA_PROCESSING);
	}
	
	public ParameterChoiceItePropertyDescriptorWrapper(IItemPropertyDescriptor descriptor, Class<? extends EObject> parentClass, String parentStereotype) {
		super(descriptor);
		this.parentClass = parentClass;
		this.parentStereotype = parentStereotype;
	}

	@Override
	public Collection<?> getChoiceOfValues(Object object) {
		if (object instanceof EObject) {
			EObject eobject = (EObject) object;
			Collection<EObject> stereotypedElements = EcoreUtils
					.findParent(eobject, parentClass)
					.map(c -> EcoreUtils.getStereotypedElements(parentStereotype, c))
					.orElse(Collections.emptyList());
			List<Object> choiceOfValues = stereotypedElements.stream().map(this::processStereotypedElement).flatMap(Collection::stream).filter(Objects::nonNull).collect(Collectors.toList());
			if (!choiceOfValues.isEmpty()) {
				return choiceOfValues;
			}
		}
		return super.getChoiceOfValues(object);
	}
	
	protected abstract Collection<Object> processStereotypedElement(EObject stereotypedElement);

}
