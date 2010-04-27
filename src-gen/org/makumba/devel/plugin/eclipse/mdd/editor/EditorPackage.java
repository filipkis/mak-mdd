/**
 * <copyright>
 * </copyright>
 *
 */
package org.makumba.devel.plugin.eclipse.mdd.editor;

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
 * @see org.makumba.devel.plugin.eclipse.mdd.editor.EditorFactory
 * @model kind="package"
 * @generated
 */
public interface EditorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "editor";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.makumba.org/devel/plugin/eclipse/mdd/MDD";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "editor";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EditorPackage eINSTANCE = org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl.init();

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.dataDefinitionImpl <em>data Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.dataDefinitionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getdataDefinition()
   * @generated
   */
  int DATA_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION__D = 0;

  /**
   * The number of structural features of the '<em>data Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.declarationImpl <em>declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.declarationImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getdeclaration()
   * @generated
   */
  int DECLARATION = 1;

  /**
   * The number of structural features of the '<em>declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fieldDeclarationImpl <em>field Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.fieldDeclarationImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfieldDeclaration()
   * @generated
   */
  int FIELD_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__MODIFIERS = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Typedef</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__TYPEDEF = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>field Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.modifiersImpl <em>modifiers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.modifiersImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getmodifiers()
   * @generated
   */
  int MODIFIERS = 3;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__UNIQUE = 0;

  /**
   * The feature id for the '<em><b>Fixed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__FIXED = 1;

  /**
   * The feature id for the '<em><b>Not Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__NOT_NULL = 2;

  /**
   * The feature id for the '<em><b>Not Empty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS__NOT_EMPTY = 3;

  /**
   * The number of structural features of the '<em>modifiers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIERS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fieldTypeImpl <em>field Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.fieldTypeImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfieldType()
   * @generated
   */
  int FIELD_TYPE = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Type Dec</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__TYPE_DEC = 1;

  /**
   * The number of structural features of the '<em>field Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.intEnumImpl <em>int Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.intEnumImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getintEnum()
   * @generated
   */
  int INT_ENUM = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_ENUM__TYPE = FIELD_TYPE__TYPE;

  /**
   * The feature id for the '<em><b>Type Dec</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_ENUM__TYPE_DEC = FIELD_TYPE__TYPE_DEC;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_ENUM__NAME = FIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_ENUM__VALUES = FIELD_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>int Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_ENUM_FEATURE_COUNT = FIELD_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.charEnumImpl <em>char Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.charEnumImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getcharEnum()
   * @generated
   */
  int CHAR_ENUM = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_ENUM__TYPE = FIELD_TYPE__TYPE;

  /**
   * The feature id for the '<em><b>Type Dec</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_ENUM__TYPE_DEC = FIELD_TYPE__TYPE_DEC;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_ENUM__NAME = FIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_ENUM__VALUES = FIELD_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>char Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_ENUM_FEATURE_COUNT = FIELD_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.enumValueImpl <em>enum Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.enumValueImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getenumValue()
   * @generated
   */
  int ENUM_VALUE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE__VALUE = 1;

  /**
   * The number of structural features of the '<em>enum Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.charTypeImpl <em>char Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.charTypeImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getcharType()
   * @generated
   */
  int CHAR_TYPE = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_TYPE__TYPE = FIELD_TYPE__TYPE;

  /**
   * The feature id for the '<em><b>Type Dec</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_TYPE__TYPE_DEC = FIELD_TYPE__TYPE_DEC;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_TYPE__NAME = FIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_TYPE__LENGTH = FIELD_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>char Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_TYPE_FEATURE_COUNT = FIELD_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.pointerImpl <em>pointer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.pointerImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getpointer()
   * @generated
   */
  int POINTER = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTER__TYPE = FIELD_TYPE__TYPE;

  /**
   * The feature id for the '<em><b>Type Dec</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTER__TYPE_DEC = FIELD_TYPE__TYPE_DEC;

  /**
   * The number of structural features of the '<em>pointer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTER_FEATURE_COUNT = FIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.setTypeImpl <em>set Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.setTypeImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getsetType()
   * @generated
   */
  int SET_TYPE = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE__TYPE = FIELD_TYPE__TYPE;

  /**
   * The feature id for the '<em><b>Type Dec</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE__TYPE_DEC = FIELD_TYPE__TYPE_DEC;

  /**
   * The number of structural features of the '<em>set Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE_FEATURE_COUNT = FIELD_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.subFieldDeclarationImpl <em>sub Field Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.subFieldDeclarationImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getsubFieldDeclaration()
   * @generated
   */
  int SUB_FIELD_DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Sub Field Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_FIELD_DECLARATION__SUB_FIELD_OF = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_FIELD_DECLARATION__D = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>sub Field Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_FIELD_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.titleDeclarationImpl <em>title Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.titleDeclarationImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#gettitleDeclaration()
   * @generated
   */
  int TITLE_DECLARATION = 12;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE_DECLARATION__TITLE = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>title Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.titleImpl <em>title</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.titleImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#gettitle()
   * @generated
   */
  int TITLE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE__NAME = 0;

  /**
   * The number of structural features of the '<em>title</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.includeDeclarationImpl <em>include Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.includeDeclarationImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getincludeDeclaration()
   * @generated
   */
  int INCLUDE_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DECLARATION__IMPORTED_NAMESPACE = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>include Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.typeDeclarationImpl <em>type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.typeDeclarationImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#gettypeDeclaration()
   * @generated
   */
  int TYPE_DECLARATION = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Field Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__FIELD_TYPE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.validationRuleDeclarationImpl <em>validation Rule Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.validationRuleDeclarationImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getvalidationRuleDeclaration()
   * @generated
   */
  int VALIDATION_RULE_DECLARATION = 16;

  /**
   * The feature id for the '<em><b>Error Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_RULE_DECLARATION__ERROR_MESSAGE = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_RULE_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_RULE_DECLARATION__ARGS = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>validation Rule Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_RULE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonValidationRuleDeclarationImpl <em>comparison Validation Rule Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonValidationRuleDeclarationImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getcomparisonValidationRuleDeclaration()
   * @generated
   */
  int COMPARISON_VALIDATION_RULE_DECLARATION = 17;

  /**
   * The feature id for the '<em><b>Error Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_VALIDATION_RULE_DECLARATION__ERROR_MESSAGE = VALIDATION_RULE_DECLARATION__ERROR_MESSAGE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_VALIDATION_RULE_DECLARATION__NAME = VALIDATION_RULE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_VALIDATION_RULE_DECLARATION__ARGS = VALIDATION_RULE_DECLARATION__ARGS;

  /**
   * The feature id for the '<em><b>Comparison Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_VALIDATION_RULE_DECLARATION__COMPARISON_EXP = VALIDATION_RULE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>comparison Validation Rule Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_VALIDATION_RULE_DECLARATION_FEATURE_COUNT = VALIDATION_RULE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonExpressionImpl <em>comparison Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonExpressionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getcomparisonExpression()
   * @generated
   */
  int COMPARISON_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPRESSION__LHS = 0;

  /**
   * The feature id for the '<em><b>O</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPRESSION__O = 1;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPRESSION__RHS = 2;

  /**
   * The number of structural features of the '<em>comparison Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonPartImpl <em>comparison Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonPartImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getcomparisonPart()
   * @generated
   */
  int COMPARISON_PART = 19;

  /**
   * The feature id for the '<em><b>T</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_PART__T = 0;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_PART__N = 1;

  /**
   * The feature id for the '<em><b>Df</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_PART__DF = 2;

  /**
   * The feature id for the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_PART__U = 3;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_PART__L = 4;

  /**
   * The feature id for the '<em><b>D</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_PART__D = 5;

  /**
   * The number of structural features of the '<em>comparison Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_PART_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.upperFunctionImpl <em>upper Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.upperFunctionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getupperFunction()
   * @generated
   */
  int UPPER_FUNCTION = 20;

  /**
   * The feature id for the '<em><b>T</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPPER_FUNCTION__T = 0;

  /**
   * The number of structural features of the '<em>upper Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPPER_FUNCTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.lowerFunctionImpl <em>lower Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.lowerFunctionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getlowerFunction()
   * @generated
   */
  int LOWER_FUNCTION = 21;

  /**
   * The feature id for the '<em><b>T</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER_FUNCTION__T = 0;

  /**
   * The number of structural features of the '<em>lower Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER_FUNCTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.rangeValidationRuleDeclarationImpl <em>range Validation Rule Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.rangeValidationRuleDeclarationImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getrangeValidationRuleDeclaration()
   * @generated
   */
  int RANGE_VALIDATION_RULE_DECLARATION = 22;

  /**
   * The feature id for the '<em><b>Error Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_VALIDATION_RULE_DECLARATION__ERROR_MESSAGE = VALIDATION_RULE_DECLARATION__ERROR_MESSAGE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_VALIDATION_RULE_DECLARATION__NAME = VALIDATION_RULE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_VALIDATION_RULE_DECLARATION__ARGS = VALIDATION_RULE_DECLARATION__ARGS;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_VALIDATION_RULE_DECLARATION__RANGE = VALIDATION_RULE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>range Validation Rule Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_VALIDATION_RULE_DECLARATION_FEATURE_COUNT = VALIDATION_RULE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.regexValidationRuleDeclarationImpl <em>regex Validation Rule Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.regexValidationRuleDeclarationImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getregexValidationRuleDeclaration()
   * @generated
   */
  int REGEX_VALIDATION_RULE_DECLARATION = 23;

  /**
   * The feature id for the '<em><b>Error Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEX_VALIDATION_RULE_DECLARATION__ERROR_MESSAGE = VALIDATION_RULE_DECLARATION__ERROR_MESSAGE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEX_VALIDATION_RULE_DECLARATION__NAME = VALIDATION_RULE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEX_VALIDATION_RULE_DECLARATION__ARGS = VALIDATION_RULE_DECLARATION__ARGS;

  /**
   * The feature id for the '<em><b>Exp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEX_VALIDATION_RULE_DECLARATION__EXP = VALIDATION_RULE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>regex Validation Rule Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEX_VALIDATION_RULE_DECLARATION_FEATURE_COUNT = VALIDATION_RULE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.rangeImpl <em>range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.rangeImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getrange()
   * @generated
   */
  int RANGE = 24;

  /**
   * The feature id for the '<em><b>F</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__F = 0;

  /**
   * The feature id for the '<em><b>T</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__T = 1;

  /**
   * The number of structural features of the '<em>range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.uniquenessValidationRuleDeclarationImpl <em>uniqueness Validation Rule Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.uniquenessValidationRuleDeclarationImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getuniquenessValidationRuleDeclaration()
   * @generated
   */
  int UNIQUENESS_VALIDATION_RULE_DECLARATION = 25;

  /**
   * The feature id for the '<em><b>Error Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUENESS_VALIDATION_RULE_DECLARATION__ERROR_MESSAGE = VALIDATION_RULE_DECLARATION__ERROR_MESSAGE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUENESS_VALIDATION_RULE_DECLARATION__NAME = VALIDATION_RULE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUENESS_VALIDATION_RULE_DECLARATION__ARGS = VALIDATION_RULE_DECLARATION__ARGS;

  /**
   * The number of structural features of the '<em>uniqueness Validation Rule Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUENESS_VALIDATION_RULE_DECLARATION_FEATURE_COUNT = VALIDATION_RULE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.errorMessageImpl <em>error Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.errorMessageImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#geterrorMessage()
   * @generated
   */
  int ERROR_MESSAGE = 26;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MESSAGE__MESSAGE = 0;

  /**
   * The number of structural features of the '<em>error Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MESSAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.nativeValidationRuleDeclarationImpl <em>native Validation Rule Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.nativeValidationRuleDeclarationImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getnativeValidationRuleDeclaration()
   * @generated
   */
  int NATIVE_VALIDATION_RULE_DECLARATION = 27;

  /**
   * The feature id for the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_VALIDATION_RULE_DECLARATION__FIELD = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_VALIDATION_RULE_DECLARATION__TYPE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_VALIDATION_RULE_DECLARATION__MESSAGE = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>native Validation Rule Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_VALIDATION_RULE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionDeclarationImpl <em>function Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionDeclarationImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfunctionDeclaration()
   * @generated
   */
  int FUNCTION_DECLARATION = 28;

  /**
   * The feature id for the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__B = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__ARG = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__BODY = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__M = DECLARATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>function Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionArgumentDeclarationImpl <em>function Argument Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionArgumentDeclarationImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfunctionArgumentDeclaration()
   * @generated
   */
  int FUNCTION_ARGUMENT_DECLARATION = 29;

  /**
   * The feature id for the '<em><b>F</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ARGUMENT_DECLARATION__F = 0;

  /**
   * The number of structural features of the '<em>function Argument Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ARGUMENT_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionArgumentBodyImpl <em>function Argument Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionArgumentBodyImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfunctionArgumentBody()
   * @generated
   */
  int FUNCTION_ARGUMENT_BODY = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ARGUMENT_BODY__NAME = 0;

  /**
   * The number of structural features of the '<em>function Argument Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ARGUMENT_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionCallImpl <em>function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionCallImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__NAME = TITLE__NAME;

  /**
   * The feature id for the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__F = TITLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = TITLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionArgumentsImpl <em>function Arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionArgumentsImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfunctionArguments()
   * @generated
   */
  int FUNCTION_ARGUMENTS = 32;

  /**
   * The feature id for the '<em><b>A</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ARGUMENTS__A = 0;

  /**
   * The number of structural features of the '<em>function Arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ARGUMENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionBodyImpl <em>function Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionBodyImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfunctionBody()
   * @generated
   */
  int FUNCTION_BODY = 33;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_BODY__S = 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_BODY__E = 1;

  /**
   * The number of structural features of the '<em>function Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.statementImpl <em>statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.statementImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getstatement()
   * @generated
   */
  int STATEMENT = 34;

  /**
   * The number of structural features of the '<em>statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.unionRuleImpl <em>union Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.unionRuleImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getunionRule()
   * @generated
   */
  int UNION_RULE = 35;

  /**
   * The feature id for the '<em><b>Q</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_RULE__Q = 0;

  /**
   * The number of structural features of the '<em>union Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_RULE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.queryRuleImpl <em>query Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.queryRuleImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getqueryRule()
   * @generated
   */
  int QUERY_RULE = 36;

  /**
   * The number of structural features of the '<em>query Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_RULE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectFromImpl <em>select From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectFromImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getselectFrom()
   * @generated
   */
  int SELECT_FROM = 37;

  /**
   * The feature id for the '<em><b>Where</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FROM__WHERE = QUERY_RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Group By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FROM__GROUP_BY = QUERY_RULE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Order By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FROM__ORDER_BY = QUERY_RULE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FROM__S = QUERY_RULE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FROM__FROM = QUERY_RULE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>select From</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FROM_FEATURE_COUNT = QUERY_RULE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectClauseImpl <em>select Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectClauseImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getselectClause()
   * @generated
   */
  int SELECT_CLAUSE = 38;

  /**
   * The number of structural features of the '<em>select Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CLAUSE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.newExpressionImpl <em>new Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.newExpressionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getnewExpression()
   * @generated
   */
  int NEW_EXPRESSION = 39;

  /**
   * The feature id for the '<em><b>P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_EXPRESSION__P = 0;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_EXPRESSION__S = 1;

  /**
   * The number of structural features of the '<em>new Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromClauseImpl <em>from Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromClauseImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfromClause()
   * @generated
   */
  int FROM_CLAUSE = 40;

  /**
   * The feature id for the '<em><b>From Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLAUSE__FROM_RANGE = 0;

  /**
   * The feature id for the '<em><b>From Join</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLAUSE__FROM_JOIN = 1;

  /**
   * The number of structural features of the '<em>from Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromJoinImpl <em>from Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromJoinImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfromJoin()
   * @generated
   */
  int FROM_JOIN = 41;

  /**
   * The number of structural features of the '<em>from Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_JOIN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.withClauseImpl <em>with Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.withClauseImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getwithClause()
   * @generated
   */
  int WITH_CLAUSE = 42;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_CLAUSE__E = 0;

  /**
   * The number of structural features of the '<em>with Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromRangeImpl <em>from Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromRangeImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfromRange()
   * @generated
   */
  int FROM_RANGE = 43;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_RANGE__ALIAS = 0;

  /**
   * The feature id for the '<em><b>P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_RANGE__P = 1;

  /**
   * The number of structural features of the '<em>from Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_RANGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromClassOrOuterQueryPathImpl <em>from Class Or Outer Query Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromClassOrOuterQueryPathImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfromClassOrOuterQueryPath()
   * @generated
   */
  int FROM_CLASS_OR_OUTER_QUERY_PATH = 44;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLASS_OR_OUTER_QUERY_PATH__ALIAS = FROM_JOIN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLASS_OR_OUTER_QUERY_PATH__P = FROM_JOIN_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>W</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLASS_OR_OUTER_QUERY_PATH__W = FROM_JOIN_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>As Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLASS_OR_OUTER_QUERY_PATH__AS_ALIAS = FROM_JOIN_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Property Fetch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLASS_OR_OUTER_QUERY_PATH__PROPERTY_FETCH = FROM_JOIN_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>from Class Or Outer Query Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLASS_OR_OUTER_QUERY_PATH_FEATURE_COUNT = FROM_JOIN_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.inCollectionElementsDeclarationImpl <em>in Collection Elements Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.inCollectionElementsDeclarationImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getinCollectionElementsDeclaration()
   * @generated
   */
  int IN_COLLECTION_ELEMENTS_DECLARATION = 45;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_COLLECTION_ELEMENTS_DECLARATION__ALIAS = FROM_RANGE__ALIAS;

  /**
   * The feature id for the '<em><b>P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_COLLECTION_ELEMENTS_DECLARATION__P = FROM_RANGE__P;

  /**
   * The number of structural features of the '<em>in Collection Elements Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_COLLECTION_ELEMENTS_DECLARATION_FEATURE_COUNT = FROM_RANGE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.asAliasImpl <em>as Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.asAliasImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getasAlias()
   * @generated
   */
  int AS_ALIAS = 46;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AS_ALIAS__ALIAS = 0;

  /**
   * The number of structural features of the '<em>as Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AS_ALIAS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.groupByClauseImpl <em>group By Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.groupByClauseImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getgroupByClause()
   * @generated
   */
  int GROUP_BY_CLAUSE = 47;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_CLAUSE__E = 0;

  /**
   * The feature id for the '<em><b>H</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_CLAUSE__H = 1;

  /**
   * The number of structural features of the '<em>group By Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.orderByClauseImpl <em>order By Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.orderByClauseImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getorderByClause()
   * @generated
   */
  int ORDER_BY_CLAUSE = 48;

  /**
   * The feature id for the '<em><b>O</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_CLAUSE__O = 0;

  /**
   * The number of structural features of the '<em>order By Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.orderElementImpl <em>order Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.orderElementImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getorderElement()
   * @generated
   */
  int ORDER_ELEMENT = 49;

  /**
   * The number of structural features of the '<em>order Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.havingClauseImpl <em>having Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.havingClauseImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#gethavingClause()
   * @generated
   */
  int HAVING_CLAUSE = 50;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAVING_CLAUSE__E = 0;

  /**
   * The number of structural features of the '<em>having Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAVING_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.whereClauseImpl <em>where Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.whereClauseImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getwhereClause()
   * @generated
   */
  int WHERE_CLAUSE = 51;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_CLAUSE__E = 0;

  /**
   * The number of structural features of the '<em>where Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectedPropertiesListImpl <em>selected Properties List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectedPropertiesListImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getselectedPropertiesList()
   * @generated
   */
  int SELECTED_PROPERTIES_LIST = 52;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTED_PROPERTIES_LIST__A = 0;

  /**
   * The number of structural features of the '<em>selected Properties List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTED_PROPERTIES_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.aliasedExpressionImpl <em>aliased Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.aliasedExpressionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getaliasedExpression()
   * @generated
   */
  int ALIASED_EXPRESSION = 53;

  /**
   * The number of structural features of the '<em>aliased Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASED_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.expressionImpl <em>expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.expressionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getexpression()
   * @generated
   */
  int EXPRESSION = 54;

  /**
   * The feature id for the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__U = ORDER_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__E = ORDER_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXP = ORDER_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ident</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__IDENT = ORDER_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__S = ORDER_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ID = ORDER_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__V = ORDER_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = ORDER_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.logicalOrExpressionImpl <em>logical Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.logicalOrExpressionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getlogicalOrExpression()
   * @generated
   */
  int LOGICAL_OR_EXPRESSION = 55;

  /**
   * The feature id for the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__U = EXPRESSION__U;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__E = EXPRESSION__E;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Ident</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__IDENT = EXPRESSION__IDENT;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__S = EXPRESSION__S;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__ID = EXPRESSION__ID;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__V = EXPRESSION__V;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__L = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>logical Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.logicalAndExpressionImpl <em>logical And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.logicalAndExpressionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getlogicalAndExpression()
   * @generated
   */
  int LOGICAL_AND_EXPRESSION = 56;

  /**
   * The feature id for the '<em><b>N</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_EXPRESSION__N = 0;

  /**
   * The number of structural features of the '<em>logical And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.negatedExpressionImpl <em>negated Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.negatedExpressionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getnegatedExpression()
   * @generated
   */
  int NEGATED_EXPRESSION = 57;

  /**
   * The feature id for the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATED_EXPRESSION__N = 0;

  /**
   * The number of structural features of the '<em>negated Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATED_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.equalityExpressionImpl <em>equality Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.equalityExpressionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getequalityExpression()
   * @generated
   */
  int EQUALITY_EXPRESSION = 58;

  /**
   * The feature id for the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__N = NEGATED_EXPRESSION__N;

  /**
   * The feature id for the '<em><b>R</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__R = NEGATED_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>equality Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION_FEATURE_COUNT = NEGATED_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.relationalExpressionImpl <em>relational Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.relationalExpressionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getrelationalExpression()
   * @generated
   */
  int RELATIONAL_EXPRESSION = 59;

  /**
   * The number of structural features of the '<em>relational Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.likeEscapeImpl <em>like Escape</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.likeEscapeImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getlikeEscape()
   * @generated
   */
  int LIKE_ESCAPE = 60;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE_ESCAPE__C = 0;

  /**
   * The number of structural features of the '<em>like Escape</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE_ESCAPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.betweenListImpl <em>between List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.betweenListImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getbetweenList()
   * @generated
   */
  int BETWEEN_LIST = 61;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BETWEEN_LIST__C = 0;

  /**
   * The number of structural features of the '<em>between List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BETWEEN_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.concatenationImpl <em>concatenation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.concatenationImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getconcatenation()
   * @generated
   */
  int CONCATENATION = 62;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION__A = RELATIONAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION__I = RELATIONAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION__B = RELATIONAL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION__C = RELATIONAL_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION__L = RELATIONAL_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION__P = RELATIONAL_EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>concatenation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION_FEATURE_COUNT = RELATIONAL_EXPRESSION_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.additiveExpressionImpl <em>additive Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.additiveExpressionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getadditiveExpression()
   * @generated
   */
  int ADDITIVE_EXPRESSION = 63;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__A = CONCATENATION__A;

  /**
   * The feature id for the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__I = CONCATENATION__I;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__B = CONCATENATION__B;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__C = CONCATENATION__C;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__L = CONCATENATION__L;

  /**
   * The feature id for the '<em><b>P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__P = CONCATENATION__P;

  /**
   * The feature id for the '<em><b>M</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__M = CONCATENATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>additive Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_FEATURE_COUNT = CONCATENATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.multiplyExpressionImpl <em>multiply Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.multiplyExpressionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getmultiplyExpression()
   * @generated
   */
  int MULTIPLY_EXPRESSION = 64;

  /**
   * The feature id for the '<em><b>U</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY_EXPRESSION__U = 0;

  /**
   * The number of structural features of the '<em>multiply Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.unaryExpressionImpl <em>unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.unaryExpressionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getunaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 65;

  /**
   * The feature id for the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__U = 0;

  /**
   * The number of structural features of the '<em>unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.caseExpressionImpl <em>case Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.caseExpressionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getcaseExpression()
   * @generated
   */
  int CASE_EXPRESSION = 66;

  /**
   * The feature id for the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__U = UNARY_EXPRESSION__U;

  /**
   * The feature id for the '<em><b>W</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__W = UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__E = UNARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__A = UNARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>case Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.whenClauseImpl <em>when Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.whenClauseImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getwhenClause()
   * @generated
   */
  int WHEN_CLAUSE = 67;

  /**
   * The feature id for the '<em><b>When Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CLAUSE__WHEN_EXPR = 0;

  /**
   * The feature id for the '<em><b>Then Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CLAUSE__THEN_EXPR = 1;

  /**
   * The number of structural features of the '<em>when Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.altWhenClauseImpl <em>alt When Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.altWhenClauseImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getaltWhenClause()
   * @generated
   */
  int ALT_WHEN_CLAUSE = 68;

  /**
   * The feature id for the '<em><b>W</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALT_WHEN_CLAUSE__W = 0;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALT_WHEN_CLAUSE__T = 1;

  /**
   * The number of structural features of the '<em>alt When Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALT_WHEN_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.elseClauseImpl <em>else Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.elseClauseImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getelseClause()
   * @generated
   */
  int ELSE_CLAUSE = 69;

  /**
   * The feature id for the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_CLAUSE__U = 0;

  /**
   * The number of structural features of the '<em>else Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.quantifiedExpressionImpl <em>quantified Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.quantifiedExpressionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getquantifiedExpression()
   * @generated
   */
  int QUANTIFIED_EXPRESSION = 70;

  /**
   * The feature id for the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXPRESSION__U = UNARY_EXPRESSION__U;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXPRESSION__S = UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>quantified Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.atomImpl <em>atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.atomImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getatom()
   * @generated
   */
  int ATOM = 71;

  /**
   * The feature id for the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__U = UNARY_EXPRESSION__U;

  /**
   * The number of structural features of the '<em>atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.primaryExpressionImpl <em>primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.primaryExpressionImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getprimaryExpression()
   * @generated
   */
  int PRIMARY_EXPRESSION = 72;

  /**
   * The feature id for the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__U = ATOM__U;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__E = ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__EXP = ATOM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ident</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__IDENT = ATOM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__S = ATOM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION_FEATURE_COUNT = ATOM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.expressionOrVectorImpl <em>expression Or Vector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.expressionOrVectorImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getexpressionOrVector()
   * @generated
   */
  int EXPRESSION_OR_VECTOR = 73;

  /**
   * The feature id for the '<em><b>U</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_OR_VECTOR__U = PRIMARY_EXPRESSION__U;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_OR_VECTOR__E = PRIMARY_EXPRESSION__E;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_OR_VECTOR__EXP = PRIMARY_EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Ident</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_OR_VECTOR__IDENT = PRIMARY_EXPRESSION__IDENT;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_OR_VECTOR__S = PRIMARY_EXPRESSION__S;

  /**
   * The number of structural features of the '<em>expression Or Vector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_OR_VECTOR_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.vectorExprImpl <em>vector Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.vectorExprImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getvectorExpr()
   * @generated
   */
  int VECTOR_EXPR = 74;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_EXPR__E = 0;

  /**
   * The number of structural features of the '<em>vector Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.identPrimaryImpl <em>ident Primary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.identPrimaryImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getidentPrimary()
   * @generated
   */
  int IDENT_PRIMARY = 75;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT_PRIMARY__E = 0;

  /**
   * The number of structural features of the '<em>ident Primary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT_PRIMARY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.aggregateImpl <em>aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.aggregateImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getaggregate()
   * @generated
   */
  int AGGREGATE = 76;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE__E = IDENT_PRIMARY__E;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE__A = IDENT_PRIMARY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_FEATURE_COUNT = IDENT_PRIMARY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.compoundExprImpl <em>compound Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.compoundExprImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getcompoundExpr()
   * @generated
   */
  int COMPOUND_EXPR = 77;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_EXPR__E = 0;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_EXPR__S = 1;

  /**
   * The number of structural features of the '<em>compound Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.exprListImpl <em>expr List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.exprListImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getexprList()
   * @generated
   */
  int EXPR_LIST = 78;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LIST__E = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LIST__ID = 1;

  /**
   * The number of structural features of the '<em>expr List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectCauseImpl <em>select Cause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectCauseImpl
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getselectCause()
   * @generated
   */
  int SELECT_CAUSE = 79;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CAUSE__S = SELECT_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CAUSE__N = SELECT_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>select Cause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CAUSE_FEATURE_COUNT = SELECT_CLAUSE_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.dataDefinition <em>data Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>data Definition</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.dataDefinition
   * @generated
   */
  EClass getdataDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.dataDefinition#getD <em>D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>D</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.dataDefinition#getD()
   * @see #getdataDefinition()
   * @generated
   */
  EReference getdataDefinition_D();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.declaration <em>declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>declaration</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.declaration
   * @generated
   */
  EClass getdeclaration();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration <em>field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>field Declaration</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration
   * @generated
   */
  EClass getfieldDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration#getName()
   * @see #getfieldDeclaration()
   * @generated
   */
  EAttribute getfieldDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifiers</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration#getModifiers()
   * @see #getfieldDeclaration()
   * @generated
   */
  EReference getfieldDeclaration_Modifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration#getTypedef <em>Typedef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typedef</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fieldDeclaration#getTypedef()
   * @see #getfieldDeclaration()
   * @generated
   */
  EReference getfieldDeclaration_Typedef();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.modifiers <em>modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>modifiers</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.modifiers
   * @generated
   */
  EClass getmodifiers();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.modifiers#isUnique <em>Unique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.modifiers#isUnique()
   * @see #getmodifiers()
   * @generated
   */
  EAttribute getmodifiers_Unique();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.modifiers#isFixed <em>Fixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fixed</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.modifiers#isFixed()
   * @see #getmodifiers()
   * @generated
   */
  EAttribute getmodifiers_Fixed();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.modifiers#isNotNull <em>Not Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not Null</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.modifiers#isNotNull()
   * @see #getmodifiers()
   * @generated
   */
  EAttribute getmodifiers_NotNull();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.modifiers#isNotEmpty <em>Not Empty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not Empty</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.modifiers#isNotEmpty()
   * @see #getmodifiers()
   * @generated
   */
  EAttribute getmodifiers_NotEmpty();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldType <em>field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>field Type</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fieldType
   * @generated
   */
  EClass getfieldType();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fieldType#getType()
   * @see #getfieldType()
   * @generated
   */
  EAttribute getfieldType_Type();

  /**
   * Returns the meta object for the reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fieldType#getTypeDec <em>Type Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Dec</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fieldType#getTypeDec()
   * @see #getfieldType()
   * @generated
   */
  EReference getfieldType_TypeDec();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.intEnum <em>int Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>int Enum</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.intEnum
   * @generated
   */
  EClass getintEnum();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.intEnum#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.intEnum#getValues()
   * @see #getintEnum()
   * @generated
   */
  EReference getintEnum_Values();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.charEnum <em>char Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>char Enum</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.charEnum
   * @generated
   */
  EClass getcharEnum();

  /**
   * Returns the meta object for the attribute list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.charEnum#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.charEnum#getValues()
   * @see #getcharEnum()
   * @generated
   */
  EAttribute getcharEnum_Values();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.enumValue <em>enum Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>enum Value</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.enumValue
   * @generated
   */
  EClass getenumValue();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.enumValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.enumValue#getName()
   * @see #getenumValue()
   * @generated
   */
  EAttribute getenumValue_Name();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.enumValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.enumValue#getValue()
   * @see #getenumValue()
   * @generated
   */
  EAttribute getenumValue_Value();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.charType <em>char Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>char Type</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.charType
   * @generated
   */
  EClass getcharType();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.charType#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.charType#getLength()
   * @see #getcharType()
   * @generated
   */
  EAttribute getcharType_Length();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.pointer <em>pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>pointer</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.pointer
   * @generated
   */
  EClass getpointer();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.setType <em>set Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>set Type</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.setType
   * @generated
   */
  EClass getsetType();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.subFieldDeclaration <em>sub Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sub Field Declaration</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.subFieldDeclaration
   * @generated
   */
  EClass getsubFieldDeclaration();

  /**
   * Returns the meta object for the reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.subFieldDeclaration#getSubFieldOf <em>Sub Field Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sub Field Of</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.subFieldDeclaration#getSubFieldOf()
   * @see #getsubFieldDeclaration()
   * @generated
   */
  EReference getsubFieldDeclaration_SubFieldOf();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.subFieldDeclaration#getD <em>D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>D</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.subFieldDeclaration#getD()
   * @see #getsubFieldDeclaration()
   * @generated
   */
  EReference getsubFieldDeclaration_D();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.titleDeclaration <em>title Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>title Declaration</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.titleDeclaration
   * @generated
   */
  EClass gettitleDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.titleDeclaration#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.titleDeclaration#getTitle()
   * @see #gettitleDeclaration()
   * @generated
   */
  EReference gettitleDeclaration_Title();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.title <em>title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>title</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.title
   * @generated
   */
  EClass gettitle();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.title#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.title#getName()
   * @see #gettitle()
   * @generated
   */
  EAttribute gettitle_Name();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.includeDeclaration <em>include Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>include Declaration</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.includeDeclaration
   * @generated
   */
  EClass getincludeDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.includeDeclaration#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.includeDeclaration#getImportedNamespace()
   * @see #getincludeDeclaration()
   * @generated
   */
  EAttribute getincludeDeclaration_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.typeDeclaration <em>type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type Declaration</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.typeDeclaration
   * @generated
   */
  EClass gettypeDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.typeDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.typeDeclaration#getName()
   * @see #gettypeDeclaration()
   * @generated
   */
  EAttribute gettypeDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.typeDeclaration#getFieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field Type</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.typeDeclaration#getFieldType()
   * @see #gettypeDeclaration()
   * @generated
   */
  EReference gettypeDeclaration_FieldType();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration <em>validation Rule Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>validation Rule Declaration</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration
   * @generated
   */
  EClass getvalidationRuleDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration#getErrorMessage <em>Error Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Error Message</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration#getErrorMessage()
   * @see #getvalidationRuleDeclaration()
   * @generated
   */
  EReference getvalidationRuleDeclaration_ErrorMessage();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration#getName()
   * @see #getvalidationRuleDeclaration()
   * @generated
   */
  EAttribute getvalidationRuleDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.validationRuleDeclaration#getArgs()
   * @see #getvalidationRuleDeclaration()
   * @generated
   */
  EReference getvalidationRuleDeclaration_Args();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonValidationRuleDeclaration <em>comparison Validation Rule Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>comparison Validation Rule Declaration</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.comparisonValidationRuleDeclaration
   * @generated
   */
  EClass getcomparisonValidationRuleDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonValidationRuleDeclaration#getComparisonExp <em>Comparison Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comparison Exp</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.comparisonValidationRuleDeclaration#getComparisonExp()
   * @see #getcomparisonValidationRuleDeclaration()
   * @generated
   */
  EReference getcomparisonValidationRuleDeclaration_ComparisonExp();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonExpression <em>comparison Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>comparison Expression</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.comparisonExpression
   * @generated
   */
  EClass getcomparisonExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.comparisonExpression#getLhs()
   * @see #getcomparisonExpression()
   * @generated
   */
  EReference getcomparisonExpression_Lhs();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonExpression#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>O</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.comparisonExpression#getO()
   * @see #getcomparisonExpression()
   * @generated
   */
  EAttribute getcomparisonExpression_O();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.comparisonExpression#getRhs()
   * @see #getcomparisonExpression()
   * @generated
   */
  EReference getcomparisonExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart <em>comparison Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>comparison Part</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart
   * @generated
   */
  EClass getcomparisonPart();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getT()
   * @see #getcomparisonPart()
   * @generated
   */
  EAttribute getcomparisonPart_T();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getN()
   * @see #getcomparisonPart()
   * @generated
   */
  EAttribute getcomparisonPart_N();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getDf <em>Df</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Df</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getDf()
   * @see #getcomparisonPart()
   * @generated
   */
  EAttribute getcomparisonPart_Df();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getU <em>U</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>U</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getU()
   * @see #getcomparisonPart()
   * @generated
   */
  EReference getcomparisonPart_U();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getL()
   * @see #getcomparisonPart()
   * @generated
   */
  EReference getcomparisonPart_L();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getD <em>D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>D</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.comparisonPart#getD()
   * @see #getcomparisonPart()
   * @generated
   */
  EAttribute getcomparisonPart_D();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.upperFunction <em>upper Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>upper Function</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.upperFunction
   * @generated
   */
  EClass getupperFunction();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.upperFunction#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.upperFunction#getT()
   * @see #getupperFunction()
   * @generated
   */
  EAttribute getupperFunction_T();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.lowerFunction <em>lower Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>lower Function</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.lowerFunction
   * @generated
   */
  EClass getlowerFunction();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.lowerFunction#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.lowerFunction#getT()
   * @see #getlowerFunction()
   * @generated
   */
  EAttribute getlowerFunction_T();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.rangeValidationRuleDeclaration <em>range Validation Rule Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>range Validation Rule Declaration</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.rangeValidationRuleDeclaration
   * @generated
   */
  EClass getrangeValidationRuleDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.rangeValidationRuleDeclaration#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.rangeValidationRuleDeclaration#getRange()
   * @see #getrangeValidationRuleDeclaration()
   * @generated
   */
  EReference getrangeValidationRuleDeclaration_Range();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.regexValidationRuleDeclaration <em>regex Validation Rule Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>regex Validation Rule Declaration</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.regexValidationRuleDeclaration
   * @generated
   */
  EClass getregexValidationRuleDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.regexValidationRuleDeclaration#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exp</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.regexValidationRuleDeclaration#getExp()
   * @see #getregexValidationRuleDeclaration()
   * @generated
   */
  EAttribute getregexValidationRuleDeclaration_Exp();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.range <em>range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>range</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.range
   * @generated
   */
  EClass getrange();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.range#getF <em>F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>F</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.range#getF()
   * @see #getrange()
   * @generated
   */
  EAttribute getrange_F();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.range#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.range#getT()
   * @see #getrange()
   * @generated
   */
  EAttribute getrange_T();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.uniquenessValidationRuleDeclaration <em>uniqueness Validation Rule Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>uniqueness Validation Rule Declaration</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.uniquenessValidationRuleDeclaration
   * @generated
   */
  EClass getuniquenessValidationRuleDeclaration();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.errorMessage <em>error Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>error Message</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.errorMessage
   * @generated
   */
  EClass geterrorMessage();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.errorMessage#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.errorMessage#getMessage()
   * @see #geterrorMessage()
   * @generated
   */
  EAttribute geterrorMessage_Message();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.nativeValidationRuleDeclaration <em>native Validation Rule Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>native Validation Rule Declaration</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.nativeValidationRuleDeclaration
   * @generated
   */
  EClass getnativeValidationRuleDeclaration();

  /**
   * Returns the meta object for the reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.nativeValidationRuleDeclaration#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Field</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.nativeValidationRuleDeclaration#getField()
   * @see #getnativeValidationRuleDeclaration()
   * @generated
   */
  EReference getnativeValidationRuleDeclaration_Field();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.nativeValidationRuleDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.nativeValidationRuleDeclaration#getType()
   * @see #getnativeValidationRuleDeclaration()
   * @generated
   */
  EAttribute getnativeValidationRuleDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.nativeValidationRuleDeclaration#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.nativeValidationRuleDeclaration#getMessage()
   * @see #getnativeValidationRuleDeclaration()
   * @generated
   */
  EAttribute getnativeValidationRuleDeclaration_Message();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration <em>function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function Declaration</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration
   * @generated
   */
  EClass getfunctionDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getB()
   * @see #getfunctionDeclaration()
   * @generated
   */
  EAttribute getfunctionDeclaration_B();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getName()
   * @see #getfunctionDeclaration()
   * @generated
   */
  EAttribute getfunctionDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getArg()
   * @see #getfunctionDeclaration()
   * @generated
   */
  EReference getfunctionDeclaration_Arg();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getBody()
   * @see #getfunctionDeclaration()
   * @generated
   */
  EReference getfunctionDeclaration_Body();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getM <em>M</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>M</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionDeclaration#getM()
   * @see #getfunctionDeclaration()
   * @generated
   */
  EReference getfunctionDeclaration_M();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionArgumentDeclaration <em>function Argument Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function Argument Declaration</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionArgumentDeclaration
   * @generated
   */
  EClass getfunctionArgumentDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionArgumentDeclaration#getF <em>F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>F</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionArgumentDeclaration#getF()
   * @see #getfunctionArgumentDeclaration()
   * @generated
   */
  EReference getfunctionArgumentDeclaration_F();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionArgumentBody <em>function Argument Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function Argument Body</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionArgumentBody
   * @generated
   */
  EClass getfunctionArgumentBody();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionArgumentBody#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionArgumentBody#getName()
   * @see #getfunctionArgumentBody()
   * @generated
   */
  EAttribute getfunctionArgumentBody_Name();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionCall <em>function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function Call</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionCall
   * @generated
   */
  EClass getfunctionCall();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionCall#getF <em>F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>F</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionCall#getF()
   * @see #getfunctionCall()
   * @generated
   */
  EReference getfunctionCall_F();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionArguments <em>function Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function Arguments</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionArguments
   * @generated
   */
  EClass getfunctionArguments();

  /**
   * Returns the meta object for the attribute list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionArguments#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>A</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionArguments#getA()
   * @see #getfunctionArguments()
   * @generated
   */
  EAttribute getfunctionArguments_A();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionBody <em>function Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function Body</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionBody
   * @generated
   */
  EClass getfunctionBody();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionBody#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionBody#getS()
   * @see #getfunctionBody()
   * @generated
   */
  EReference getfunctionBody_S();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.functionBody#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.functionBody#getE()
   * @see #getfunctionBody()
   * @generated
   */
  EReference getfunctionBody_E();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.statement <em>statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statement</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.statement
   * @generated
   */
  EClass getstatement();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.unionRule <em>union Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>union Rule</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.unionRule
   * @generated
   */
  EClass getunionRule();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.unionRule#getQ <em>Q</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Q</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.unionRule#getQ()
   * @see #getunionRule()
   * @generated
   */
  EReference getunionRule_Q();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.queryRule <em>query Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>query Rule</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.queryRule
   * @generated
   */
  EClass getqueryRule();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom <em>select From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>select From</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom
   * @generated
   */
  EClass getselectFrom();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getWhere <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getWhere()
   * @see #getselectFrom()
   * @generated
   */
  EReference getselectFrom_Where();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getGroupBy <em>Group By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Group By</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getGroupBy()
   * @see #getselectFrom()
   * @generated
   */
  EReference getselectFrom_GroupBy();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getOrderBy <em>Order By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Order By</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getOrderBy()
   * @see #getselectFrom()
   * @generated
   */
  EReference getselectFrom_OrderBy();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getS()
   * @see #getselectFrom()
   * @generated
   */
  EReference getselectFrom_S();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.selectFrom#getFrom()
   * @see #getselectFrom()
   * @generated
   */
  EReference getselectFrom_From();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectClause <em>select Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>select Clause</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.selectClause
   * @generated
   */
  EClass getselectClause();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.newExpression <em>new Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>new Expression</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.newExpression
   * @generated
   */
  EClass getnewExpression();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.newExpression#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>P</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.newExpression#getP()
   * @see #getnewExpression()
   * @generated
   */
  EAttribute getnewExpression_P();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.newExpression#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.newExpression#getS()
   * @see #getnewExpression()
   * @generated
   */
  EReference getnewExpression_S();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromClause <em>from Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>from Clause</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fromClause
   * @generated
   */
  EClass getfromClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromClause#getFromRange <em>From Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>From Range</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fromClause#getFromRange()
   * @see #getfromClause()
   * @generated
   */
  EReference getfromClause_FromRange();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromClause#getFromJoin <em>From Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>From Join</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fromClause#getFromJoin()
   * @see #getfromClause()
   * @generated
   */
  EReference getfromClause_FromJoin();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromJoin <em>from Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>from Join</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fromJoin
   * @generated
   */
  EClass getfromJoin();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.withClause <em>with Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>with Clause</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.withClause
   * @generated
   */
  EClass getwithClause();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.withClause#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.withClause#getE()
   * @see #getwithClause()
   * @generated
   */
  EReference getwithClause_E();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromRange <em>from Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>from Range</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fromRange
   * @generated
   */
  EClass getfromRange();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromRange#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fromRange#getAlias()
   * @see #getfromRange()
   * @generated
   */
  EAttribute getfromRange_Alias();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromRange#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>P</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fromRange#getP()
   * @see #getfromRange()
   * @generated
   */
  EAttribute getfromRange_P();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath <em>from Class Or Outer Query Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>from Class Or Outer Query Path</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath
   * @generated
   */
  EClass getfromClassOrOuterQueryPath();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath#getW <em>W</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>W</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath#getW()
   * @see #getfromClassOrOuterQueryPath()
   * @generated
   */
  EReference getfromClassOrOuterQueryPath_W();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath#getAsAlias <em>As Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>As Alias</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath#getAsAlias()
   * @see #getfromClassOrOuterQueryPath()
   * @generated
   */
  EReference getfromClassOrOuterQueryPath_AsAlias();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath#getPropertyFetch <em>Property Fetch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Fetch</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.fromClassOrOuterQueryPath#getPropertyFetch()
   * @see #getfromClassOrOuterQueryPath()
   * @generated
   */
  EAttribute getfromClassOrOuterQueryPath_PropertyFetch();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.inCollectionElementsDeclaration <em>in Collection Elements Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>in Collection Elements Declaration</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.inCollectionElementsDeclaration
   * @generated
   */
  EClass getinCollectionElementsDeclaration();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.asAlias <em>as Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>as Alias</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.asAlias
   * @generated
   */
  EClass getasAlias();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.asAlias#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.asAlias#getAlias()
   * @see #getasAlias()
   * @generated
   */
  EAttribute getasAlias_Alias();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.groupByClause <em>group By Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>group By Clause</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.groupByClause
   * @generated
   */
  EClass getgroupByClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.groupByClause#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.groupByClause#getE()
   * @see #getgroupByClause()
   * @generated
   */
  EReference getgroupByClause_E();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.groupByClause#getH <em>H</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>H</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.groupByClause#getH()
   * @see #getgroupByClause()
   * @generated
   */
  EReference getgroupByClause_H();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.orderByClause <em>order By Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>order By Clause</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.orderByClause
   * @generated
   */
  EClass getorderByClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.orderByClause#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>O</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.orderByClause#getO()
   * @see #getorderByClause()
   * @generated
   */
  EReference getorderByClause_O();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.orderElement <em>order Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>order Element</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.orderElement
   * @generated
   */
  EClass getorderElement();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.havingClause <em>having Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>having Clause</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.havingClause
   * @generated
   */
  EClass gethavingClause();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.havingClause#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.havingClause#getE()
   * @see #gethavingClause()
   * @generated
   */
  EReference gethavingClause_E();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.whereClause <em>where Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>where Clause</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.whereClause
   * @generated
   */
  EClass getwhereClause();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.whereClause#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.whereClause#getE()
   * @see #getwhereClause()
   * @generated
   */
  EReference getwhereClause_E();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectedPropertiesList <em>selected Properties List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>selected Properties List</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.selectedPropertiesList
   * @generated
   */
  EClass getselectedPropertiesList();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectedPropertiesList#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>A</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.selectedPropertiesList#getA()
   * @see #getselectedPropertiesList()
   * @generated
   */
  EReference getselectedPropertiesList_A();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.aliasedExpression <em>aliased Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>aliased Expression</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.aliasedExpression
   * @generated
   */
  EClass getaliasedExpression();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.expression <em>expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expression</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.expression
   * @generated
   */
  EClass getexpression();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.expression#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.expression#getId()
   * @see #getexpression()
   * @generated
   */
  EAttribute getexpression_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.expression#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.expression#getV()
   * @see #getexpression()
   * @generated
   */
  EReference getexpression_V();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.logicalOrExpression <em>logical Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>logical Or Expression</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.logicalOrExpression
   * @generated
   */
  EClass getlogicalOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.logicalOrExpression#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>L</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.logicalOrExpression#getL()
   * @see #getlogicalOrExpression()
   * @generated
   */
  EReference getlogicalOrExpression_L();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.logicalAndExpression <em>logical And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>logical And Expression</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.logicalAndExpression
   * @generated
   */
  EClass getlogicalAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.logicalAndExpression#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>N</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.logicalAndExpression#getN()
   * @see #getlogicalAndExpression()
   * @generated
   */
  EReference getlogicalAndExpression_N();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.negatedExpression <em>negated Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>negated Expression</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.negatedExpression
   * @generated
   */
  EClass getnegatedExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.negatedExpression#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>N</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.negatedExpression#getN()
   * @see #getnegatedExpression()
   * @generated
   */
  EReference getnegatedExpression_N();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.equalityExpression <em>equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>equality Expression</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.equalityExpression
   * @generated
   */
  EClass getequalityExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.equalityExpression#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>R</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.equalityExpression#getR()
   * @see #getequalityExpression()
   * @generated
   */
  EReference getequalityExpression_R();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.relationalExpression <em>relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>relational Expression</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.relationalExpression
   * @generated
   */
  EClass getrelationalExpression();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.likeEscape <em>like Escape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>like Escape</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.likeEscape
   * @generated
   */
  EClass getlikeEscape();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.likeEscape#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.likeEscape#getC()
   * @see #getlikeEscape()
   * @generated
   */
  EReference getlikeEscape_C();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.betweenList <em>between List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>between List</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.betweenList
   * @generated
   */
  EClass getbetweenList();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.betweenList#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>C</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.betweenList#getC()
   * @see #getbetweenList()
   * @generated
   */
  EReference getbetweenList_C();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation <em>concatenation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>concatenation</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.concatenation
   * @generated
   */
  EClass getconcatenation();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>A</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getA()
   * @see #getconcatenation()
   * @generated
   */
  EReference getconcatenation_A();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getI <em>I</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>I</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getI()
   * @see #getconcatenation()
   * @generated
   */
  EReference getconcatenation_I();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getB()
   * @see #getconcatenation()
   * @generated
   */
  EReference getconcatenation_B();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getC()
   * @see #getconcatenation()
   * @generated
   */
  EReference getconcatenation_C();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getL()
   * @see #getconcatenation()
   * @generated
   */
  EReference getconcatenation_L();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>P</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.concatenation#getP()
   * @see #getconcatenation()
   * @generated
   */
  EAttribute getconcatenation_P();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.additiveExpression <em>additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>additive Expression</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.additiveExpression
   * @generated
   */
  EClass getadditiveExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.additiveExpression#getM <em>M</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>M</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.additiveExpression#getM()
   * @see #getadditiveExpression()
   * @generated
   */
  EReference getadditiveExpression_M();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.multiplyExpression <em>multiply Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>multiply Expression</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.multiplyExpression
   * @generated
   */
  EClass getmultiplyExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.multiplyExpression#getU <em>U</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>U</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.multiplyExpression#getU()
   * @see #getmultiplyExpression()
   * @generated
   */
  EReference getmultiplyExpression_U();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.unaryExpression <em>unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>unary Expression</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.unaryExpression
   * @generated
   */
  EClass getunaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.unaryExpression#getU <em>U</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>U</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.unaryExpression#getU()
   * @see #getunaryExpression()
   * @generated
   */
  EReference getunaryExpression_U();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.caseExpression <em>case Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>case Expression</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.caseExpression
   * @generated
   */
  EClass getcaseExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.caseExpression#getW <em>W</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>W</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.caseExpression#getW()
   * @see #getcaseExpression()
   * @generated
   */
  EReference getcaseExpression_W();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.caseExpression#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.caseExpression#getE()
   * @see #getcaseExpression()
   * @generated
   */
  EReference getcaseExpression_E();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.caseExpression#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>A</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.caseExpression#getA()
   * @see #getcaseExpression()
   * @generated
   */
  EReference getcaseExpression_A();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.whenClause <em>when Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>when Clause</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.whenClause
   * @generated
   */
  EClass getwhenClause();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.whenClause#getWhenExpr <em>When Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When Expr</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.whenClause#getWhenExpr()
   * @see #getwhenClause()
   * @generated
   */
  EReference getwhenClause_WhenExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.whenClause#getThenExpr <em>Then Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Expr</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.whenClause#getThenExpr()
   * @see #getwhenClause()
   * @generated
   */
  EReference getwhenClause_ThenExpr();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.altWhenClause <em>alt When Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>alt When Clause</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.altWhenClause
   * @generated
   */
  EClass getaltWhenClause();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.altWhenClause#getW <em>W</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>W</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.altWhenClause#getW()
   * @see #getaltWhenClause()
   * @generated
   */
  EReference getaltWhenClause_W();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.altWhenClause#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.altWhenClause#getT()
   * @see #getaltWhenClause()
   * @generated
   */
  EReference getaltWhenClause_T();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.elseClause <em>else Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>else Clause</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.elseClause
   * @generated
   */
  EClass getelseClause();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.elseClause#getU <em>U</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>U</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.elseClause#getU()
   * @see #getelseClause()
   * @generated
   */
  EReference getelseClause_U();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.quantifiedExpression <em>quantified Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>quantified Expression</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.quantifiedExpression
   * @generated
   */
  EClass getquantifiedExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.quantifiedExpression#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.quantifiedExpression#getS()
   * @see #getquantifiedExpression()
   * @generated
   */
  EReference getquantifiedExpression_S();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.atom <em>atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>atom</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.atom
   * @generated
   */
  EClass getatom();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression <em>primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>primary Expression</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression
   * @generated
   */
  EClass getprimaryExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression#getE()
   * @see #getprimaryExpression()
   * @generated
   */
  EReference getprimaryExpression_E();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression#getExp()
   * @see #getprimaryExpression()
   * @generated
   */
  EReference getprimaryExpression_Exp();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ident</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression#getIdent()
   * @see #getprimaryExpression()
   * @generated
   */
  EReference getprimaryExpression_Ident();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.primaryExpression#getS()
   * @see #getprimaryExpression()
   * @generated
   */
  EReference getprimaryExpression_S();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.expressionOrVector <em>expression Or Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expression Or Vector</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.expressionOrVector
   * @generated
   */
  EClass getexpressionOrVector();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.vectorExpr <em>vector Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>vector Expr</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.vectorExpr
   * @generated
   */
  EClass getvectorExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.vectorExpr#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.vectorExpr#getE()
   * @see #getvectorExpr()
   * @generated
   */
  EReference getvectorExpr_E();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.identPrimary <em>ident Primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ident Primary</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.identPrimary
   * @generated
   */
  EClass getidentPrimary();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.identPrimary#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.identPrimary#getE()
   * @see #getidentPrimary()
   * @generated
   */
  EReference getidentPrimary_E();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.aggregate <em>aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>aggregate</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.aggregate
   * @generated
   */
  EClass getaggregate();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.aggregate#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.aggregate#getA()
   * @see #getaggregate()
   * @generated
   */
  EReference getaggregate_A();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.compoundExpr <em>compound Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>compound Expr</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.compoundExpr
   * @generated
   */
  EClass getcompoundExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.compoundExpr#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.compoundExpr#getE()
   * @see #getcompoundExpr()
   * @generated
   */
  EReference getcompoundExpr_E();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.compoundExpr#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.compoundExpr#getS()
   * @see #getcompoundExpr()
   * @generated
   */
  EReference getcompoundExpr_S();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.exprList <em>expr List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expr List</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.exprList
   * @generated
   */
  EClass getexprList();

  /**
   * Returns the meta object for the containment reference list '{@link org.makumba.devel.plugin.eclipse.mdd.editor.exprList#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.exprList#getE()
   * @see #getexprList()
   * @generated
   */
  EReference getexprList_E();

  /**
   * Returns the meta object for the attribute '{@link org.makumba.devel.plugin.eclipse.mdd.editor.exprList#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.exprList#getId()
   * @see #getexprList()
   * @generated
   */
  EAttribute getexprList_Id();

  /**
   * Returns the meta object for class '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectCause <em>select Cause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>select Cause</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.selectCause
   * @generated
   */
  EClass getselectCause();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectCause#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.selectCause#getS()
   * @see #getselectCause()
   * @generated
   */
  EReference getselectCause_S();

  /**
   * Returns the meta object for the containment reference '{@link org.makumba.devel.plugin.eclipse.mdd.editor.selectCause#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>N</em>'.
   * @see org.makumba.devel.plugin.eclipse.mdd.editor.selectCause#getN()
   * @see #getselectCause()
   * @generated
   */
  EReference getselectCause_N();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EditorFactory getEditorFactory();

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
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.dataDefinitionImpl <em>data Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.dataDefinitionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getdataDefinition()
     * @generated
     */
    EClass DATA_DEFINITION = eINSTANCE.getdataDefinition();

    /**
     * The meta object literal for the '<em><b>D</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_DEFINITION__D = eINSTANCE.getdataDefinition_D();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.declarationImpl <em>declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.declarationImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getdeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getdeclaration();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fieldDeclarationImpl <em>field Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.fieldDeclarationImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfieldDeclaration()
     * @generated
     */
    EClass FIELD_DECLARATION = eINSTANCE.getfieldDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_DECLARATION__NAME = eINSTANCE.getfieldDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__MODIFIERS = eINSTANCE.getfieldDeclaration_Modifiers();

    /**
     * The meta object literal for the '<em><b>Typedef</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__TYPEDEF = eINSTANCE.getfieldDeclaration_Typedef();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.modifiersImpl <em>modifiers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.modifiersImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getmodifiers()
     * @generated
     */
    EClass MODIFIERS = eINSTANCE.getmodifiers();

    /**
     * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIERS__UNIQUE = eINSTANCE.getmodifiers_Unique();

    /**
     * The meta object literal for the '<em><b>Fixed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIERS__FIXED = eINSTANCE.getmodifiers_Fixed();

    /**
     * The meta object literal for the '<em><b>Not Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIERS__NOT_NULL = eINSTANCE.getmodifiers_NotNull();

    /**
     * The meta object literal for the '<em><b>Not Empty</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIERS__NOT_EMPTY = eINSTANCE.getmodifiers_NotEmpty();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fieldTypeImpl <em>field Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.fieldTypeImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfieldType()
     * @generated
     */
    EClass FIELD_TYPE = eINSTANCE.getfieldType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_TYPE__TYPE = eINSTANCE.getfieldType_Type();

    /**
     * The meta object literal for the '<em><b>Type Dec</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_TYPE__TYPE_DEC = eINSTANCE.getfieldType_TypeDec();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.intEnumImpl <em>int Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.intEnumImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getintEnum()
     * @generated
     */
    EClass INT_ENUM = eINSTANCE.getintEnum();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INT_ENUM__VALUES = eINSTANCE.getintEnum_Values();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.charEnumImpl <em>char Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.charEnumImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getcharEnum()
     * @generated
     */
    EClass CHAR_ENUM = eINSTANCE.getcharEnum();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHAR_ENUM__VALUES = eINSTANCE.getcharEnum_Values();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.enumValueImpl <em>enum Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.enumValueImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getenumValue()
     * @generated
     */
    EClass ENUM_VALUE = eINSTANCE.getenumValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_VALUE__NAME = eINSTANCE.getenumValue_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_VALUE__VALUE = eINSTANCE.getenumValue_Value();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.charTypeImpl <em>char Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.charTypeImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getcharType()
     * @generated
     */
    EClass CHAR_TYPE = eINSTANCE.getcharType();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHAR_TYPE__LENGTH = eINSTANCE.getcharType_Length();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.pointerImpl <em>pointer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.pointerImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getpointer()
     * @generated
     */
    EClass POINTER = eINSTANCE.getpointer();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.setTypeImpl <em>set Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.setTypeImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getsetType()
     * @generated
     */
    EClass SET_TYPE = eINSTANCE.getsetType();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.subFieldDeclarationImpl <em>sub Field Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.subFieldDeclarationImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getsubFieldDeclaration()
     * @generated
     */
    EClass SUB_FIELD_DECLARATION = eINSTANCE.getsubFieldDeclaration();

    /**
     * The meta object literal for the '<em><b>Sub Field Of</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_FIELD_DECLARATION__SUB_FIELD_OF = eINSTANCE.getsubFieldDeclaration_SubFieldOf();

    /**
     * The meta object literal for the '<em><b>D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_FIELD_DECLARATION__D = eINSTANCE.getsubFieldDeclaration_D();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.titleDeclarationImpl <em>title Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.titleDeclarationImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#gettitleDeclaration()
     * @generated
     */
    EClass TITLE_DECLARATION = eINSTANCE.gettitleDeclaration();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TITLE_DECLARATION__TITLE = eINSTANCE.gettitleDeclaration_Title();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.titleImpl <em>title</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.titleImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#gettitle()
     * @generated
     */
    EClass TITLE = eINSTANCE.gettitle();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TITLE__NAME = eINSTANCE.gettitle_Name();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.includeDeclarationImpl <em>include Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.includeDeclarationImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getincludeDeclaration()
     * @generated
     */
    EClass INCLUDE_DECLARATION = eINSTANCE.getincludeDeclaration();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE_DECLARATION__IMPORTED_NAMESPACE = eINSTANCE.getincludeDeclaration_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.typeDeclarationImpl <em>type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.typeDeclarationImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#gettypeDeclaration()
     * @generated
     */
    EClass TYPE_DECLARATION = eINSTANCE.gettypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DECLARATION__NAME = eINSTANCE.gettypeDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Field Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__FIELD_TYPE = eINSTANCE.gettypeDeclaration_FieldType();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.validationRuleDeclarationImpl <em>validation Rule Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.validationRuleDeclarationImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getvalidationRuleDeclaration()
     * @generated
     */
    EClass VALIDATION_RULE_DECLARATION = eINSTANCE.getvalidationRuleDeclaration();

    /**
     * The meta object literal for the '<em><b>Error Message</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATION_RULE_DECLARATION__ERROR_MESSAGE = eINSTANCE.getvalidationRuleDeclaration_ErrorMessage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALIDATION_RULE_DECLARATION__NAME = eINSTANCE.getvalidationRuleDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATION_RULE_DECLARATION__ARGS = eINSTANCE.getvalidationRuleDeclaration_Args();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonValidationRuleDeclarationImpl <em>comparison Validation Rule Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonValidationRuleDeclarationImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getcomparisonValidationRuleDeclaration()
     * @generated
     */
    EClass COMPARISON_VALIDATION_RULE_DECLARATION = eINSTANCE.getcomparisonValidationRuleDeclaration();

    /**
     * The meta object literal for the '<em><b>Comparison Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON_VALIDATION_RULE_DECLARATION__COMPARISON_EXP = eINSTANCE.getcomparisonValidationRuleDeclaration_ComparisonExp();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonExpressionImpl <em>comparison Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonExpressionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getcomparisonExpression()
     * @generated
     */
    EClass COMPARISON_EXPRESSION = eINSTANCE.getcomparisonExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON_EXPRESSION__LHS = eINSTANCE.getcomparisonExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>O</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON_EXPRESSION__O = eINSTANCE.getcomparisonExpression_O();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON_EXPRESSION__RHS = eINSTANCE.getcomparisonExpression_Rhs();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonPartImpl <em>comparison Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.comparisonPartImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getcomparisonPart()
     * @generated
     */
    EClass COMPARISON_PART = eINSTANCE.getcomparisonPart();

    /**
     * The meta object literal for the '<em><b>T</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON_PART__T = eINSTANCE.getcomparisonPart_T();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON_PART__N = eINSTANCE.getcomparisonPart_N();

    /**
     * The meta object literal for the '<em><b>Df</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON_PART__DF = eINSTANCE.getcomparisonPart_Df();

    /**
     * The meta object literal for the '<em><b>U</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON_PART__U = eINSTANCE.getcomparisonPart_U();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON_PART__L = eINSTANCE.getcomparisonPart_L();

    /**
     * The meta object literal for the '<em><b>D</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON_PART__D = eINSTANCE.getcomparisonPart_D();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.upperFunctionImpl <em>upper Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.upperFunctionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getupperFunction()
     * @generated
     */
    EClass UPPER_FUNCTION = eINSTANCE.getupperFunction();

    /**
     * The meta object literal for the '<em><b>T</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UPPER_FUNCTION__T = eINSTANCE.getupperFunction_T();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.lowerFunctionImpl <em>lower Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.lowerFunctionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getlowerFunction()
     * @generated
     */
    EClass LOWER_FUNCTION = eINSTANCE.getlowerFunction();

    /**
     * The meta object literal for the '<em><b>T</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOWER_FUNCTION__T = eINSTANCE.getlowerFunction_T();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.rangeValidationRuleDeclarationImpl <em>range Validation Rule Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.rangeValidationRuleDeclarationImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getrangeValidationRuleDeclaration()
     * @generated
     */
    EClass RANGE_VALIDATION_RULE_DECLARATION = eINSTANCE.getrangeValidationRuleDeclaration();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE_VALIDATION_RULE_DECLARATION__RANGE = eINSTANCE.getrangeValidationRuleDeclaration_Range();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.regexValidationRuleDeclarationImpl <em>regex Validation Rule Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.regexValidationRuleDeclarationImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getregexValidationRuleDeclaration()
     * @generated
     */
    EClass REGEX_VALIDATION_RULE_DECLARATION = eINSTANCE.getregexValidationRuleDeclaration();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGEX_VALIDATION_RULE_DECLARATION__EXP = eINSTANCE.getregexValidationRuleDeclaration_Exp();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.rangeImpl <em>range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.rangeImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getrange()
     * @generated
     */
    EClass RANGE = eINSTANCE.getrange();

    /**
     * The meta object literal for the '<em><b>F</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE__F = eINSTANCE.getrange_F();

    /**
     * The meta object literal for the '<em><b>T</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE__T = eINSTANCE.getrange_T();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.uniquenessValidationRuleDeclarationImpl <em>uniqueness Validation Rule Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.uniquenessValidationRuleDeclarationImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getuniquenessValidationRuleDeclaration()
     * @generated
     */
    EClass UNIQUENESS_VALIDATION_RULE_DECLARATION = eINSTANCE.getuniquenessValidationRuleDeclaration();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.errorMessageImpl <em>error Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.errorMessageImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#geterrorMessage()
     * @generated
     */
    EClass ERROR_MESSAGE = eINSTANCE.geterrorMessage();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_MESSAGE__MESSAGE = eINSTANCE.geterrorMessage_Message();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.nativeValidationRuleDeclarationImpl <em>native Validation Rule Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.nativeValidationRuleDeclarationImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getnativeValidationRuleDeclaration()
     * @generated
     */
    EClass NATIVE_VALIDATION_RULE_DECLARATION = eINSTANCE.getnativeValidationRuleDeclaration();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NATIVE_VALIDATION_RULE_DECLARATION__FIELD = eINSTANCE.getnativeValidationRuleDeclaration_Field();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NATIVE_VALIDATION_RULE_DECLARATION__TYPE = eINSTANCE.getnativeValidationRuleDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NATIVE_VALIDATION_RULE_DECLARATION__MESSAGE = eINSTANCE.getnativeValidationRuleDeclaration_Message();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionDeclarationImpl <em>function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionDeclarationImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfunctionDeclaration()
     * @generated
     */
    EClass FUNCTION_DECLARATION = eINSTANCE.getfunctionDeclaration();

    /**
     * The meta object literal for the '<em><b>B</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECLARATION__B = eINSTANCE.getfunctionDeclaration_B();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECLARATION__NAME = eINSTANCE.getfunctionDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__ARG = eINSTANCE.getfunctionDeclaration_Arg();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__BODY = eINSTANCE.getfunctionDeclaration_Body();

    /**
     * The meta object literal for the '<em><b>M</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__M = eINSTANCE.getfunctionDeclaration_M();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionArgumentDeclarationImpl <em>function Argument Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionArgumentDeclarationImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfunctionArgumentDeclaration()
     * @generated
     */
    EClass FUNCTION_ARGUMENT_DECLARATION = eINSTANCE.getfunctionArgumentDeclaration();

    /**
     * The meta object literal for the '<em><b>F</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_ARGUMENT_DECLARATION__F = eINSTANCE.getfunctionArgumentDeclaration_F();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionArgumentBodyImpl <em>function Argument Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionArgumentBodyImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfunctionArgumentBody()
     * @generated
     */
    EClass FUNCTION_ARGUMENT_BODY = eINSTANCE.getfunctionArgumentBody();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_ARGUMENT_BODY__NAME = eINSTANCE.getfunctionArgumentBody_Name();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionCallImpl <em>function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionCallImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getfunctionCall();

    /**
     * The meta object literal for the '<em><b>F</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__F = eINSTANCE.getfunctionCall_F();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionArgumentsImpl <em>function Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionArgumentsImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfunctionArguments()
     * @generated
     */
    EClass FUNCTION_ARGUMENTS = eINSTANCE.getfunctionArguments();

    /**
     * The meta object literal for the '<em><b>A</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_ARGUMENTS__A = eINSTANCE.getfunctionArguments_A();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionBodyImpl <em>function Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.functionBodyImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfunctionBody()
     * @generated
     */
    EClass FUNCTION_BODY = eINSTANCE.getfunctionBody();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_BODY__S = eINSTANCE.getfunctionBody_S();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_BODY__E = eINSTANCE.getfunctionBody_E();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.statementImpl <em>statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.statementImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getstatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getstatement();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.unionRuleImpl <em>union Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.unionRuleImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getunionRule()
     * @generated
     */
    EClass UNION_RULE = eINSTANCE.getunionRule();

    /**
     * The meta object literal for the '<em><b>Q</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNION_RULE__Q = eINSTANCE.getunionRule_Q();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.queryRuleImpl <em>query Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.queryRuleImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getqueryRule()
     * @generated
     */
    EClass QUERY_RULE = eINSTANCE.getqueryRule();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectFromImpl <em>select From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectFromImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getselectFrom()
     * @generated
     */
    EClass SELECT_FROM = eINSTANCE.getselectFrom();

    /**
     * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_FROM__WHERE = eINSTANCE.getselectFrom_Where();

    /**
     * The meta object literal for the '<em><b>Group By</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_FROM__GROUP_BY = eINSTANCE.getselectFrom_GroupBy();

    /**
     * The meta object literal for the '<em><b>Order By</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_FROM__ORDER_BY = eINSTANCE.getselectFrom_OrderBy();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_FROM__S = eINSTANCE.getselectFrom_S();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_FROM__FROM = eINSTANCE.getselectFrom_From();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectClauseImpl <em>select Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectClauseImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getselectClause()
     * @generated
     */
    EClass SELECT_CLAUSE = eINSTANCE.getselectClause();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.newExpressionImpl <em>new Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.newExpressionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getnewExpression()
     * @generated
     */
    EClass NEW_EXPRESSION = eINSTANCE.getnewExpression();

    /**
     * The meta object literal for the '<em><b>P</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW_EXPRESSION__P = eINSTANCE.getnewExpression_P();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_EXPRESSION__S = eINSTANCE.getnewExpression_S();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromClauseImpl <em>from Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromClauseImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfromClause()
     * @generated
     */
    EClass FROM_CLAUSE = eINSTANCE.getfromClause();

    /**
     * The meta object literal for the '<em><b>From Range</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_CLAUSE__FROM_RANGE = eINSTANCE.getfromClause_FromRange();

    /**
     * The meta object literal for the '<em><b>From Join</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_CLAUSE__FROM_JOIN = eINSTANCE.getfromClause_FromJoin();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromJoinImpl <em>from Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromJoinImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfromJoin()
     * @generated
     */
    EClass FROM_JOIN = eINSTANCE.getfromJoin();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.withClauseImpl <em>with Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.withClauseImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getwithClause()
     * @generated
     */
    EClass WITH_CLAUSE = eINSTANCE.getwithClause();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_CLAUSE__E = eINSTANCE.getwithClause_E();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromRangeImpl <em>from Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromRangeImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfromRange()
     * @generated
     */
    EClass FROM_RANGE = eINSTANCE.getfromRange();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FROM_RANGE__ALIAS = eINSTANCE.getfromRange_Alias();

    /**
     * The meta object literal for the '<em><b>P</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FROM_RANGE__P = eINSTANCE.getfromRange_P();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromClassOrOuterQueryPathImpl <em>from Class Or Outer Query Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.fromClassOrOuterQueryPathImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getfromClassOrOuterQueryPath()
     * @generated
     */
    EClass FROM_CLASS_OR_OUTER_QUERY_PATH = eINSTANCE.getfromClassOrOuterQueryPath();

    /**
     * The meta object literal for the '<em><b>W</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_CLASS_OR_OUTER_QUERY_PATH__W = eINSTANCE.getfromClassOrOuterQueryPath_W();

    /**
     * The meta object literal for the '<em><b>As Alias</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_CLASS_OR_OUTER_QUERY_PATH__AS_ALIAS = eINSTANCE.getfromClassOrOuterQueryPath_AsAlias();

    /**
     * The meta object literal for the '<em><b>Property Fetch</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FROM_CLASS_OR_OUTER_QUERY_PATH__PROPERTY_FETCH = eINSTANCE.getfromClassOrOuterQueryPath_PropertyFetch();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.inCollectionElementsDeclarationImpl <em>in Collection Elements Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.inCollectionElementsDeclarationImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getinCollectionElementsDeclaration()
     * @generated
     */
    EClass IN_COLLECTION_ELEMENTS_DECLARATION = eINSTANCE.getinCollectionElementsDeclaration();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.asAliasImpl <em>as Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.asAliasImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getasAlias()
     * @generated
     */
    EClass AS_ALIAS = eINSTANCE.getasAlias();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AS_ALIAS__ALIAS = eINSTANCE.getasAlias_Alias();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.groupByClauseImpl <em>group By Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.groupByClauseImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getgroupByClause()
     * @generated
     */
    EClass GROUP_BY_CLAUSE = eINSTANCE.getgroupByClause();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_BY_CLAUSE__E = eINSTANCE.getgroupByClause_E();

    /**
     * The meta object literal for the '<em><b>H</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_BY_CLAUSE__H = eINSTANCE.getgroupByClause_H();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.orderByClauseImpl <em>order By Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.orderByClauseImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getorderByClause()
     * @generated
     */
    EClass ORDER_BY_CLAUSE = eINSTANCE.getorderByClause();

    /**
     * The meta object literal for the '<em><b>O</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDER_BY_CLAUSE__O = eINSTANCE.getorderByClause_O();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.orderElementImpl <em>order Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.orderElementImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getorderElement()
     * @generated
     */
    EClass ORDER_ELEMENT = eINSTANCE.getorderElement();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.havingClauseImpl <em>having Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.havingClauseImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#gethavingClause()
     * @generated
     */
    EClass HAVING_CLAUSE = eINSTANCE.gethavingClause();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAVING_CLAUSE__E = eINSTANCE.gethavingClause_E();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.whereClauseImpl <em>where Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.whereClauseImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getwhereClause()
     * @generated
     */
    EClass WHERE_CLAUSE = eINSTANCE.getwhereClause();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE_CLAUSE__E = eINSTANCE.getwhereClause_E();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectedPropertiesListImpl <em>selected Properties List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectedPropertiesListImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getselectedPropertiesList()
     * @generated
     */
    EClass SELECTED_PROPERTIES_LIST = eINSTANCE.getselectedPropertiesList();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTED_PROPERTIES_LIST__A = eINSTANCE.getselectedPropertiesList_A();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.aliasedExpressionImpl <em>aliased Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.aliasedExpressionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getaliasedExpression()
     * @generated
     */
    EClass ALIASED_EXPRESSION = eINSTANCE.getaliasedExpression();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.expressionImpl <em>expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.expressionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getexpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getexpression();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__ID = eINSTANCE.getexpression_Id();

    /**
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__V = eINSTANCE.getexpression_V();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.logicalOrExpressionImpl <em>logical Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.logicalOrExpressionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getlogicalOrExpression()
     * @generated
     */
    EClass LOGICAL_OR_EXPRESSION = eINSTANCE.getlogicalOrExpression();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_OR_EXPRESSION__L = eINSTANCE.getlogicalOrExpression_L();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.logicalAndExpressionImpl <em>logical And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.logicalAndExpressionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getlogicalAndExpression()
     * @generated
     */
    EClass LOGICAL_AND_EXPRESSION = eINSTANCE.getlogicalAndExpression();

    /**
     * The meta object literal for the '<em><b>N</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_AND_EXPRESSION__N = eINSTANCE.getlogicalAndExpression_N();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.negatedExpressionImpl <em>negated Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.negatedExpressionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getnegatedExpression()
     * @generated
     */
    EClass NEGATED_EXPRESSION = eINSTANCE.getnegatedExpression();

    /**
     * The meta object literal for the '<em><b>N</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATED_EXPRESSION__N = eINSTANCE.getnegatedExpression_N();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.equalityExpressionImpl <em>equality Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.equalityExpressionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getequalityExpression()
     * @generated
     */
    EClass EQUALITY_EXPRESSION = eINSTANCE.getequalityExpression();

    /**
     * The meta object literal for the '<em><b>R</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPRESSION__R = eINSTANCE.getequalityExpression_R();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.relationalExpressionImpl <em>relational Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.relationalExpressionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getrelationalExpression()
     * @generated
     */
    EClass RELATIONAL_EXPRESSION = eINSTANCE.getrelationalExpression();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.likeEscapeImpl <em>like Escape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.likeEscapeImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getlikeEscape()
     * @generated
     */
    EClass LIKE_ESCAPE = eINSTANCE.getlikeEscape();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIKE_ESCAPE__C = eINSTANCE.getlikeEscape_C();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.betweenListImpl <em>between List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.betweenListImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getbetweenList()
     * @generated
     */
    EClass BETWEEN_LIST = eINSTANCE.getbetweenList();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BETWEEN_LIST__C = eINSTANCE.getbetweenList_C();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.concatenationImpl <em>concatenation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.concatenationImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getconcatenation()
     * @generated
     */
    EClass CONCATENATION = eINSTANCE.getconcatenation();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCATENATION__A = eINSTANCE.getconcatenation_A();

    /**
     * The meta object literal for the '<em><b>I</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCATENATION__I = eINSTANCE.getconcatenation_I();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCATENATION__B = eINSTANCE.getconcatenation_B();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCATENATION__C = eINSTANCE.getconcatenation_C();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCATENATION__L = eINSTANCE.getconcatenation_L();

    /**
     * The meta object literal for the '<em><b>P</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCATENATION__P = eINSTANCE.getconcatenation_P();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.additiveExpressionImpl <em>additive Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.additiveExpressionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getadditiveExpression()
     * @generated
     */
    EClass ADDITIVE_EXPRESSION = eINSTANCE.getadditiveExpression();

    /**
     * The meta object literal for the '<em><b>M</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXPRESSION__M = eINSTANCE.getadditiveExpression_M();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.multiplyExpressionImpl <em>multiply Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.multiplyExpressionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getmultiplyExpression()
     * @generated
     */
    EClass MULTIPLY_EXPRESSION = eINSTANCE.getmultiplyExpression();

    /**
     * The meta object literal for the '<em><b>U</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLY_EXPRESSION__U = eINSTANCE.getmultiplyExpression_U();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.unaryExpressionImpl <em>unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.unaryExpressionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getunaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getunaryExpression();

    /**
     * The meta object literal for the '<em><b>U</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__U = eINSTANCE.getunaryExpression_U();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.caseExpressionImpl <em>case Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.caseExpressionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getcaseExpression()
     * @generated
     */
    EClass CASE_EXPRESSION = eINSTANCE.getcaseExpression();

    /**
     * The meta object literal for the '<em><b>W</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_EXPRESSION__W = eINSTANCE.getcaseExpression_W();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_EXPRESSION__E = eINSTANCE.getcaseExpression_E();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_EXPRESSION__A = eINSTANCE.getcaseExpression_A();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.whenClauseImpl <em>when Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.whenClauseImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getwhenClause()
     * @generated
     */
    EClass WHEN_CLAUSE = eINSTANCE.getwhenClause();

    /**
     * The meta object literal for the '<em><b>When Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_CLAUSE__WHEN_EXPR = eINSTANCE.getwhenClause_WhenExpr();

    /**
     * The meta object literal for the '<em><b>Then Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_CLAUSE__THEN_EXPR = eINSTANCE.getwhenClause_ThenExpr();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.altWhenClauseImpl <em>alt When Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.altWhenClauseImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getaltWhenClause()
     * @generated
     */
    EClass ALT_WHEN_CLAUSE = eINSTANCE.getaltWhenClause();

    /**
     * The meta object literal for the '<em><b>W</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALT_WHEN_CLAUSE__W = eINSTANCE.getaltWhenClause_W();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALT_WHEN_CLAUSE__T = eINSTANCE.getaltWhenClause_T();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.elseClauseImpl <em>else Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.elseClauseImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getelseClause()
     * @generated
     */
    EClass ELSE_CLAUSE = eINSTANCE.getelseClause();

    /**
     * The meta object literal for the '<em><b>U</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSE_CLAUSE__U = eINSTANCE.getelseClause_U();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.quantifiedExpressionImpl <em>quantified Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.quantifiedExpressionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getquantifiedExpression()
     * @generated
     */
    EClass QUANTIFIED_EXPRESSION = eINSTANCE.getquantifiedExpression();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_EXPRESSION__S = eINSTANCE.getquantifiedExpression_S();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.atomImpl <em>atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.atomImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getatom()
     * @generated
     */
    EClass ATOM = eINSTANCE.getatom();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.primaryExpressionImpl <em>primary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.primaryExpressionImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getprimaryExpression()
     * @generated
     */
    EClass PRIMARY_EXPRESSION = eINSTANCE.getprimaryExpression();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__E = eINSTANCE.getprimaryExpression_E();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__EXP = eINSTANCE.getprimaryExpression_Exp();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__IDENT = eINSTANCE.getprimaryExpression_Ident();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__S = eINSTANCE.getprimaryExpression_S();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.expressionOrVectorImpl <em>expression Or Vector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.expressionOrVectorImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getexpressionOrVector()
     * @generated
     */
    EClass EXPRESSION_OR_VECTOR = eINSTANCE.getexpressionOrVector();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.vectorExprImpl <em>vector Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.vectorExprImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getvectorExpr()
     * @generated
     */
    EClass VECTOR_EXPR = eINSTANCE.getvectorExpr();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR_EXPR__E = eINSTANCE.getvectorExpr_E();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.identPrimaryImpl <em>ident Primary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.identPrimaryImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getidentPrimary()
     * @generated
     */
    EClass IDENT_PRIMARY = eINSTANCE.getidentPrimary();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENT_PRIMARY__E = eINSTANCE.getidentPrimary_E();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.aggregateImpl <em>aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.aggregateImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getaggregate()
     * @generated
     */
    EClass AGGREGATE = eINSTANCE.getaggregate();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGGREGATE__A = eINSTANCE.getaggregate_A();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.compoundExprImpl <em>compound Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.compoundExprImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getcompoundExpr()
     * @generated
     */
    EClass COMPOUND_EXPR = eINSTANCE.getcompoundExpr();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_EXPR__E = eINSTANCE.getcompoundExpr_E();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_EXPR__S = eINSTANCE.getcompoundExpr_S();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.exprListImpl <em>expr List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.exprListImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getexprList()
     * @generated
     */
    EClass EXPR_LIST = eINSTANCE.getexprList();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_LIST__E = eINSTANCE.getexprList_E();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_LIST__ID = eINSTANCE.getexprList_Id();

    /**
     * The meta object literal for the '{@link org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectCauseImpl <em>select Cause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.selectCauseImpl
     * @see org.makumba.devel.plugin.eclipse.mdd.editor.impl.EditorPackageImpl#getselectCause()
     * @generated
     */
    EClass SELECT_CAUSE = eINSTANCE.getselectCause();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_CAUSE__S = eINSTANCE.getselectCause_S();

    /**
     * The meta object literal for the '<em><b>N</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_CAUSE__N = eINSTANCE.getselectCause_N();

  }

} //EditorPackage
