/**
 */
package edu.upb.lp.rebotinol.util;

import edu.upb.lp.rebotinol.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.upb.lp.rebotinol.RebotinolPackage
 * @generated
 */
public class RebotinolSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RebotinolPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RebotinolSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RebotinolPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RebotinolPackage.REBOTINOL_PROGRAM:
      {
        RebotinolProgram rebotinolProgram = (RebotinolProgram)theEObject;
        T result = caseRebotinolProgram(rebotinolProgram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RebotinolPackage.INSTRUCTION:
      {
        Instruction instruction = (Instruction)theEObject;
        T result = caseInstruction(instruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RebotinolPackage.EMPTY_INSTRUCTION:
      {
        EmptyInstruction emptyInstruction = (EmptyInstruction)theEObject;
        T result = caseEmptyInstruction(emptyInstruction);
        if (result == null) result = caseInstruction(emptyInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RebotinolPackage.NON_EMPTY_INSTRUCTION:
      {
        NonEmptyInstruction nonEmptyInstruction = (NonEmptyInstruction)theEObject;
        T result = caseNonEmptyInstruction(nonEmptyInstruction);
        if (result == null) result = caseInstruction(nonEmptyInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RebotinolPackage.COMPLEX_INSTRUCTION:
      {
        ComplexInstruction complexInstruction = (ComplexInstruction)theEObject;
        T result = caseComplexInstruction(complexInstruction);
        if (result == null) result = caseNonEmptyInstruction(complexInstruction);
        if (result == null) result = caseInstruction(complexInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RebotinolPackage.SUMAK:
      {
        Sumak sumak = (Sumak)theEObject;
        T result = caseSumak(sumak);
        if (result == null) result = caseNonEmptyInstruction(sumak);
        if (result == null) result = caseInstruction(sumak);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RebotinolPackage.MULTK:
      {
        Multk multk = (Multk)theEObject;
        T result = caseMultk(multk);
        if (result == null) result = caseNonEmptyInstruction(multk);
        if (result == null) result = caseInstruction(multk);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RebotinolPackage.IGUAL:
      {
        Igual igual = (Igual)theEObject;
        T result = caseIgual(igual);
        if (result == null) result = caseComplexInstruction(igual);
        if (result == null) result = caseNonEmptyInstruction(igual);
        if (result == null) result = caseInstruction(igual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RebotinolPackage.IGUALK:
      {
        Igualk igualk = (Igualk)theEObject;
        T result = caseIgualk(igualk);
        if (result == null) result = caseComplexInstruction(igualk);
        if (result == null) result = caseNonEmptyInstruction(igualk);
        if (result == null) result = caseInstruction(igualk);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RebotinolPackage.DIFER:
      {
        Difer difer = (Difer)theEObject;
        T result = caseDifer(difer);
        if (result == null) result = caseComplexInstruction(difer);
        if (result == null) result = caseNonEmptyInstruction(difer);
        if (result == null) result = caseInstruction(difer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RebotinolPackage.DIFERK:
      {
        Diferk diferk = (Diferk)theEObject;
        T result = caseDiferk(diferk);
        if (result == null) result = caseComplexInstruction(diferk);
        if (result == null) result = caseNonEmptyInstruction(diferk);
        if (result == null) result = caseInstruction(diferk);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RebotinolPackage.MAYOR:
      {
        Mayor mayor = (Mayor)theEObject;
        T result = caseMayor(mayor);
        if (result == null) result = caseComplexInstruction(mayor);
        if (result == null) result = caseNonEmptyInstruction(mayor);
        if (result == null) result = caseInstruction(mayor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RebotinolPackage.MAYORK:
      {
        Mayork mayork = (Mayork)theEObject;
        T result = caseMayork(mayork);
        if (result == null) result = caseComplexInstruction(mayork);
        if (result == null) result = caseNonEmptyInstruction(mayork);
        if (result == null) result = caseInstruction(mayork);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RebotinolPackage.MENOR:
      {
        Menor menor = (Menor)theEObject;
        T result = caseMenor(menor);
        if (result == null) result = caseComplexInstruction(menor);
        if (result == null) result = caseNonEmptyInstruction(menor);
        if (result == null) result = caseInstruction(menor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RebotinolPackage.MENORK:
      {
        Menork menork = (Menork)theEObject;
        T result = caseMenork(menork);
        if (result == null) result = caseComplexInstruction(menork);
        if (result == null) result = caseNonEmptyInstruction(menork);
        if (result == null) result = caseInstruction(menork);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RebotinolPackage.REPETIRN:
      {
        Repetirn repetirn = (Repetirn)theEObject;
        T result = caseRepetirn(repetirn);
        if (result == null) result = caseComplexInstruction(repetirn);
        if (result == null) result = caseNonEmptyInstruction(repetirn);
        if (result == null) result = caseInstruction(repetirn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRebotinolProgram(RebotinolProgram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction(Instruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmptyInstruction(EmptyInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Empty Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Empty Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonEmptyInstruction(NonEmptyInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexInstruction(ComplexInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sumak</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sumak</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSumak(Sumak object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multk</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multk</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultk(Multk object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Igual</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Igual</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIgual(Igual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Igualk</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Igualk</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIgualk(Igualk object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Difer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Difer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDifer(Difer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Diferk</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Diferk</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiferk(Diferk object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mayor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mayor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMayor(Mayor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mayork</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mayork</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMayork(Mayork object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Menor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Menor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMenor(Menor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Menork</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Menork</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMenork(Menork object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repetirn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repetirn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepetirn(Repetirn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RebotinolSwitch
