/**
 */
package edu.upb.lp.rebotinol.util;

import edu.upb.lp.rebotinol.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.upb.lp.rebotinol.RebotinolPackage
 * @generated
 */
public class RebotinolAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RebotinolPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RebotinolAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RebotinolPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RebotinolSwitch<Adapter> modelSwitch =
    new RebotinolSwitch<Adapter>()
    {
      @Override
      public Adapter caseRebotinolProgram(RebotinolProgram object)
      {
        return createRebotinolProgramAdapter();
      }
      @Override
      public Adapter caseInstruction(Instruction object)
      {
        return createInstructionAdapter();
      }
      @Override
      public Adapter caseEmptyInstruction(EmptyInstruction object)
      {
        return createEmptyInstructionAdapter();
      }
      @Override
      public Adapter caseNonEmptyInstruction(NonEmptyInstruction object)
      {
        return createNonEmptyInstructionAdapter();
      }
      @Override
      public Adapter caseComplexInstruction(ComplexInstruction object)
      {
        return createComplexInstructionAdapter();
      }
      @Override
      public Adapter caseSumak(Sumak object)
      {
        return createSumakAdapter();
      }
      @Override
      public Adapter caseMultk(Multk object)
      {
        return createMultkAdapter();
      }
      @Override
      public Adapter caseIgual(Igual object)
      {
        return createIgualAdapter();
      }
      @Override
      public Adapter caseIgualk(Igualk object)
      {
        return createIgualkAdapter();
      }
      @Override
      public Adapter caseDifer(Difer object)
      {
        return createDiferAdapter();
      }
      @Override
      public Adapter caseDiferk(Diferk object)
      {
        return createDiferkAdapter();
      }
      @Override
      public Adapter caseMayor(Mayor object)
      {
        return createMayorAdapter();
      }
      @Override
      public Adapter caseMayork(Mayork object)
      {
        return createMayorkAdapter();
      }
      @Override
      public Adapter caseMenor(Menor object)
      {
        return createMenorAdapter();
      }
      @Override
      public Adapter caseMenork(Menork object)
      {
        return createMenorkAdapter();
      }
      @Override
      public Adapter caseRepetirn(Repetirn object)
      {
        return createRepetirnAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.rebotinol.RebotinolProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.rebotinol.RebotinolProgram
   * @generated
   */
  public Adapter createRebotinolProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.rebotinol.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.rebotinol.Instruction
   * @generated
   */
  public Adapter createInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.rebotinol.EmptyInstruction <em>Empty Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.rebotinol.EmptyInstruction
   * @generated
   */
  public Adapter createEmptyInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.rebotinol.NonEmptyInstruction <em>Non Empty Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.rebotinol.NonEmptyInstruction
   * @generated
   */
  public Adapter createNonEmptyInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.rebotinol.ComplexInstruction <em>Complex Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.rebotinol.ComplexInstruction
   * @generated
   */
  public Adapter createComplexInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.rebotinol.Sumak <em>Sumak</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.rebotinol.Sumak
   * @generated
   */
  public Adapter createSumakAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.rebotinol.Multk <em>Multk</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.rebotinol.Multk
   * @generated
   */
  public Adapter createMultkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.rebotinol.Igual <em>Igual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.rebotinol.Igual
   * @generated
   */
  public Adapter createIgualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.rebotinol.Igualk <em>Igualk</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.rebotinol.Igualk
   * @generated
   */
  public Adapter createIgualkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.rebotinol.Difer <em>Difer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.rebotinol.Difer
   * @generated
   */
  public Adapter createDiferAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.rebotinol.Diferk <em>Diferk</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.rebotinol.Diferk
   * @generated
   */
  public Adapter createDiferkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.rebotinol.Mayor <em>Mayor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.rebotinol.Mayor
   * @generated
   */
  public Adapter createMayorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.rebotinol.Mayork <em>Mayork</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.rebotinol.Mayork
   * @generated
   */
  public Adapter createMayorkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.rebotinol.Menor <em>Menor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.rebotinol.Menor
   * @generated
   */
  public Adapter createMenorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.rebotinol.Menork <em>Menork</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.rebotinol.Menork
   * @generated
   */
  public Adapter createMenorkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.rebotinol.Repetirn <em>Repetirn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.rebotinol.Repetirn
   * @generated
   */
  public Adapter createRepetirnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RebotinolAdapterFactory
