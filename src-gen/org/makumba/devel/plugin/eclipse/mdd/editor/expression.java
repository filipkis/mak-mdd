/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.expression#getId <em>Id</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.expression#getV <em>V</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getexpression()
 * @model
 * @generated
 */
public interface expression extends orderElement, aliasedExpression, expressionOrVector
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getexpression_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.expression#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(vectorExpr)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getexpression_V()
   * @model containment="true"
   * @generated
   */
  vectorExpr getV();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.expression#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(vectorExpr value);

} // expression
