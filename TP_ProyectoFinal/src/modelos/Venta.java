package modelos;

import java.time.LocalDate;

/**
 *
 * @author Magh
 */
public class Venta {
    private int id;
    private LocalDate fecha;
    private int id_cliente;

    public Venta() {
    }

    public Venta(int id, LocalDate fecha, int id_cliente) {
        this.id = id;
        this.fecha = fecha;
        this.id_cliente = id_cliente;
    }

    public int getID() {
        return id;
    }
    
    public int setID() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getID_Cliente() {
        return id_cliente;
    }
    
    public void setID_Cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
}
