import grammar.SLBaseListener;
import grammar.SLParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

import static java.lang.String.valueOf;

public class SL2Python extends SLBaseListener {

    public boolean inFor = false;
    public boolean inLlamadaSubrutina = false;
    public boolean inAsignacion = false;
    public boolean inMasParametros = false;
    public boolean inExpresion = false;
    public boolean inLeer = false;
    public boolean inParametros = false;

    public boolean inConstDeclaracion = false;

    public boolean inDeclaracion = false;

    public boolean inSubrutina_ = false;

    public boolean funcionPredefinida = false;
    public boolean error = false;

    public int numTabs = 0;

    public String sameTerminals[] = {"(", ")", "[", "]"};

    public int count = 0;
    public int matDim = 0;
    public ArrayList<String> matArgDim = new ArrayList<>();
    public boolean isVector = false;
    public boolean isMatriz = false;
    public boolean isNotOpenDim = false;
    public boolean errorSemantico = false;

    @Override
    public void enterCodigo(SLParser.CodigoContext ctx) {
        System.out.println("import math");
        System.out.println("import psutil");
        System.out.println("import random");
        System.out.println("import datetime");
        System.out.println("import sys");
        System.out.println("import numpy as np");
    }

    @Override
    public void enterNombre(SLParser.NombreContext ctx){
        if(!errorSemantico){
            if(ctx.PROGRAMA() != null){
                System.out.print("#programa " + ctx.ID().getText());
            }
        }
    }

    @Override
    public void enterCondicional(SLParser.CondicionalContext ctx){
        System.out.print("if(");
    }

    @Override
    public void exitCondicional(SLParser.CondicionalContext ctx){
        numTabs--;

    }

    @Override
    public void exitCondicional_condicion(SLParser.Condicional_condicionContext ctx) {
        System.out.print("):\n");
        numTabs++;
    }

    @Override
    public void enterCiclo_mientras(SLParser.Ciclo_mientrasContext ctx){
        System.out.print("while(");
    }

    @Override
    public void exitCiclo_mientras(SLParser.Ciclo_mientrasContext ctx) {
        numTabs--;
    }

    @Override
    public void exitCiclo_mientras_condicion(SLParser.Ciclo_mientras_condicionContext ctx){
        System.out.print("):\n");
        numTabs++;
    }

    @Override
    public void enterSentencia_eval_caso(SLParser.Sentencia_eval_casoContext ctx) {
        System.out.print("if(");
    }

    @Override
    public void exitSentencia_eval_caso(SLParser.Sentencia_eval_casoContext ctx) {
        System.out.print("):\n");
        numTabs++;
    }

    @Override
    public void enterMas_casos_eval(SLParser.Mas_casos_evalContext ctx) {
        numTabs--;
        if(ctx.sentencia_eval_caso() != null) {
            System.out.print("el");
        } else if (ctx.SINO() != null) {
            System.out.println("else:");
            numTabs++;
        }

    }

    @Override
    public void enterCiclo_desde(SLParser.Ciclo_desdeContext ctx){
        System.out.print("for ");
        inFor = true;
    }

    @Override
    public void exitCiclo_desde(SLParser.Ciclo_desdeContext ctx){
        numTabs--;
    }

    @Override
    public void enterCiclo_desde_inicio(SLParser.Ciclo_desde_inicioContext ctx) {
        System.out.print(ctx.ID());
        System.out.print(" in range(");
    }

    @Override
    public void exitCiclo_desde_inicio(SLParser.Ciclo_desde_inicioContext ctx) {
        System.out.print(",");
    }

    @Override
    public void enterPaso_opt(SLParser.Paso_optContext ctx) {
        if(ctx.PASO() != null){
            System.out.print(",");
        }
    }

    @Override
    public void exitPaso_opt(SLParser.Paso_optContext ctx) {
        System.out.print("):\n");
        numTabs++;
    }

    @Override
    public void enterCiclo_repetir(SLParser.Ciclo_repetirContext ctx) {
        System.out.print("while True:\n");
        numTabs++;
    }

    @Override
    public void exitCiclo_repetir(SLParser.Ciclo_repetirContext ctx) {
        numTabs--;
    }

    @Override
    public void enterCiclo_repetir_condicion(SLParser.Ciclo_repetir_condicionContext ctx) {
        System.out.print("if(");
    }

