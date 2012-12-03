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
    
    
    
    ArrayList<Prospecto> AlmacenaProspectos;
    private int aumentaNumeroProspecto;

    public AdminProspecto() {
        AlmacenaProspectos = new ArrayList<Prospecto>();
        this.aumentaNumeroProspecto = 0;
    }

    public ArrayList<Prospecto> getAlmacenaProspectos() {
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
            Prospecto nuevo = new Prospecto(codigoProspecto, nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso);
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

    public Prospecto buscaProspectos(String Dato) {
        Prospecto nuevo = null;
        for (Prospecto aux : AlmacenaProspectos) {
            if ((Dato.equalsIgnoreCase(aux.getNombre())) || (Dato.equalsIgnoreCase(aux.getApellidoPaterno())) || (Dato.equalsIgnoreCase(aux.getDni()))) {
                System.out.println("nombre Encontrado " + aux.getNombre() + " " + aux.getApellidoPaterno());
                nuevo = aux;
            }
        }
        if (nuevo == null) {
            System.out.println("No se encontraron Resgistros para los filtros ingresados");
        }

        System.out.println("Desea ingresar un nuevo prospecto");
        return nuevo;

    }

    public boolean eliminaProspectos(String Nombre) {
        Prospecto aux = buscaProspectos(Nombre);
        AlmacenaProspectos.remove(aux);
        return true;
    }

    public boolean listarProspectos() {
        boolean respuesta = false;
        Collections.sort(AlmacenaProspectos, new ProspectoFechaContactoComparator());
        for (Prospecto nuevo : AlmacenaProspectos) {
            System.out.println(nuevo.getFechaIngreso());
            respuesta = true;
        }
        return respuesta;
    }
}

class ProspectoFechaContactoComparator implements Comparator<Prospecto> {

    @Override
    public int compare(Prospecto uno, Prospecto dos) {
        return uno.getFechaIngreso().compareTo(dos.getFechaIngreso());
    }
    
   
    
    }
    
    

