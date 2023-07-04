package programs;

import views.FrmVenta;

/**
 * @author Moisés
 */
public class Principal {
    public static void main(String[] args) {
        // Instanciar el Formulario
        FrmVenta ventana = new FrmVenta();
        
        // Centrar la ventana en la pantalla
        ventana.setLocationRelativeTo(null);
        
        // Mostrar el Formulario
        ventana.setVisible(true);
    }
}
