package modelos;

import java.util.ArrayList;

/**
 *
 * @author Magh
 */
public class Producto {
    private int id;
    private String descripcion;
    private double precio;

    public Producto() {
    }

    public Producto(int id, String descripcion, double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio; 
    }
    
    /**
     * Busca al producto por su ID y retorna el objeto Producto encontrado.
     * 
     * @param idProducto del Producto a buscar.
     * @return El objeto Producto encontrado.
     */
    public static Producto buscarPorID(int idProducto) {
        // ***** DATA PRODUCTOS *****
        // Instanciar 20 productos
        Producto p1 = new Producto(100, "Relé", 2.50);
        Producto p2 = new Producto(101, "LED", 1.50);
        Producto p3 = new Producto(102, "Microcontrolador ATMega", 5.75);
        Producto p4 = new Producto(103, "Arduino UNO", 35.99);
        Producto p5 = new Producto(104, "Raspberry Pi 3", 252.80);
        Producto p6 = new Producto(105, "Sensor de temperatura", 8.90);
        Producto p7 = new Producto(106, "Pantalla LCD", 19.99);
        Producto p8 = new Producto(107, "Módulo Bluetooth", 16.50);
        Producto p9 = new Producto(108, "Motor paso a paso", 12.25);
        Producto p10 = new Producto(109, "Placa de desarrollo", 47.60);
        Producto p11 = new Producto(110, "Sensor de movimiento", 14.75);
        Producto p12 = new Producto(111, "Cámara infrarroja", 85.99);
        Producto p13 = new Producto(112, "Batería recargable", 11.20);
        Producto p14 = new Producto(113, "Cable jumper", 1.50);
        Producto p15 = new Producto(114, "Tarjeta SD", 9.99);
        Producto p16 = new Producto(115, "Protoboard", 4.75);
        Producto p17 = new Producto(116, "Fuente de alimentación", 228.50);
        Producto p18 = new Producto(117, "Sensor de luz", 7.80);
        Producto p19 = new Producto(118, "Botón pulsador", 2.25);
        Producto p20 = new Producto(119, "Caja para proyectos", 116.60);
        // Instanciar un ArrayList de Clientes
        ArrayList<Producto> dataProductos = new ArrayList<>();
        // Se agregan los productos a la lista
        dataProductos.add(p1);
        dataProductos.add(p2);
        dataProductos.add(p3);
        dataProductos.add(p4);
        dataProductos.add(p5);
        dataProductos.add(p6);
        dataProductos.add(p7);
        dataProductos.add(p8);
        dataProductos.add(p9);
        dataProductos.add(p10);
        dataProductos.add(p11);
        dataProductos.add(p12);
        dataProductos.add(p13);
        dataProductos.add(p14);
        dataProductos.add(p15);
        dataProductos.add(p16);
        dataProductos.add(p17);
        dataProductos.add(p18);
        dataProductos.add(p19);
        dataProductos.add(p20);
        
        // ***** BUSCA AL PRODUCTO *****
        Producto productoBuscado = new Producto(-1, "Producto no existente!", 0.0);
        for (Producto p : dataProductos) {
            if (p.getID() == idProducto) {
                productoBuscado = p; break;
            }
        }
        return productoBuscado;
    }

    public int getID() {
        return id; 
    } 

    public void setID(int id) { 
        this.id = id; 
    } 

    public String getDescripcion() { 
        return descripcion; 
    } 

    public void setDescripcion(String descripcion) { 
        this.descripcion = descripcion; 
    } 

    public double getPrecio() { 
        return precio; 
    } 

    public void setPrecio(double precio) { 
        this.precio = precio; 
    }
}
