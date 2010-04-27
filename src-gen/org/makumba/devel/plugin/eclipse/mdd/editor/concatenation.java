/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>concatenation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getA <em>A</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getI <em>I</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getB <em>B</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getC <em>C</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getL <em>L</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getP <em>P</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getconcatenation()
 * @model
 * @generated
 */
public interface concatenation extends relationalExpression
{
  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference list.
   * The list contents are of type {@link org.makumba.devel.plugin.eclipse.mdd.editor.additiveExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference list.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getconcatenation_A()
   * @model containment="true"
   * @generated
   */
  EList<additiveExpression> getA();

  /**
   * Returns the value of the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>I</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>I</em>' containment reference.
   * @see #setI(compoundExpr)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getconcatenation_I()
   * @model containment="true"
   * @generated
   */
  compoundExpr getI();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getI <em>I</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>I</em>' containment reference.
   * @see #getI()
   * @generated
   */
  void setI(compoundExpr value);

  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference.
   * @see #setB(betweenList)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getconcatenation_B()
   * @model containment="true"
   * @generated
   */
  betweenList getB();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getB <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' containment reference.
   * @see #getB()
   * @generated
   */
  void setB(betweenList value);

  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(concatenation)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getconcatenation_C()
   * @model containment="true"
   * @generated
   */
  concatenation getC();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(concatenation value);

  /**
   * Returns the value of the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' containment reference.
   * @see #setL(likeEscape)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getconcatenation_L()
   * @model containment="true"
   * @generated
   */
  likeEscape getL();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(likeEscape value);

  /**
   * Returns the value of the '<em><b>P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' attribute.
   * @see #setP(String)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getconcatenation_P()
   * @model
   * @generated
   */
  String getP();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getP <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' attribute.
   * @see #getP()
   * @generated
   */
  void setP(String value);

} // concatenation
