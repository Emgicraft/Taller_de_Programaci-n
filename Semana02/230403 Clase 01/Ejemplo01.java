import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
        final double pi = 3.141592654;
        double radio, area;

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el radio: "); radio = teclado.nextDouble();

        //Proceso
        area = pi*(radio*radio);

        //Salida
        System.out.println("\u00C1rea del circulo = " + area + " u^2");
        //System.out.println(radio + " ; " + radio++ + " ; " + radio);
        //System.out.println(radio + " ; " + ++radio + " ; " + radio);
    }
}