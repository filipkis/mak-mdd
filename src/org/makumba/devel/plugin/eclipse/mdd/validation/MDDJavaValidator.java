package org.makumba.devel.plugin.eclipse.mdd.validation;

import org.eclipse.xtext.validation.Check;
import org.makumba.devel.plugin.eclipse.mdd.MDDUtils;
import org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage;
import org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration;
import org.makumba.devel.plugin.eclipse.mdd.validation.AbstractMDDJavaValidator;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
 

public class MDDJavaValidator extends AbstractMDDJavaValidator {

	@Check
	public void checkUniqueFieldName(final fieldDeclaration field) {
		Iterable<fieldDeclaration> siblings = Iterables.filter(MDDUtils.getSiblingsOf(field),fieldDeclaration.class);
		if(Iterables.find(siblings, new Predicate<fieldDeclaration>() {
			public boolean apply(fieldDeclaration input) {
				if(!input.equals(field) && input.getName().equals(field.getName()))
					return true;
				return false;
			}
		})!=null){
			error("Field name should be unique",EditorPackage.FIELD_DECLARATION__NAME);
		}
	}

}
