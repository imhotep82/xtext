/*
 * generated by Xtext
 */
grammar DebugInternalEpatchTestLanguage ;

// Rule EPatch
ruleEPatch :
	'epatch' RULE_ID '{' ruleImport* ruleNamedResource* ruleObjectRef* '}'
;

// Rule Import
ruleImport :
	ruleModelImport |
	ruleJavaImport |
	ruleExtensionImport
;

// Rule ModelImport
ruleModelImport :
	ruleResourceImport |
	ruleEPackageImport
;

// Rule ResourceImport
ruleResourceImport :
	'import' RULE_ID 'uri' RULE_STRING
;

// Rule EPackageImport
ruleEPackageImport :
	'import' RULE_ID 'ns' RULE_STRING
;

// Rule JavaImport
ruleJavaImport :
	'import' 'java' RULE_ID (
		'.' RULE_ID
	)*
;

// Rule ExtensionImport
ruleExtensionImport :
	'import' 'extension' RULE_ID (
		'::' RULE_ID
	)*
;

// Rule NamedResource
ruleNamedResource :
	'resource' RULE_ID '{' 'left' (
		'uri' RULE_STRING |
		ruleCreatedObject
	) ';' 'right' (
		'uri' RULE_STRING |
		ruleCreatedObject
	) ';' '}'
;

// Rule ObjectRef
ruleObjectRef :
	'object' RULE_ID? (
		RULE_ID RULE_FRAGMENT |
		'left' RULE_ID RULE_FRAGMENT 'right' RULE_ID RULE_FRAGMENT
	) (
		'{' (
			ruleBiSingleAssignment |
			ruleBiListAssignment
		)+ (
			'left' ruleMigration
		)? (
			'right' ruleMigration
		)? '}'
	)?
;

// Rule BiSingleAssignment
ruleBiSingleAssignment :
	RULE_ID '=' ruleSingleAssignmentValue '|' ruleSingleAssignmentValue ';'
;

// Rule BiListAssignment
ruleBiListAssignment :
	RULE_ID '=' '[' (
		ruleListAssignmentValue (
			',' ruleListAssignmentValue
		)*
	)? '|' (
		ruleListAssignmentValue (
			',' ruleListAssignmentValue
		)*
	)? ']' ';'
;

// Rule MonoSingleAssignment
ruleMonoSingleAssignment :
	RULE_ID '=' ruleSingleAssignmentValue ';'
;

// Rule MonoListAssignment
ruleMonoListAssignment :
	RULE_ID '=' '[' (
		ruleAssignmentValue (
			',' ruleAssignmentValue
		)*
	)? ']' ';'
;

// Rule AssignmentValue
ruleAssignmentValue :
	RULE_STRING |
	RULE_ID (
		'.' RULE_ID (
			'[' RULE_INT ']'
		)?
	)? |
	ruleCreatedObject |
	RULE_ID RULE_FRAGMENT
;

// Rule ListAssignmentValue
ruleListAssignmentValue :
	RULE_INT ':' (
		'[' RULE_INT ']' |
		RULE_STRING |
		RULE_ID (
			'.' RULE_ID (
				'[' RULE_INT ']'
			)?
		)? |
		ruleCreatedObject |
		RULE_ID RULE_FRAGMENT
	)
;

// Rule SingleAssignmentValue
ruleSingleAssignmentValue :
	'null' |
	RULE_STRING |
	RULE_ID (
		'.' RULE_ID (
			'[' RULE_INT ']'
		)?
	)? |
	ruleCreatedObject |
	RULE_ID RULE_FRAGMENT
;

// Rule CreatedObject
ruleCreatedObject :
	(
		ruleObjectNew |
		ruleObjectCopy
	) RULE_ID? (
		'{' (
			ruleMonoSingleAssignment |
			ruleMonoListAssignment
		)+ ruleMigration? '}'
	)?
;

// Rule ObjectNew
ruleObjectNew :
	'new' RULE_ID RULE_FRAGMENT
;

// Rule ObjectCopy
ruleObjectCopy :
	'copy' RULE_ID RULE_FRAGMENT
;

// Rule Migration
ruleMigration :
	'migrate' ruleExecutable? (
		'as' ruleExecutable |
		'each' ruleExecutable
	)? ';'
;

// Rule Executable
ruleExecutable :
	ruleJavaExecutable |
	ruleExpressionExecutable
;

// Rule JavaExecutable
ruleJavaExecutable :
	'java' RULE_ID '(' ')'
;

// Rule ExpressionExecutable
ruleExpressionExecutable :
	RULE_STRING
;

RULE_FRAGMENT :
	'#' (
		'a' .. 'z' |
		'A' .. 'Z' |
		'0' .. '9' |
		'_' |
		'/' |
		'[' |
		']' |
		'{' |
		'}' |
		'.' |
		'@'
	)+
;

RULE_ID :
	'^'? (
		'a' .. 'z' |
		'A' .. 'Z' |
		'_'
	) (
		'a' .. 'z' |
		'A' .. 'Z' |
		'_' |
		'0' .. '9'
	)*
;

RULE_INT :
	'0' .. '9'+
;

RULE_STRING :
	'"' (
		'\\' . |
		~ (
			'\\' |
			'"'
		)
	)* '"' |
	'\'' (
		'\\' . |
		~ (
			'\\' |
			'\''
		)
	)* '\''
;

RULE_ML_COMMENT :
	'/*' (
		options { greedy = false ; } : .
	)* '*/' {skip();}
;

RULE_SL_COMMENT :
	'//' ~ (
		'\n' |
		'\r'
	)* (
		'\r'? '\n'
	)? {skip();}
;

RULE_WS :
	(
		' ' |
		'\t' |
		'\r' |
		'\n'
	)+ {skip();}
;

RULE_ANY_OTHER :
	.
;