    @Override
    public void exitCiclo_repetir_condicion(SLParser.Ciclo_repetir_condicionContext ctx) {
        System.out.print("): break\n");

    }

    @Override
    public void enterExpresion(SLParser.ExpresionContext ctx){
        inExpresion = true;
        String [] funciones_predefinidas = {"abs", "arctan", "ascii", "cos", "dec", "eof", "exp", "get_ifs", "inc", "int", "log", "lower", "mem", "ord", "paramval",
                "pcount", "pos", "random", "sec", "set_stdin", "set_stdout", "sin", "sqrt", "str", "strdup", "strlen", "substr", "tan", "upper", "val"};
        List<String> funciones_predefinidas_list = new ArrayList<>(Arrays.asList(funciones_predefinidas));

        if(ctx.ID()!=null && funciones_predefinidas_list.contains(ctx.ID().getText())){
            funcionPredefinida = true;
            traduceFuncionPredefinidaExpresion(ctx);
        }
    }

    @Override
    public void exitExpresion(SLParser.ExpresionContext ctx){
        inExpresion = false;
    }

    @Override
    public void enterSentencia_interna(SLParser.Sentencia_internaContext ctx){
        String temp = String.join("", Collections.nCopies(numTabs, "\t"));
        System.out.print(temp);
//        if(ctx.ID() != null && !inLlamadaSubrutina){
//            System.out.print(ctx.ID().getText());
//        }
    }



    @Override
    public void exitSentencia_interna(SLParser.Sentencia_internaContext ctx){
        System.out.print("\n");
    }
    @Override
    public void exitSentencia(SLParser.SentenciaContext ctx){
        if (!error){

        }
        System.out.print("\n");
    }

    @Override
    public void enterAsignacion(SLParser.AsignacionContext ctx) {
        if (!error){

        }
        inAsignacion = true;
        System.out.print(ctx.parent.parent.getChild(0).getText());
    }

    @Override
    public void enterId_arreglo_registro(SLParser.Id_arreglo_registroContext ctx) {
        //System.out.print(ctx.parent.parent.getChild(0).getText());
    }
    

    @Override
    public void enterSentencia(SLParser.SentenciaContext ctx){
        if (!error){

        }
        String [] funciones_predefinidas = {"abs", "arctan", "ascii", "cos", "dec", "eof", "exp", "get_ifs", "inc", "int", "log", "lower", "mem", "ord", "paramval",
                "pcount", "pos", "random", "sec", "set_stdin", "set_stdout", "sin", "sqrt", "str", "strdup", "strlen", "substr", "tan", "upper", "val"};
        List<String> funciones_predefinidas_list = new ArrayList<>(Arrays.asList(funciones_predefinidas));

        if (ctx.ID() != null && ctx.id_casos().llamada_subrutina() != null && !funciones_predefinidas_list.contains(ctx.ID().getText())){
            if (ctx.ID().getText().compareTo("imprimir") != 0 && ctx.ID().getText().compareTo("leer") != 0){
                System.out.print(ctx.ID().getText());
            }
        }
        if(ctx.ID()!=null && funciones_predefinidas_list.contains(ctx.ID().getText())){
            funcionPredefinida = true;
            traduceFuncionPredefinidaSentencia(ctx);
        }
        String temp = String.join("", Collections.nCopies(numTabs, "\t"));
        System.out.print(temp);
    }
    @Override
    public void exitAsignacion(SLParser.AsignacionContext ctx) {
        inAsignacion = false;

    }

    @Override
    public void enterMas_parametros(SLParser.Mas_parametrosContext ctx) {
        inMasParametros = true;
    }
    @Override
    public void exitMas_parametros(SLParser.Mas_parametrosContext ctx) {
        inMasParametros = false;
    }

    @Override
    public void exitLlamada_subrutina(SLParser.Llamada_subrutinaContext ctx) {
        if(inLeer){
            inLeer = false;
        }
    }

    @Override
    public void enterParametros(SLParser.ParametrosContext ctx) {
        inParametros = true;
    }
    @Override
    public void exitParametros(SLParser.ParametrosContext ctx) {
        inParametros = true;
    }

