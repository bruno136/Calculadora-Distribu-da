/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.master.util;

/**
 *
 * @author Bruno
 */
public class Util {

    public static boolean verificaOperador(String calculo){

        if(calculo.contains("+") ||
                calculo.contains("-") ||
                calculo.contains("*") ||
                calculo.contains("/") ||
                calculo.contains("√") ||
                calculo.contains("^")){
            return true;
        }

        return false;
    }

    public static String getOperador(String calculo){
        if (calculo.contains("+")) {
            return "+";
        }
        if (calculo.contains("-")) {
            return "-";
        }
        if (calculo.contains("*")) {
            return "*";
        }
        if (calculo.contains("/")) {
            return "/";
        }
        if (calculo.contains("√")) {
            return "√";
        }
        if (calculo.contains("^")) {
            return "^";
        }
        return null;
    }

    public static String ponto2virguta(String s){
        return s.replaceAll(".", ",");
    }
}
