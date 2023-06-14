package Ejercicios_Clase;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Moisés
 */
public class Ejercicio01 {
    // Propiedades
    public static Scanner teclado = new Scanner(System.in);
    public static Random aleatorio = new Random();
    
    // Métodos
    public static void leerMatriz(int[][] N) {
        for (int i=0; i<N.length; i++) {
            System.out.print("Dia " + (i+1) + ": ");
            for (int j=0; j<N[0].length; j++) {
                System.out.print(N[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static void escribirMatriz(int[][] N) {
        for (int i=0; i<N.length; i++) {
            for (int j=0; j<N[0].length; j++) {
                N[i][j] = aleatorio.nextInt(1000);
            }
        }
    }
    
    public static void sumar_filas(int[][]N) {
        int suma;
        
        for(int i=0; i<N.length; i++){
            suma=0;
            System.out.print("Dia " + (i+1) + " = ");
            
            for(int j=0; j<N[0].length; j++){
                suma += N[i][j];
            }
            System.out.println(suma);
        }
    }
    
    public static void max_fila(int[][] N) {
        int max = 0, numVaca = -1;
        for (int i=0; i<N.length; i++) {
            System.out.print("Dia " + (i+1) + ": vaca#");
            for (int j=0; j<N[0].length; j++) {
                if (N[i][j] > max) {
                    max = N[i][j];
                    numVaca = j;
                }
            }
            System.out.println(numVaca);
            max = 0;
            numVaca = -1;
        }
    }
    
    // Método Principal
    public static void main(String[] args) {
        System.out.print("Ingrese el número de vacas: ");
        int numVacas = teclado.nextInt();
        
        int[][] prodLeche = new int[7][numVacas];
        
        escribirMatriz(prodLeche);
        System.out.println("Producción de leche de la semana:");
        leerMatriz(prodLeche);
        System.out.println("\nProducción Total de Leche al día:");
        sumar_filas(prodLeche);
        System.out.println("\nNúmero de vaca que produjo más leche en el día:");
        max_fila(prodLeche);
    }
}