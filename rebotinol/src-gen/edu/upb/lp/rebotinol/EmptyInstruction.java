/**
 */
package edu.upb.lp.rebotinol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empty Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.upb.lp.rebotinol.EmptyInstruction#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.upb.lp.rebotinol.RebotinolPackage#getEmptyInstruction()
 * @model
 * @generated
 */
public interface EmptyInstruction extends Instruction
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link edu.upb.lp.rebotinol.EmptyInstructionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see edu.upb.lp.rebotinol.EmptyInstructionType
   * @see #setType(EmptyInstructionType)
   * @see edu.upb.lp.rebotinol.RebotinolPackage#getEmptyInstruction_Type()
   * @model
   * @generated
   */
  EmptyInstructionType getType();

  /**
   * Sets the value of the '{@link edu.upb.lp.rebotinol.EmptyInstruction#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see edu.upb.lp.rebotinol.EmptyInstructionType
   * @see #getType()
   * @generated
   */
  void setType(EmptyInstructionType value);

} // EmptyInstruction
