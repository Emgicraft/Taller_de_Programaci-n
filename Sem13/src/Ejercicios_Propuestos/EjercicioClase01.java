package Ejercicios_Propuestos;

import Ejercicios_Propuestos.pack_caso1.Celular;

/**
 *
 * @author Moisés
 */
public class EjercicioClase01 {
    /**
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Probando la clase Celular
        int numero = 999666777;
        String usuario = "Magh Phone";
        int segundosConsumidos = 3678;
        double precioPorSegundo = 0.07;
        
        Celular celular = new Celular(numero, usuario, segundosConsumidos, precioPorSegundo);
        
        System.out.println("Total: S/." + celular.total_a_pagar());
    }
}
