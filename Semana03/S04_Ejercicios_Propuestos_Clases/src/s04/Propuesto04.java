package s04;

import java.util.Scanner;

/**
 * Un banco aplica un descuento a sus clientes en el pago de membresía por 
 * el uso de algunas de sus tarjetas de crédito. Ingresar el tipo de 
 * tarjeta y calcular dicho descuento en soles.
 * 
 * |        **Tarjeta**       | **Membresia (S/.)** | **Descuento** |
 * |:------------------------:|:-------------------:|:-------------:|
 * | LifeMiles                |              400.00 |            9% |
 * | Platinium                |              350.00 |            8% |
 * | Signature                |              300.00 |            7% |
 * | Oro                      |              190.00 |            6% |
 * | Repsol, Primera, MCBlack |               75.00 |            5% |
 * | Otros                    |                0.00 |            0% |
 *
 * @author Magh
 */
public class Propuesto04 {
    public static void main(String[] args) {
        String tipoTarjeta;
        double membresia, descPorcent, descMembresia;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de tarjeta: ");
        tipoTarjeta = teclado.nextLine();
        
        
        switch (tipoTarjeta.toLowerCase()) {
            case "lifemiles":
                membresia = 400.00; descPorcent = 0.09;
                break;
            case "platinium":
                membresia = 350.00; descPorcent = 0.08;
                break;
            case "signature":
                membresia = 300.00; descPorcent = 0.07;
                break;
            case "oro":
                membresia = 190.00; descPorcent = 0.06;
                break;
            case "repsol":
            case "primera":
            case "mcblack":
                membresia = 75.00; descPorcent = 0.05;
                break;
            default:
                membresia = 0.00; descPorcent = 0.00;
                break;
        }
        
        descMembresia = membresia * descPorcent;
        System.out.printf("El descuento en la membresía de la "
        + "tarjeta %s es: S/ %.2f\n", tipoTarjeta, descMembresia);
        
        teclado.close();
    }
}
