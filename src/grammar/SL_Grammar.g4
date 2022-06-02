grammar SL_Grammar;

codigo: nombre declaracion main subrutina_ EOF;

nombre: 'programa' ID | ;

declaracion: 'var' declaracion_contenido_var declaracion
            | 'tipos' declaracion_contenido_tipos declaracion
            | 'const' declaracion_contenido_const declaracion
            | 
            ;

declaracion_contenido_const: ID TK_ASIGNACION expresion mas_declaraciones_const;
declaracion_contenido_tipos: ID TK_DOS_PUNTOS tipo_dato mas_declaraciones_tipos;
declaracion_contenido_var: ID otros_id TK_DOS_PUNTOS tipo_dato mas_declaraciones_var;

valor: ID valor_aux | variable;

valor_aux: llamada_subrutina | id_arreglo_registro | ;
variable: TK_NUMERO | TK_CADENA | 'TRUE' | 'FALSE' | 'SI' | 'NO' | signo variable_aux ;
variable_aux: ID | TK_NUMERO;

signo : TK_SUMA | TK_RESTA;
otros_id : TK_COMA ID otros_id | ;

tipo_dato : ID | 'cadena' | 'logico' | 'numerico'
            | 'registro' TK_LLAVE_IZQUIERDA declaracion_contenido_var TK_LLAVE_DERECHA
            | 'vector' TK_CORCHETE_IZQUIERDO tamano_arreglo TK_CORCHETE_DERECHO tipo_dato
            | 'matriz' TK_CORCHETE_IZQUIERDO tamano_arreglo mas_tamano_arreglo TK_CORCHETE_DERECHO tipo_dato;

tamano_arreglo : TK_NUMERO | TK_MULTIPLICACION | ID;

mas_tamano_arreglo : TK_COMA tamano_arreglo mas_tamano_arreglo | ;

mas_declaraciones_var : punto_y_coma_opcional declaracion_contenido_var | ;
mas_declaraciones_tipos : punto_y_coma_opcional declaracion_contenido_tipos | ;
mas_declaraciones_const : punto_y_coma_opcional declaracion_contenido_const | ;

main : 'inicio' sentencias 'fin';
main_subrutina : 'inicio' sentencias sentencia_retorna_main 'fin';

sentencias : sentencia punto_y_coma_opcional sentencias | ;
sentencia : ID id_casos | condicional | ciclo_mientras | sentencia_eval | ciclo_desde | ciclo_repetir;
sentencias_internas : sentencia_interna punto_y_coma_opcional sentencias_internas | ;
sentencia_interna : ID id_casos | condicional | ciclo_mientras | sentencia_eval | ciclo_desde | ciclo_repetir;

id_casos : asignacion | llamada_subrutina | id_arreglo_registro asignacion;

punto_y_coma_opcional : TK_PUNTO_Y_COMA | ;

expresion : variable expresion_aux
            | TK_PARENTESIS_IZQUIERDO expresion TK_PARENTESIS_DERECHO expresion_aux
            | 'not' expresion expresion_aux
            | ID valor_aux expresion_aux
            | valores_vector expresion_aux;

expresion_aux : operador expresion | ;

valores_vector : TK_LLAVE_IZQUIERDA posibles_valores_vector mas_valores_vector TK_LLAVE_DERECHA;

posibles_valores_vector : valor | valores_vector | ;

mas_valores_vector : TK_COMA posibles_valores_vector mas_valores_vector | ;

id_arreglo_registro : TK_CORCHETE_IZQUIERDO expresion mas_parametros TK_CORCHETE_DERECHO mas_pos_valor
                    | TK_PUNTO ID mas_pos_valor;

mas_pos_valor : id_arreglo_registro | ;

operador : TK_MODULO | TK_MULTIPLICACION | TK_POTENCIACION
            | TK_RESTA | TK_SUMA | TK_DIVISION | TK_IGUAL_QUE
            | TK_MENOR | TK_DISTINTO_DE | TK_MENOR_IGUAL
            | TK_MAYOR | TK_MAYOR_IGUAL | 'and' | 'or' ;

asignacion : TK_ASIGNACION expresion;

