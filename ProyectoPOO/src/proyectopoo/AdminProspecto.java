/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author walterfuentes
 */
public class AdminProspecto {
    
    
    
    ArrayList<Clientes> AlmacenaProspectos;
    private int aumentaNumeroProspecto;

    public AdminProspecto() {
        AlmacenaProspectos = new ArrayList<Clientes>();
        this.aumentaNumeroProspecto = 0;
    }

    public ArrayList<Clientes> getAlmacenaProspectos() {
        return AlmacenaProspectos;
    }
     
    public String GeneraSecuencia(){
        return String.format("P" + "%04d", ++aumentaNumeroProspecto);
    }
    
    
    public String agregarProspecto(String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni, String telefonofijo, String celular, String fechaIngreso) 
             {
            
            String codigoProspecto = "nada";

            if (validarDatos(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni).equalsIgnoreCase("OK")){
            codigoProspecto = GeneraSecuencia();
            Clientes nuevo = new Clientes(codigoProspecto, nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso);
            AlmacenaProspectos.add(nuevo);
            }else{
                codigoProspecto = validarDatos(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni);
            }
        return codigoProspecto;
    }

    public String validarDatos(String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni){
            
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

    public int cantidadProspectos() {
        return AlmacenaProspectos.size();
    }

    public Clientes buscaProspectos(String Dato) {
        
        for (Clientes aux : AlmacenaProspectos) {
            if ((Dato.equalsIgnoreCase(aux.getNombre())) || (Dato.equalsIgnoreCase(aux.getApellidoPaterno())) || (Dato.equalsIgnoreCase(aux.getDni()))) {
                System.out.println("nombre Encontrado " + aux.getNombre() + " " + aux.getApellidoPaterno());
                return aux;
            }
           }
        System.out.println("No se encontraron Resgistros para los filtros ingresados");
        System.out.println("Desea ingresar un nuevo prospecto");
        
        return null;

    }

    public boolean eliminaProspectos(String Nombre) {
        Clientes aux = buscaProspectos(Nombre);
        AlmacenaProspectos.remove(aux);
        return true;
    }

    public boolean listarProspectos() {
        boolean respuesta = false;
        Collections.sort(AlmacenaProspectos, new ProspectoFechaContactoComparator());
        for (Clientes nuevo : AlmacenaProspectos) {
            System.out.println(nuevo.getFechaIngreso());
            respuesta = true;
        }
        return respuesta;
    }
}

class ProspectoFechaContactoComparator implements Comparator<Clientes> {

    @Override
    public int compare(Clientes uno, Clientes dos) {
        return uno.getFechaIngreso().compareTo(dos.getFechaIngreso());
    }
    
   
    
    }
    
    

