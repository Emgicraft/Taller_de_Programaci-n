package Clases;

/**
 *
 * @author Moisés
 */
public class Pension {
    private int categoria;
    private double promedio;
    
    public Pension() {}
    
    public Pension(int categoria, double promedio) {
        this.categoria = categoria;
        this.promedio = promedio;
    }
    
    public double determinarPension() {
        double p;
        switch (getCategoria()) {
            case 0: p = 550.0; break;
            case 1: p = 500.0; break;
            case 2: p = 460.0; break;
            case 3: p = 400.0; break;
            default:
                p = -1.0;
                System.out.println("Categoria no encontrada!");
        }
        return p;
    }
    
    public double calcularDescuento() {
        double desc, prom = getPromedio(), pension = determinarPension();
        if (prom < 14.0) desc = 0.0;
        else if (prom < 16.0) desc = 0.10*pension;
        else if (prom < 18.0) desc = 0.12*pension;
        else if (prom < 20.0) desc = 0.15*pension;
        else {desc = -1.0; System.out.println("Error en promedio!");}
        return desc;
    }
    
    public double calcularPension() {
        return determinarPension() - calcularDescuento();
    }

    public int getCategoria() {
        return this.categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public double getPromedio() {
        return this.promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
