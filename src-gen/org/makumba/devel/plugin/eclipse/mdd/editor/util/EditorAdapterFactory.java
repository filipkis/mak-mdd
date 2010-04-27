/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.makumba.devel.plugin.eclipse.mdd.editor.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage
 * @generated
 */
public class EditorAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EditorPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EditorPackage.eINSTANCE;
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
  protected EditorSwitch<Adapter> modelSwitch =
    new EditorSwitch<Adapter>()
    {
      @Override
      public Adapter casedataDefinition(dataDefinition object)
      {
        return createdataDefinitionAdapter();
      }
      @Override
      public Adapter casedeclaration(declaration object)
      {
        return createdeclarationAdapter();
      }
      @Override
      public Adapter casefieldDeclaration(fieldDeclaration object)
      {
        return createfieldDeclarationAdapter();
      }
      @Override
      public Adapter casemodifiers(modifiers object)
      {
        return createmodifiersAdapter();
      }
      @Override
      public Adapter casefieldType(fieldType object)
      {
        return createfieldTypeAdapter();
      }
      @Override
      public Adapter caseintEnum(intEnum object)
      {
        return createintEnumAdapter();
      }
      @Override
      public Adapter casecharEnum(charEnum object)
      {
        return createcharEnumAdapter();
      }
      @Override
      public Adapter caseenumValue(enumValue object)
      {
        return createenumValueAdapter();
      }
      @Override
      public Adapter casecharType(charType object)
      {
        return createcharTypeAdapter();
      }
      @Override
      public Adapter casepointer(pointer object)
      {
        return createpointerAdapter();
      }
      @Override
      public Adapter casesetType(setType object)
      {
        return createsetTypeAdapter();
      }
      @Override
      public Adapter casesubFieldDeclaration(subFieldDeclaration object)
      {
        return createsubFieldDeclarationAdapter();
      }
      @Override
      public Adapter casetitleDeclaration(titleDeclaration object)
      {
        return createtitleDeclarationAdapter();
      }
      @Override
      public Adapter casetitle(title object)
      {
        return createtitleAdapter();
      }
      @Override
      public Adapter caseincludeDeclaration(includeDeclaration object)
      {
        return createincludeDeclarationAdapter();
      }
      @Override
      public Adapter casetypeDeclaration(typeDeclaration object)
      {
        return createtypeDeclarationAdapter();
      }
      @Override
      public Adapter casevalidationRuleDeclaration(validationRuleDeclaration object)
      {
        return createvalidationRuleDeclarationAdapter();
      }
      @Override
      public Adapter casecomparisonValidationRuleDeclaration(comparisonValidationRuleDeclaration object)
      {
        return createcomparisonValidationRuleDeclarationAdapter();
      }
      @Override
      public Adapter casecomparisonExpression(comparisonExpression object)
      {
        return createcomparisonExpressionAdapter();
      }
      @Override
      public Adapter casecomparisonPart(comparisonPart object)
      {
        return createcomparisonPartAdapter();
      }
      @Override
      public Adapter caseupperFunction(upperFunction object)
      {
        return createupperFunctionAdapter();
      }
      @Override
      public Adapter caselowerFunction(lowerFunction object)
      {
        return createlowerFunctionAdapter();
      }
      @Override
      public Adapter caserangeValidationRuleDeclaration(rangeValidationRuleDeclaration object)
      {
        return createrangeValidationRuleDeclarationAdapter();
      }
      @Override
      public Adapter caseregexValidationRuleDeclaration(regexValidationRuleDeclaration object)
      {
        return createregexValidationRuleDeclarationAdapter();
      }
      @Override
      public Adapter caserange(range object)
      {
        return createrangeAdapter();
      }
      @Override
      public Adapter caseuniquenessValidationRuleDeclaration(uniquenessValidationRuleDeclaration object)
      {
        return createuniquenessValidationRuleDeclarationAdapter();
      }
      @Override
      public Adapter caseerrorMessage(errorMessage object)
      {
        return createerrorMessageAdapter();
      }
      @Override
      public Adapter casenativeValidationRuleDeclaration(nativeValidationRuleDeclaration object)
      {
        return createnativeValidationRuleDeclarationAdapter();
      }
      @Override
      public Adapter casefunctionDeclaration(functionDeclaration object)
      {
        return createfunctionDeclarationAdapter();
      }
      @Override
      public Adapter casefunctionArgumentDeclaration(functionArgumentDeclaration object)
      {
        return createfunctionArgumentDeclarationAdapter();
      }
      @Override
      public Adapter casefunctionArgumentBody(functionArgumentBody object)
      {
        return createfunctionArgumentBodyAdapter();
      }
      @Override
      public Adapter casefunctionCall(functionCall object)
      {
        return createfunctionCallAdapter();
      }
      @Override
      public Adapter casefunctionArguments(functionArguments object)
      {
        return createfunctionArgumentsAdapter();
      }
      @Override
      public Adapter casefunctionBody(functionBody object)
      {
        return createfunctionBodyAdapter();
      }
      @Override
      public Adapter casestatement(statement object)
      {
        return createstatementAdapter();
      }
      @Override
      public Adapter caseunionRule(unionRule object)
      {
        return createunionRuleAdapter();
      }
      @Override
      public Adapter casequeryRule(queryRule object)
      {
        return createqueryRuleAdapter();
      }
      @Override
      public Adapter caseselectFrom(selectFrom object)
      {
        return createselectFromAdapter();
      }
      @Override
      public Adapter caseselectClause(selectClause object)
      {
        return createselectClauseAdapter();
      }
      @Override
      public Adapter casenewExpression(newExpression object)
      {
        return createnewExpressionAdapter();
      }
      @Override
      public Adapter casefromClause(fromClause object)
      {
        return createfromClauseAdapter();
      }
      @Override
      public Adapter casefromJoin(fromJoin object)
      {
        return createfromJoinAdapter();
      }
      @Override
      public Adapter casewithClause(withClause object)
      {
        return createwithClauseAdapter();
      }
      @Override
      public Adapter casefromRange(fromRange object)
      {
        return createfromRangeAdapter();
      }
      @Override
      public Adapter casefromClassOrOuterQueryPath(fromClassOrOuterQueryPath object)
      {
        return createfromClassOrOuterQueryPathAdapter();
      }
      @Override
      public Adapter caseinCollectionElementsDeclaration(inCollectionElementsDeclaration object)
      {
        return createinCollectionElementsDeclarationAdapter();
      }
      @Override
      public Adapter caseasAlias(asAlias object)
      {
        return createasAliasAdapter();
      }
      @Override
      public Adapter casegroupByClause(groupByClause object)
      {
        return creategroupByClauseAdapter();
      }
      @Override
      public Adapter caseorderByClause(orderByClause object)
      {
        return createorderByClauseAdapter();
      }
      @Override
      public Adapter caseorderElement(orderElement object)
      {
        return createorderElementAdapter();
      }
      @Override
      public Adapter casehavingClause(havingClause object)
      {
        return createhavingClauseAdapter();
      }
      @Override
      public Adapter casewhereClause(whereClause object)
      {
        return createwhereClauseAdapter();
      }
      @Override
      public Adapter caseselectedPropertiesList(selectedPropertiesList object)
      {
        return createselectedPropertiesListAdapter();
      }
      @Override
      public Adapter casealiasedExpression(aliasedExpression object)
      {
        return createaliasedExpressionAdapter();
      }
      @Override
      public Adapter caseexpression(expression object)
      {
        return createexpressionAdapter();
      }
      @Override
      public Adapter caselogicalOrExpression(logicalOrExpression object)
      {
        return createlogicalOrExpressionAdapter();
      }
      @Override
      public Adapter caselogicalAndExpression(logicalAndExpression object)
      {
        return createlogicalAndExpressionAdapter();
      }
      @Override
      public Adapter casenegatedExpression(negatedExpression object)
      {
        return createnegatedExpressionAdapter();
      }
      @Override
      public Adapter caseequalityExpression(equalityExpression object)
      {
        return createequalityExpressionAdapter();
      }
      @Override
      public Adapter caserelationalExpression(relationalExpression object)
      {
        return createrelationalExpressionAdapter();
      }
      @Override
      public Adapter caselikeEscape(likeEscape object)
      {
        return createlikeEscapeAdapter();
      }
      @Override
      public Adapter casebetweenList(betweenList object)
      {
        return createbetweenListAdapter();
      }
      @Override
      public Adapter caseconcatenation(concatenation object)
      {
        return createconcatenationAdapter();
      }
      @Override
      public Adapter caseadditiveExpression(additiveExpression object)
      {
        return createadditiveExpressionAdapter();
      }
      @Override
      public Adapter casemultiplyExpression(multiplyExpression object)
      {
        return createmultiplyExpressionAdapter();
      }
      @Override
      public Adapter caseunaryExpression(unaryExpression object)
      {
        return createunaryExpressionAdapter();
      }
      @Override
      public Adapter casecaseExpression(caseExpression object)
      {
        return createcaseExpressionAdapter();
      }
      @Override
      public Adapter casewhenClause(whenClause object)
      {
        return createwhenClauseAdapter();
      }
      @Override
      public Adapter casealtWhenClause(altWhenClause object)
      {
        return createaltWhenClauseAdapter();
      }
      @Override
      public Adapter caseelseClause(elseClause object)
      {
        return createelseClauseAdapter();
      }
      @Override
      public Adapter casequantifiedExpression(quantifiedExpression object)
      {
        return createquantifiedExpressionAdapter();
      }
      @Override
      public Adapter caseatom(atom object)
      {
        return createatomAdapter();
      }
      @Override
      public Adapter caseprimaryExpression(primaryExpression object)
      {
        return createprimaryExpressionAdapter();
      }
      @Override
      public Adapter caseexpressionOrVector(expressionOrVector object)
      {
        return createexpressionOrVectorAdapter();
      }
      @Override
      public Adapter casevectorExpr(vectorExpr object)
      {
        return createvectorExprAdapter();
      }
      @Override
      public Adapter caseidentPrimary(identPrimary object)
      {
        return createidentPrimaryAdapter();
      }
      @Override
      public Adapter caseaggregate(aggregate object)
      {
        return createaggregateAdapter();
      }
      @Override
      public Adapter casecompoundExpr(compoundExpr object)
      {
        return createcompoundExprAdapter();
      }
      @Override
      public Adapter caseexprList(exprList object)
      {
        return createexprListAdapter();
      }
      @Override
      public Adapter caseselectCause(selectCause object)
      {
        return createselectCauseAdapter();
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
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.dataDefinition <em>data Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.dataDefinition
   * @generated
   */
  public Adapter createdataDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.declaration <em>declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.declaration
   * @generated
   */
  public Adapter createdeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration <em>field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration
   * @generated
   */
  public Adapter createfieldDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.modifiers <em>modifiers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.modifiers
   * @generated
   */
  public Adapter createmodifiersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldType <em>field Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fieldType
   * @generated
   */
  public Adapter createfieldTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.intEnum <em>int Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.intEnum
   * @generated
   */
  public Adapter createintEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.charEnum <em>char Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.charEnum
   * @generated
   */
  public Adapter createcharEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.enumValue <em>enum Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.enumValue
   * @generated
   */
  public Adapter createenumValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.charType <em>char Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.charType
   * @generated
   */
  public Adapter createcharTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.pointer <em>pointer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.pointer
   * @generated
   */
  public Adapter createpointerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.setType <em>set Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.setType
   * @generated
   */
  public Adapter createsetTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.subFieldDeclaration <em>sub Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.subFieldDeclaration
   * @generated
   */
  public Adapter createsubFieldDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.titleDeclaration <em>title Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.titleDeclaration
   * @generated
   */
  public Adapter createtitleDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.title <em>title</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.title
   * @generated
   */
  public Adapter createtitleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.includeDeclaration <em>include Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.includeDeclaration
   * @generated
   */
  public Adapter createincludeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.typeDeclaration <em>type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.typeDeclaration
   * @generated
   */
  public Adapter createtypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration <em>validation Rule Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration
   * @generated
   */
  public Adapter createvalidationRuleDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonValidationRuleDeclaration <em>comparison Validation Rule Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.comparisonValidationRuleDeclaration
   * @generated
   */
  public Adapter createcomparisonValidationRuleDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonExpression <em>comparison Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.comparisonExpression
   * @generated
   */
  public Adapter createcomparisonExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart <em>comparison Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart
   * @generated
   */
  public Adapter createcomparisonPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.upperFunction <em>upper Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.upperFunction
   * @generated
   */
  public Adapter createupperFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.lowerFunction <em>lower Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.lowerFunction
   * @generated
   */
  public Adapter createlowerFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.rangeValidationRuleDeclaration <em>range Validation Rule Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.rangeValidationRuleDeclaration
   * @generated
   */
  public Adapter createrangeValidationRuleDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.regexValidationRuleDeclaration <em>regex Validation Rule Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.regexValidationRuleDeclaration
   * @generated
   */
  public Adapter createregexValidationRuleDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.range <em>range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.range
   * @generated
   */
  public Adapter createrangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.uniquenessValidationRuleDeclaration <em>uniqueness Validation Rule Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.uniquenessValidationRuleDeclaration
   * @generated
   */
  public Adapter createuniquenessValidationRuleDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.errorMessage <em>error Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.errorMessage
   * @generated
   */
  public Adapter createerrorMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.nativeValidationRuleDeclaration <em>native Validation Rule Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.nativeValidationRuleDeclaration
   * @generated
   */
  public Adapter createnativeValidationRuleDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration <em>function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration
   * @generated
   */
  public Adapter createfunctionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionArgumentDeclaration <em>function Argument Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionArgumentDeclaration
   * @generated
   */
  public Adapter createfunctionArgumentDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionArgumentBody <em>function Argument Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionArgumentBody
   * @generated
   */
  public Adapter createfunctionArgumentBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionCall <em>function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionCall
   * @generated
   */
  public Adapter createfunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionArguments <em>function Arguments</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionArguments
   * @generated
   */
  public Adapter createfunctionArgumentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionBody <em>function Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionBody
   * @generated
   */
  public Adapter createfunctionBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.statement <em>statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.statement
   * @generated
   */
  public Adapter createstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.unionRule <em>union Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.unionRule
   * @generated
   */
  public Adapter createunionRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.queryRule <em>query Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.queryRule
   * @generated
   */
  public Adapter createqueryRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom <em>select From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom
   * @generated
   */
  public Adapter createselectFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectClause <em>select Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.selectClause
   * @generated
   */
  public Adapter createselectClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.newExpression <em>new Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.newExpression
   * @generated
   */
  public Adapter createnewExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromClause <em>from Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fromClause
   * @generated
   */
  public Adapter createfromClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromJoin <em>from Join</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fromJoin
   * @generated
   */
  public Adapter createfromJoinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.withClause <em>with Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.withClause
   * @generated
   */
  public Adapter createwithClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromRange <em>from Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fromRange
   * @generated
   */
  public Adapter createfromRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath <em>from Class Or Outer Query Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath
   * @generated
   */
  public Adapter createfromClassOrOuterQueryPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.inCollectionElementsDeclaration <em>in Collection Elements Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.inCollectionElementsDeclaration
   * @generated
   */
  public Adapter createinCollectionElementsDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.asAlias <em>as Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.asAlias
   * @generated
   */
  public Adapter createasAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.groupByClause <em>group By Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.groupByClause
   * @generated
   */
  public Adapter creategroupByClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.orderByClause <em>order By Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.orderByClause
   * @generated
   */
  public Adapter createorderByClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.orderElement <em>order Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.orderElement
   * @generated
   */
  public Adapter createorderElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.havingClause <em>having Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.havingClause
   * @generated
   */
  public Adapter createhavingClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.whereClause <em>where Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.whereClause
   * @generated
   */
  public Adapter createwhereClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectedPropertiesList <em>selected Properties List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.selectedPropertiesList
   * @generated
   */
  public Adapter createselectedPropertiesListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.aliasedExpression <em>aliased Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.aliasedExpression
   * @generated
   */
  public Adapter createaliasedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.expression <em>expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.expression
   * @generated
   */
  public Adapter createexpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.logicalOrExpression <em>logical Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.logicalOrExpression
   * @generated
   */
  public Adapter createlogicalOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.logicalAndExpression <em>logical And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.logicalAndExpression
   * @generated
   */
  public Adapter createlogicalAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.negatedExpression <em>negated Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.negatedExpression
   * @generated
   */
  public Adapter createnegatedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.equalityExpression <em>equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.equalityExpression
   * @generated
   */
  public Adapter createequalityExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.relationalExpression <em>relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.relationalExpression
   * @generated
   */
  public Adapter createrelationalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.likeEscape <em>like Escape</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.likeEscape
   * @generated
   */
  public Adapter createlikeEscapeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.betweenList <em>between List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.betweenList
   * @generated
   */
  public Adapter createbetweenListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation <em>concatenation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.concatenation
   * @generated
   */
  public Adapter createconcatenationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.additiveExpression <em>additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.additiveExpression
   * @generated
   */
  public Adapter createadditiveExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.multiplyExpression <em>multiply Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.multiplyExpression
   * @generated
   */
  public Adapter createmultiplyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.unaryExpression <em>unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.unaryExpression
   * @generated
   */
  public Adapter createunaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.caseExpression <em>case Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.caseExpression
   * @generated
   */
  public Adapter createcaseExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.whenClause <em>when Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.whenClause
   * @generated
   */
  public Adapter createwhenClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.altWhenClause <em>alt When Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.altWhenClause
   * @generated
   */
  public Adapter createaltWhenClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.elseClause <em>else Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.elseClause
   * @generated
   */
  public Adapter createelseClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.quantifiedExpression <em>quantified Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.quantifiedExpression
   * @generated
   */
  public Adapter createquantifiedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.atom <em>atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.atom
   * @generated
   */
  public Adapter createatomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression <em>primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression
   * @generated
   */
  public Adapter createprimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.expressionOrVector <em>expression Or Vector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.expressionOrVector
   * @generated
   */
  public Adapter createexpressionOrVectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.vectorExpr <em>vector Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.vectorExpr
   * @generated
   */
  public Adapter createvectorExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.identPrimary <em>ident Primary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.identPrimary
   * @generated
   */
  public Adapter createidentPrimaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.aggregate <em>aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.aggregate
   * @generated
   */
  public Adapter createaggregateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.compoundExpr <em>compound Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.compoundExpr
   * @generated
   */
  public Adapter createcompoundExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.exprList <em>expr List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.exprList
   * @generated
   */
  public Adapter createexprListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectCause <em>select Cause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.selectCause
   * @generated
   */
  public Adapter createselectCauseAdapter()
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

} //EditorAdapterFactory
