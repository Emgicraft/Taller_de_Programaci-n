package s04;

import java.util.Scanner;

/**
 * Determinar el monto que debe pagar un usuario por estacionamiento de 
 * su vehículo. Las tarifas que se tienen son las siguientes:
 * - Las dos primeras horas a 5.00 c/u.
 * - Las siguientes tres a 4.00 c/u.
 * - Las cinco siguientes a 3.00 c/u.
 * - Después de diez horas el costo por cada una es de S/. 2.00
 *
 * @author Magh
 */
public class Propuesto01 {
    public static void main(String[] args) {
        int cntHoras; int[] intervaloHoras = {0, Integer.MAX_VALUE};
        double[] tarifas = {5.0, 4.0, 3.0, 2.0};
        double monto2Pagar;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese sus horas de estacionamiento: ");
        cntHoras = Utilidades_v2.verificar(teclado.nextInt(), 
                                    intervaloHoras, 
                                  "Entrada erronea!");
        
        if (cntHoras<=2) {
            monto2Pagar = cntHoras*tarifas[0];
        } else if (cntHoras<=5) {
            cntHoras -= 2;
            monto2Pagar = 2*tarifas[0] + cntHoras*tarifas[1];
        } else if (cntHoras<=10) {
            cntHoras -= 5;
            monto2Pagar = 2*tarifas[0] + 3*tarifas[1] + cntHoras*tarifas[2];
        } else {
            cntHoras -= 10;
            monto2Pagar = 2*tarifas[0] + 3*tarifas[1] + 5*tarifas[2] + cntHoras*tarifas[3];
        }
        
        System.out.println("Su monto a pagar es: S/" + monto2Pagar);
    }
}