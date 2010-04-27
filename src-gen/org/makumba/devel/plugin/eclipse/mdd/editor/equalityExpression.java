/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>equality Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.equalityExpression#getR <em>R</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getequalityExpression()
 * @model
 * @generated
 */
public interface equalityExpression extends negatedExpression
{
  /**
   * Returns the value of the '<em><b>R</b></em>' containment reference list.
   * The list contents are of type {@link org.makumba.devel.plugin.eclipse.mdd.editor.relationalExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>R</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>R</em>' containment reference list.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getequalityExpression_R()
   * @model containment="true"
   * @generated
   */
  EList<relationalExpression> getR();

} // equalityExpression
