/**
 */
package edu.upb.lp.reboConf.util;

import edu.upb.lp.reboConf.Configuration;
import edu.upb.lp.reboConf.Element;
import edu.upb.lp.reboConf.Empty;
import edu.upb.lp.reboConf.Fraction;
import edu.upb.lp.reboConf.Line;
import edu.upb.lp.reboConf.Matrix;
import edu.upb.lp.reboConf.NFraction;
import edu.upb.lp.reboConf.NInteger;
import edu.upb.lp.reboConf.NegativeNumber;
import edu.upb.lp.reboConf.PositiveNumber;
import edu.upb.lp.reboConf.ReboConfPackage;

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
 * @see edu.upb.lp.reboConf.ReboConfPackage
 * @generated
 */
public class ReboConfSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ReboConfPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReboConfSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ReboConfPackage.eINSTANCE;
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
      case ReboConfPackage.CONFIGURATION:
      {
        Configuration configuration = (Configuration)theEObject;
        T result = caseConfiguration(configuration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReboConfPackage.MATRIX:
      {
        Matrix matrix = (Matrix)theEObject;
        T result = caseMatrix(matrix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReboConfPackage.LINE:
      {
        Line line = (Line)theEObject;
        T result = caseLine(line);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReboConfPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReboConfPackage.EMPTY:
      {
        Empty empty = (Empty)theEObject;
        T result = caseEmpty(empty);
        if (result == null) result = caseElement(empty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReboConfPackage.NUMBER:
      {
        edu.upb.lp.reboConf.Number number = (edu.upb.lp.reboConf.Number)theEObject;
        T result = caseNumber(number);
        if (result == null) result = caseElement(number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReboConfPackage.POSITIVE_NUMBER:
      {
        PositiveNumber positiveNumber = (PositiveNumber)theEObject;
        T result = casePositiveNumber(positiveNumber);
        if (result == null) result = caseNumber(positiveNumber);
        if (result == null) result = caseElement(positiveNumber);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReboConfPackage.INTEGER:
      {
        edu.upb.lp.reboConf.Integer integer = (edu.upb.lp.reboConf.Integer)theEObject;
        T result = caseInteger(integer);
        if (result == null) result = casePositiveNumber(integer);
        if (result == null) result = caseNumber(integer);
        if (result == null) result = caseElement(integer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReboConfPackage.NEGATIVE_NUMBER:
      {
        NegativeNumber negativeNumber = (NegativeNumber)theEObject;
        T result = caseNegativeNumber(negativeNumber);
        if (result == null) result = caseNumber(negativeNumber);
        if (result == null) result = caseElement(negativeNumber);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReboConfPackage.NINTEGER:
      {
        NInteger nInteger = (NInteger)theEObject;
        T result = caseNInteger(nInteger);
        if (result == null) result = caseNegativeNumber(nInteger);
        if (result == null) result = caseNumber(nInteger);
        if (result == null) result = caseElement(nInteger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReboConfPackage.FRACTION:
      {
        Fraction fraction = (Fraction)theEObject;
        T result = caseFraction(fraction);
        if (result == null) result = casePositiveNumber(fraction);
        if (result == null) result = caseNumber(fraction);
        if (result == null) result = caseElement(fraction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ReboConfPackage.NFRACTION:
      {
        NFraction nFraction = (NFraction)theEObject;
        T result = caseNFraction(nFraction);
        if (result == null) result = caseNegativeNumber(nFraction);
        if (result == null) result = caseNumber(nFraction);
        if (result == null) result = caseElement(nFraction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfiguration(Configuration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Matrix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Matrix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatrix(Matrix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLine(Line object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmpty(Empty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumber(edu.upb.lp.reboConf.Number object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Positive Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Positive Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePositiveNumber(PositiveNumber object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteger(edu.upb.lp.reboConf.Integer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Negative Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Negative Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegativeNumber(NegativeNumber object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NInteger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NInteger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNInteger(NInteger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fraction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fraction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFraction(Fraction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NFraction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NFraction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNFraction(NFraction object)
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

} //ReboConfSwitch
