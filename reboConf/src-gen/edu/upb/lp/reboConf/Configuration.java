/**
 */
package edu.upb.lp.reboConf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.upb.lp.reboConf.Configuration#getInitial <em>Initial</em>}</li>
 *   <li>{@link edu.upb.lp.reboConf.Configuration#getExpected <em>Expected</em>}</li>
 *   <li>{@link edu.upb.lp.reboConf.Configuration#getMail <em>Mail</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.upb.lp.reboConf.ReboConfPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject
{
  /**
   * Returns the value of the '<em><b>Initial</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial</em>' containment reference.
   * @see #setInitial(Matrix)
   * @see edu.upb.lp.reboConf.ReboConfPackage#getConfiguration_Initial()
   * @model containment="true"
   * @generated
   */
  Matrix getInitial();

  /**
   * Sets the value of the '{@link edu.upb.lp.reboConf.Configuration#getInitial <em>Initial</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial</em>' containment reference.
   * @see #getInitial()
   * @generated
   */
  void setInitial(Matrix value);

  /**
   * Returns the value of the '<em><b>Expected</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expected</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expected</em>' containment reference.
   * @see #setExpected(Matrix)
   * @see edu.upb.lp.reboConf.ReboConfPackage#getConfiguration_Expected()
   * @model containment="true"
   * @generated
   */
  Matrix getExpected();

  /**
   * Sets the value of the '{@link edu.upb.lp.reboConf.Configuration#getExpected <em>Expected</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expected</em>' containment reference.
   * @see #getExpected()
   * @generated
   */
  void setExpected(Matrix value);

  /**
   * Returns the value of the '<em><b>Mail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mail</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mail</em>' containment reference.
   * @see #setMail(edu.upb.lp.reboConf.Number)
   * @see edu.upb.lp.reboConf.ReboConfPackage#getConfiguration_Mail()
   * @model containment="true"
   * @generated
   */
  edu.upb.lp.reboConf.Number getMail();

  /**
   * Sets the value of the '{@link edu.upb.lp.reboConf.Configuration#getMail <em>Mail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mail</em>' containment reference.
   * @see #getMail()
   * @generated
   */
  void setMail(edu.upb.lp.reboConf.Number value);

} // Configuration
