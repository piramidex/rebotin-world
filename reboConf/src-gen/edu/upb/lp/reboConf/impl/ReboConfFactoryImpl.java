/**
 */
package edu.upb.lp.reboConf.impl;

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
import edu.upb.lp.reboConf.ReboConfFactory;
import edu.upb.lp.reboConf.ReboConfPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReboConfFactoryImpl extends EFactoryImpl implements ReboConfFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ReboConfFactory init()
  {
    try
    {
      ReboConfFactory theReboConfFactory = (ReboConfFactory)EPackage.Registry.INSTANCE.getEFactory(ReboConfPackage.eNS_URI);
      if (theReboConfFactory != null)
      {
        return theReboConfFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ReboConfFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReboConfFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ReboConfPackage.CONFIGURATION: return createConfiguration();
      case ReboConfPackage.MATRIX: return createMatrix();
      case ReboConfPackage.LINE: return createLine();
      case ReboConfPackage.ELEMENT: return createElement();
      case ReboConfPackage.EMPTY: return createEmpty();
      case ReboConfPackage.NUMBER: return createNumber();
      case ReboConfPackage.POSITIVE_NUMBER: return createPositiveNumber();
      case ReboConfPackage.INTEGER: return createInteger();
      case ReboConfPackage.NEGATIVE_NUMBER: return createNegativeNumber();
      case ReboConfPackage.NINTEGER: return createNInteger();
      case ReboConfPackage.FRACTION: return createFraction();
      case ReboConfPackage.NFRACTION: return createNFraction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configuration createConfiguration()
  {
    ConfigurationImpl configuration = new ConfigurationImpl();
    return configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matrix createMatrix()
  {
    MatrixImpl matrix = new MatrixImpl();
    return matrix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Line createLine()
  {
    LineImpl line = new LineImpl();
    return line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Empty createEmpty()
  {
    EmptyImpl empty = new EmptyImpl();
    return empty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public edu.upb.lp.reboConf.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PositiveNumber createPositiveNumber()
  {
    PositiveNumberImpl positiveNumber = new PositiveNumberImpl();
    return positiveNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public edu.upb.lp.reboConf.Integer createInteger()
  {
    IntegerImpl integer = new IntegerImpl();
    return integer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegativeNumber createNegativeNumber()
  {
    NegativeNumberImpl negativeNumber = new NegativeNumberImpl();
    return negativeNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NInteger createNInteger()
  {
    NIntegerImpl nInteger = new NIntegerImpl();
    return nInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fraction createFraction()
  {
    FractionImpl fraction = new FractionImpl();
    return fraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NFraction createNFraction()
  {
    NFractionImpl nFraction = new NFractionImpl();
    return nFraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReboConfPackage getReboConfPackage()
  {
    return (ReboConfPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ReboConfPackage getPackage()
  {
    return ReboConfPackage.eINSTANCE;
  }

} //ReboConfFactoryImpl
