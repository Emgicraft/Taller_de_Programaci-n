package s02_ejercicios;

/**
 * @author Moisés
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        // Declaración e inicialización
        final double pi = 3.141592654;
        double radio, longitudCircunferencia, areaCirculo, volumenEsfera;

        // Entrada
        radio = 10.0;

        //Proceso
        longitudCircunferencia = 2*pi*radio;
        areaCirculo = pi*(radio*radio);
        volumenEsfera = (4/3)*pi*(radio*radio*radio);

        //Salida
        System.out.println("Dado un radio de "+ radio + " cm, se calcula lo siguiente:");
        System.out.println("Longitud de la circunferencia = " + longitudCircunferencia + " cm");
        System.out.println("\u00C1rea del c\u00EDrculo = " + areaCirculo + " cm^2");
        System.out.println("Volumen de la esfera = " + volumenEsfera + " cm^3");
    }
}