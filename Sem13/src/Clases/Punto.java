package Clases;

/**
 * La clase Punto representa un punto en un plano bidimensional,
 * con coordenadas x e y.
 *
 * @author Magh
 * @version 1.0
 */
public class Punto {
    // Atributos
    private double x;
    private double y;
    
    // Constructores
    /**
     * Crea un nuevo objeto Punto.
     */
    public Punto() {
    }
    
    /**
     * Crea un nuevo objeto Punto con las coordenadas especificadas.
     * 
     * @param x La coordenada X del punto.
     * @param y La coordenada Y del punto.
     */
    public Punto(int x, int y) {
        this.x = (double) x;
        this.y = (double) y;
    }
    
    /**
     * Crea un nuevo objeto Punto con las coordenadas especificadas.
     * 
     * @param x La coordenada X del punto.
     * @param y La coordenada Y del punto.
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Métodos
    /**
     * Calcula la distancia entre el punto actual y otro punto dado.
     * 
     * @param p2 El punto hasta el cual se calculará la distancia.
     * @return La distancia entre el punto actual y el punto dado.
     */
    public double calcularDistanciaHastaPunto(Punto p2) {
        return Math.sqrt(Math.pow(this.x - p2.getX(), 2) + Math.pow(this.y - p2.getY(), 2));
    }
    
    // Getters y Setters
    /**
     * @return La coordenada x
     */
    public double getX() {
        return this.x;
    }

    /**
     * @param x Coordenada x a fijar
     */
    public void setX(int x) {
        this.x = (double) x;
    }
    
    /**
     * @param x Coordenada x a fijar
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return La coordenada y
     */
    public double getY() {
        return this.y;
    }
    
    /**
     * @param y Coordenada y a fijar
     */
    public void setY(int y) {
        this.y = (double) y;
    }

    /**
     * @param y Coordenada y a fijar
     */
    public void setY(double y) {
        this.y = y;
    }
}
