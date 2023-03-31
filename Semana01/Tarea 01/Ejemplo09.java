import java.util.Scanner;

public class Ejemplo09 {
    public static void main(String[] args) {
        float precio1, precio2, precio3, total, media;

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el precio de tres articulos:");
        System.out.print("1er Articulo: S/"); precio1 = teclado.nextFloat();
        System.out.print("2do Articulo: S/"); precio2 = teclado.nextFloat();
        System.out.print("3er Articulo: S/"); precio3 = teclado.nextFloat();

        //Proceso
        total = precio1 + precio2 + precio3;
        media = total / 3;

        //Salida
        System.out.println("El total sería: S/" + total);
        System.out.println("El promedio de los precios es: S/" + media);
    }
}