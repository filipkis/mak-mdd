/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.makumba.devel.plugin.eclipse.mdd.editor.EditorFactory;
import org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage;
import org.makumba.devel.plugin.eclipse.mdd.editor.additiveExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.aggregate;
import org.makumba.devel.plugin.eclipse.mdd.editor.aliasedExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.altWhenClause;
import org.makumba.devel.plugin.eclipse.mdd.editor.asAlias;
import org.makumba.devel.plugin.eclipse.mdd.editor.atom;
import org.makumba.devel.plugin.eclipse.mdd.editor.betweenList;
import org.makumba.devel.plugin.eclipse.mdd.editor.caseExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.charEnum;
import org.makumba.devel.plugin.eclipse.mdd.editor.charType;
import org.makumba.devel.plugin.eclipse.mdd.editor.comparisonExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart;
import org.makumba.devel.plugin.eclipse.mdd.editor.comparisonValidationRuleDeclaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.compoundExpr;
import org.makumba.devel.plugin.eclipse.mdd.editor.concatenation;
import org.makumba.devel.plugin.eclipse.mdd.editor.dataDefinition;
import org.makumba.devel.plugin.eclipse.mdd.editor.declaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.elseClause;
import org.makumba.devel.plugin.eclipse.mdd.editor.enumValue;
import org.makumba.devel.plugin.eclipse.mdd.editor.equalityExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.errorMessage;
import org.makumba.devel.plugin.eclipse.mdd.editor.exprList;
import org.makumba.devel.plugin.eclipse.mdd.editor.expression;
import org.makumba.devel.plugin.eclipse.mdd.editor.expressionOrVector;
import org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.fieldType;
import org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath;
import org.makumba.devel.plugin.eclipse.mdd.editor.fromClause;
import org.makumba.devel.plugin.eclipse.mdd.editor.fromJoin;
import org.makumba.devel.plugin.eclipse.mdd.editor.fromRange;
import org.makumba.devel.plugin.eclipse.mdd.editor.functionArgumentBody;
import org.makumba.devel.plugin.eclipse.mdd.editor.functionArgumentDeclaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.functionArguments;
import org.makumba.devel.plugin.eclipse.mdd.editor.functionBody;
import org.makumba.devel.plugin.eclipse.mdd.editor.functionCall;
import org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.groupByClause;
import org.makumba.devel.plugin.eclipse.mdd.editor.havingClause;
import org.makumba.devel.plugin.eclipse.mdd.editor.identPrimary;
import org.makumba.devel.plugin.eclipse.mdd.editor.inCollectionElementsDeclaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.includeDeclaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.intEnum;
import org.makumba.devel.plugin.eclipse.mdd.editor.likeEscape;
import org.makumba.devel.plugin.eclipse.mdd.editor.logicalAndExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.logicalOrExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.lowerFunction;
import org.makumba.devel.plugin.eclipse.mdd.editor.modifiers;
import org.makumba.devel.plugin.eclipse.mdd.editor.multiplyExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.nativeValidationRuleDeclaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.negatedExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.newExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.orderByClause;
import org.makumba.devel.plugin.eclipse.mdd.editor.orderElement;
import org.makumba.devel.plugin.eclipse.mdd.editor.pointer;
import org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.quantifiedExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.queryRule;
import org.makumba.devel.plugin.eclipse.mdd.editor.range;
import org.makumba.devel.plugin.eclipse.mdd.editor.rangeValidationRuleDeclaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.regexValidationRuleDeclaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.relationalExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.selectCause;
import org.makumba.devel.plugin.eclipse.mdd.editor.selectClause;
import org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom;
import org.makumba.devel.plugin.eclipse.mdd.editor.selectedPropertiesList;
import org.makumba.devel.plugin.eclipse.mdd.editor.setType;
import org.makumba.devel.plugin.eclipse.mdd.editor.statement;
import org.makumba.devel.plugin.eclipse.mdd.editor.subFieldDeclaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.title;
import org.makumba.devel.plugin.eclipse.mdd.editor.titleDeclaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.typeDeclaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.unaryExpression;
import org.makumba.devel.plugin.eclipse.mdd.editor.unionRule;
import org.makumba.devel.plugin.eclipse.mdd.editor.uniquenessValidationRuleDeclaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.upperFunction;
import org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration;
import org.makumba.devel.plugin.eclipse.mdd.editor.vectorExpr;
import org.makumba.devel.plugin.eclipse.mdd.editor.whenClause;
import org.makumba.devel.plugin.eclipse.mdd.editor.whereClause;
import org.makumba.devel.plugin.eclipse.mdd.editor.withClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditorPackageImpl extends EPackageImpl implements EditorPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modifiersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intEnumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass charEnumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass charTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subFieldDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass titleDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass titleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass validationRuleDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparisonValidationRuleDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparisonExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparisonPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass upperFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lowerFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeValidationRuleDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regexValidationRuleDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uniquenessValidationRuleDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass errorMessageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nativeValidationRuleDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionArgumentDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionArgumentBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionArgumentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unionRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass queryRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectFromEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fromClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fromJoinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass withClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fromRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fromClassOrOuterQueryPathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inCollectionElementsDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asAliasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupByClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderByClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass havingClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whereClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectedPropertiesListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aliasedExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalOrExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalAndExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negatedExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalityExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass likeEscapeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass betweenListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass concatenationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additiveExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplyExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass altWhenClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elseClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantifiedExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionOrVectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vectorExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identPrimaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compoundExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectCauseEClass = null;

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
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EditorPackageImpl()
  {
    super(eNS_URI, EditorFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link EditorPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EditorPackage init()
  {
    if (isInited) return (EditorPackage)EPackage.Registry.INSTANCE.getEPackage(EditorPackage.eNS_URI);

    // Obtain or create and register package
    EditorPackageImpl theEditorPackage = (EditorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EditorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EditorPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEditorPackage.createPackageContents();

    // Initialize created meta-data
    theEditorPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEditorPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EditorPackage.eNS_URI, theEditorPackage);
    return theEditorPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdataDefinition()
  {
    return dataDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdataDefinition_D()
  {
    return (EReference)dataDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdeclaration()
  {
    return declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfieldDeclaration()
  {
    return fieldDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfieldDeclaration_Name()
  {
    return (EAttribute)fieldDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfieldDeclaration_Modifiers()
  {
    return (EReference)fieldDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfieldDeclaration_Typedef()
  {
    return (EReference)fieldDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmodifiers()
  {
    return modifiersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmodifiers_Unique()
  {
    return (EAttribute)modifiersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmodifiers_Fixed()
  {
    return (EAttribute)modifiersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmodifiers_NotNull()
  {
    return (EAttribute)modifiersEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmodifiers_NotEmpty()
  {
    return (EAttribute)modifiersEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfieldType()
  {
    return fieldTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfieldType_Type()
  {
    return (EAttribute)fieldTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfieldType_TypeDec()
  {
    return (EReference)fieldTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getintEnum()
  {
    return intEnumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getintEnum_Values()
  {
    return (EReference)intEnumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcharEnum()
  {
    return charEnumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcharEnum_Values()
  {
    return (EAttribute)charEnumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getenumValue()
  {
    return enumValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getenumValue_Name()
  {
    return (EAttribute)enumValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getenumValue_Value()
  {
    return (EAttribute)enumValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcharType()
  {
    return charTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcharType_Length()
  {
    return (EAttribute)charTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpointer()
  {
    return pointerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsetType()
  {
    return setTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsubFieldDeclaration()
  {
    return subFieldDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsubFieldDeclaration_SubFieldOf()
  {
    return (EReference)subFieldDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsubFieldDeclaration_D()
  {
    return (EReference)subFieldDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettitleDeclaration()
  {
    return titleDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettitleDeclaration_Title()
  {
    return (EReference)titleDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettitle()
  {
    return titleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettitle_Name()
  {
    return (EAttribute)titleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getincludeDeclaration()
  {
    return includeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getincludeDeclaration_ImportedNamespace()
  {
    return (EAttribute)includeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettypeDeclaration()
  {
    return typeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettypeDeclaration_Name()
  {
    return (EAttribute)typeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettypeDeclaration_FieldType()
  {
    return (EReference)typeDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvalidationRuleDeclaration()
  {
    return validationRuleDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvalidationRuleDeclaration_ErrorMessage()
  {
    return (EReference)validationRuleDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvalidationRuleDeclaration_Name()
  {
    return (EAttribute)validationRuleDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvalidationRuleDeclaration_Args()
  {
    return (EReference)validationRuleDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcomparisonValidationRuleDeclaration()
  {
    return comparisonValidationRuleDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcomparisonValidationRuleDeclaration_ComparisonExp()
  {
    return (EReference)comparisonValidationRuleDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcomparisonExpression()
  {
    return comparisonExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcomparisonExpression_Lhs()
  {
    return (EReference)comparisonExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcomparisonExpression_O()
  {
    return (EAttribute)comparisonExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcomparisonExpression_Rhs()
  {
    return (EReference)comparisonExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcomparisonPart()
  {
    return comparisonPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcomparisonPart_T()
  {
    return (EAttribute)comparisonPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcomparisonPart_N()
  {
    return (EAttribute)comparisonPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcomparisonPart_Df()
  {
    return (EAttribute)comparisonPartEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcomparisonPart_U()
  {
    return (EReference)comparisonPartEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcomparisonPart_L()
  {
    return (EReference)comparisonPartEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcomparisonPart_D()
  {
    return (EAttribute)comparisonPartEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getupperFunction()
  {
    return upperFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getupperFunction_T()
  {
    return (EAttribute)upperFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlowerFunction()
  {
    return lowerFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlowerFunction_T()
  {
    return (EAttribute)lowerFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrangeValidationRuleDeclaration()
  {
    return rangeValidationRuleDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrangeValidationRuleDeclaration_Range()
  {
    return (EReference)rangeValidationRuleDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getregexValidationRuleDeclaration()
  {
    return regexValidationRuleDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getregexValidationRuleDeclaration_Exp()
  {
    return (EAttribute)regexValidationRuleDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrange()
  {
    return rangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrange_F()
  {
    return (EAttribute)rangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrange_T()
  {
    return (EAttribute)rangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getuniquenessValidationRuleDeclaration()
  {
    return uniquenessValidationRuleDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass geterrorMessage()
  {
    return errorMessageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute geterrorMessage_Message()
  {
    return (EAttribute)errorMessageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnativeValidationRuleDeclaration()
  {
    return nativeValidationRuleDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getnativeValidationRuleDeclaration_Field()
  {
    return (EReference)nativeValidationRuleDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnativeValidationRuleDeclaration_Type()
  {
    return (EAttribute)nativeValidationRuleDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnativeValidationRuleDeclaration_Message()
  {
    return (EAttribute)nativeValidationRuleDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunctionDeclaration()
  {
    return functionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfunctionDeclaration_B()
  {
    return (EAttribute)functionDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfunctionDeclaration_Name()
  {
    return (EAttribute)functionDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunctionDeclaration_Arg()
  {
    return (EReference)functionDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunctionDeclaration_Body()
  {
    return (EReference)functionDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunctionDeclaration_M()
  {
    return (EReference)functionDeclarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunctionArgumentDeclaration()
  {
    return functionArgumentDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunctionArgumentDeclaration_F()
  {
    return (EReference)functionArgumentDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunctionArgumentBody()
  {
    return functionArgumentBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfunctionArgumentBody_Name()
  {
    return (EAttribute)functionArgumentBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunctionCall()
  {
    return functionCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunctionCall_F()
  {
    return (EReference)functionCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunctionArguments()
  {
    return functionArgumentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfunctionArguments_A()
  {
    return (EAttribute)functionArgumentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunctionBody()
  {
    return functionBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunctionBody_S()
  {
    return (EReference)functionBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunctionBody_E()
  {
    return (EReference)functionBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getunionRule()
  {
    return unionRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunionRule_Q()
  {
    return (EReference)unionRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getqueryRule()
  {
    return queryRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getselectFrom()
  {
    return selectFromEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getselectFrom_Where()
  {
    return (EReference)selectFromEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getselectFrom_GroupBy()
  {
    return (EReference)selectFromEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getselectFrom_OrderBy()
  {
    return (EReference)selectFromEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getselectFrom_S()
  {
    return (EReference)selectFromEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getselectFrom_From()
  {
    return (EReference)selectFromEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getselectClause()
  {
    return selectClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnewExpression()
  {
    return newExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnewExpression_P()
  {
    return (EAttribute)newExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getnewExpression_S()
  {
    return (EReference)newExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfromClause()
  {
    return fromClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfromClause_FromRange()
  {
    return (EReference)fromClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfromClause_FromJoin()
  {
    return (EReference)fromClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfromJoin()
  {
    return fromJoinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getwithClause()
  {
    return withClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwithClause_E()
  {
    return (EReference)withClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfromRange()
  {
    return fromRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfromRange_Alias()
  {
    return (EAttribute)fromRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfromRange_P()
  {
    return (EAttribute)fromRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfromClassOrOuterQueryPath()
  {
    return fromClassOrOuterQueryPathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfromClassOrOuterQueryPath_W()
  {
    return (EReference)fromClassOrOuterQueryPathEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfromClassOrOuterQueryPath_AsAlias()
  {
    return (EReference)fromClassOrOuterQueryPathEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfromClassOrOuterQueryPath_PropertyFetch()
  {
    return (EAttribute)fromClassOrOuterQueryPathEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinCollectionElementsDeclaration()
  {
    return inCollectionElementsDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getasAlias()
  {
    return asAliasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getasAlias_Alias()
  {
    return (EAttribute)asAliasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgroupByClause()
  {
    return groupByClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgroupByClause_E()
  {
    return (EReference)groupByClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgroupByClause_H()
  {
    return (EReference)groupByClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getorderByClause()
  {
    return orderByClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getorderByClause_O()
  {
    return (EReference)orderByClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getorderElement()
  {
    return orderElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gethavingClause()
  {
    return havingClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gethavingClause_E()
  {
    return (EReference)havingClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getwhereClause()
  {
    return whereClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwhereClause_E()
  {
    return (EReference)whereClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getselectedPropertiesList()
  {
    return selectedPropertiesListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getselectedPropertiesList_A()
  {
    return (EReference)selectedPropertiesListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaliasedExpression()
  {
    return aliasedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getexpression_Id()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_V()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlogicalOrExpression()
  {
    return logicalOrExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlogicalOrExpression_L()
  {
    return (EReference)logicalOrExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlogicalAndExpression()
  {
    return logicalAndExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlogicalAndExpression_N()
  {
    return (EReference)logicalAndExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnegatedExpression()
  {
    return negatedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getnegatedExpression_N()
  {
    return (EReference)negatedExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getequalityExpression()
  {
    return equalityExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getequalityExpression_R()
  {
    return (EReference)equalityExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrelationalExpression()
  {
    return relationalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlikeEscape()
  {
    return likeEscapeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlikeEscape_C()
  {
    return (EReference)likeEscapeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbetweenList()
  {
    return betweenListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbetweenList_C()
  {
    return (EReference)betweenListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconcatenation()
  {
    return concatenationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconcatenation_A()
  {
    return (EReference)concatenationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconcatenation_I()
  {
    return (EReference)concatenationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconcatenation_B()
  {
    return (EReference)concatenationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconcatenation_C()
  {
    return (EReference)concatenationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconcatenation_L()
  {
    return (EReference)concatenationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconcatenation_P()
  {
    return (EAttribute)concatenationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getadditiveExpression()
  {
    return additiveExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getadditiveExpression_M()
  {
    return (EReference)additiveExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmultiplyExpression()
  {
    return multiplyExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmultiplyExpression_U()
  {
    return (EReference)multiplyExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getunaryExpression()
  {
    return unaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunaryExpression_U()
  {
    return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcaseExpression()
  {
    return caseExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcaseExpression_W()
  {
    return (EReference)caseExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcaseExpression_E()
  {
    return (EReference)caseExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcaseExpression_A()
  {
    return (EReference)caseExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getwhenClause()
  {
    return whenClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwhenClause_WhenExpr()
  {
    return (EReference)whenClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwhenClause_ThenExpr()
  {
    return (EReference)whenClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaltWhenClause()
  {
    return altWhenClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getaltWhenClause_W()
  {
    return (EReference)altWhenClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getaltWhenClause_T()
  {
    return (EReference)altWhenClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getelseClause()
  {
    return elseClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getelseClause_U()
  {
    return (EReference)elseClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getquantifiedExpression()
  {
    return quantifiedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getquantifiedExpression_S()
  {
    return (EReference)quantifiedExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getatom()
  {
    return atomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getprimaryExpression()
  {
    return primaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprimaryExpression_E()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprimaryExpression_Exp()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprimaryExpression_Ident()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprimaryExpression_S()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexpressionOrVector()
  {
    return expressionOrVectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvectorExpr()
  {
    return vectorExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvectorExpr_E()
  {
    return (EReference)vectorExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getidentPrimary()
  {
    return identPrimaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getidentPrimary_E()
  {
    return (EReference)identPrimaryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaggregate()
  {
    return aggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getaggregate_A()
  {
    return (EReference)aggregateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcompoundExpr()
  {
    return compoundExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcompoundExpr_E()
  {
    return (EReference)compoundExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcompoundExpr_S()
  {
    return (EReference)compoundExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexprList()
  {
    return exprListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexprList_E()
  {
    return (EReference)exprListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getexprList_Id()
  {
    return (EAttribute)exprListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getselectCause()
  {
    return selectCauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getselectCause_S()
  {
    return (EReference)selectCauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getselectCause_N()
  {
    return (EReference)selectCauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorFactory getEditorFactory()
  {
    return (EditorFactory)getEFactoryInstance();
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
    dataDefinitionEClass = createEClass(DATA_DEFINITION);
    createEReference(dataDefinitionEClass, DATA_DEFINITION__D);

    declarationEClass = createEClass(DECLARATION);

    fieldDeclarationEClass = createEClass(FIELD_DECLARATION);
    createEAttribute(fieldDeclarationEClass, FIELD_DECLARATION__NAME);
    createEReference(fieldDeclarationEClass, FIELD_DECLARATION__MODIFIERS);
    createEReference(fieldDeclarationEClass, FIELD_DECLARATION__TYPEDEF);

    modifiersEClass = createEClass(MODIFIERS);
    createEAttribute(modifiersEClass, MODIFIERS__UNIQUE);
    createEAttribute(modifiersEClass, MODIFIERS__FIXED);
    createEAttribute(modifiersEClass, MODIFIERS__NOT_NULL);
    createEAttribute(modifiersEClass, MODIFIERS__NOT_EMPTY);

    fieldTypeEClass = createEClass(FIELD_TYPE);
    createEAttribute(fieldTypeEClass, FIELD_TYPE__TYPE);
    createEReference(fieldTypeEClass, FIELD_TYPE__TYPE_DEC);

    intEnumEClass = createEClass(INT_ENUM);
    createEReference(intEnumEClass, INT_ENUM__VALUES);

    charEnumEClass = createEClass(CHAR_ENUM);
    createEAttribute(charEnumEClass, CHAR_ENUM__VALUES);

    enumValueEClass = createEClass(ENUM_VALUE);
    createEAttribute(enumValueEClass, ENUM_VALUE__NAME);
    createEAttribute(enumValueEClass, ENUM_VALUE__VALUE);

    charTypeEClass = createEClass(CHAR_TYPE);
    createEAttribute(charTypeEClass, CHAR_TYPE__LENGTH);

    pointerEClass = createEClass(POINTER);

    setTypeEClass = createEClass(SET_TYPE);

    subFieldDeclarationEClass = createEClass(SUB_FIELD_DECLARATION);
    createEReference(subFieldDeclarationEClass, SUB_FIELD_DECLARATION__SUB_FIELD_OF);
    createEReference(subFieldDeclarationEClass, SUB_FIELD_DECLARATION__D);

    titleDeclarationEClass = createEClass(TITLE_DECLARATION);
    createEReference(titleDeclarationEClass, TITLE_DECLARATION__TITLE);

    titleEClass = createEClass(TITLE);
    createEAttribute(titleEClass, TITLE__NAME);

    includeDeclarationEClass = createEClass(INCLUDE_DECLARATION);
    createEAttribute(includeDeclarationEClass, INCLUDE_DECLARATION__IMPORTED_NAMESPACE);

    typeDeclarationEClass = createEClass(TYPE_DECLARATION);
    createEAttribute(typeDeclarationEClass, TYPE_DECLARATION__NAME);
    createEReference(typeDeclarationEClass, TYPE_DECLARATION__FIELD_TYPE);

    validationRuleDeclarationEClass = createEClass(VALIDATION_RULE_DECLARATION);
    createEReference(validationRuleDeclarationEClass, VALIDATION_RULE_DECLARATION__ERROR_MESSAGE);
    createEAttribute(validationRuleDeclarationEClass, VALIDATION_RULE_DECLARATION__NAME);
    createEReference(validationRuleDeclarationEClass, VALIDATION_RULE_DECLARATION__ARGS);

    comparisonValidationRuleDeclarationEClass = createEClass(COMPARISON_VALIDATION_RULE_DECLARATION);
    createEReference(comparisonValidationRuleDeclarationEClass, COMPARISON_VALIDATION_RULE_DECLARATION__COMPARISON_EXP);

    comparisonExpressionEClass = createEClass(COMPARISON_EXPRESSION);
    createEReference(comparisonExpressionEClass, COMPARISON_EXPRESSION__LHS);
    createEAttribute(comparisonExpressionEClass, COMPARISON_EXPRESSION__O);
    createEReference(comparisonExpressionEClass, COMPARISON_EXPRESSION__RHS);

    comparisonPartEClass = createEClass(COMPARISON_PART);
    createEAttribute(comparisonPartEClass, COMPARISON_PART__T);
    createEAttribute(comparisonPartEClass, COMPARISON_PART__N);
    createEAttribute(comparisonPartEClass, COMPARISON_PART__DF);
    createEReference(comparisonPartEClass, COMPARISON_PART__U);
    createEReference(comparisonPartEClass, COMPARISON_PART__L);
    createEAttribute(comparisonPartEClass, COMPARISON_PART__D);

    upperFunctionEClass = createEClass(UPPER_FUNCTION);
    createEAttribute(upperFunctionEClass, UPPER_FUNCTION__T);

    lowerFunctionEClass = createEClass(LOWER_FUNCTION);
    createEAttribute(lowerFunctionEClass, LOWER_FUNCTION__T);

    rangeValidationRuleDeclarationEClass = createEClass(RANGE_VALIDATION_RULE_DECLARATION);
    createEReference(rangeValidationRuleDeclarationEClass, RANGE_VALIDATION_RULE_DECLARATION__RANGE);

    regexValidationRuleDeclarationEClass = createEClass(REGEX_VALIDATION_RULE_DECLARATION);
    createEAttribute(regexValidationRuleDeclarationEClass, REGEX_VALIDATION_RULE_DECLARATION__EXP);

    rangeEClass = createEClass(RANGE);
    createEAttribute(rangeEClass, RANGE__F);
    createEAttribute(rangeEClass, RANGE__T);

    uniquenessValidationRuleDeclarationEClass = createEClass(UNIQUENESS_VALIDATION_RULE_DECLARATION);

    errorMessageEClass = createEClass(ERROR_MESSAGE);
    createEAttribute(errorMessageEClass, ERROR_MESSAGE__MESSAGE);

    nativeValidationRuleDeclarationEClass = createEClass(NATIVE_VALIDATION_RULE_DECLARATION);
    createEReference(nativeValidationRuleDeclarationEClass, NATIVE_VALIDATION_RULE_DECLARATION__FIELD);
    createEAttribute(nativeValidationRuleDeclarationEClass, NATIVE_VALIDATION_RULE_DECLARATION__TYPE);
    createEAttribute(nativeValidationRuleDeclarationEClass, NATIVE_VALIDATION_RULE_DECLARATION__MESSAGE);

    functionDeclarationEClass = createEClass(FUNCTION_DECLARATION);
    createEAttribute(functionDeclarationEClass, FUNCTION_DECLARATION__B);
    createEAttribute(functionDeclarationEClass, FUNCTION_DECLARATION__NAME);
    createEReference(functionDeclarationEClass, FUNCTION_DECLARATION__ARG);
    createEReference(functionDeclarationEClass, FUNCTION_DECLARATION__BODY);
    createEReference(functionDeclarationEClass, FUNCTION_DECLARATION__M);

    functionArgumentDeclarationEClass = createEClass(FUNCTION_ARGUMENT_DECLARATION);
    createEReference(functionArgumentDeclarationEClass, FUNCTION_ARGUMENT_DECLARATION__F);

    functionArgumentBodyEClass = createEClass(FUNCTION_ARGUMENT_BODY);
    createEAttribute(functionArgumentBodyEClass, FUNCTION_ARGUMENT_BODY__NAME);

    functionCallEClass = createEClass(FUNCTION_CALL);
    createEReference(functionCallEClass, FUNCTION_CALL__F);

    functionArgumentsEClass = createEClass(FUNCTION_ARGUMENTS);
    createEAttribute(functionArgumentsEClass, FUNCTION_ARGUMENTS__A);

    functionBodyEClass = createEClass(FUNCTION_BODY);
    createEReference(functionBodyEClass, FUNCTION_BODY__S);
    createEReference(functionBodyEClass, FUNCTION_BODY__E);

    statementEClass = createEClass(STATEMENT);

    unionRuleEClass = createEClass(UNION_RULE);
    createEReference(unionRuleEClass, UNION_RULE__Q);

    queryRuleEClass = createEClass(QUERY_RULE);

    selectFromEClass = createEClass(SELECT_FROM);
    createEReference(selectFromEClass, SELECT_FROM__WHERE);
    createEReference(selectFromEClass, SELECT_FROM__GROUP_BY);
    createEReference(selectFromEClass, SELECT_FROM__ORDER_BY);
    createEReference(selectFromEClass, SELECT_FROM__S);
    createEReference(selectFromEClass, SELECT_FROM__FROM);

    selectClauseEClass = createEClass(SELECT_CLAUSE);

    newExpressionEClass = createEClass(NEW_EXPRESSION);
    createEAttribute(newExpressionEClass, NEW_EXPRESSION__P);
    createEReference(newExpressionEClass, NEW_EXPRESSION__S);

    fromClauseEClass = createEClass(FROM_CLAUSE);
    createEReference(fromClauseEClass, FROM_CLAUSE__FROM_RANGE);
    createEReference(fromClauseEClass, FROM_CLAUSE__FROM_JOIN);

    fromJoinEClass = createEClass(FROM_JOIN);

    withClauseEClass = createEClass(WITH_CLAUSE);
    createEReference(withClauseEClass, WITH_CLAUSE__E);

    fromRangeEClass = createEClass(FROM_RANGE);
    createEAttribute(fromRangeEClass, FROM_RANGE__ALIAS);
    createEAttribute(fromRangeEClass, FROM_RANGE__P);

    fromClassOrOuterQueryPathEClass = createEClass(FROM_CLASS_OR_OUTER_QUERY_PATH);
    createEReference(fromClassOrOuterQueryPathEClass, FROM_CLASS_OR_OUTER_QUERY_PATH__W);
    createEReference(fromClassOrOuterQueryPathEClass, FROM_CLASS_OR_OUTER_QUERY_PATH__AS_ALIAS);
    createEAttribute(fromClassOrOuterQueryPathEClass, FROM_CLASS_OR_OUTER_QUERY_PATH__PROPERTY_FETCH);

    inCollectionElementsDeclarationEClass = createEClass(IN_COLLECTION_ELEMENTS_DECLARATION);

    asAliasEClass = createEClass(AS_ALIAS);
    createEAttribute(asAliasEClass, AS_ALIAS__ALIAS);

    groupByClauseEClass = createEClass(GROUP_BY_CLAUSE);
    createEReference(groupByClauseEClass, GROUP_BY_CLAUSE__E);
    createEReference(groupByClauseEClass, GROUP_BY_CLAUSE__H);

    orderByClauseEClass = createEClass(ORDER_BY_CLAUSE);
    createEReference(orderByClauseEClass, ORDER_BY_CLAUSE__O);

    orderElementEClass = createEClass(ORDER_ELEMENT);

    havingClauseEClass = createEClass(HAVING_CLAUSE);
    createEReference(havingClauseEClass, HAVING_CLAUSE__E);

    whereClauseEClass = createEClass(WHERE_CLAUSE);
    createEReference(whereClauseEClass, WHERE_CLAUSE__E);

    selectedPropertiesListEClass = createEClass(SELECTED_PROPERTIES_LIST);
    createEReference(selectedPropertiesListEClass, SELECTED_PROPERTIES_LIST__A);

    aliasedExpressionEClass = createEClass(ALIASED_EXPRESSION);

    expressionEClass = createEClass(EXPRESSION);
    createEAttribute(expressionEClass, EXPRESSION__ID);
    createEReference(expressionEClass, EXPRESSION__V);

    logicalOrExpressionEClass = createEClass(LOGICAL_OR_EXPRESSION);
    createEReference(logicalOrExpressionEClass, LOGICAL_OR_EXPRESSION__L);

    logicalAndExpressionEClass = createEClass(LOGICAL_AND_EXPRESSION);
    createEReference(logicalAndExpressionEClass, LOGICAL_AND_EXPRESSION__N);

    negatedExpressionEClass = createEClass(NEGATED_EXPRESSION);
    createEReference(negatedExpressionEClass, NEGATED_EXPRESSION__N);

    equalityExpressionEClass = createEClass(EQUALITY_EXPRESSION);
    createEReference(equalityExpressionEClass, EQUALITY_EXPRESSION__R);

    relationalExpressionEClass = createEClass(RELATIONAL_EXPRESSION);

    likeEscapeEClass = createEClass(LIKE_ESCAPE);
    createEReference(likeEscapeEClass, LIKE_ESCAPE__C);

    betweenListEClass = createEClass(BETWEEN_LIST);
    createEReference(betweenListEClass, BETWEEN_LIST__C);

    concatenationEClass = createEClass(CONCATENATION);
    createEReference(concatenationEClass, CONCATENATION__A);
    createEReference(concatenationEClass, CONCATENATION__I);
    createEReference(concatenationEClass, CONCATENATION__B);
    createEReference(concatenationEClass, CONCATENATION__C);
    createEReference(concatenationEClass, CONCATENATION__L);
    createEAttribute(concatenationEClass, CONCATENATION__P);

    additiveExpressionEClass = createEClass(ADDITIVE_EXPRESSION);
    createEReference(additiveExpressionEClass, ADDITIVE_EXPRESSION__M);

    multiplyExpressionEClass = createEClass(MULTIPLY_EXPRESSION);
    createEReference(multiplyExpressionEClass, MULTIPLY_EXPRESSION__U);

    unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
    createEReference(unaryExpressionEClass, UNARY_EXPRESSION__U);

    caseExpressionEClass = createEClass(CASE_EXPRESSION);
    createEReference(caseExpressionEClass, CASE_EXPRESSION__W);
    createEReference(caseExpressionEClass, CASE_EXPRESSION__E);
    createEReference(caseExpressionEClass, CASE_EXPRESSION__A);

    whenClauseEClass = createEClass(WHEN_CLAUSE);
    createEReference(whenClauseEClass, WHEN_CLAUSE__WHEN_EXPR);
    createEReference(whenClauseEClass, WHEN_CLAUSE__THEN_EXPR);

    altWhenClauseEClass = createEClass(ALT_WHEN_CLAUSE);
    createEReference(altWhenClauseEClass, ALT_WHEN_CLAUSE__W);
    createEReference(altWhenClauseEClass, ALT_WHEN_CLAUSE__T);

    elseClauseEClass = createEClass(ELSE_CLAUSE);
    createEReference(elseClauseEClass, ELSE_CLAUSE__U);

    quantifiedExpressionEClass = createEClass(QUANTIFIED_EXPRESSION);
    createEReference(quantifiedExpressionEClass, QUANTIFIED_EXPRESSION__S);

    atomEClass = createEClass(ATOM);

    primaryExpressionEClass = createEClass(PRIMARY_EXPRESSION);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__E);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__EXP);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__IDENT);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__S);

    expressionOrVectorEClass = createEClass(EXPRESSION_OR_VECTOR);

    vectorExprEClass = createEClass(VECTOR_EXPR);
    createEReference(vectorExprEClass, VECTOR_EXPR__E);

    identPrimaryEClass = createEClass(IDENT_PRIMARY);
    createEReference(identPrimaryEClass, IDENT_PRIMARY__E);

    aggregateEClass = createEClass(AGGREGATE);
    createEReference(aggregateEClass, AGGREGATE__A);

    compoundExprEClass = createEClass(COMPOUND_EXPR);
    createEReference(compoundExprEClass, COMPOUND_EXPR__E);
    createEReference(compoundExprEClass, COMPOUND_EXPR__S);

    exprListEClass = createEClass(EXPR_LIST);
    createEReference(exprListEClass, EXPR_LIST__E);
    createEAttribute(exprListEClass, EXPR_LIST__ID);

    selectCauseEClass = createEClass(SELECT_CAUSE);
    createEReference(selectCauseEClass, SELECT_CAUSE__S);
    createEReference(selectCauseEClass, SELECT_CAUSE__N);
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
    fieldDeclarationEClass.getESuperTypes().add(this.getdeclaration());
    intEnumEClass.getESuperTypes().add(this.getfieldType());
    intEnumEClass.getESuperTypes().add(this.getfunctionArgumentBody());
    charEnumEClass.getESuperTypes().add(this.getfieldType());
    charEnumEClass.getESuperTypes().add(this.getfunctionArgumentBody());
    charTypeEClass.getESuperTypes().add(this.getfieldType());
    charTypeEClass.getESuperTypes().add(this.getfunctionArgumentBody());
    pointerEClass.getESuperTypes().add(this.getfieldType());
    setTypeEClass.getESuperTypes().add(this.getfieldType());
    subFieldDeclarationEClass.getESuperTypes().add(this.getdeclaration());
    titleDeclarationEClass.getESuperTypes().add(this.getdeclaration());
    includeDeclarationEClass.getESuperTypes().add(this.getdeclaration());
    typeDeclarationEClass.getESuperTypes().add(this.getdeclaration());
    validationRuleDeclarationEClass.getESuperTypes().add(this.getdeclaration());
    comparisonValidationRuleDeclarationEClass.getESuperTypes().add(this.getvalidationRuleDeclaration());
    rangeValidationRuleDeclarationEClass.getESuperTypes().add(this.getvalidationRuleDeclaration());
    regexValidationRuleDeclarationEClass.getESuperTypes().add(this.getvalidationRuleDeclaration());
    uniquenessValidationRuleDeclarationEClass.getESuperTypes().add(this.getvalidationRuleDeclaration());
    nativeValidationRuleDeclarationEClass.getESuperTypes().add(this.getdeclaration());
    functionDeclarationEClass.getESuperTypes().add(this.getdeclaration());
    functionCallEClass.getESuperTypes().add(this.gettitle());
    queryRuleEClass.getESuperTypes().add(this.getstatement());
    selectFromEClass.getESuperTypes().add(this.getqueryRule());
    fromClassOrOuterQueryPathEClass.getESuperTypes().add(this.getfromJoin());
    fromClassOrOuterQueryPathEClass.getESuperTypes().add(this.getfromRange());
    inCollectionElementsDeclarationEClass.getESuperTypes().add(this.getfromRange());
    expressionEClass.getESuperTypes().add(this.getorderElement());
    expressionEClass.getESuperTypes().add(this.getaliasedExpression());
    expressionEClass.getESuperTypes().add(this.getexpressionOrVector());
    logicalOrExpressionEClass.getESuperTypes().add(this.getexpression());
    equalityExpressionEClass.getESuperTypes().add(this.getnegatedExpression());
    concatenationEClass.getESuperTypes().add(this.getrelationalExpression());
    additiveExpressionEClass.getESuperTypes().add(this.getconcatenation());
    caseExpressionEClass.getESuperTypes().add(this.getunaryExpression());
    quantifiedExpressionEClass.getESuperTypes().add(this.getunaryExpression());
    atomEClass.getESuperTypes().add(this.getunaryExpression());
    primaryExpressionEClass.getESuperTypes().add(this.getatom());
    expressionOrVectorEClass.getESuperTypes().add(this.getprimaryExpression());
    aggregateEClass.getESuperTypes().add(this.getidentPrimary());
    selectCauseEClass.getESuperTypes().add(this.getselectClause());

    // Initialize classes and features; add operations and parameters
    initEClass(dataDefinitionEClass, dataDefinition.class, "dataDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getdataDefinition_D(), this.getdeclaration(), null, "d", null, 0, -1, dataDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationEClass, declaration.class, "declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fieldDeclarationEClass, fieldDeclaration.class, "fieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfieldDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, fieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfieldDeclaration_Modifiers(), this.getmodifiers(), null, "modifiers", null, 0, 1, fieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfieldDeclaration_Typedef(), this.getfieldType(), null, "typedef", null, 0, 1, fieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modifiersEClass, modifiers.class, "modifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getmodifiers_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, modifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getmodifiers_Fixed(), ecorePackage.getEBoolean(), "fixed", null, 0, 1, modifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getmodifiers_NotNull(), ecorePackage.getEBoolean(), "notNull", null, 0, 1, modifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getmodifiers_NotEmpty(), ecorePackage.getEBoolean(), "notEmpty", null, 0, 1, modifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldTypeEClass, fieldType.class, "fieldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfieldType_Type(), ecorePackage.getEString(), "type", null, 0, 1, fieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfieldType_TypeDec(), this.gettypeDeclaration(), null, "typeDec", null, 0, 1, fieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intEnumEClass, intEnum.class, "intEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getintEnum_Values(), this.getenumValue(), null, "values", null, 0, -1, intEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(charEnumEClass, charEnum.class, "charEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcharEnum_Values(), ecorePackage.getEString(), "values", null, 0, -1, charEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumValueEClass, enumValue.class, "enumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getenumValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, enumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getenumValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, enumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(charTypeEClass, charType.class, "charType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcharType_Length(), ecorePackage.getEInt(), "length", null, 0, 1, charType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointerEClass, pointer.class, "pointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(setTypeEClass, setType.class, "setType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subFieldDeclarationEClass, subFieldDeclaration.class, "subFieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsubFieldDeclaration_SubFieldOf(), this.getfieldDeclaration(), null, "subFieldOf", null, 0, 1, subFieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsubFieldDeclaration_D(), this.getdeclaration(), null, "d", null, 0, 1, subFieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(titleDeclarationEClass, titleDeclaration.class, "titleDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettitleDeclaration_Title(), this.gettitle(), null, "title", null, 0, 1, titleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(titleEClass, title.class, "title", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettitle_Name(), ecorePackage.getEString(), "name", null, 0, 1, title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(includeDeclarationEClass, includeDeclaration.class, "includeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getincludeDeclaration_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, includeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDeclarationEClass, typeDeclaration.class, "typeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettypeDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, typeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettypeDeclaration_FieldType(), this.getfieldType(), null, "fieldType", null, 0, 1, typeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(validationRuleDeclarationEClass, validationRuleDeclaration.class, "validationRuleDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvalidationRuleDeclaration_ErrorMessage(), this.geterrorMessage(), null, "errorMessage", null, 0, 1, validationRuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvalidationRuleDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, validationRuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvalidationRuleDeclaration_Args(), this.getfunctionArguments(), null, "args", null, 0, 1, validationRuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comparisonValidationRuleDeclarationEClass, comparisonValidationRuleDeclaration.class, "comparisonValidationRuleDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcomparisonValidationRuleDeclaration_ComparisonExp(), this.getcomparisonExpression(), null, "comparisonExp", null, 0, 1, comparisonValidationRuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comparisonExpressionEClass, comparisonExpression.class, "comparisonExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcomparisonExpression_Lhs(), this.getcomparisonPart(), null, "lhs", null, 0, 1, comparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcomparisonExpression_O(), ecorePackage.getEString(), "o", null, 0, 1, comparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcomparisonExpression_Rhs(), this.getcomparisonPart(), null, "rhs", null, 0, 1, comparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comparisonPartEClass, comparisonPart.class, "comparisonPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcomparisonPart_T(), ecorePackage.getEString(), "t", null, 0, 1, comparisonPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcomparisonPart_N(), ecorePackage.getEInt(), "n", null, 0, 1, comparisonPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcomparisonPart_Df(), ecorePackage.getEString(), "df", null, 0, 1, comparisonPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcomparisonPart_U(), this.getupperFunction(), null, "u", null, 0, 1, comparisonPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcomparisonPart_L(), this.getlowerFunction(), null, "l", null, 0, 1, comparisonPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcomparisonPart_D(), ecorePackage.getEString(), "d", null, 0, 1, comparisonPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(upperFunctionEClass, upperFunction.class, "upperFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getupperFunction_T(), ecorePackage.getEString(), "t", null, 0, 1, upperFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lowerFunctionEClass, lowerFunction.class, "lowerFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getlowerFunction_T(), ecorePackage.getEString(), "t", null, 0, 1, lowerFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rangeValidationRuleDeclarationEClass, rangeValidationRuleDeclaration.class, "rangeValidationRuleDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrangeValidationRuleDeclaration_Range(), this.getrange(), null, "range", null, 0, 1, rangeValidationRuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(regexValidationRuleDeclarationEClass, regexValidationRuleDeclaration.class, "regexValidationRuleDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getregexValidationRuleDeclaration_Exp(), ecorePackage.getEString(), "exp", null, 0, 1, regexValidationRuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rangeEClass, range.class, "range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getrange_F(), ecorePackage.getEString(), "f", null, 0, 1, range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getrange_T(), ecorePackage.getEString(), "t", null, 0, 1, range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uniquenessValidationRuleDeclarationEClass, uniquenessValidationRuleDeclaration.class, "uniquenessValidationRuleDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(errorMessageEClass, errorMessage.class, "errorMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(geterrorMessage_Message(), ecorePackage.getEString(), "message", null, 0, 1, errorMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nativeValidationRuleDeclarationEClass, nativeValidationRuleDeclaration.class, "nativeValidationRuleDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getnativeValidationRuleDeclaration_Field(), this.getfieldDeclaration(), null, "field", null, 0, 1, nativeValidationRuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnativeValidationRuleDeclaration_Type(), ecorePackage.getEString(), "type", null, 0, 1, nativeValidationRuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnativeValidationRuleDeclaration_Message(), ecorePackage.getEString(), "message", null, 0, 1, nativeValidationRuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDeclarationEClass, functionDeclaration.class, "functionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfunctionDeclaration_B(), ecorePackage.getEString(), "b", null, 0, 1, functionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfunctionDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, functionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunctionDeclaration_Arg(), this.getfunctionArgumentDeclaration(), null, "arg", null, 0, 1, functionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunctionDeclaration_Body(), this.getfunctionBody(), null, "body", null, 0, 1, functionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunctionDeclaration_M(), this.geterrorMessage(), null, "m", null, 0, 1, functionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionArgumentDeclarationEClass, functionArgumentDeclaration.class, "functionArgumentDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfunctionArgumentDeclaration_F(), this.getfunctionArgumentBody(), null, "f", null, 0, -1, functionArgumentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionArgumentBodyEClass, functionArgumentBody.class, "functionArgumentBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfunctionArgumentBody_Name(), ecorePackage.getEString(), "name", null, 0, 1, functionArgumentBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionCallEClass, functionCall.class, "functionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfunctionCall_F(), this.getfunctionArguments(), null, "f", null, 0, 1, functionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionArgumentsEClass, functionArguments.class, "functionArguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfunctionArguments_A(), ecorePackage.getEString(), "a", null, 0, -1, functionArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionBodyEClass, functionBody.class, "functionBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfunctionBody_S(), this.getstatement(), null, "s", null, 0, 1, functionBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunctionBody_E(), this.getexpression(), null, "e", null, 0, 1, functionBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, statement.class, "statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unionRuleEClass, unionRule.class, "unionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getunionRule_Q(), this.getqueryRule(), null, "q", null, 0, -1, unionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(queryRuleEClass, queryRule.class, "queryRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(selectFromEClass, selectFrom.class, "selectFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getselectFrom_Where(), this.getwhereClause(), null, "where", null, 0, 1, selectFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getselectFrom_GroupBy(), this.getgroupByClause(), null, "groupBy", null, 0, 1, selectFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getselectFrom_OrderBy(), this.getorderByClause(), null, "orderBy", null, 0, 1, selectFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getselectFrom_S(), this.getselectClause(), null, "s", null, 0, 1, selectFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getselectFrom_From(), this.getfromClause(), null, "from", null, 0, 1, selectFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectClauseEClass, selectClause.class, "selectClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(newExpressionEClass, newExpression.class, "newExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnewExpression_P(), ecorePackage.getEString(), "p", null, 0, 1, newExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getnewExpression_S(), this.getselectedPropertiesList(), null, "s", null, 0, 1, newExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fromClauseEClass, fromClause.class, "fromClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfromClause_FromRange(), this.getfromRange(), null, "fromRange", null, 0, -1, fromClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfromClause_FromJoin(), this.getfromJoin(), null, "fromJoin", null, 0, -1, fromClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fromJoinEClass, fromJoin.class, "fromJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(withClauseEClass, withClause.class, "withClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getwithClause_E(), this.getexpression(), null, "e", null, 0, 1, withClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fromRangeEClass, fromRange.class, "fromRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfromRange_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, fromRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfromRange_P(), ecorePackage.getEString(), "p", null, 0, 1, fromRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fromClassOrOuterQueryPathEClass, fromClassOrOuterQueryPath.class, "fromClassOrOuterQueryPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfromClassOrOuterQueryPath_W(), this.getwithClause(), null, "w", null, 0, 1, fromClassOrOuterQueryPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfromClassOrOuterQueryPath_AsAlias(), this.getasAlias(), null, "asAlias", null, 0, 1, fromClassOrOuterQueryPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfromClassOrOuterQueryPath_PropertyFetch(), ecorePackage.getEString(), "propertyFetch", null, 0, 1, fromClassOrOuterQueryPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inCollectionElementsDeclarationEClass, inCollectionElementsDeclaration.class, "inCollectionElementsDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(asAliasEClass, asAlias.class, "asAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getasAlias_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, asAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupByClauseEClass, groupByClause.class, "groupByClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getgroupByClause_E(), this.getexpression(), null, "e", null, 0, -1, groupByClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getgroupByClause_H(), this.gethavingClause(), null, "h", null, 0, 1, groupByClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orderByClauseEClass, orderByClause.class, "orderByClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getorderByClause_O(), this.getorderElement(), null, "o", null, 0, -1, orderByClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orderElementEClass, orderElement.class, "orderElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(havingClauseEClass, havingClause.class, "havingClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gethavingClause_E(), this.getexpression(), null, "e", null, 0, 1, havingClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whereClauseEClass, whereClause.class, "whereClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getwhereClause_E(), this.getexpression(), null, "e", null, 0, 1, whereClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectedPropertiesListEClass, selectedPropertiesList.class, "selectedPropertiesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getselectedPropertiesList_A(), this.getaliasedExpression(), null, "a", null, 0, -1, selectedPropertiesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aliasedExpressionEClass, aliasedExpression.class, "aliasedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, expression.class, "expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getexpression_Id(), ecorePackage.getEString(), "id", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexpression_V(), this.getvectorExpr(), null, "v", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicalOrExpressionEClass, logicalOrExpression.class, "logicalOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlogicalOrExpression_L(), this.getlogicalAndExpression(), null, "l", null, 0, -1, logicalOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicalAndExpressionEClass, logicalAndExpression.class, "logicalAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlogicalAndExpression_N(), this.getnegatedExpression(), null, "n", null, 0, -1, logicalAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(negatedExpressionEClass, negatedExpression.class, "negatedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getnegatedExpression_N(), this.getnegatedExpression(), null, "n", null, 0, 1, negatedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalityExpressionEClass, equalityExpression.class, "equalityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getequalityExpression_R(), this.getrelationalExpression(), null, "r", null, 0, -1, equalityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationalExpressionEClass, relationalExpression.class, "relationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(likeEscapeEClass, likeEscape.class, "likeEscape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlikeEscape_C(), this.getconcatenation(), null, "c", null, 0, 1, likeEscape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(betweenListEClass, betweenList.class, "betweenList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getbetweenList_C(), this.getconcatenation(), null, "c", null, 0, -1, betweenList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(concatenationEClass, concatenation.class, "concatenation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getconcatenation_A(), this.getadditiveExpression(), null, "a", null, 0, -1, concatenation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconcatenation_I(), this.getcompoundExpr(), null, "i", null, 0, 1, concatenation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconcatenation_B(), this.getbetweenList(), null, "b", null, 0, 1, concatenation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconcatenation_C(), this.getconcatenation(), null, "c", null, 0, 1, concatenation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconcatenation_L(), this.getlikeEscape(), null, "l", null, 0, 1, concatenation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getconcatenation_P(), ecorePackage.getEString(), "p", null, 0, 1, concatenation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additiveExpressionEClass, additiveExpression.class, "additiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getadditiveExpression_M(), this.getmultiplyExpression(), null, "m", null, 0, -1, additiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplyExpressionEClass, multiplyExpression.class, "multiplyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getmultiplyExpression_U(), this.getunaryExpression(), null, "u", null, 0, -1, multiplyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryExpressionEClass, unaryExpression.class, "unaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getunaryExpression_U(), this.getunaryExpression(), null, "u", null, 0, 1, unaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseExpressionEClass, caseExpression.class, "caseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcaseExpression_W(), this.getwhenClause(), null, "w", null, 0, -1, caseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcaseExpression_E(), this.getelseClause(), null, "e", null, 0, 1, caseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcaseExpression_A(), this.getaltWhenClause(), null, "a", null, 0, -1, caseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenClauseEClass, whenClause.class, "whenClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getwhenClause_WhenExpr(), this.getexpression(), null, "whenExpr", null, 0, 1, whenClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getwhenClause_ThenExpr(), this.getunaryExpression(), null, "thenExpr", null, 0, 1, whenClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(altWhenClauseEClass, altWhenClause.class, "altWhenClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getaltWhenClause_W(), this.getunaryExpression(), null, "w", null, 0, 1, altWhenClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getaltWhenClause_T(), this.getunaryExpression(), null, "t", null, 0, 1, altWhenClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elseClauseEClass, elseClause.class, "elseClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getelseClause_U(), this.getunaryExpression(), null, "u", null, 0, 1, elseClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quantifiedExpressionEClass, quantifiedExpression.class, "quantifiedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getquantifiedExpression_S(), this.getunionRule(), null, "s", null, 0, 1, quantifiedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomEClass, atom.class, "atom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(primaryExpressionEClass, primaryExpression.class, "primaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getprimaryExpression_E(), this.getexprList(), null, "e", null, 0, -1, primaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprimaryExpression_Exp(), this.getexpression(), null, "exp", null, 0, -1, primaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprimaryExpression_Ident(), this.getidentPrimary(), null, "ident", null, 0, 1, primaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprimaryExpression_S(), this.getunionRule(), null, "s", null, 0, 1, primaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionOrVectorEClass, expressionOrVector.class, "expressionOrVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(vectorExprEClass, vectorExpr.class, "vectorExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvectorExpr_E(), this.getexpression(), null, "e", null, 0, -1, vectorExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identPrimaryEClass, identPrimary.class, "identPrimary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getidentPrimary_E(), this.getexprList(), null, "e", null, 0, 1, identPrimary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aggregateEClass, aggregate.class, "aggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getaggregate_A(), this.getadditiveExpression(), null, "a", null, 0, 1, aggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compoundExprEClass, compoundExpr.class, "compoundExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcompoundExpr_E(), this.getexpression(), null, "e", null, 0, -1, compoundExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcompoundExpr_S(), this.getunionRule(), null, "s", null, 0, 1, compoundExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprListEClass, exprList.class, "exprList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getexprList_E(), this.getexpression(), null, "e", null, 0, -1, exprList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getexprList_Id(), ecorePackage.getEString(), "id", null, 0, 1, exprList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectCauseEClass, selectCause.class, "selectCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getselectCause_S(), this.getselectedPropertiesList(), null, "s", null, 0, 1, selectCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getselectCause_N(), this.getnewExpression(), null, "n", null, 0, 1, selectCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //EditorPackageImpl
