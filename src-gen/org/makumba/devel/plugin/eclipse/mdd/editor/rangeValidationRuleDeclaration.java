/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>range Validation Rule Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.rangeValidationRuleDeclaration#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getrangeValidationRuleDeclaration()
 * @model
 * @generated
 */
public interface rangeValidationRuleDeclaration extends validationRuleDeclaration
{
  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(range)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getrangeValidationRuleDeclaration_Range()
   * @model containment="true"
   * @generated
   */
  range getRange();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.rangeValidationRuleDeclaration#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(range value);

} // rangeValidationRuleDeclaration
