package Clases;

/**
 * @author Moisés
 */
public class Alumno {
    // Atributos
    private int codigo;
    private String nombre;
    private String curso;
    private double[] notas;
    private double promedioFinal;
    private String estado;

    // Constructores
    public Alumno() {
    }
    
    public Alumno(int codigo, String nombre, String curso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.curso = curso;
        this.notas = new double[4]; // Inicializo el arreglo de notas
        this.promedioFinal = -1.0; // Inicializo el promedio Final
        this.estado = ""; // Inicializo el estado del alumno
    }

    // Métodos
    // Calcula el promedio final:
    public double calcularPromedioFinal() {
        this.promedioFinal = (0.25 * this.notas[0]) + (0.25 * this.notas[1]) + (0.20 * this.notas[2]) + (0.30 * this.notas[3]);
        estado();
        return this.promedioFinal;
    }

    // Determina el estado del alumno:
    public String estado() {
        if (promedioFinal >= 0 && promedioFinal < 6) {
            this.estado = "Pésimo";
        } else if (promedioFinal >= 6 && promedioFinal < 12) {
            this.estado = "Malo";
        } else if (promedioFinal >= 12 && promedioFinal < 15) {
            this.estado = "Regular";
        } else if (promedioFinal >= 15 && promedioFinal < 18) {
            this.estado = "Bueno";
        } else if (promedioFinal >= 18 && promedioFinal < 20) {
            this.estado = "Muy bueno";
        } else if (promedioFinal == 20) {
            this.estado = "Excelente";
        } else {
            System.out.println("\nPromedio Final inválido! -> " + this.promedioFinal);
            this.estado = "Estado no determinado";
        }
        return this.estado;
    }
    
    // Getters y setters
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    // Obtiene una nota específica:
    public double getNota(int numero_de_nota) {
        if (numero_de_nota >= 1 && numero_de_nota <= notas.length) {
            return this.notas[numero_de_nota-1];
        } else {
            System.out.println("Número de nota inválido!");
            return 0.0;
        }
    }
    
    // Establece una nota específica:
    public void setNota(int numero_de_nota, double valor_de_la_nota) {
        if (numero_de_nota >= 1 && numero_de_nota <= notas.length) {
            notas[numero_de_nota-1] = valor_de_la_nota;
        } else {
            System.out.println("Número de nota inválido! -> " + numero_de_nota);
        }
    }
    
    // Establece todas las notas:
    public void setNotas(double nota1, double nota2, double nota3, double nota4) {
        double[] nota = {nota1, nota2, nota3, nota4};
        for (int i=0; i < this.notas.length; i++) {
            if (nota[i]>=0 && nota[i]<=20) {
                this.notas[i] = nota[i];
            } else {
                this.notas[i] = 0.0;
            }
        }
        calcularPromedioFinal();
        estado();
    }

    public double getPromedioFinal() {
        return this.promedioFinal;
    }
    
    public String getEstado() {
        return this.estado;
    }
}