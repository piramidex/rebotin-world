/**
 */
package edu.upb.lp.reboConf.impl;

import edu.upb.lp.reboConf.NFraction;
import edu.upb.lp.reboConf.NInteger;
import edu.upb.lp.reboConf.ReboConfPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NFraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.upb.lp.reboConf.impl.NFractionImpl#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link edu.upb.lp.reboConf.impl.NFractionImpl#getDenominator <em>Denominator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NFractionImpl extends NegativeNumberImpl implements NFraction
{
  /**
   * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumerator()
   * @generated
   * @ordered
   */
  protected NInteger numerator;

  /**
   * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDenominator()
   * @generated
   * @ordered
   */
  protected NInteger denominator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NFractionImpl()
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
    return ReboConfPackage.Literals.NFRACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NInteger getNumerator()
  {
    return numerator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumerator(NInteger newNumerator, NotificationChain msgs)
  {
    NInteger oldNumerator = numerator;
    numerator = newNumerator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReboConfPackage.NFRACTION__NUMERATOR, oldNumerator, newNumerator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumerator(NInteger newNumerator)
  {
    if (newNumerator != numerator)
    {
      NotificationChain msgs = null;
      if (numerator != null)
        msgs = ((InternalEObject)numerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReboConfPackage.NFRACTION__NUMERATOR, null, msgs);
      if (newNumerator != null)
        msgs = ((InternalEObject)newNumerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReboConfPackage.NFRACTION__NUMERATOR, null, msgs);
      msgs = basicSetNumerator(newNumerator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReboConfPackage.NFRACTION__NUMERATOR, newNumerator, newNumerator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NInteger getDenominator()
  {
    return denominator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDenominator(NInteger newDenominator, NotificationChain msgs)
  {
    NInteger oldDenominator = denominator;
    denominator = newDenominator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReboConfPackage.NFRACTION__DENOMINATOR, oldDenominator, newDenominator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDenominator(NInteger newDenominator)
  {
    if (newDenominator != denominator)
    {
      NotificationChain msgs = null;
      if (denominator != null)
        msgs = ((InternalEObject)denominator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReboConfPackage.NFRACTION__DENOMINATOR, null, msgs);
      if (newDenominator != null)
        msgs = ((InternalEObject)newDenominator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReboConfPackage.NFRACTION__DENOMINATOR, null, msgs);
      msgs = basicSetDenominator(newDenominator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReboConfPackage.NFRACTION__DENOMINATOR, newDenominator, newDenominator));
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
      case ReboConfPackage.NFRACTION__NUMERATOR:
        return basicSetNumerator(null, msgs);
      case ReboConfPackage.NFRACTION__DENOMINATOR:
        return basicSetDenominator(null, msgs);
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
      case ReboConfPackage.NFRACTION__NUMERATOR:
        return getNumerator();
      case ReboConfPackage.NFRACTION__DENOMINATOR:
        return getDenominator();
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
      case ReboConfPackage.NFRACTION__NUMERATOR:
        setNumerator((NInteger)newValue);
        return;
      case ReboConfPackage.NFRACTION__DENOMINATOR:
        setDenominator((NInteger)newValue);
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
      case ReboConfPackage.NFRACTION__NUMERATOR:
        setNumerator((NInteger)null);
        return;
      case ReboConfPackage.NFRACTION__DENOMINATOR:
        setDenominator((NInteger)null);
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
      case ReboConfPackage.NFRACTION__NUMERATOR:
        return numerator != null;
      case ReboConfPackage.NFRACTION__DENOMINATOR:
        return denominator != null;
    }
    return super.eIsSet(featureID);
  }

} //NFractionImpl
