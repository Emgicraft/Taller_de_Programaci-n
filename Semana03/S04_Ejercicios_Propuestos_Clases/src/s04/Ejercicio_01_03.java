package s04;

import java.util.Scanner;

/**
 * @author Magh
 */
public class Ejercicio_01_03 {
    public static void main(String[] args) {
        double num1, num2, resultado;
        char operacion;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        num1 = teclado.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = teclado.nextDouble();

        System.out.print("Ingrese la operación (+, -, *, /): ");
        operacion = teclado.next().charAt(0);
        
        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("El resultado del producto es: " + resultado);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error! No se puede dividir entre cero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                }
                break;
            default:
                System.out.println("Error! Operación no válida.");
                break;
        }

        teclado.close();
    }
}
