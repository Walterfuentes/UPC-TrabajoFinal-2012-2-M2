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
public class AutentificacionUsuario {
    
    private ArrayList<Usuarios> usuarios;
    private String nombre;
    private String contrasenia;

    public AutentificacionUsuario() {
        usuarios = new ArrayList<Usuarios>();
    }
    
    public ArrayList<Usuarios> getUsuarios() {
        return usuarios;
    }
    
    public AutentificacionUsuario(String nombre, String contrasenia) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }

public String getNombre() {
        return nombre;
    }
    
    public boolean validarExistenciaDeUusario(String nombre) {
        
        boolean respuesta=false;
        
        for(Usuarios aux : usuarios) {
            if(aux.getNombre().equalsIgnoreCase(nombre)) {
                respuesta=true;
            }
        }
            if(respuesta==true) {
                System.out.println("Usuario Existe");
            }
        return respuesta;    
    }
    
    public String validarCamposDeAcceso(String nombre, String contrasenia) {
        
     String mensaje= "Correcto";
     
      if (validarExistenciaDeUusario(nombre)==true) {
            
         if (nombre==null || nombre.isEmpty())
            
            mensaje= "Debe ingresar Nombre";
        
         if (contrasenia==null || contrasenia.isEmpty()) 
           
            mensaje= "Debe ingresar Contraseña";
           
         if ((nombre==null || nombre.isEmpty() && (contrasenia !=null))) 
         
            mensaje= "Falta Nombre";
        
         if ((nombre !=null && (contrasenia==null || contrasenia.isEmpty()))) {
         
            mensaje= "Falta Contraseña";
         }
         
      }else{
         System.out.println("Usuario no existe en el sistema");
         
      }
     return mensaje; 
    }
    
    public boolean permitirAcceso(String nombre, String contrasenia) {
        
         boolean respuesta=false;
         
         for(Usuarios aux : usuarios) {
             if(aux.getNombre().equalsIgnoreCase(nombre) && aux.getContrasenia().equalsIgnoreCase(contrasenia)) {
                 respuesta=true;
                 break;
             }
         }
         return respuesta;
    }
}
