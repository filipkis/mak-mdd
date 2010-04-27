/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage;
import org.makumba.devel.plugin.eclipse.mdd.editor.fromClause;
import org.makumba.devel.plugin.eclipse.mdd.editor.fromJoin;
import org.makumba.devel.plugin.eclipse.mdd.editor.fromRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>from Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromClauseImpl#getFromRange <em>From Range</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromClauseImpl#getFromJoin <em>From Join</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class fromClauseImpl extends MinimalEObjectImpl.Container implements fromClause
{
  /**
   * The cached value of the '{@link #getFromRange() <em>From Range</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromRange()
   * @generated
   * @ordered
   */
  protected EList<fromRange> fromRange;

  /**
   * The cached value of the '{@link #getFromJoin() <em>From Join</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromJoin()
   * @generated
   * @ordered
   */
  protected EList<fromJoin> fromJoin;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected fromClauseImpl()
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
    return EditorPackage.Literals.FROM_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<fromRange> getFromRange()
  {
    if (fromRange == null)
    {
      fromRange = new EObjectContainmentEList<fromRange>(fromRange.class, this, EditorPackage.FROM_CLAUSE__FROM_RANGE);
    }
    return fromRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<fromJoin> getFromJoin()
  {
    if (fromJoin == null)
    {
      fromJoin = new EObjectContainmentEList<fromJoin>(fromJoin.class, this, EditorPackage.FROM_CLAUSE__FROM_JOIN);
    }
    return fromJoin;
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
      case EditorPackage.FROM_CLAUSE__FROM_RANGE:
        return ((InternalEList<?>)getFromRange()).basicRemove(otherEnd, msgs);
      case EditorPackage.FROM_CLAUSE__FROM_JOIN:
        return ((InternalEList<?>)getFromJoin()).basicRemove(otherEnd, msgs);
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
      case EditorPackage.FROM_CLAUSE__FROM_RANGE:
        return getFromRange();
      case EditorPackage.FROM_CLAUSE__FROM_JOIN:
        return getFromJoin();
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
      case EditorPackage.FROM_CLAUSE__FROM_RANGE:
        getFromRange().clear();
        getFromRange().addAll((Collection<? extends fromRange>)newValue);
        return;
      case EditorPackage.FROM_CLAUSE__FROM_JOIN:
        getFromJoin().clear();
        getFromJoin().addAll((Collection<? extends fromJoin>)newValue);
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
      case EditorPackage.FROM_CLAUSE__FROM_RANGE:
        getFromRange().clear();
        return;
      case EditorPackage.FROM_CLAUSE__FROM_JOIN:
        getFromJoin().clear();
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
      case EditorPackage.FROM_CLAUSE__FROM_RANGE:
        return fromRange != null && !fromRange.isEmpty();
      case EditorPackage.FROM_CLAUSE__FROM_JOIN:
        return fromJoin != null && !fromJoin.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //fromClauseImpl
