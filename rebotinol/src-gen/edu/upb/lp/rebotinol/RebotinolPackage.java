/**
 */
package edu.upb.lp.rebotinol;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.upb.lp.rebotinol.RebotinolFactory
 * @model kind="package"
 * @generated
 */
public interface RebotinolPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rebotinol";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://lp.upb.org/Rebotinol";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rebotinol";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RebotinolPackage eINSTANCE = edu.upb.lp.rebotinol.impl.RebotinolPackageImpl.init();

  /**
   * The meta object id for the '{@link edu.upb.lp.rebotinol.impl.RebotinolProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.rebotinol.impl.RebotinolProgramImpl
   * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getRebotinolProgram()
   * @generated
   */
  int REBOTINOL_PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REBOTINOL_PROGRAM__INSTRUCTIONS = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REBOTINOL_PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.upb.lp.rebotinol.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.rebotinol.impl.InstructionImpl
   * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 1;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.upb.lp.rebotinol.impl.EmptyInstructionImpl <em>Empty Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.rebotinol.impl.EmptyInstructionImpl
   * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getEmptyInstruction()
   * @generated
   */
  int EMPTY_INSTRUCTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_INSTRUCTION__TYPE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Empty Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.upb.lp.rebotinol.impl.NonEmptyInstructionImpl <em>Non Empty Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.rebotinol.impl.NonEmptyInstructionImpl
   * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getNonEmptyInstruction()
   * @generated
   */
  int NON_EMPTY_INSTRUCTION = 3;

  /**
   * The number of structural features of the '<em>Non Empty Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_EMPTY_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.upb.lp.rebotinol.impl.ComplexInstructionImpl <em>Complex Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.rebotinol.impl.ComplexInstructionImpl
   * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getComplexInstruction()
   * @generated
   */
  int COMPLEX_INSTRUCTION = 4;

  /**
   * The feature id for the '<em><b>Sub Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS = NON_EMPTY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Complex Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_INSTRUCTION_FEATURE_COUNT = NON_EMPTY_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.upb.lp.rebotinol.impl.SumakImpl <em>Sumak</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.rebotinol.impl.SumakImpl
   * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getSumak()
   * @generated
   */
  int SUMAK = 5;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUMAK__VAL = NON_EMPTY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sumak</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUMAK_FEATURE_COUNT = NON_EMPTY_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.upb.lp.rebotinol.impl.MultkImpl <em>Multk</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.rebotinol.impl.MultkImpl
   * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getMultk()
   * @generated
   */
  int MULTK = 6;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTK__VAL = NON_EMPTY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Multk</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTK_FEATURE_COUNT = NON_EMPTY_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.upb.lp.rebotinol.impl.IgualImpl <em>Igual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.rebotinol.impl.IgualImpl
   * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getIgual()
   * @generated
   */
  int IGUAL = 7;

  /**
   * The feature id for the '<em><b>Sub Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IGUAL__SUB_INSTRUCTIONS = COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS;

  /**
   * The number of structural features of the '<em>Igual</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IGUAL_FEATURE_COUNT = COMPLEX_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.upb.lp.rebotinol.impl.IgualkImpl <em>Igualk</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.rebotinol.impl.IgualkImpl
   * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getIgualk()
   * @generated
   */
  int IGUALK = 8;

  /**
   * The feature id for the '<em><b>Sub Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IGUALK__SUB_INSTRUCTIONS = COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IGUALK__VAL = COMPLEX_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Igualk</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IGUALK_FEATURE_COUNT = COMPLEX_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.upb.lp.rebotinol.impl.DiferImpl <em>Difer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.rebotinol.impl.DiferImpl
   * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getDifer()
   * @generated
   */
  int DIFER = 9;

  /**
   * The feature id for the '<em><b>Sub Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFER__SUB_INSTRUCTIONS = COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS;

  /**
   * The number of structural features of the '<em>Difer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFER_FEATURE_COUNT = COMPLEX_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.upb.lp.rebotinol.impl.DiferkImpl <em>Diferk</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.rebotinol.impl.DiferkImpl
   * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getDiferk()
   * @generated
   */
  int DIFERK = 10;

  /**
   * The feature id for the '<em><b>Sub Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFERK__SUB_INSTRUCTIONS = COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFERK__VAL = COMPLEX_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Diferk</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFERK_FEATURE_COUNT = COMPLEX_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.upb.lp.rebotinol.impl.MayorImpl <em>Mayor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.rebotinol.impl.MayorImpl
   * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getMayor()
   * @generated
   */
  int MAYOR = 11;

  /**
   * The feature id for the '<em><b>Sub Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAYOR__SUB_INSTRUCTIONS = COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS;

  /**
   * The number of structural features of the '<em>Mayor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAYOR_FEATURE_COUNT = COMPLEX_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.upb.lp.rebotinol.impl.MayorkImpl <em>Mayork</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.rebotinol.impl.MayorkImpl
   * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getMayork()
   * @generated
   */
  int MAYORK = 12;

  /**
   * The feature id for the '<em><b>Sub Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAYORK__SUB_INSTRUCTIONS = COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAYORK__VAL = COMPLEX_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mayork</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAYORK_FEATURE_COUNT = COMPLEX_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.upb.lp.rebotinol.impl.MenorImpl <em>Menor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.rebotinol.impl.MenorImpl
   * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getMenor()
   * @generated
   */
  int MENOR = 13;

  /**
   * The feature id for the '<em><b>Sub Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENOR__SUB_INSTRUCTIONS = COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS;

  /**
   * The number of structural features of the '<em>Menor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENOR_FEATURE_COUNT = COMPLEX_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.upb.lp.rebotinol.impl.MenorkImpl <em>Menork</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.rebotinol.impl.MenorkImpl
   * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getMenork()
   * @generated
   */
  int MENORK = 14;

  /**
   * The feature id for the '<em><b>Sub Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENORK__SUB_INSTRUCTIONS = COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENORK__VAL = COMPLEX_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Menork</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENORK_FEATURE_COUNT = COMPLEX_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.upb.lp.rebotinol.impl.RepetirnImpl <em>Repetirn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.rebotinol.impl.RepetirnImpl
   * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getRepetirn()
   * @generated
   */
  int REPETIRN = 15;

  /**
   * The feature id for the '<em><b>Sub Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPETIRN__SUB_INSTRUCTIONS = COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPETIRN__VAL = COMPLEX_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Repetirn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPETIRN_FEATURE_COUNT = COMPLEX_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.upb.lp.rebotinol.EmptyInstructionType <em>Empty Instruction Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.rebotinol.EmptyInstructionType
   * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getEmptyInstructionType()
   * @generated
   */
  int EMPTY_INSTRUCTION_TYPE = 16;


  /**
   * Returns the meta object for class '{@link edu.upb.lp.rebotinol.RebotinolProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see edu.upb.lp.rebotinol.RebotinolProgram
   * @generated
   */
  EClass getRebotinolProgram();

  /**
   * Returns the meta object for the containment reference list '{@link edu.upb.lp.rebotinol.RebotinolProgram#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see edu.upb.lp.rebotinol.RebotinolProgram#getInstructions()
   * @see #getRebotinolProgram()
   * @generated
   */
  EReference getRebotinolProgram_Instructions();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.rebotinol.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see edu.upb.lp.rebotinol.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.rebotinol.EmptyInstruction <em>Empty Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Instruction</em>'.
   * @see edu.upb.lp.rebotinol.EmptyInstruction
   * @generated
   */
  EClass getEmptyInstruction();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.lp.rebotinol.EmptyInstruction#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see edu.upb.lp.rebotinol.EmptyInstruction#getType()
   * @see #getEmptyInstruction()
   * @generated
   */
  EAttribute getEmptyInstruction_Type();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.rebotinol.NonEmptyInstruction <em>Non Empty Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Empty Instruction</em>'.
   * @see edu.upb.lp.rebotinol.NonEmptyInstruction
   * @generated
   */
  EClass getNonEmptyInstruction();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.rebotinol.ComplexInstruction <em>Complex Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Instruction</em>'.
   * @see edu.upb.lp.rebotinol.ComplexInstruction
   * @generated
   */
  EClass getComplexInstruction();

  /**
   * Returns the meta object for the containment reference list '{@link edu.upb.lp.rebotinol.ComplexInstruction#getSubInstructions <em>Sub Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Instructions</em>'.
   * @see edu.upb.lp.rebotinol.ComplexInstruction#getSubInstructions()
   * @see #getComplexInstruction()
   * @generated
   */
  EReference getComplexInstruction_SubInstructions();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.rebotinol.Sumak <em>Sumak</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sumak</em>'.
   * @see edu.upb.lp.rebotinol.Sumak
   * @generated
   */
  EClass getSumak();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.lp.rebotinol.Sumak#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see edu.upb.lp.rebotinol.Sumak#getVal()
   * @see #getSumak()
   * @generated
   */
  EAttribute getSumak_Val();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.rebotinol.Multk <em>Multk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multk</em>'.
   * @see edu.upb.lp.rebotinol.Multk
   * @generated
   */
  EClass getMultk();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.lp.rebotinol.Multk#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see edu.upb.lp.rebotinol.Multk#getVal()
   * @see #getMultk()
   * @generated
   */
  EAttribute getMultk_Val();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.rebotinol.Igual <em>Igual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Igual</em>'.
   * @see edu.upb.lp.rebotinol.Igual
   * @generated
   */
  EClass getIgual();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.rebotinol.Igualk <em>Igualk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Igualk</em>'.
   * @see edu.upb.lp.rebotinol.Igualk
   * @generated
   */
  EClass getIgualk();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.lp.rebotinol.Igualk#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see edu.upb.lp.rebotinol.Igualk#getVal()
   * @see #getIgualk()
   * @generated
   */
  EAttribute getIgualk_Val();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.rebotinol.Difer <em>Difer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Difer</em>'.
   * @see edu.upb.lp.rebotinol.Difer
   * @generated
   */
  EClass getDifer();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.rebotinol.Diferk <em>Diferk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diferk</em>'.
   * @see edu.upb.lp.rebotinol.Diferk
   * @generated
   */
  EClass getDiferk();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.lp.rebotinol.Diferk#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see edu.upb.lp.rebotinol.Diferk#getVal()
   * @see #getDiferk()
   * @generated
   */
  EAttribute getDiferk_Val();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.rebotinol.Mayor <em>Mayor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mayor</em>'.
   * @see edu.upb.lp.rebotinol.Mayor
   * @generated
   */
  EClass getMayor();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.rebotinol.Mayork <em>Mayork</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mayork</em>'.
   * @see edu.upb.lp.rebotinol.Mayork
   * @generated
   */
  EClass getMayork();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.lp.rebotinol.Mayork#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see edu.upb.lp.rebotinol.Mayork#getVal()
   * @see #getMayork()
   * @generated
   */
  EAttribute getMayork_Val();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.rebotinol.Menor <em>Menor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Menor</em>'.
   * @see edu.upb.lp.rebotinol.Menor
   * @generated
   */
  EClass getMenor();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.rebotinol.Menork <em>Menork</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Menork</em>'.
   * @see edu.upb.lp.rebotinol.Menork
   * @generated
   */
  EClass getMenork();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.lp.rebotinol.Menork#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see edu.upb.lp.rebotinol.Menork#getVal()
   * @see #getMenork()
   * @generated
   */
  EAttribute getMenork_Val();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.rebotinol.Repetirn <em>Repetirn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repetirn</em>'.
   * @see edu.upb.lp.rebotinol.Repetirn
   * @generated
   */
  EClass getRepetirn();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.lp.rebotinol.Repetirn#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see edu.upb.lp.rebotinol.Repetirn#getVal()
   * @see #getRepetirn()
   * @generated
   */
  EAttribute getRepetirn_Val();

  /**
   * Returns the meta object for enum '{@link edu.upb.lp.rebotinol.EmptyInstructionType <em>Empty Instruction Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Empty Instruction Type</em>'.
   * @see edu.upb.lp.rebotinol.EmptyInstructionType
   * @generated
   */
  EEnum getEmptyInstructionType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RebotinolFactory getRebotinolFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link edu.upb.lp.rebotinol.impl.RebotinolProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.rebotinol.impl.RebotinolProgramImpl
     * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getRebotinolProgram()
     * @generated
     */
    EClass REBOTINOL_PROGRAM = eINSTANCE.getRebotinolProgram();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REBOTINOL_PROGRAM__INSTRUCTIONS = eINSTANCE.getRebotinolProgram_Instructions();

    /**
     * The meta object literal for the '{@link edu.upb.lp.rebotinol.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.rebotinol.impl.InstructionImpl
     * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link edu.upb.lp.rebotinol.impl.EmptyInstructionImpl <em>Empty Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.rebotinol.impl.EmptyInstructionImpl
     * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getEmptyInstruction()
     * @generated
     */
    EClass EMPTY_INSTRUCTION = eINSTANCE.getEmptyInstruction();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPTY_INSTRUCTION__TYPE = eINSTANCE.getEmptyInstruction_Type();

    /**
     * The meta object literal for the '{@link edu.upb.lp.rebotinol.impl.NonEmptyInstructionImpl <em>Non Empty Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.rebotinol.impl.NonEmptyInstructionImpl
     * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getNonEmptyInstruction()
     * @generated
     */
    EClass NON_EMPTY_INSTRUCTION = eINSTANCE.getNonEmptyInstruction();

    /**
     * The meta object literal for the '{@link edu.upb.lp.rebotinol.impl.ComplexInstructionImpl <em>Complex Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.rebotinol.impl.ComplexInstructionImpl
     * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getComplexInstruction()
     * @generated
     */
    EClass COMPLEX_INSTRUCTION = eINSTANCE.getComplexInstruction();

    /**
     * The meta object literal for the '<em><b>Sub Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS = eINSTANCE.getComplexInstruction_SubInstructions();

    /**
     * The meta object literal for the '{@link edu.upb.lp.rebotinol.impl.SumakImpl <em>Sumak</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.rebotinol.impl.SumakImpl
     * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getSumak()
     * @generated
     */
    EClass SUMAK = eINSTANCE.getSumak();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUMAK__VAL = eINSTANCE.getSumak_Val();

    /**
     * The meta object literal for the '{@link edu.upb.lp.rebotinol.impl.MultkImpl <em>Multk</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.rebotinol.impl.MultkImpl
     * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getMultk()
     * @generated
     */
    EClass MULTK = eINSTANCE.getMultk();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTK__VAL = eINSTANCE.getMultk_Val();

    /**
     * The meta object literal for the '{@link edu.upb.lp.rebotinol.impl.IgualImpl <em>Igual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.rebotinol.impl.IgualImpl
     * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getIgual()
     * @generated
     */
    EClass IGUAL = eINSTANCE.getIgual();

    /**
     * The meta object literal for the '{@link edu.upb.lp.rebotinol.impl.IgualkImpl <em>Igualk</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.rebotinol.impl.IgualkImpl
     * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getIgualk()
     * @generated
     */
    EClass IGUALK = eINSTANCE.getIgualk();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IGUALK__VAL = eINSTANCE.getIgualk_Val();

    /**
     * The meta object literal for the '{@link edu.upb.lp.rebotinol.impl.DiferImpl <em>Difer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.rebotinol.impl.DiferImpl
     * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getDifer()
     * @generated
     */
    EClass DIFER = eINSTANCE.getDifer();

    /**
     * The meta object literal for the '{@link edu.upb.lp.rebotinol.impl.DiferkImpl <em>Diferk</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.rebotinol.impl.DiferkImpl
     * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getDiferk()
     * @generated
     */
    EClass DIFERK = eINSTANCE.getDiferk();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIFERK__VAL = eINSTANCE.getDiferk_Val();

    /**
     * The meta object literal for the '{@link edu.upb.lp.rebotinol.impl.MayorImpl <em>Mayor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.rebotinol.impl.MayorImpl
     * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getMayor()
     * @generated
     */
    EClass MAYOR = eINSTANCE.getMayor();

    /**
     * The meta object literal for the '{@link edu.upb.lp.rebotinol.impl.MayorkImpl <em>Mayork</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.rebotinol.impl.MayorkImpl
     * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getMayork()
     * @generated
     */
    EClass MAYORK = eINSTANCE.getMayork();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAYORK__VAL = eINSTANCE.getMayork_Val();

    /**
     * The meta object literal for the '{@link edu.upb.lp.rebotinol.impl.MenorImpl <em>Menor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.rebotinol.impl.MenorImpl
     * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getMenor()
     * @generated
     */
    EClass MENOR = eINSTANCE.getMenor();

    /**
     * The meta object literal for the '{@link edu.upb.lp.rebotinol.impl.MenorkImpl <em>Menork</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.rebotinol.impl.MenorkImpl
     * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getMenork()
     * @generated
     */
    EClass MENORK = eINSTANCE.getMenork();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENORK__VAL = eINSTANCE.getMenork_Val();

    /**
     * The meta object literal for the '{@link edu.upb.lp.rebotinol.impl.RepetirnImpl <em>Repetirn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.rebotinol.impl.RepetirnImpl
     * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getRepetirn()
     * @generated
     */
    EClass REPETIRN = eINSTANCE.getRepetirn();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPETIRN__VAL = eINSTANCE.getRepetirn_Val();

    /**
     * The meta object literal for the '{@link edu.upb.lp.rebotinol.EmptyInstructionType <em>Empty Instruction Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.rebotinol.EmptyInstructionType
     * @see edu.upb.lp.rebotinol.impl.RebotinolPackageImpl#getEmptyInstructionType()
     * @generated
     */
    EEnum EMPTY_INSTRUCTION_TYPE = eINSTANCE.getEmptyInstructionType();

  }

} //RebotinolPackage
