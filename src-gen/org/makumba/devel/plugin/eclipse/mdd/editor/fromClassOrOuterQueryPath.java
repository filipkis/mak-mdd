/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>from Class Or Outer Query Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath#getW <em>W</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath#getAsAlias <em>As Alias</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath#getPropertyFetch <em>Property Fetch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfromClassOrOuterQueryPath()
 * @model
 * @generated
 */
public interface fromClassOrOuterQueryPath extends fromJoin, fromRange
{
  /**
   * Returns the value of the '<em><b>W</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>W</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>W</em>' containment reference.
   * @see #setW(withClause)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfromClassOrOuterQueryPath_W()
   * @model containment="true"
   * @generated
   */
  withClause getW();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath#getW <em>W</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>W</em>' containment reference.
   * @see #getW()
   * @generated
   */
  void setW(withClause value);

  /**
   * Returns the value of the '<em><b>As Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>As Alias</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>As Alias</em>' containment reference.
   * @see #setAsAlias(asAlias)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfromClassOrOuterQueryPath_AsAlias()
   * @model containment="true"
   * @generated
   */
  asAlias getAsAlias();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath#getAsAlias <em>As Alias</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>As Alias</em>' containment reference.
   * @see #getAsAlias()
   * @generated
   */
  void setAsAlias(asAlias value);

  /**
   * Returns the value of the '<em><b>Property Fetch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Fetch</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Fetch</em>' attribute.
   * @see #setPropertyFetch(String)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfromClassOrOuterQueryPath_PropertyFetch()
   * @model
   * @generated
   */
  String getPropertyFetch();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath#getPropertyFetch <em>Property Fetch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Fetch</em>' attribute.
   * @see #getPropertyFetch()
   * @generated
   */
  void setPropertyFetch(String value);

} // fromClassOrOuterQueryPath
