/*
 Historia Personas Realizado por Walter Fuentes
 * 
 */
package proyectopoo;

import java.util.ArrayList;

/**
 *
 * @author walterfuentes
 */
public class AltaCliente {
    
    private ArrayList<Personas> AltaClientes;
    private ArrayList<AltaCliente> AltaAceptadas;
    private boolean Mensaje;
    
     public AltaCliente() {
        AltaClientes = new ArrayList<Personas>();
        AltaAceptadas = new ArrayList<AltaCliente>();
    }

    public boolean getMensaje() {
        return Mensaje;
    }

    public void setMensaje(boolean Mensaje) {
        this.Mensaje = Mensaje;
    }

    
     
     public void CrearNuevoCliente(String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni, String telefonofijo, String celular, String fecha){
        Personas Nuevo = new Personas(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fecha);
        AltaClientes.add(Nuevo);
    }
     
     public void buscarProspectos(String buscadatos){
        String mensaje = " ";
        for(Personas aux : AltaClientes){
            if(buscadatos.equalsIgnoreCase(aux.getNombre()))mensaje=aux.getNombre()+aux.getApellidoPaterno()+aux.getApellidoMaterno()+aux.getDni()+aux.getCorreo()+aux.getTelefonofijo();
            if(buscadatos.equalsIgnoreCase(aux.getApellidoPaterno()))mensaje = aux.getNombre()+aux.getApellidoPaterno()+aux.getApellidoMaterno()+aux.getDni()+aux.getCorreo()+aux.getTelefonofijo();
            if(buscadatos.equalsIgnoreCase(aux.getApellidoMaterno()))mensaje = aux.getNombre()+aux.getApellidoPaterno()+aux.getApellidoMaterno()+aux.getDni()+aux.getCorreo()+aux.getTelefonofijo();
            if(buscadatos.equalsIgnoreCase(aux.getDni()))mensaje = aux.getNombre()+aux.getApellidoPaterno()+aux.getApellidoMaterno()+aux.getDni()+aux.getCorreo()+aux.getTelefonofijo();    
        }
        
    }
     
     public void RegistarAltacliente(Personas nuevo){
        
        if  ((nuevo.getNombre()==null || nuevo.getNombre().isEmpty())&&(nuevo.getCorreo()==null || nuevo.getCorreo().isEmpty())&&(nuevo.getApellidoPaterno()==null || nuevo.getApellidoPaterno().isEmpty())){
        Mensaje = false; 
        }else{
            Mensaje = true;
        }
         
    }
    
}
