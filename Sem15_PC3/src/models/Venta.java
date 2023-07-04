package models;

/**
 * @author Moisés
 */
public class Venta {
    private Prenda prenda;
    private int cantidad;
    
    public Venta() {}
    
    public Venta(Prenda prenda, int cantidad) {
        this.prenda = prenda;
        this.cantidad = cantidad;
    }
    
    public double calcularMontoVenta() {
        return prenda.getPrecioUnitario() * cantidad;
    }
    
    public double calcularDescuento() {
        double montoVenta = calcularMontoVenta();

        if (montoVenta > 1500.0) {
            montoVenta *= 0.20;
        } else if (montoVenta > 1000.0) {
            montoVenta *= 0.08;
        } else if (montoVenta > 500.0) {
            montoVenta *= 0.06;
        } else if (montoVenta > 100.0) {
            montoVenta *= 0.04;
        } else {
            montoVenta *= 0.02;
        }
        
        return montoVenta;
    }
    
    public double calcularMontoNeto() {
        return calcularMontoVenta() - calcularDescuento();
    }
    
    public double calcularIVA() {
        return calcularMontoNeto() * 0.18;
    }
    
    public double totalPagar() {
        return calcularMontoNeto() + calcularIVA();
    }
    
    public Prenda getPrenda() {
        return prenda;
    }
    
    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
