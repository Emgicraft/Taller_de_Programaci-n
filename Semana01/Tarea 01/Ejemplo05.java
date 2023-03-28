import java.util.Scanner;

public class Ejemplo05 {
    public static void main(String[] args) {
        int aNaci, edad;
        final int a_Actual = 2023;

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Año de nacimiento: "); aNaci = teclado.nextInt();

        //Proceso
        edad = a_Actual - aNaci;

        //Salida
        System.out.println("Usted tiene " + edad + " año(s).");
    }
}