package Clases;

/**
 *
 * @author Moisés
 */
public class Pension {
    int categoria;
    double promedio;
    
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
            default: p = 400.0;
        }
        return p;
    }
    
    public double calcularDescuento() {
        double desc, prom = getPromedio();
        if (prom < 14.0) desc = 0;
        else if (prom < 15.0) desc = 0.1;
        else desc = 0;
        return desc;
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
