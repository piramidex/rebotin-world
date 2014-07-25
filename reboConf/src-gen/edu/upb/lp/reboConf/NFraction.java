/**
 */
package edu.upb.lp.reboConf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.upb.lp.reboConf.NFraction#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link edu.upb.lp.reboConf.NFraction#getDenominator <em>Denominator</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.upb.lp.reboConf.ReboConfPackage#getNFraction()
 * @model
 * @generated
 */
public interface NFraction extends NegativeNumber
{
  /**
   * Returns the value of the '<em><b>Numerator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numerator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numerator</em>' containment reference.
   * @see #setNumerator(NInteger)
   * @see edu.upb.lp.reboConf.ReboConfPackage#getNFraction_Numerator()
   * @model containment="true"
   * @generated
   */
  NInteger getNumerator();

  /**
   * Sets the value of the '{@link edu.upb.lp.reboConf.NFraction#getNumerator <em>Numerator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numerator</em>' containment reference.
   * @see #getNumerator()
   * @generated
   */
  void setNumerator(NInteger value);

  /**
   * Returns the value of the '<em><b>Denominator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Denominator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Denominator</em>' containment reference.
   * @see #setDenominator(NInteger)
   * @see edu.upb.lp.reboConf.ReboConfPackage#getNFraction_Denominator()
   * @model containment="true"
   * @generated
   */
  NInteger getDenominator();

  /**
   * Sets the value of the '{@link edu.upb.lp.reboConf.NFraction#getDenominator <em>Denominator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Denominator</em>' containment reference.
   * @see #getDenominator()
   * @generated
   */
  void setDenominator(NInteger value);

} // NFraction
