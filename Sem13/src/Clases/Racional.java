package Clases;

/**
 *
 * @author Magh
 * @version 1.2
 */
public class Racional {
    // Atributos
    private int numerador;
    private int denominador;
    
    // Constructores
    public Racional() {
    }
    
    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            System.out.println("El denominador no puede ser cero!");
            this.denominador = 1;
        }
    }
    
    // Métodos
    public Racional sumar(Racional Q2){
        int nuevoNum = (this.getNumerador() * Q2.getDenominador()) + (Q2.getNumerador() * this.getDenominador());
        int nuevoDen = this.getDenominador() * Q2.getDenominador();
        Racional nuevoR = new Racional(nuevoNum, nuevoDen);
        nuevoR.simplificar();
        return nuevoR;
    }
    
    public Racional restar(Racional Q2) {
        int nuevoNum = (this.getNumerador() * Q2.getDenominador()) - (Q2.getNumerador() * this.getDenominador());
        int nuevoDen = this.getDenominador() * Q2.getDenominador();
        Racional nuevoR = new Racional(nuevoNum, nuevoDen);
        nuevoR.simplificar();
        return nuevoR;
    }

    public Racional multiplicar(Racional Q2) {
        int nuevoNum = this.getNumerador() * Q2.getNumerador();
        int nuevoDen = this.getDenominador() * Q2.getDenominador();
        Racional nuevoR = new Racional(nuevoNum, nuevoDen);
        nuevoR.simplificar();
        return nuevoR;
    }

    public Racional dividir(Racional Q2) {
        int nuevoNum = this.getNumerador() * Q2.getDenominador();
        int nuevoDen = this.getDenominador() * Q2.getNumerador();
        Racional nuevoR = new Racional(nuevoNum, nuevoDen);
        nuevoR.simplificar();
        return nuevoR;
    }
    
    public int comparar(Racional Q2) {
        int resultado = (this.getNumerador() * Q2.getDenominador()) - (Q2.getNumerador() * this.getDenominador());
        if (resultado > 0) {
            return 1; // El primero es el mayor
        } else if (resultado < 0) {
            return -1; // El segundo es el mayor
        } else {
            return 0; // Ambos son iguales
        }
    }
    
    public int getNumerador() {
        return numerador;
    }
    
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    
    public int getDenominador() {
        return denominador;
    }
    
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public void simplificar() {
        int mcd = obtenerMCD(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
    }

    private int obtenerMCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // Método toString para representación en cadena
    @Override
    public String toString() {
        return this.getNumerador() + "/" + this.getDenominador();
    }
}
