/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.ArrayList;

/**
 *
 * @author Cynthia
 */
public class AltaProspecto {
    
    private String idProspecto;
    private String fechaProspecto;
    
    private ArrayList<Personas> almacenaprospecto;
    
    public AltaProspecto() {
        almacenaprospecto=new ArrayList<Personas>();
    }
    
    public int getTotalProspectos() {
        return almacenaprospecto.size();
    }
    
    public String validarDuplicidad(String dato) {
        if (buscarProspecto(dato) !=null) {
        return " Los datos ya han sido registrados";
        }    
        return ""; 
    }
   
    public void registrarProspecto(String nombre, String apellidopaterno, String apellidomaterno, String correo, String dni, String telefonofijo, String celular, String fecha) {
        validarDatosProspecto(nombre, apellidopaterno, apellidomaterno, correo, dni, telefonofijo, celular);
        validarDuplicidad(dni);
        Personas nuevoprospecto=new Personas(nombre, apellidopaterno, apellidomaterno, correo, dni, telefonofijo, celular, fecha);
        almacenaprospecto.add(nuevoprospecto);  
    }
    
    public Personas buscarProspecto (String nombre) {
        for (Personas busqueda : almacenaprospecto)
             if(busqueda.getNombre().equals(nombre))
             return busqueda;    
        return null;
    } 
    
    public void eliminarProspecto (String dato) {
        Personas busqueda=buscarProspecto(dato);
        if (busqueda != null)
            almacenaprospecto.remove(dato);
    }
    
    
 
}
    

