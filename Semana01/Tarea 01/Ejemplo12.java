import java.util.Scanner;

public class Ejemplo12 {
    public static void main(String[] args) {
        float soles, dolares;
        final float tipoCambio = 2.87f;

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("[ Conviertiendo de Soles a Dólares ]");
        System.out.print("S/"); soles = teclado.nextFloat();

        //Proceso
        dolares = soles * tipoCambio;

        //Salida
        System.out.println("\t--> $" + dolares);
    }
}