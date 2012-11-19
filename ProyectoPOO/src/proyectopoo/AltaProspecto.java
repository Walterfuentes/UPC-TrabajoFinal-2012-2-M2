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
    
    private ArrayList<Cliente> altaprospectos;
    
    public AltaProspecto() {
        altaprospectos=new ArrayList<Cliente>();
    }
    
    public String validarDatosProspecto (String nombre, String apellidopaterno, String apellidomaterno, String correo, String dni, String telefonofijo, String celular) {
        
        if(nombre==null || nombre.isEmpty())
            return "Debe Ingresar Nombre";
        
        if(apellidopaterno==null || apellidopaterno.isEmpty()) 
            return "Debe Ingresar Apellido Paterno";
        
        if(apellidomaterno==null || apellidomaterno.isEmpty()) 
            return "Debe Ingresar Apellido Materno";
        
        if(correo==null || correo.isEmpty()) 
            return "Debe Ingresar algun correo";
        
        if(dni==null || dni.isEmpty()) 
            return "Debe Ingresar DNI";
        
        if(telefonofijo==null || telefonofijo.isEmpty()) 
            return "Debe Ingresar algun Telefono";
        
        if(celular==null || celular.isEmpty()) 
            return "Debe Ingresar algun Celular";  
    // faltaba retorno
        return " ";
    }//faltaba cerrar el metodo 
    
    public int getTotalProspectos() {
        return altaprospectos.size();
    }
    
    public String validarDuplicidad(String dato) {
        if (buscarProspecto(dato) !=null) {
        return " Los datos ya han sido registrados";
        }    
        return "";
    }
  
    public void registrarProspecto(String nombre, String apellidopaterno, String apellidomaterno, String correo, String dni, String telefonofijo, String celular) {
        validarDatosProspecto(nombre, apellidopaterno, apellidomaterno, correo, dni, telefonofijo, celular);
        Cliente nuevoprospecto=new Cliente(nombre, apellidopaterno, apellidomaterno, correo, dni, telefonofijo, celular);
        altaprospectos.add(nuevoprospecto);  // Se usa la plantilla Cliente para crear Objetos de prospectos nuevos.
    }
    
    public Cliente buscarProspecto (String nombre) {
        for (Cliente busqueda : altaprospectos)
             if(busqueda.getNombre().equals(nombre))
             return busqueda;    
        return null;
    } 
    
    public void eliminarProspecto (String dato) {
        Cliente busqueda=buscarProspecto(dato);
        if (busqueda != null)
            altaprospectos.remove(dato);
    }
 
}
    

