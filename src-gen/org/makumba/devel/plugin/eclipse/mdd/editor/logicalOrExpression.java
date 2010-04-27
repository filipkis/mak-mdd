/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>logical Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.logicalOrExpression#getL <em>L</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getlogicalOrExpression()
 * @model
 * @generated
 */
public interface logicalOrExpression extends expression
{
  /**
   * Returns the value of the '<em><b>L</b></em>' containment reference list.
   * The list contents are of type {@link org.makumba.devel.plugin.eclipse.mdd.editor.logicalAndExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' containment reference list.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getlogicalOrExpression_L()
   * @model containment="true"
   * @generated
   */
  EList<logicalAndExpression> getL();

} // logicalOrExpression
