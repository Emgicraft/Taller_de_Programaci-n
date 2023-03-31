import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String[] args) {
        int celsius;
        float fahrenheit;

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("[ Conviertiendo de grados Celsius a Fahrenheit ]");
        System.out.print("Ingrese grados Celsius: "); celsius = teclado.nextInt();

        //Proceso
        fahrenheit = (1.8f * celsius) + 32f;

        //Salida
        System.out.println("\n" + celsius + " grados Celsius son "
                                + fahrenheit + " grados Fahrenheit.");
    }
}