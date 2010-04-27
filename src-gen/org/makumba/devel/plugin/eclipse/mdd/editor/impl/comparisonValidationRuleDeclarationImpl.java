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
import org.makumba.devel.plugin.eclipse.mdd.editor.comparisonExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.comparisonValidationRuleDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>comparison Validation Rule Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonValidationRuleDeclarationImpl#getComparisonExp <em>Comparison Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class comparisonValidationRuleDeclarationImpl extends validationRuleDeclarationImpl implements comparisonValidationRuleDeclaration
{
  /**
   * The cached value of the '{@link #getComparisonExp() <em>Comparison Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComparisonExp()
   * @generated
   * @ordered
   */
  protected comparisonExpression comparisonExp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected comparisonValidationRuleDeclarationImpl()
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
    return EditorPackage.Literals.COMPARISON_VALIDATION_RULE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public comparisonExpression getComparisonExp()
  {
    return comparisonExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComparisonExp(comparisonExpression newComparisonExp, NotificationChain msgs)
  {
    comparisonExpression oldComparisonExp = comparisonExp;
    comparisonExp = newComparisonExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.COMPARISON_VALIDATION_RULE_DECLARATION__COMPARISON_EXP, oldComparisonExp, newComparisonExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComparisonExp(comparisonExpression newComparisonExp)
  {
    if (newComparisonExp != comparisonExp)
    {
      NotificationChain msgs = null;
      if (comparisonExp != null)
        msgs = ((InternalEObject)comparisonExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMPARISON_VALIDATION_RULE_DECLARATION__COMPARISON_EXP, null, msgs);
      if (newComparisonExp != null)
        msgs = ((InternalEObject)newComparisonExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.COMPARISON_VALIDATION_RULE_DECLARATION__COMPARISON_EXP, null, msgs);
      msgs = basicSetComparisonExp(newComparisonExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.COMPARISON_VALIDATION_RULE_DECLARATION__COMPARISON_EXP, newComparisonExp, newComparisonExp));
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
      case EditorPackage.COMPARISON_VALIDATION_RULE_DECLARATION__COMPARISON_EXP:
        return basicSetComparisonExp(null, msgs);
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
      case EditorPackage.COMPARISON_VALIDATION_RULE_DECLARATION__COMPARISON_EXP:
        return getComparisonExp();
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
      case EditorPackage.COMPARISON_VALIDATION_RULE_DECLARATION__COMPARISON_EXP:
        setComparisonExp((comparisonExpression)newValue);
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
      case EditorPackage.COMPARISON_VALIDATION_RULE_DECLARATION__COMPARISON_EXP:
        setComparisonExp((comparisonExpression)null);
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
      case EditorPackage.COMPARISON_VALIDATION_RULE_DECLARATION__COMPARISON_EXP:
        return comparisonExp != null;
    }
    return super.eIsSet(featureID);
  }

} //comparisonValidationRuleDeclarationImpl
