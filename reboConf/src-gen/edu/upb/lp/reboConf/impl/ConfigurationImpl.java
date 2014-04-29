/**
 */
package edu.upb.lp.reboConf.impl;

import edu.upb.lp.reboConf.Configuration;
import edu.upb.lp.reboConf.Matrix;
import edu.upb.lp.reboConf.ReboConfPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.upb.lp.reboConf.impl.ConfigurationImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link edu.upb.lp.reboConf.impl.ConfigurationImpl#getExpected <em>Expected</em>}</li>
 *   <li>{@link edu.upb.lp.reboConf.impl.ConfigurationImpl#getMail <em>Mail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration
{
  /**
   * The cached value of the '{@link #getInitial() <em>Initial</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitial()
   * @generated
   * @ordered
   */
  protected Matrix initial;

  /**
   * The cached value of the '{@link #getExpected() <em>Expected</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpected()
   * @generated
   * @ordered
   */
  protected Matrix expected;

  /**
   * The cached value of the '{@link #getMail() <em>Mail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMail()
   * @generated
   * @ordered
   */
  protected edu.upb.lp.reboConf.Number mail;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfigurationImpl()
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
    return ReboConfPackage.Literals.CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matrix getInitial()
  {
    return initial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitial(Matrix newInitial, NotificationChain msgs)
  {
    Matrix oldInitial = initial;
    initial = newInitial;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReboConfPackage.CONFIGURATION__INITIAL, oldInitial, newInitial);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitial(Matrix newInitial)
  {
    if (newInitial != initial)
    {
      NotificationChain msgs = null;
      if (initial != null)
        msgs = ((InternalEObject)initial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReboConfPackage.CONFIGURATION__INITIAL, null, msgs);
      if (newInitial != null)
        msgs = ((InternalEObject)newInitial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReboConfPackage.CONFIGURATION__INITIAL, null, msgs);
      msgs = basicSetInitial(newInitial, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReboConfPackage.CONFIGURATION__INITIAL, newInitial, newInitial));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matrix getExpected()
  {
    return expected;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpected(Matrix newExpected, NotificationChain msgs)
  {
    Matrix oldExpected = expected;
    expected = newExpected;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReboConfPackage.CONFIGURATION__EXPECTED, oldExpected, newExpected);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpected(Matrix newExpected)
  {
    if (newExpected != expected)
    {
      NotificationChain msgs = null;
      if (expected != null)
        msgs = ((InternalEObject)expected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReboConfPackage.CONFIGURATION__EXPECTED, null, msgs);
      if (newExpected != null)
        msgs = ((InternalEObject)newExpected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReboConfPackage.CONFIGURATION__EXPECTED, null, msgs);
      msgs = basicSetExpected(newExpected, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReboConfPackage.CONFIGURATION__EXPECTED, newExpected, newExpected));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public edu.upb.lp.reboConf.Number getMail()
  {
    return mail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMail(edu.upb.lp.reboConf.Number newMail, NotificationChain msgs)
  {
    edu.upb.lp.reboConf.Number oldMail = mail;
    mail = newMail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReboConfPackage.CONFIGURATION__MAIL, oldMail, newMail);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMail(edu.upb.lp.reboConf.Number newMail)
  {
    if (newMail != mail)
    {
      NotificationChain msgs = null;
      if (mail != null)
        msgs = ((InternalEObject)mail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReboConfPackage.CONFIGURATION__MAIL, null, msgs);
      if (newMail != null)
        msgs = ((InternalEObject)newMail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReboConfPackage.CONFIGURATION__MAIL, null, msgs);
      msgs = basicSetMail(newMail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReboConfPackage.CONFIGURATION__MAIL, newMail, newMail));
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
      case ReboConfPackage.CONFIGURATION__INITIAL:
        return basicSetInitial(null, msgs);
      case ReboConfPackage.CONFIGURATION__EXPECTED:
        return basicSetExpected(null, msgs);
      case ReboConfPackage.CONFIGURATION__MAIL:
        return basicSetMail(null, msgs);
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
      case ReboConfPackage.CONFIGURATION__INITIAL:
        return getInitial();
      case ReboConfPackage.CONFIGURATION__EXPECTED:
        return getExpected();
      case ReboConfPackage.CONFIGURATION__MAIL:
        return getMail();
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
      case ReboConfPackage.CONFIGURATION__INITIAL:
        setInitial((Matrix)newValue);
        return;
      case ReboConfPackage.CONFIGURATION__EXPECTED:
        setExpected((Matrix)newValue);
        return;
      case ReboConfPackage.CONFIGURATION__MAIL:
        setMail((edu.upb.lp.reboConf.Number)newValue);
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
      case ReboConfPackage.CONFIGURATION__INITIAL:
        setInitial((Matrix)null);
        return;
      case ReboConfPackage.CONFIGURATION__EXPECTED:
        setExpected((Matrix)null);
        return;
      case ReboConfPackage.CONFIGURATION__MAIL:
        setMail((edu.upb.lp.reboConf.Number)null);
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
      case ReboConfPackage.CONFIGURATION__INITIAL:
        return initial != null;
      case ReboConfPackage.CONFIGURATION__EXPECTED:
        return expected != null;
      case ReboConfPackage.CONFIGURATION__MAIL:
        return mail != null;
    }
    return super.eIsSet(featureID);
  }

} //ConfigurationImpl
