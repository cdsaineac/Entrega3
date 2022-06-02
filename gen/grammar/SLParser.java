// Generated from G:/My Drive/DIEGO/Universidad/9 - NovenoSemestre/Lenguajes de Programación/Translator/src/grammar\SL.g4 by ANTLR 4.10.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, CONSTANTES=2, HASTA=3, MATRIZ=4, PASO=5, REGISTRO=6, SINO=7, VECTOR=8, 
		ARCHIVO=9, DESDE=10, INICIO=11, MIENTRAS=12, SUBRUTINA=13, REPETIR=14, 
		TIPOS=15, CASO=16, EVAL=17, LIB=18, NOT=19, PROGRAMA=20, RETORNA=21, VAR=22, 
		CONST=23, FIN=24, LIBEXT=25, OR=26, REF=27, VARIABLES=28, CADENA=29, LOGICO=30, 
		NUMERICO=31, TRUE=32, FALSE=33, SI=34, NO=35, TK_COMA=36, TK_CORCHETE_DERECHO=37, 
		TK_CORCHETE_IZQUIERDO=38, TK_DOS_PUNTOS=39, TK_LLAVE_DERECHA=40, TK_LLAVE_IZQUIERDA=41, 
		TK_MODULO=42, TK_MULTIPLICACION=43, TK_PARENTESIS_DERECHO=44, TK_PARENTESIS_IZQUIERDO=45, 
		TK_POTENCIACION=46, TK_PUNTO_Y_COMA=47, TK_RESTA=48, TK_SUMA=49, TK_ASIGNACION=50, 
		TK_IGUAL_QUE=51, TK_MENOR=52, TK_DISTINTO_DE=53, TK_MENOR_IGUAL=54, TK_MAYOR=55, 
		TK_MAYOR_IGUAL=56, TK_DIVISION=57, ID=58, TK_NUMERO=59, ESPACIOyCOMENTARIOS=60, 
		TK_CADENA=61, TK_PUNTO=62;
	public static final int
		RULE_codigo = 0, RULE_nombre = 1, RULE_declaracion = 2, RULE_declaracion_contenido_const = 3, 
		RULE_declaracion_contenido_tipos = 4, RULE_declaracion_contenido_var = 5, 
		RULE_valor = 6, RULE_valor_aux = 7, RULE_variable = 8, RULE_variable_aux = 9, 
		RULE_signo = 10, RULE_otros_id = 11, RULE_tipo_dato = 12, RULE_tamano_arreglo = 13, 
		RULE_mas_tamano_arreglo = 14, RULE_mas_declaraciones_var = 15, RULE_mas_declaraciones_tipos = 16, 
		RULE_mas_declaraciones_const = 17, RULE_main = 18, RULE_main_subrutina = 19, 
		RULE_sentencias = 20, RULE_sentencia = 21, RULE_sentencias_internas = 22, 
		RULE_sentencia_interna = 23, RULE_id_casos = 24, RULE_punto_y_coma_opcional = 25, 
		RULE_expresion = 26, RULE_expresion_aux = 27, RULE_valores_vector = 28, 
		RULE_posibles_valores_vector = 29, RULE_mas_valores_vector = 30, RULE_id_arreglo_registro = 31, 
		RULE_mas_pos_valor = 32, RULE_operador = 33, RULE_asignacion = 34, RULE_condicional = 35, 
		RULE_condicional_condicion = 36, RULE_mas_condicionales = 37, RULE_condicional_ = 38, 
		RULE_ciclo_mientras = 39, RULE_ciclo_mientras_condicion = 40, RULE_sentencia_eval = 41, 
		RULE_sentencia_eval_caso = 42, RULE_mas_casos_eval = 43, RULE_ciclo_desde = 44, 
		RULE_ciclo_desde_inicio = 45, RULE_ciclo_desde_fin = 46, RULE_paso_opt = 47, 
		RULE_llamada_subrutina = 48, RULE_parametros = 49, RULE_mas_parametros = 50, 
		RULE_sentencia_retorna_subrutina = 51, RULE_sentencia_retorna_main = 52, 
		RULE_valor_retorno = 53, RULE_ciclo_repetir = 54, RULE_ciclo_repetir_condicion = 55, 
		RULE_subrutina_ = 56, RULE_param_subrutina = 57, RULE_mas_param_subrutina = 58, 
		RULE_punto_y_coma_opcional_subrutina = 59, RULE_param_ref = 60;
	private static String[] makeRuleNames() {
		return new String[] {
			"codigo", "nombre", "declaracion", "declaracion_contenido_const", "declaracion_contenido_tipos", 
			"declaracion_contenido_var", "valor", "valor_aux", "variable", "variable_aux", 
			"signo", "otros_id", "tipo_dato", "tamano_arreglo", "mas_tamano_arreglo", 
			"mas_declaraciones_var", "mas_declaraciones_tipos", "mas_declaraciones_const", 
			"main", "main_subrutina", "sentencias", "sentencia", "sentencias_internas", 
			"sentencia_interna", "id_casos", "punto_y_coma_opcional", "expresion", 
			"expresion_aux", "valores_vector", "posibles_valores_vector", "mas_valores_vector", 
			"id_arreglo_registro", "mas_pos_valor", "operador", "asignacion", "condicional", 
			"condicional_condicion", "mas_condicionales", "condicional_", "ciclo_mientras", 
			"ciclo_mientras_condicion", "sentencia_eval", "sentencia_eval_caso", 
			"mas_casos_eval", "ciclo_desde", "ciclo_desde_inicio", "ciclo_desde_fin", 
			"paso_opt", "llamada_subrutina", "parametros", "mas_parametros", "sentencia_retorna_subrutina", 
			"sentencia_retorna_main", "valor_retorno", "ciclo_repetir", "ciclo_repetir_condicion", 
			"subrutina_", "param_subrutina", "mas_param_subrutina", "punto_y_coma_opcional_subrutina", 
			"param_ref"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'constantes'", "'hasta'", "'matriz'", "'paso'", "'registro'", 
			"'sino'", "'vector'", "'archivo'", "'desde'", "'inicio'", "'mientras'", 
			"'subrutina'", "'repetir'", "'tipos'", "'caso'", "'eval'", "'lib'", "'not'", 
			"'programa'", "'retorna'", "'var'", "'const'", "'fin'", "'libext'", "'or'", 
			"'ref'", "'variables'", "'cadena'", "'logico'", "'numerico'", "'TRUE'", 
			"'FALSE'", "'si'", "'NO'", "','", "']'", "'['", "':'", "'}'", "'{'", 
			"'%'", "'*'", "')'", "'('", "'^'", "';'", "'-'", "'+'", "'='", "'=='", 
			"'<'", "'<>'", "'<='", "'>'", "'>='", "'/'", null, null, null, null, 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "CONSTANTES", "HASTA", "MATRIZ", "PASO", "REGISTRO", "SINO", 
			"VECTOR", "ARCHIVO", "DESDE", "INICIO", "MIENTRAS", "SUBRUTINA", "REPETIR", 
			"TIPOS", "CASO", "EVAL", "LIB", "NOT", "PROGRAMA", "RETORNA", "VAR", 
			"CONST", "FIN", "LIBEXT", "OR", "REF", "VARIABLES", "CADENA", "LOGICO", 
			"NUMERICO", "TRUE", "FALSE", "SI", "NO", "TK_COMA", "TK_CORCHETE_DERECHO", 
			"TK_CORCHETE_IZQUIERDO", "TK_DOS_PUNTOS", "TK_LLAVE_DERECHA", "TK_LLAVE_IZQUIERDA", 
			"TK_MODULO", "TK_MULTIPLICACION", "TK_PARENTESIS_DERECHO", "TK_PARENTESIS_IZQUIERDO", 
			"TK_POTENCIACION", "TK_PUNTO_Y_COMA", "TK_RESTA", "TK_SUMA", "TK_ASIGNACION", 
			"TK_IGUAL_QUE", "TK_MENOR", "TK_DISTINTO_DE", "TK_MENOR_IGUAL", "TK_MAYOR", 
			"TK_MAYOR_IGUAL", "TK_DIVISION", "ID", "TK_NUMERO", "ESPACIOyCOMENTARIOS", 
			"TK_CADENA", "TK_PUNTO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CodigoContext extends ParserRuleContext {
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public Subrutina_Context subrutina_() {
			return getRuleContext(Subrutina_Context.class,0);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCodigo(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_codigo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			nombre();
			setState(123);
			declaracion();
			setState(124);
			main();
			setState(125);
			subrutina_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NombreContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(SLParser.PROGRAMA, 0); }
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public NombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterNombre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitNombre(this);
		}
	}

	public final NombreContext nombre() throws RecognitionException {
		NombreContext _localctx = new NombreContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nombre);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(PROGRAMA);
				setState(128);
				match(ID);
				}
				break;
			case INICIO:
			case TIPOS:
			case VAR:
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SLParser.VAR, 0); }
		public Declaracion_contenido_varContext declaracion_contenido_var() {
			return getRuleContext(Declaracion_contenido_varContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode TIPOS() { return getToken(SLParser.TIPOS, 0); }
		public Declaracion_contenido_tiposContext declaracion_contenido_tipos() {
			return getRuleContext(Declaracion_contenido_tiposContext.class,0);
		}
		public TerminalNode CONST() { return getToken(SLParser.CONST, 0); }
		public Declaracion_contenido_constContext declaracion_contenido_const() {
			return getRuleContext(Declaracion_contenido_constContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDeclaracion(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(VAR);
				setState(133);
				declaracion_contenido_var();
				setState(134);
				declaracion();
				}
				break;
			case TIPOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(TIPOS);
				setState(137);
				declaracion_contenido_tipos();
				setState(138);
				declaracion();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(CONST);
				setState(141);
				declaracion_contenido_const();
				setState(142);
				declaracion();
				}
				break;
			case INICIO:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracion_contenido_constContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public TerminalNode TK_ASIGNACION() { return getToken(SLParser.TK_ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Mas_declaraciones_constContext mas_declaraciones_const() {
			return getRuleContext(Mas_declaraciones_constContext.class,0);
		}
		public Declaracion_contenido_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_contenido_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDeclaracion_contenido_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDeclaracion_contenido_const(this);
		}
	}

	public final Declaracion_contenido_constContext declaracion_contenido_const() throws RecognitionException {
		Declaracion_contenido_constContext _localctx = new Declaracion_contenido_constContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion_contenido_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(ID);
			setState(148);
			match(TK_ASIGNACION);
			setState(149);
			expresion();
			setState(150);
			mas_declaraciones_const();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracion_contenido_tiposContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public TerminalNode TK_DOS_PUNTOS() { return getToken(SLParser.TK_DOS_PUNTOS, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public Mas_declaraciones_tiposContext mas_declaraciones_tipos() {
			return getRuleContext(Mas_declaraciones_tiposContext.class,0);
		}
		public Declaracion_contenido_tiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_contenido_tipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDeclaracion_contenido_tipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDeclaracion_contenido_tipos(this);
		}
	}

	public final Declaracion_contenido_tiposContext declaracion_contenido_tipos() throws RecognitionException {
		Declaracion_contenido_tiposContext _localctx = new Declaracion_contenido_tiposContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion_contenido_tipos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ID);
			setState(153);
			match(TK_DOS_PUNTOS);
			setState(154);
			tipo_dato();
			setState(155);
			mas_declaraciones_tipos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracion_contenido_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Otros_idContext otros_id() {
			return getRuleContext(Otros_idContext.class,0);
		}
		public TerminalNode TK_DOS_PUNTOS() { return getToken(SLParser.TK_DOS_PUNTOS, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public Mas_declaraciones_varContext mas_declaraciones_var() {
			return getRuleContext(Mas_declaraciones_varContext.class,0);
		}
		public Declaracion_contenido_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_contenido_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterDeclaracion_contenido_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitDeclaracion_contenido_var(this);
		}
	}

	public final Declaracion_contenido_varContext declaracion_contenido_var() throws RecognitionException {
		Declaracion_contenido_varContext _localctx = new Declaracion_contenido_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion_contenido_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ID);
			setState(158);
			otros_id();
			setState(159);
			match(TK_DOS_PUNTOS);
			setState(160);
			tipo_dato();
			setState(161);
			mas_declaraciones_var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Valor_auxContext valor_aux() {
			return getRuleContext(Valor_auxContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_valor);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(ID);
				setState(164);
				valor_aux();
				}
				break;
			case TRUE:
			case FALSE:
			case SI:
			case NO:
			case TK_RESTA:
			case TK_SUMA:
			case TK_NUMERO:
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_auxContext extends ParserRuleContext {
		public Llamada_subrutinaContext llamada_subrutina() {
			return getRuleContext(Llamada_subrutinaContext.class,0);
		}
		public Id_arreglo_registroContext id_arreglo_registro() {
			return getRuleContext(Id_arreglo_registroContext.class,0);
		}
		public Valor_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterValor_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitValor_aux(this);
		}
	}

	public final Valor_auxContext valor_aux() throws RecognitionException {
		Valor_auxContext _localctx = new Valor_auxContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valor_aux);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PARENTESIS_IZQUIERDO:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				llamada_subrutina();
				}
				break;
			case TK_CORCHETE_IZQUIERDO:
			case TK_PUNTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				id_arreglo_registro();
				}
				break;
			case AND:
			case HASTA:
			case PASO:
			case SINO:
			case DESDE:
			case INICIO:
			case MIENTRAS:
			case REPETIR:
			case TIPOS:
			case CASO:
			case EVAL:
			case RETORNA:
			case VAR:
			case CONST:
			case FIN:
			case OR:
			case SI:
			case TK_COMA:
			case TK_CORCHETE_DERECHO:
			case TK_LLAVE_DERECHA:
			case TK_LLAVE_IZQUIERDA:
			case TK_MODULO:
			case TK_MULTIPLICACION:
			case TK_PARENTESIS_DERECHO:
			case TK_POTENCIACION:
			case TK_PUNTO_Y_COMA:
			case TK_RESTA:
			case TK_SUMA:
			case TK_IGUAL_QUE:
			case TK_MENOR:
			case TK_DISTINTO_DE:
			case TK_MENOR_IGUAL:
			case TK_MAYOR:
			case TK_MAYOR_IGUAL:
			case TK_DIVISION:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode TK_NUMERO() { return getToken(SLParser.TK_NUMERO, 0); }
		public TerminalNode TK_CADENA() { return getToken(SLParser.TK_CADENA, 0); }
		public TerminalNode TRUE() { return getToken(SLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SLParser.FALSE, 0); }
		public TerminalNode SI() { return getToken(SLParser.SI, 0); }
		public TerminalNode NO() { return getToken(SLParser.NO, 0); }
		public SignoContext signo() {
			return getRuleContext(SignoContext.class,0);
		}
		public Variable_auxContext variable_aux() {
			return getRuleContext(Variable_auxContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(TK_NUMERO);
				}
				break;
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(TK_CADENA);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(FALSE);
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(SI);
				}
				break;
			case NO:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				match(NO);
				}
				break;
			case TK_RESTA:
			case TK_SUMA:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				signo();
				setState(180);
				variable_aux();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_auxContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public TerminalNode TK_NUMERO() { return getToken(SLParser.TK_NUMERO, 0); }
		public Variable_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterVariable_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitVariable_aux(this);
		}
	}

	public final Variable_auxContext variable_aux() throws RecognitionException {
		Variable_auxContext _localctx = new Variable_auxContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==TK_NUMERO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignoContext extends ParserRuleContext {
		public TerminalNode TK_SUMA() { return getToken(SLParser.TK_SUMA, 0); }
		public TerminalNode TK_RESTA() { return getToken(SLParser.TK_RESTA, 0); }
		public SignoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSigno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSigno(this);
		}
	}

	public final SignoContext signo() throws RecognitionException {
		SignoContext _localctx = new SignoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==TK_RESTA || _la==TK_SUMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Otros_idContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(SLParser.TK_COMA, 0); }
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Otros_idContext otros_id() {
			return getRuleContext(Otros_idContext.class,0);
		}
		public Otros_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otros_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterOtros_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitOtros_id(this);
		}
	}

	public final Otros_idContext otros_id() throws RecognitionException {
		Otros_idContext _localctx = new Otros_idContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_otros_id);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(TK_COMA);
				setState(189);
				match(ID);
				setState(190);
				otros_id();
				}
				break;
			case TK_DOS_PUNTOS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_datoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public TerminalNode CADENA() { return getToken(SLParser.CADENA, 0); }
		public TerminalNode LOGICO() { return getToken(SLParser.LOGICO, 0); }
		public TerminalNode NUMERICO() { return getToken(SLParser.NUMERICO, 0); }
		public TerminalNode REGISTRO() { return getToken(SLParser.REGISTRO, 0); }
		public TerminalNode TK_LLAVE_IZQUIERDA() { return getToken(SLParser.TK_LLAVE_IZQUIERDA, 0); }
		public Declaracion_contenido_varContext declaracion_contenido_var() {
			return getRuleContext(Declaracion_contenido_varContext.class,0);
		}
		public TerminalNode TK_LLAVE_DERECHA() { return getToken(SLParser.TK_LLAVE_DERECHA, 0); }
		public TerminalNode VECTOR() { return getToken(SLParser.VECTOR, 0); }
		public TerminalNode TK_CORCHETE_IZQUIERDO() { return getToken(SLParser.TK_CORCHETE_IZQUIERDO, 0); }
		public Tamano_arregloContext tamano_arreglo() {
			return getRuleContext(Tamano_arregloContext.class,0);
		}
		public TerminalNode TK_CORCHETE_DERECHO() { return getToken(SLParser.TK_CORCHETE_DERECHO, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode MATRIZ() { return getToken(SLParser.MATRIZ, 0); }
		public Mas_tamano_arregloContext mas_tamano_arreglo() {
			return getRuleContext(Mas_tamano_arregloContext.class,0);
		}
		public Tipo_datoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterTipo_dato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitTipo_dato(this);
		}
	}

	public final Tipo_datoContext tipo_dato() throws RecognitionException {
		Tipo_datoContext _localctx = new Tipo_datoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipo_dato);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(ID);
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(CADENA);
				}
				break;
			case LOGICO:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(LOGICO);
				}
				break;
			case NUMERICO:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				match(NUMERICO);
				}
				break;
			case REGISTRO:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				match(REGISTRO);
				setState(199);
				match(TK_LLAVE_IZQUIERDA);
				setState(200);
				declaracion_contenido_var();
				setState(201);
				match(TK_LLAVE_DERECHA);
				}
				break;
			case VECTOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(VECTOR);
				setState(204);
				match(TK_CORCHETE_IZQUIERDO);
				setState(205);
				tamano_arreglo();
				setState(206);
				match(TK_CORCHETE_DERECHO);
				setState(207);
				tipo_dato();
				}
				break;
			case MATRIZ:
				enterOuterAlt(_localctx, 7);
				{
				setState(209);
				match(MATRIZ);
				setState(210);
				match(TK_CORCHETE_IZQUIERDO);
				setState(211);
				tamano_arreglo();
				setState(212);
				mas_tamano_arreglo();
				setState(213);
				match(TK_CORCHETE_DERECHO);
				setState(214);
				tipo_dato();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tamano_arregloContext extends ParserRuleContext {
		public TerminalNode TK_NUMERO() { return getToken(SLParser.TK_NUMERO, 0); }
		public TerminalNode TK_MULTIPLICACION() { return getToken(SLParser.TK_MULTIPLICACION, 0); }
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Tamano_arregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tamano_arreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterTamano_arreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitTamano_arreglo(this);
		}
	}

	public final Tamano_arregloContext tamano_arreglo() throws RecognitionException {
		Tamano_arregloContext _localctx = new Tamano_arregloContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tamano_arreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MULTIPLICACION) | (1L << ID) | (1L << TK_NUMERO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mas_tamano_arregloContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(SLParser.TK_COMA, 0); }
		public Tamano_arregloContext tamano_arreglo() {
			return getRuleContext(Tamano_arregloContext.class,0);
		}
		public Mas_tamano_arregloContext mas_tamano_arreglo() {
			return getRuleContext(Mas_tamano_arregloContext.class,0);
		}
		public Mas_tamano_arregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_tamano_arreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterMas_tamano_arreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitMas_tamano_arreglo(this);
		}
	}

	public final Mas_tamano_arregloContext mas_tamano_arreglo() throws RecognitionException {
		Mas_tamano_arregloContext _localctx = new Mas_tamano_arregloContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mas_tamano_arreglo);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(TK_COMA);
				setState(221);
				tamano_arreglo();
				setState(222);
				mas_tamano_arreglo();
				}
				break;
			case TK_CORCHETE_DERECHO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mas_declaraciones_varContext extends ParserRuleContext {
		public Punto_y_coma_opcionalContext punto_y_coma_opcional() {
			return getRuleContext(Punto_y_coma_opcionalContext.class,0);
		}
		public Declaracion_contenido_varContext declaracion_contenido_var() {
			return getRuleContext(Declaracion_contenido_varContext.class,0);
		}
		public Mas_declaraciones_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_declaraciones_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterMas_declaraciones_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitMas_declaraciones_var(this);
		}
	}

	public final Mas_declaraciones_varContext mas_declaraciones_var() throws RecognitionException {
		Mas_declaraciones_varContext _localctx = new Mas_declaraciones_varContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mas_declaraciones_var);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PUNTO_Y_COMA:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				punto_y_coma_opcional();
				setState(228);
				declaracion_contenido_var();
				}
				break;
			case INICIO:
			case TIPOS:
			case VAR:
			case CONST:
			case TK_LLAVE_DERECHA:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mas_declaraciones_tiposContext extends ParserRuleContext {
		public Punto_y_coma_opcionalContext punto_y_coma_opcional() {
			return getRuleContext(Punto_y_coma_opcionalContext.class,0);
		}
		public Declaracion_contenido_tiposContext declaracion_contenido_tipos() {
			return getRuleContext(Declaracion_contenido_tiposContext.class,0);
		}
		public Mas_declaraciones_tiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_declaraciones_tipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterMas_declaraciones_tipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitMas_declaraciones_tipos(this);
		}
	}

	public final Mas_declaraciones_tiposContext mas_declaraciones_tipos() throws RecognitionException {
		Mas_declaraciones_tiposContext _localctx = new Mas_declaraciones_tiposContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mas_declaraciones_tipos);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PUNTO_Y_COMA:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				punto_y_coma_opcional();
				setState(234);
				declaracion_contenido_tipos();
				}
				break;
			case INICIO:
			case TIPOS:
			case VAR:
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mas_declaraciones_constContext extends ParserRuleContext {
		public Punto_y_coma_opcionalContext punto_y_coma_opcional() {
			return getRuleContext(Punto_y_coma_opcionalContext.class,0);
		}
		public Declaracion_contenido_constContext declaracion_contenido_const() {
			return getRuleContext(Declaracion_contenido_constContext.class,0);
		}
		public Mas_declaraciones_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_declaraciones_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterMas_declaraciones_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitMas_declaraciones_const(this);
		}
	}

	public final Mas_declaraciones_constContext mas_declaraciones_const() throws RecognitionException {
		Mas_declaraciones_constContext _localctx = new Mas_declaraciones_constContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mas_declaraciones_const);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PUNTO_Y_COMA:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				punto_y_coma_opcional();
				setState(240);
				declaracion_contenido_const();
				}
				break;
			case INICIO:
			case TIPOS:
			case VAR:
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(SLParser.INICIO, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TerminalNode FIN() { return getToken(SLParser.FIN, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(INICIO);
			setState(246);
			sentencias();
			setState(247);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_subrutinaContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(SLParser.INICIO, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public Sentencia_retorna_mainContext sentencia_retorna_main() {
			return getRuleContext(Sentencia_retorna_mainContext.class,0);
		}
		public TerminalNode FIN() { return getToken(SLParser.FIN, 0); }
		public Main_subrutinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_subrutina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterMain_subrutina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitMain_subrutina(this);
		}
	}

	public final Main_subrutinaContext main_subrutina() throws RecognitionException {
		Main_subrutinaContext _localctx = new Main_subrutinaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_main_subrutina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(INICIO);
			setState(250);
			sentencias();
			setState(251);
			sentencia_retorna_main();
			setState(252);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciasContext extends ParserRuleContext {
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public Punto_y_coma_opcionalContext punto_y_coma_opcional() {
			return getRuleContext(Punto_y_coma_opcionalContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSentencias(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sentencias);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESDE:
			case MIENTRAS:
			case REPETIR:
			case EVAL:
			case SI:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				sentencia();
				setState(255);
				punto_y_coma_opcional();
				setState(256);
				sentencias();
				}
				break;
			case RETORNA:
			case FIN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Id_casosContext id_casos() {
			return getRuleContext(Id_casosContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public Ciclo_mientrasContext ciclo_mientras() {
			return getRuleContext(Ciclo_mientrasContext.class,0);
		}
		public Sentencia_evalContext sentencia_eval() {
			return getRuleContext(Sentencia_evalContext.class,0);
		}
		public Ciclo_desdeContext ciclo_desde() {
			return getRuleContext(Ciclo_desdeContext.class,0);
		}
		public Ciclo_repetirContext ciclo_repetir() {
			return getRuleContext(Ciclo_repetirContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sentencia);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(ID);
				setState(262);
				id_casos();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				condicional();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				ciclo_mientras();
				}
				break;
			case EVAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				sentencia_eval();
				}
				break;
			case DESDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				ciclo_desde();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				ciclo_repetir();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentencias_internasContext extends ParserRuleContext {
		public Sentencia_internaContext sentencia_interna() {
			return getRuleContext(Sentencia_internaContext.class,0);
		}
		public Punto_y_coma_opcionalContext punto_y_coma_opcional() {
			return getRuleContext(Punto_y_coma_opcionalContext.class,0);
		}
		public Sentencias_internasContext sentencias_internas() {
			return getRuleContext(Sentencias_internasContext.class,0);
		}
		public Sentencias_internasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias_internas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSentencias_internas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSentencias_internas(this);
		}
	}

	public final Sentencias_internasContext sentencias_internas() throws RecognitionException {
		Sentencias_internasContext _localctx = new Sentencias_internasContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sentencias_internas);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESDE:
			case MIENTRAS:
			case REPETIR:
			case EVAL:
			case SI:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				sentencia_interna();
				setState(271);
				punto_y_coma_opcional();
				setState(272);
				sentencias_internas();
				}
				break;
			case HASTA:
			case SINO:
			case CASO:
			case TK_LLAVE_DERECHA:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentencia_internaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Id_casosContext id_casos() {
			return getRuleContext(Id_casosContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public Ciclo_mientrasContext ciclo_mientras() {
			return getRuleContext(Ciclo_mientrasContext.class,0);
		}
		public Sentencia_evalContext sentencia_eval() {
			return getRuleContext(Sentencia_evalContext.class,0);
		}
		public Ciclo_desdeContext ciclo_desde() {
			return getRuleContext(Ciclo_desdeContext.class,0);
		}
		public Ciclo_repetirContext ciclo_repetir() {
			return getRuleContext(Ciclo_repetirContext.class,0);
		}
		public Sentencia_internaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_interna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSentencia_interna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSentencia_interna(this);
		}
	}

	public final Sentencia_internaContext sentencia_interna() throws RecognitionException {
		Sentencia_internaContext _localctx = new Sentencia_internaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sentencia_interna);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(ID);
				setState(278);
				id_casos();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				condicional();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				ciclo_mientras();
				}
				break;
			case EVAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				sentencia_eval();
				}
				break;
			case DESDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				ciclo_desde();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				ciclo_repetir();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_casosContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Llamada_subrutinaContext llamada_subrutina() {
			return getRuleContext(Llamada_subrutinaContext.class,0);
		}
		public Id_arreglo_registroContext id_arreglo_registro() {
			return getRuleContext(Id_arreglo_registroContext.class,0);
		}
		public Id_casosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_casos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterId_casos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitId_casos(this);
		}
	}

	public final Id_casosContext id_casos() throws RecognitionException {
		Id_casosContext _localctx = new Id_casosContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_id_casos);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ASIGNACION:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				asignacion();
				}
				break;
			case TK_PARENTESIS_IZQUIERDO:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				llamada_subrutina();
				}
				break;
			case TK_CORCHETE_IZQUIERDO:
			case TK_PUNTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				id_arreglo_registro();
				setState(289);
				asignacion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Punto_y_coma_opcionalContext extends ParserRuleContext {
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(SLParser.TK_PUNTO_Y_COMA, 0); }
		public Punto_y_coma_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punto_y_coma_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterPunto_y_coma_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitPunto_y_coma_opcional(this);
		}
	}

	public final Punto_y_coma_opcionalContext punto_y_coma_opcional() throws RecognitionException {
		Punto_y_coma_opcionalContext _localctx = new Punto_y_coma_opcionalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_punto_y_coma_opcional);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PUNTO_Y_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case HASTA:
			case SINO:
			case DESDE:
			case MIENTRAS:
			case REPETIR:
			case CASO:
			case EVAL:
			case RETORNA:
			case FIN:
			case SI:
			case TK_LLAVE_DERECHA:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Expresion_auxContext expresion_aux() {
			return getRuleContext(Expresion_auxContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(SLParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(SLParser.TK_PARENTESIS_DERECHO, 0); }
		public TerminalNode NOT() { return getToken(SLParser.NOT, 0); }
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Valor_auxContext valor_aux() {
			return getRuleContext(Valor_auxContext.class,0);
		}
		public Valores_vectorContext valores_vector() {
			return getRuleContext(Valores_vectorContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expresion);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case SI:
			case NO:
			case TK_RESTA:
			case TK_SUMA:
			case TK_NUMERO:
			case TK_CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				variable();
				setState(298);
				expresion_aux();
				}
				break;
			case TK_PARENTESIS_IZQUIERDO:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(301);
				expresion();
				setState(302);
				match(TK_PARENTESIS_DERECHO);
				setState(303);
				expresion_aux();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(NOT);
				setState(306);
				expresion();
				setState(307);
				expresion_aux();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				match(ID);
				setState(310);
				valor_aux();
				setState(311);
				expresion_aux();
				}
				break;
			case TK_LLAVE_IZQUIERDA:
				enterOuterAlt(_localctx, 5);
				{
				setState(313);
				valores_vector();
				setState(314);
				expresion_aux();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expresion_auxContext extends ParserRuleContext {
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Expresion_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterExpresion_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitExpresion_aux(this);
		}
	}

	public final Expresion_auxContext expresion_aux() throws RecognitionException {
		Expresion_auxContext _localctx = new Expresion_auxContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expresion_aux);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				operador();
				setState(319);
				expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valores_vectorContext extends ParserRuleContext {
		public TerminalNode TK_LLAVE_IZQUIERDA() { return getToken(SLParser.TK_LLAVE_IZQUIERDA, 0); }
		public Posibles_valores_vectorContext posibles_valores_vector() {
			return getRuleContext(Posibles_valores_vectorContext.class,0);
		}
		public Mas_valores_vectorContext mas_valores_vector() {
			return getRuleContext(Mas_valores_vectorContext.class,0);
		}
		public TerminalNode TK_LLAVE_DERECHA() { return getToken(SLParser.TK_LLAVE_DERECHA, 0); }
		public Valores_vectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterValores_vector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitValores_vector(this);
		}
	}

	public final Valores_vectorContext valores_vector() throws RecognitionException {
		Valores_vectorContext _localctx = new Valores_vectorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_valores_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(TK_LLAVE_IZQUIERDA);
			setState(325);
			posibles_valores_vector();
			setState(326);
			mas_valores_vector();
			setState(327);
			match(TK_LLAVE_DERECHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Posibles_valores_vectorContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public Valores_vectorContext valores_vector() {
			return getRuleContext(Valores_vectorContext.class,0);
		}
		public Posibles_valores_vectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posibles_valores_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterPosibles_valores_vector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitPosibles_valores_vector(this);
		}
	}

	public final Posibles_valores_vectorContext posibles_valores_vector() throws RecognitionException {
		Posibles_valores_vectorContext _localctx = new Posibles_valores_vectorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_posibles_valores_vector);
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case SI:
			case NO:
			case TK_RESTA:
			case TK_SUMA:
			case ID:
			case TK_NUMERO:
			case TK_CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				valor();
				}
				break;
			case TK_LLAVE_IZQUIERDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				valores_vector();
				}
				break;
			case TK_COMA:
			case TK_LLAVE_DERECHA:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mas_valores_vectorContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(SLParser.TK_COMA, 0); }
		public Posibles_valores_vectorContext posibles_valores_vector() {
			return getRuleContext(Posibles_valores_vectorContext.class,0);
		}
		public Mas_valores_vectorContext mas_valores_vector() {
			return getRuleContext(Mas_valores_vectorContext.class,0);
		}
		public Mas_valores_vectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_valores_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterMas_valores_vector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitMas_valores_vector(this);
		}
	}

	public final Mas_valores_vectorContext mas_valores_vector() throws RecognitionException {
		Mas_valores_vectorContext _localctx = new Mas_valores_vectorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mas_valores_vector);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(TK_COMA);
				setState(335);
				posibles_valores_vector();
				setState(336);
				mas_valores_vector();
				}
				break;
			case TK_LLAVE_DERECHA:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_arreglo_registroContext extends ParserRuleContext {
		public TerminalNode TK_CORCHETE_IZQUIERDO() { return getToken(SLParser.TK_CORCHETE_IZQUIERDO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Mas_parametrosContext mas_parametros() {
			return getRuleContext(Mas_parametrosContext.class,0);
		}
		public TerminalNode TK_CORCHETE_DERECHO() { return getToken(SLParser.TK_CORCHETE_DERECHO, 0); }
		public Mas_pos_valorContext mas_pos_valor() {
			return getRuleContext(Mas_pos_valorContext.class,0);
		}
		public TerminalNode TK_PUNTO() { return getToken(SLParser.TK_PUNTO, 0); }
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Id_arreglo_registroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_arreglo_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterId_arreglo_registro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitId_arreglo_registro(this);
		}
	}

	public final Id_arreglo_registroContext id_arreglo_registro() throws RecognitionException {
		Id_arreglo_registroContext _localctx = new Id_arreglo_registroContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_id_arreglo_registro);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CORCHETE_IZQUIERDO:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(TK_CORCHETE_IZQUIERDO);
				setState(342);
				expresion();
				setState(343);
				mas_parametros();
				setState(344);
				match(TK_CORCHETE_DERECHO);
				setState(345);
				mas_pos_valor();
				}
				break;
			case TK_PUNTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(TK_PUNTO);
				setState(348);
				match(ID);
				setState(349);
				mas_pos_valor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mas_pos_valorContext extends ParserRuleContext {
		public Id_arreglo_registroContext id_arreglo_registro() {
			return getRuleContext(Id_arreglo_registroContext.class,0);
		}
		public Mas_pos_valorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_pos_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterMas_pos_valor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitMas_pos_valor(this);
		}
	}

	public final Mas_pos_valorContext mas_pos_valor() throws RecognitionException {
		Mas_pos_valorContext _localctx = new Mas_pos_valorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mas_pos_valor);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CORCHETE_IZQUIERDO:
			case TK_PUNTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				id_arreglo_registro();
				}
				break;
			case AND:
			case HASTA:
			case PASO:
			case SINO:
			case DESDE:
			case INICIO:
			case MIENTRAS:
			case REPETIR:
			case TIPOS:
			case CASO:
			case EVAL:
			case RETORNA:
			case VAR:
			case CONST:
			case FIN:
			case OR:
			case SI:
			case TK_COMA:
			case TK_CORCHETE_DERECHO:
			case TK_LLAVE_DERECHA:
			case TK_LLAVE_IZQUIERDA:
			case TK_MODULO:
			case TK_MULTIPLICACION:
			case TK_PARENTESIS_DERECHO:
			case TK_POTENCIACION:
			case TK_PUNTO_Y_COMA:
			case TK_RESTA:
			case TK_SUMA:
			case TK_ASIGNACION:
			case TK_IGUAL_QUE:
			case TK_MENOR:
			case TK_DISTINTO_DE:
			case TK_MENOR_IGUAL:
			case TK_MAYOR:
			case TK_MAYOR_IGUAL:
			case TK_DIVISION:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode TK_MODULO() { return getToken(SLParser.TK_MODULO, 0); }
		public TerminalNode TK_MULTIPLICACION() { return getToken(SLParser.TK_MULTIPLICACION, 0); }
		public TerminalNode TK_POTENCIACION() { return getToken(SLParser.TK_POTENCIACION, 0); }
		public TerminalNode TK_RESTA() { return getToken(SLParser.TK_RESTA, 0); }
		public TerminalNode TK_SUMA() { return getToken(SLParser.TK_SUMA, 0); }
		public TerminalNode TK_DIVISION() { return getToken(SLParser.TK_DIVISION, 0); }
		public TerminalNode TK_IGUAL_QUE() { return getToken(SLParser.TK_IGUAL_QUE, 0); }
		public TerminalNode TK_MENOR() { return getToken(SLParser.TK_MENOR, 0); }
		public TerminalNode TK_DISTINTO_DE() { return getToken(SLParser.TK_DISTINTO_DE, 0); }
		public TerminalNode TK_MENOR_IGUAL() { return getToken(SLParser.TK_MENOR_IGUAL, 0); }
		public TerminalNode TK_MAYOR() { return getToken(SLParser.TK_MAYOR, 0); }
		public TerminalNode TK_MAYOR_IGUAL() { return getToken(SLParser.TK_MAYOR_IGUAL, 0); }
		public TerminalNode AND() { return getToken(SLParser.AND, 0); }
		public TerminalNode OR() { return getToken(SLParser.OR, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitOperador(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << TK_MODULO) | (1L << TK_MULTIPLICACION) | (1L << TK_POTENCIACION) | (1L << TK_RESTA) | (1L << TK_SUMA) | (1L << TK_IGUAL_QUE) | (1L << TK_MENOR) | (1L << TK_DISTINTO_DE) | (1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR) | (1L << TK_MAYOR_IGUAL) | (1L << TK_DIVISION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode TK_ASIGNACION() { return getToken(SLParser.TK_ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(TK_ASIGNACION);
			setState(359);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(SLParser.SI, 0); }
		public Condicional_condicionContext condicional_condicion() {
			return getRuleContext(Condicional_condicionContext.class,0);
		}
		public TerminalNode TK_LLAVE_IZQUIERDA() { return getToken(SLParser.TK_LLAVE_IZQUIERDA, 0); }
		public Sentencias_internasContext sentencias_internas() {
			return getRuleContext(Sentencias_internasContext.class,0);
		}
		public Mas_condicionalesContext mas_condicionales() {
			return getRuleContext(Mas_condicionalesContext.class,0);
		}
		public TerminalNode TK_LLAVE_DERECHA() { return getToken(SLParser.TK_LLAVE_DERECHA, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(SI);
			setState(362);
			condicional_condicion();
			setState(363);
			match(TK_LLAVE_IZQUIERDA);
			setState(364);
			sentencias_internas();
			setState(365);
			mas_condicionales();
			setState(366);
			match(TK_LLAVE_DERECHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condicional_condicionContext extends ParserRuleContext {
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(SLParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(SLParser.TK_PARENTESIS_DERECHO, 0); }
		public Condicional_condicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCondicional_condicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCondicional_condicion(this);
		}
	}

	public final Condicional_condicionContext condicional_condicion() throws RecognitionException {
		Condicional_condicionContext _localctx = new Condicional_condicionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_condicional_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(369);
			expresion();
			setState(370);
			match(TK_PARENTESIS_DERECHO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mas_condicionalesContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(SLParser.SINO, 0); }
		public Condicional_Context condicional_() {
			return getRuleContext(Condicional_Context.class,0);
		}
		public Mas_condicionalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_condicionales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterMas_condicionales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitMas_condicionales(this);
		}
	}

	public final Mas_condicionalesContext mas_condicionales() throws RecognitionException {
		Mas_condicionalesContext _localctx = new Mas_condicionalesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_mas_condicionales);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(SINO);
				setState(373);
				condicional_();
				}
				break;
			case TK_LLAVE_DERECHA:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condicional_Context extends ParserRuleContext {
		public TerminalNode SI() { return getToken(SLParser.SI, 0); }
		public Condicional_condicionContext condicional_condicion() {
			return getRuleContext(Condicional_condicionContext.class,0);
		}
		public Sentencias_internasContext sentencias_internas() {
			return getRuleContext(Sentencias_internasContext.class,0);
		}
		public Mas_condicionalesContext mas_condicionales() {
			return getRuleContext(Mas_condicionalesContext.class,0);
		}
		public Condicional_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCondicional_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCondicional_(this);
		}
	}

	public final Condicional_Context condicional_() throws RecognitionException {
		Condicional_Context _localctx = new Condicional_Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_condicional_);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(SI);
				setState(378);
				condicional_condicion();
				setState(379);
				sentencias_internas();
				setState(380);
				mas_condicionales();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				sentencias_internas();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ciclo_mientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(SLParser.MIENTRAS, 0); }
		public Ciclo_mientras_condicionContext ciclo_mientras_condicion() {
			return getRuleContext(Ciclo_mientras_condicionContext.class,0);
		}
		public TerminalNode TK_LLAVE_IZQUIERDA() { return getToken(SLParser.TK_LLAVE_IZQUIERDA, 0); }
		public Sentencias_internasContext sentencias_internas() {
			return getRuleContext(Sentencias_internasContext.class,0);
		}
		public TerminalNode TK_LLAVE_DERECHA() { return getToken(SLParser.TK_LLAVE_DERECHA, 0); }
		public Ciclo_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCiclo_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCiclo_mientras(this);
		}
	}

	public final Ciclo_mientrasContext ciclo_mientras() throws RecognitionException {
		Ciclo_mientrasContext _localctx = new Ciclo_mientrasContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ciclo_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(MIENTRAS);
			setState(387);
			ciclo_mientras_condicion();
			setState(388);
			match(TK_LLAVE_IZQUIERDA);
			setState(389);
			sentencias_internas();
			setState(390);
			match(TK_LLAVE_DERECHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ciclo_mientras_condicionContext extends ParserRuleContext {
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(SLParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(SLParser.TK_PARENTESIS_DERECHO, 0); }
		public Ciclo_mientras_condicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_mientras_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCiclo_mientras_condicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCiclo_mientras_condicion(this);
		}
	}

	public final Ciclo_mientras_condicionContext ciclo_mientras_condicion() throws RecognitionException {
		Ciclo_mientras_condicionContext _localctx = new Ciclo_mientras_condicionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ciclo_mientras_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(393);
			expresion();
			setState(394);
			match(TK_PARENTESIS_DERECHO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentencia_evalContext extends ParserRuleContext {
		public TerminalNode EVAL() { return getToken(SLParser.EVAL, 0); }
		public TerminalNode TK_LLAVE_IZQUIERDA() { return getToken(SLParser.TK_LLAVE_IZQUIERDA, 0); }
		public Sentencia_eval_casoContext sentencia_eval_caso() {
			return getRuleContext(Sentencia_eval_casoContext.class,0);
		}
		public Sentencias_internasContext sentencias_internas() {
			return getRuleContext(Sentencias_internasContext.class,0);
		}
		public Mas_casos_evalContext mas_casos_eval() {
			return getRuleContext(Mas_casos_evalContext.class,0);
		}
		public TerminalNode TK_LLAVE_DERECHA() { return getToken(SLParser.TK_LLAVE_DERECHA, 0); }
		public Sentencia_evalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSentencia_eval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSentencia_eval(this);
		}
	}

	public final Sentencia_evalContext sentencia_eval() throws RecognitionException {
		Sentencia_evalContext _localctx = new Sentencia_evalContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sentencia_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(EVAL);
			setState(397);
			match(TK_LLAVE_IZQUIERDA);
			setState(398);
			sentencia_eval_caso();
			setState(399);
			sentencias_internas();
			setState(400);
			mas_casos_eval();
			setState(401);
			match(TK_LLAVE_DERECHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentencia_eval_casoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(SLParser.CASO, 0); }
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(SLParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(SLParser.TK_PARENTESIS_DERECHO, 0); }
		public Sentencia_eval_casoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_eval_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSentencia_eval_caso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSentencia_eval_caso(this);
		}
	}

	public final Sentencia_eval_casoContext sentencia_eval_caso() throws RecognitionException {
		Sentencia_eval_casoContext _localctx = new Sentencia_eval_casoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sentencia_eval_caso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(CASO);
			setState(404);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(405);
			expresion();
			setState(406);
			match(TK_PARENTESIS_DERECHO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mas_casos_evalContext extends ParserRuleContext {
		public Sentencia_eval_casoContext sentencia_eval_caso() {
			return getRuleContext(Sentencia_eval_casoContext.class,0);
		}
		public Sentencias_internasContext sentencias_internas() {
			return getRuleContext(Sentencias_internasContext.class,0);
		}
		public Mas_casos_evalContext mas_casos_eval() {
			return getRuleContext(Mas_casos_evalContext.class,0);
		}
		public TerminalNode SINO() { return getToken(SLParser.SINO, 0); }
		public Mas_casos_evalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_casos_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterMas_casos_eval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitMas_casos_eval(this);
		}
	}

	public final Mas_casos_evalContext mas_casos_eval() throws RecognitionException {
		Mas_casos_evalContext _localctx = new Mas_casos_evalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_mas_casos_eval);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASO:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				sentencia_eval_caso();
				setState(409);
				sentencias_internas();
				setState(410);
				mas_casos_eval();
				}
				break;
			case SINO:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(SINO);
				setState(413);
				sentencias_internas();
				}
				break;
			case TK_LLAVE_DERECHA:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ciclo_desdeContext extends ParserRuleContext {
		public TerminalNode DESDE() { return getToken(SLParser.DESDE, 0); }
		public Ciclo_desde_inicioContext ciclo_desde_inicio() {
			return getRuleContext(Ciclo_desde_inicioContext.class,0);
		}
		public TerminalNode HASTA() { return getToken(SLParser.HASTA, 0); }
		public Ciclo_desde_finContext ciclo_desde_fin() {
			return getRuleContext(Ciclo_desde_finContext.class,0);
		}
		public Paso_optContext paso_opt() {
			return getRuleContext(Paso_optContext.class,0);
		}
		public TerminalNode TK_LLAVE_IZQUIERDA() { return getToken(SLParser.TK_LLAVE_IZQUIERDA, 0); }
		public Sentencias_internasContext sentencias_internas() {
			return getRuleContext(Sentencias_internasContext.class,0);
		}
		public TerminalNode TK_LLAVE_DERECHA() { return getToken(SLParser.TK_LLAVE_DERECHA, 0); }
		public Ciclo_desdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_desde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCiclo_desde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCiclo_desde(this);
		}
	}

	public final Ciclo_desdeContext ciclo_desde() throws RecognitionException {
		Ciclo_desdeContext _localctx = new Ciclo_desdeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ciclo_desde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(DESDE);
			setState(418);
			ciclo_desde_inicio();
			setState(419);
			match(HASTA);
			setState(420);
			ciclo_desde_fin();
			setState(421);
			paso_opt();
			setState(422);
			match(TK_LLAVE_IZQUIERDA);
			setState(423);
			sentencias_internas();
			setState(424);
			match(TK_LLAVE_DERECHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ciclo_desde_inicioContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public TerminalNode TK_ASIGNACION() { return getToken(SLParser.TK_ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Ciclo_desde_inicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_desde_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCiclo_desde_inicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCiclo_desde_inicio(this);
		}
	}

	public final Ciclo_desde_inicioContext ciclo_desde_inicio() throws RecognitionException {
		Ciclo_desde_inicioContext _localctx = new Ciclo_desde_inicioContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_ciclo_desde_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(ID);
			setState(427);
			match(TK_ASIGNACION);
			setState(428);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ciclo_desde_finContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Ciclo_desde_finContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_desde_fin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCiclo_desde_fin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCiclo_desde_fin(this);
		}
	}

	public final Ciclo_desde_finContext ciclo_desde_fin() throws RecognitionException {
		Ciclo_desde_finContext _localctx = new Ciclo_desde_finContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ciclo_desde_fin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Paso_optContext extends ParserRuleContext {
		public TerminalNode PASO() { return getToken(SLParser.PASO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Paso_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterPaso_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitPaso_opt(this);
		}
	}

	public final Paso_optContext paso_opt() throws RecognitionException {
		Paso_optContext _localctx = new Paso_optContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_paso_opt);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASO:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(PASO);
				setState(433);
				expresion();
				}
				break;
			case TK_LLAVE_IZQUIERDA:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamada_subrutinaContext extends ParserRuleContext {
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(SLParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(SLParser.TK_PARENTESIS_DERECHO, 0); }
		public Llamada_subrutinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_subrutina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterLlamada_subrutina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitLlamada_subrutina(this);
		}
	}

	public final Llamada_subrutinaContext llamada_subrutina() throws RecognitionException {
		Llamada_subrutinaContext _localctx = new Llamada_subrutinaContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_llamada_subrutina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(438);
			parametros();
			setState(439);
			match(TK_PARENTESIS_DERECHO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Mas_parametrosContext mas_parametros() {
			return getRuleContext(Mas_parametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_parametros);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case TRUE:
			case FALSE:
			case SI:
			case NO:
			case TK_LLAVE_IZQUIERDA:
			case TK_PARENTESIS_IZQUIERDO:
			case TK_RESTA:
			case TK_SUMA:
			case ID:
			case TK_NUMERO:
			case TK_CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				expresion();
				setState(442);
				mas_parametros();
				}
				break;
			case TK_PARENTESIS_DERECHO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mas_parametrosContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(SLParser.TK_COMA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Mas_parametrosContext mas_parametros() {
			return getRuleContext(Mas_parametrosContext.class,0);
		}
		public Mas_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterMas_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitMas_parametros(this);
		}
	}

	public final Mas_parametrosContext mas_parametros() throws RecognitionException {
		Mas_parametrosContext _localctx = new Mas_parametrosContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_mas_parametros);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(TK_COMA);
				setState(448);
				expresion();
				setState(449);
				mas_parametros();
				}
				break;
			case TK_CORCHETE_DERECHO:
			case TK_PARENTESIS_DERECHO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentencia_retorna_subrutinaContext extends ParserRuleContext {
		public TerminalNode RETORNA() { return getToken(SLParser.RETORNA, 0); }
		public Valor_retornoContext valor_retorno() {
			return getRuleContext(Valor_retornoContext.class,0);
		}
		public Sentencia_retorna_subrutinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_retorna_subrutina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSentencia_retorna_subrutina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSentencia_retorna_subrutina(this);
		}
	}

	public final Sentencia_retorna_subrutinaContext sentencia_retorna_subrutina() throws RecognitionException {
		Sentencia_retorna_subrutinaContext _localctx = new Sentencia_retorna_subrutinaContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_sentencia_retorna_subrutina);
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETORNA:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(RETORNA);
				setState(455);
				valor_retorno();
				}
				break;
			case INICIO:
			case TIPOS:
			case VAR:
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentencia_retorna_mainContext extends ParserRuleContext {
		public TerminalNode RETORNA() { return getToken(SLParser.RETORNA, 0); }
		public Valor_retornoContext valor_retorno() {
			return getRuleContext(Valor_retornoContext.class,0);
		}
		public Sentencia_retorna_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_retorna_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSentencia_retorna_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSentencia_retorna_main(this);
		}
	}

	public final Sentencia_retorna_mainContext sentencia_retorna_main() throws RecognitionException {
		Sentencia_retorna_mainContext _localctx = new Sentencia_retorna_mainContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_sentencia_retorna_main);
		try {
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETORNA:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(RETORNA);
				setState(460);
				valor_retorno();
				}
				break;
			case FIN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_retornoContext extends ParserRuleContext {
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(SLParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(SLParser.TK_PARENTESIS_DERECHO, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public Valor_retornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterValor_retorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitValor_retorno(this);
		}
	}

	public final Valor_retornoContext valor_retorno() throws RecognitionException {
		Valor_retornoContext _localctx = new Valor_retornoContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_valor_retorno);
		try {
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(465);
				expresion();
				setState(466);
				match(TK_PARENTESIS_DERECHO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				expresion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				tipo_dato();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ciclo_repetirContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(SLParser.REPETIR, 0); }
		public Sentencias_internasContext sentencias_internas() {
			return getRuleContext(Sentencias_internasContext.class,0);
		}
		public TerminalNode HASTA() { return getToken(SLParser.HASTA, 0); }
		public Ciclo_repetir_condicionContext ciclo_repetir_condicion() {
			return getRuleContext(Ciclo_repetir_condicionContext.class,0);
		}
		public Ciclo_repetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCiclo_repetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCiclo_repetir(this);
		}
	}

	public final Ciclo_repetirContext ciclo_repetir() throws RecognitionException {
		Ciclo_repetirContext _localctx = new Ciclo_repetirContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_ciclo_repetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(REPETIR);
			setState(473);
			sentencias_internas();
			setState(474);
			match(HASTA);
			setState(475);
			ciclo_repetir_condicion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ciclo_repetir_condicionContext extends ParserRuleContext {
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(SLParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(SLParser.TK_PARENTESIS_DERECHO, 0); }
		public Ciclo_repetir_condicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_repetir_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterCiclo_repetir_condicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitCiclo_repetir_condicion(this);
		}
	}

	public final Ciclo_repetir_condicionContext ciclo_repetir_condicion() throws RecognitionException {
		Ciclo_repetir_condicionContext _localctx = new Ciclo_repetir_condicionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_ciclo_repetir_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(478);
			expresion();
			setState(479);
			match(TK_PARENTESIS_DERECHO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subrutina_Context extends ParserRuleContext {
		public TerminalNode SUBRUTINA() { return getToken(SLParser.SUBRUTINA, 0); }
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(SLParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public Param_subrutinaContext param_subrutina() {
			return getRuleContext(Param_subrutinaContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(SLParser.TK_PARENTESIS_DERECHO, 0); }
		public Sentencia_retorna_subrutinaContext sentencia_retorna_subrutina() {
			return getRuleContext(Sentencia_retorna_subrutinaContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public Main_subrutinaContext main_subrutina() {
			return getRuleContext(Main_subrutinaContext.class,0);
		}
		public Subrutina_Context subrutina_() {
			return getRuleContext(Subrutina_Context.class,0);
		}
		public Subrutina_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrutina_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterSubrutina_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitSubrutina_(this);
		}
	}

	public final Subrutina_Context subrutina_() throws RecognitionException {
		Subrutina_Context _localctx = new Subrutina_Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_subrutina_);
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBRUTINA:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(SUBRUTINA);
				setState(482);
				match(ID);
				setState(483);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(484);
				param_subrutina();
				setState(485);
				match(TK_PARENTESIS_DERECHO);
				setState(486);
				sentencia_retorna_subrutina();
				setState(487);
				declaracion();
				setState(488);
				main_subrutina();
				setState(489);
				subrutina_();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_subrutinaContext extends ParserRuleContext {
		public Param_refContext param_ref() {
			return getRuleContext(Param_refContext.class,0);
		}
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Otros_idContext otros_id() {
			return getRuleContext(Otros_idContext.class,0);
		}
		public TerminalNode TK_DOS_PUNTOS() { return getToken(SLParser.TK_DOS_PUNTOS, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public Mas_param_subrutinaContext mas_param_subrutina() {
			return getRuleContext(Mas_param_subrutinaContext.class,0);
		}
		public Param_subrutinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_subrutina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterParam_subrutina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitParam_subrutina(this);
		}
	}

	public final Param_subrutinaContext param_subrutina() throws RecognitionException {
		Param_subrutinaContext _localctx = new Param_subrutinaContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_param_subrutina);
		try {
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				param_ref();
				setState(495);
				match(ID);
				setState(496);
				otros_id();
				setState(497);
				match(TK_DOS_PUNTOS);
				setState(498);
				tipo_dato();
				setState(499);
				mas_param_subrutina();
				}
				break;
			case TK_PARENTESIS_DERECHO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mas_param_subrutinaContext extends ParserRuleContext {
		public Punto_y_coma_opcional_subrutinaContext punto_y_coma_opcional_subrutina() {
			return getRuleContext(Punto_y_coma_opcional_subrutinaContext.class,0);
		}
		public Mas_param_subrutinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_param_subrutina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterMas_param_subrutina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitMas_param_subrutina(this);
		}
	}

	public final Mas_param_subrutinaContext mas_param_subrutina() throws RecognitionException {
		Mas_param_subrutinaContext _localctx = new Mas_param_subrutinaContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_mas_param_subrutina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			punto_y_coma_opcional_subrutina();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Punto_y_coma_opcional_subrutinaContext extends ParserRuleContext {
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(SLParser.TK_PUNTO_Y_COMA, 0); }
		public Param_refContext param_ref() {
			return getRuleContext(Param_refContext.class,0);
		}
		public TerminalNode ID() { return getToken(SLParser.ID, 0); }
		public Otros_idContext otros_id() {
			return getRuleContext(Otros_idContext.class,0);
		}
		public TerminalNode TK_DOS_PUNTOS() { return getToken(SLParser.TK_DOS_PUNTOS, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public Mas_param_subrutinaContext mas_param_subrutina() {
			return getRuleContext(Mas_param_subrutinaContext.class,0);
		}
		public Punto_y_coma_opcional_subrutinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punto_y_coma_opcional_subrutina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterPunto_y_coma_opcional_subrutina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitPunto_y_coma_opcional_subrutina(this);
		}
	}

	public final Punto_y_coma_opcional_subrutinaContext punto_y_coma_opcional_subrutina() throws RecognitionException {
		Punto_y_coma_opcional_subrutinaContext _localctx = new Punto_y_coma_opcional_subrutinaContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_punto_y_coma_opcional_subrutina);
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PUNTO_Y_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				match(TK_PUNTO_Y_COMA);
				setState(507);
				param_ref();
				setState(508);
				match(ID);
				setState(509);
				otros_id();
				setState(510);
				match(TK_DOS_PUNTOS);
				setState(511);
				tipo_dato();
				setState(512);
				mas_param_subrutina();
				}
				break;
			case TK_PARENTESIS_DERECHO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_refContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(SLParser.REF, 0); }
		public Param_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).enterParam_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLListener ) ((SLListener)listener).exitParam_ref(this);
		}
	}

	public final Param_refContext param_ref() throws RecognitionException {
		Param_refContext _localctx = new Param_refContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_param_ref);
		try {
			setState(519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				match(REF);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u020a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0083\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0092\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a7\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00ac\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b7\b\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00c1\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d9\b\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00e2\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00e8\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00ee\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00f4\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0104\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u010d\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0114\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u011d\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0124\b\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u0128\b"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u013d\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0143\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u014d\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u0154\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u015f\b\u001f\u0001 \u0001 \u0003 \u0163\b \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0003%\u0178\b%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0181\b&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u01a0\b+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001/\u0001/\u0001/\u0003/\u01b4\b/\u00010\u0001"+
		"0\u00010\u00010\u00011\u00011\u00011\u00011\u00031\u01be\b1\u00012\u0001"+
		"2\u00012\u00012\u00012\u00032\u01c5\b2\u00013\u00013\u00013\u00033\u01ca"+
		"\b3\u00014\u00014\u00014\u00034\u01cf\b4\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00035\u01d7\b5\u00016\u00016\u00016\u00016\u00016\u00017\u0001"+
		"7\u00017\u00017\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00038\u01ed\b8\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00039\u01f7\b9\u0001:\u0001:\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u0204\b;\u0001<\u0001"+
		"<\u0003<\u0208\b<\u0001<\u0000\u0000=\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvx\u0000\u0004\u0001\u0000:;\u0001\u000001\u0002"+
		"\u0000++:;\u0006\u0000\u0001\u0001\u001a\u001a*+..0139\u020d\u0000z\u0001"+
		"\u0000\u0000\u0000\u0002\u0082\u0001\u0000\u0000\u0000\u0004\u0091\u0001"+
		"\u0000\u0000\u0000\u0006\u0093\u0001\u0000\u0000\u0000\b\u0098\u0001\u0000"+
		"\u0000\u0000\n\u009d\u0001\u0000\u0000\u0000\f\u00a6\u0001\u0000\u0000"+
		"\u0000\u000e\u00ab\u0001\u0000\u0000\u0000\u0010\u00b6\u0001\u0000\u0000"+
		"\u0000\u0012\u00b8\u0001\u0000\u0000\u0000\u0014\u00ba\u0001\u0000\u0000"+
		"\u0000\u0016\u00c0\u0001\u0000\u0000\u0000\u0018\u00d8\u0001\u0000\u0000"+
		"\u0000\u001a\u00da\u0001\u0000\u0000\u0000\u001c\u00e1\u0001\u0000\u0000"+
		"\u0000\u001e\u00e7\u0001\u0000\u0000\u0000 \u00ed\u0001\u0000\u0000\u0000"+
		"\"\u00f3\u0001\u0000\u0000\u0000$\u00f5\u0001\u0000\u0000\u0000&\u00f9"+
		"\u0001\u0000\u0000\u0000(\u0103\u0001\u0000\u0000\u0000*\u010c\u0001\u0000"+
		"\u0000\u0000,\u0113\u0001\u0000\u0000\u0000.\u011c\u0001\u0000\u0000\u0000"+
		"0\u0123\u0001\u0000\u0000\u00002\u0127\u0001\u0000\u0000\u00004\u013c"+
		"\u0001\u0000\u0000\u00006\u0142\u0001\u0000\u0000\u00008\u0144\u0001\u0000"+
		"\u0000\u0000:\u014c\u0001\u0000\u0000\u0000<\u0153\u0001\u0000\u0000\u0000"+
		">\u015e\u0001\u0000\u0000\u0000@\u0162\u0001\u0000\u0000\u0000B\u0164"+
		"\u0001\u0000\u0000\u0000D\u0166\u0001\u0000\u0000\u0000F\u0169\u0001\u0000"+
		"\u0000\u0000H\u0170\u0001\u0000\u0000\u0000J\u0177\u0001\u0000\u0000\u0000"+
		"L\u0180\u0001\u0000\u0000\u0000N\u0182\u0001\u0000\u0000\u0000P\u0188"+
		"\u0001\u0000\u0000\u0000R\u018c\u0001\u0000\u0000\u0000T\u0193\u0001\u0000"+
		"\u0000\u0000V\u019f\u0001\u0000\u0000\u0000X\u01a1\u0001\u0000\u0000\u0000"+
		"Z\u01aa\u0001\u0000\u0000\u0000\\\u01ae\u0001\u0000\u0000\u0000^\u01b3"+
		"\u0001\u0000\u0000\u0000`\u01b5\u0001\u0000\u0000\u0000b\u01bd\u0001\u0000"+
		"\u0000\u0000d\u01c4\u0001\u0000\u0000\u0000f\u01c9\u0001\u0000\u0000\u0000"+
		"h\u01ce\u0001\u0000\u0000\u0000j\u01d6\u0001\u0000\u0000\u0000l\u01d8"+
		"\u0001\u0000\u0000\u0000n\u01dd\u0001\u0000\u0000\u0000p\u01ec\u0001\u0000"+
		"\u0000\u0000r\u01f6\u0001\u0000\u0000\u0000t\u01f8\u0001\u0000\u0000\u0000"+
		"v\u0203\u0001\u0000\u0000\u0000x\u0207\u0001\u0000\u0000\u0000z{\u0003"+
		"\u0002\u0001\u0000{|\u0003\u0004\u0002\u0000|}\u0003$\u0012\u0000}~\u0003"+
		"p8\u0000~\u0001\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0014\u0000"+
		"\u0000\u0080\u0083\u0005:\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000"+
		"\u0082\u007f\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0003\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0016\u0000\u0000"+
		"\u0085\u0086\u0003\n\u0005\u0000\u0086\u0087\u0003\u0004\u0002\u0000\u0087"+
		"\u0092\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u000f\u0000\u0000\u0089"+
		"\u008a\u0003\b\u0004\u0000\u008a\u008b\u0003\u0004\u0002\u0000\u008b\u0092"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0017\u0000\u0000\u008d\u008e"+
		"\u0003\u0006\u0003\u0000\u008e\u008f\u0003\u0004\u0002\u0000\u008f\u0092"+
		"\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u0084"+
		"\u0001\u0000\u0000\u0000\u0091\u0088\u0001\u0000\u0000\u0000\u0091\u008c"+
		"\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0005"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0005:\u0000\u0000\u0094\u0095\u0005"+
		"2\u0000\u0000\u0095\u0096\u00034\u001a\u0000\u0096\u0097\u0003\"\u0011"+
		"\u0000\u0097\u0007\u0001\u0000\u0000\u0000\u0098\u0099\u0005:\u0000\u0000"+
		"\u0099\u009a\u0005\'\u0000\u0000\u009a\u009b\u0003\u0018\f\u0000\u009b"+
		"\u009c\u0003 \u0010\u0000\u009c\t\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005:\u0000\u0000\u009e\u009f\u0003\u0016\u000b\u0000\u009f\u00a0\u0005"+
		"\'\u0000\u0000\u00a0\u00a1\u0003\u0018\f\u0000\u00a1\u00a2\u0003\u001e"+
		"\u000f\u0000\u00a2\u000b\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005:\u0000"+
		"\u0000\u00a4\u00a7\u0003\u000e\u0007\u0000\u00a5\u00a7\u0003\u0010\b\u0000"+
		"\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7\r\u0001\u0000\u0000\u0000\u00a8\u00ac\u0003`0\u0000\u00a9\u00ac"+
		"\u0003>\u001f\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u000f\u0001\u0000\u0000\u0000\u00ad\u00b7\u0005"+
		";\u0000\u0000\u00ae\u00b7\u0005=\u0000\u0000\u00af\u00b7\u0005 \u0000"+
		"\u0000\u00b0\u00b7\u0005!\u0000\u0000\u00b1\u00b7\u0005\"\u0000\u0000"+
		"\u00b2\u00b7\u0005#\u0000\u0000\u00b3\u00b4\u0003\u0014\n\u0000\u00b4"+
		"\u00b5\u0003\u0012\t\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b6\u00ae\u0001\u0000\u0000\u0000\u00b6\u00af"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b0\u0001\u0000\u0000\u0000\u00b6\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b2\u0001\u0000\u0000\u0000\u00b6\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b7\u0011\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0007\u0000\u0000\u0000\u00b9\u0013\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0007\u0001\u0000\u0000\u00bb\u0015\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0005$\u0000\u0000\u00bd\u00be\u0005:\u0000\u0000\u00be\u00c1\u0003\u0016"+
		"\u000b\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00bc\u0001\u0000"+
		"\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u0017\u0001\u0000"+
		"\u0000\u0000\u00c2\u00d9\u0005:\u0000\u0000\u00c3\u00d9\u0005\u001d\u0000"+
		"\u0000\u00c4\u00d9\u0005\u001e\u0000\u0000\u00c5\u00d9\u0005\u001f\u0000"+
		"\u0000\u00c6\u00c7\u0005\u0006\u0000\u0000\u00c7\u00c8\u0005)\u0000\u0000"+
		"\u00c8\u00c9\u0003\n\u0005\u0000\u00c9\u00ca\u0005(\u0000\u0000\u00ca"+
		"\u00d9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\b\u0000\u0000\u00cc\u00cd"+
		"\u0005&\u0000\u0000\u00cd\u00ce\u0003\u001a\r\u0000\u00ce\u00cf\u0005"+
		"%\u0000\u0000\u00cf\u00d0\u0003\u0018\f\u0000\u00d0\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005\u0004\u0000\u0000\u00d2\u00d3\u0005&\u0000"+
		"\u0000\u00d3\u00d4\u0003\u001a\r\u0000\u00d4\u00d5\u0003\u001c\u000e\u0000"+
		"\u00d5\u00d6\u0005%\u0000\u0000\u00d6\u00d7\u0003\u0018\f\u0000\u00d7"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d8\u00c2\u0001\u0000\u0000\u0000\u00d8"+
		"\u00c3\u0001\u0000\u0000\u0000\u00d8\u00c4\u0001\u0000\u0000\u0000\u00d8"+
		"\u00c5\u0001\u0000\u0000\u0000\u00d8\u00c6\u0001\u0000\u0000\u0000\u00d8"+
		"\u00cb\u0001\u0000\u0000\u0000\u00d8\u00d1\u0001\u0000\u0000\u0000\u00d9"+
		"\u0019\u0001\u0000\u0000\u0000\u00da\u00db\u0007\u0002\u0000\u0000\u00db"+
		"\u001b\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005$\u0000\u0000\u00dd\u00de"+
		"\u0003\u001a\r\u0000\u00de\u00df\u0003\u001c\u000e\u0000\u00df\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00dc\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u001d\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u00032\u0019\u0000\u00e4\u00e5\u0003\n"+
		"\u0005\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e3\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e8\u001f\u0001\u0000\u0000\u0000\u00e9\u00ea\u00032\u0019"+
		"\u0000\u00ea\u00eb\u0003\b\u0004\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee!\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u00032\u0019\u0000\u00f0\u00f1\u0003\u0006\u0003\u0000\u00f1\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4#\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0005\u000b\u0000\u0000\u00f6\u00f7\u0003"+
		"(\u0014\u0000\u00f7\u00f8\u0005\u0018\u0000\u0000\u00f8%\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0005\u000b\u0000\u0000\u00fa\u00fb\u0003(\u0014\u0000"+
		"\u00fb\u00fc\u0003h4\u0000\u00fc\u00fd\u0005\u0018\u0000\u0000\u00fd\'"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003*\u0015\u0000\u00ff\u0100\u0003"+
		"2\u0019\u0000\u0100\u0101\u0003(\u0014\u0000\u0101\u0104\u0001\u0000\u0000"+
		"\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u00fe\u0001\u0000\u0000"+
		"\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104)\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0005:\u0000\u0000\u0106\u010d\u00030\u0018\u0000\u0107\u010d"+
		"\u0003F#\u0000\u0108\u010d\u0003N\'\u0000\u0109\u010d\u0003R)\u0000\u010a"+
		"\u010d\u0003X,\u0000\u010b\u010d\u0003l6\u0000\u010c\u0105\u0001\u0000"+
		"\u0000\u0000\u010c\u0107\u0001\u0000\u0000\u0000\u010c\u0108\u0001\u0000"+
		"\u0000\u0000\u010c\u0109\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d+\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0003.\u0017\u0000\u010f\u0110\u00032\u0019\u0000\u0110"+
		"\u0111\u0003,\u0016\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0114"+
		"\u0001\u0000\u0000\u0000\u0113\u010e\u0001\u0000\u0000\u0000\u0113\u0112"+
		"\u0001\u0000\u0000\u0000\u0114-\u0001\u0000\u0000\u0000\u0115\u0116\u0005"+
		":\u0000\u0000\u0116\u011d\u00030\u0018\u0000\u0117\u011d\u0003F#\u0000"+
		"\u0118\u011d\u0003N\'\u0000\u0119\u011d\u0003R)\u0000\u011a\u011d\u0003"+
		"X,\u0000\u011b\u011d\u0003l6\u0000\u011c\u0115\u0001\u0000\u0000\u0000"+
		"\u011c\u0117\u0001\u0000\u0000\u0000\u011c\u0118\u0001\u0000\u0000\u0000"+
		"\u011c\u0119\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011c\u011b\u0001\u0000\u0000\u0000\u011d/\u0001\u0000\u0000\u0000\u011e"+
		"\u0124\u0003D\"\u0000\u011f\u0124\u0003`0\u0000\u0120\u0121\u0003>\u001f"+
		"\u0000\u0121\u0122\u0003D\"\u0000\u0122\u0124\u0001\u0000\u0000\u0000"+
		"\u0123\u011e\u0001\u0000\u0000\u0000\u0123\u011f\u0001\u0000\u0000\u0000"+
		"\u0123\u0120\u0001\u0000\u0000\u0000\u01241\u0001\u0000\u0000\u0000\u0125"+
		"\u0128\u0005/\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u01283\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0003\u0010\b\u0000\u012a\u012b\u00036"+
		"\u001b\u0000\u012b\u013d\u0001\u0000\u0000\u0000\u012c\u012d\u0005-\u0000"+
		"\u0000\u012d\u012e\u00034\u001a\u0000\u012e\u012f\u0005,\u0000\u0000\u012f"+
		"\u0130\u00036\u001b\u0000\u0130\u013d\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u0005\u0013\u0000\u0000\u0132\u0133\u00034\u001a\u0000\u0133\u0134\u0003"+
		"6\u001b\u0000\u0134\u013d\u0001\u0000\u0000\u0000\u0135\u0136\u0005:\u0000"+
		"\u0000\u0136\u0137\u0003\u000e\u0007\u0000\u0137\u0138\u00036\u001b\u0000"+
		"\u0138\u013d\u0001\u0000\u0000\u0000\u0139\u013a\u00038\u001c\u0000\u013a"+
		"\u013b\u00036\u001b\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u0129"+
		"\u0001\u0000\u0000\u0000\u013c\u012c\u0001\u0000\u0000\u0000\u013c\u0131"+
		"\u0001\u0000\u0000\u0000\u013c\u0135\u0001\u0000\u0000\u0000\u013c\u0139"+
		"\u0001\u0000\u0000\u0000\u013d5\u0001\u0000\u0000\u0000\u013e\u013f\u0003"+
		"B!\u0000\u013f\u0140\u00034\u001a\u0000\u0140\u0143\u0001\u0000\u0000"+
		"\u0000\u0141\u0143\u0001\u0000\u0000\u0000\u0142\u013e\u0001\u0000\u0000"+
		"\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u01437\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0005)\u0000\u0000\u0145\u0146\u0003:\u001d\u0000\u0146\u0147"+
		"\u0003<\u001e\u0000\u0147\u0148\u0005(\u0000\u0000\u01489\u0001\u0000"+
		"\u0000\u0000\u0149\u014d\u0003\f\u0006\u0000\u014a\u014d\u00038\u001c"+
		"\u0000\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u0149\u0001\u0000\u0000"+
		"\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000"+
		"\u0000\u014d;\u0001\u0000\u0000\u0000\u014e\u014f\u0005$\u0000\u0000\u014f"+
		"\u0150\u0003:\u001d\u0000\u0150\u0151\u0003<\u001e\u0000\u0151\u0154\u0001"+
		"\u0000\u0000\u0000\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u014e\u0001"+
		"\u0000\u0000\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154=\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0005&\u0000\u0000\u0156\u0157\u00034\u001a\u0000"+
		"\u0157\u0158\u0003d2\u0000\u0158\u0159\u0005%\u0000\u0000\u0159\u015a"+
		"\u0003@ \u0000\u015a\u015f\u0001\u0000\u0000\u0000\u015b\u015c\u0005>"+
		"\u0000\u0000\u015c\u015d\u0005:\u0000\u0000\u015d\u015f\u0003@ \u0000"+
		"\u015e\u0155\u0001\u0000\u0000\u0000\u015e\u015b\u0001\u0000\u0000\u0000"+
		"\u015f?\u0001\u0000\u0000\u0000\u0160\u0163\u0003>\u001f\u0000\u0161\u0163"+
		"\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0161"+
		"\u0001\u0000\u0000\u0000\u0163A\u0001\u0000\u0000\u0000\u0164\u0165\u0007"+
		"\u0003\u0000\u0000\u0165C\u0001\u0000\u0000\u0000\u0166\u0167\u00052\u0000"+
		"\u0000\u0167\u0168\u00034\u001a\u0000\u0168E\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0005\"\u0000\u0000\u016a\u016b\u0003H$\u0000\u016b\u016c\u0005"+
		")\u0000\u0000\u016c\u016d\u0003,\u0016\u0000\u016d\u016e\u0003J%\u0000"+
		"\u016e\u016f\u0005(\u0000\u0000\u016fG\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u0005-\u0000\u0000\u0171\u0172\u00034\u001a\u0000\u0172\u0173\u0005,"+
		"\u0000\u0000\u0173I\u0001\u0000\u0000\u0000\u0174\u0175\u0005\u0007\u0000"+
		"\u0000\u0175\u0178\u0003L&\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177"+
		"\u0174\u0001\u0000\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0178"+
		"K\u0001\u0000\u0000\u0000\u0179\u017a\u0005\"\u0000\u0000\u017a\u017b"+
		"\u0003H$\u0000\u017b\u017c\u0003,\u0016\u0000\u017c\u017d\u0003J%\u0000"+
		"\u017d\u0181\u0001\u0000\u0000\u0000\u017e\u0181\u0003,\u0016\u0000\u017f"+
		"\u0181\u0001\u0000\u0000\u0000\u0180\u0179\u0001\u0000\u0000\u0000\u0180"+
		"\u017e\u0001\u0000\u0000\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0181"+
		"M\u0001\u0000\u0000\u0000\u0182\u0183\u0005\f\u0000\u0000\u0183\u0184"+
		"\u0003P(\u0000\u0184\u0185\u0005)\u0000\u0000\u0185\u0186\u0003,\u0016"+
		"\u0000\u0186\u0187\u0005(\u0000\u0000\u0187O\u0001\u0000\u0000\u0000\u0188"+
		"\u0189\u0005-\u0000\u0000\u0189\u018a\u00034\u001a\u0000\u018a\u018b\u0005"+
		",\u0000\u0000\u018bQ\u0001\u0000\u0000\u0000\u018c\u018d\u0005\u0011\u0000"+
		"\u0000\u018d\u018e\u0005)\u0000\u0000\u018e\u018f\u0003T*\u0000\u018f"+
		"\u0190\u0003,\u0016\u0000\u0190\u0191\u0003V+\u0000\u0191\u0192\u0005"+
		"(\u0000\u0000\u0192S\u0001\u0000\u0000\u0000\u0193\u0194\u0005\u0010\u0000"+
		"\u0000\u0194\u0195\u0005-\u0000\u0000\u0195\u0196\u00034\u001a\u0000\u0196"+
		"\u0197\u0005,\u0000\u0000\u0197U\u0001\u0000\u0000\u0000\u0198\u0199\u0003"+
		"T*\u0000\u0199\u019a\u0003,\u0016\u0000\u019a\u019b\u0003V+\u0000\u019b"+
		"\u01a0\u0001\u0000\u0000\u0000\u019c\u019d\u0005\u0007\u0000\u0000\u019d"+
		"\u01a0\u0003,\u0016\u0000\u019e\u01a0\u0001\u0000\u0000\u0000\u019f\u0198"+
		"\u0001\u0000\u0000\u0000\u019f\u019c\u0001\u0000\u0000\u0000\u019f\u019e"+
		"\u0001\u0000\u0000\u0000\u01a0W\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005"+
		"\n\u0000\u0000\u01a2\u01a3\u0003Z-\u0000\u01a3\u01a4\u0005\u0003\u0000"+
		"\u0000\u01a4\u01a5\u0003\\.\u0000\u01a5\u01a6\u0003^/\u0000\u01a6\u01a7"+
		"\u0005)\u0000\u0000\u01a7\u01a8\u0003,\u0016\u0000\u01a8\u01a9\u0005("+
		"\u0000\u0000\u01a9Y\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005:\u0000\u0000"+
		"\u01ab\u01ac\u00052\u0000\u0000\u01ac\u01ad\u00034\u001a\u0000\u01ad["+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\u00034\u001a\u0000\u01af]\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0005\u0005\u0000\u0000\u01b1\u01b4\u00034\u001a"+
		"\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b4_\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b6\u0005-\u0000\u0000\u01b6\u01b7\u0003b1\u0000\u01b7\u01b8"+
		"\u0005,\u0000\u0000\u01b8a\u0001\u0000\u0000\u0000\u01b9\u01ba\u00034"+
		"\u001a\u0000\u01ba\u01bb\u0003d2\u0000\u01bb\u01be\u0001\u0000\u0000\u0000"+
		"\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01b9\u0001\u0000\u0000\u0000"+
		"\u01bd\u01bc\u0001\u0000\u0000\u0000\u01bec\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c0\u0005$\u0000\u0000\u01c0\u01c1\u00034\u001a\u0000\u01c1\u01c2\u0003"+
		"d2\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000\u01c3\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c4\u01bf\u0001\u0000\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c5e\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005\u0015\u0000\u0000"+
		"\u01c7\u01ca\u0003j5\u0000\u01c8\u01ca\u0001\u0000\u0000\u0000\u01c9\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01cag\u0001"+
		"\u0000\u0000\u0000\u01cb\u01cc\u0005\u0015\u0000\u0000\u01cc\u01cf\u0003"+
		"j5\u0000\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce\u01cb\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000\u01cfi\u0001\u0000\u0000\u0000"+
		"\u01d0\u01d1\u0005-\u0000\u0000\u01d1\u01d2\u00034\u001a\u0000\u01d2\u01d3"+
		"\u0005,\u0000\u0000\u01d3\u01d7\u0001\u0000\u0000\u0000\u01d4\u01d7\u0003"+
		"4\u001a\u0000\u01d5\u01d7\u0003\u0018\f\u0000\u01d6\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d7k\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005\u000e\u0000"+
		"\u0000\u01d9\u01da\u0003,\u0016\u0000\u01da\u01db\u0005\u0003\u0000\u0000"+
		"\u01db\u01dc\u0003n7\u0000\u01dcm\u0001\u0000\u0000\u0000\u01dd\u01de"+
		"\u0005-\u0000\u0000\u01de\u01df\u00034\u001a\u0000\u01df\u01e0\u0005,"+
		"\u0000\u0000\u01e0o\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005\r\u0000"+
		"\u0000\u01e2\u01e3\u0005:\u0000\u0000\u01e3\u01e4\u0005-\u0000\u0000\u01e4"+
		"\u01e5\u0003r9\u0000\u01e5\u01e6\u0005,\u0000\u0000\u01e6\u01e7\u0003"+
		"f3\u0000\u01e7\u01e8\u0003\u0004\u0002\u0000\u01e8\u01e9\u0003&\u0013"+
		"\u0000\u01e9\u01ea\u0003p8\u0000\u01ea\u01ed\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ec\u01e1\u0001\u0000\u0000\u0000\u01ec"+
		"\u01eb\u0001\u0000\u0000\u0000\u01edq\u0001\u0000\u0000\u0000\u01ee\u01ef"+
		"\u0003x<\u0000\u01ef\u01f0\u0005:\u0000\u0000\u01f0\u01f1\u0003\u0016"+
		"\u000b\u0000\u01f1\u01f2\u0005\'\u0000\u0000\u01f2\u01f3\u0003\u0018\f"+
		"\u0000\u01f3\u01f4\u0003t:\u0000\u01f4\u01f7\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f7\u0001\u0000\u0000\u0000\u01f6\u01ee\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f7s\u0001\u0000\u0000\u0000\u01f8\u01f9"+
		"\u0003v;\u0000\u01f9u\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005/\u0000"+
		"\u0000\u01fb\u01fc\u0003x<\u0000\u01fc\u01fd\u0005:\u0000\u0000\u01fd"+
		"\u01fe\u0003\u0016\u000b\u0000\u01fe\u01ff\u0005\'\u0000\u0000\u01ff\u0200"+
		"\u0003\u0018\f\u0000\u0200\u0201\u0003t:\u0000\u0201\u0204\u0001\u0000"+
		"\u0000\u0000\u0202\u0204\u0001\u0000\u0000\u0000\u0203\u01fa\u0001\u0000"+
		"\u0000\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0204w\u0001\u0000\u0000"+
		"\u0000\u0205\u0208\u0005\u001b\u0000\u0000\u0206\u0208\u0001\u0000\u0000"+
		"\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0207\u0206\u0001\u0000\u0000"+
		"\u0000\u0208y\u0001\u0000\u0000\u0000$\u0082\u0091\u00a6\u00ab\u00b6\u00c0"+
		"\u00d8\u00e1\u00e7\u00ed\u00f3\u0103\u010c\u0113\u011c\u0123\u0127\u013c"+
		"\u0142\u014c\u0153\u015e\u0162\u0177\u0180\u019f\u01b3\u01bd\u01c4\u01c9"+
		"\u01ce\u01d6\u01ec\u01f6\u0203\u0207";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}