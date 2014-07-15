/**
 */
package edu.upb.lp.rebotinol.impl;

import edu.upb.lp.rebotinol.ComplexInstruction;
import edu.upb.lp.rebotinol.Difer;
import edu.upb.lp.rebotinol.Diferk;
import edu.upb.lp.rebotinol.EmptyInstruction;
import edu.upb.lp.rebotinol.EmptyInstructionType;
import edu.upb.lp.rebotinol.Fraction;
import edu.upb.lp.rebotinol.Igual;
import edu.upb.lp.rebotinol.Igualk;
import edu.upb.lp.rebotinol.Instruction;
import edu.upb.lp.rebotinol.Mayor;
import edu.upb.lp.rebotinol.Mayork;
import edu.upb.lp.rebotinol.Menor;
import edu.upb.lp.rebotinol.Menork;
import edu.upb.lp.rebotinol.Multk;
import edu.upb.lp.rebotinol.NegativeNumber;
import edu.upb.lp.rebotinol.NonEmptyInstruction;
import edu.upb.lp.rebotinol.PositiveNumber;
import edu.upb.lp.rebotinol.RebotinolFactory;
import edu.upb.lp.rebotinol.RebotinolPackage;
import edu.upb.lp.rebotinol.RebotinolProgram;
import edu.upb.lp.rebotinol.Repetirn;
import edu.upb.lp.rebotinol.Sumak;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class RebotinolFactoryImpl extends EFactoryImpl implements RebotinolFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RebotinolFactory init()
  {
    try
    {
      RebotinolFactory theRebotinolFactory = (RebotinolFactory)EPackage.Registry.INSTANCE.getEFactory(RebotinolPackage.eNS_URI);
      if (theRebotinolFactory != null)
      {
        return theRebotinolFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RebotinolFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RebotinolFactoryImpl()
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
      case RebotinolPackage.REBOTINOL_PROGRAM: return createRebotinolProgram();
      case RebotinolPackage.INSTRUCTION: return createInstruction();
      case RebotinolPackage.EMPTY_INSTRUCTION: return createEmptyInstruction();
      case RebotinolPackage.NON_EMPTY_INSTRUCTION: return createNonEmptyInstruction();
      case RebotinolPackage.COMPLEX_INSTRUCTION: return createComplexInstruction();
      case RebotinolPackage.NUMBER: return createNumber();
      case RebotinolPackage.POSITIVE_NUMBER: return createPositiveNumber();
      case RebotinolPackage.INTEGER: return createInteger();
      case RebotinolPackage.NEGATIVE_NUMBER: return createNegativeNumber();
      case RebotinolPackage.SUMAK: return createSumak();
      case RebotinolPackage.MULTK: return createMultk();
      case RebotinolPackage.IGUAL: return createIgual();
      case RebotinolPackage.IGUALK: return createIgualk();
      case RebotinolPackage.DIFER: return createDifer();
      case RebotinolPackage.DIFERK: return createDiferk();
      case RebotinolPackage.MAYOR: return createMayor();
      case RebotinolPackage.MAYORK: return createMayork();
      case RebotinolPackage.MENOR: return createMenor();
      case RebotinolPackage.MENORK: return createMenork();
      case RebotinolPackage.REPETIRN: return createRepetirn();
      case RebotinolPackage.FRACTION: return createFraction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RebotinolPackage.EMPTY_INSTRUCTION_TYPE:
        return createEmptyInstructionTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RebotinolPackage.EMPTY_INSTRUCTION_TYPE:
        return convertEmptyInstructionTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RebotinolProgram createRebotinolProgram()
  {
    RebotinolProgramImpl rebotinolProgram = new RebotinolProgramImpl();
    return rebotinolProgram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptyInstruction createEmptyInstruction()
  {
    EmptyInstructionImpl emptyInstruction = new EmptyInstructionImpl();
    return emptyInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonEmptyInstruction createNonEmptyInstruction()
  {
    NonEmptyInstructionImpl nonEmptyInstruction = new NonEmptyInstructionImpl();
    return nonEmptyInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexInstruction createComplexInstruction()
  {
    ComplexInstructionImpl complexInstruction = new ComplexInstructionImpl();
    return complexInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public edu.upb.lp.rebotinol.Number createNumber()
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
  public edu.upb.lp.rebotinol.Integer createInteger()
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
  public Sumak createSumak()
  {
    SumakImpl sumak = new SumakImpl();
    return sumak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multk createMultk()
  {
    MultkImpl multk = new MultkImpl();
    return multk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Igual createIgual()
  {
    IgualImpl igual = new IgualImpl();
    return igual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Igualk createIgualk()
  {
    IgualkImpl igualk = new IgualkImpl();
    return igualk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Difer createDifer()
  {
    DiferImpl difer = new DiferImpl();
    return difer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Diferk createDiferk()
  {
    DiferkImpl diferk = new DiferkImpl();
    return diferk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mayor createMayor()
  {
    MayorImpl mayor = new MayorImpl();
    return mayor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mayork createMayork()
  {
    MayorkImpl mayork = new MayorkImpl();
    return mayork;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Menor createMenor()
  {
    MenorImpl menor = new MenorImpl();
    return menor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Menork createMenork()
  {
    MenorkImpl menork = new MenorkImpl();
    return menork;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Repetirn createRepetirn()
  {
    RepetirnImpl repetirn = new RepetirnImpl();
    return repetirn;
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
  public EmptyInstructionType createEmptyInstructionTypeFromString(EDataType eDataType, String initialValue)
  {
    EmptyInstructionType result = EmptyInstructionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEmptyInstructionTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RebotinolPackage getRebotinolPackage()
  {
    return (RebotinolPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RebotinolPackage getPackage()
  {
    return RebotinolPackage.eINSTANCE;
  }

} //RebotinolFactoryImpl
