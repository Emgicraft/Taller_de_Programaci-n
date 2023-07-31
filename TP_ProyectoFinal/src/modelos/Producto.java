package modelos;

import dbConexion.AccessDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    @SuppressWarnings("ConvertToTryWithResources")
    public static Producto buscarPorID(int idProducto) {
        Producto productoBuscado;
        try {
            Connection cn = AccessDB.conectar("C:\\Users\\Moisés\\Documents\\Access\\dbSistemaVentas.accdb");
            
            String consultaSql = "SELECT Descripción, Precio FROM Producto WHERE ID = ?";
            
            PreparedStatement statement = cn.prepareStatement(consultaSql);
            statement.setInt(1, idProducto);
            
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                productoBuscado = new Producto(idProducto, 
                                        resultSet.getString("Descripción"), 
                                        Double.parseDouble(resultSet.getString("Precio")));
            } else {
                productoBuscado = new Producto(-1, "Producto no encontrado! Revisar ID!", 0.00);
            }
            // Cerrar los recursos
            resultSet.close();
            statement.close();
            cn.close();
        } catch (SQLException e) {
            productoBuscado = new Producto(-1, "Base de datos <- - - Error de conexión!", 0.00);
        }
        return productoBuscado;
    }

    public int getID() {
        return id; 
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
