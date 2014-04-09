/**
 */
package edu.upb.lp.rebotinol;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.upb.lp.rebotinol.RebotinolProgram#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.upb.lp.rebotinol.RebotinolPackage#getRebotinolProgram()
 * @model
 * @generated
 */
public interface RebotinolProgram extends EObject
{
  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.rebotinol.Instruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see edu.upb.lp.rebotinol.RebotinolPackage#getRebotinolProgram_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getInstructions();

} // RebotinolProgram
