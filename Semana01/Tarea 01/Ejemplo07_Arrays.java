import java.util.Scanner;

public class Ejemplo07_Arrays {
    public static void main(String[] args) {
        float[] sueldos = new float[3];
        float[] aumentos = new float[3];
        float[] sueldoFinal = new float[3];

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el sueldo de tres empleados:");
        for (int i = 0; i < 3; i++) {
            System.out.print("S/"); sueldos[i] = teclado.nextFloat();

        // Proceso
            aumentos[i] = sueldos[i] * (0.10f + ((float)(2*i + ((i<=1)? 0 : 1)))/100.0f);
            sueldoFinal[i] = sueldos[i] + aumentos[i];
        }

        //Salida
        System.out.println("Sus salarios finales son:");
        for (int i = 0; i < 3; i++){
            System.out.println("De S/" + sueldos[i] + " a S/" + sueldoFinal[i]);
        }
    }
}