    @Override
    public void enterDeclaracion(SLParser.DeclaracionContext ctx){
        if(!errorSemantico){
            if(ctx.VAR() != null){
                System.out.print("\n\n#var\n\n");
            }else if(ctx.CONST() != null){
                System.out.print("\n\n#const\n\n");
            }else if(ctx.TIPOS() != null){
                System.out.print("\n\n#tipos\n\n");
            }
        }
    }

    @Override
    public void enterDeclaracion_contenido_const(SLParser.Declaracion_contenido_constContext ctx){
        /*if(!errorSemantico){
            if(ctx.ID() != null){
                System.out.print(ctx.ID().getText());
            }if(ctx.TK_ASIGNACION() != null){
                System.out.print(" = ");
            }
        }*/
        inConstDeclaracion = true;
    }

    @Override
    public void enterMas_declaraciones_const(SLParser.Mas_declaraciones_constContext ctx) {
        inConstDeclaracion = false;
    }

    @Override
    public void enterDeclaracion_contenido_tipos(SLParser.Declaracion_contenido_tiposContext ctx){
        if(!errorSemantico){
            if(ctx.ID() != null){
                System.out.print(ctx.ID().getText());
            }
        }
        inDeclaracion = true;
    }

    @Override
    public void exitDeclaracion_contenido_tipos(SLParser.Declaracion_contenido_tiposContext ctx) {
        inDeclaracion = false;
    }

    @Override
    public void enterDeclaracion_contenido_var(SLParser.Declaracion_contenido_varContext ctx) {
        if(!errorSemantico){
            if(ctx.ID() != null){
                System.out.print(ctx.ID().getText());
            }
        }
        inDeclaracion = true;
    }

    @Override
    public void exitDeclaracion_contenido_var(SLParser.Declaracion_contenido_varContext ctx) {
        inDeclaracion = false;
    }

    @Override
    public void enterSubrutina_(SLParser.Subrutina_Context ctx) {
        if (!error){
            if (ctx.ID() != null) {
                System.out.print("def " + ctx.ID().getText());
            }
        }
    }

    @Override
    public void enterMain(SLParser.MainContext ctx){
        System.out.println("\n");
    }

    @Override
    public void enterMain_subrutina(SLParser.Main_subrutinaContext ctx) {
        if (!error){
            System.out.print(":\n");
            numTabs++;
        }
    }

    @Override
    public void exitMain_subrutina(SLParser.Main_subrutinaContext ctx) {
        if (!error){
            System.out.println();
            numTabs--;
        }
    }

    @Override
    public void enterParam_subrutina(SLParser.Param_subrutinaContext ctx) {
        if (!error){
            if (ctx.ID() != null){
                System.out.print(ctx.ID().getText());
            }
        }
    }

    @Override
    public void enterOtros_id(SLParser.Otros_idContext ctx) {
        /*if (!error){
            if (ctx.ID() != null){
                System.out.print(", " + ctx.ID().getText());
            }
        }*/
        if(!errorSemantico){
            if(ctx.TK_COMA() != null){
                System.out.print(",");
            }
            if(ctx.ID() != null){
                System.out.print(ctx.ID().getText());
                count++;
            }
        }
    }

