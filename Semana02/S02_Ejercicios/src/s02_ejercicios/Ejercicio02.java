package s02_ejercicios;

/**
 * @author Moisés
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        // Declaración e inicialización
        final double cV = 0.1; // Comisión por cada Venta
        double sueldoBase, sueldoFinal;
        double[] ventas, comisiones;

        // Entrada
        sueldoBase = 2000.0;
        ventas = new double[] {580.0, 1200.0, 3200.0};

        //Proceso
        comisiones = new double[] {ventas[0]*cV, ventas[1]*cV, ventas[2]*cV};
        sueldoFinal = sueldoBase + comisiones[0] + comisiones[1] + comisiones[2];

        //Salida
        System.out.println("Sueldo base: S/" + sueldoBase);
        System.out.println("Montos por ventas:\n1. S/" + ventas[0] + "\n2. S/" + ventas[1] + "\n3. S/" + ventas[2]);
        System.out.println("====================\n" + "Por lo tanto, su sueldo final es de S/" + sueldoFinal);
    }
}