condicional : 'si' TK_PARENTESIS_IZQUIERDO expresion TK_PARENTESIS_DERECHO TK_LLAVE_IZQUIERDA sentencias_internas mas_condicionales TK_LLAVE_DERECHA;
mas_condicionales : 'sino' condicional_ | ;
condicional_ : 'si' TK_PARENTESIS_IZQUIERDO expresion TK_PARENTESIS_DERECHO sentencias_internas mas_condicionales
                | sentencias_internas | ;

ciclo_mientras : 'mientras' TK_PARENTESIS_IZQUIERDO expresion TK_PARENTESIS_DERECHO TK_LLAVE_IZQUIERDA sentencias_internas TK_LLAVE_DERECHA;

sentencia_eval : 'eval' TK_LLAVE_IZQUIERDA 'caso' TK_PARENTESIS_IZQUIERDO expresion TK_PARENTESIS_DERECHO sentencias_internas mas_casos_eval TK_LLAVE_DERECHA;
mas_casos_eval : 'caso' TK_PARENTESIS_IZQUIERDO expresion TK_PARENTESIS_DERECHO sentencias_internas mas_casos_eval
                | 'sino' sentencias_internas | ;

ciclo_desde : 'desde' ID TK_ASIGNACION expresion 'hasta' expresion paso_opt TK_LLAVE_IZQUIERDA sentencias_internas TK_LLAVE_DERECHA;
paso_opt : 'paso' expresion | ;

llamada_subrutina : TK_PARENTESIS_IZQUIERDO parametros TK_PARENTESIS_DERECHO;
parametros : expresion mas_parametros | ;

mas_parametros : TK_COMA expresion mas_parametros | ;

sentencia_retorna_subrutina : 'retorna' valor_retorno | ;

sentencia_retorna_main : 'retorna' valor_retorno | ;

valor_retorno : TK_PARENTESIS_IZQUIERDO expresion TK_PARENTESIS_DERECHO | expresion | tipo_dato;

ciclo_repetir : 'repetir' sentencias_internas 'hasta' TK_PARENTESIS_IZQUIERDO expresion TK_PARENTESIS_DERECHO;

subrutina_ : 'subrutina' ID TK_PARENTESIS_IZQUIERDO param_subrutina TK_PARENTESIS_DERECHO sentencia_retorna_subrutina declaracion main_subrutina subrutina_ | ;

param_subrutina : param_ref ID otros_id TK_DOS_PUNTOS tipo_dato mas_param_subrutina | ;
mas_param_subrutina : punto_y_coma_opcional_subrutina;

punto_y_coma_opcional_subrutina : TK_PUNTO_Y_COMA param_ref ID otros_id TK_DOS_PUNTOS tipo_dato mas_param_subrutina | ;

param_ref: 'ref' | ;

COMMENT : '/*' .*? '*/' -> skip ;
LINE_COMMENT : '//' ~[\r\n]* -> skip ;
WS    : [ \t\r\n]+ -> skip ;
ID: [_a-zA-Z][a-zA-Z0-9_]* ; // ¿Permite la ñ?
TK_NUMERO: [-+]?[0-9]+( | [.][0-9]+)( | [eE][0-9]+) ;
TK_CADENA: ('"' ~('\r' | '\n' | '"')* '"') | ('\'' ~('\r' | '\n' | '\'')* '\''); // https://stackoverflow.com/questions/14882531/antlr-match-any-character-except
TK_ASIGNACION: '=';
TK_DOS_PUNTOS: ':';
TK_SUMA: '+';
TK_RESTA: '-';
TK_COMA: ',';
TK_PUNTO_Y_COMA: ';';
TK_PUNTO: '.';
TK_LLAVE_IZQUIERDA: '{';
TK_LLAVE_DERECHA: '}';
TK_CORCHETE_IZQUIERDO: '[';
TK_CORCHETE_DERECHO: ']';
TK_PARENTESIS_IZQUIERDO: '(';
TK_PARENTESIS_DERECHO: ')';
TK_MODULO: '%';
TK_MULTIPLICACION: '*';
TK_POTENCIACION: '^';
TK_DIVISION : '/';
TK_IGUAL_QUE: '==';
TK_MENOR: '<';
TK_DISTINTO_DE: '<>';
TK_MENOR_IGUAL: '<=';
TK_MAYOR: '>';
TK_MAYOR_IGUAL: '>=';
