/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>case Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.caseExpression#getW <em>W</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.caseExpression#getE <em>E</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.caseExpression#getA <em>A</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getcaseExpression()
 * @model
 * @generated
 */
public interface caseExpression extends unaryExpression
{
  /**
   * Returns the value of the '<em><b>W</b></em>' containment reference list.
   * The list contents are of type {@link org.makumba.devel.plugin.eclipse.mdd.editor.whenClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>W</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>W</em>' containment reference list.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getcaseExpression_W()
   * @model containment="true"
   * @generated
   */
  EList<whenClause> getW();

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(elseClause)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getcaseExpression_E()
   * @model containment="true"
   * @generated
   */
  elseClause getE();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.caseExpression#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(elseClause value);

  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference list.
   * The list contents are of type {@link org.makumba.devel.plugin.eclipse.mdd.editor.altWhenClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference list.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getcaseExpression_A()
   * @model containment="true"
   * @generated
   */
  EList<altWhenClause> getA();

} // caseExpression
