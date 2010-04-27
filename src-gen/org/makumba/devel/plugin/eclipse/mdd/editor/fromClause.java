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
 * A representation of the model object '<em><b>from Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromClause#getFromRange <em>From Range</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromClause#getFromJoin <em>From Join</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfromClause()
 * @model
 * @generated
 */
public interface fromClause extends EObject
{
  /**
   * Returns the value of the '<em><b>From Range</b></em>' containment reference list.
   * The list contents are of type {@link org.makumba.devel.plugin.eclipse.mdd.editor.fromRange}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Range</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Range</em>' containment reference list.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfromClause_FromRange()
   * @model containment="true"
   * @generated
   */
  EList<fromRange> getFromRange();

  /**
   * Returns the value of the '<em><b>From Join</b></em>' containment reference list.
   * The list contents are of type {@link org.makumba.devel.plugin.eclipse.mdd.editor.fromJoin}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Join</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Join</em>' containment reference list.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfromClause_FromJoin()
   * @model containment="true"
   * @generated
   */
  EList<fromJoin> getFromJoin();

} // fromClause
