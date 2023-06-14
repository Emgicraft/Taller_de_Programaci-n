package MaghLibs;

import java.util.Scanner;

/**
 * Clase con funciones básica del mismo java pero 
 * mejoradas según mis requerimientos.
 * @author Magh (Moisés García Hidalgo)
 * @version 2.1
 */
public class Utilidades {
    // ==========[ Propiedades ]==========
    /***** Valores mínimos y máximos *****/
    // byte -> 8 bits; rango -> -128 a 127
    private final byte minByte = Byte.MIN_VALUE;
    private final byte maxByte = Byte.MAX_VALUE;
    // short -> 16 bits; rango -> -32,768 a 32,767
    private final short minShort = Short.MIN_VALUE;
    private final short maxShort = Short.MAX_VALUE;
    // int -> 32 bits; rango -> -2,147,483,648 a 2,147,483,647
    private final int minInt = Integer.MIN_VALUE;
    private final int maxInt = Integer.MAX_VALUE;
    // long -> 64 bits; rango -> -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
    private final long minLong = Long.MIN_VALUE;
    private final long maxLong = Long.MAX_VALUE;
    // float -> 32 bits
    private final float minFloat = Float.MIN_VALUE;
    private final float maxFloat = Float.MAX_VALUE;
    // double -> 64 bits
    private final double minDouble = Double.MIN_VALUE;
    private final double maxDouble = Double.MAX_VALUE;
    
    /***** Objeto para la lectura de datos *****/
    private static final Scanner inTeclado = new Scanner(System.in);
    
    // ==========[ Métodos ]==========
    /**
     * Esta función retorna una matriz con los valores
     * límites de la variable byte.
     * 
     * @return [0] = mínimo y [1] = máximo
     */
    public byte[] getByteLimites() {
        byte[] limites = new byte[2];
        limites[0] = this.minByte;
        limites[1] = this.maxByte;
        return limites;
    }
    
    /**
     * Esta función retorna una matriz con los valores
     * límites de la variable short.
     * 
     * @return [0] = mínimo y [1] = máximo
     */
    public short[] getShortLimites() {
        short[] limites = new short[2];
        limites[0] = this.minShort;
        limites[1] = this.maxShort;
        return limites;
    }
    
    /**
     * Esta función retorna una matriz con los valores
     * límites de la variable int.
     * 
     * @return [0] = mínimo y [1] = máximo
     */
    public int[] getIntLimites() {
        int[] limites = new int[2];
        limites[0] = this.minInt;
        limites[1] = this.maxInt;
        return limites;
    }
    
    /**
     * Esta función retorna una matriz con los valores
     * límites de la variable long.
     * 
     * @return [0] = mínimo y [1] = máximo
     */
    public long[] getLongLimites() {
        long[] limites = new long[2];
        limites[0] = this.minLong;
        limites[1] = this.maxLong;
        return limites;
    }
    
    /**
     * Esta función retorna una matriz con los valores
     * límites de la variable float.
     * 
     * @return [0] = mínimo y [1] = máximo
     */
    public float[] getFloatLimites() {
        float[] limites = new float[2];
        limites[0] = this.minFloat;
        limites[1] = this.maxFloat;
        return limites;
    }
    
    /**
     * Esta función retorna una matriz con los valores
     * límites de la variable double.
     * 
     * @return [0] = mínimo y [1] = máximo
     */
    public double[] getDoubleLimites() {
        double[] limites = new double[2];
        limites[0] = this.minDouble;
        limites[1] = this.maxDouble;
        return limites;
    }
    
    /**
     * Función redondear, recibe el numero a aproximar 
     * y la cantidad de decimales a aproximar.
     * @param numero valor a redondear
     * @param cntDecimales número de decimales a redondear
     * @return retorna el número redondeado
     */
    public static double redondear(double numero, int cntDecimales) {
        return Math.round(numero*Math.pow(10, cntDecimales))/Math.pow(10, cntDecimales);
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