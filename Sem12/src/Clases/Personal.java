package Clases;

/**
 * @author Moisés
 */
public class Personal {
    // Atributos
    private int codigo;
    private String nombre;
    private String correo;
    private String dni;
    private String cargo;
    private double sueldoBasico;
    private double descuentoAFP;
    private double sueldoNeto;
    
    // Constructores
    public Personal() {
    }
    
    public Personal(int codigo, String nombre, String correo, String dni, String cargo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
        this.dni = dni;
        this.cargo = cargo;
        calcularSueldoBasico();
        calcularDescuentoAFP();
        calcularSueldoNeto();
    }
    
    // Métodos
    // Calcula el sueldo básico según el cargo:
    private void calcularSueldoBasico() {
        switch (this.cargo.toLowerCase()) {
            case "jefe":
                this.sueldoBasico = 5000.00; break;
            case "supervisor":
                this.sueldoBasico = 3000.00; break;
            case "seguridad":
                this.sueldoBasico = 2000.00; break;
            case "teleoperador":
                this.sueldoBasico = 1800.00; break;
            case "almacenero":
                this.sueldoBasico = 1500.00; break;
            default:
                this.sueldoBasico = 0.00; break;
        }
    }
    
    //Calcula el descuento de AFP:
    private void calcularDescuentoAFP() {
        this.descuentoAFP = this.sueldoBasico * 0.0325;
    }
    
    // Calcula el sueldo neto
    private void calcularSueldoNeto() {
        this.sueldoNeto = this.sueldoBasico - this.descuentoAFP;
    }
    
    // Getters y setters
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDNI() {
        return this.dni;
    }

    public void setDNI(String dni) {
        this.dni = dni;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
        calcularSueldoBasico();
        calcularDescuentoAFP();
        calcularSueldoNeto();
    }

    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    public double getDescuentoAFP() {
        return this.descuentoAFP;
    }

    public double getSueldoNeto() {
        return this.sueldoNeto;
    }
}