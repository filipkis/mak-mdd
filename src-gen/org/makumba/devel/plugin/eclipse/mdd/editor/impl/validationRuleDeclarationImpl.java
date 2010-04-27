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
import org.makumba.devel.plugin.eclipse.mdd.editor.errorMessage;
import org.makumba.devel.plugin.eclipse.mdd.editor.functionArguments;
import org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>validation Rule Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.validationRuleDeclarationImpl#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.validationRuleDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.validationRuleDeclarationImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class validationRuleDeclarationImpl extends declarationImpl implements validationRuleDeclaration
{
  /**
   * The cached value of the '{@link #getErrorMessage() <em>Error Message</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorMessage()
   * @generated
   * @ordered
   */
  protected errorMessage errorMessage;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected functionArguments args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected validationRuleDeclarationImpl()
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
    return EditorPackage.Literals.VALIDATION_RULE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public errorMessage getErrorMessage()
  {
    return errorMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetErrorMessage(errorMessage newErrorMessage, NotificationChain msgs)
  {
    errorMessage oldErrorMessage = errorMessage;
    errorMessage = newErrorMessage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.VALIDATION_RULE_DECLARATION__ERROR_MESSAGE, oldErrorMessage, newErrorMessage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setErrorMessage(errorMessage newErrorMessage)
  {
    if (newErrorMessage != errorMessage)
    {
      NotificationChain msgs = null;
      if (errorMessage != null)
        msgs = ((InternalEObject)errorMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VALIDATION_RULE_DECLARATION__ERROR_MESSAGE, null, msgs);
      if (newErrorMessage != null)
        msgs = ((InternalEObject)newErrorMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VALIDATION_RULE_DECLARATION__ERROR_MESSAGE, null, msgs);
      msgs = basicSetErrorMessage(newErrorMessage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VALIDATION_RULE_DECLARATION__ERROR_MESSAGE, newErrorMessage, newErrorMessage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VALIDATION_RULE_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionArguments getArgs()
  {
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgs(functionArguments newArgs, NotificationChain msgs)
  {
    functionArguments oldArgs = args;
    args = newArgs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditorPackage.VALIDATION_RULE_DECLARATION__ARGS, oldArgs, newArgs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgs(functionArguments newArgs)
  {
    if (newArgs != args)
    {
      NotificationChain msgs = null;
      if (args != null)
        msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VALIDATION_RULE_DECLARATION__ARGS, null, msgs);
      if (newArgs != null)
        msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditorPackage.VALIDATION_RULE_DECLARATION__ARGS, null, msgs);
      msgs = basicSetArgs(newArgs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.VALIDATION_RULE_DECLARATION__ARGS, newArgs, newArgs));
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
      case EditorPackage.VALIDATION_RULE_DECLARATION__ERROR_MESSAGE:
        return basicSetErrorMessage(null, msgs);
      case EditorPackage.VALIDATION_RULE_DECLARATION__ARGS:
        return basicSetArgs(null, msgs);
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
      case EditorPackage.VALIDATION_RULE_DECLARATION__ERROR_MESSAGE:
        return getErrorMessage();
      case EditorPackage.VALIDATION_RULE_DECLARATION__NAME:
        return getName();
      case EditorPackage.VALIDATION_RULE_DECLARATION__ARGS:
        return getArgs();
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
      case EditorPackage.VALIDATION_RULE_DECLARATION__ERROR_MESSAGE:
        setErrorMessage((errorMessage)newValue);
        return;
      case EditorPackage.VALIDATION_RULE_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case EditorPackage.VALIDATION_RULE_DECLARATION__ARGS:
        setArgs((functionArguments)newValue);
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
      case EditorPackage.VALIDATION_RULE_DECLARATION__ERROR_MESSAGE:
        setErrorMessage((errorMessage)null);
        return;
      case EditorPackage.VALIDATION_RULE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EditorPackage.VALIDATION_RULE_DECLARATION__ARGS:
        setArgs((functionArguments)null);
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
      case EditorPackage.VALIDATION_RULE_DECLARATION__ERROR_MESSAGE:
        return errorMessage != null;
      case EditorPackage.VALIDATION_RULE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EditorPackage.VALIDATION_RULE_DECLARATION__ARGS:
        return args != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //validationRuleDeclarationImpl
