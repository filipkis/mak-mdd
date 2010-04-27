/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldType#getType <em>Type</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldType#getTypeDec <em>Type Dec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfieldType()
 * @model
 * @generated
 */
public interface fieldType extends EObject
{
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
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfieldType_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Type Dec</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Dec</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Dec</em>' reference.
   * @see #setTypeDec(typeDeclaration)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfieldType_TypeDec()
   * @model
   * @generated
   */
  typeDeclaration getTypeDec();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldType#getTypeDec <em>Type Dec</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Dec</em>' reference.
   * @see #getTypeDec()
   * @generated
   */
  void setTypeDec(typeDeclaration value);

} // fieldType
