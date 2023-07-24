package modelos;

import java.util.ArrayList;

/**
 *
 * @author Moisés
 */
public class Cliente {
    private int id;
    private String nombre;
    private String documento;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String documento) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
    }
    
    /**
     * Busca al cliente por su ID y retorna el objeto Cliente encontrado.
     * 
     * @param idCliente del Cliente a buscar.
     * @return El objeto Cliente encontrado.
     */
    public static Cliente buscarPorID(int idCliente) {
        // ***** DATA CLIENTES *****
        // Instanciar 20 Clientes
        Cliente c1 = new Cliente(10101, "Juan Carlos Pérez Gómez", "73335369");
        Cliente c2 = new Cliente(10102, "María Fernández López", "73598741");
        Cliente c3 = new Cliente(10103, "Pedro Ramírez González", "76845213");
        Cliente c4 = new Cliente(10104, "Luisa Martínez García", "71236548");
        Cliente c5 = new Cliente(10105, "Carlos Rodríguez Sánchez", "72369854");
        Cliente c6 = new Cliente(10106, "Ana Soto Vargas", "74321589");
        Cliente c7 = new Cliente(10107, "Javier Torres Mendoza", "72986543");
        Cliente c8 = new Cliente(10108, "Patricia Díaz Castro", "74123698");
        Cliente c9 = new Cliente(10109, "Roberto Romero Herrera", "76458921");
        Cliente c10 = new Cliente(10110, "Laura Gómez Morales", "75219834");
        Cliente c11 = new Cliente(20101, "Innovatech Solutions E.I.R.L.", "20454713061");
        Cliente c12 = new Cliente(20102, "OpenAI Corporation", "20234598072");
        Cliente c13 = new Cliente(20103, "Acme Industries", "20123456789");
        Cliente c14 = new Cliente(20104, "Tech Solutions Ltda.", "20198765432");
        Cliente c15 = new Cliente(20105, "Global Systems S.A.C.", "20321654987");
        Cliente c16 = new Cliente(20106, "Innovative Products Inc.", "20547896321");
        Cliente c17 = new Cliente(20107, "Enterprise Solutions Ltd.", "20321478596");
        Cliente c18 = new Cliente(20108, "TechnoCorp Group", "20219874563");
        Cliente c19 = new Cliente(20109, "Smart Systems S.R.L.", "20187459632");
        Cliente c20 = new Cliente(20110, "FutureTech Enterprises", "20541796328");
        // Instanciar un ArrayList de Clientes
        ArrayList<Cliente> dataClientes = new ArrayList<>();
        // Se agregan los clientes a la lista
        dataClientes.add(c1);
        dataClientes.add(c2);
        dataClientes.add(c3);
        dataClientes.add(c4);
        dataClientes.add(c5);
        dataClientes.add(c6);
        dataClientes.add(c7);
        dataClientes.add(c8);
        dataClientes.add(c9);
        dataClientes.add(c10);
        dataClientes.add(c11);
        dataClientes.add(c12);
        dataClientes.add(c13);
        dataClientes.add(c14);
        dataClientes.add(c15);
        dataClientes.add(c16);
        dataClientes.add(c17);
        dataClientes.add(c18);
        dataClientes.add(c19);
        dataClientes.add(c20);
        
        // ***** BUSCA AL CLIENTE *****
        Cliente clienteBuscado = new Cliente(-1, "Cliente no existente!", "abcdefgh");
        for (Cliente c : dataClientes) {
            if (c.getID() == idCliente) {
                clienteBuscado = c; break;
            }
        }
        return clienteBuscado;
    }
    
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
