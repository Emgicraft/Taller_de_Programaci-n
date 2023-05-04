package s02_ejercicios;

import java.util.Scanner;
import java.util.Arrays;

/**
 * @author Moisés
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        // Declaración e inicialización
        double[] notas = new double[4];
        double notaMin = 0.0, notaMax = 20.0, promedio = 0.0;
        
        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese sus notas: ");
        for (int i = 0; i < 4; i++) {
            boolean condicion;
            do {
                System.out.print("Nota #" + (i+1) + ": "); notas[i] = teclado.nextDouble();
                condicion = notas[i]<notaMin || notas[i]>notaMax;
                if (condicion) {
                    System.out.println("Número inválido, intente de nuevo!");
                }
            } while (condicion);
        
        // Proceso
            promedio += notas[i]*((i < 2) ? 0.2 : 0.3);
        }
        
        // Salida
        System.out.println("\nNotas ingresadas: " + Arrays.toString(notas));
        System.out.println("Su promedio es: " + promedio);
    }
}