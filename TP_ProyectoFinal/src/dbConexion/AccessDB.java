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
    
    public static Connection conectar(String rutaDataBase) {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:ucanaccess://" + rutaDataBase);
            System.out.println("Access: Conexión exitosa.");
        } catch (HeadlessException | SQLException e) {
            Logger.getLogger(AccessDB.class.getName()).log(Level.SEVERE, null, e);
        }
        return con;
    }
}
