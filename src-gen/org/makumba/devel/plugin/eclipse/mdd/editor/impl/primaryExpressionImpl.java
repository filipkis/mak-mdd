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
import org.makumba.devel.plugin.eclipse.mdd.editor.exprList;
import org.makumba.devel.plugin.eclipse.mdd.editor.expression;
import org.makumba.devel.plugin.eclipse.mdd.editor.identPrimary;
import org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.unionRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>primary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.primaryExpressionImpl#getE <em>E</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.primaryExpressionImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.primaryExpressionImpl#getIdent <em>Ident</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.primaryExpressionImpl#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class primaryExpressionImpl extends atomImpl implements primaryExpression
{
  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected EList<exprList> e;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected EList<expression> exp;

  /**
   * The cached value of the '{@link #getIdent() <em>Ident</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdent()
   * @generated
   * @ordered
   */
  protected identPrimary ident;

  /**
   * The cached value of the '{@link #getS() <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected unionRule s;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected primaryExpressionImpl()
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
    return EditorPackage.Literals.PRIMARY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<exprList> getE()
  {
    if (e == null)
    {
      e = new EObjectContainmentEList<exprList>(exprList.class, this, EditorPackage.PRIMARY_EXPRESSION__E);
    }
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<expression> getExp()
  {
    if (exp == null)
    {
      exp = new EObjectContainmentEList<expression>(expression.class, this, EditorPackage.PRIMARY_EXPRESSION__EXP);
    }
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identPrimary getIdent()
  {
    return ident;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdent(identPrimary newIdent, NotificationChain msgs)
  {
    identPrimary oldIdent = ident;
    ident = newIdent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.PRIMARY_EXPRESSION__IDENT, oldIdent, newIdent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdent(identPrimary newIdent)
  {
    if (newIdent != ident)
    {
      NotificationChain msgs = null;
      if (ident != null)
        msgs = ((InternalEObject)ident).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRIMARY_EXPRESSION__IDENT, null, msgs);
      if (newIdent != null)
        msgs = ((InternalEObject)newIdent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRIMARY_EXPRESSION__IDENT, null, msgs);
      msgs = basicSetIdent(newIdent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.PRIMARY_EXPRESSION__IDENT, newIdent, newIdent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unionRule getS()
  {
    return s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS(unionRule newS, NotificationChain msgs)
  {
    unionRule oldS = s;
    s = newS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.PRIMARY_EXPRESSION__S, oldS, newS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS(unionRule newS)
  {
    if (newS != s)
    {
      NotificationChain msgs = null;
      if (s != null)
        msgs = ((InternalEObject)s).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRIMARY_EXPRESSION__S, null, msgs);
      if (newS != null)
        msgs = ((InternalEObject)newS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.PRIMARY_EXPRESSION__S, null, msgs);
      msgs = basicSetS(newS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.PRIMARY_EXPRESSION__S, newS, newS));
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
      case EditorPackage.PRIMARY_EXPRESSION__E:
        return ((InternalEList<?>)getE()).basicRemove(otherEnd, msgs);
      case EditorPackage.PRIMARY_EXPRESSION__EXP:
        return ((InternalEList<?>)getExp()).basicRemove(otherEnd, msgs);
      case EditorPackage.PRIMARY_EXPRESSION__IDENT:
        return basicSetIdent(null, msgs);
      case EditorPackage.PRIMARY_EXPRESSION__S:
        return basicSetS(null, msgs);
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
      case EditorPackage.PRIMARY_EXPRESSION__E:
        return getE();
      case EditorPackage.PRIMARY_EXPRESSION__EXP:
        return getExp();
      case EditorPackage.PRIMARY_EXPRESSION__IDENT:
        return getIdent();
      case EditorPackage.PRIMARY_EXPRESSION__S:
        return getS();
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
      case EditorPackage.PRIMARY_EXPRESSION__E:
        getE().clear();
        getE().addAll((Collection<? extends exprList>)newValue);
        return;
      case EditorPackage.PRIMARY_EXPRESSION__EXP:
        getExp().clear();
        getExp().addAll((Collection<? extends expression>)newValue);
        return;
      case EditorPackage.PRIMARY_EXPRESSION__IDENT:
        setIdent((identPrimary)newValue);
        return;
      case EditorPackage.PRIMARY_EXPRESSION__S:
        setS((unionRule)newValue);
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
      case EditorPackage.PRIMARY_EXPRESSION__E:
        getE().clear();
        return;
      case EditorPackage.PRIMARY_EXPRESSION__EXP:
        getExp().clear();
        return;
      case EditorPackage.PRIMARY_EXPRESSION__IDENT:
        setIdent((identPrimary)null);
        return;
      case EditorPackage.PRIMARY_EXPRESSION__S:
        setS((unionRule)null);
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
      case EditorPackage.PRIMARY_EXPRESSION__E:
        return e != null && !e.isEmpty();
      case EditorPackage.PRIMARY_EXPRESSION__EXP:
        return exp != null && !exp.isEmpty();
      case EditorPackage.PRIMARY_EXPRESSION__IDENT:
        return ident != null;
      case EditorPackage.PRIMARY_EXPRESSION__S:
        return s != null;
    }
    return super.eIsSet(featureID);
  }

} //primaryExpressionImpl
