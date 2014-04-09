/**
 */
package edu.upb.lp.rebotinol;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.upb.lp.rebotinol.ComplexInstruction#getSubInstructions <em>Sub Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.upb.lp.rebotinol.RebotinolPackage#getComplexInstruction()
 * @model
 * @generated
 */
public interface ComplexInstruction extends NonEmptyInstruction
{
  /**
   * Returns the value of the '<em><b>Sub Instructions</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.rebotinol.Instruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Instructions</em>' containment reference list.
   * @see edu.upb.lp.rebotinol.RebotinolPackage#getComplexInstruction_SubInstructions()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getSubInstructions();

} // ComplexInstruction
