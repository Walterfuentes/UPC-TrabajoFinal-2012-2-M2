/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.ArrayList;


public class AltaProspecto extends Cliente{
    
    private String idProspecto;
    private String fechaProspecto;
    
   
    private ArrayList<Cliente> almacenaprospecto;
    
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
        almacenaprospecto=new ArrayList<Cliente>();
    }
    
//    public void registrarProspecto(String idProspecto, String nombre, String apellidopaterno, String apellidomaterno, String correo, String dni, String telefonofijo, String celular, String fechaingreso) {
//    Cliente nuevoprospecto;
//    Cliente validarprospecto;
//    validarprospecto.validarDatosProspecto(nombre, apellidopaterno, apellidomaterno, correo, dni, telefonofijo, celular, fechaingreso);
//    validarDuplicidad(dni);
//    nuevoprospecto=new Cliente(nombre, apellidopaterno, apellidomaterno, correo, dni, telefonofijo, celular, fechaingreso);
//    almacenaprospecto.add(nuevoprospecto);
//    }
//    
    public int getTotalProspectos() {
        return almacenaprospecto.size();
    }
    
    public String validarDuplicidad(String dato) {
        if (buscarProspecto(dato) !=null) {
        return " Los datos ya han sido registrados";
        }    
        return ""; 
    }
   
    public Cliente buscarProspecto (String nombre) {
        for (Cliente busqueda : almacenaprospecto)
             if(busqueda.getNombre().equals(nombre))
             return busqueda;
        return null;
    } 
    
    public void eliminarProspecto (String dato) {
        Cliente busqueda=buscarProspecto(dato);
        if (busqueda != null)
            almacenaprospecto.remove(dato);
    }
    
    public void mostrarGrilla() {
        for (Cliente mostrar : almacenaprospecto) 
         System.out.println(mostrar.getNombre() + " | " + mostrar.getApellidoPaterno() + " | " + mostrar.getApellidoMaterno() + " | " + mostrar.getCorreo() + " | " + mostrar.getDni() + " | " + mostrar.getTelefonofijo() + " | " + mostrar.getCelular() + " | " + mostrar.getFechaIngreso());
         
    }

    
 
}
    

