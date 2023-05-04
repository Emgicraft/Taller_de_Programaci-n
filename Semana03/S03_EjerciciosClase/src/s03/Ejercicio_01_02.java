package s03;

import java.util.Scanner;

/**
 * @author Moisés
 */
public class Ejercicio_01_02 {
    public static void main(String[] args) {
        // Declaración
        String nombre;
        int numHijos;
        double sueldo, bono = 0.07; // bono = 7%
        
        // Entrada
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: "); nombre = teclado.nextLine();
        //teclado.nextLine();
        System.out.print("Número de hijos: "); numHijos = teclado.nextInt();
        System.out.print("Especifique su salario: "); sueldo = teclado.nextDouble();
        
        // Pre-Salida
        System.out.println("\nNombre: " + nombre);
        
        // Proceso
        if (numHijos>0) {
            // Pre-Salida
            System.out.println("Usted recibirá un bono del " + Math.round(bono*100) + "%:");
            
            bono = Math.round(bono*sueldo*100)/100;
            sueldo += bono;
            
            // Salida
            System.out.println("S/" + bono);
        }
        
        System.out.println("Sueldo final:\nS/" + sueldo);
    }
}
