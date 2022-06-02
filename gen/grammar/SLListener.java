// Generated from G:/My Drive/DIEGO/Universidad/9 - NovenoSemestre/Lenguajes de Programación/Translator/src/grammar\SL.g4 by ANTLR 4.10.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SLParser}.
 */
public interface SLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SLParser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(SLParser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(SLParser.CodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#nombre}.
	 * @param ctx the parse tree
	 */
	void enterNombre(SLParser.NombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#nombre}.
	 * @param ctx the parse tree
	 */
	void exitNombre(SLParser.NombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(SLParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(SLParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#declaracion_contenido_const}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_contenido_const(SLParser.Declaracion_contenido_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#declaracion_contenido_const}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_contenido_const(SLParser.Declaracion_contenido_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#declaracion_contenido_tipos}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_contenido_tipos(SLParser.Declaracion_contenido_tiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#declaracion_contenido_tipos}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_contenido_tipos(SLParser.Declaracion_contenido_tiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#declaracion_contenido_var}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_contenido_var(SLParser.Declaracion_contenido_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#declaracion_contenido_var}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_contenido_var(SLParser.Declaracion_contenido_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(SLParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(SLParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#valor_aux}.
	 * @param ctx the parse tree
	 */
	void enterValor_aux(SLParser.Valor_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#valor_aux}.
	 * @param ctx the parse tree
	 */
	void exitValor_aux(SLParser.Valor_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#variable_aux}.
	 * @param ctx the parse tree
	 */
	void enterVariable_aux(SLParser.Variable_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#variable_aux}.
	 * @param ctx the parse tree
	 */
	void exitVariable_aux(SLParser.Variable_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#signo}.
	 * @param ctx the parse tree
	 */
	void enterSigno(SLParser.SignoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#signo}.
	 * @param ctx the parse tree
	 */
	void exitSigno(SLParser.SignoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#otros_id}.
	 * @param ctx the parse tree
	 */
	void enterOtros_id(SLParser.Otros_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#otros_id}.
	 * @param ctx the parse tree
	 */
	void exitOtros_id(SLParser.Otros_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void enterTipo_dato(SLParser.Tipo_datoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void exitTipo_dato(SLParser.Tipo_datoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#tamano_arreglo}.
	 * @param ctx the parse tree
	 */
	void enterTamano_arreglo(SLParser.Tamano_arregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#tamano_arreglo}.
	 * @param ctx the parse tree
	 */
	void exitTamano_arreglo(SLParser.Tamano_arregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#mas_tamano_arreglo}.
	 * @param ctx the parse tree
	 */
	void enterMas_tamano_arreglo(SLParser.Mas_tamano_arregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#mas_tamano_arreglo}.
	 * @param ctx the parse tree
	 */
	void exitMas_tamano_arreglo(SLParser.Mas_tamano_arregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#mas_declaraciones_var}.
	 * @param ctx the parse tree
	 */
	void enterMas_declaraciones_var(SLParser.Mas_declaraciones_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#mas_declaraciones_var}.
	 * @param ctx the parse tree
	 */
	void exitMas_declaraciones_var(SLParser.Mas_declaraciones_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#mas_declaraciones_tipos}.
	 * @param ctx the parse tree
	 */
	void enterMas_declaraciones_tipos(SLParser.Mas_declaraciones_tiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#mas_declaraciones_tipos}.
	 * @param ctx the parse tree
	 */
	void exitMas_declaraciones_tipos(SLParser.Mas_declaraciones_tiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#mas_declaraciones_const}.
	 * @param ctx the parse tree
	 */
	void enterMas_declaraciones_const(SLParser.Mas_declaraciones_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#mas_declaraciones_const}.
	 * @param ctx the parse tree
	 */
	void exitMas_declaraciones_const(SLParser.Mas_declaraciones_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(SLParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(SLParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#main_subrutina}.
	 * @param ctx the parse tree
	 */
	void enterMain_subrutina(SLParser.Main_subrutinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#main_subrutina}.
	 * @param ctx the parse tree
	 */
	void exitMain_subrutina(SLParser.Main_subrutinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(SLParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(SLParser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(SLParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(SLParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sentencias_internas}.
	 * @param ctx the parse tree
	 */
	void enterSentencias_internas(SLParser.Sentencias_internasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sentencias_internas}.
	 * @param ctx the parse tree
	 */
	void exitSentencias_internas(SLParser.Sentencias_internasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sentencia_interna}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_interna(SLParser.Sentencia_internaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sentencia_interna}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_interna(SLParser.Sentencia_internaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#id_casos}.
	 * @param ctx the parse tree
	 */
	void enterId_casos(SLParser.Id_casosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#id_casos}.
	 * @param ctx the parse tree
	 */
	void exitId_casos(SLParser.Id_casosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#punto_y_coma_opcional}.
	 * @param ctx the parse tree
	 */
	void enterPunto_y_coma_opcional(SLParser.Punto_y_coma_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#punto_y_coma_opcional}.
	 * @param ctx the parse tree
	 */
	void exitPunto_y_coma_opcional(SLParser.Punto_y_coma_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(SLParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(SLParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#expresion_aux}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_aux(SLParser.Expresion_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#expresion_aux}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_aux(SLParser.Expresion_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#valores_vector}.
	 * @param ctx the parse tree
	 */
	void enterValores_vector(SLParser.Valores_vectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#valores_vector}.
	 * @param ctx the parse tree
	 */
	void exitValores_vector(SLParser.Valores_vectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#posibles_valores_vector}.
	 * @param ctx the parse tree
	 */
	void enterPosibles_valores_vector(SLParser.Posibles_valores_vectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#posibles_valores_vector}.
	 * @param ctx the parse tree
	 */
	void exitPosibles_valores_vector(SLParser.Posibles_valores_vectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#mas_valores_vector}.
	 * @param ctx the parse tree
	 */
	void enterMas_valores_vector(SLParser.Mas_valores_vectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#mas_valores_vector}.
	 * @param ctx the parse tree
	 */
	void exitMas_valores_vector(SLParser.Mas_valores_vectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#id_arreglo_registro}.
	 * @param ctx the parse tree
	 */
	void enterId_arreglo_registro(SLParser.Id_arreglo_registroContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#id_arreglo_registro}.
	 * @param ctx the parse tree
	 */
	void exitId_arreglo_registro(SLParser.Id_arreglo_registroContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#mas_pos_valor}.
	 * @param ctx the parse tree
	 */
	void enterMas_pos_valor(SLParser.Mas_pos_valorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#mas_pos_valor}.
	 * @param ctx the parse tree
	 */
	void exitMas_pos_valor(SLParser.Mas_pos_valorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(SLParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(SLParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(SLParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(SLParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(SLParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(SLParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#condicional_condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicional_condicion(SLParser.Condicional_condicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#condicional_condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicional_condicion(SLParser.Condicional_condicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#mas_condicionales}.
	 * @param ctx the parse tree
	 */
	void enterMas_condicionales(SLParser.Mas_condicionalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#mas_condicionales}.
	 * @param ctx the parse tree
	 */
	void exitMas_condicionales(SLParser.Mas_condicionalesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#condicional_}.
	 * @param ctx the parse tree
	 */
	void enterCondicional_(SLParser.Condicional_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#condicional_}.
	 * @param ctx the parse tree
	 */
	void exitCondicional_(SLParser.Condicional_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#ciclo_mientras}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_mientras(SLParser.Ciclo_mientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#ciclo_mientras}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_mientras(SLParser.Ciclo_mientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#ciclo_mientras_condicion}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_mientras_condicion(SLParser.Ciclo_mientras_condicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#ciclo_mientras_condicion}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_mientras_condicion(SLParser.Ciclo_mientras_condicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sentencia_eval}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_eval(SLParser.Sentencia_evalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sentencia_eval}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_eval(SLParser.Sentencia_evalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sentencia_eval_caso}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_eval_caso(SLParser.Sentencia_eval_casoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sentencia_eval_caso}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_eval_caso(SLParser.Sentencia_eval_casoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#mas_casos_eval}.
	 * @param ctx the parse tree
	 */
	void enterMas_casos_eval(SLParser.Mas_casos_evalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#mas_casos_eval}.
	 * @param ctx the parse tree
	 */
	void exitMas_casos_eval(SLParser.Mas_casos_evalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#ciclo_desde}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_desde(SLParser.Ciclo_desdeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#ciclo_desde}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_desde(SLParser.Ciclo_desdeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#ciclo_desde_inicio}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_desde_inicio(SLParser.Ciclo_desde_inicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#ciclo_desde_inicio}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_desde_inicio(SLParser.Ciclo_desde_inicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#ciclo_desde_fin}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_desde_fin(SLParser.Ciclo_desde_finContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#ciclo_desde_fin}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_desde_fin(SLParser.Ciclo_desde_finContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#paso_opt}.
	 * @param ctx the parse tree
	 */
	void enterPaso_opt(SLParser.Paso_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#paso_opt}.
	 * @param ctx the parse tree
	 */
	void exitPaso_opt(SLParser.Paso_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#llamada_subrutina}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_subrutina(SLParser.Llamada_subrutinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#llamada_subrutina}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_subrutina(SLParser.Llamada_subrutinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(SLParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(SLParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#mas_parametros}.
	 * @param ctx the parse tree
	 */
	void enterMas_parametros(SLParser.Mas_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#mas_parametros}.
	 * @param ctx the parse tree
	 */
	void exitMas_parametros(SLParser.Mas_parametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sentencia_retorna_subrutina}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_retorna_subrutina(SLParser.Sentencia_retorna_subrutinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sentencia_retorna_subrutina}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_retorna_subrutina(SLParser.Sentencia_retorna_subrutinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#sentencia_retorna_main}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_retorna_main(SLParser.Sentencia_retorna_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#sentencia_retorna_main}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_retorna_main(SLParser.Sentencia_retorna_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#valor_retorno}.
	 * @param ctx the parse tree
	 */
	void enterValor_retorno(SLParser.Valor_retornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#valor_retorno}.
	 * @param ctx the parse tree
	 */
	void exitValor_retorno(SLParser.Valor_retornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#ciclo_repetir}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_repetir(SLParser.Ciclo_repetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#ciclo_repetir}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_repetir(SLParser.Ciclo_repetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#ciclo_repetir_condicion}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_repetir_condicion(SLParser.Ciclo_repetir_condicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#ciclo_repetir_condicion}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_repetir_condicion(SLParser.Ciclo_repetir_condicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#subrutina_}.
	 * @param ctx the parse tree
	 */
	void enterSubrutina_(SLParser.Subrutina_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#subrutina_}.
	 * @param ctx the parse tree
	 */
	void exitSubrutina_(SLParser.Subrutina_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#param_subrutina}.
	 * @param ctx the parse tree
	 */
	void enterParam_subrutina(SLParser.Param_subrutinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#param_subrutina}.
	 * @param ctx the parse tree
	 */
	void exitParam_subrutina(SLParser.Param_subrutinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#mas_param_subrutina}.
	 * @param ctx the parse tree
	 */
	void enterMas_param_subrutina(SLParser.Mas_param_subrutinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#mas_param_subrutina}.
	 * @param ctx the parse tree
	 */
	void exitMas_param_subrutina(SLParser.Mas_param_subrutinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#punto_y_coma_opcional_subrutina}.
	 * @param ctx the parse tree
	 */
	void enterPunto_y_coma_opcional_subrutina(SLParser.Punto_y_coma_opcional_subrutinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#punto_y_coma_opcional_subrutina}.
	 * @param ctx the parse tree
	 */
	void exitPunto_y_coma_opcional_subrutina(SLParser.Punto_y_coma_opcional_subrutinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#param_ref}.
	 * @param ctx the parse tree
	 */
	void enterParam_ref(SLParser.Param_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#param_ref}.
	 * @param ctx the parse tree
	 */
	void exitParam_ref(SLParser.Param_refContext ctx);
}