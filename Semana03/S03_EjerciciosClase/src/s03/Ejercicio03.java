package s03;

import java.util.Scanner;

/**
 * @author Magh
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        // Declaración
        double ingresosClie, costoDepa, costoInicial = 0.0, mensualidad = 0.0;
        int anios = 0;
        
        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Especifique sus ingresos: ");
        ingresosClie = teclado.nextDouble();
        
        System.out.print("Especifique el costo del departamento: ");
        costoDepa = teclado.nextDouble();
        
        // Proceso
        if (ingresosClie<=5000) {
            anios = 10;
            costoInicial = costoDepa*0.15;
            mensualidad = (costoDepa - costoInicial)/(12*anios); //12 meses * 10 años
        } else if (ingresosClie>5000) {
            anios = 6;
            costoInicial = costoDepa*0.25;
            mensualidad = (costoDepa - costoInicial)/(12*anios); //12 meses * 6 años
        }
        
        // Salida
        System.out.println("\nCuota inicial a pagar: S/" + costoInicial);
        System.out.println("Mensualidad a pagar por " + anios + " años es de: S/" + mensualidad);
    }
}