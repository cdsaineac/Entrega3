import grammar.SLBaseListener;
import grammar.SLParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Arrays;

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

    public int numTabs = 0;

    public String sameTerminals[] = {"(", ")", "[", "]"};
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
        //System.out.print(ctx.getText());
        inExpresion = true;
    }

    @Override
    public void exitExpresion(SLParser.ExpresionContext ctx){
        inExpresion = false;
    }

    @Override
    public void enterSentencia_interna(SLParser.Sentencia_internaContext ctx){
        System.out.print("\t".repeat(numTabs));
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
        System.out.print("\n");
    }

    @Override
    public void enterAsignacion(SLParser.AsignacionContext ctx) {
        inAsignacion = true;
        System.out.print(ctx.parent.parent.getChild(0).getText());
    }

    @Override
    public void enterId_arreglo_registro(SLParser.Id_arreglo_registroContext ctx) {
        //System.out.print(ctx.parent.parent.getChild(0).getText());
    }
    @Override
    public void enterSentencia(SLParser.SentenciaContext ctx){
        System.out.print("\t".repeat(numTabs));
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
    public void enterDeclaracion_contenido_const(SLParser.Declaracion_contenido_constContext ctx) {
        inConstDeclaracion = true;
    }

    @Override
    public void enterMas_declaraciones_const(SLParser.Mas_declaraciones_constContext ctx) {
        System.out.print("\n");
        inConstDeclaracion = false;
    }

    @Override
    public void enterDeclaracion_contenido_tipos(SLParser.Declaracion_contenido_tiposContext ctx) {
        inDeclaracion = true;
    }

    @Override
    public void exitDeclaracion_contenido_tipos(SLParser.Declaracion_contenido_tiposContext ctx) {
        inDeclaracion = false;
    }

    @Override
    public void enterDeclaracion_contenido_var(SLParser.Declaracion_contenido_varContext ctx) {
        inDeclaracion = true;
    }

    @Override
    public void exitDeclaracion_contenido_var(SLParser.Declaracion_contenido_varContext ctx) {
        inDeclaracion = false;
    }

    @Override
    public void visitTerminal(TerminalNode node) {
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
            System.out.print(node.getText());
        } else if(node.getText().equals("^")) {
            System.out.print("**");
        } else if (node.getText().equals("<>")) {
            System.out.print("!=");
        } else if (inMasParametros && node.getText().equals(",")) {
            System.out.print(",");
        } else if (inExpresion && node.getText().equals("{")) {
            System.out.print("[");
        } else if (inExpresion && node.getText().equals("}")) {
            System.out.print("]");
        } else if ((inExpresion || inAsignacion || inConstDeclaracion)) {
            System.out.print(node.getText());
        }else{
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
