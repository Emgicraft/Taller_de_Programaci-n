package s03;

import java.util.Scanner;

/**
 * Haga un programa que pregunte el género de una persona y
 * le de la bienvenida según sea hombre o mujer. Después que
 * pregunte su edad y de acuerdo a eso muestre el precio de la
 * entrada del cine de acuerdo a esta tabla:
 * 
 * |       Edad      | Precio S/ |
 * |:---------------:|:---------:|
 * | Menores de edad |     15.00 |
 * | Mayores de edad |     20.00 |
 * 
 * @author Magh
 */
public class Ejercicio01 {
    /**
     * Método principal que se encarga de ejecutar el programa.
     * Solicita al usuario su género y edad. De acuerdo al genero 
     * da la bienvenida y de acuerdo a la edad calcula el costo 
     * de la entrada.
     * 
     * @param args Los argumentos pasados por línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        String genero;
        String[] generos = {"hombre", "mujer"};
        double[] costoEntrada = {15, 20};
        int edad;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Hombre o Mujer?"); genero = teclado.nextLine();
        genero = Utilidades.verificar(genero, 
                                      generos, 
                                      "Texto erroneo, por favor, ingrese su genero:");
        
        if (genero.toLowerCase().contentEquals("hombre")){
            System.out.print("Sea bienvenido.\nPor favor, ");
        } else if (genero.toLowerCase().contentEquals("mujer")){
            System.out.print("Sea bienvenida.\nPor favor, ");
        }
        
        System.out.print("ingrese su edad: "); edad = teclado.nextInt();
        
        if (edad>=0 && edad<18) {
            // Salida
            System.out.println("\nSu coste de entrada es: S/" + costoEntrada[0]);
        } else if (edad>=18) {
            System.out.println("\nSu coste de entrada es: S/" + costoEntrada[1]);
        }
    }
}
