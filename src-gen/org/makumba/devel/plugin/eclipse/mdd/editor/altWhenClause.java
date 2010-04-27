/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>alt When Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.altWhenClause#getW <em>W</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.altWhenClause#getT <em>T</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getaltWhenClause()
 * @model
 * @generated
 */
public interface altWhenClause extends EObject
{
  /**
   * Returns the value of the '<em><b>W</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>W</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>W</em>' containment reference.
   * @see #setW(unaryExpression)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getaltWhenClause_W()
   * @model containment="true"
   * @generated
   */
  unaryExpression getW();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.altWhenClause#getW <em>W</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>W</em>' containment reference.
   * @see #getW()
   * @generated
   */
  void setW(unaryExpression value);

  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(unaryExpression)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getaltWhenClause_T()
   * @model containment="true"
   * @generated
   */
  unaryExpression getT();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.altWhenClause#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(unaryExpression value);

} // altWhenClause
