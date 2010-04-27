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
import org.makumba.devel.plugin.eclipse.mdd.editor.fromClause;
import org.makumba.devel.plugin.eclipse.mdd.editor.groupByClause;
import org.makumba.devel.plugin.eclipse.mdd.editor.orderByClause;
import org.makumba.devel.plugin.eclipse.mdd.editor.selectClause;
import org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom;
import org.makumba.devel.plugin.eclipse.mdd.editor.whereClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>select From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectFromImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectFromImpl#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectFromImpl#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectFromImpl#getS <em>S</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectFromImpl#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class selectFromImpl extends queryRuleImpl implements selectFrom
{
  /**
   * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhere()
   * @generated
   * @ordered
   */
  protected whereClause where;

  /**
   * The cached value of the '{@link #getGroupBy() <em>Group By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupBy()
   * @generated
   * @ordered
   */
  protected groupByClause groupBy;

  /**
   * The cached value of the '{@link #getOrderBy() <em>Order By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrderBy()
   * @generated
   * @ordered
   */
  protected orderByClause orderBy;

  /**
   * The cached value of the '{@link #getS() <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected selectClause s;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected fromClause from;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected selectFromImpl()
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
    return EditorPackage.Literals.SELECT_FROM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public whereClause getWhere()
  {
    return where;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhere(whereClause newWhere, NotificationChain msgs)
  {
    whereClause oldWhere = where;
    where = newWhere;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.SELECT_FROM__WHERE, oldWhere, newWhere);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhere(whereClause newWhere)
  {
    if (newWhere != where)
    {
      NotificationChain msgs = null;
      if (where != null)
        msgs = ((InternalEObject)where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SELECT_FROM__WHERE, null, msgs);
      if (newWhere != null)
        msgs = ((InternalEObject)newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SELECT_FROM__WHERE, null, msgs);
      msgs = basicSetWhere(newWhere, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.SELECT_FROM__WHERE, newWhere, newWhere));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public groupByClause getGroupBy()
  {
    return groupBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGroupBy(groupByClause newGroupBy, NotificationChain msgs)
  {
    groupByClause oldGroupBy = groupBy;
    groupBy = newGroupBy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.SELECT_FROM__GROUP_BY, oldGroupBy, newGroupBy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupBy(groupByClause newGroupBy)
  {
    if (newGroupBy != groupBy)
    {
      NotificationChain msgs = null;
      if (groupBy != null)
        msgs = ((InternalEObject)groupBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SELECT_FROM__GROUP_BY, null, msgs);
      if (newGroupBy != null)
        msgs = ((InternalEObject)newGroupBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SELECT_FROM__GROUP_BY, null, msgs);
      msgs = basicSetGroupBy(newGroupBy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.SELECT_FROM__GROUP_BY, newGroupBy, newGroupBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public orderByClause getOrderBy()
  {
    return orderBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrderBy(orderByClause newOrderBy, NotificationChain msgs)
  {
    orderByClause oldOrderBy = orderBy;
    orderBy = newOrderBy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.SELECT_FROM__ORDER_BY, oldOrderBy, newOrderBy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrderBy(orderByClause newOrderBy)
  {
    if (newOrderBy != orderBy)
    {
      NotificationChain msgs = null;
      if (orderBy != null)
        msgs = ((InternalEObject)orderBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SELECT_FROM__ORDER_BY, null, msgs);
      if (newOrderBy != null)
        msgs = ((InternalEObject)newOrderBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SELECT_FROM__ORDER_BY, null, msgs);
      msgs = basicSetOrderBy(newOrderBy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.SELECT_FROM__ORDER_BY, newOrderBy, newOrderBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public selectClause getS()
  {
    return s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS(selectClause newS, NotificationChain msgs)
  {
    selectClause oldS = s;
    s = newS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.SELECT_FROM__S, oldS, newS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS(selectClause newS)
  {
    if (newS != s)
    {
      NotificationChain msgs = null;
      if (s != null)
        msgs = ((InternalEObject)s).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SELECT_FROM__S, null, msgs);
      if (newS != null)
        msgs = ((InternalEObject)newS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SELECT_FROM__S, null, msgs);
      msgs = basicSetS(newS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.SELECT_FROM__S, newS, newS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fromClause getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFrom(fromClause newFrom, NotificationChain msgs)
  {
    fromClause oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.SELECT_FROM__FROM, oldFrom, newFrom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(fromClause newFrom)
  {
    if (newFrom != from)
    {
      NotificationChain msgs = null;
      if (from != null)
        msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SELECT_FROM__FROM, null, msgs);
      if (newFrom != null)
        msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SELECT_FROM__FROM, null, msgs);
      msgs = basicSetFrom(newFrom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.SELECT_FROM__FROM, newFrom, newFrom));
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
      case EditorPackage.SELECT_FROM__WHERE:
        return basicSetWhere(null, msgs);
      case EditorPackage.SELECT_FROM__GROUP_BY:
        return basicSetGroupBy(null, msgs);
      case EditorPackage.SELECT_FROM__ORDER_BY:
        return basicSetOrderBy(null, msgs);
      case EditorPackage.SELECT_FROM__S:
        return basicSetS(null, msgs);
      case EditorPackage.SELECT_FROM__FROM:
        return basicSetFrom(null, msgs);
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
      case EditorPackage.SELECT_FROM__WHERE:
        return getWhere();
      case EditorPackage.SELECT_FROM__GROUP_BY:
        return getGroupBy();
      case EditorPackage.SELECT_FROM__ORDER_BY:
        return getOrderBy();
      case EditorPackage.SELECT_FROM__S:
        return getS();
      case EditorPackage.SELECT_FROM__FROM:
        return getFrom();
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
      case EditorPackage.SELECT_FROM__WHERE:
        setWhere((whereClause)newValue);
        return;
      case EditorPackage.SELECT_FROM__GROUP_BY:
        setGroupBy((groupByClause)newValue);
        return;
      case EditorPackage.SELECT_FROM__ORDER_BY:
        setOrderBy((orderByClause)newValue);
        return;
      case EditorPackage.SELECT_FROM__S:
        setS((selectClause)newValue);
        return;
      case EditorPackage.SELECT_FROM__FROM:
        setFrom((fromClause)newValue);
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
      case EditorPackage.SELECT_FROM__WHERE:
        setWhere((whereClause)null);
        return;
      case EditorPackage.SELECT_FROM__GROUP_BY:
        setGroupBy((groupByClause)null);
        return;
      case EditorPackage.SELECT_FROM__ORDER_BY:
        setOrderBy((orderByClause)null);
        return;
      case EditorPackage.SELECT_FROM__S:
        setS((selectClause)null);
        return;
      case EditorPackage.SELECT_FROM__FROM:
        setFrom((fromClause)null);
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
      case EditorPackage.SELECT_FROM__WHERE:
        return where != null;
      case EditorPackage.SELECT_FROM__GROUP_BY:
        return groupBy != null;
      case EditorPackage.SELECT_FROM__ORDER_BY:
        return orderBy != null;
      case EditorPackage.SELECT_FROM__S:
        return s != null;
      case EditorPackage.SELECT_FROM__FROM:
        return from != null;
    }
    return super.eIsSet(featureID);
  }

} //selectFromImpl
