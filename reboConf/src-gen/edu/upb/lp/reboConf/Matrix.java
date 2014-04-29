/**
 */
package edu.upb.lp.reboConf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.upb.lp.reboConf.Matrix#getFilas <em>Filas</em>}</li>
 *   <li>{@link edu.upb.lp.reboConf.Matrix#getColumnas <em>Columnas</em>}</li>
 *   <li>{@link edu.upb.lp.reboConf.Matrix#getLines <em>Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.upb.lp.reboConf.ReboConfPackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends EObject
{
  /**
   * Returns the value of the '<em><b>Filas</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filas</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filas</em>' attribute.
   * @see #setFilas(int)
   * @see edu.upb.lp.reboConf.ReboConfPackage#getMatrix_Filas()
   * @model
   * @generated
   */
  int getFilas();

  /**
   * Sets the value of the '{@link edu.upb.lp.reboConf.Matrix#getFilas <em>Filas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filas</em>' attribute.
   * @see #getFilas()
   * @generated
   */
  void setFilas(int value);

  /**
   * Returns the value of the '<em><b>Columnas</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columnas</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columnas</em>' attribute.
   * @see #setColumnas(int)
   * @see edu.upb.lp.reboConf.ReboConfPackage#getMatrix_Columnas()
   * @model
   * @generated
   */
  int getColumnas();

  /**
   * Sets the value of the '{@link edu.upb.lp.reboConf.Matrix#getColumnas <em>Columnas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Columnas</em>' attribute.
   * @see #getColumnas()
   * @generated
   */
  void setColumnas(int value);

  /**
   * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.reboConf.Line}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lines</em>' containment reference list.
   * @see edu.upb.lp.reboConf.ReboConfPackage#getMatrix_Lines()
   * @model containment="true"
   * @generated
   */
  EList<Line> getLines();

} // Matrix
