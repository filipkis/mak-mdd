/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>else Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.elseClause#getU <em>U</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getelseClause()
 * @model
 * @generated
 */
public interface elseClause extends EObject
{
  /**
   * Returns the value of the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>U</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>U</em>' containment reference.
   * @see #setU(unaryExpression)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getelseClause_U()
   * @model containment="true"
   * @generated
   */
  unaryExpression getU();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.elseClause#getU <em>U</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>U</em>' containment reference.
   * @see #getU()
   * @generated
   */
  void setU(unaryExpression value);

} // elseClause
