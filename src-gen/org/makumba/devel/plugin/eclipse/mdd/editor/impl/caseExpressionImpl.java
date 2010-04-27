/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage;
import org.makumba.devel.plugin.eclipse.mdd.editor.altWhenClause;
import org.makumba.devel.plugin.eclipse.mdd.editor.caseExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.elseClause;
import org.makumba.devel.plugin.eclipse.mdd.editor.whenClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>case Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.caseExpressionImpl#getW <em>W</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.caseExpressionImpl#getE <em>E</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.caseExpressionImpl#getA <em>A</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class caseExpressionImpl extends unaryExpressionImpl implements caseExpression
{
  /**
   * The cached value of the '{@link #getW() <em>W</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW()
   * @generated
   * @ordered
   */
  protected EList<whenClause> w;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected elseClause e;

  /**
   * The cached value of the '{@link #getA() <em>A</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected EList<altWhenClause> a;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected caseExpressionImpl()
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
    return EditorPackage.Literals.CASE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<whenClause> getW()
  {
    if (w == null)
    {
      w = new EObjectContainmentEList<whenClause>(whenClause.class, this, EditorPackage.CASE_EXPRESSION__W);
    }
    return w;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public elseClause getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE(elseClause newE, NotificationChain msgs)
  {
    elseClause oldE = e;
    e = newE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.CASE_EXPRESSION__E, oldE, newE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE(elseClause newE)
  {
    if (newE != e)
    {
      NotificationChain msgs = null;
      if (e != null)
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.CASE_EXPRESSION__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.CASE_EXPRESSION__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.CASE_EXPRESSION__E, newE, newE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<altWhenClause> getA()
  {
    if (a == null)
    {
      a = new EObjectContainmentEList<altWhenClause>(altWhenClause.class, this, EditorPackage.CASE_EXPRESSION__A);
    }
    return a;
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
      case EditorPackage.CASE_EXPRESSION__W:
        return ((InternalEList<?>)getW()).basicRemove(otherEnd, msgs);
      case EditorPackage.CASE_EXPRESSION__E:
        return basicSetE(null, msgs);
      case EditorPackage.CASE_EXPRESSION__A:
        return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.CASE_EXPRESSION__W:
        return getW();
      case EditorPackage.CASE_EXPRESSION__E:
        return getE();
      case EditorPackage.CASE_EXPRESSION__A:
        return getA();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EditorPackage.CASE_EXPRESSION__W:
        getW().clear();
        getW().addAll((Collection<? extends whenClause>)newValue);
        return;
      case EditorPackage.CASE_EXPRESSION__E:
        setE((elseClause)newValue);
        return;
      case EditorPackage.CASE_EXPRESSION__A:
        getA().clear();
        getA().addAll((Collection<? extends altWhenClause>)newValue);
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
      case EditorPackage.CASE_EXPRESSION__W:
        getW().clear();
        return;
      case EditorPackage.CASE_EXPRESSION__E:
        setE((elseClause)null);
        return;
      case EditorPackage.CASE_EXPRESSION__A:
        getA().clear();
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
      case EditorPackage.CASE_EXPRESSION__W:
        return w != null && !w.isEmpty();
      case EditorPackage.CASE_EXPRESSION__E:
        return e != null;
      case EditorPackage.CASE_EXPRESSION__A:
        return a != null && !a.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //caseExpressionImpl
