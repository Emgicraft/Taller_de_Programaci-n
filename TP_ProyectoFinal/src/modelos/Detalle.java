package modelos;

/**
 *
 * @author Moisés
 */
public class Detalle {
    private int id;
    private int id_venta;
    private int id_producto;
    private int cantidad;

    public Detalle() {
    }

    public Detalle(int id, int id_venta, int id_producto, int cantidad) {
        this.id = id;
        this.id_venta = id_venta;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
    }
    
    /**
     * @return Devuelve precioProducto*cantidad
     */
    public double subTotal(){
        return Producto.buscarPorID(id_producto).getPrecio() * cantidad;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getID_Venta() {
        return id_venta;
    }

    public void setID_Venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getID_Producto() {
        return id_producto;
    }

    public void setID_Producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
