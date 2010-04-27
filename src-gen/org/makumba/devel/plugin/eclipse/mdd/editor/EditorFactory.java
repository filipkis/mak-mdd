/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage
 * @generated
 */
public interface EditorFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EditorFactory eINSTANCE = org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorFactoryImpl.init();

  /**
   * Returns a new object of class '<em>data Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>data Definition</em>'.
   * @generated
   */
  dataDefinition createdataDefinition();

  /**
   * Returns a new object of class '<em>declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>declaration</em>'.
   * @generated
   */
  declaration createdeclaration();

  /**
   * Returns a new object of class '<em>field Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>field Declaration</em>'.
   * @generated
   */
  fieldDeclaration createfieldDeclaration();

  /**
   * Returns a new object of class '<em>modifiers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>modifiers</em>'.
   * @generated
   */
  modifiers createmodifiers();

  /**
   * Returns a new object of class '<em>field Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>field Type</em>'.
   * @generated
   */
  fieldType createfieldType();

  /**
   * Returns a new object of class '<em>int Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>int Enum</em>'.
   * @generated
   */
  intEnum createintEnum();

  /**
   * Returns a new object of class '<em>char Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>char Enum</em>'.
   * @generated
   */
  charEnum createcharEnum();

  /**
   * Returns a new object of class '<em>enum Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>enum Value</em>'.
   * @generated
   */
  enumValue createenumValue();

  /**
   * Returns a new object of class '<em>char Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>char Type</em>'.
   * @generated
   */
  charType createcharType();

  /**
   * Returns a new object of class '<em>pointer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>pointer</em>'.
   * @generated
   */
  pointer createpointer();

  /**
   * Returns a new object of class '<em>set Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>set Type</em>'.
   * @generated
   */
  setType createsetType();

  /**
   * Returns a new object of class '<em>sub Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>sub Field Declaration</em>'.
   * @generated
   */
  subFieldDeclaration createsubFieldDeclaration();

  /**
   * Returns a new object of class '<em>title Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>title Declaration</em>'.
   * @generated
   */
  titleDeclaration createtitleDeclaration();

  /**
   * Returns a new object of class '<em>title</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>title</em>'.
   * @generated
   */
  title createtitle();

  /**
   * Returns a new object of class '<em>include Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>include Declaration</em>'.
   * @generated
   */
  includeDeclaration createincludeDeclaration();

  /**
   * Returns a new object of class '<em>type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type Declaration</em>'.
   * @generated
   */
  typeDeclaration createtypeDeclaration();

  /**
   * Returns a new object of class '<em>validation Rule Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>validation Rule Declaration</em>'.
   * @generated
   */
  validationRuleDeclaration createvalidationRuleDeclaration();

  /**
   * Returns a new object of class '<em>comparison Validation Rule Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>comparison Validation Rule Declaration</em>'.
   * @generated
   */
  comparisonValidationRuleDeclaration createcomparisonValidationRuleDeclaration();

  /**
   * Returns a new object of class '<em>comparison Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>comparison Expression</em>'.
   * @generated
   */
  comparisonExpression createcomparisonExpression();

  /**
   * Returns a new object of class '<em>comparison Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>comparison Part</em>'.
   * @generated
   */
  comparisonPart createcomparisonPart();

  /**
   * Returns a new object of class '<em>upper Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>upper Function</em>'.
   * @generated
   */
  upperFunction createupperFunction();

  /**
   * Returns a new object of class '<em>lower Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>lower Function</em>'.
   * @generated
   */
  lowerFunction createlowerFunction();

  /**
   * Returns a new object of class '<em>range Validation Rule Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>range Validation Rule Declaration</em>'.
   * @generated
   */
  rangeValidationRuleDeclaration createrangeValidationRuleDeclaration();

  /**
   * Returns a new object of class '<em>regex Validation Rule Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>regex Validation Rule Declaration</em>'.
   * @generated
   */
  regexValidationRuleDeclaration createregexValidationRuleDeclaration();

  /**
   * Returns a new object of class '<em>range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>range</em>'.
   * @generated
   */
  range createrange();

  /**
   * Returns a new object of class '<em>uniqueness Validation Rule Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>uniqueness Validation Rule Declaration</em>'.
   * @generated
   */
  uniquenessValidationRuleDeclaration createuniquenessValidationRuleDeclaration();

  /**
   * Returns a new object of class '<em>error Message</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>error Message</em>'.
   * @generated
   */
  errorMessage createerrorMessage();

  /**
   * Returns a new object of class '<em>native Validation Rule Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>native Validation Rule Declaration</em>'.
   * @generated
   */
  nativeValidationRuleDeclaration createnativeValidationRuleDeclaration();

  /**
   * Returns a new object of class '<em>function Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function Declaration</em>'.
   * @generated
   */
  functionDeclaration createfunctionDeclaration();

  /**
   * Returns a new object of class '<em>function Argument Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function Argument Declaration</em>'.
   * @generated
   */
  functionArgumentDeclaration createfunctionArgumentDeclaration();

  /**
   * Returns a new object of class '<em>function Argument Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function Argument Body</em>'.
   * @generated
   */
  functionArgumentBody createfunctionArgumentBody();

  /**
   * Returns a new object of class '<em>function Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function Call</em>'.
   * @generated
   */
  functionCall createfunctionCall();

  /**
   * Returns a new object of class '<em>function Arguments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function Arguments</em>'.
   * @generated
   */
  functionArguments createfunctionArguments();

  /**
   * Returns a new object of class '<em>function Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function Body</em>'.
   * @generated
   */
  functionBody createfunctionBody();

  /**
   * Returns a new object of class '<em>statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>statement</em>'.
   * @generated
   */
  statement createstatement();

  /**
   * Returns a new object of class '<em>union Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>union Rule</em>'.
   * @generated
   */
  unionRule createunionRule();

  /**
   * Returns a new object of class '<em>query Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>query Rule</em>'.
   * @generated
   */
  queryRule createqueryRule();

  /**
   * Returns a new object of class '<em>select From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>select From</em>'.
   * @generated
   */
  selectFrom createselectFrom();

  /**
   * Returns a new object of class '<em>select Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>select Clause</em>'.
   * @generated
   */
  selectClause createselectClause();

  /**
   * Returns a new object of class '<em>new Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>new Expression</em>'.
   * @generated
   */
  newExpression createnewExpression();

  /**
   * Returns a new object of class '<em>from Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>from Clause</em>'.
   * @generated
   */
  fromClause createfromClause();

  /**
   * Returns a new object of class '<em>from Join</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>from Join</em>'.
   * @generated
   */
  fromJoin createfromJoin();

  /**
   * Returns a new object of class '<em>with Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>with Clause</em>'.
   * @generated
   */
  withClause createwithClause();

  /**
   * Returns a new object of class '<em>from Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>from Range</em>'.
   * @generated
   */
  fromRange createfromRange();

  /**
   * Returns a new object of class '<em>from Class Or Outer Query Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>from Class Or Outer Query Path</em>'.
   * @generated
   */
  fromClassOrOuterQueryPath createfromClassOrOuterQueryPath();

  /**
   * Returns a new object of class '<em>in Collection Elements Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>in Collection Elements Declaration</em>'.
   * @generated
   */
  inCollectionElementsDeclaration createinCollectionElementsDeclaration();

  /**
   * Returns a new object of class '<em>as Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>as Alias</em>'.
   * @generated
   */
  asAlias createasAlias();

  /**
   * Returns a new object of class '<em>group By Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>group By Clause</em>'.
   * @generated
   */
  groupByClause creategroupByClause();

  /**
   * Returns a new object of class '<em>order By Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>order By Clause</em>'.
   * @generated
   */
  orderByClause createorderByClause();

  /**
   * Returns a new object of class '<em>order Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>order Element</em>'.
   * @generated
   */
  orderElement createorderElement();

  /**
   * Returns a new object of class '<em>having Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>having Clause</em>'.
   * @generated
   */
  havingClause createhavingClause();

  /**
   * Returns a new object of class '<em>where Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>where Clause</em>'.
   * @generated
   */
  whereClause createwhereClause();

  /**
   * Returns a new object of class '<em>selected Properties List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>selected Properties List</em>'.
   * @generated
   */
  selectedPropertiesList createselectedPropertiesList();

  /**
   * Returns a new object of class '<em>aliased Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>aliased Expression</em>'.
   * @generated
   */
  aliasedExpression createaliasedExpression();

  /**
   * Returns a new object of class '<em>expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression</em>'.
   * @generated
   */
  expression createexpression();

  /**
   * Returns a new object of class '<em>logical Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>logical Or Expression</em>'.
   * @generated
   */
  logicalOrExpression createlogicalOrExpression();

  /**
   * Returns a new object of class '<em>logical And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>logical And Expression</em>'.
   * @generated
   */
  logicalAndExpression createlogicalAndExpression();

  /**
   * Returns a new object of class '<em>negated Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>negated Expression</em>'.
   * @generated
   */
  negatedExpression createnegatedExpression();

  /**
   * Returns a new object of class '<em>equality Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>equality Expression</em>'.
   * @generated
   */
  equalityExpression createequalityExpression();

  /**
   * Returns a new object of class '<em>relational Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>relational Expression</em>'.
   * @generated
   */
  relationalExpression createrelationalExpression();

  /**
   * Returns a new object of class '<em>like Escape</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>like Escape</em>'.
   * @generated
   */
  likeEscape createlikeEscape();

  /**
   * Returns a new object of class '<em>between List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>between List</em>'.
   * @generated
   */
  betweenList createbetweenList();

  /**
   * Returns a new object of class '<em>concatenation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>concatenation</em>'.
   * @generated
   */
  concatenation createconcatenation();

  /**
   * Returns a new object of class '<em>additive Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>additive Expression</em>'.
   * @generated
   */
  additiveExpression createadditiveExpression();

  /**
   * Returns a new object of class '<em>multiply Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>multiply Expression</em>'.
   * @generated
   */
  multiplyExpression createmultiplyExpression();

  /**
   * Returns a new object of class '<em>unary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>unary Expression</em>'.
   * @generated
   */
  unaryExpression createunaryExpression();

  /**
   * Returns a new object of class '<em>case Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>case Expression</em>'.
   * @generated
   */
  caseExpression createcaseExpression();

  /**
   * Returns a new object of class '<em>when Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>when Clause</em>'.
   * @generated
   */
  whenClause createwhenClause();

  /**
   * Returns a new object of class '<em>alt When Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>alt When Clause</em>'.
   * @generated
   */
  altWhenClause createaltWhenClause();

  /**
   * Returns a new object of class '<em>else Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>else Clause</em>'.
   * @generated
   */
  elseClause createelseClause();

  /**
   * Returns a new object of class '<em>quantified Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>quantified Expression</em>'.
   * @generated
   */
  quantifiedExpression createquantifiedExpression();

  /**
   * Returns a new object of class '<em>atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>atom</em>'.
   * @generated
   */
  atom createatom();

  /**
   * Returns a new object of class '<em>primary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>primary Expression</em>'.
   * @generated
   */
  primaryExpression createprimaryExpression();

  /**
   * Returns a new object of class '<em>expression Or Vector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression Or Vector</em>'.
   * @generated
   */
  expressionOrVector createexpressionOrVector();

  /**
   * Returns a new object of class '<em>vector Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>vector Expr</em>'.
   * @generated
   */
  vectorExpr createvectorExpr();

  /**
   * Returns a new object of class '<em>ident Primary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ident Primary</em>'.
   * @generated
   */
  identPrimary createidentPrimary();

  /**
   * Returns a new object of class '<em>aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>aggregate</em>'.
   * @generated
   */
  aggregate createaggregate();

  /**
   * Returns a new object of class '<em>compound Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>compound Expr</em>'.
   * @generated
   */
  compoundExpr createcompoundExpr();

  /**
   * Returns a new object of class '<em>expr List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expr List</em>'.
   * @generated
   */
  exprList createexprList();

  /**
   * Returns a new object of class '<em>select Cause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>select Cause</em>'.
   * @generated
   */
  selectCause createselectCause();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EditorPackage getEditorPackage();

} //EditorFactory
