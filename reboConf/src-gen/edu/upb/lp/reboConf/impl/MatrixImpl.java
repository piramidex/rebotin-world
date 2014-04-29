/**
 */
package edu.upb.lp.reboConf.impl;

import edu.upb.lp.reboConf.Line;
import edu.upb.lp.reboConf.Matrix;
import edu.upb.lp.reboConf.ReboConfPackage;

import java.lang.Integer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.upb.lp.reboConf.impl.MatrixImpl#getFilas <em>Filas</em>}</li>
 *   <li>{@link edu.upb.lp.reboConf.impl.MatrixImpl#getColumnas <em>Columnas</em>}</li>
 *   <li>{@link edu.upb.lp.reboConf.impl.MatrixImpl#getLines <em>Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatrixImpl extends MinimalEObjectImpl.Container implements Matrix
{
  /**
   * The default value of the '{@link #getFilas() <em>Filas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilas()
   * @generated
   * @ordered
   */
  protected static final int FILAS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFilas() <em>Filas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilas()
   * @generated
   * @ordered
   */
  protected int filas = FILAS_EDEFAULT;

  /**
   * The default value of the '{@link #getColumnas() <em>Columnas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnas()
   * @generated
   * @ordered
   */
  protected static final int COLUMNAS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getColumnas() <em>Columnas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnas()
   * @generated
   * @ordered
   */
  protected int columnas = COLUMNAS_EDEFAULT;

  /**
   * The cached value of the '{@link #getLines() <em>Lines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLines()
   * @generated
   * @ordered
   */
  protected EList<Line> lines;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MatrixImpl()
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
    return ReboConfPackage.Literals.MATRIX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFilas()
  {
    return filas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilas(int newFilas)
  {
    int oldFilas = filas;
    filas = newFilas;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReboConfPackage.MATRIX__FILAS, oldFilas, filas));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getColumnas()
  {
    return columnas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumnas(int newColumnas)
  {
    int oldColumnas = columnas;
    columnas = newColumnas;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReboConfPackage.MATRIX__COLUMNAS, oldColumnas, columnas));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Line> getLines()
  {
    if (lines == null)
    {
      lines = new EObjectContainmentEList<Line>(Line.class, this, ReboConfPackage.MATRIX__LINES);
    }
    return lines;
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
      case ReboConfPackage.MATRIX__LINES:
        return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
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
      case ReboConfPackage.MATRIX__FILAS:
        return getFilas();
      case ReboConfPackage.MATRIX__COLUMNAS:
        return getColumnas();
      case ReboConfPackage.MATRIX__LINES:
        return getLines();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ReboConfPackage.MATRIX__FILAS:
        setFilas((Integer)newValue);
        return;
      case ReboConfPackage.MATRIX__COLUMNAS:
        setColumnas((Integer)newValue);
        return;
      case ReboConfPackage.MATRIX__LINES:
        getLines().clear();
        getLines().addAll((Collection<? extends Line>)newValue);
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
      case ReboConfPackage.MATRIX__FILAS:
        setFilas(FILAS_EDEFAULT);
        return;
      case ReboConfPackage.MATRIX__COLUMNAS:
        setColumnas(COLUMNAS_EDEFAULT);
        return;
      case ReboConfPackage.MATRIX__LINES:
        getLines().clear();
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
      case ReboConfPackage.MATRIX__FILAS:
        return filas != FILAS_EDEFAULT;
      case ReboConfPackage.MATRIX__COLUMNAS:
        return columnas != COLUMNAS_EDEFAULT;
      case ReboConfPackage.MATRIX__LINES:
        return lines != null && !lines.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (filas: ");
    result.append(filas);
    result.append(", columnas: ");
    result.append(columnas);
    result.append(')');
    return result.toString();
  }

} //MatrixImpl
