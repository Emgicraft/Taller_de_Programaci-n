package s02_ejercicios;

import java.util.Scanner;
import java.time.LocalDate;

/**
 * @author Moisés
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        // Declaración
        int edad, anioAct, anioNac;
        
        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su edad: "); edad = teclado.nextInt();
        
        // Proceso
        anioAct = LocalDate.now().getYear();
        anioNac = anioAct - edad;
        
        // Salida
        System.out.println("Año de nacimiento: " + anioNac);
    }
}