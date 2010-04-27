/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.typeDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.typeDeclaration#getFieldType <em>Field Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#gettypeDeclaration()
 * @model
 * @generated
 */
public interface typeDeclaration extends declaration
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#gettypeDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.typeDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Field Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Type</em>' containment reference.
   * @see #setFieldType(fieldType)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#gettypeDeclaration_FieldType()
   * @model containment="true"
   * @generated
   */
  fieldType getFieldType();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.typeDeclaration#getFieldType <em>Field Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Type</em>' containment reference.
   * @see #getFieldType()
   * @generated
   */
  void setFieldType(fieldType value);

} // typeDeclaration
