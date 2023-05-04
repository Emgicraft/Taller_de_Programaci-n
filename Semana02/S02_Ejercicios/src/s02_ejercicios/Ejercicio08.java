package s02_ejercicios;

import java.util.Scanner;

/**
 * @author Moisés
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        // Declaración e inicialización
        double radio, longitudCircunferencia, areaCirculo;

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el radio: "); radio = teclado.nextDouble();

        //Proceso
        longitudCircunferencia = 2*Math.PI*radio;
        areaCirculo = Math.PI*(radio*radio);

        //Salida
        System.out.println("Dado un radio de "+ radio + " cm, se calcula lo siguiente:");
        System.out.println("Longitud de la circunferencia = " + longitudCircunferencia + " cm");
        System.out.println("\u00C1rea del c\u00EDrculo = " + areaCirculo + " cm^2");
    }
}