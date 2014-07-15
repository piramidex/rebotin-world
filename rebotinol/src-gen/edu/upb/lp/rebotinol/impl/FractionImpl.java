/**
 */
package edu.upb.lp.rebotinol.impl;

import edu.upb.lp.rebotinol.Fraction;
import edu.upb.lp.rebotinol.RebotinolPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.upb.lp.rebotinol.impl.FractionImpl#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link edu.upb.lp.rebotinol.impl.FractionImpl#getDenominator <em>Denominator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FractionImpl extends PositiveNumberImpl implements Fraction
{
  /**
   * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumerator()
   * @generated
   * @ordered
   */
  protected edu.upb.lp.rebotinol.Integer numerator;

  /**
   * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDenominator()
   * @generated
   * @ordered
   */
  protected edu.upb.lp.rebotinol.Integer denominator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FractionImpl()
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
    return RebotinolPackage.Literals.FRACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public edu.upb.lp.rebotinol.Integer getNumerator()
  {
    return numerator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumerator(edu.upb.lp.rebotinol.Integer newNumerator, NotificationChain msgs)
  {
    edu.upb.lp.rebotinol.Integer oldNumerator = numerator;
    numerator = newNumerator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RebotinolPackage.FRACTION__NUMERATOR, oldNumerator, newNumerator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumerator(edu.upb.lp.rebotinol.Integer newNumerator)
  {
    if (newNumerator != numerator)
    {
      NotificationChain msgs = null;
      if (numerator != null)
        msgs = ((InternalEObject)numerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RebotinolPackage.FRACTION__NUMERATOR, null, msgs);
      if (newNumerator != null)
        msgs = ((InternalEObject)newNumerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RebotinolPackage.FRACTION__NUMERATOR, null, msgs);
      msgs = basicSetNumerator(newNumerator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RebotinolPackage.FRACTION__NUMERATOR, newNumerator, newNumerator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public edu.upb.lp.rebotinol.Integer getDenominator()
  {
    return denominator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDenominator(edu.upb.lp.rebotinol.Integer newDenominator, NotificationChain msgs)
  {
    edu.upb.lp.rebotinol.Integer oldDenominator = denominator;
    denominator = newDenominator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RebotinolPackage.FRACTION__DENOMINATOR, oldDenominator, newDenominator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDenominator(edu.upb.lp.rebotinol.Integer newDenominator)
  {
    if (newDenominator != denominator)
    {
      NotificationChain msgs = null;
      if (denominator != null)
        msgs = ((InternalEObject)denominator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RebotinolPackage.FRACTION__DENOMINATOR, null, msgs);
      if (newDenominator != null)
        msgs = ((InternalEObject)newDenominator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RebotinolPackage.FRACTION__DENOMINATOR, null, msgs);
      msgs = basicSetDenominator(newDenominator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RebotinolPackage.FRACTION__DENOMINATOR, newDenominator, newDenominator));
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
      case RebotinolPackage.FRACTION__NUMERATOR:
        return basicSetNumerator(null, msgs);
      case RebotinolPackage.FRACTION__DENOMINATOR:
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
      case RebotinolPackage.FRACTION__NUMERATOR:
        return getNumerator();
      case RebotinolPackage.FRACTION__DENOMINATOR:
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
      case RebotinolPackage.FRACTION__NUMERATOR:
        setNumerator((edu.upb.lp.rebotinol.Integer)newValue);
        return;
      case RebotinolPackage.FRACTION__DENOMINATOR:
        setDenominator((edu.upb.lp.rebotinol.Integer)newValue);
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
      case RebotinolPackage.FRACTION__NUMERATOR:
        setNumerator((edu.upb.lp.rebotinol.Integer)null);
        return;
      case RebotinolPackage.FRACTION__DENOMINATOR:
        setDenominator((edu.upb.lp.rebotinol.Integer)null);
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
      case RebotinolPackage.FRACTION__NUMERATOR:
        return numerator != null;
      case RebotinolPackage.FRACTION__DENOMINATOR:
        return denominator != null;
    }
    return super.eIsSet(featureID);
  }

} //FractionImpl
