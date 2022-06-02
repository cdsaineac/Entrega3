grammar SL;
// REGLAS SINTACTICAS

codigo : nombre declaracion main subrutina_;
nombre : PROGRAMA ID | ;
declaracion : VAR declaracion_contenido_var declaracion | TIPOS declaracion_contenido_tipos declaracion | CONST declaracion_contenido_const declaracion | ;
declaracion_contenido_const : ID TK_ASIGNACION expresion mas_declaraciones_const;
declaracion_contenido_tipos : ID TK_DOS_PUNTOS tipo_dato mas_declaraciones_tipos;
declaracion_contenido_var : ID otros_id TK_DOS_PUNTOS tipo_dato mas_declaraciones_var;
valor : ID valor_aux | variable;
valor_aux : llamada_subrutina | id_arreglo_registro | ;
variable : TK_NUMERO | TK_CADENA | TRUE | FALSE | SI | NO | signo variable_aux;
variable_aux : ID | TK_NUMERO;
signo : TK_SUMA | TK_RESTA;
otros_id : TK_COMA ID otros_id | ;
tipo_dato : ID | CADENA | LOGICO | NUMERICO | REGISTRO TK_LLAVE_IZQUIERDA declaracion_contenido_var TK_LLAVE_DERECHA | VECTOR TK_CORCHETE_IZQUIERDO tamano_arreglo TK_CORCHETE_DERECHO tipo_dato | MATRIZ TK_CORCHETE_IZQUIERDO tamano_arreglo mas_tamano_arreglo TK_CORCHETE_DERECHO tipo_dato;
tamano_arreglo : TK_NUMERO | TK_MULTIPLICACION | ID;
mas_tamano_arreglo : TK_COMA tamano_arreglo mas_tamano_arreglo | ;
mas_declaraciones_var : punto_y_coma_opcional declaracion_contenido_var | ;
mas_declaraciones_tipos : punto_y_coma_opcional declaracion_contenido_tipos | ;
mas_declaraciones_const : punto_y_coma_opcional declaracion_contenido_const | ;
main : INICIO sentencias FIN;
main_subrutina : INICIO sentencias sentencia_retorna_main FIN;
sentencias : sentencia punto_y_coma_opcional sentencias | ;
sentencia : ID id_casos | condicional | ciclo_mientras | sentencia_eval | ciclo_desde | ciclo_repetir;
sentencias_internas : sentencia_interna punto_y_coma_opcional sentencias_internas | ;
sentencia_interna : ID id_casos | condicional | ciclo_mientras | sentencia_eval | ciclo_desde | ciclo_repetir;
id_casos : asignacion | llamada_subrutina | id_arreglo_registro asignacion;
punto_y_coma_opcional : TK_PUNTO_Y_COMA | ;
expresion : variable expresion_aux | TK_PARENTESIS_IZQUIERDO expresion TK_PARENTESIS_DERECHO expresion_aux | NOT expresion expresion_aux | ID valor_aux expresion_aux | valores_vector expresion_aux;
expresion_aux : operador expresion | ;
valores_vector : TK_LLAVE_IZQUIERDA posibles_valores_vector mas_valores_vector TK_LLAVE_DERECHA;
posibles_valores_vector : valor | valores_vector | ;
mas_valores_vector : TK_COMA posibles_valores_vector mas_valores_vector | ;
id_arreglo_registro : TK_CORCHETE_IZQUIERDO expresion mas_parametros TK_CORCHETE_DERECHO mas_pos_valor | TK_PUNTO ID mas_pos_valor;
mas_pos_valor : id_arreglo_registro | ;
operador : TK_MODULO | TK_MULTIPLICACION | TK_POTENCIACION | TK_RESTA | TK_SUMA | TK_DIVISION | TK_IGUAL_QUE | TK_MENOR | TK_DISTINTO_DE | TK_MENOR_IGUAL | TK_MAYOR | TK_MAYOR_IGUAL | AND | OR;
asignacion : TK_ASIGNACION expresion;
condicional : SI condicional_condicion TK_LLAVE_IZQUIERDA sentencias_internas mas_condicionales TK_LLAVE_DERECHA;
condicional_condicion : TK_PARENTESIS_IZQUIERDO expresion TK_PARENTESIS_DERECHO;
mas_condicionales : SINO condicional_ | ;
condicional_ : SI condicional_condicion sentencias_internas mas_condicionales | sentencias_internas | ;
ciclo_mientras : MIENTRAS ciclo_mientras_condicion TK_LLAVE_IZQUIERDA sentencias_internas TK_LLAVE_DERECHA;
ciclo_mientras_condicion : TK_PARENTESIS_IZQUIERDO expresion TK_PARENTESIS_DERECHO;
sentencia_eval : EVAL TK_LLAVE_IZQUIERDA sentencia_eval_caso sentencias_internas mas_casos_eval TK_LLAVE_DERECHA;
sentencia_eval_caso :  CASO TK_PARENTESIS_IZQUIERDO expresion TK_PARENTESIS_DERECHO;
mas_casos_eval : sentencia_eval_caso sentencias_internas mas_casos_eval | SINO sentencias_internas | ;
ciclo_desde : DESDE ciclo_desde_inicio  HASTA ciclo_desde_fin paso_opt TK_LLAVE_IZQUIERDA sentencias_internas TK_LLAVE_DERECHA;
ciclo_desde_inicio: ID TK_ASIGNACION expresion;
ciclo_desde_fin: expresion;
paso_opt : PASO expresion | ;
llamada_subrutina : TK_PARENTESIS_IZQUIERDO parametros TK_PARENTESIS_DERECHO;
parametros : expresion mas_parametros | ;
mas_parametros : TK_COMA expresion mas_parametros | ;
sentencia_retorna_subrutina : RETORNA valor_retorno | ;
sentencia_retorna_main : RETORNA valor_retorno | ;
valor_retorno : TK_PARENTESIS_IZQUIERDO expresion TK_PARENTESIS_DERECHO | expresion | tipo_dato;
ciclo_repetir : REPETIR sentencias_internas HASTA ciclo_repetir_condicion;
ciclo_repetir_condicion: TK_PARENTESIS_IZQUIERDO expresion TK_PARENTESIS_DERECHO;
subrutina_ : SUBRUTINA ID TK_PARENTESIS_IZQUIERDO param_subrutina TK_PARENTESIS_DERECHO sentencia_retorna_subrutina declaracion main_subrutina subrutina_ | ;
param_subrutina : param_ref ID otros_id TK_DOS_PUNTOS tipo_dato mas_param_subrutina | ;
mas_param_subrutina : punto_y_coma_opcional_subrutina;
punto_y_coma_opcional_subrutina : TK_PUNTO_Y_COMA param_ref ID otros_id TK_DOS_PUNTOS tipo_dato mas_param_subrutina | ;
param_ref : REF | ;

