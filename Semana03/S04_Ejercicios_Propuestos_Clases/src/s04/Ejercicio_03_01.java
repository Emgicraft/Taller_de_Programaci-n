package s04;

import java.util.Scanner;

/**
 * @author Magh
 */
public class Ejercicio_03_01 {
    public static void main(String[] args) {
        int numDia;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el número de día: ");
        numDia = teclado.nextInt();
        
        switch (numDia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Es día laborable.");
                break;
            case 6:
            case 7:
                System.out.println("Es fin de semana! :D");
                break;
            default:
                System.out.println("Error! El día ingresado no es válido!");
        }
        
        teclado.close();
    }
}
