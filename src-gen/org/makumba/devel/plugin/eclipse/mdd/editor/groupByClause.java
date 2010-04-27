/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>group By Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.groupByClause#getE <em>E</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.groupByClause#getH <em>H</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getgroupByClause()
 * @model
 * @generated
 */
public interface groupByClause extends EObject
{
  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference list.
   * The list contents are of type {@link org.makumba.devel.plugin.eclipse.mdd.editor.expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference list.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getgroupByClause_E()
   * @model containment="true"
   * @generated
   */
  EList<expression> getE();

  /**
   * Returns the value of the '<em><b>H</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>H</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>H</em>' containment reference.
   * @see #setH(havingClause)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getgroupByClause_H()
   * @model containment="true"
   * @generated
   */
  havingClause getH();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.groupByClause#getH <em>H</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>H</em>' containment reference.
   * @see #getH()
   * @generated
   */
  void setH(havingClause value);

} // groupByClause
