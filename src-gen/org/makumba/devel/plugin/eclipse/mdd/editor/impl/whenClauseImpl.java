/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage;
import org.makumba.devel.plugin.eclipse.mdd.editor.expression;
import org.makumba.devel.plugin.eclipse.mdd.editor.unaryExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.whenClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>when Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.whenClauseImpl#getWhenExpr <em>When Expr</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.whenClauseImpl#getThenExpr <em>Then Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class whenClauseImpl extends MinimalEObjectImpl.Container implements whenClause
{
  /**
   * The cached value of the '{@link #getWhenExpr() <em>When Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhenExpr()
   * @generated
   * @ordered
   */
  protected expression whenExpr;

  /**
   * The cached value of the '{@link #getThenExpr() <em>Then Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenExpr()
   * @generated
   * @ordered
   */
  protected unaryExpression thenExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected whenClauseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EditorPackage.Literals.WHEN_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getWhenExpr()
  {
    return whenExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhenExpr(expression newWhenExpr, NotificationChain msgs)
  {
    expression oldWhenExpr = whenExpr;
    whenExpr = newWhenExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.WHEN_CLAUSE__WHEN_EXPR, oldWhenExpr, newWhenExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhenExpr(expression newWhenExpr)
  {
    if (newWhenExpr != whenExpr)
    {
      NotificationChain msgs = null;
      if (whenExpr != null)
        msgs = ((InternalEObject)whenExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.WHEN_CLAUSE__WHEN_EXPR, null, msgs);
      if (newWhenExpr != null)
        msgs = ((InternalEObject)newWhenExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.WHEN_CLAUSE__WHEN_EXPR, null, msgs);
      msgs = basicSetWhenExpr(newWhenExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.WHEN_CLAUSE__WHEN_EXPR, newWhenExpr, newWhenExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unaryExpression getThenExpr()
  {
    return thenExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThenExpr(unaryExpression newThenExpr, NotificationChain msgs)
  {
    unaryExpression oldThenExpr = thenExpr;
    thenExpr = newThenExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.WHEN_CLAUSE__THEN_EXPR, oldThenExpr, newThenExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThenExpr(unaryExpression newThenExpr)
  {
    if (newThenExpr != thenExpr)
    {
      NotificationChain msgs = null;
      if (thenExpr != null)
        msgs = ((InternalEObject)thenExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.WHEN_CLAUSE__THEN_EXPR, null, msgs);
      if (newThenExpr != null)
        msgs = ((InternalEObject)newThenExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.WHEN_CLAUSE__THEN_EXPR, null, msgs);
      msgs = basicSetThenExpr(newThenExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.WHEN_CLAUSE__THEN_EXPR, newThenExpr, newThenExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EditorPackage.WHEN_CLAUSE__WHEN_EXPR:
        return basicSetWhenExpr(null, msgs);
      case EditorPackage.WHEN_CLAUSE__THEN_EXPR:
        return basicSetThenExpr(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EditorPackage.WHEN_CLAUSE__WHEN_EXPR:
        return getWhenExpr();
      case EditorPackage.WHEN_CLAUSE__THEN_EXPR:
        return getThenExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EditorPackage.WHEN_CLAUSE__WHEN_EXPR:
        setWhenExpr((expression)newValue);
        return;
      case EditorPackage.WHEN_CLAUSE__THEN_EXPR:
        setThenExpr((unaryExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EditorPackage.WHEN_CLAUSE__WHEN_EXPR:
        setWhenExpr((expression)null);
        return;
      case EditorPackage.WHEN_CLAUSE__THEN_EXPR:
        setThenExpr((unaryExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EditorPackage.WHEN_CLAUSE__WHEN_EXPR:
        return whenExpr != null;
      case EditorPackage.WHEN_CLAUSE__THEN_EXPR:
        return thenExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //whenClauseImpl
