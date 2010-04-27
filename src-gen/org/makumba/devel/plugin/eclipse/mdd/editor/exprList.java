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
 * A representation of the model object '<em><b>expr List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.exprList#getE <em>E</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.exprList#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getexprList()
 * @model
 * @generated
 */
public interface exprList extends EObject
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
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getexprList_E()
   * @model containment="true"
   * @generated
   */
  EList<expression> getE();

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
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getexprList_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.exprList#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // exprList
