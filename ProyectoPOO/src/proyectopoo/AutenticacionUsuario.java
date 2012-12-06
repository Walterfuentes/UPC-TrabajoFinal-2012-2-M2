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
    
    
    private String usuario;
    private AdminUsuario usuarionuevo;
    private String contrasenia;

    public AutenticacionUsuario() {
       usuarionuevo = new AdminUsuario();
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
    
    public boolean CrearUsuario(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String usuario, String correo, String fechaIngreso, String cargo, String rol, String contrasenia, boolean activo){
        usuarionuevo.Adicionar(dni, nombre, apellidoPaterno, apellidoMaterno, usuario, correo, fechaIngreso, cargo, rol, contrasenia,activo);
        return true;
    }
    
    public String validarCamposDeAcceso(String usuario, String contrasenia) {

         String mensaje="Correcto";
     
         if (usuario == null || usuario.isEmpty())
            
            mensaje= "Debe ingresar Usuario";
        
         if (contrasenia ==null || contrasenia.isEmpty()) 
           
            mensaje= "Debe ingresar Contraseña";
           
         if ((usuario==null || usuario.isEmpty() && (contrasenia == null || contrasenia.isEmpty()))) 
         
            mensaje= "Debe ingresar Usuario y contraseña";
        
     return mensaje; 
    }
    
    public boolean permitirAcceso(String usuario, String contrasenia) {
        
         for(Usuarios aux : usuarionuevo.getUsuarios()) {
             if(aux.getUsuario().equalsIgnoreCase(usuario) && aux.getContrasenia().equalsIgnoreCase(contrasenia)) {
                System.out.println("Usuario Existe");
                }else{
                System.out.println("Usuario No existe");
             }
          }
         return false;
    }
}
