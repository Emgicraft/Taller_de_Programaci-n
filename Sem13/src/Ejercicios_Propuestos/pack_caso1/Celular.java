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
    public double costo_de_consumo() {
        return this.segundosConsumidos * this.precioPorSegundo;
    }
    
    public double IGV() {
        return 0.18 * costo_de_consumo();
    }
    
    public double total_a_pagar() {
        return costo_de_consumo() + IGV();
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
