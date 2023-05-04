package s03;

import java.util.Scanner;

/**
 * Calcule el salario semanal de un obrero:
 * - Si trabaja 40 hrs. o menos se le paga S/. 12.00 por hr.
 * - Si trabaja más de 40 hrs. se le paga S/12.00 por cada una 
 * de las primeras 40 hrs. Y S/. 18.00 por cada hora extra
 * 
 * @author Magh
 */
public class Ejercicio02 {
    /**
     * Método principal que se encarga de ejecutar el programa.
     * Solicita al usuario las horas laboradas incluyendo las horas extra.
     * En base a esta información, el programa calcula su salario correspondiente.
     * 
     * @param args Los argumentos pasados por línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        double salarioSemanal = 0.0, montoPorHora = 12.0;
        int cntHoras;
        int[] intervaloHrs = {0, 48};
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese horas trabajadas: (Incluyendo extras)");
        cntHoras = teclado.nextInt();
        cntHoras = Utilidades.verificar(cntHoras, 
                                    intervaloHrs, 
                                  "Entrada incorrecta!");
        
        if (cntHoras<=40) {
            salarioSemanal = cntHoras*montoPorHora;
        } else if (cntHoras<=intervaloHrs[1]) {
            cntHoras -= 40;
            salarioSemanal = 40*montoPorHora + cntHoras*(montoPorHora + 6.0);
        }
        
        System.out.println("\nLe corresponde: S/" + salarioSemanal);
    }
}