// TOKENS
AND : 'and';
CONSTANTES : 'constantes';
HASTA : 'hasta';
MATRIZ : 'matriz';
PASO : 'paso';
REGISTRO : 'registro';
SINO : 'sino';
VECTOR : 'vector';
ARCHIVO : 'archivo';
DESDE : 'desde';
INICIO : 'inicio';
MIENTRAS : 'mientras';
SUBRUTINA : 'subrutina';
REPETIR : 'repetir';
TIPOS : 'tipos';
CASO : 'caso';
EVAL : 'eval';
LIB : 'lib';
NOT : 'not';
PROGRAMA : 'programa';
RETORNA : 'retorna';
VAR : 'var';
CONST : 'const';
FIN : 'fin';
LIBEXT : 'libext';
OR : 'or';
REF : 'ref';
VARIABLES : 'variables';

CADENA : 'cadena';
LOGICO : 'logico';
NUMERICO : 'numerico';
TRUE : 'TRUE';
FALSE : 'FALSE';
SI : 'si';
NO: 'NO';


TK_COMA : ',' ;
TK_CORCHETE_DERECHO : ']' ;
TK_CORCHETE_IZQUIERDO : '[' ;
TK_DOS_PUNTOS : ':' ;
TK_LLAVE_DERECHA : '}' ;
TK_LLAVE_IZQUIERDA : '{' ;
TK_MODULO : '%' ;
TK_MULTIPLICACION : '*' ;
TK_PARENTESIS_DERECHO : ')' ;
TK_PARENTESIS_IZQUIERDO : '(' ;
TK_POTENCIACION : '^' ;
TK_PUNTO_Y_COMA : ';' ;
TK_RESTA : '-' ;
TK_SUMA : '+' ;
TK_ASIGNACION : '=';
TK_IGUAL_QUE : '==';
TK_MENOR : '<' ;
TK_DISTINTO_DE : '<>' ;
TK_MENOR_IGUAL : '<=';
TK_MAYOR : '>' ;
TK_MAYOR_IGUAL : '>=';
TK_DIVISION : '/' ;
TK_PUNTO : '.' ;

// REGLAS LEXICAS
//ID : ([a-zA-Z_ñÑ]|[_])[a-zA-Z_ñÑ0-9]*;
ID : [a-zA-Z_ñÑ][a-zA-Z_ñÑ0-9]*;
//TK_NUMERO :'0'..'9'+;
TK_NUMERO: [-+]?[0-9]+('.'[0-9]+)?([eE][0-9]+)? ;
ESPACIOyCOMENTARIOS: ([ \t\r\n]+ | '/*' .*? '*/' | '//' ~( '\r' | '\n' )*) -> skip;
//TK_CADENA : '"'( ESC | ~('"'|'\\'|'\n'|'\r'))* '"';
TK_CADENA: '"' ~('\r' | '\n' | '"')* '"' | '\'' ~('\r' | '\n' | '\'')* '\'';

fragment
ESC
    :   '\\'
        (   'n'
        |   'r'
        |   't'
        |   'b'
        |   'f'
        |   '"'
        |   '\''
        |   '/'
        |   '\\'
        |   ('u')+
        )
    ;