/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>modifiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.modifiers#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.modifiers#isFixed <em>Fixed</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.modifiers#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.modifiers#isNotEmpty <em>Not Empty</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getmodifiers()
 * @model
 * @generated
 */
public interface modifiers extends EObject
{
  /**
   * Returns the value of the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unique</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique</em>' attribute.
   * @see #setUnique(boolean)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getmodifiers_Unique()
   * @model
   * @generated
   */
  boolean isUnique();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.modifiers#isUnique <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique</em>' attribute.
   * @see #isUnique()
   * @generated
   */
  void setUnique(boolean value);

  /**
   * Returns the value of the '<em><b>Fixed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fixed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed</em>' attribute.
   * @see #setFixed(boolean)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getmodifiers_Fixed()
   * @model
   * @generated
   */
  boolean isFixed();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.modifiers#isFixed <em>Fixed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed</em>' attribute.
   * @see #isFixed()
   * @generated
   */
  void setFixed(boolean value);

  /**
   * Returns the value of the '<em><b>Not Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not Null</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not Null</em>' attribute.
   * @see #setNotNull(boolean)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getmodifiers_NotNull()
   * @model
   * @generated
   */
  boolean isNotNull();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.modifiers#isNotNull <em>Not Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not Null</em>' attribute.
   * @see #isNotNull()
   * @generated
   */
  void setNotNull(boolean value);

  /**
   * Returns the value of the '<em><b>Not Empty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not Empty</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not Empty</em>' attribute.
   * @see #setNotEmpty(boolean)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getmodifiers_NotEmpty()
   * @model
   * @generated
   */
  boolean isNotEmpty();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.modifiers#isNotEmpty <em>Not Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not Empty</em>' attribute.
   * @see #isNotEmpty()
   * @generated
   */
  void setNotEmpty(boolean value);

} // modifiers
