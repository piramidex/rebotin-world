/**
 */
package edu.upb.lp.reboConf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.upb.lp.reboConf.Line#getEls <em>Els</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.upb.lp.reboConf.ReboConfPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends EObject
{
  /**
   * Returns the value of the '<em><b>Els</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.reboConf.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Els</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Els</em>' containment reference list.
   * @see edu.upb.lp.reboConf.ReboConfPackage#getLine_Els()
   * @model containment="true"
   * @generated
   */
  EList<Element> getEls();

} // Line
