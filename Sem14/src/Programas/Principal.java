package Programas;

import Vistas.FrmPension;

/**
 *
 * @author Moisés
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciar el Formulario
        FrmPension ventana = new FrmPension();
        
        // Centrar la ventana en la pantalla
        ventana.setLocationRelativeTo(null);
        
        // Mostrar el Formulario
        ventana.setVisible(true);
    }
}
