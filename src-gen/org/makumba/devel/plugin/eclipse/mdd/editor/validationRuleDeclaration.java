/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>validation Rule Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getvalidationRuleDeclaration()
 * @model
 * @generated
 */
public interface validationRuleDeclaration extends declaration
{
  /**
   * Returns the value of the '<em><b>Error Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Error Message</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error Message</em>' containment reference.
   * @see #setErrorMessage(errorMessage)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getvalidationRuleDeclaration_ErrorMessage()
   * @model containment="true"
   * @generated
   */
  errorMessage getErrorMessage();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration#getErrorMessage <em>Error Message</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error Message</em>' containment reference.
   * @see #getErrorMessage()
   * @generated
   */
  void setErrorMessage(errorMessage value);

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
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getvalidationRuleDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference.
   * @see #setArgs(functionArguments)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getvalidationRuleDeclaration_Args()
   * @model containment="true"
   * @generated
   */
  functionArguments getArgs();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(functionArguments value);

} // validationRuleDeclaration
