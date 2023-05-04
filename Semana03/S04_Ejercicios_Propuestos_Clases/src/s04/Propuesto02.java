package s04;

import java.util.Scanner;

/**
 * Cierta empresa proporciona un bono mensual a sus trabajadores, el cual puede 
 * ser por su antigüedad o bien por el monto de su sueldo (el que sea mayor), 
 * de la siguiente forma:
 * 
 * De acuerdo a la antigüedad:
 * - Cuando la antigüedad es al menos de 5 años será del 30 % del sueldo; 
 * en otros casos solo 20%.
 * 
 * De acuerdo al sueldo:
 * - Si el sueldo es menor a 3000, se da 25 % de éste; en los demás casos el 15%.
 * 
 * Calcular los dos tipos de bono, asigne e imprima el mayor bono y el sueldo final.
 *
 * @author Magh
 */
public class Propuesto02 {
    public static void main(String[] args) {
        // Declaración e inicialización de variables
        double sueldo, antiguedad, bonoAntiguedad, bonoSueldo, mayorBono;
        double[] intvlSueldo = {0.0, Double.POSITIVE_INFINITY}, 
                 intvlAntiguedad = {0.0, 100.0};
        
        Scanner teclado = new Scanner(System.in);
        
        // Lectura de datos
        System.out.print("Ingrese el sueldo del trabajador: S/");
        sueldo = Utilidades_v2.verificar(teclado.nextDouble(), 
                                     intvlSueldo, 
                                   "Entrada invalida!");

        System.out.print("Ingrese la antigüedad del trabajador (en años): ");
        antiguedad = Utilidades_v2.verificar(teclado.nextDouble(), 
                                         intvlAntiguedad, 
                                       "Entrada invalida!");

        // Cálculo del bono por antigüedad
        if (antiguedad >= 5) {
            bonoAntiguedad = sueldo * 0.3;
        } else {
            bonoAntiguedad = sueldo * 0.2;
        }

        // Cálculo del bono por sueldo
        if (sueldo < 3000) {
            bonoSueldo = sueldo * 0.25;
        } else {
            bonoSueldo = sueldo * 0.15;
        }

        // Obtención del mayor bono
        if (bonoAntiguedad > bonoSueldo) {
            mayorBono = bonoAntiguedad;
            System.out.print("Les corresponde un bono por Antigüedad de: S/");
        } else {
            mayorBono = bonoSueldo;
            System.out.print("Les corresponde un bono por Sueldo de: S/");
        }

        // Cálculo del sueldo final
        sueldo += mayorBono;

        // Impresión de resultados
        System.out.println(mayorBono);
        System.out.println("Sueldo final: S/" + sueldo);
    }
}