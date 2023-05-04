package s04;

import java.util.Scanner;

/**
 * Realice un menú de operaciones para seleccionar una figura (círculo, 
 * cuadrado, triángulo, rombo y paralelogramo) de la cual se debe calcular 
 * su área. El programa debe pedir los valores necesarios para calcular el 
 * área de la figura elegida.
 *
 * @author Magh
 */
public class Propuesto03 {
    public static void main(String[] args) {
        // Declaración e inicialización de variables globales
        int opcion;
        double area;
        
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.println("=======[ MENÚ DE FIGURAS GEOMÉTRICAS ]=======");
            System.out.println("1. Circulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rombo");
            System.out.println("5. Paralelogramo");
            System.out.println("6. [Salir]");
            System.out.println("=============================================");
            System.out.print("Seleccione una opción: "); opcion = teclado.nextInt();
            
            switch(opcion) {
                case 1:
                    // Entrada
                    System.out.print("Ingrese el radio del circulo: ");
                    double radio = Utilidades_v2.verificar(teclado.nextDouble(), 
                                    new double[]{0, Double.POSITIVE_INFINITY}, 
                                    "Error! Intentelo de nuevo!");
                    // Proceso
                    area = Math.PI * Math.pow(radio, 2);
                    // Salida
                    System.out.println("El area del circulo es: " + area);
                    break;
                case 2:
                    // Entrada
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = Utilidades_v2.verificar(teclado.nextDouble(), 
                                    new double[]{0, Double.POSITIVE_INFINITY}, 
                                    "Error! Intentelo de nuevo!");
                    // Proceso
                    area = Math.pow(lado, 2);
                    // Salida
                    System.out.println("El area del cuadrado es: " + area);
                    break;
                case 3:
                    // Entrada
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = teclado.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = teclado.nextDouble();
                    // Proceso
                    area = (base * altura) / 2;
                    // Salida
                    System.out.println("El area del triángulo es: " + area);
                    break;
                case 4:
                    // Entrada
                    System.out.print("Ingrese la diagonal mayor del rombo: ");
                    double diagonalMayor = Utilidades_v2.verificar(teclado.nextDouble(), 
                                    new double[]{0, Double.POSITIVE_INFINITY}, 
                                    "Error! Intentelo de nuevo!");
                    System.out.print("Ingrese la diagonal menor del rombo: ");
                    double diagonalMenor = Utilidades_v2.verificar(teclado.nextDouble(), 
                                    new double[]{0, Double.POSITIVE_INFINITY}, 
                                    "Error! Intentelo de nuevo!");
                    // Proceso
                    area = (diagonalMayor * diagonalMenor) / 2;
                    // Salida
                    System.out.println("El area del rombo es: " + area);
                    break;
                case 5:
                    // Entrada
                    System.out.print("Ingrese la base del paralelogramo: ");
                    double baseParalelogramo = Utilidades_v2.verificar(teclado.nextDouble(), 
                                    new double[]{0, Double.POSITIVE_INFINITY}, 
                                    "Error! Intentelo de nuevo!");
                    System.out.print("Ingrese la altura del paralelogramo: ");
                    double alturaParalelogramo = Utilidades_v2.verificar(teclado.nextDouble(), 
                                    new double[]{0, Double.POSITIVE_INFINITY}, 
                                    "Error! Intentelo de nuevo!");
                    // Proceso
                    area = baseParalelogramo * alturaParalelogramo;
                    // Salida
                    System.out.println("El area del paralelogramo es: " + area);
                    break;
                case 6:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida, intentelo de nuevo!");
            }
            
            System.out.println("=============================================\n");
            
        } while(opcion != 6);
        
        teclado.close();
    }
}