    @Override
    public void enterTipo_dato(SLParser.Tipo_datoContext ctx){
        if(!errorSemantico){
            if(ctx.VECTOR() != null){
                System.out.print(" = ");
                isVector = true;
            }
            if(ctx.MATRIZ() != null){
                System.out.print(" = ");
                isMatriz = true;
            }
            if(!isVector && !isMatriz){
                System.out.print(" = ");
                if(ctx.ID() != null){
                    if(count > 0){
                        System.out.print(ctx.ID().getText());
                        while(count > 0){
                            System.out.print(", " + ctx.ID().getText());
                            count--;
                        }
                    }else{
                        System.out.print(ctx.ID().getText());
                    }
                }else if(ctx.CADENA() != null){
                    if(count > 0){
                        System.out.print("\'\'");
                        while(count > 0){
                            System.out.print(", \'\'");
                            count--;
                        }
                    }else{
                        System.out.print("\'\'");
                    }
                }else if(ctx.LOGICO() != null){
                    if(count > 0){
                        System.out.print("False");
                        while(count > 0){
                            System.out.print(", False");
                            count--;
                        }
                    }else{
                        System.out.print("False");
                    }
                }else if(ctx.NUMERICO() != null){
                    if(count > 0){
                        System.out.print("0");
                        while(count > 0){
                            System.out.print(", 0");
                            count--;
                        }
                    }else{
                        System.out.print("0");
                    }
                }
            }
        }
    }
    @Override
    public void exitTipo_dato(SLParser.Tipo_datoContext ctx){
        if(!errorSemantico){
            if(isVector){
                isVector = false;
            }if(isMatriz){
                Iterator<String> it = matArgDim.iterator();
                if(!isNotOpenDim){
                    while(it.hasNext()){
                        it.next();
                        System.out.print("[");
                    }
                    while(matDim > 0){
                        System.out.print("]");
                        matDim--;
                    }
                    matArgDim = new ArrayList<>();
                }else{
                    String matClose = "np.empty((";
                    while(it.hasNext()){
                        String dim = it.next();
                        boolean firstCloseDim = false;
                        if(dim.equals("*")){
                            System.out.print("[");
                        }else{
                            matClose = matClose + dim;
                            matDim--;
                            firstCloseDim = true;
                            if(firstCloseDim && it.hasNext()){
                                matClose = matClose + ",";
                            }else{
                                matClose = matClose + ")";
                            }
                        }
                    }
                    matClose = matClose + ",object)";
                    isNotOpenDim = false;
                    matArgDim = new ArrayList<>();
                    System.out.print(matClose);
                    while(matDim > 0){
                        System.out.print("]");
                        matDim--;
                    }
                }
                isMatriz = false;
            }
        }
    }

    @Override
    public void enterTamano_arreglo(SLParser.Tamano_arregloContext ctx){
        if(!errorSemantico){
            if(ctx.TK_MULTIPLICACION() != null){
                if(isVector){
                    System.out.print("[]");
                }else if(isMatriz){
                    if(!isNotOpenDim){
                        matArgDim.add(ctx.TK_MULTIPLICACION().getText());
                        matDim++;
                    }else{
                        System.out.println("ERROR SEMANTICO: NO SE ADMITE PARAMETROS ABIERTOS (*) DESPUES DE UN PARAMETRO FIJO");
                        errorSemantico = true;
                    }
                }
            }else if(ctx.TK_NUMERO() != null){
                if(isVector){
                    System.out.print("np.empty(("+ Integer.parseInt(ctx.TK_NUMERO().getText()) + "),object)");
                }else if(isMatriz){
                    isNotOpenDim = true;
                    matDim++;
                    matArgDim.add(ctx.TK_NUMERO().getText());
                }
            }
        }
    }
    @Override
    public void enterPunto_y_coma_opcional_subrutina(SLParser.Punto_y_coma_opcional_subrutinaContext ctx) {
        if (!error){
            if (ctx.ID() != null){
                System.out.print(", " + ctx.ID().getText());
            }
        }
    }

    @Override
    public void enterPunto_y_coma_opcional(SLParser.Punto_y_coma_opcionalContext ctx){
        if(ctx.TK_PUNTO_Y_COMA() != null){
            System.out.print("; ");
        }else{
            System.out.println("");
        }
    }

    @Override
    public void enterSigno(SLParser.SignoContext ctx){
        if(ctx.TK_RESTA() != null){
            System.out.print("-");
        }
        if(ctx.TK_SUMA() != null){
            System.out.print("+");
        }
    }

