/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>comparison Validation Rule Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonValidationRuleDeclaration#getComparisonExp <em>Comparison Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getcomparisonValidationRuleDeclaration()
 * @model
 * @generated
 */
public interface comparisonValidationRuleDeclaration extends validationRuleDeclaration
{
  /**
   * Returns the value of the '<em><b>Comparison Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comparison Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comparison Exp</em>' containment reference.
   * @see #setComparisonExp(comparisonExpression)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getcomparisonValidationRuleDeclaration_ComparisonExp()
   * @model containment="true"
   * @generated
   */
  comparisonExpression getComparisonExp();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonValidationRuleDeclaration#getComparisonExp <em>Comparison Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comparison Exp</em>' containment reference.
   * @see #getComparisonExp()
   * @generated
   */
  void setComparisonExp(comparisonExpression value);

} // comparisonValidationRuleDeclaration
