package s03;

import java.util.Scanner;

/**
 * @author Moisés
 */
public class Ejercicio_01_01 {
    public static void main(String[] args) {
        // Declaración e inicialización
        double ingresos, impuesto = 0.10; // impuestos = 10%
        
        // Entrada
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Especifique su salario: "); ingresos = teclado.nextDouble();
        
        // Proceso
        if (ingresos>=3135.0) {
            impuesto *= ingresos;
            
            // Salida
            System.out.println("\nUsted si paga impuestos, monto a pagar:\nS/" + impuesto);
        } else {
            System.out.println("Usted no paga impuestos.");
        }
    }
}
