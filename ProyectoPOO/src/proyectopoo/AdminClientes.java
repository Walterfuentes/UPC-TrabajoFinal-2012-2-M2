/*
 Historia Clientes Realizado por Walter Fuentes
 * 
 */
package proyectopoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author walterfuentes
 */
public class AdminClientes {

    private ArrayList<Clientes> AlmacenaClientes;
    private int transacciones;
    private int aumentaNumeroProspecto;

    public AdminClientes() {
        this.transacciones = 0;
        AlmacenaClientes = new ArrayList<Clientes>();
        this.aumentaNumeroProspecto = 0;
    }

    
    public String GeneraSecuencia(){
        return String.format("C" + "%04d", ++aumentaNumeroProspecto);
    }
    
    public String IngresaClientesSinProspecto(String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni, String telefonofijo, String celular, String fechaIngreso, int transacciones) {

        String codigoCliente = GeneraSecuencia();
        Clientes nueva = new Clientes(codigoCliente, nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso, transacciones);
        
        return codigoCliente;
    }

    public Boolean ImprimelistadeClientes() {
        Collections.sort(AlmacenaClientes, new ClienteFechaContactoComparator());
        for (Clientes aux : AlmacenaClientes) {
            System.out.println(aux.getNombre());
        }
        return true;
    }

    public Clientes BuscaCliente(String Dato) { //Ingresar DNI, nombre o Apellido
        for (Clientes aux : AlmacenaClientes) {
            if ((Dato.equalsIgnoreCase(aux.getNombre())) || (Dato.equalsIgnoreCase(aux.getApellidoPaterno())) || (Dato.equalsIgnoreCase(aux.getDni()))) {
                return aux;
            }
        }
        return null;
    }
    
    public int cantidaddeClientes(){
        return 0;
    }
    
    public void eliminarClientes(String dato){
        
    }
    
    public String DarBajaaCliente(String nombre){
        return null;
    }

}

class ClienteFechaContactoComparator implements Comparator<Clientes> {

    @Override
    public int compare(Clientes uno, Clientes dos) {
        return uno.getFechaIngreso().compareTo(dos.getFechaIngreso());
    }
    
   
    
    }