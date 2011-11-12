package org.jjflyboy.tjpeditor.scoping;

import static java.util.Collections.singletonList;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;
import org.jjflyboy.tjpeditor.project.Global;
import org.jjflyboy.tjpeditor.project.TaskDependency;

/**
 * The point of this provider is to build scopes that are aware of the relative
 * identifier used on task dependency and to resolve them.
 * 
 * TODO: Evaluate and make this work with xtext imports.
 * 
 * @author john
 *
 */
public class ProjectImportedNamespaceAwareLocalScopeProvider extends
		ImportedNamespaceAwareLocalScopeProvider {

	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		// no namespace for task dependency or of its task
		if(context instanceof TaskDependency) {
			return getScope(context.eContainer().eContainer(), reference);
		} else {
			return getScope(context, reference, 1);
		}

	}
	
	/**
	 * Like super.getScope, this is a recursive call, on each recursion,
	 * the next higher scope is created.  'steps' is essentially, the number
	 * of recursions taken upwards to the top of the Project model.
	 * @param context
	 * @param reference
	 * @param steps 
	 * @return
	 */
	protected IScope getScope(EObject context, EReference reference, int steps) {
		IScope result = null;
		if (context.eContainer() != null) {
			result = getScope(context.eContainer(), reference, steps + 1);
		} else {
			// TODO: Doesn't resource scope need step count, too?
			result = getResourceScope(context.eResource(), reference, steps);
		}
		return getLocalElementsScope(result, context, reference, steps);
	}

	/**
	 * 
	 * @param parent
	 * @param context
	 * @param reference
	 * @param steps - the number of steps above the original reference.
	 * @return
	 */
	protected IScope getLocalElementsScope(IScope parent, final EObject context,
			final EReference reference, int steps) {
		IScope result = parent;
		ISelectable allDescriptions = getAllDescriptions(context.eResource());
		QualifiedName name = getQualifiedNameOfLocalElement(context);
		boolean ignoreCase = isIgnoreCase(reference);
		final List<ImportNormalizer> namespaceResolvers = getImportedNamespaceResolvers(context, ignoreCase);
		if (!namespaceResolvers.isEmpty()) {
			if (isRelativeImport() && name!=null) {
				ImportNormalizer localNormalizer = new ProjectImportNormalizer(name, true, ignoreCase, steps); 
				result = createImportScope(result, singletonList(localNormalizer), allDescriptions, reference.getEReferenceType(), isIgnoreCase(reference));
			}
			result = createImportScope(result, namespaceResolvers, null, reference.getEReferenceType(), isIgnoreCase(reference));
		}
		if (context instanceof Global) {
			if(name == null) {
				name = QualifiedName.create("global");
			}
		}
		if (name!=null) {
			ImportNormalizer localNormalizer = new ProjectImportNormalizer(name, true, ignoreCase, steps); 
			result = createImportScope(result, singletonList(localNormalizer), allDescriptions, reference.getEReferenceType(), isIgnoreCase(reference));
		}
		return result;
	}
	
	protected IScope getResourceScope(Resource res, EReference reference, int steps) {
		EObject context = res.getContents().get(0);
		IScope globalScope = getGlobalScope(res, reference);
		List<ImportNormalizer> normalizers = getImplicitImports(isIgnoreCase(reference));
		if (!normalizers.isEmpty()) {
			globalScope = createImportScope(globalScope, normalizers, null, reference.getEReferenceType(), isIgnoreCase(reference));
		}
		return getResourceScope(globalScope, context, reference, steps);
	}
	protected IScope getResourceScope(final IScope parent, final EObject context, final EReference reference, int steps) {
		// TODO: SZ - context may not be a proxy, may it?
		if (context.eResource() == null)
			return parent;
		ISelectable allDescriptions = getAllDescriptions(context.eResource());
		return ProjectSelectableBasedScope.createScope(parent, allDescriptions, reference.getEReferenceType(), isIgnoreCase(reference),steps);
	}

}
