/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>native Validation Rule Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.nativeValidationRuleDeclaration#getField <em>Field</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.nativeValidationRuleDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.nativeValidationRuleDeclaration#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getnativeValidationRuleDeclaration()
 * @model
 * @generated
 */
public interface nativeValidationRuleDeclaration extends declaration
{
  /**
   * Returns the value of the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' reference.
   * @see #setField(fieldDeclaration)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getnativeValidationRuleDeclaration_Field()
   * @model
   * @generated
   */
  fieldDeclaration getField();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.nativeValidationRuleDeclaration#getField <em>Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' reference.
   * @see #getField()
   * @generated
   */
  void setField(fieldDeclaration value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getnativeValidationRuleDeclaration_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.nativeValidationRuleDeclaration#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' attribute.
   * @see #setMessage(String)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getnativeValidationRuleDeclaration_Message()
   * @model
   * @generated
   */
  String getMessage();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.nativeValidationRuleDeclaration#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
  void setMessage(String value);

} // nativeValidationRuleDeclaration
