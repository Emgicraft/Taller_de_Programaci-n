import java.util.Scanner;

public class Ejemplo06 {
    public static void main(String[] args) {
        float horasTrab, costoHora, salario;

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Horas Trabajadas: "); horasTrab = teclado.nextFloat();
        System.out.print("Costo por Hora: S/"); costoHora = teclado.nextFloat();

        //Proceso
        salario = horasTrab * costoHora;

        //Salida
        System.out.println("Su salario es de " + salario + " soles.");
    }
}