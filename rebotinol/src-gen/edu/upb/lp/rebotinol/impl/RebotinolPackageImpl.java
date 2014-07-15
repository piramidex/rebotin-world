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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RebotinolPackageImpl extends EPackageImpl implements RebotinolPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rebotinolProgramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emptyInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nonEmptyInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass positiveNumberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negativeNumberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumakEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass igualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass igualkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass diferEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass diferkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mayorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mayorkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menorkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repetirnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fractionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum emptyInstructionTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see edu.upb.lp.rebotinol.RebotinolPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RebotinolPackageImpl()
  {
    super(eNS_URI, RebotinolFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RebotinolPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RebotinolPackage init()
  {
    if (isInited) return (RebotinolPackage)EPackage.Registry.INSTANCE.getEPackage(RebotinolPackage.eNS_URI);

    // Obtain or create and register package
    RebotinolPackageImpl theRebotinolPackage = (RebotinolPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RebotinolPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RebotinolPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRebotinolPackage.createPackageContents();

    // Initialize created meta-data
    theRebotinolPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRebotinolPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RebotinolPackage.eNS_URI, theRebotinolPackage);
    return theRebotinolPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRebotinolProgram()
  {
    return rebotinolProgramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRebotinolProgram_Instructions()
  {
    return (EReference)rebotinolProgramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmptyInstruction()
  {
    return emptyInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmptyInstruction_Type()
  {
    return (EAttribute)emptyInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNonEmptyInstruction()
  {
    return nonEmptyInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexInstruction()
  {
    return complexInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexInstruction_SubInstructions()
  {
    return (EReference)complexInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumber()
  {
    return numberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPositiveNumber()
  {
    return positiveNumberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteger()
  {
    return integerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteger_Value()
  {
    return (EAttribute)integerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegativeNumber()
  {
    return negativeNumberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegativeNumber_Val()
  {
    return (EReference)negativeNumberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSumak()
  {
    return sumakEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSumak_Val()
  {
    return (EReference)sumakEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultk()
  {
    return multkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultk_Val()
  {
    return (EReference)multkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIgual()
  {
    return igualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIgualk()
  {
    return igualkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIgualk_Val()
  {
    return (EReference)igualkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDifer()
  {
    return diferEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiferk()
  {
    return diferkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiferk_Val()
  {
    return (EReference)diferkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMayor()
  {
    return mayorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMayork()
  {
    return mayorkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMayork_Val()
  {
    return (EReference)mayorkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMenor()
  {
    return menorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMenork()
  {
    return menorkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMenork_Val()
  {
    return (EReference)menorkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepetirn()
  {
    return repetirnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepetirn_Val()
  {
    return (EAttribute)repetirnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFraction()
  {
    return fractionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFraction_Numerator()
  {
    return (EReference)fractionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFraction_Denominator()
  {
    return (EReference)fractionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEmptyInstructionType()
  {
    return emptyInstructionTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RebotinolFactory getRebotinolFactory()
  {
    return (RebotinolFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    rebotinolProgramEClass = createEClass(REBOTINOL_PROGRAM);
    createEReference(rebotinolProgramEClass, REBOTINOL_PROGRAM__INSTRUCTIONS);

    instructionEClass = createEClass(INSTRUCTION);

    emptyInstructionEClass = createEClass(EMPTY_INSTRUCTION);
    createEAttribute(emptyInstructionEClass, EMPTY_INSTRUCTION__TYPE);

    nonEmptyInstructionEClass = createEClass(NON_EMPTY_INSTRUCTION);

    complexInstructionEClass = createEClass(COMPLEX_INSTRUCTION);
    createEReference(complexInstructionEClass, COMPLEX_INSTRUCTION__SUB_INSTRUCTIONS);

    numberEClass = createEClass(NUMBER);

    positiveNumberEClass = createEClass(POSITIVE_NUMBER);

    integerEClass = createEClass(INTEGER);
    createEAttribute(integerEClass, INTEGER__VALUE);

    negativeNumberEClass = createEClass(NEGATIVE_NUMBER);
    createEReference(negativeNumberEClass, NEGATIVE_NUMBER__VAL);

    sumakEClass = createEClass(SUMAK);
    createEReference(sumakEClass, SUMAK__VAL);

    multkEClass = createEClass(MULTK);
    createEReference(multkEClass, MULTK__VAL);

    igualEClass = createEClass(IGUAL);

    igualkEClass = createEClass(IGUALK);
    createEReference(igualkEClass, IGUALK__VAL);

    diferEClass = createEClass(DIFER);

    diferkEClass = createEClass(DIFERK);
    createEReference(diferkEClass, DIFERK__VAL);

    mayorEClass = createEClass(MAYOR);

    mayorkEClass = createEClass(MAYORK);
    createEReference(mayorkEClass, MAYORK__VAL);

    menorEClass = createEClass(MENOR);

    menorkEClass = createEClass(MENORK);
    createEReference(menorkEClass, MENORK__VAL);

    repetirnEClass = createEClass(REPETIRN);
    createEAttribute(repetirnEClass, REPETIRN__VAL);

    fractionEClass = createEClass(FRACTION);
    createEReference(fractionEClass, FRACTION__NUMERATOR);
    createEReference(fractionEClass, FRACTION__DENOMINATOR);

    // Create enums
    emptyInstructionTypeEEnum = createEEnum(EMPTY_INSTRUCTION_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    emptyInstructionEClass.getESuperTypes().add(this.getInstruction());
    nonEmptyInstructionEClass.getESuperTypes().add(this.getInstruction());
    complexInstructionEClass.getESuperTypes().add(this.getNonEmptyInstruction());
    positiveNumberEClass.getESuperTypes().add(this.getNumber());
    integerEClass.getESuperTypes().add(this.getPositiveNumber());
    negativeNumberEClass.getESuperTypes().add(this.getNumber());
    sumakEClass.getESuperTypes().add(this.getNonEmptyInstruction());
    multkEClass.getESuperTypes().add(this.getNonEmptyInstruction());
    igualEClass.getESuperTypes().add(this.getComplexInstruction());
    igualkEClass.getESuperTypes().add(this.getComplexInstruction());
    diferEClass.getESuperTypes().add(this.getComplexInstruction());
    diferkEClass.getESuperTypes().add(this.getComplexInstruction());
    mayorEClass.getESuperTypes().add(this.getComplexInstruction());
    mayorkEClass.getESuperTypes().add(this.getComplexInstruction());
    menorEClass.getESuperTypes().add(this.getComplexInstruction());
    menorkEClass.getESuperTypes().add(this.getComplexInstruction());
    repetirnEClass.getESuperTypes().add(this.getComplexInstruction());
    fractionEClass.getESuperTypes().add(this.getPositiveNumber());

    // Initialize classes and features; add operations and parameters
    initEClass(rebotinolProgramEClass, RebotinolProgram.class, "RebotinolProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRebotinolProgram_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, RebotinolProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(emptyInstructionEClass, EmptyInstruction.class, "EmptyInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEmptyInstruction_Type(), this.getEmptyInstructionType(), "type", null, 0, 1, EmptyInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nonEmptyInstructionEClass, NonEmptyInstruction.class, "NonEmptyInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(complexInstructionEClass, ComplexInstruction.class, "ComplexInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComplexInstruction_SubInstructions(), this.getInstruction(), null, "subInstructions", null, 0, -1, ComplexInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberEClass, edu.upb.lp.rebotinol.Number.class, "Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(positiveNumberEClass, PositiveNumber.class, "PositiveNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(integerEClass, edu.upb.lp.rebotinol.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInteger_Value(), ecorePackage.getEInt(), "value", null, 0, 1, edu.upb.lp.rebotinol.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(negativeNumberEClass, NegativeNumber.class, "NegativeNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNegativeNumber_Val(), this.getPositiveNumber(), null, "val", null, 0, 1, NegativeNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sumakEClass, Sumak.class, "Sumak", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSumak_Val(), this.getNumber(), null, "val", null, 0, 1, Sumak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multkEClass, Multk.class, "Multk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultk_Val(), this.getNumber(), null, "val", null, 0, 1, Multk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(igualEClass, Igual.class, "Igual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(igualkEClass, Igualk.class, "Igualk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIgualk_Val(), this.getNumber(), null, "val", null, 0, 1, Igualk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(diferEClass, Difer.class, "Difer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(diferkEClass, Diferk.class, "Diferk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDiferk_Val(), this.getNumber(), null, "val", null, 0, 1, Diferk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mayorEClass, Mayor.class, "Mayor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mayorkEClass, Mayork.class, "Mayork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMayork_Val(), this.getNumber(), null, "val", null, 0, 1, Mayork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(menorEClass, Menor.class, "Menor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(menorkEClass, Menork.class, "Menork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMenork_Val(), this.getNumber(), null, "val", null, 0, 1, Menork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repetirnEClass, Repetirn.class, "Repetirn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepetirn_Val(), ecorePackage.getEInt(), "val", null, 0, 1, Repetirn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fractionEClass, Fraction.class, "Fraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFraction_Numerator(), this.getInteger(), null, "numerator", null, 0, 1, Fraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFraction_Denominator(), this.getInteger(), null, "denominator", null, 0, 1, Fraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(emptyInstructionTypeEEnum, EmptyInstructionType.class, "EmptyInstructionType");
    addEEnumLiteral(emptyInstructionTypeEEnum, EmptyInstructionType.DER);
    addEEnumLiteral(emptyInstructionTypeEEnum, EmptyInstructionType.IZQ);
    addEEnumLiteral(emptyInstructionTypeEEnum, EmptyInstructionType.ARR);
    addEEnumLiteral(emptyInstructionTypeEEnum, EmptyInstructionType.ABA);
    addEEnumLiteral(emptyInstructionTypeEEnum, EmptyInstructionType.MEMO);
    addEEnumLiteral(emptyInstructionTypeEEnum, EmptyInstructionType.ESCRI);
    addEEnumLiteral(emptyInstructionTypeEEnum, EmptyInstructionType.SUMA);
    addEEnumLiteral(emptyInstructionTypeEEnum, EmptyInstructionType.SIGNO);
    addEEnumLiteral(emptyInstructionTypeEEnum, EmptyInstructionType.MULT);
    addEEnumLiteral(emptyInstructionTypeEEnum, EmptyInstructionType.INVER);
    addEEnumLiteral(emptyInstructionTypeEEnum, EmptyInstructionType.ENVIAR);
    addEEnumLiteral(emptyInstructionTypeEEnum, EmptyInstructionType.ENVIAR_MATRIZ);

    // Create resource
    createResource(eNS_URI);
  }

} //RebotinolPackageImpl
