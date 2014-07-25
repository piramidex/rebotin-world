/**
 */
package edu.upb.lp.reboConf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see edu.upb.lp.reboConf.ReboConfFactory
 * @model kind="package"
 * @generated
 */
public interface ReboConfPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "reboConf";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.upb.edu/lp/ReboConf";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "reboConf";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ReboConfPackage eINSTANCE = edu.upb.lp.reboConf.impl.ReboConfPackageImpl.init();

  /**
   * The meta object id for the '{@link edu.upb.lp.reboConf.impl.ConfigurationImpl <em>Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.reboConf.impl.ConfigurationImpl
   * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getConfiguration()
   * @generated
   */
  int CONFIGURATION = 0;

  /**
   * The feature id for the '<em><b>Initial</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__INITIAL = 0;

  /**
   * The feature id for the '<em><b>Expected</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__EXPECTED = 1;

  /**
   * The feature id for the '<em><b>Mail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__MAIL = 2;

  /**
   * The number of structural features of the '<em>Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link edu.upb.lp.reboConf.impl.MatrixImpl <em>Matrix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.reboConf.impl.MatrixImpl
   * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getMatrix()
   * @generated
   */
  int MATRIX = 1;

  /**
   * The feature id for the '<em><b>Lines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX__LINES = 0;

  /**
   * The number of structural features of the '<em>Matrix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.upb.lp.reboConf.impl.LineImpl <em>Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.reboConf.impl.LineImpl
   * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getLine()
   * @generated
   */
  int LINE = 2;

  /**
   * The feature id for the '<em><b>Els</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE__ELS = 0;

  /**
   * The number of structural features of the '<em>Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.upb.lp.reboConf.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.reboConf.impl.ElementImpl
   * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 3;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.upb.lp.reboConf.impl.EmptyImpl <em>Empty</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.reboConf.impl.EmptyImpl
   * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getEmpty()
   * @generated
   */
  int EMPTY = 4;

  /**
   * The number of structural features of the '<em>Empty</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.upb.lp.reboConf.impl.NumberImpl <em>Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.reboConf.impl.NumberImpl
   * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getNumber()
   * @generated
   */
  int NUMBER = 5;

  /**
   * The number of structural features of the '<em>Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.upb.lp.reboConf.impl.PositiveNumberImpl <em>Positive Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.reboConf.impl.PositiveNumberImpl
   * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getPositiveNumber()
   * @generated
   */
  int POSITIVE_NUMBER = 6;

  /**
   * The number of structural features of the '<em>Positive Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_NUMBER_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.upb.lp.reboConf.impl.IntegerImpl <em>Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.reboConf.impl.IntegerImpl
   * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getInteger()
   * @generated
   */
  int INTEGER = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER__VALUE = POSITIVE_NUMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_FEATURE_COUNT = POSITIVE_NUMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.upb.lp.reboConf.impl.NegativeNumberImpl <em>Negative Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.reboConf.impl.NegativeNumberImpl
   * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getNegativeNumber()
   * @generated
   */
  int NEGATIVE_NUMBER = 8;

  /**
   * The number of structural features of the '<em>Negative Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_NUMBER_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.upb.lp.reboConf.impl.NIntegerImpl <em>NInteger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.reboConf.impl.NIntegerImpl
   * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getNInteger()
   * @generated
   */
  int NINTEGER = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NINTEGER__VALUE = NEGATIVE_NUMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>NInteger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NINTEGER_FEATURE_COUNT = NEGATIVE_NUMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.upb.lp.reboConf.impl.FractionImpl <em>Fraction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.reboConf.impl.FractionImpl
   * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getFraction()
   * @generated
   */
  int FRACTION = 10;

  /**
   * The feature id for the '<em><b>Numerator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRACTION__NUMERATOR = POSITIVE_NUMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Denominator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRACTION__DENOMINATOR = POSITIVE_NUMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fraction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRACTION_FEATURE_COUNT = POSITIVE_NUMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.upb.lp.reboConf.impl.NFractionImpl <em>NFraction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.upb.lp.reboConf.impl.NFractionImpl
   * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getNFraction()
   * @generated
   */
  int NFRACTION = 11;

  /**
   * The feature id for the '<em><b>Numerator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFRACTION__NUMERATOR = NEGATIVE_NUMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Denominator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFRACTION__DENOMINATOR = NEGATIVE_NUMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>NFraction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFRACTION_FEATURE_COUNT = NEGATIVE_NUMBER_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link edu.upb.lp.reboConf.Configuration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration</em>'.
   * @see edu.upb.lp.reboConf.Configuration
   * @generated
   */
  EClass getConfiguration();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.lp.reboConf.Configuration#getInitial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial</em>'.
   * @see edu.upb.lp.reboConf.Configuration#getInitial()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_Initial();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.lp.reboConf.Configuration#getExpected <em>Expected</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expected</em>'.
   * @see edu.upb.lp.reboConf.Configuration#getExpected()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_Expected();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.lp.reboConf.Configuration#getMail <em>Mail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mail</em>'.
   * @see edu.upb.lp.reboConf.Configuration#getMail()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_Mail();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.reboConf.Matrix <em>Matrix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Matrix</em>'.
   * @see edu.upb.lp.reboConf.Matrix
   * @generated
   */
  EClass getMatrix();

  /**
   * Returns the meta object for the containment reference list '{@link edu.upb.lp.reboConf.Matrix#getLines <em>Lines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lines</em>'.
   * @see edu.upb.lp.reboConf.Matrix#getLines()
   * @see #getMatrix()
   * @generated
   */
  EReference getMatrix_Lines();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.reboConf.Line <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line</em>'.
   * @see edu.upb.lp.reboConf.Line
   * @generated
   */
  EClass getLine();

  /**
   * Returns the meta object for the containment reference list '{@link edu.upb.lp.reboConf.Line#getEls <em>Els</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Els</em>'.
   * @see edu.upb.lp.reboConf.Line#getEls()
   * @see #getLine()
   * @generated
   */
  EReference getLine_Els();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.reboConf.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see edu.upb.lp.reboConf.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.reboConf.Empty <em>Empty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty</em>'.
   * @see edu.upb.lp.reboConf.Empty
   * @generated
   */
  EClass getEmpty();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.reboConf.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number</em>'.
   * @see edu.upb.lp.reboConf.Number
   * @generated
   */
  EClass getNumber();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.reboConf.PositiveNumber <em>Positive Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Positive Number</em>'.
   * @see edu.upb.lp.reboConf.PositiveNumber
   * @generated
   */
  EClass getPositiveNumber();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.reboConf.Integer <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer</em>'.
   * @see edu.upb.lp.reboConf.Integer
   * @generated
   */
  EClass getInteger();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.lp.reboConf.Integer#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see edu.upb.lp.reboConf.Integer#getValue()
   * @see #getInteger()
   * @generated
   */
  EAttribute getInteger_Value();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.reboConf.NegativeNumber <em>Negative Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negative Number</em>'.
   * @see edu.upb.lp.reboConf.NegativeNumber
   * @generated
   */
  EClass getNegativeNumber();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.reboConf.NInteger <em>NInteger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NInteger</em>'.
   * @see edu.upb.lp.reboConf.NInteger
   * @generated
   */
  EClass getNInteger();

  /**
   * Returns the meta object for the attribute '{@link edu.upb.lp.reboConf.NInteger#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see edu.upb.lp.reboConf.NInteger#getValue()
   * @see #getNInteger()
   * @generated
   */
  EAttribute getNInteger_Value();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.reboConf.Fraction <em>Fraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fraction</em>'.
   * @see edu.upb.lp.reboConf.Fraction
   * @generated
   */
  EClass getFraction();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.lp.reboConf.Fraction#getNumerator <em>Numerator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Numerator</em>'.
   * @see edu.upb.lp.reboConf.Fraction#getNumerator()
   * @see #getFraction()
   * @generated
   */
  EReference getFraction_Numerator();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.lp.reboConf.Fraction#getDenominator <em>Denominator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Denominator</em>'.
   * @see edu.upb.lp.reboConf.Fraction#getDenominator()
   * @see #getFraction()
   * @generated
   */
  EReference getFraction_Denominator();

  /**
   * Returns the meta object for class '{@link edu.upb.lp.reboConf.NFraction <em>NFraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NFraction</em>'.
   * @see edu.upb.lp.reboConf.NFraction
   * @generated
   */
  EClass getNFraction();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.lp.reboConf.NFraction#getNumerator <em>Numerator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Numerator</em>'.
   * @see edu.upb.lp.reboConf.NFraction#getNumerator()
   * @see #getNFraction()
   * @generated
   */
  EReference getNFraction_Numerator();

  /**
   * Returns the meta object for the containment reference '{@link edu.upb.lp.reboConf.NFraction#getDenominator <em>Denominator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Denominator</em>'.
   * @see edu.upb.lp.reboConf.NFraction#getDenominator()
   * @see #getNFraction()
   * @generated
   */
  EReference getNFraction_Denominator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ReboConfFactory getReboConfFactory();

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
     * The meta object literal for the '{@link edu.upb.lp.reboConf.impl.ConfigurationImpl <em>Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.reboConf.impl.ConfigurationImpl
     * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getConfiguration()
     * @generated
     */
    EClass CONFIGURATION = eINSTANCE.getConfiguration();

    /**
     * The meta object literal for the '<em><b>Initial</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION__INITIAL = eINSTANCE.getConfiguration_Initial();

    /**
     * The meta object literal for the '<em><b>Expected</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION__EXPECTED = eINSTANCE.getConfiguration_Expected();

    /**
     * The meta object literal for the '<em><b>Mail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION__MAIL = eINSTANCE.getConfiguration_Mail();

    /**
     * The meta object literal for the '{@link edu.upb.lp.reboConf.impl.MatrixImpl <em>Matrix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.reboConf.impl.MatrixImpl
     * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getMatrix()
     * @generated
     */
    EClass MATRIX = eINSTANCE.getMatrix();

    /**
     * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATRIX__LINES = eINSTANCE.getMatrix_Lines();

    /**
     * The meta object literal for the '{@link edu.upb.lp.reboConf.impl.LineImpl <em>Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.reboConf.impl.LineImpl
     * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getLine()
     * @generated
     */
    EClass LINE = eINSTANCE.getLine();

    /**
     * The meta object literal for the '<em><b>Els</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINE__ELS = eINSTANCE.getLine_Els();

    /**
     * The meta object literal for the '{@link edu.upb.lp.reboConf.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.reboConf.impl.ElementImpl
     * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '{@link edu.upb.lp.reboConf.impl.EmptyImpl <em>Empty</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.reboConf.impl.EmptyImpl
     * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getEmpty()
     * @generated
     */
    EClass EMPTY = eINSTANCE.getEmpty();

    /**
     * The meta object literal for the '{@link edu.upb.lp.reboConf.impl.NumberImpl <em>Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.reboConf.impl.NumberImpl
     * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getNumber()
     * @generated
     */
    EClass NUMBER = eINSTANCE.getNumber();

    /**
     * The meta object literal for the '{@link edu.upb.lp.reboConf.impl.PositiveNumberImpl <em>Positive Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.reboConf.impl.PositiveNumberImpl
     * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getPositiveNumber()
     * @generated
     */
    EClass POSITIVE_NUMBER = eINSTANCE.getPositiveNumber();

    /**
     * The meta object literal for the '{@link edu.upb.lp.reboConf.impl.IntegerImpl <em>Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.reboConf.impl.IntegerImpl
     * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getInteger()
     * @generated
     */
    EClass INTEGER = eINSTANCE.getInteger();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER__VALUE = eINSTANCE.getInteger_Value();

    /**
     * The meta object literal for the '{@link edu.upb.lp.reboConf.impl.NegativeNumberImpl <em>Negative Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.reboConf.impl.NegativeNumberImpl
     * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getNegativeNumber()
     * @generated
     */
    EClass NEGATIVE_NUMBER = eINSTANCE.getNegativeNumber();

    /**
     * The meta object literal for the '{@link edu.upb.lp.reboConf.impl.NIntegerImpl <em>NInteger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.reboConf.impl.NIntegerImpl
     * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getNInteger()
     * @generated
     */
    EClass NINTEGER = eINSTANCE.getNInteger();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NINTEGER__VALUE = eINSTANCE.getNInteger_Value();

    /**
     * The meta object literal for the '{@link edu.upb.lp.reboConf.impl.FractionImpl <em>Fraction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.reboConf.impl.FractionImpl
     * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getFraction()
     * @generated
     */
    EClass FRACTION = eINSTANCE.getFraction();

    /**
     * The meta object literal for the '<em><b>Numerator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRACTION__NUMERATOR = eINSTANCE.getFraction_Numerator();

    /**
     * The meta object literal for the '<em><b>Denominator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRACTION__DENOMINATOR = eINSTANCE.getFraction_Denominator();

    /**
     * The meta object literal for the '{@link edu.upb.lp.reboConf.impl.NFractionImpl <em>NFraction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.upb.lp.reboConf.impl.NFractionImpl
     * @see edu.upb.lp.reboConf.impl.ReboConfPackageImpl#getNFraction()
     * @generated
     */
    EClass NFRACTION = eINSTANCE.getNFraction();

    /**
     * The meta object literal for the '<em><b>Numerator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NFRACTION__NUMERATOR = eINSTANCE.getNFraction_Numerator();

    /**
     * The meta object literal for the '<em><b>Denominator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NFRACTION__DENOMINATOR = eINSTANCE.getNFraction_Denominator();

  }

} //ReboConfPackage
