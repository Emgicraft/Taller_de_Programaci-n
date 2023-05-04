package s04;

import java.util.Scanner;

/**
 * Clase con funciones básica del mismo java pero 
 * mejoradas o personalizadas.
 * @author Moisés
 */
public class Utilidades_v2 {
    private static Scanner inTeclado = new Scanner(System.in);
    /**
     * Función redondear, recibe el numero a aproximar 
     * y la cantidad de decimales a aproximar.
     * @param numero valor a redondear
     * @param cntDecimales valor que indica número de decimales
     * @return retorna el número aproximado
     */
    public static double redondear(double numero, double cntDecimales) {
        double numrdn = Math.round(numero*Math.pow(10, cntDecimales))/Math.pow(10, cntDecimales);
        return numrdn;
    }
    /* // No sé si crear su versión en float:
    public static float redondear(float numero, float cntDecimales) {
        float numrdnF = (float) (Math.round(numero*Math.pow(10, cntDecimales))/Math.pow(10, cntDecimales));
        return numrdnF;
    }*/
    
    /**
     * Verifica si un número está dentro de un intervalo determinado y en caso 
     * no lo esté, lo seguirá solicitando hasta que la condición se cumpla.
     *
     * @param num el número a verificar
     * @param intervalo un array de dos elementos que representa el intervalo dentro del cual el número debe estar
     * @param mensajeError el mensaje de error que se mostrará en caso de que el número no esté dentro del intervalo
     * @return el número verificado si se encuentra dentro del intervalo
     */
    public static double verificar(double num, double[] intervalo, String mensajeError) {
        while (!(num >= intervalo[0] && num <= intervalo[1])){
            System.out.println(mensajeError);
            if (intervalo[1] == Double.POSITIVE_INFINITY) {
                System.out.print("Su entrada debe ser mayor a " 
                                + intervalo[0] + ": ");
            } else {
                System.out.print("Su entrada debe estar entre " 
                                + intervalo[0] + " y " + intervalo[1] + ": ");
            }
            num = inTeclado.nextDouble();
        }
        return num;
    }
    
    /**
     * Verifica si el número está dentro del intervalo dado y 
     * solicita el ingreso nuevamente si está fuera del intervalo.
     * 
     * @param num el número a verificar
     * @param intervalo un arreglo de dos elementos que indica el rango permitido de números
     * @param mensajeError el mensaje que se muestra si el número ingresado está fuera del intervalo
     * @return el número verificado que se encuentra dentro del intervalo
     */
    public static int verificar(int num, int[] intervalo, String mensajeError) {
        while (!(num >= intervalo[0] && num <= intervalo[1])){
            System.out.println(mensajeError);
            if (intervalo[1] == Integer.MAX_VALUE) {
                System.out.print("Su entrada debe ser mayor a " 
                                + intervalo[0] + ": ");
            } else {
                System.out.print("Su entrada debe estar entre " 
                                + intervalo[0] + " y " + intervalo[1] + ": ");
            }
            num = inTeclado.nextInt();
        }
        return num;
    }

    /**
     * Verifica si una cadena de texto se parece a alguna de las cadenas 
     * de texto esperadas. Si no lo es, se solicita nuevamente el ingreso 
     * del texto hasta que sea válido.
     *
     * @param inTexto la cadena de texto a verificar
     * @param textosEsperados un array de cadenas de texto que se esperan que se parezcan a inTexto
     * @param mensajeError el mensaje de error que se mostrará en caso de que inTexto no se parezca a ninguna de las cadenas de texto esperadas
     * @return la cadena de texto verificada si se parece a alguna de las cadenas de texto esperadas
     */
    public static String verificar(String inTexto, String[] textosEsperados, String mensajeError) {
        boolean valido = false;
        while (!valido) {
            for (String textoEsperado : textosEsperados) {
                if (inTexto.equalsIgnoreCase(textoEsperado)) {
                    valido = true; break;
                }
            }

            if (!valido) {
                System.out.print(mensajeError); inTexto = inTeclado.nextLine();
            }
        }
        return inTexto; 
    }
}
