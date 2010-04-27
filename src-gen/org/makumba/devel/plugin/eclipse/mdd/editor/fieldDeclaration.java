/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>field Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration#getTypedef <em>Typedef</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfieldDeclaration()
 * @model
 * @generated
 */
public interface fieldDeclaration extends declaration
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
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfieldDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' containment reference.
   * @see #setModifiers(modifiers)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfieldDeclaration_Modifiers()
   * @model containment="true"
   * @generated
   */
  modifiers getModifiers();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration#getModifiers <em>Modifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifiers</em>' containment reference.
   * @see #getModifiers()
   * @generated
   */
  void setModifiers(modifiers value);

  /**
   * Returns the value of the '<em><b>Typedef</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typedef</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typedef</em>' containment reference.
   * @see #setTypedef(fieldType)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfieldDeclaration_Typedef()
   * @model containment="true"
   * @generated
   */
  fieldType getTypedef();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration#getTypedef <em>Typedef</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typedef</em>' containment reference.
   * @see #getTypedef()
   * @generated
   */
  void setTypedef(fieldType value);

} // fieldDeclaration
