/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>selected Properties List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectedPropertiesList#getA <em>A</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getselectedPropertiesList()
 * @model
 * @generated
 */
public interface selectedPropertiesList extends EObject
{
  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference list.
   * The list contents are of type {@link org.makumba.devel.plugin.eclipse.mdd.editor.aliasedExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference list.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getselectedPropertiesList_A()
   * @model containment="true"
   * @generated
   */
  EList<aliasedExpression> getA();

} // selectedPropertiesList
