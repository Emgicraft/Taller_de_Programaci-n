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
public class Cliente {
    private int id;
    private String nombre;
    private String documento;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String documento) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
    }
    
    /**
     * Busca al cliente por su ID y retorna el objeto Cliente encontrado.
     * 
     * @param idCliente del Cliente a buscar.
     * @return El objeto Cliente encontrado.
     */
    @SuppressWarnings("ConvertToTryWithResources")
    public static Cliente buscarPorID(int idCliente) {
        Cliente clienteBuscado;
        try {
            Connection cn = AccessDB.conectar("C:\\Users\\Moisés\\Documents\\Access\\dbSistemaVentas.accdb");
            // Consulta SQL para obtener el nombre y documento del cliente por su ID
            String consultaSql = "SELECT Nombre, Documento FROM Cliente WHERE ID = ?";
            // Crear un objeto PreparedStatement para evitar problemas de seguridad y rendimiento
            PreparedStatement statement = cn.prepareStatement(consultaSql);
            statement.setInt(1, idCliente); // El 1 es por el número y posición de ? en la consulta
            // Ejecutar la consulta y obtener los resultados
            ResultSet resultSet = statement.executeQuery();
            // Verificar si se encontraron resultados y obtener el nombre del cliente
            if (resultSet.next()) {
                clienteBuscado = new Cliente(idCliente, 
                                        resultSet.getString("Nombre"), 
                                        resultSet.getString("Documento"));
            } else {
                clienteBuscado = new Cliente(-1, "Cliente no encontrado!", "Revisar ID!");
            }
            // Cerrar los recursos
            resultSet.close();
            statement.close();
            cn.close();
        } catch (SQLException e) {
            clienteBuscado = new Cliente(-1, "Base de datos <-", "- Error de conexión!");
        }
        return clienteBuscado;
    }
    
    public int getID() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
