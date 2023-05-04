package s02_ejercicios;

import java.util.Scanner;

/**
 * @author Moisés
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        // Declaración
        double num, res;
        
        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número: "); num = teclado.nextDouble();
        
        // Proceso
        res = Math.sqrt(num);
        
        // Salida
        System.out.println("La raiz cuadrada de " + num + " es: " + res);
    }
}