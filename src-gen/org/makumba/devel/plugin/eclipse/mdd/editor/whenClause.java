/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>when Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.whenClause#getWhenExpr <em>When Expr</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.whenClause#getThenExpr <em>Then Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getwhenClause()
 * @model
 * @generated
 */
public interface whenClause extends EObject
{
  /**
   * Returns the value of the '<em><b>When Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When Expr</em>' containment reference.
   * @see #setWhenExpr(expression)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getwhenClause_WhenExpr()
   * @model containment="true"
   * @generated
   */
  expression getWhenExpr();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.whenClause#getWhenExpr <em>When Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When Expr</em>' containment reference.
   * @see #getWhenExpr()
   * @generated
   */
  void setWhenExpr(expression value);

  /**
   * Returns the value of the '<em><b>Then Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Expr</em>' containment reference.
   * @see #setThenExpr(unaryExpression)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getwhenClause_ThenExpr()
   * @model containment="true"
   * @generated
   */
  unaryExpression getThenExpr();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.whenClause#getThenExpr <em>Then Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Expr</em>' containment reference.
   * @see #getThenExpr()
   * @generated
   */
  void setThenExpr(unaryExpression value);

} // whenClause
