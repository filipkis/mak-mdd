/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getB <em>B</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getArg <em>Arg</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getBody <em>Body</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getM <em>M</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfunctionDeclaration()
 * @model
 * @generated
 */
public interface functionDeclaration extends declaration
{
  /**
   * Returns the value of the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' attribute.
   * @see #setB(String)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfunctionDeclaration_B()
   * @model
   * @generated
   */
  String getB();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getB <em>B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' attribute.
   * @see #getB()
   * @generated
   */
  void setB(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfunctionDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' containment reference.
   * @see #setArg(functionArgumentDeclaration)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfunctionDeclaration_Arg()
   * @model containment="true"
   * @generated
   */
  functionArgumentDeclaration getArg();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getArg <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' containment reference.
   * @see #getArg()
   * @generated
   */
  void setArg(functionArgumentDeclaration value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(functionBody)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfunctionDeclaration_Body()
   * @model containment="true"
   * @generated
   */
  functionBody getBody();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(functionBody value);

  /**
   * Returns the value of the '<em><b>M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>M</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>M</em>' containment reference.
   * @see #setM(errorMessage)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getfunctionDeclaration_M()
   * @model containment="true"
   * @generated
   */
  errorMessage getM();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getM <em>M</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>M</em>' containment reference.
   * @see #getM()
   * @generated
   */
  void setM(errorMessage value);

} // functionDeclaration
