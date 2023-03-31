import java.util.Scanner;

public class Ejemplo07 {
    public static void main(String[] args) {
        float sueldo1, sueldo2, sueldo3,
              aumento1, aumento2, aumento3,
              sueldoFinal1, sueldoFinal2, sueldoFinal3;

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el sueldo de tres empleados.");
        System.out.print("Sueldo 1: S/"); sueldo1 = teclado.nextFloat();
        System.out.print("Sueldo 2: S/"); sueldo2 = teclado.nextFloat();
        System.out.print("Sueldo 3: S/"); sueldo3 = teclado.nextFloat();

        // Proceso
        aumento1 = sueldo1 * 0.10f;
        aumento2 = sueldo2 * 0.12f;
        aumento3 = sueldo3 * 0.15f;
        sueldoFinal1 = sueldo1 + aumento1;
        sueldoFinal2 = sueldo2 + aumento2;
        sueldoFinal3 = sueldo3 + aumento3;

        //Salida
        System.out.println("Sus salarios finales son:");
        System.out.println("Primero: S/" + sueldo1 + " + S/" + aumento1 + " = S/" + sueldoFinal1);
        System.out.println("Segundo: S/" + sueldo2 + " + S/" + aumento2 + " = S/" + sueldoFinal2);
        System.out.println("Tercero: S/" + sueldo3 + " + S/" + aumento3 + " = S/" + sueldoFinal3);
    }
}