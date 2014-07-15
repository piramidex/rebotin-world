/**
 */
package edu.upb.lp.rebotinol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sumak</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.upb.lp.rebotinol.Sumak#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.upb.lp.rebotinol.RebotinolPackage#getSumak()
 * @model
 * @generated
 */
public interface Sumak extends NonEmptyInstruction
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(edu.upb.lp.rebotinol.Number)
   * @see edu.upb.lp.rebotinol.RebotinolPackage#getSumak_Val()
   * @model containment="true"
   * @generated
   */
  edu.upb.lp.rebotinol.Number getVal();

  /**
   * Sets the value of the '{@link edu.upb.lp.rebotinol.Sumak#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(edu.upb.lp.rebotinol.Number value);

} // Sumak
