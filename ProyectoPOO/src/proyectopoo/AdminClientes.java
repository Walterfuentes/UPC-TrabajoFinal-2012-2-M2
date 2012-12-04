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
    private AdminProspecto prospectos;
    private int aumentaNumeroProspecto;

    public AdminClientes() {
       
        AlmacenaClientes = new ArrayList<Clientes>();
        this.aumentaNumeroProspecto = 0;
        prospectos = new AdminProspecto();
    }

    
    public String GeneraSecuencia(){
        return String.format("C" + "%04d", ++aumentaNumeroProspecto);
    }
    
    public String IngresaClientesSinProspecto(String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni, String telefonofijo, String celular, String fechaIngreso, int transacciones) {
        
        String codigoCliente = "nada";
        if (ValidaCamposObligartorios(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni).equalsIgnoreCase("OK")){
        codigoCliente = GeneraSecuencia();
        Clientes nueva = new Clientes(codigoCliente, nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso, transacciones);
        AlmacenaClientes.add(nueva);
        }else{
            codigoCliente = ValidaCamposObligartorios(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni);
        }
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
                System.out.println("nombre Encontrado " + aux.getNombre() + " " + aux.getApellidoPaterno());
                return aux;
            }
        }
        System.out.println("No se encontraron Resgistros para los filtros ingresados");
        System.out.println("Desea ingresar un nuevo prospecto");
        
        return null;   
    }
    
    public int cantidaddeClientes(){
        
        return AlmacenaClientes.size();
    }
    
    public String ValidaCamposObligartorios(String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni){
        
        String Respuesta = "OK";

        if (nombre == null || nombre.isEmpty()) {
            Respuesta = "Falta Nombre";
        }

        if (ApellidoPaterno == null || ApellidoPaterno.isEmpty()) {
            Respuesta = "Falta Apellido Paterno";
        }

        if (ApellidoMaterno == null || ApellidoMaterno.isEmpty()) {
            Respuesta = "Falta Apellido Materno";
        }

        if (Dni == null || Dni.isEmpty()) {
            Respuesta = "Falta DNI";
        }

        if (Correo == null || Correo.isEmpty()) {
            Respuesta = "Falta Correo";
        }
        
        return Respuesta;       
    }
    
    public void eliminarClientes(String dato){
       Clientes aux = BuscaCliente(dato);
       if(aux.getTransacciones() == 0){
            AlmacenaClientes.remove(aux);
        }else{
           System.out.println("No se Puede Eliminar Cliente Tiene Transacciones");
}
}
    
    
    
    public String DarBajaaCliente(String Dato){
        
        String Respuesta;
        Clientes aux = BuscaCliente(Dato);
        if(aux.getTransacciones()==0){
          Respuesta =  AgregaProspecto(aux.getNombre(), aux.getApellidoPaterno(), aux.getApellidoMaterno(), aux.getCorreo(), aux.getDni(), aux.getTelefonofijo(), aux.getCelular(), aux.getFechaIngreso());
          eliminarClientes(Dato);
        }else{
             
             Respuesta = "No se Puede Dar de Baja Cliente Tiene Transacciones";
        }
        return Respuesta;
    }
    
    
    public Prospecto BusquedaProspectos (String Dato){
         return prospectos.buscaProspectos(Dato);
        
    }
    
    public String AgregaProspecto(String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni, String telefonofijo, String celular, String fechaIngreso){
        return prospectos.agregarProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso);
    }

}


class ClienteFechaContactoComparator implements Comparator<Clientes> {

    @Override
    public int compare(Clientes uno, Clientes dos) {
        return uno.getFechaIngreso().compareTo(dos.getFechaIngreso());
    }
    
   
    
    }