package pkg230327.Proyecto01;

/**
 * @author Moisés
 */

// import carpeta.subcarpeta.Clase
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        int a, b, suma;
        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número 1: ");
        a = teclado.nextInt();
        System.out.print("Número 2: ");
        b = teclado.nextInt();
        //Proceso
        suma = a + b;
        //Salida
        System.out.println("La suma es: " + suma);
    }
}
