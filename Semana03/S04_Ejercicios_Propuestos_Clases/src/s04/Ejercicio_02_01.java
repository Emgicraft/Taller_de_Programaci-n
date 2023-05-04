package s04;

import java.util.Scanner;

/**
 *
 * @author Magh
 */
public class Ejercicio_02_01 {
    public static void main(String[] args) {
        int mes, dias = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el número del mes: ");
        mes = teclado.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31; break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30; break;
            case 2:
                System.out.print("Ingrese el año: ");
                int anio = teclado.nextInt();
                dias = ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) ? 29 : 28;
                break;
            default:
                System.out.println("El número de mes ingresado no es válido.");
                break;
        }

        if (dias != 0) {
            System.out.println("El mes " + mes + " tiene " + dias + " días.");
        }
        
        teclado.close();
    }
}
