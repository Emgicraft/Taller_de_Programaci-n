package Ejercicios_Propuestos;

//import java.util.Scanner;

import Clases.Punto;
import Clases.Racional;
import Clases.Circunferencia;

/**
 *
 * @author Magh
 */
public class Ejercicio0X {
    /**
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // ***** Ejercicio01 *****
        // Probando la Clase Punto
        System.out.println("***** Clase Punto *****");
        Punto punto1 = new Punto(-1, 5);
        Punto punto2 = new Punto(3, -17);
        System.out.println("Distancia: " + punto1.calcularDistanciaHastaPunto(punto2));
        Punto punto3 = new Punto(-5, -5);
        Punto punto4 = new Punto(15, 5);
        System.out.println("Distancia: " + punto3.calcularDistanciaHastaPunto(punto4));

        // ***** Ejercicio02 *****
        // Probando la Clase Racional
        System.out.println("\n***** Clase Racional *****");
        Racional q1 = new Racional(1, 2);
        Racional q2 = new Racional(3, 4);
        System.out.println("Suma: " + q1.sumar(q2)); // Imprime: "Suma: 5/4"
        System.out.println("Resta: " + q1.restar(q2));
        System.out.println("Multiplicación: " + q1.multiplicar(q2));
        System.out.println("División: " + q1.dividir(q2));
        int res = q1.comparar(q2);
        if (res > 0) {
            System.out.println(q1 + " es mayor a " + q2);
        } else if (res < 0) {
            System.out.println(q1 + " es menor a " + q2);
        } else {
            System.out.println(q1 + " es igual a " + q2);
        }
        
        // ***** Ejercicio03 *****
        // Probando la Clase Circunferencia
        System.out.println("\n***** Clase Circunferencia *****");
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Ingrese el radio: ");
        //double r = scanner.nextDouble();
        //Circunferencia c = new Circunferencia(r);
        Circunferencia c = new Circunferencia(2.87);
        System.out.println("Longitud: " + c.perimetro());
        System.out.println("Área: " + c.area());
    }
}
