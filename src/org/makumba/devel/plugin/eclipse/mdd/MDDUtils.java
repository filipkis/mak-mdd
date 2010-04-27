package org.makumba.devel.plugin.eclipse.mdd;

import java.util.Stack;

import org.makumba.devel.plugin.eclipse.mdd.editor.dataDefinition;
import org.makumba.devel.plugin.eclipse.mdd.editor.declaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.subFieldDeclaration;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public class MDDUtils {

	public static Iterable<declaration> getSiblingsOf(declaration declaration){
		Stack<fieldDeclaration> fieldsHierarchy = new Stack<fieldDeclaration>();
		declaration current = declaration;
		while(current.eContainer() instanceof subFieldDeclaration){
			current = (subFieldDeclaration)current.eContainer();
			fieldsHierarchy.push(((subFieldDeclaration)current).getSubFieldOf());
		}
		
		Iterable<declaration> declarations = ((dataDefinition) current.eContainer()).getD();
		for(fieldDeclaration field : fieldsHierarchy){
			declarations=getSubfieldFieldsOf(field, declarations);
		}
		return declarations;
	}
	
	private static Iterable<declaration> getSubfieldFieldsOf(final fieldDeclaration targetField, final Iterable<declaration> inDeclarations){
		Iterable<subFieldDeclaration> subfieldDeclarations = Iterables.filter(inDeclarations,subFieldDeclaration.class);
		subfieldDeclarations = Iterables.filter(subfieldDeclarations, new Predicate<subFieldDeclaration>() {
			public boolean apply(subFieldDeclaration declaration){
				boolean equals = declaration.getSubFieldOf().equals(targetField);
				return equals;
			}
		});
		return Iterables.transform(subfieldDeclarations, new Function<subFieldDeclaration, declaration>() {
			public declaration apply(subFieldDeclaration from) {
				
				return from.getD();
			}
		});
	}
}
