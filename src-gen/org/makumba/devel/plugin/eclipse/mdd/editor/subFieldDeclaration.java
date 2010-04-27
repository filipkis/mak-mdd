/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sub Field Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.subFieldDeclaration#getSubFieldOf <em>Sub Field Of</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.subFieldDeclaration#getD <em>D</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getsubFieldDeclaration()
 * @model
 * @generated
 */
public interface subFieldDeclaration extends declaration
{
  /**
   * Returns the value of the '<em><b>Sub Field Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Field Of</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Field Of</em>' reference.
   * @see #setSubFieldOf(fieldDeclaration)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getsubFieldDeclaration_SubFieldOf()
   * @model
   * @generated
   */
  fieldDeclaration getSubFieldOf();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.subFieldDeclaration#getSubFieldOf <em>Sub Field Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Field Of</em>' reference.
   * @see #getSubFieldOf()
   * @generated
   */
  void setSubFieldOf(fieldDeclaration value);

  /**
   * Returns the value of the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D</em>' containment reference.
   * @see #setD(declaration)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getsubFieldDeclaration_D()
   * @model containment="true"
   * @generated
   */
  declaration getD();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.subFieldDeclaration#getD <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D</em>' containment reference.
   * @see #getD()
   * @generated
   */
  void setD(declaration value);

} // subFieldDeclaration
