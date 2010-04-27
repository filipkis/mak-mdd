/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>new Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.newExpression#getP <em>P</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.newExpression#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getnewExpression()
 * @model
 * @generated
 */
public interface newExpression extends EObject
{
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
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getnewExpression_P()
   * @model
   * @generated
   */
  String getP();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.newExpression#getP <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' attribute.
   * @see #getP()
   * @generated
   */
  void setP(String value);

  /**
   * Returns the value of the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' containment reference.
   * @see #setS(selectedPropertiesList)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getnewExpression_S()
   * @model containment="true"
   * @generated
   */
  selectedPropertiesList getS();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.newExpression#getS <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S</em>' containment reference.
   * @see #getS()
   * @generated
   */
  void setS(selectedPropertiesList value);

} // newExpression
