package s03;

import java.util.Scanner;

/**
 * Un trabajador recibe su salario de acuerdo al número de horas 
 * trabajadas y la tarifa por hora.
 * Cuando trabaja más de 40 horas, las 8 horas extras le pagan el 
 * doble de la tarifa normal, y el resto el triple de la tarifa normal.
 * ¿Cuánto debe recibir el trabajador como salario?
 *
 * @author Moisés
 */
public class Ejercicio04 {
    /**
     * Método principal que se encarga de ejecutar el programa.
     * Solicita al usuario las horas laboradas incluyendo las horas extra.
     * En base a esta información, el programa calcula su salario correspondiente.
     * 
     * @param args Los argumentos pasados por línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        double salario = 0.0, tarifaPorHora;
        double[] intervaloTarifaHora = {0, 150.0};
        int cntHoras;
        int[] intervaloHrs = {0, 200};
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese horas trabajadas: (Incluyendo extras)");
        cntHoras = Utilidades.verificar(teclado.nextInt(), 
                                    intervaloHrs, 
                                  "Entrada incorrecta!");
        
        System.out.print("Ingrese su tarifa por hora: S/");
        tarifaPorHora = Utilidades.verificar(teclado.nextDouble(), 
                                        intervaloTarifaHora, 
                                      "Entrada incorrecta!");
        
        if (cntHoras<=40) {
            salario = cntHoras*tarifaPorHora;
        } else if (cntHoras<=intervaloHrs[1]) {
            cntHoras -= 40;
            salario = 40*tarifaPorHora;
            if (cntHoras<=8) {
                salario += cntHoras*(tarifaPorHora*2);
            } else {
                cntHoras -= 8;
                salario += 8*(tarifaPorHora*2) + cntHoras*(tarifaPorHora*3);
            }
        }
        
        System.out.println("\nLe corresponde: S/" + salario);
    }
}
