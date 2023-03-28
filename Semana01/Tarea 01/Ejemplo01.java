import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
        float numMetros, numCenti;
        final int centi = 100;

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese metros: "); numMetros = teclado.nextFloat();

        //Proceso
        numCenti = numMetros * centi;

        //Salida
        System.out.println(numCenti + " cm");
    }
}