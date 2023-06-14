package s10;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Moisés Garcia Hidalgo
 * @author Francois Ibarra Yzaguirre
 * @author Roger Saavedra Ladines
 * @author Kevin Velazco Justo
 */
public class PC2 {
    // Leemos datos de entrada:
    private static void leer(int[] N1, int[] N2, int[] N3, int[] N4){
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        
        for(int i = 0; i < N1.length; i++){
            //System.out.println("Persona["+(i+1)+"]");
            
            //(Vmx-Vmin+1)+Vmin
            
            //Edad
            N1[i]=aleatorio.nextInt(90-15+1)+15;
            
            //Sexo
            N2[i]=aleatorio.nextInt(2-1+1)+1;
            
            // TP
            N3[i]=aleatorio.nextInt(3-1+1)+1;
            
            // RP
            N4[i]=aleatorio.nextInt(2-1+1)+1;
            
            //System.out.println("==============================");
        }
    }
    
    //¿Cuál es el porcentaje de pacientes entre 18 y 40 años que se han realizado una prueba?
    public static double calcularPorcentajePacientesEdades(int[] edades, int[] tipoPrueba){
        int totalPacientes = edades.length;
        int pacientesConPrueba = 0;
        for (int i = 0; i < totalPacientes; i++) {
            int edad = edades[i];
            if (edad >= 18 && edad <= 40) {
                pacientesConPrueba++;
            }
        }
        return (double) pacientesConPrueba / totalPacientes * 100.0;
    }

    //¿Cuál es el promedio de edad de los pacientes que se hicieron una prueba de antígenos?
    public static double calcularPromedioEdadPacientes(int[] edades, int[] tipoPrueba) {
        int totalPacientes = edades.length;
        int sumEdades = 0;
        int numPacientes = 0;

        for (int i = 0; i < totalPacientes; i++) {
            if (tipoPrueba[i]==2) {
                sumEdades += edades[i];
                numPacientes++;
            }
        }
        if (numPacientes == 0) {
            return 0; // No hay pacientes con prueba de antígenos
        }
        return (double) sumEdades / numPacientes;
    }
    
    //¿Cuál es el tipo o tipos de prueba que tienen la mayor frecuencia?
    public static String[] obtenerTiposPruebaFrecuentes(int[] tipoPruebas) {
        int[] frecuencias = new int[3];
        String[] tiposMasFrec = new String[3];
        int frecuenciaMax = 0;
        
        // Contamos el total por tipo de prueba
        for (int i = 0; i < tipoPruebas.length; i++) {
            if (tipoPruebas[i]==1) {
                frecuencias[0]++;
            }
            else if (tipoPruebas[i]==2) {
                frecuencias[1]++;
            }
            else if (tipoPruebas[i]==3) {
                frecuencias[2]++;
            }
        }

        // Calculamos la frecuencia maxima
        for (int i = 0; i < frecuencias.length; i++) {
            if (frecuencias[i] > frecuenciaMax) {
                frecuenciaMax = frecuencias[i];
            }
        }
        
        if (frecuencias[1]==frecuenciaMax) {
            tiposMasFrec[0] = "PCR";
        }
        else if (frecuencias[2]==frecuenciaMax) {
            tiposMasFrec[0] = "Antigenos";
        }
        else if (frecuencias[3]==frecuenciaMax) {
            tiposMasFrec[0] = "Serologica";
        }
        
        
        return tiposMasFrec;
    }
    
    private static void imprimirArregloCad(String[] N){
        for (int i = 0; i < N.length; i++){
            System.out.println("Prueba "+N[i]);
        }
    }
    
    
    //¿Cuál es la edad del varón más joven que se ha realizado una prueba PCR y dio como resultado negativo?
    public static int calcularEdadVaronMasJoven(int[] edades, int[] sexo, int[] tipoPrueba, int[] resultadoPrueba) {
        int edadVaronMasJoven = Integer.MAX_VALUE;
        boolean encontrado = false;

        for (int i = 0; i < edades.length; i++) {
            if (edades[i] < edadVaronMasJoven && sexo[i]==2 && tipoPrueba[i]==1 && resultadoPrueba[i]==2) {
                edadVaronMasJoven = edades[i];
                encontrado = true;
            }
        }
        if (!encontrado) {
            return 0; // No se encontró un varón con PCR negativo
        }

        return edadVaronMasJoven;
    }
    
    public static void main(String[] args) {
        int numPacientes; int[] intvlNumPac = {0, Integer.MAX_VALUE};
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el número de pacientes: ");
        numPacientes = UtilidadesV2.verificar(teclado.nextInt(), 
                                          intvlNumPac, 
                                        "Entrada erronea!");
        
        int[] N1 = new int[numPacientes]; //Edad
        int[] N2 = new int[numPacientes]; //Sexo
        int[] N3 = new int[numPacientes]; //TP
        int[] N4 = new int[numPacientes]; //RP

        // Lectura de datos
        leer(N1, N2, N3, N4); //Edad, Sexo, TP, RP
        
        // Proceso
        // Pregunta 1
        double porcEdades = calcularPorcentajePacientesEdades(N1, N3);
        porcEdades = UtilidadesV2.redondear(porcEdades, 4);
        
        // Pregunta 2
        double promEdad = calcularPromedioEdadPacientes(N1, N3);
        
        // Pregunta 3
        String[] frecTP = obtenerTiposPruebaFrecuentes(N3);
        
        // Pregunta 4
        int edadMasJoven = calcularEdadVaronMasJoven(N1, N2, N3, N4);
        
        
        // Salida
        // Pregunta 1
        System.out.println("El porcentaje de pacientes entre 18 y 40 años que se "
                + "han realizado una prueba son: "
                + porcEdades + "%");
        
        // Pregunta 2
        System.out.println("El promedio de edad de los pacientes que se hicieron "
                + "una prueba de antígeno son: "
                + promEdad);
        
        // Pregunta 3
        System.out.println("El tipo o tipos de prueba que tienen la mayor frecuencia es o son:");
        imprimirArregloCad(frecTP);
        
        // Pregunta 4
        System.out.println("La edad del varón más joven que se ha realizado una "
                + "prueba PCR y dio como resultado negativo es: "
                + edadMasJoven);
    }
}