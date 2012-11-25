/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.ArrayList;


public class AltaProspecto extends Personas{
    
    private String idProspecto;
    private String fechaProspecto;
    
   
    private ArrayList<Personas> almacenaprospecto;
    
    public String getIdProspecto() {
        return idProspecto;
    }
    
    public void setIdProspecto(String idprospecto) {
        this.idProspecto=idprospecto;
    }
    
    public String setFechaProspecto() {
        return fechaProspecto;
    }
    
    public void setFechaProspecto(String fechaprospecto) {
        this.fechaProspecto=fechaprospecto;
    }
    public AltaProspecto() {
        almacenaprospecto=new ArrayList<Personas>();
    }
    
    public void registrarProspecto(String idProspecto, String nombre, String apellidopaterno, String apellidomaterno, String correo, String dni, String telefonofijo, String celular, String fechaingreso) {
    Personas nuevoprospecto;
    Personas validarprospecto;
    validarprospecto.validarDatosProspecto(nombre, apellidopaterno, apellidomaterno, correo, dni, telefonofijo, celular, fechaingreso);
    validarDuplicidad(dni);
    nuevoprospecto=new Personas(nombre, apellidopaterno, apellidomaterno, correo, dni, telefonofijo, celular, fechaingreso);
    almacenaprospecto.add(nuevoprospecto);
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
    
    public void mostrarGrilla() {
        for (Personas mostrar : almacenaprospecto) 
         System.out.println(mostrar.getNombre() + " | " + mostrar.getApellidoPaterno() + " | " + mostrar.getApellidoMaterno() + " | " + mostrar.getCorreo() + " | " + mostrar.getDni() + " | " + mostrar.getTelefonofijo() + " | " + mostrar.getCelular() + " | " + mostrar.getFechaIngreso());
         
    }

    
 
}
    

