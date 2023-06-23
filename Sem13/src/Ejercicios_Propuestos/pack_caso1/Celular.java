package Ejercicios_Propuestos.pack_caso1;

/**
 *
 * @author Moisés
 */
public class Celular {
    // Atributos
    public int numero;
    public String usuario;
    public int segundosConsumidos;
    public double precioPorSegundo;
    
    // Constructor
    public Celular() {
    }
    
    public Celular(int numero, String usuario, int segundosConsumidos, double precioPorSegundo) {
        this.numero = numero;
        this.usuario = usuario;
        this.segundosConsumidos = segundosConsumidos;
        this.precioPorSegundo = precioPorSegundo;
    }
    
    // Métodos
    /**
     * Función redondear, recibe el numero a aproximar 
     * y la cantidad de decimales a aproximar.
     * @param numero valor a redondear
     * @param cntDecimales número de decimales a redondear
     * @return retorna el número redondeado
     */
    private double redondear(double numero, int cntDecimales) {
        return Math.round(numero*Math.pow(10, cntDecimales))/Math.pow(10, cntDecimales);
    }
    
    public double costo_de_consumo() {
        return redondear(this.segundosConsumidos * this.precioPorSegundo, 2);
    }
    
    public double IGV() {
        return redondear(0.18 * costo_de_consumo(), 2);
    }
    
    public double total_a_pagar() {
        return redondear(costo_de_consumo() + IGV(), 2);
    }
    
    // Getters y Setters
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getSegundosConsumidos() {
        return this.segundosConsumidos;
    }

    public void setSegundosConsumidos(int segundosConsumidos) {
        this.segundosConsumidos = segundosConsumidos;
    }

    public double getPrecioPorSegundo() {
        return this.precioPorSegundo;
    }

    public void setPrecioPorSegundo(double precioPorSegundo) {
        this.precioPorSegundo = precioPorSegundo;
    }
}
