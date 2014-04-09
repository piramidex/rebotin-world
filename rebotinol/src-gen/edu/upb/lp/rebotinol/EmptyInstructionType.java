/**
 */
package edu.upb.lp.rebotinol;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Empty Instruction Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.upb.lp.rebotinol.RebotinolPackage#getEmptyInstructionType()
 * @model
 * @generated
 */
public enum EmptyInstructionType implements Enumerator
{
  /**
   * The '<em><b>Der</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DER_VALUE
   * @generated
   * @ordered
   */
  DER(0, "der", "DER"),

  /**
   * The '<em><b>Izq</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IZQ_VALUE
   * @generated
   * @ordered
   */
  IZQ(1, "izq", "IZQ"),

  /**
   * The '<em><b>Arr</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARR_VALUE
   * @generated
   * @ordered
   */
  ARR(2, "arr", "ARR"),

  /**
   * The '<em><b>Aba</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABA_VALUE
   * @generated
   * @ordered
   */
  ABA(3, "aba", "ABA"),

  /**
   * The '<em><b>Memo</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEMO_VALUE
   * @generated
   * @ordered
   */
  MEMO(4, "memo", "MEMO"),

  /**
   * The '<em><b>Escri</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ESCRI_VALUE
   * @generated
   * @ordered
   */
  ESCRI(5, "escri", "ESCRI"),

  /**
   * The '<em><b>Suma</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUMA_VALUE
   * @generated
   * @ordered
   */
  SUMA(6, "suma", "SUMA"),

  /**
   * The '<em><b>Signo</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SIGNO_VALUE
   * @generated
   * @ordered
   */
  SIGNO(7, "signo", "SIGNO"),

  /**
   * The '<em><b>Mult</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MULT_VALUE
   * @generated
   * @ordered
   */
  MULT(8, "Mult", "MULT"),

  /**
   * The '<em><b>Inver</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INVER_VALUE
   * @generated
   * @ordered
   */
  INVER(9, "Inver", "INVER"),

  /**
   * The '<em><b>Enviar</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENVIAR_VALUE
   * @generated
   * @ordered
   */
  ENVIAR(10, "Enviar", "ENVIAR"),

  /**
   * The '<em><b>Enviar Cinta</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENVIAR_CINTA_VALUE
   * @generated
   * @ordered
   */
  ENVIAR_CINTA(11, "EnviarCinta", "ENVIAR CINTA"),

  /**
   * The '<em><b>Enviar Matriz</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENVIAR_MATRIZ_VALUE
   * @generated
   * @ordered
   */
  ENVIAR_MATRIZ(12, "EnviarMatriz", "ENVIAR MATRIZ");

  /**
   * The '<em><b>Der</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Der</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DER
   * @model name="der" literal="DER"
   * @generated
   * @ordered
   */
  public static final int DER_VALUE = 0;

  /**
   * The '<em><b>Izq</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Izq</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IZQ
   * @model name="izq" literal="IZQ"
   * @generated
   * @ordered
   */
  public static final int IZQ_VALUE = 1;

  /**
   * The '<em><b>Arr</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Arr</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ARR
   * @model name="arr" literal="ARR"
   * @generated
   * @ordered
   */
  public static final int ARR_VALUE = 2;

  /**
   * The '<em><b>Aba</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Aba</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ABA
   * @model name="aba" literal="ABA"
   * @generated
   * @ordered
   */
  public static final int ABA_VALUE = 3;

  /**
   * The '<em><b>Memo</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Memo</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MEMO
   * @model name="memo" literal="MEMO"
   * @generated
   * @ordered
   */
  public static final int MEMO_VALUE = 4;

  /**
   * The '<em><b>Escri</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Escri</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ESCRI
   * @model name="escri" literal="ESCRI"
   * @generated
   * @ordered
   */
  public static final int ESCRI_VALUE = 5;

  /**
   * The '<em><b>Suma</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Suma</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUMA
   * @model name="suma" literal="SUMA"
   * @generated
   * @ordered
   */
  public static final int SUMA_VALUE = 6;

  /**
   * The '<em><b>Signo</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Signo</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SIGNO
   * @model name="signo" literal="SIGNO"
   * @generated
   * @ordered
   */
  public static final int SIGNO_VALUE = 7;

  /**
   * The '<em><b>Mult</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Mult</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MULT
   * @model name="Mult" literal="MULT"
   * @generated
   * @ordered
   */
  public static final int MULT_VALUE = 8;

  /**
   * The '<em><b>Inver</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Inver</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INVER
   * @model name="Inver" literal="INVER"
   * @generated
   * @ordered
   */
  public static final int INVER_VALUE = 9;

  /**
   * The '<em><b>Enviar</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Enviar</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENVIAR
   * @model name="Enviar" literal="ENVIAR"
   * @generated
   * @ordered
   */
  public static final int ENVIAR_VALUE = 10;

  /**
   * The '<em><b>Enviar Cinta</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Enviar Cinta</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENVIAR_CINTA
   * @model name="EnviarCinta" literal="ENVIAR CINTA"
   * @generated
   * @ordered
   */
  public static final int ENVIAR_CINTA_VALUE = 11;

  /**
   * The '<em><b>Enviar Matriz</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Enviar Matriz</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENVIAR_MATRIZ
   * @model name="EnviarMatriz" literal="ENVIAR MATRIZ"
   * @generated
   * @ordered
   */
  public static final int ENVIAR_MATRIZ_VALUE = 12;

  /**
   * An array of all the '<em><b>Empty Instruction Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EmptyInstructionType[] VALUES_ARRAY =
    new EmptyInstructionType[]
    {
      DER,
      IZQ,
      ARR,
      ABA,
      MEMO,
      ESCRI,
      SUMA,
      SIGNO,
      MULT,
      INVER,
      ENVIAR,
      ENVIAR_CINTA,
      ENVIAR_MATRIZ,
    };

  /**
   * A public read-only list of all the '<em><b>Empty Instruction Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EmptyInstructionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Empty Instruction Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EmptyInstructionType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EmptyInstructionType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Empty Instruction Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EmptyInstructionType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EmptyInstructionType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Empty Instruction Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EmptyInstructionType get(int value)
  {
    switch (value)
    {
      case DER_VALUE: return DER;
      case IZQ_VALUE: return IZQ;
      case ARR_VALUE: return ARR;
      case ABA_VALUE: return ABA;
      case MEMO_VALUE: return MEMO;
      case ESCRI_VALUE: return ESCRI;
      case SUMA_VALUE: return SUMA;
      case SIGNO_VALUE: return SIGNO;
      case MULT_VALUE: return MULT;
      case INVER_VALUE: return INVER;
      case ENVIAR_VALUE: return ENVIAR;
      case ENVIAR_CINTA_VALUE: return ENVIAR_CINTA;
      case ENVIAR_MATRIZ_VALUE: return ENVIAR_MATRIZ;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EmptyInstructionType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //EmptyInstructionType
