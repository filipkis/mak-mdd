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
import org.makumba.devel.plugin.eclipse.mdd.editor.aliasedExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.atom;
import org.makumba.devel.plugin.eclipse.mdd.editor.exprList;
import org.makumba.devel.plugin.eclipse.mdd.editor.expression;
import org.makumba.devel.plugin.eclipse.mdd.editor.expressionOrVector;
import org.makumba.devel.plugin.eclipse.mdd.editor.identPrimary;
import org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.unaryExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.unionRule;
import org.makumba.devel.plugin.eclipse.mdd.editor.vectorExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.expressionImpl#getU <em>U</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.expressionImpl#getE <em>E</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.expressionImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.expressionImpl#getIdent <em>Ident</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.expressionImpl#getS <em>S</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.expressionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.expressionImpl#getV <em>V</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class expressionImpl extends orderElementImpl implements expression
{
  /**
   * The cached value of the '{@link #getU() <em>U</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getU()
   * @generated
   * @ordered
   */
  protected unaryExpression u;

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
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getV() <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected vectorExpr v;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected expressionImpl()
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
    return EditorPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unaryExpression getU()
  {
    return u;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetU(unaryExpression newU, NotificationChain msgs)
  {
    unaryExpression oldU = u;
    u = newU;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.EXPRESSION__U, oldU, newU);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setU(unaryExpression newU)
  {
    if (newU != u)
    {
      NotificationChain msgs = null;
      if (u != null)
        msgs = ((InternalEObject)u).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPRESSION__U, null, msgs);
      if (newU != null)
        msgs = ((InternalEObject)newU).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPRESSION__U, null, msgs);
      msgs = basicSetU(newU, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXPRESSION__U, newU, newU));
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
      e = new EObjectContainmentEList<exprList>(exprList.class, this, EditorPackage.EXPRESSION__E);
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
      exp = new EObjectContainmentEList<expression>(expression.class, this, EditorPackage.EXPRESSION__EXP);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.EXPRESSION__IDENT, oldIdent, newIdent);
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
        msgs = ((InternalEObject)ident).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPRESSION__IDENT, null, msgs);
      if (newIdent != null)
        msgs = ((InternalEObject)newIdent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPRESSION__IDENT, null, msgs);
      msgs = basicSetIdent(newIdent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXPRESSION__IDENT, newIdent, newIdent));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.EXPRESSION__S, oldS, newS);
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
        msgs = ((InternalEObject)s).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPRESSION__S, null, msgs);
      if (newS != null)
        msgs = ((InternalEObject)newS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPRESSION__S, null, msgs);
      msgs = basicSetS(newS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXPRESSION__S, newS, newS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXPRESSION__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public vectorExpr getV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV(vectorExpr newV, NotificationChain msgs)
  {
    vectorExpr oldV = v;
    v = newV;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.EXPRESSION__V, oldV, newV);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(vectorExpr newV)
  {
    if (newV != v)
    {
      NotificationChain msgs = null;
      if (v != null)
        msgs = ((InternalEObject)v).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPRESSION__V, null, msgs);
      if (newV != null)
        msgs = ((InternalEObject)newV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.EXPRESSION__V, null, msgs);
      msgs = basicSetV(newV, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EXPRESSION__V, newV, newV));
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
      case EditorPackage.EXPRESSION__U:
        return basicSetU(null, msgs);
      case EditorPackage.EXPRESSION__E:
        return ((InternalEList<?>)getE()).basicRemove(otherEnd, msgs);
      case EditorPackage.EXPRESSION__EXP:
        return ((InternalEList<?>)getExp()).basicRemove(otherEnd, msgs);
      case EditorPackage.EXPRESSION__IDENT:
        return basicSetIdent(null, msgs);
      case EditorPackage.EXPRESSION__S:
        return basicSetS(null, msgs);
      case EditorPackage.EXPRESSION__V:
        return basicSetV(null, msgs);
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
      case EditorPackage.EXPRESSION__U:
        return getU();
      case EditorPackage.EXPRESSION__E:
        return getE();
      case EditorPackage.EXPRESSION__EXP:
        return getExp();
      case EditorPackage.EXPRESSION__IDENT:
        return getIdent();
      case EditorPackage.EXPRESSION__S:
        return getS();
      case EditorPackage.EXPRESSION__ID:
        return getId();
      case EditorPackage.EXPRESSION__V:
        return getV();
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
      case EditorPackage.EXPRESSION__U:
        setU((unaryExpression)newValue);
        return;
      case EditorPackage.EXPRESSION__E:
        getE().clear();
        getE().addAll((Collection<? extends exprList>)newValue);
        return;
      case EditorPackage.EXPRESSION__EXP:
        getExp().clear();
        getExp().addAll((Collection<? extends expression>)newValue);
        return;
      case EditorPackage.EXPRESSION__IDENT:
        setIdent((identPrimary)newValue);
        return;
      case EditorPackage.EXPRESSION__S:
        setS((unionRule)newValue);
        return;
      case EditorPackage.EXPRESSION__ID:
        setId((String)newValue);
        return;
      case EditorPackage.EXPRESSION__V:
        setV((vectorExpr)newValue);
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
      case EditorPackage.EXPRESSION__U:
        setU((unaryExpression)null);
        return;
      case EditorPackage.EXPRESSION__E:
        getE().clear();
        return;
      case EditorPackage.EXPRESSION__EXP:
        getExp().clear();
        return;
      case EditorPackage.EXPRESSION__IDENT:
        setIdent((identPrimary)null);
        return;
      case EditorPackage.EXPRESSION__S:
        setS((unionRule)null);
        return;
      case EditorPackage.EXPRESSION__ID:
        setId(ID_EDEFAULT);
        return;
      case EditorPackage.EXPRESSION__V:
        setV((vectorExpr)null);
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
      case EditorPackage.EXPRESSION__U:
        return u != null;
      case EditorPackage.EXPRESSION__E:
        return e != null && !e.isEmpty();
      case EditorPackage.EXPRESSION__EXP:
        return exp != null && !exp.isEmpty();
      case EditorPackage.EXPRESSION__IDENT:
        return ident != null;
      case EditorPackage.EXPRESSION__S:
        return s != null;
      case EditorPackage.EXPRESSION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case EditorPackage.EXPRESSION__V:
        return v != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == aliasedExpression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == unaryExpression.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.EXPRESSION__U: return EditorPackage.UNARY_EXPRESSION__U;
        default: return -1;
      }
    }
    if (baseClass == atom.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == primaryExpression.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.EXPRESSION__E: return EditorPackage.PRIMARY_EXPRESSION__E;
        case EditorPackage.EXPRESSION__EXP: return EditorPackage.PRIMARY_EXPRESSION__EXP;
        case EditorPackage.EXPRESSION__IDENT: return EditorPackage.PRIMARY_EXPRESSION__IDENT;
        case EditorPackage.EXPRESSION__S: return EditorPackage.PRIMARY_EXPRESSION__S;
        default: return -1;
      }
    }
    if (baseClass == expressionOrVector.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == aliasedExpression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == unaryExpression.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.UNARY_EXPRESSION__U: return EditorPackage.EXPRESSION__U;
        default: return -1;
      }
    }
    if (baseClass == atom.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == primaryExpression.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.PRIMARY_EXPRESSION__E: return EditorPackage.EXPRESSION__E;
        case EditorPackage.PRIMARY_EXPRESSION__EXP: return EditorPackage.EXPRESSION__EXP;
        case EditorPackage.PRIMARY_EXPRESSION__IDENT: return EditorPackage.EXPRESSION__IDENT;
        case EditorPackage.PRIMARY_EXPRESSION__S: return EditorPackage.EXPRESSION__S;
        default: return -1;
      }
    }
    if (baseClass == expressionOrVector.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //expressionImpl
