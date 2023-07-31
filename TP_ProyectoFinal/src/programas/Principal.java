package programas;

import dbConexion.AccessDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vistas.FrmVenta;

/**
 *
 * @author Magh
 */
public class Principal {
    /**
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        try {
            Connection cn = AccessDB.conectar("C:\\Users\\Moisés\\Documents\\Access\\dbSistemaVentas.accdb");
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // ***** FORMULARIO *****
        // Instanciar el Formulario
        FrmVenta ventana = new FrmVenta();
        
        // Centrar la ventana en la pantalla
        ventana.setLocationRelativeTo(null);
        
        // Mostrar el Formulario
        ventana.setVisible(true);
    }
}
