import java.util.Scanner;

public class Ejemplo08 {
    public static void main(String[] args) {
        float precio, total, igv = 0.19f;

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese precio: "); precio = teclado.nextFloat();

        //Proceso
        total = precio * (1.0f + igv);

        //Salida
        System.out.println("Total: S/" + total);
    }
}