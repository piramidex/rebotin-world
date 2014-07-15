/**
 */
package edu.upb.lp.rebotinol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.upb.lp.rebotinol.Fraction#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link edu.upb.lp.rebotinol.Fraction#getDenominator <em>Denominator</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.upb.lp.rebotinol.RebotinolPackage#getFraction()
 * @model
 * @generated
 */
public interface Fraction extends PositiveNumber
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
   * @see #setNumerator(edu.upb.lp.rebotinol.Integer)
   * @see edu.upb.lp.rebotinol.RebotinolPackage#getFraction_Numerator()
   * @model containment="true"
   * @generated
   */
  edu.upb.lp.rebotinol.Integer getNumerator();

  /**
   * Sets the value of the '{@link edu.upb.lp.rebotinol.Fraction#getNumerator <em>Numerator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numerator</em>' containment reference.
   * @see #getNumerator()
   * @generated
   */
  void setNumerator(edu.upb.lp.rebotinol.Integer value);

  /**
   * Returns the value of the '<em><b>Denominator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Denominator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Denominator</em>' containment reference.
   * @see #setDenominator(edu.upb.lp.rebotinol.Integer)
   * @see edu.upb.lp.rebotinol.RebotinolPackage#getFraction_Denominator()
   * @model containment="true"
   * @generated
   */
  edu.upb.lp.rebotinol.Integer getDenominator();

  /**
   * Sets the value of the '{@link edu.upb.lp.rebotinol.Fraction#getDenominator <em>Denominator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Denominator</em>' containment reference.
   * @see #getDenominator()
   * @generated
   */
  void setDenominator(edu.upb.lp.rebotinol.Integer value);

} // Fraction
