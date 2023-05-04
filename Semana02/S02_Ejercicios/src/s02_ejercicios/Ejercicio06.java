package s02_ejercicios;

import java.util.Scanner;

/**
 * @author Moisés
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        // Declaración
        String nombre;
        
        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su nombre: "); nombre = teclado.nextLine();
        
        // Salida
        System.out.println("Tu nombre es " + nombre);
    }
}