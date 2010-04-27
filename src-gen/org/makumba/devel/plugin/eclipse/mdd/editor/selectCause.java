/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>select Cause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectCause#getS <em>S</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectCause#getN <em>N</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getselectCause()
 * @model
 * @generated
 */
public interface selectCause extends selectClause
{
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
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getselectCause_S()
   * @model containment="true"
   * @generated
   */
  selectedPropertiesList getS();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectCause#getS <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S</em>' containment reference.
   * @see #getS()
   * @generated
   */
  void setS(selectedPropertiesList value);

  /**
   * Returns the value of the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' containment reference.
   * @see #setN(newExpression)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getselectCause_N()
   * @model containment="true"
   * @generated
   */
  newExpression getN();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectCause#getN <em>N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' containment reference.
   * @see #getN()
   * @generated
   */
  void setN(newExpression value);

} // selectCause
