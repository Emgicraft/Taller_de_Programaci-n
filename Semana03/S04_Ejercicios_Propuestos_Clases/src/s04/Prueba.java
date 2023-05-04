package s04;

import java.util.Scanner;

/**
 *
 * @author Moisés
 */
public class Prueba {
    public static void main(String[] args) {
        char operacion;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese la operación (G, A, C, P): ");
        operacion = teclado.next().charAt(0);
        
        if (operacion == 'G') {
            System.out.println("Ingreso la letra: G");
        }
        
        if (operacion == 'A') {
            System.out.println("Ingreso la letra: A");
        }
    }
}
