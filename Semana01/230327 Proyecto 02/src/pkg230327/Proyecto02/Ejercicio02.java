package pkg230327.Proyecto02;

/**
 *
 * @author Moisés
 */
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        float a, b, res;
        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número 1: ");
        a = teclado.nextFloat();
        System.out.print("Número 2: ");
        b = teclado.nextFloat();
        //Proceso
        res = (1/a + 1/b)/(a*b);
        //Salida
        System.out.println("La suma es: " + res);
    }
}
