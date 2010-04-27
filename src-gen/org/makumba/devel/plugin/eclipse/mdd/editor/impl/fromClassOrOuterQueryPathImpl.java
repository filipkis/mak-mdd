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

import org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage;
import org.makumba.devel.plugin.eclipse.mdd.editor.asAlias;
import org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath;
import org.makumba.devel.plugin.eclipse.mdd.editor.fromRange;
import org.makumba.devel.plugin.eclipse.mdd.editor.withClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>from Class Or Outer Query Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromClassOrOuterQueryPathImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromClassOrOuterQueryPathImpl#getP <em>P</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromClassOrOuterQueryPathImpl#getW <em>W</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromClassOrOuterQueryPathImpl#getAsAlias <em>As Alias</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromClassOrOuterQueryPathImpl#getPropertyFetch <em>Property Fetch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class fromClassOrOuterQueryPathImpl extends fromJoinImpl implements fromClassOrOuterQueryPath
{
  /**
   * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected static final String ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected String alias = ALIAS_EDEFAULT;

  /**
   * The default value of the '{@link #getP() <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected static final String P_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getP() <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected String p = P_EDEFAULT;

  /**
   * The cached value of the '{@link #getW() <em>W</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW()
   * @generated
   * @ordered
   */
  protected withClause w;

  /**
   * The cached value of the '{@link #getAsAlias() <em>As Alias</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsAlias()
   * @generated
   * @ordered
   */
  protected asAlias asAlias;

  /**
   * The default value of the '{@link #getPropertyFetch() <em>Property Fetch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyFetch()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_FETCH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPropertyFetch() <em>Property Fetch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyFetch()
   * @generated
   * @ordered
   */
  protected String propertyFetch = PROPERTY_FETCH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected fromClassOrOuterQueryPathImpl()
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
    return EditorPackage.Literals.FROM_CLASS_OR_OUTER_QUERY_PATH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlias(String newAlias)
  {
    String oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__ALIAS, oldAlias, alias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getP()
  {
    return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setP(String newP)
  {
    String oldP = p;
    p = newP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__P, oldP, p));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public withClause getW()
  {
    return w;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetW(withClause newW, NotificationChain msgs)
  {
    withClause oldW = w;
    w = newW;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__W, oldW, newW);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setW(withClause newW)
  {
    if (newW != w)
    {
      NotificationChain msgs = null;
      if (w != null)
        msgs = ((InternalEObject)w).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__W, null, msgs);
      if (newW != null)
        msgs = ((InternalEObject)newW).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__W, null, msgs);
      msgs = basicSetW(newW, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__W, newW, newW));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public asAlias getAsAlias()
  {
    return asAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAsAlias(asAlias newAsAlias, NotificationChain msgs)
  {
    asAlias oldAsAlias = asAlias;
    asAlias = newAsAlias;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__AS_ALIAS, oldAsAlias, newAsAlias);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAsAlias(asAlias newAsAlias)
  {
    if (newAsAlias != asAlias)
    {
      NotificationChain msgs = null;
      if (asAlias != null)
        msgs = ((InternalEObject)asAlias).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__AS_ALIAS, null, msgs);
      if (newAsAlias != null)
        msgs = ((InternalEObject)newAsAlias).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__AS_ALIAS, null, msgs);
      msgs = basicSetAsAlias(newAsAlias, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__AS_ALIAS, newAsAlias, newAsAlias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPropertyFetch()
  {
    return propertyFetch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyFetch(String newPropertyFetch)
  {
    String oldPropertyFetch = propertyFetch;
    propertyFetch = newPropertyFetch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__PROPERTY_FETCH, oldPropertyFetch, propertyFetch));
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
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__W:
        return basicSetW(null, msgs);
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__AS_ALIAS:
        return basicSetAsAlias(null, msgs);
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
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__ALIAS:
        return getAlias();
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__P:
        return getP();
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__W:
        return getW();
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__AS_ALIAS:
        return getAsAlias();
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__PROPERTY_FETCH:
        return getPropertyFetch();
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
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__ALIAS:
        setAlias((String)newValue);
        return;
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__P:
        setP((String)newValue);
        return;
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__W:
        setW((withClause)newValue);
        return;
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__AS_ALIAS:
        setAsAlias((asAlias)newValue);
        return;
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__PROPERTY_FETCH:
        setPropertyFetch((String)newValue);
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
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__ALIAS:
        setAlias(ALIAS_EDEFAULT);
        return;
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__P:
        setP(P_EDEFAULT);
        return;
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__W:
        setW((withClause)null);
        return;
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__AS_ALIAS:
        setAsAlias((asAlias)null);
        return;
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__PROPERTY_FETCH:
        setPropertyFetch(PROPERTY_FETCH_EDEFAULT);
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
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__ALIAS:
        return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__P:
        return P_EDEFAULT == null ? p != null : !P_EDEFAULT.equals(p);
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__W:
        return w != null;
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__AS_ALIAS:
        return asAlias != null;
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__PROPERTY_FETCH:
        return PROPERTY_FETCH_EDEFAULT == null ? propertyFetch != null : !PROPERTY_FETCH_EDEFAULT.equals(propertyFetch);
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
    if (baseClass == fromRange.class)
    {
      switch (derivedFeatureID)
      {
        case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__ALIAS: return EditorPackage.FROM_RANGE__ALIAS;
        case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__P: return EditorPackage.FROM_RANGE__P;
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
    if (baseClass == fromRange.class)
    {
      switch (baseFeatureID)
      {
        case EditorPackage.FROM_RANGE__ALIAS: return EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__ALIAS;
        case EditorPackage.FROM_RANGE__P: return EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH__P;
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
    result.append(" (alias: ");
    result.append(alias);
    result.append(", p: ");
    result.append(p);
    result.append(", propertyFetch: ");
    result.append(propertyFetch);
    result.append(')');
    return result.toString();
  }

} //fromClassOrOuterQueryPathImpl
