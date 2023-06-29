package Clases;

/**
 *
 * @author Magh
 * @version 1.0
 */
public class Circunferencia {
    private double radio;
    public static final double PI = Math.PI;
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double area() {
        return PI * radio * radio;
    }

    public double perimetro() {
        return 2 * PI * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
