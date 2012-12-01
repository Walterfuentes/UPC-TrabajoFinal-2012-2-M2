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
    
    
    public String validarCamposDeAcceso(String nombre, String contrasenia) {
        
        String mensaje= "Correcto";
        
        if (nombre==null || nombre.isEmpty())
            
            mensaje= "Debe ingresar Nombre";
        
        if (contrasenia==null || contrasenia.isEmpty()) 
           
            mensaje= "Debe ingresar Contraseña";
           
        if ((nombre==null || nombre.isEmpty() && (contrasenia !=null))) 
         
            mensaje= "Falta Nombre";
        
        if ((nombre !=null && (contrasenia==null || contrasenia.isEmpty()))) {
         
            mensaje= "Falta Contraseña";
        }
        return mensaje; 
     }
}
