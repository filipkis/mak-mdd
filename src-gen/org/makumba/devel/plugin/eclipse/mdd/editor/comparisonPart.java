/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>comparison Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getT <em>T</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getN <em>N</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getDf <em>Df</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getU <em>U</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getL <em>L</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getD <em>D</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getcomparisonPart()
 * @model
 * @generated
 */
public interface comparisonPart extends EObject
{
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
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getcomparisonPart_T()
   * @model
   * @generated
   */
  String getT();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getT <em>T</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' attribute.
   * @see #getT()
   * @generated
   */
  void setT(String value);

  /**
   * Returns the value of the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute.
   * @see #setN(int)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getcomparisonPart_N()
   * @model
   * @generated
   */
  int getN();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see #getN()
   * @generated
   */
  void setN(int value);

  /**
   * Returns the value of the '<em><b>Df</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Df</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Df</em>' attribute.
   * @see #setDf(String)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getcomparisonPart_Df()
   * @model
   * @generated
   */
  String getDf();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getDf <em>Df</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Df</em>' attribute.
   * @see #getDf()
   * @generated
   */
  void setDf(String value);

  /**
   * Returns the value of the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>U</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>U</em>' containment reference.
   * @see #setU(upperFunction)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getcomparisonPart_U()
   * @model containment="true"
   * @generated
   */
  upperFunction getU();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getU <em>U</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>U</em>' containment reference.
   * @see #getU()
   * @generated
   */
  void setU(upperFunction value);

  /**
   * Returns the value of the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' containment reference.
   * @see #setL(lowerFunction)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getcomparisonPart_L()
   * @model containment="true"
   * @generated
   */
  lowerFunction getL();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(lowerFunction value);

  /**
   * Returns the value of the '<em><b>D</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D</em>' attribute.
   * @see #setD(String)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getcomparisonPart_D()
   * @model
   * @generated
   */
  String getD();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getD <em>D</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D</em>' attribute.
   * @see #getD()
   * @generated
   */
  void setD(String value);

} // comparisonPart
