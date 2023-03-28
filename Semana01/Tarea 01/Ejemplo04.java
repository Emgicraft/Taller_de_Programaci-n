import java.util.Scanner;

public class Ejemplo04 {
    public static void main(String[] args) {
        int num1, num2, num3, suma;
        float res;

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número 1: "); num1 = teclado.nextInt();
        System.out.print("Número 2: "); num2 = teclado.nextInt();
        System.out.print("Número 3: "); num3 = teclado.nextInt();

        //Proceso
        suma = num1 + num2 + num3;
        res = suma/5;

        //Salida
        System.out.println("La quinta parte de la suma es: " + res);
    }
}