    @Override
    public void enterVariable_aux(SLParser.Variable_auxContext ctx){
        if(ctx.ID() != null){
            System.out.print(ctx.ID().getText());
        }
        if(ctx.TK_NUMERO() != null){
            System.out.print(ctx.TK_NUMERO().getText());
        }
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        if (!error){
            //System.out.println(node.getText());
            if (inDeclaracion){
                // SKIP :)
            }else if (node.getText().equals("leer")) {
                inLeer = true;
            } else if (inLeer) {
                if(inParametros && inExpresion){
                    System.out.print(node.getParent().getText() + " = input()\n");
                    inParametros = false;
                } else if (inMasParametros) {
                    inParametros = true;
                }
            } else if (node.getText().equals("imprimir")) {
                System.out.print("print");
            } else if(Arrays.asList(sameTerminals).contains(node.getText())){
                if(funcionPredefinida){
                    if(node.getText().equals(")") ){
                        funcionPredefinida = false;
                    }
                }else{
                   System.out.print(node.getText());
                }
            } else if(node.getText().equals("^")) {
                System.out.print("**");
            } else if (node.getText().equals("<>")) {
                System.out.print("!=");
            } else if (inMasParametros && node.getText().equals(",")) {
                if(funcionPredefinida){
                    //print nothing
                }else{
                    System.out.print(",");
                }
            } else if (inExpresion && node.getText().equals("{")) {
                System.out.print("[");
            } else if (inExpresion && node.getText().equals("}")) {
                System.out.print("]");
            } else if(node.getText().equals("and") || node.getText().equals("or") || node.getText().equals("not")){
                System.out.print(node.getText() + " ");
            } else if ((inExpresion || inAsignacion || inConstDeclaracion)) {
                if (!funcionPredefinida){
                    System.out.print(node.getText());
                }
            } else {
                //System.out.println("\n###\nNOTHING "+node.getText()+"\n###\n");
            }


            //else if(inAsignacion){
            //   System.out.print(node.getText());
            //}

            // System.out.println(" ");
            // System.out.print(node);
            // System.out.println(node.getSymbol());
        }
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        error = true;
    }
    public void traduceFuncionPredefinidaExpresion(SLParser.ExpresionContext ctx){
        String translatedFunction = "";
        String funcion = ctx.ID().getText();
        String parentesisYParametros = ctx.valor_aux().getText();
        switch (funcion){
            case "abs":
                translatedFunction = "abs"+ parentesisYParametros;
                break;
            case "arctan":
                translatedFunction = "math.atan"+ parentesisYParametros;
                break;
            case "ascii":
                translatedFunction = "ascii"+ parentesisYParametros;
                break;
            case "cos":
                translatedFunction = "math.cos"+ parentesisYParametros;
                break;
            case "dec":
                String decN = ctx.valor_aux().llamada_subrutina().parametros().expresion().getText();
                String decA = "1";
                if(ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().expresion() != null){
                    decA = ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().expresion().getText();
                }
                translatedFunction = "("+decN + "-" + decA+")";
                break;
            case "eof": //https://www.cnc.una.py/sl/SL-stdf.html#eof
                //PENDIENTE
                break;
            case "exp":
                translatedFunction = "math.exp"+ parentesisYParametros;
                break;
            case "get_ifs": //https://www.cnc.una.py/sl/SL-stdf.html#get_ifs
                //PENDIENTE
                break;
            case "inc": //https://www.cnc.una.py/sl/SL-stdf.html#inc
                String incN = ctx.valor_aux().llamada_subrutina().parametros().expresion().getText();
                String incA = "1";
                if(ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().expresion() != null){
                    incA = ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().expresion().getText();
                }
                translatedFunction = "("+incN + "+" + incA+")";
                break;
            case "int":
                translatedFunction = "int"+ parentesisYParametros;
                break;
            case "log":
                translatedFunction = "math.log"+ parentesisYParametros;
                break;
            case "lower": // https://www.cnc.una.py/sl/SL-stdf.html#lower
                translatedFunction = ctx.valor_aux().llamada_subrutina().parametros().getText() + ".lower()";
                break;
            case "mem":
                translatedFunction = "psutil.virtual_memory().total";
                break;
            case "ord":
                translatedFunction = "ord"+ parentesisYParametros;
                break;
            case "paramval": //https://www.cnc.una.py/sl/SL-stdf.html#paramval
                //PENDIENTE
                break;
            case "pcount": //https://www.cnc.una.py/sl/SL-stdf.html#pcount
                //PENDIENTE
                break;
            case "pos": //https://www.cnc.una.py/sl/SL-stdf.html#pcount
                if(ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().mas_parametros().expresion() != null){
                    translatedFunction = ctx.valor_aux().llamada_subrutina().parametros().expresion().variable().getText() + ".pos("+ ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().expresion().variable().getText() +", " + ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().mas_parametros().expresion().variable().getText() + ")";
                }else{
                    translatedFunction = ctx.valor_aux().llamada_subrutina().parametros().expresion().variable().getText() + ".pos("+ ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().expresion().variable().getText() + ")";
                }
                break;
            case "random":
                if(ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().expresion() != null){
                    translatedFunction= "random.seed(" + ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().expresion().variable().getText() + ")\nrandom.randrange(0,"+ ctx.valor_aux().llamada_subrutina().parametros().expresion().variable().getText() +" )";
                }else{
                    translatedFunction = "random.randrange(0,"+ ctx.valor_aux().llamada_subrutina().parametros().expresion().variable().getText() +")";
                }
                break;
            case "sec":
                translatedFunction = "(datetime.datetime.utcnow() - datetime.datetime.now().replace(hour=0, minute=0, second=0, microsecond=0)).seconds";
                break;
            case "set_stdin":
                translatedFunction = "try:\n" +
                        "\tfile_opened = open("+ ctx.valor_aux().llamada_subrutina().parametros().expresion().variable().getText() +",\"r\").readlines()\n" +
                        "except FileNotFoundError:\n" +
                        "\tprint(False)";
                break;
            case "set_stdout":
                String ruta =ctx.valor_aux().llamada_subrutina().parametros().expresion().variable().getText();
                String modo = "w";
                if(ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().expresion() != null){
                    switch(ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().expresion().variable().getText()){
                        case "\"at\"":
                            modo = "\"a\"";
                            break;
                        default:
                            modo = "\"w\"";
                            break;
                    } ;

                }
                translatedFunction =
                        "try:\n" +
                                "\topen("+ ruta +",\"r\")\n" +
                                "\tsys.stdout = open("+ ruta +","+ modo +")\n" +
                                "except FileNotFoundError:\n" +
                                "\tprint(False)\n" +
                                "\tsys.stdout = sys.__stdout__";
                break;
            case "sin":
                translatedFunction = "math.sin"+ parentesisYParametros;
                break;
            case "sqrt":
                translatedFunction = "math.sqrt"+ parentesisYParametros;
                break;
            case "str":
                String n = ctx.valor_aux().llamada_subrutina().parametros().expresion().getText();
                String a = "0";
                String cant_dec = "2";
                String r = " ";
                if(ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().expresion() != null){
                    a = ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().expresion().variable().getText();
                    if(ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().mas_parametros().expresion() != null){
                        cant_dec = ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().mas_parametros().expresion().variable().getText();
                        if(ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().mas_parametros().mas_parametros().expresion() != null){
                            r = ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().mas_parametros().mas_parametros().expresion().variable().getText();
                            r = r.replace("\"","");
                            r = r.replace("'","");
                        }
                    }
                }
                String relleno =  r.repeat(Integer.parseInt(a));
                String numeroBase =  "str(round("+n+","+cant_dec+"))";
                if (cant_dec.equals("0")){
                    numeroBase = "str(round("+n+"))";
                }
                translatedFunction = "(\""+relleno +"\""+ "+" +numeroBase+")[-"+a+":]";
                break;
            case "strdup":
                String cadena = ctx.valor_aux().llamada_subrutina().parametros().expresion().getText();
                String numeroVeces = ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().expresion().getText();
                translatedFunction = cadena + "*" + numeroVeces;
                break;
            case "strlen":
                translatedFunction = "len"+ parentesisYParametros;
                break;
            case "substr":
                String cadenaSubstr = ctx.valor_aux().llamada_subrutina().parametros().expresion().getText();
                String inicio = ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().expresion().getText();
                String cant = "";
                if (ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().mas_parametros().expresion() != null){
                    cant = ctx.valor_aux().llamada_subrutina().parametros().mas_parametros().mas_parametros().expresion().getText();
                    translatedFunction = cadenaSubstr+"["+inicio+"-1: "+inicio+"-1+" + cant +"]";
                }else{
                    translatedFunction = cadenaSubstr+"["+inicio+"-1:]";
                }
                break;
            case "tan":
                translatedFunction = "math.tan"+ parentesisYParametros;
                break;
            case "upper":
                translatedFunction = ctx.valor_aux().llamada_subrutina().parametros().getText() + ".upper()";
                break;
            case "val":
                translatedFunction ="try:\n" +
                        "\tfloat(" +ctx.valor_aux().llamada_subrutina().parametros().expresion().getText()+")\n" +
                        "except ValueError:\n" +
                        "\t0";
                break;
        }
        System.out.print(translatedFunction);
    }

