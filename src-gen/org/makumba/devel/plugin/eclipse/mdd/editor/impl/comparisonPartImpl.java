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
import org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart;
import org.makumba.devel.plugin.eclipse.mdd.editor.lowerFunction;
import org.makumba.devel.plugin.eclipse.mdd.editor.upperFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>comparison Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonPartImpl#getT <em>T</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonPartImpl#getN <em>N</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonPartImpl#getDf <em>Df</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonPartImpl#getU <em>U</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonPartImpl#getL <em>L</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonPartImpl#getD <em>D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class comparisonPartImpl extends MinimalEObjectImpl.Container implements comparisonPart
{
  /**
   * The default value of the '{@link #getT() <em>T</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected static final String T_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getT() <em>T</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected String t = T_EDEFAULT;

  /**
   * The default value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected static final int N_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected int n = N_EDEFAULT;

  /**
   * The default value of the '{@link #getDf() <em>Df</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDf()
   * @generated
   * @ordered
   */
  protected static final String DF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDf() <em>Df</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDf()
   * @generated
   * @ordered
   */
  protected String df = DF_EDEFAULT;

  /**
   * The cached value of the '{@link #getU() <em>U</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getU()
   * @generated
   * @ordered
   */
  protected upperFunction u;

  /**
   * The cached value of the '{@link #getL() <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected lowerFunction l;

  /**
   * The default value of the '{@link #getD() <em>D</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected static final String D_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getD() <em>D</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected String d = D_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected comparisonPartImpl()
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
    return EditorPackage.Literals.COMPARISON_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(String newT)
  {
    String oldT = t;
    t = newT;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COMPARISON_PART__T, oldT, t));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN(int newN)
  {
    int oldN = n;
    n = newN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COMPARISON_PART__N, oldN, n));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDf()
  {
    return df;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDf(String newDf)
  {
    String oldDf = df;
    df = newDf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COMPARISON_PART__DF, oldDf, df));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public upperFunction getU()
  {
    return u;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetU(upperFunction newU, NotificationChain msgs)
  {
    upperFunction oldU = u;
    u = newU;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.COMPARISON_PART__U, oldU, newU);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setU(upperFunction newU)
  {
    if (newU != u)
    {
      NotificationChain msgs = null;
      if (u != null)
        msgs = ((InternalEObject)u).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMPARISON_PART__U, null, msgs);
      if (newU != null)
        msgs = ((InternalEObject)newU).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMPARISON_PART__U, null, msgs);
      msgs = basicSetU(newU, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COMPARISON_PART__U, newU, newU));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public lowerFunction getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetL(lowerFunction newL, NotificationChain msgs)
  {
    lowerFunction oldL = l;
    l = newL;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.COMPARISON_PART__L, oldL, newL);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL(lowerFunction newL)
  {
    if (newL != l)
    {
      NotificationChain msgs = null;
      if (l != null)
        msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMPARISON_PART__L, null, msgs);
      if (newL != null)
        msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMPARISON_PART__L, null, msgs);
      msgs = basicSetL(newL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COMPARISON_PART__L, newL, newL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getD()
  {
    return d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setD(String newD)
  {
    String oldD = d;
    d = newD;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COMPARISON_PART__D, oldD, d));
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
      case EditorPackage.COMPARISON_PART__U:
        return basicSetU(null, msgs);
      case EditorPackage.COMPARISON_PART__L:
        return basicSetL(null, msgs);
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
      case EditorPackage.COMPARISON_PART__T:
        return getT();
      case EditorPackage.COMPARISON_PART__N:
        return getN();
      case EditorPackage.COMPARISON_PART__DF:
        return getDf();
      case EditorPackage.COMPARISON_PART__U:
        return getU();
      case EditorPackage.COMPARISON_PART__L:
        return getL();
      case EditorPackage.COMPARISON_PART__D:
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
      case EditorPackage.COMPARISON_PART__T:
        setT((String)newValue);
        return;
      case EditorPackage.COMPARISON_PART__N:
        setN((Integer)newValue);
        return;
      case EditorPackage.COMPARISON_PART__DF:
        setDf((String)newValue);
        return;
      case EditorPackage.COMPARISON_PART__U:
        setU((upperFunction)newValue);
        return;
      case EditorPackage.COMPARISON_PART__L:
        setL((lowerFunction)newValue);
        return;
      case EditorPackage.COMPARISON_PART__D:
        setD((String)newValue);
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
      case EditorPackage.COMPARISON_PART__T:
        setT(T_EDEFAULT);
        return;
      case EditorPackage.COMPARISON_PART__N:
        setN(N_EDEFAULT);
        return;
      case EditorPackage.COMPARISON_PART__DF:
        setDf(DF_EDEFAULT);
        return;
      case EditorPackage.COMPARISON_PART__U:
        setU((upperFunction)null);
        return;
      case EditorPackage.COMPARISON_PART__L:
        setL((lowerFunction)null);
        return;
      case EditorPackage.COMPARISON_PART__D:
        setD(D_EDEFAULT);
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
      case EditorPackage.COMPARISON_PART__T:
        return T_EDEFAULT == null ? t != null : !T_EDEFAULT.equals(t);
      case EditorPackage.COMPARISON_PART__N:
        return n != N_EDEFAULT;
      case EditorPackage.COMPARISON_PART__DF:
        return DF_EDEFAULT == null ? df != null : !DF_EDEFAULT.equals(df);
      case EditorPackage.COMPARISON_PART__U:
        return u != null;
      case EditorPackage.COMPARISON_PART__L:
        return l != null;
      case EditorPackage.COMPARISON_PART__D:
        return D_EDEFAULT == null ? d != null : !D_EDEFAULT.equals(d);
    }
    return super.eIsSet(featureID);
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
    result.append(" (t: ");
    result.append(t);
    result.append(", n: ");
    result.append(n);
    result.append(", df: ");
    result.append(df);
    result.append(", d: ");
    result.append(d);
    result.append(')');
    return result.toString();
  }

} //comparisonPartImpl
