package programas;

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
        // ***** FORMULARIO *****
        // Instanciar el Formulario
        FrmVenta ventana = new FrmVenta();
        
        // Centrar la ventana en la pantalla
        ventana.setLocationRelativeTo(null);
        
        // Mostrar el Formulario
        ventana.setVisible(true);
    }
}
