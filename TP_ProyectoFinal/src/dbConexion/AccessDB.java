package dbConexion;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Magh
 */
public class AccessDB {
    // Constructor
    public AccessDB() {
    }
    
    /**
     * Devuelve el objeto Connection en caso de establecerse la conexión, 
     * de lo contrario, será nulo.
     * 
     * @param rutaDataBase es la ubicación del archivo Access.
     * @return Instancia de conexión.
     */
    public static Connection conectar(String rutaDataBase) {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:ucanaccess://" + rutaDataBase);
            System.out.println("Access: Conexión exitosa.");
        } catch (HeadlessException | SQLException e) {
            System.out.println("Access: Error de conexión!");
        }
        return con;
    }
}
