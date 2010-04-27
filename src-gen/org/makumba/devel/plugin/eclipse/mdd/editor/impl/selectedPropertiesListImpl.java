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
import org.makumba.devel.plugin.eclipse.mdd.editor.aliasedExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.selectedPropertiesList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>selected Properties List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectedPropertiesListImpl#getA <em>A</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class selectedPropertiesListImpl extends MinimalEObjectImpl.Container implements selectedPropertiesList
{
  /**
   * The cached value of the '{@link #getA() <em>A</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected EList<aliasedExpression> a;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected selectedPropertiesListImpl()
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
    return EditorPackage.Literals.SELECTED_PROPERTIES_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<aliasedExpression> getA()
  {
    if (a == null)
    {
      a = new EObjectContainmentEList<aliasedExpression>(aliasedExpression.class, this, EditorPackage.SELECTED_PROPERTIES_LIST__A);
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
      case EditorPackage.SELECTED_PROPERTIES_LIST__A:
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
      case EditorPackage.SELECTED_PROPERTIES_LIST__A:
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
      case EditorPackage.SELECTED_PROPERTIES_LIST__A:
        getA().clear();
        getA().addAll((Collection<? extends aliasedExpression>)newValue);
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
      case EditorPackage.SELECTED_PROPERTIES_LIST__A:
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
      case EditorPackage.SELECTED_PROPERTIES_LIST__A:
        return a != null && !a.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //selectedPropertiesListImpl
