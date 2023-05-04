package s02_ejercicios;

import java.util.Scanner;

/**
 * @author Moisés
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        // Declaración e inicialización
        int numHombres, numMujeres;
        double poblacion, pH, pM;
        
        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el número de hombres: "); numHombres = teclado.nextInt();
        System.out.print("Ingrese el número de mujeres: "); numMujeres = teclado.nextInt();
        
        // Proceso
        poblacion = numHombres + numMujeres;
        pH = (numHombres/poblacion)*100;
        pM = (numMujeres/poblacion)*100;
        
        // Salida
        System.out.println("\nPorcentajes:");
        System.out.println(pH + "% de hombres.");
        System.out.println(pM + "% de mujeres.");
    }
}