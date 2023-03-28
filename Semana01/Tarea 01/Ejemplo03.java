import java.util.Scanner;

public class Ejemplo03 {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
        float promedio;

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número 1: "); num1 = teclado.nextInt();
        System.out.print("Número 2: "); num2 = teclado.nextInt();
        System.out.print("Número 3: "); num3 = teclado.nextInt();
        System.out.print("Número 4: "); num4 = teclado.nextInt();
        System.out.print("Número 5: "); num5 = teclado.nextInt();

        //Proceso
        promedio = (num1 + num2 + num3 + num4 + num5)/5;

        //Salida
        System.out.println("El promedio es: " + promedio);
    }
}