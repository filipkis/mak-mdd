/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.makumba.devel.plugin.eclipse.mdd.editor.*;

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
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage
 * @generated
 */
public class EditorSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EditorPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EditorPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EditorPackage.DATA_DEFINITION:
      {
        dataDefinition dataDefinition = (dataDefinition)theEObject;
        T result = casedataDefinition(dataDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.DECLARATION:
      {
        declaration declaration = (declaration)theEObject;
        T result = casedeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FIELD_DECLARATION:
      {
        fieldDeclaration fieldDeclaration = (fieldDeclaration)theEObject;
        T result = casefieldDeclaration(fieldDeclaration);
        if (result == null) result = casedeclaration(fieldDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.MODIFIERS:
      {
        modifiers modifiers = (modifiers)theEObject;
        T result = casemodifiers(modifiers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FIELD_TYPE:
      {
        fieldType fieldType = (fieldType)theEObject;
        T result = casefieldType(fieldType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.INT_ENUM:
      {
        intEnum intEnum = (intEnum)theEObject;
        T result = caseintEnum(intEnum);
        if (result == null) result = casefieldType(intEnum);
        if (result == null) result = casefunctionArgumentBody(intEnum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.CHAR_ENUM:
      {
        charEnum charEnum = (charEnum)theEObject;
        T result = casecharEnum(charEnum);
        if (result == null) result = casefieldType(charEnum);
        if (result == null) result = casefunctionArgumentBody(charEnum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ENUM_VALUE:
      {
        enumValue enumValue = (enumValue)theEObject;
        T result = caseenumValue(enumValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.CHAR_TYPE:
      {
        charType charType = (charType)theEObject;
        T result = casecharType(charType);
        if (result == null) result = casefieldType(charType);
        if (result == null) result = casefunctionArgumentBody(charType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.POINTER:
      {
        pointer pointer = (pointer)theEObject;
        T result = casepointer(pointer);
        if (result == null) result = casefieldType(pointer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.SET_TYPE:
      {
        setType setType = (setType)theEObject;
        T result = casesetType(setType);
        if (result == null) result = casefieldType(setType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.SUB_FIELD_DECLARATION:
      {
        subFieldDeclaration subFieldDeclaration = (subFieldDeclaration)theEObject;
        T result = casesubFieldDeclaration(subFieldDeclaration);
        if (result == null) result = casedeclaration(subFieldDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.TITLE_DECLARATION:
      {
        titleDeclaration titleDeclaration = (titleDeclaration)theEObject;
        T result = casetitleDeclaration(titleDeclaration);
        if (result == null) result = casedeclaration(titleDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.TITLE:
      {
        title title = (title)theEObject;
        T result = casetitle(title);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.INCLUDE_DECLARATION:
      {
        includeDeclaration includeDeclaration = (includeDeclaration)theEObject;
        T result = caseincludeDeclaration(includeDeclaration);
        if (result == null) result = casedeclaration(includeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.TYPE_DECLARATION:
      {
        typeDeclaration typeDeclaration = (typeDeclaration)theEObject;
        T result = casetypeDeclaration(typeDeclaration);
        if (result == null) result = casedeclaration(typeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.VALIDATION_RULE_DECLARATION:
      {
        validationRuleDeclaration validationRuleDeclaration = (validationRuleDeclaration)theEObject;
        T result = casevalidationRuleDeclaration(validationRuleDeclaration);
        if (result == null) result = casedeclaration(validationRuleDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.COMPARISON_VALIDATION_RULE_DECLARATION:
      {
        comparisonValidationRuleDeclaration comparisonValidationRuleDeclaration = (comparisonValidationRuleDeclaration)theEObject;
        T result = casecomparisonValidationRuleDeclaration(comparisonValidationRuleDeclaration);
        if (result == null) result = casevalidationRuleDeclaration(comparisonValidationRuleDeclaration);
        if (result == null) result = casedeclaration(comparisonValidationRuleDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.COMPARISON_EXPRESSION:
      {
        comparisonExpression comparisonExpression = (comparisonExpression)theEObject;
        T result = casecomparisonExpression(comparisonExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.COMPARISON_PART:
      {
        comparisonPart comparisonPart = (comparisonPart)theEObject;
        T result = casecomparisonPart(comparisonPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UPPER_FUNCTION:
      {
        upperFunction upperFunction = (upperFunction)theEObject;
        T result = caseupperFunction(upperFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.LOWER_FUNCTION:
      {
        lowerFunction lowerFunction = (lowerFunction)theEObject;
        T result = caselowerFunction(lowerFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.RANGE_VALIDATION_RULE_DECLARATION:
      {
        rangeValidationRuleDeclaration rangeValidationRuleDeclaration = (rangeValidationRuleDeclaration)theEObject;
        T result = caserangeValidationRuleDeclaration(rangeValidationRuleDeclaration);
        if (result == null) result = casevalidationRuleDeclaration(rangeValidationRuleDeclaration);
        if (result == null) result = casedeclaration(rangeValidationRuleDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.REGEX_VALIDATION_RULE_DECLARATION:
      {
        regexValidationRuleDeclaration regexValidationRuleDeclaration = (regexValidationRuleDeclaration)theEObject;
        T result = caseregexValidationRuleDeclaration(regexValidationRuleDeclaration);
        if (result == null) result = casevalidationRuleDeclaration(regexValidationRuleDeclaration);
        if (result == null) result = casedeclaration(regexValidationRuleDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.RANGE:
      {
        range range = (range)theEObject;
        T result = caserange(range);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNIQUENESS_VALIDATION_RULE_DECLARATION:
      {
        uniquenessValidationRuleDeclaration uniquenessValidationRuleDeclaration = (uniquenessValidationRuleDeclaration)theEObject;
        T result = caseuniquenessValidationRuleDeclaration(uniquenessValidationRuleDeclaration);
        if (result == null) result = casevalidationRuleDeclaration(uniquenessValidationRuleDeclaration);
        if (result == null) result = casedeclaration(uniquenessValidationRuleDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ERROR_MESSAGE:
      {
        errorMessage errorMessage = (errorMessage)theEObject;
        T result = caseerrorMessage(errorMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.NATIVE_VALIDATION_RULE_DECLARATION:
      {
        nativeValidationRuleDeclaration nativeValidationRuleDeclaration = (nativeValidationRuleDeclaration)theEObject;
        T result = casenativeValidationRuleDeclaration(nativeValidationRuleDeclaration);
        if (result == null) result = casedeclaration(nativeValidationRuleDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FUNCTION_DECLARATION:
      {
        functionDeclaration functionDeclaration = (functionDeclaration)theEObject;
        T result = casefunctionDeclaration(functionDeclaration);
        if (result == null) result = casedeclaration(functionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FUNCTION_ARGUMENT_DECLARATION:
      {
        functionArgumentDeclaration functionArgumentDeclaration = (functionArgumentDeclaration)theEObject;
        T result = casefunctionArgumentDeclaration(functionArgumentDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FUNCTION_ARGUMENT_BODY:
      {
        functionArgumentBody functionArgumentBody = (functionArgumentBody)theEObject;
        T result = casefunctionArgumentBody(functionArgumentBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FUNCTION_CALL:
      {
        functionCall functionCall = (functionCall)theEObject;
        T result = casefunctionCall(functionCall);
        if (result == null) result = casetitle(functionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FUNCTION_ARGUMENTS:
      {
        functionArguments functionArguments = (functionArguments)theEObject;
        T result = casefunctionArguments(functionArguments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FUNCTION_BODY:
      {
        functionBody functionBody = (functionBody)theEObject;
        T result = casefunctionBody(functionBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.STATEMENT:
      {
        statement statement = (statement)theEObject;
        T result = casestatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNION_RULE:
      {
        unionRule unionRule = (unionRule)theEObject;
        T result = caseunionRule(unionRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUERY_RULE:
      {
        queryRule queryRule = (queryRule)theEObject;
        T result = casequeryRule(queryRule);
        if (result == null) result = casestatement(queryRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.SELECT_FROM:
      {
        selectFrom selectFrom = (selectFrom)theEObject;
        T result = caseselectFrom(selectFrom);
        if (result == null) result = casequeryRule(selectFrom);
        if (result == null) result = casestatement(selectFrom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.SELECT_CLAUSE:
      {
        selectClause selectClause = (selectClause)theEObject;
        T result = caseselectClause(selectClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.NEW_EXPRESSION:
      {
        newExpression newExpression = (newExpression)theEObject;
        T result = casenewExpression(newExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FROM_CLAUSE:
      {
        fromClause fromClause = (fromClause)theEObject;
        T result = casefromClause(fromClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FROM_JOIN:
      {
        fromJoin fromJoin = (fromJoin)theEObject;
        T result = casefromJoin(fromJoin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.WITH_CLAUSE:
      {
        withClause withClause = (withClause)theEObject;
        T result = casewithClause(withClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FROM_RANGE:
      {
        fromRange fromRange = (fromRange)theEObject;
        T result = casefromRange(fromRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH:
      {
        fromClassOrOuterQueryPath fromClassOrOuterQueryPath = (fromClassOrOuterQueryPath)theEObject;
        T result = casefromClassOrOuterQueryPath(fromClassOrOuterQueryPath);
        if (result == null) result = casefromJoin(fromClassOrOuterQueryPath);
        if (result == null) result = casefromRange(fromClassOrOuterQueryPath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.IN_COLLECTION_ELEMENTS_DECLARATION:
      {
        inCollectionElementsDeclaration inCollectionElementsDeclaration = (inCollectionElementsDeclaration)theEObject;
        T result = caseinCollectionElementsDeclaration(inCollectionElementsDeclaration);
        if (result == null) result = casefromRange(inCollectionElementsDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.AS_ALIAS:
      {
        asAlias asAlias = (asAlias)theEObject;
        T result = caseasAlias(asAlias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.GROUP_BY_CLAUSE:
      {
        groupByClause groupByClause = (groupByClause)theEObject;
        T result = casegroupByClause(groupByClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ORDER_BY_CLAUSE:
      {
        orderByClause orderByClause = (orderByClause)theEObject;
        T result = caseorderByClause(orderByClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ORDER_ELEMENT:
      {
        orderElement orderElement = (orderElement)theEObject;
        T result = caseorderElement(orderElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.HAVING_CLAUSE:
      {
        havingClause havingClause = (havingClause)theEObject;
        T result = casehavingClause(havingClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.WHERE_CLAUSE:
      {
        whereClause whereClause = (whereClause)theEObject;
        T result = casewhereClause(whereClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.SELECTED_PROPERTIES_LIST:
      {
        selectedPropertiesList selectedPropertiesList = (selectedPropertiesList)theEObject;
        T result = caseselectedPropertiesList(selectedPropertiesList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ALIASED_EXPRESSION:
      {
        aliasedExpression aliasedExpression = (aliasedExpression)theEObject;
        T result = casealiasedExpression(aliasedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.EXPRESSION:
      {
        expression expression = (expression)theEObject;
        T result = caseexpression(expression);
        if (result == null) result = caseorderElement(expression);
        if (result == null) result = casealiasedExpression(expression);
        if (result == null) result = caseexpressionOrVector(expression);
        if (result == null) result = caseprimaryExpression(expression);
        if (result == null) result = caseatom(expression);
        if (result == null) result = caseunaryExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.LOGICAL_OR_EXPRESSION:
      {
        logicalOrExpression logicalOrExpression = (logicalOrExpression)theEObject;
        T result = caselogicalOrExpression(logicalOrExpression);
        if (result == null) result = caseexpression(logicalOrExpression);
        if (result == null) result = caseorderElement(logicalOrExpression);
        if (result == null) result = casealiasedExpression(logicalOrExpression);
        if (result == null) result = caseexpressionOrVector(logicalOrExpression);
        if (result == null) result = caseprimaryExpression(logicalOrExpression);
        if (result == null) result = caseatom(logicalOrExpression);
        if (result == null) result = caseunaryExpression(logicalOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.LOGICAL_AND_EXPRESSION:
      {
        logicalAndExpression logicalAndExpression = (logicalAndExpression)theEObject;
        T result = caselogicalAndExpression(logicalAndExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.NEGATED_EXPRESSION:
      {
        negatedExpression negatedExpression = (negatedExpression)theEObject;
        T result = casenegatedExpression(negatedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.EQUALITY_EXPRESSION:
      {
        equalityExpression equalityExpression = (equalityExpression)theEObject;
        T result = caseequalityExpression(equalityExpression);
        if (result == null) result = casenegatedExpression(equalityExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.RELATIONAL_EXPRESSION:
      {
        relationalExpression relationalExpression = (relationalExpression)theEObject;
        T result = caserelationalExpression(relationalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.LIKE_ESCAPE:
      {
        likeEscape likeEscape = (likeEscape)theEObject;
        T result = caselikeEscape(likeEscape);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.BETWEEN_LIST:
      {
        betweenList betweenList = (betweenList)theEObject;
        T result = casebetweenList(betweenList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.CONCATENATION:
      {
        concatenation concatenation = (concatenation)theEObject;
        T result = caseconcatenation(concatenation);
        if (result == null) result = caserelationalExpression(concatenation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ADDITIVE_EXPRESSION:
      {
        additiveExpression additiveExpression = (additiveExpression)theEObject;
        T result = caseadditiveExpression(additiveExpression);
        if (result == null) result = caseconcatenation(additiveExpression);
        if (result == null) result = caserelationalExpression(additiveExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.MULTIPLY_EXPRESSION:
      {
        multiplyExpression multiplyExpression = (multiplyExpression)theEObject;
        T result = casemultiplyExpression(multiplyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.UNARY_EXPRESSION:
      {
        unaryExpression unaryExpression = (unaryExpression)theEObject;
        T result = caseunaryExpression(unaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.CASE_EXPRESSION:
      {
        caseExpression caseExpression = (caseExpression)theEObject;
        T result = casecaseExpression(caseExpression);
        if (result == null) result = caseunaryExpression(caseExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.WHEN_CLAUSE:
      {
        whenClause whenClause = (whenClause)theEObject;
        T result = casewhenClause(whenClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ALT_WHEN_CLAUSE:
      {
        altWhenClause altWhenClause = (altWhenClause)theEObject;
        T result = casealtWhenClause(altWhenClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ELSE_CLAUSE:
      {
        elseClause elseClause = (elseClause)theEObject;
        T result = caseelseClause(elseClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.QUANTIFIED_EXPRESSION:
      {
        quantifiedExpression quantifiedExpression = (quantifiedExpression)theEObject;
        T result = casequantifiedExpression(quantifiedExpression);
        if (result == null) result = caseunaryExpression(quantifiedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.ATOM:
      {
        atom atom = (atom)theEObject;
        T result = caseatom(atom);
        if (result == null) result = caseunaryExpression(atom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.PRIMARY_EXPRESSION:
      {
        primaryExpression primaryExpression = (primaryExpression)theEObject;
        T result = caseprimaryExpression(primaryExpression);
        if (result == null) result = caseatom(primaryExpression);
        if (result == null) result = caseunaryExpression(primaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.EXPRESSION_OR_VECTOR:
      {
        expressionOrVector expressionOrVector = (expressionOrVector)theEObject;
        T result = caseexpressionOrVector(expressionOrVector);
        if (result == null) result = caseprimaryExpression(expressionOrVector);
        if (result == null) result = caseatom(expressionOrVector);
        if (result == null) result = caseunaryExpression(expressionOrVector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.VECTOR_EXPR:
      {
        vectorExpr vectorExpr = (vectorExpr)theEObject;
        T result = casevectorExpr(vectorExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.IDENT_PRIMARY:
      {
        identPrimary identPrimary = (identPrimary)theEObject;
        T result = caseidentPrimary(identPrimary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.AGGREGATE:
      {
        aggregate aggregate = (aggregate)theEObject;
        T result = caseaggregate(aggregate);
        if (result == null) result = caseidentPrimary(aggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.COMPOUND_EXPR:
      {
        compoundExpr compoundExpr = (compoundExpr)theEObject;
        T result = casecompoundExpr(compoundExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.EXPR_LIST:
      {
        exprList exprList = (exprList)theEObject;
        T result = caseexprList(exprList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EditorPackage.SELECT_CAUSE:
      {
        selectCause selectCause = (selectCause)theEObject;
        T result = caseselectCause(selectCause);
        if (result == null) result = caseselectClause(selectCause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>data Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>data Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedataDefinition(dataDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedeclaration(declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>field Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>field Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefieldDeclaration(fieldDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>modifiers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>modifiers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemodifiers(modifiers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>field Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>field Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefieldType(fieldType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>int Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>int Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseintEnum(intEnum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>char Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>char Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecharEnum(charEnum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>enum Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>enum Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseenumValue(enumValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>char Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>char Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecharType(charType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>pointer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>pointer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepointer(pointer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>set Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>set Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesetType(setType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sub Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sub Field Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesubFieldDeclaration(subFieldDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>title Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>title Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetitleDeclaration(titleDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>title</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>title</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetitle(title object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>include Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>include Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseincludeDeclaration(includeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetypeDeclaration(typeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>validation Rule Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>validation Rule Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevalidationRuleDeclaration(validationRuleDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>comparison Validation Rule Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>comparison Validation Rule Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecomparisonValidationRuleDeclaration(comparisonValidationRuleDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>comparison Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>comparison Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecomparisonExpression(comparisonExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>comparison Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>comparison Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecomparisonPart(comparisonPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>upper Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>upper Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseupperFunction(upperFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>lower Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>lower Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselowerFunction(lowerFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>range Validation Rule Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>range Validation Rule Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserangeValidationRuleDeclaration(rangeValidationRuleDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>regex Validation Rule Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>regex Validation Rule Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseregexValidationRuleDeclaration(regexValidationRuleDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserange(range object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>uniqueness Validation Rule Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>uniqueness Validation Rule Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseuniquenessValidationRuleDeclaration(uniquenessValidationRuleDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>error Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>error Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseerrorMessage(errorMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>native Validation Rule Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>native Validation Rule Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenativeValidationRuleDeclaration(nativeValidationRuleDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunctionDeclaration(functionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function Argument Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function Argument Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunctionArgumentDeclaration(functionArgumentDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function Argument Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function Argument Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunctionArgumentBody(functionArgumentBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunctionCall(functionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function Arguments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function Arguments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunctionArguments(functionArguments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunctionBody(functionBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestatement(statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>union Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>union Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseunionRule(unionRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>query Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>query Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casequeryRule(queryRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>select From</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>select From</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseselectFrom(selectFrom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>select Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>select Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseselectClause(selectClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>new Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>new Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenewExpression(newExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>from Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>from Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefromClause(fromClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>from Join</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>from Join</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefromJoin(fromJoin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>with Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>with Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casewithClause(withClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>from Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>from Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefromRange(fromRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>from Class Or Outer Query Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>from Class Or Outer Query Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefromClassOrOuterQueryPath(fromClassOrOuterQueryPath object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>in Collection Elements Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>in Collection Elements Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinCollectionElementsDeclaration(inCollectionElementsDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>as Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>as Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseasAlias(asAlias object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>group By Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>group By Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegroupByClause(groupByClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>order By Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>order By Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseorderByClause(orderByClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>order Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>order Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseorderElement(orderElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>having Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>having Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casehavingClause(havingClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>where Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>where Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casewhereClause(whereClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>selected Properties List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>selected Properties List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseselectedPropertiesList(selectedPropertiesList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>aliased Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>aliased Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casealiasedExpression(aliasedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpression(expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>logical Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>logical Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselogicalOrExpression(logicalOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>logical And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>logical And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselogicalAndExpression(logicalAndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>negated Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>negated Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenegatedExpression(negatedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>equality Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>equality Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseequalityExpression(equalityExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>relational Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>relational Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserelationalExpression(relationalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>like Escape</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>like Escape</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselikeEscape(likeEscape object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>between List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>between List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebetweenList(betweenList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>concatenation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>concatenation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconcatenation(concatenation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>additive Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>additive Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseadditiveExpression(additiveExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>multiply Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>multiply Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemultiplyExpression(multiplyExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>unary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>unary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseunaryExpression(unaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>case Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>case Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecaseExpression(caseExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>when Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>when Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casewhenClause(whenClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>alt When Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>alt When Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casealtWhenClause(altWhenClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>else Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>else Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseelseClause(elseClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>quantified Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>quantified Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casequantifiedExpression(quantifiedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseatom(atom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>primary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>primary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprimaryExpression(primaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expression Or Vector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expression Or Vector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpressionOrVector(expressionOrVector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>vector Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>vector Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevectorExpr(vectorExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ident Primary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ident Primary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseidentPrimary(identPrimary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaggregate(aggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>compound Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>compound Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecompoundExpr(compoundExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expr List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expr List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexprList(exprList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>select Cause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>select Cause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseselectCause(selectCause object)
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EditorSwitch
