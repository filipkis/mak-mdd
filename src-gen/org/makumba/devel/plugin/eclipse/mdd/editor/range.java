/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.range#getF <em>F</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.range#getT <em>T</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getrange()
 * @model
 * @generated
 */
public interface range extends EObject
{
  /**
   * Returns the value of the '<em><b>F</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>F</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' attribute.
   * @see #setF(String)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getrange_F()
   * @model
   * @generated
   */
  String getF();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.range#getF <em>F</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' attribute.
   * @see #getF()
   * @generated
   */
  void setF(String value);

  /**
   * Returns the value of the '<em><b>T</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' attribute.
   * @see #setT(String)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getrange_T()
   * @model
   * @generated
   */
  String getT();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.range#getT <em>T</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' attribute.
   * @see #getT()
   * @generated
   */
  void setT(String value);

} // range
