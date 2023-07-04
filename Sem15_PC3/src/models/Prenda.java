package models;

import java.util.ArrayList;

/**
 * @author Moisés
 */
public class Prenda {
    private int codigo;
    private String descripcion;
    private double precioUnitario;
    
    public Prenda() {}
    
    public Prenda(int codigo, String descripcion, double precioUnitario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }
    
    public Prenda buscarPorCodigo(int codBuscado) {
        // ***** Data de Prendas *****
        // Instanciar 6 prendas
        Prenda p1 = new Prenda(10, "Pantalones de lana", 45.0);
        Prenda p2 = new Prenda(20, "Suéter de casimir", 100.0);
        Prenda p3 = new Prenda(30, "Blusa de seda", 14.0);
        Prenda p4 = new Prenda(40, "Camisola de seda", 10.0);
        Prenda p5 = new Prenda(50, "Falda recta", 40.0);
        Prenda p6 = new Prenda(60, "Saco de lana", 120.0);
        
        // Instanciar un ArrayList de Prendas
        ArrayList<Prenda> listaPrendas = new ArrayList<>();
        
        // Se agregan las prendas a la lista
        listaPrendas.add(p1);
        listaPrendas.add(p2);
        listaPrendas.add(p3);
        listaPrendas.add(p4);
        listaPrendas.add(p5);
        listaPrendas.add(p6);
        
        // Búsqueda del producto
        // Instanciar
        Prenda prendaBuscada = new Prenda(-1, "Prenda no existente!", 0.0);
        // Busca el producto por su código
        for (Prenda p : listaPrendas) {
            if (p.getCodigo() == codBuscado) {
                prendaBuscada = p; break;
            }
        }
        
        return prendaBuscada;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
    
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
