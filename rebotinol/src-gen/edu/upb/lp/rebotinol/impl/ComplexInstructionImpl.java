/**
 */
package edu.upb.lp.rebotinol.impl;

import edu.upb.lp.rebotinol.ComplexInstruction;
import edu.upb.lp.rebotinol.Instruction;
import edu.upb.lp.rebotinol.RebotinolPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.upb.lp.rebotinol.impl.ComplexInstructionImpl#getSubInstructions <em>Sub Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexInstructionImpl extends NonEmptyInstructionImpl implements ComplexInstruction
{
  /**
   * The cached value of the '{@link #getSubInstructions() <em>Sub Instructions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubInstructions()
   * @generated
   * @ordered
   */
  protected EList<Instruction> subInstructions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComplexInstructionImpl()
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
    return RebotinolPackage.Literals.COMPLEX_INSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Instruction> getSubInstructions()
  {
    if (subInstructions == null)
    {
      subInstructions = new EObjectContainmentEList<Instruction>(Instruction.class, this, RebotinolPackage.COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS);
    }
    return subInstructions;
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
      case RebotinolPackage.COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS:
        return ((InternalEList<?>)getSubInstructions()).basicRemove(otherEnd, msgs);
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
      case RebotinolPackage.COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS:
        return getSubInstructions();
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
      case RebotinolPackage.COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS:
        getSubInstructions().clear();
        getSubInstructions().addAll((Collection<? extends Instruction>)newValue);
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
      case RebotinolPackage.COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS:
        getSubInstructions().clear();
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
      case RebotinolPackage.COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS:
        return subInstructions != null && !subInstructions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ComplexInstructionImpl
