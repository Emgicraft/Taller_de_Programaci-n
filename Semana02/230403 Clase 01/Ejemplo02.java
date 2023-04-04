import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
        String apellidoP, apellidoM, nombres;

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese Apellido Paterno: "); apellidoP = teclado.next();
        System.out.print("Ingrese Apellido Materno: "); apellidoM = teclado.next();
        System.out.print("Ingrese Apellido Materno: "); teclado.nextLine(); nombres = teclado.nextLine();

        //Salida
        System.out.println(apellidoP + " " + apellidoM + ", " + nombres);
    }
}