/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>select From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getWhere <em>Where</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getS <em>S</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getselectFrom()
 * @model
 * @generated
 */
public interface selectFrom extends queryRule
{
  /**
   * Returns the value of the '<em><b>Where</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where</em>' containment reference.
   * @see #setWhere(whereClause)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getselectFrom_Where()
   * @model containment="true"
   * @generated
   */
  whereClause getWhere();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getWhere <em>Where</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where</em>' containment reference.
   * @see #getWhere()
   * @generated
   */
  void setWhere(whereClause value);

  /**
   * Returns the value of the '<em><b>Group By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group By</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group By</em>' containment reference.
   * @see #setGroupBy(groupByClause)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getselectFrom_GroupBy()
   * @model containment="true"
   * @generated
   */
  groupByClause getGroupBy();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getGroupBy <em>Group By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group By</em>' containment reference.
   * @see #getGroupBy()
   * @generated
   */
  void setGroupBy(groupByClause value);

  /**
   * Returns the value of the '<em><b>Order By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order By</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order By</em>' containment reference.
   * @see #setOrderBy(orderByClause)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getselectFrom_OrderBy()
   * @model containment="true"
   * @generated
   */
  orderByClause getOrderBy();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getOrderBy <em>Order By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Order By</em>' containment reference.
   * @see #getOrderBy()
   * @generated
   */
  void setOrderBy(orderByClause value);

  /**
   * Returns the value of the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' containment reference.
   * @see #setS(selectClause)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getselectFrom_S()
   * @model containment="true"
   * @generated
   */
  selectClause getS();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getS <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S</em>' containment reference.
   * @see #getS()
   * @generated
   */
  void setS(selectClause value);

  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(fromClause)
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#getselectFrom_From()
   * @model containment="true"
   * @generated
   */
  fromClause getFrom();

  /**
   * Sets the value of the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(fromClause value);

} // selectFrom
