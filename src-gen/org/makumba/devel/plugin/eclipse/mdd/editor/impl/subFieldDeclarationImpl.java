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
import org.makumba.devel.plugin.eclipse.mdd.editor.declaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.subFieldDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sub Field Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.subFieldDeclarationImpl#getSubFieldOf <em>Sub Field Of</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.subFieldDeclarationImpl#getD <em>D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class subFieldDeclarationImpl extends declarationImpl implements subFieldDeclaration
{
  /**
   * The cached value of the '{@link #getSubFieldOf() <em>Sub Field Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubFieldOf()
   * @generated
   * @ordered
   */
  protected fieldDeclaration subFieldOf;

  /**
   * The cached value of the '{@link #getD() <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected declaration d;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected subFieldDeclarationImpl()
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
    return EditorPackage.Literals.SUB_FIELD_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fieldDeclaration getSubFieldOf()
  {
    if (subFieldOf != null && subFieldOf.eIsProxy())
    {
      InternalEObject oldSubFieldOf = (InternalEObject)subFieldOf;
      subFieldOf = (fieldDeclaration)eResolveProxy(oldSubFieldOf);
      if (subFieldOf != oldSubFieldOf)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EditorPackage.SUB_FIELD_DECLARATION__SUB_FIELD_OF, oldSubFieldOf, subFieldOf));
      }
    }
    return subFieldOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fieldDeclaration basicGetSubFieldOf()
  {
    return subFieldOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubFieldOf(fieldDeclaration newSubFieldOf)
  {
    fieldDeclaration oldSubFieldOf = subFieldOf;
    subFieldOf = newSubFieldOf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.SUB_FIELD_DECLARATION__SUB_FIELD_OF, oldSubFieldOf, subFieldOf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration getD()
  {
    return d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetD(declaration newD, NotificationChain msgs)
  {
    declaration oldD = d;
    d = newD;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.SUB_FIELD_DECLARATION__D, oldD, newD);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setD(declaration newD)
  {
    if (newD != d)
    {
      NotificationChain msgs = null;
      if (d != null)
        msgs = ((InternalEObject)d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SUB_FIELD_DECLARATION__D, null, msgs);
      if (newD != null)
        msgs = ((InternalEObject)newD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.SUB_FIELD_DECLARATION__D, null, msgs);
      msgs = basicSetD(newD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.SUB_FIELD_DECLARATION__D, newD, newD));
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
      case EditorPackage.SUB_FIELD_DECLARATION__D:
        return basicSetD(null, msgs);
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
      case EditorPackage.SUB_FIELD_DECLARATION__SUB_FIELD_OF:
        if (resolve) return getSubFieldOf();
        return basicGetSubFieldOf();
      case EditorPackage.SUB_FIELD_DECLARATION__D:
        return getD();
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
      case EditorPackage.SUB_FIELD_DECLARATION__SUB_FIELD_OF:
        setSubFieldOf((fieldDeclaration)newValue);
        return;
      case EditorPackage.SUB_FIELD_DECLARATION__D:
        setD((declaration)newValue);
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
      case EditorPackage.SUB_FIELD_DECLARATION__SUB_FIELD_OF:
        setSubFieldOf((fieldDeclaration)null);
        return;
      case EditorPackage.SUB_FIELD_DECLARATION__D:
        setD((declaration)null);
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
      case EditorPackage.SUB_FIELD_DECLARATION__SUB_FIELD_OF:
        return subFieldOf != null;
      case EditorPackage.SUB_FIELD_DECLARATION__D:
        return d != null;
    }
    return super.eIsSet(featureID);
  }

} //subFieldDeclarationImpl