    public void traduceFuncionPredefinidaSentencia(SLParser.SentenciaContext ctx){
        String translatedFunction = "";
        String funcion = ctx.ID().getText();
        String parentesisYParametros = ctx.id_casos().getText();
        switch (funcion){
            case "abs":
                translatedFunction = "abs"+ parentesisYParametros;
                break;
            case "arctan":
                translatedFunction = "math.atan"+ parentesisYParametros;
                break;
            case "ascii":
                translatedFunction = "ascii"+ parentesisYParametros;
                break;
            case "cos":
                translatedFunction = "math.cos"+ parentesisYParametros;
                break;
            case "dec":
                String decN = ctx.id_casos().llamada_subrutina().parametros().expresion().getText();
                String decA = "1";
                if(ctx.id_casos().llamada_subrutina().parametros().mas_parametros().expresion() != null){
                    decA = ctx.id_casos().llamada_subrutina().parametros().mas_parametros().expresion().getText();
                }
                translatedFunction = "("+decN + "-" + decA+")";
                break;
            case "eof": //https://www.cnc.una.py/sl/SL-stdf.html#eof
                //PENDIENTE
                break;
            case "exp":
                translatedFunction = "math.exp"+ parentesisYParametros;
                break;
            case "get_ifs": //https://www.cnc.una.py/sl/SL-stdf.html#get_ifs
                //PENDIENTE
                break;
            case "inc": //https://www.cnc.una.py/sl/SL-stdf.html#inc
                String incN = ctx.id_casos().llamada_subrutina().parametros().expresion().getText();
                String incA = "1";
                if(ctx.id_casos().llamada_subrutina().parametros().mas_parametros().expresion() != null){
                    incA = ctx.id_casos().llamada_subrutina().parametros().mas_parametros().expresion().getText();
                }
                translatedFunction = "("+incN + "+" + incA+")";
                break;
            case "int":
                translatedFunction = "int"+ parentesisYParametros;
                break;
            case "log":
                translatedFunction = "math.log"+ parentesisYParametros;
                break;
            case "lower": // https://www.cnc.una.py/sl/SL-stdf.html#lower
                translatedFunction = ctx.id_casos().llamada_subrutina().parametros().getText() + ".lower()";
                break;
            case "mem":
                translatedFunction = "psutil.virtual_memory().total";
                break;
            case "ord":
                translatedFunction = "ord"+ parentesisYParametros;
                break;
            case "paramval": //https://www.cnc.una.py/sl/SL-stdf.html#paramval
                //PENDIENTE
                break;
            case "pcount": //https://www.cnc.una.py/sl/SL-stdf.html#pcount
                //PENDIENTE
                break;
            case "pos": //https://www.cnc.una.py/sl/SL-stdf.html#pcount
                if(ctx.id_casos().llamada_subrutina().parametros().mas_parametros().mas_parametros().expresion() != null){
                    translatedFunction = ctx.id_casos().llamada_subrutina().parametros().expresion().variable().getText() + ".pos("+ ctx.id_casos().llamada_subrutina().parametros().mas_parametros().expresion().variable().getText() +", " + ctx.id_casos().llamada_subrutina().parametros().mas_parametros().mas_parametros().expresion().variable().getText() + ")";
                }else{
                    translatedFunction = ctx.id_casos().llamada_subrutina().parametros().expresion().variable().getText() + ".pos("+ ctx.id_casos().llamada_subrutina().parametros().mas_parametros().expresion().variable().getText() + ")";
                }
                break;
            case "random":
                if(ctx.id_casos().llamada_subrutina().parametros().mas_parametros().expresion() != null){
                    translatedFunction= "random.seed(" + ctx.id_casos().llamada_subrutina().parametros().mas_parametros().expresion().variable().getText() + ")\nrandom.randrange(0,"+ ctx.id_casos().llamada_subrutina().parametros().expresion().variable().getText() +" )";
                }else{
                    translatedFunction = "random.randrange(0,"+ ctx.id_casos().llamada_subrutina().parametros().expresion().variable().getText() +")";
                }
                break;
            case "sec":
                translatedFunction = "(datetime.datetime.utcnow() - datetime.datetime.now().replace(hour=0, minute=0, second=0, microsecond=0)).seconds";
                break;
            case "set_stdin":
                translatedFunction = "try:\n" +
                        "\tfile_opened = open("+ ctx.id_casos().llamada_subrutina().parametros().expresion().variable().getText() +",\"r\").readlines()\n" +
                        "except FileNotFoundError:\n" +
                        "\tprint(False)";
                break;
            case "set_stdout":
                String ruta =ctx.id_casos().llamada_subrutina().parametros().expresion().variable().getText();
                String modo = "w";
                if(ctx.id_casos().llamada_subrutina().parametros().mas_parametros().expresion() != null){
                    switch(ctx.id_casos().llamada_subrutina().parametros().mas_parametros().expresion().variable().getText()){
                        case "\"at\"":
                            modo = "\"a\"";
                            break;
                        default:
                            modo = "\"w\"";
                            break;
                    } ;

                }
                translatedFunction =
                        "try:\n" +
                                "\topen("+ ruta +",\"r\")\n" +
                                "\tsys.stdout = open("+ ruta +","+ modo +")\n" +
                                "except FileNotFoundError:\n" +
                                "\tprint(False)\n" +
                                "\tsys.stdout = sys.__stdout__";
                break;
            case "sin":
                translatedFunction = "math.sin"+ parentesisYParametros;
                break;
            case "sqrt":
                translatedFunction = "math.sqrt"+ parentesisYParametros;
                break;
            case "str":
                String n = ctx.id_casos().llamada_subrutina().parametros().expresion().getText();
                String a = "0";
                String cant_dec = "2";
                String r = " ";
                if(ctx.id_casos().llamada_subrutina().parametros().mas_parametros().expresion() != null){
                    a = ctx.id_casos().llamada_subrutina().parametros().mas_parametros().expresion().variable().getText();
                    if(ctx.id_casos().llamada_subrutina().parametros().mas_parametros().mas_parametros().expresion() != null){
                        cant_dec = ctx.id_casos().llamada_subrutina().parametros().mas_parametros().mas_parametros().expresion().variable().getText();
                        if(ctx.id_casos().llamada_subrutina().parametros().mas_parametros().mas_parametros().mas_parametros().expresion() != null){
                            r = ctx.id_casos().llamada_subrutina().parametros().mas_parametros().mas_parametros().mas_parametros().expresion().variable().getText();
                            r = r.replace("\"","");
                            r = r.replace("'","");
                        }
                    }
                }
                String relleno =  r.repeat(Integer.parseInt(a));
                String numeroBase =  "str(round("+n+","+cant_dec+"))";
                if (cant_dec.equals("0")){
                    numeroBase = "str(round("+n+"))";
                }
                translatedFunction = "(\""+relleno +"\""+ "+" +numeroBase+")[-"+a+":]";
                break;
            case "strdup":
                String cadena = ctx.id_casos().llamada_subrutina().parametros().expresion().getText();
                String numeroVeces = ctx.id_casos().llamada_subrutina().parametros().mas_parametros().expresion().getText();
                translatedFunction = cadena + "*" + numeroVeces;
                break;
            case "strlen":
                translatedFunction = "len"+ parentesisYParametros;
                break;
            case "substr":
                String cadenaSubstr = ctx.id_casos().llamada_subrutina().parametros().expresion().getText();
                String inicio = ctx.id_casos().llamada_subrutina().parametros().mas_parametros().expresion().getText();
                String cant = "";
                if (ctx.id_casos().llamada_subrutina().parametros().mas_parametros().mas_parametros().expresion() != null){
                    cant = ctx.id_casos().llamada_subrutina().parametros().mas_parametros().mas_parametros().expresion().getText();
                    translatedFunction = cadenaSubstr+"["+inicio+"-1: "+inicio+"-1+" + cant +"]";
                }else{
                    translatedFunction = cadenaSubstr+"["+inicio+"-1:]";
                }
                break;
            case "tan":
                translatedFunction = "math.tan"+ parentesisYParametros;
                break;
            case "upper":
                translatedFunction = ctx.id_casos().llamada_subrutina().parametros().getText() + ".upper()";
                break;
            case "val":
                translatedFunction ="try:\n" +
                        "\tfloat(" +ctx.id_casos().llamada_subrutina().parametros().expresion().getText()+")\n" +
                        "except ValueError:\n" +
                        "\t0";
                break;
        }
        System.out.print(translatedFunction);
    }

}