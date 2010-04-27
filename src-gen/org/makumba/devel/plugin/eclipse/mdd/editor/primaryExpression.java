/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>primary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression#getE <em>E</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression#getExp <em>Exp</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression#getIdent <em>Ident</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getprimaryExpression()
 * @model
 * @generated
 */
public interface primaryExpression extends atom
{
  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference list.
   * The list contents are of type {@link org.makumba.devel.plugin.eclipse.mdd.editor.exprList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference list.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getprimaryExpression_E()
   * @model containment="true"
   * @generated
   */
  EList<exprList> getE();

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
   * The list contents are of type {@link org.makumba.devel.plugin.eclipse.mdd.editor.expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference list.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getprimaryExpression_Exp()
   * @model containment="true"
   * @generated
   */
  EList<expression> getExp();

  /**
   * Returns the value of the '<em><b>Ident</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ident</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ident</em>' containment reference.
   * @see #setIdent(identPrimary)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getprimaryExpression_Ident()
   * @model containment="true"
   * @generated
   */
  identPrimary getIdent();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression#getIdent <em>Ident</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ident</em>' containment reference.
   * @see #getIdent()
   * @generated
   */
  void setIdent(identPrimary value);

  /**
   * Returns the value of the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' containment reference.
   * @see #setS(unionRule)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getprimaryExpression_S()
   * @model containment="true"
   * @generated
   */
  unionRule getS();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression#getS <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S</em>' containment reference.
   * @see #getS()
   * @generated
   */
  void setS(unionRule value);

} // primaryExpression
