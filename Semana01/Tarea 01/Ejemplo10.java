import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {
        int base, altura;
        float area;

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("[ Calculando el área de un triángulo rectangulo ]");
        System.out.print("Ingrese la base: "); base = teclado.nextInt();
        System.out.print("Ingrese la altura: "); altura = teclado.nextInt();

        //Proceso
        area = (base * altura)/2f;

        //Salida
        System.out.println("\nEl área es de " + area + " unidades cuadradas.");
    }
}