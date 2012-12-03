/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;
import java.util.ArrayList;


/**
 *
 * @author AnyeloMenacho
 */
public class AutenticacionUsuario {
    
    private ArrayList<Usuarios> usuarios;
    private String usuario;
    private String contrasenia;

    public AutenticacionUsuario() {
        usuarios = new ArrayList<Usuarios>();
    }
    
    public ArrayList<Usuarios> getUsuarios() {
        return usuarios;
    }
    
    public AutenticacionUsuario(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getUsuario() {  
        return usuario;
    }
    
    public boolean validarExistenciaDeUusario(String usuario) {
        
        boolean respuesta=false;
        
        for(Usuarios aux : usuarios) {
            if(aux.getUsuario().equalsIgnoreCase(usuario)) {
                respuesta=true;
            }
        }
            if(respuesta==true) {
                System.out.println("Usuario Existe");
            }
        return respuesta;    
    }
    
    public boolean validarCamposDeAcceso(Usuarios aux) {

         String mensaje="Correcto";
     
      if (validarExistenciaDeUusario(aux.getUsuario())==true) {
            
         if (aux.getUsuario()==null || aux.getContrasenia().isEmpty())
            
            mensaje= "Debe ingresar Usuario";
        
         if (aux.getContrasenia()==null || aux.getContrasenia().isEmpty()) 
           
            mensaje= "Debe ingresar Contraseña";
           
         if ((aux.getUsuario()==null || aux.getUsuario().isEmpty() && (aux.getContrasenia() !=null))) 
         
            mensaje= "Debe ingresar Usuario";
        
         if ((aux.getUsuario() !=null && (aux.getContrasenia()==null || aux.getContrasenia().isEmpty()))) 
         
            mensaje= "Debe ingresae Contraseña";   
      }else{
         System.out.println("Usuario no existe en el sistema");
         
      }
     return true; 
    }
    
    public boolean permitirAcceso(String usuario, String contrasenia) {
        
         boolean respuesta=false;
         
         for(Usuarios aux : usuarios) {
             if(aux.getUsuario().equalsIgnoreCase(usuario) && aux.getContrasenia().equalsIgnoreCase(contrasenia)) {
                 respuesta=true;
                 break;
             }
         }
         return respuesta;
    }

  
}
