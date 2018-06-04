package org.palladiosimulator.pcm.dataprocessing.mwe2.component;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.Mapping;

public class ReplacementComponent extends AbstractWorkflowComponent2 {

	private final Collection<Replacement> replacements = new ArrayList<>();
	
	private Charset charset = StandardCharsets.UTF_8;
	
	public void setCharset(Charset charset) {
		this.charset = charset;
	}
	
	public void addReplacement(Replacement replacement) {
		replacements.add(replacement);
	}
	
	@Override
	protected void invokeInternal(WorkflowContext arg0, ProgressMonitor arg1, Issues arg2) {
		arg1.beginTask("Replacing patterns for files", replacements.size());
		for (Replacement replacement : replacements) {
			try {
				executeReplacement(replacement);
				arg1.worked(1);
			} catch (IOException e) {
				arg2.addError("Replacement failed.", e);
				return;
			}
		}
		arg1.done();
	}

	private void executeReplacement(Replacement replacement) throws IOException {
		List<String> filenames = Arrays.asList(replacement.getFilename());
		if (replacement.getFilename().contains("*")) {
			String filename = replacement.getFilename();
			int separatorIndex = filename.substring(0, filename.indexOf('*')).lastIndexOf('/');
			String baseDirString = filename.substring(0, separatorIndex);
			String matchString = filename.substring(separatorIndex + 1);
			Path basePath = Paths.get(baseDirString).toAbsolutePath().normalize();
			PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:" + matchString);
			filenames = Files.walk(basePath).filter(matcher::matches).map(Path::toString).collect(Collectors.toList());
		}
		replace(filenames, replacement.getMappings());
	}
	
	private void replace(Collection<String> filenames, Collection<Mapping> replacements) throws IOException {
		for (String filename: filenames) {
			replace(filename, replacements);
		}
	}
	
	private void replace(String filename, Collection<Mapping> replacements) throws IOException {
		Path filePath = Paths.get(filename);
		String content = new String(Files.readAllBytes(filePath), charset);
		for (Mapping replacement : replacements) {
			content = content.replaceAll(replacement.getFrom(), replacement.getTo());			
		}
		Files.write(filePath, content.getBytes(charset));
	}

}