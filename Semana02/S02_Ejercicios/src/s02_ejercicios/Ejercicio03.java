package s02_ejercicios;

/**
 * @author Moisés
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        // Declaración e inicialización
        double herencia, ana, jose, manuel;

        // Entrada
        herencia = 85000.0;
        ana = 0.25;
        jose = 0.30;
        manuel = 0.45;

        //Proceso
        ana *= herencia;
        jose *= herencia;
        manuel *= herencia;

        //Salida
        System.out.println("Herencia de S/" + herencia);
        System.out.println("\nEntonces corresponde:\n25% para Ana = S/" + ana);
        System.out.println("30% para Jose = S/" + jose + "\n45% para Manuel = S/" + manuel);
    }
}