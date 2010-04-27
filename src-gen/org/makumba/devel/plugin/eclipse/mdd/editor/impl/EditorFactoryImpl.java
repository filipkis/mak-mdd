/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.makumba.devel.plugin.eclipse.mdd.editor.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditorFactoryImpl extends EFactoryImpl implements EditorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EditorFactory init()
  {
    try
    {
      EditorFactory theEditorFactory = (EditorFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.makumba.org/devel/plugin/eclipse/mdd/MDD"); 
      if (theEditorFactory != null)
      {
        return theEditorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EditorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorFactoryImpl()
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
      case EditorPackage.DATA_DEFINITION: return createdataDefinition();
      case EditorPackage.DECLARATION: return createdeclaration();
      case EditorPackage.FIELD_DECLARATION: return createfieldDeclaration();
      case EditorPackage.MODIFIERS: return createmodifiers();
      case EditorPackage.FIELD_TYPE: return createfieldType();
      case EditorPackage.INT_ENUM: return createintEnum();
      case EditorPackage.CHAR_ENUM: return createcharEnum();
      case EditorPackage.ENUM_VALUE: return createenumValue();
      case EditorPackage.CHAR_TYPE: return createcharType();
      case EditorPackage.POINTER: return createpointer();
      case EditorPackage.SET_TYPE: return createsetType();
      case EditorPackage.SUB_FIELD_DECLARATION: return createsubFieldDeclaration();
      case EditorPackage.TITLE_DECLARATION: return createtitleDeclaration();
      case EditorPackage.TITLE: return createtitle();
      case EditorPackage.INCLUDE_DECLARATION: return createincludeDeclaration();
      case EditorPackage.TYPE_DECLARATION: return createtypeDeclaration();
      case EditorPackage.VALIDATION_RULE_DECLARATION: return createvalidationRuleDeclaration();
      case EditorPackage.COMPARISON_VALIDATION_RULE_DECLARATION: return createcomparisonValidationRuleDeclaration();
      case EditorPackage.COMPARISON_EXPRESSION: return createcomparisonExpression();
      case EditorPackage.COMPARISON_PART: return createcomparisonPart();
      case EditorPackage.UPPER_FUNCTION: return createupperFunction();
      case EditorPackage.LOWER_FUNCTION: return createlowerFunction();
      case EditorPackage.RANGE_VALIDATION_RULE_DECLARATION: return createrangeValidationRuleDeclaration();
      case EditorPackage.REGEX_VALIDATION_RULE_DECLARATION: return createregexValidationRuleDeclaration();
      case EditorPackage.RANGE: return createrange();
      case EditorPackage.UNIQUENESS_VALIDATION_RULE_DECLARATION: return createuniquenessValidationRuleDeclaration();
      case EditorPackage.ERROR_MESSAGE: return createerrorMessage();
      case EditorPackage.NATIVE_VALIDATION_RULE_DECLARATION: return createnativeValidationRuleDeclaration();
      case EditorPackage.FUNCTION_DECLARATION: return createfunctionDeclaration();
      case EditorPackage.FUNCTION_ARGUMENT_DECLARATION: return createfunctionArgumentDeclaration();
      case EditorPackage.FUNCTION_ARGUMENT_BODY: return createfunctionArgumentBody();
      case EditorPackage.FUNCTION_CALL: return createfunctionCall();
      case EditorPackage.FUNCTION_ARGUMENTS: return createfunctionArguments();
      case EditorPackage.FUNCTION_BODY: return createfunctionBody();
      case EditorPackage.STATEMENT: return createstatement();
      case EditorPackage.UNION_RULE: return createunionRule();
      case EditorPackage.QUERY_RULE: return createqueryRule();
      case EditorPackage.SELECT_FROM: return createselectFrom();
      case EditorPackage.SELECT_CLAUSE: return createselectClause();
      case EditorPackage.NEW_EXPRESSION: return createnewExpression();
      case EditorPackage.FROM_CLAUSE: return createfromClause();
      case EditorPackage.FROM_JOIN: return createfromJoin();
      case EditorPackage.WITH_CLAUSE: return createwithClause();
      case EditorPackage.FROM_RANGE: return createfromRange();
      case EditorPackage.FROM_CLASS_OR_OUTER_QUERY_PATH: return createfromClassOrOuterQueryPath();
      case EditorPackage.IN_COLLECTION_ELEMENTS_DECLARATION: return createinCollectionElementsDeclaration();
      case EditorPackage.AS_ALIAS: return createasAlias();
      case EditorPackage.GROUP_BY_CLAUSE: return creategroupByClause();
      case EditorPackage.ORDER_BY_CLAUSE: return createorderByClause();
      case EditorPackage.ORDER_ELEMENT: return createorderElement();
      case EditorPackage.HAVING_CLAUSE: return createhavingClause();
      case EditorPackage.WHERE_CLAUSE: return createwhereClause();
      case EditorPackage.SELECTED_PROPERTIES_LIST: return createselectedPropertiesList();
      case EditorPackage.ALIASED_EXPRESSION: return createaliasedExpression();
      case EditorPackage.EXPRESSION: return createexpression();
      case EditorPackage.LOGICAL_OR_EXPRESSION: return createlogicalOrExpression();
      case EditorPackage.LOGICAL_AND_EXPRESSION: return createlogicalAndExpression();
      case EditorPackage.NEGATED_EXPRESSION: return createnegatedExpression();
      case EditorPackage.EQUALITY_EXPRESSION: return createequalityExpression();
      case EditorPackage.RELATIONAL_EXPRESSION: return createrelationalExpression();
      case EditorPackage.LIKE_ESCAPE: return createlikeEscape();
      case EditorPackage.BETWEEN_LIST: return createbetweenList();
      case EditorPackage.CONCATENATION: return createconcatenation();
      case EditorPackage.ADDITIVE_EXPRESSION: return createadditiveExpression();
      case EditorPackage.MULTIPLY_EXPRESSION: return createmultiplyExpression();
      case EditorPackage.UNARY_EXPRESSION: return createunaryExpression();
      case EditorPackage.CASE_EXPRESSION: return createcaseExpression();
      case EditorPackage.WHEN_CLAUSE: return createwhenClause();
      case EditorPackage.ALT_WHEN_CLAUSE: return createaltWhenClause();
      case EditorPackage.ELSE_CLAUSE: return createelseClause();
      case EditorPackage.QUANTIFIED_EXPRESSION: return createquantifiedExpression();
      case EditorPackage.ATOM: return createatom();
      case EditorPackage.PRIMARY_EXPRESSION: return createprimaryExpression();
      case EditorPackage.EXPRESSION_OR_VECTOR: return createexpressionOrVector();
      case EditorPackage.VECTOR_EXPR: return createvectorExpr();
      case EditorPackage.IDENT_PRIMARY: return createidentPrimary();
      case EditorPackage.AGGREGATE: return createaggregate();
      case EditorPackage.COMPOUND_EXPR: return createcompoundExpr();
      case EditorPackage.EXPR_LIST: return createexprList();
      case EditorPackage.SELECT_CAUSE: return createselectCause();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public dataDefinition createdataDefinition()
  {
    dataDefinitionImpl dataDefinition = new dataDefinitionImpl();
    return dataDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration createdeclaration()
  {
    declarationImpl declaration = new declarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fieldDeclaration createfieldDeclaration()
  {
    fieldDeclarationImpl fieldDeclaration = new fieldDeclarationImpl();
    return fieldDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public modifiers createmodifiers()
  {
    modifiersImpl modifiers = new modifiersImpl();
    return modifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fieldType createfieldType()
  {
    fieldTypeImpl fieldType = new fieldTypeImpl();
    return fieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public intEnum createintEnum()
  {
    intEnumImpl intEnum = new intEnumImpl();
    return intEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public charEnum createcharEnum()
  {
    charEnumImpl charEnum = new charEnumImpl();
    return charEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enumValue createenumValue()
  {
    enumValueImpl enumValue = new enumValueImpl();
    return enumValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public charType createcharType()
  {
    charTypeImpl charType = new charTypeImpl();
    return charType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pointer createpointer()
  {
    pointerImpl pointer = new pointerImpl();
    return pointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public setType createsetType()
  {
    setTypeImpl setType = new setTypeImpl();
    return setType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public subFieldDeclaration createsubFieldDeclaration()
  {
    subFieldDeclarationImpl subFieldDeclaration = new subFieldDeclarationImpl();
    return subFieldDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public titleDeclaration createtitleDeclaration()
  {
    titleDeclarationImpl titleDeclaration = new titleDeclarationImpl();
    return titleDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public title createtitle()
  {
    titleImpl title = new titleImpl();
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public includeDeclaration createincludeDeclaration()
  {
    includeDeclarationImpl includeDeclaration = new includeDeclarationImpl();
    return includeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeDeclaration createtypeDeclaration()
  {
    typeDeclarationImpl typeDeclaration = new typeDeclarationImpl();
    return typeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public validationRuleDeclaration createvalidationRuleDeclaration()
  {
    validationRuleDeclarationImpl validationRuleDeclaration = new validationRuleDeclarationImpl();
    return validationRuleDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public comparisonValidationRuleDeclaration createcomparisonValidationRuleDeclaration()
  {
    comparisonValidationRuleDeclarationImpl comparisonValidationRuleDeclaration = new comparisonValidationRuleDeclarationImpl();
    return comparisonValidationRuleDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public comparisonExpression createcomparisonExpression()
  {
    comparisonExpressionImpl comparisonExpression = new comparisonExpressionImpl();
    return comparisonExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public comparisonPart createcomparisonPart()
  {
    comparisonPartImpl comparisonPart = new comparisonPartImpl();
    return comparisonPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public upperFunction createupperFunction()
  {
    upperFunctionImpl upperFunction = new upperFunctionImpl();
    return upperFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public lowerFunction createlowerFunction()
  {
    lowerFunctionImpl lowerFunction = new lowerFunctionImpl();
    return lowerFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rangeValidationRuleDeclaration createrangeValidationRuleDeclaration()
  {
    rangeValidationRuleDeclarationImpl rangeValidationRuleDeclaration = new rangeValidationRuleDeclarationImpl();
    return rangeValidationRuleDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public regexValidationRuleDeclaration createregexValidationRuleDeclaration()
  {
    regexValidationRuleDeclarationImpl regexValidationRuleDeclaration = new regexValidationRuleDeclarationImpl();
    return regexValidationRuleDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public range createrange()
  {
    rangeImpl range = new rangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uniquenessValidationRuleDeclaration createuniquenessValidationRuleDeclaration()
  {
    uniquenessValidationRuleDeclarationImpl uniquenessValidationRuleDeclaration = new uniquenessValidationRuleDeclarationImpl();
    return uniquenessValidationRuleDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public errorMessage createerrorMessage()
  {
    errorMessageImpl errorMessage = new errorMessageImpl();
    return errorMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nativeValidationRuleDeclaration createnativeValidationRuleDeclaration()
  {
    nativeValidationRuleDeclarationImpl nativeValidationRuleDeclaration = new nativeValidationRuleDeclarationImpl();
    return nativeValidationRuleDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionDeclaration createfunctionDeclaration()
  {
    functionDeclarationImpl functionDeclaration = new functionDeclarationImpl();
    return functionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionArgumentDeclaration createfunctionArgumentDeclaration()
  {
    functionArgumentDeclarationImpl functionArgumentDeclaration = new functionArgumentDeclarationImpl();
    return functionArgumentDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionArgumentBody createfunctionArgumentBody()
  {
    functionArgumentBodyImpl functionArgumentBody = new functionArgumentBodyImpl();
    return functionArgumentBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionCall createfunctionCall()
  {
    functionCallImpl functionCall = new functionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionArguments createfunctionArguments()
  {
    functionArgumentsImpl functionArguments = new functionArgumentsImpl();
    return functionArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionBody createfunctionBody()
  {
    functionBodyImpl functionBody = new functionBodyImpl();
    return functionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement createstatement()
  {
    statementImpl statement = new statementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unionRule createunionRule()
  {
    unionRuleImpl unionRule = new unionRuleImpl();
    return unionRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public queryRule createqueryRule()
  {
    queryRuleImpl queryRule = new queryRuleImpl();
    return queryRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public selectFrom createselectFrom()
  {
    selectFromImpl selectFrom = new selectFromImpl();
    return selectFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public selectClause createselectClause()
  {
    selectClauseImpl selectClause = new selectClauseImpl();
    return selectClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public newExpression createnewExpression()
  {
    newExpressionImpl newExpression = new newExpressionImpl();
    return newExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fromClause createfromClause()
  {
    fromClauseImpl fromClause = new fromClauseImpl();
    return fromClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fromJoin createfromJoin()
  {
    fromJoinImpl fromJoin = new fromJoinImpl();
    return fromJoin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public withClause createwithClause()
  {
    withClauseImpl withClause = new withClauseImpl();
    return withClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fromRange createfromRange()
  {
    fromRangeImpl fromRange = new fromRangeImpl();
    return fromRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fromClassOrOuterQueryPath createfromClassOrOuterQueryPath()
  {
    fromClassOrOuterQueryPathImpl fromClassOrOuterQueryPath = new fromClassOrOuterQueryPathImpl();
    return fromClassOrOuterQueryPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public inCollectionElementsDeclaration createinCollectionElementsDeclaration()
  {
    inCollectionElementsDeclarationImpl inCollectionElementsDeclaration = new inCollectionElementsDeclarationImpl();
    return inCollectionElementsDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public asAlias createasAlias()
  {
    asAliasImpl asAlias = new asAliasImpl();
    return asAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public groupByClause creategroupByClause()
  {
    groupByClauseImpl groupByClause = new groupByClauseImpl();
    return groupByClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public orderByClause createorderByClause()
  {
    orderByClauseImpl orderByClause = new orderByClauseImpl();
    return orderByClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public orderElement createorderElement()
  {
    orderElementImpl orderElement = new orderElementImpl();
    return orderElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public havingClause createhavingClause()
  {
    havingClauseImpl havingClause = new havingClauseImpl();
    return havingClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public whereClause createwhereClause()
  {
    whereClauseImpl whereClause = new whereClauseImpl();
    return whereClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public selectedPropertiesList createselectedPropertiesList()
  {
    selectedPropertiesListImpl selectedPropertiesList = new selectedPropertiesListImpl();
    return selectedPropertiesList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aliasedExpression createaliasedExpression()
  {
    aliasedExpressionImpl aliasedExpression = new aliasedExpressionImpl();
    return aliasedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression createexpression()
  {
    expressionImpl expression = new expressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logicalOrExpression createlogicalOrExpression()
  {
    logicalOrExpressionImpl logicalOrExpression = new logicalOrExpressionImpl();
    return logicalOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logicalAndExpression createlogicalAndExpression()
  {
    logicalAndExpressionImpl logicalAndExpression = new logicalAndExpressionImpl();
    return logicalAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public negatedExpression createnegatedExpression()
  {
    negatedExpressionImpl negatedExpression = new negatedExpressionImpl();
    return negatedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public equalityExpression createequalityExpression()
  {
    equalityExpressionImpl equalityExpression = new equalityExpressionImpl();
    return equalityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public relationalExpression createrelationalExpression()
  {
    relationalExpressionImpl relationalExpression = new relationalExpressionImpl();
    return relationalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public likeEscape createlikeEscape()
  {
    likeEscapeImpl likeEscape = new likeEscapeImpl();
    return likeEscape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public betweenList createbetweenList()
  {
    betweenListImpl betweenList = new betweenListImpl();
    return betweenList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public concatenation createconcatenation()
  {
    concatenationImpl concatenation = new concatenationImpl();
    return concatenation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public additiveExpression createadditiveExpression()
  {
    additiveExpressionImpl additiveExpression = new additiveExpressionImpl();
    return additiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public multiplyExpression createmultiplyExpression()
  {
    multiplyExpressionImpl multiplyExpression = new multiplyExpressionImpl();
    return multiplyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unaryExpression createunaryExpression()
  {
    unaryExpressionImpl unaryExpression = new unaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public caseExpression createcaseExpression()
  {
    caseExpressionImpl caseExpression = new caseExpressionImpl();
    return caseExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public whenClause createwhenClause()
  {
    whenClauseImpl whenClause = new whenClauseImpl();
    return whenClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public altWhenClause createaltWhenClause()
  {
    altWhenClauseImpl altWhenClause = new altWhenClauseImpl();
    return altWhenClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public elseClause createelseClause()
  {
    elseClauseImpl elseClause = new elseClauseImpl();
    return elseClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public quantifiedExpression createquantifiedExpression()
  {
    quantifiedExpressionImpl quantifiedExpression = new quantifiedExpressionImpl();
    return quantifiedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public atom createatom()
  {
    atomImpl atom = new atomImpl();
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExpression createprimaryExpression()
  {
    primaryExpressionImpl primaryExpression = new primaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expressionOrVector createexpressionOrVector()
  {
    expressionOrVectorImpl expressionOrVector = new expressionOrVectorImpl();
    return expressionOrVector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public vectorExpr createvectorExpr()
  {
    vectorExprImpl vectorExpr = new vectorExprImpl();
    return vectorExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identPrimary createidentPrimary()
  {
    identPrimaryImpl identPrimary = new identPrimaryImpl();
    return identPrimary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aggregate createaggregate()
  {
    aggregateImpl aggregate = new aggregateImpl();
    return aggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compoundExpr createcompoundExpr()
  {
    compoundExprImpl compoundExpr = new compoundExprImpl();
    return compoundExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exprList createexprList()
  {
    exprListImpl exprList = new exprListImpl();
    return exprList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public selectCause createselectCause()
  {
    selectCauseImpl selectCause = new selectCauseImpl();
    return selectCause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorPackage getEditorPackage()
  {
    return (EditorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EditorPackage getPackage()
  {
    return EditorPackage.eINSTANCE;
  }

} //EditorFactoryImpl
