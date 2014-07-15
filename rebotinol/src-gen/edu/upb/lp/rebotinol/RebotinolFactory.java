/**
 */
package edu.upb.lp.rebotinol;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.upb.lp.rebotinol.RebotinolPackage
 * @generated
 */
public interface RebotinolFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RebotinolFactory eINSTANCE = edu.upb.lp.rebotinol.impl.RebotinolFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  RebotinolProgram createRebotinolProgram();

  /**
   * Returns a new object of class '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction</em>'.
   * @generated
   */
  Instruction createInstruction();

  /**
   * Returns a new object of class '<em>Empty Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Empty Instruction</em>'.
   * @generated
   */
  EmptyInstruction createEmptyInstruction();

  /**
   * Returns a new object of class '<em>Non Empty Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Empty Instruction</em>'.
   * @generated
   */
  NonEmptyInstruction createNonEmptyInstruction();

  /**
   * Returns a new object of class '<em>Complex Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Instruction</em>'.
   * @generated
   */
  ComplexInstruction createComplexInstruction();

  /**
   * Returns a new object of class '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number</em>'.
   * @generated
   */
  Number createNumber();

  /**
   * Returns a new object of class '<em>Positive Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Positive Number</em>'.
   * @generated
   */
  PositiveNumber createPositiveNumber();

  /**
   * Returns a new object of class '<em>Integer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer</em>'.
   * @generated
   */
  Integer createInteger();

  /**
   * Returns a new object of class '<em>Negative Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negative Number</em>'.
   * @generated
   */
  NegativeNumber createNegativeNumber();

  /**
   * Returns a new object of class '<em>Sumak</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sumak</em>'.
   * @generated
   */
  Sumak createSumak();

  /**
   * Returns a new object of class '<em>Multk</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multk</em>'.
   * @generated
   */
  Multk createMultk();

  /**
   * Returns a new object of class '<em>Igual</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Igual</em>'.
   * @generated
   */
  Igual createIgual();

  /**
   * Returns a new object of class '<em>Igualk</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Igualk</em>'.
   * @generated
   */
  Igualk createIgualk();

  /**
   * Returns a new object of class '<em>Difer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Difer</em>'.
   * @generated
   */
  Difer createDifer();

  /**
   * Returns a new object of class '<em>Diferk</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Diferk</em>'.
   * @generated
   */
  Diferk createDiferk();

  /**
   * Returns a new object of class '<em>Mayor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mayor</em>'.
   * @generated
   */
  Mayor createMayor();

  /**
   * Returns a new object of class '<em>Mayork</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mayork</em>'.
   * @generated
   */
  Mayork createMayork();

  /**
   * Returns a new object of class '<em>Menor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Menor</em>'.
   * @generated
   */
  Menor createMenor();

  /**
   * Returns a new object of class '<em>Menork</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Menork</em>'.
   * @generated
   */
  Menork createMenork();

  /**
   * Returns a new object of class '<em>Repetirn</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repetirn</em>'.
   * @generated
   */
  Repetirn createRepetirn();

  /**
   * Returns a new object of class '<em>Fraction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fraction</em>'.
   * @generated
   */
  Fraction createFraction();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RebotinolPackage getRebotinolPackage();

} //RebotinolFactory
