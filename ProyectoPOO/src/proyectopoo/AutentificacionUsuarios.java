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
public class AutentificacionUsuarios {
    
    private ArrayList<Usuarios> usuarios;

    /*public AutentificacionUsuarios(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String usuario, String correo, String fechaIngreso, String cargo, String rol, String contrasenia) {
        super(dni, nombre, apellidoPaterno, apellidoMaterno, usuario, correo, fechaIngreso, cargo, rol, contrasenia);
    }
    *
    */
    public AutentificacionUsuarios() {
        usuarios = new ArrayList<Usuarios>();
    }
    
    
    public boolean AdicionarUsuario(Usuarios usuario) {
        boolean mensaje=false;
        return mensaje;
    }
    
    public String ValidarCamposMandatorios(Usuarios usuario) {
        if((usuario.getDni()==null) || (usuario.getDni().isEmpty())) 
            return "El campo DNI no puede ser nulo o vacio";  
        if((usuario.getNombre()==null || (usuario.getNombre().isEmpty()))) 
            return "El campo Nombre no puede ser nulo o vacio";
        if((usuario.getApellidoPaterno()==null || (usuario.getApellidoPaterno().isEmpty())))
            return "El campo Apellido Paterno no puede ser nulo o vacio";
        if((usuario.getApellidoMaterno()==null || (usuario.getApellidoMaterno().isEmpty())))
            return "El campo Apellido Materno no puede ser nulo o vacio";
        if((usuario.getUsuario()==null || (usuario.getUsuario().isEmpty())))
            return "El campo de Usuario no puede ser nulo o vacio";
        if((usuario.getCorreo()==null || (usuario.getCorreo().isEmpty())))
            return "El campo de Correo no puede ser vacio o nulo";
        if((usuario.getFechaIngreso()==null || (usuario.getFechaIngreso().isEmpty())))
            return "El campo Fecha de Ingreso no puede ser vacio o nulo";
        if((usuario.getCargo()==null || (usuario.getCargo().isEmpty())))
            return "El campo Cargo no puede ser vacio o nulo";
        if((usuario.getRol()==null || (usuario.getRol().isEmpty())))
            return "El campo Rol no puede ser vacio o nulo";
        if((usuario.getContrasenia()==null || (usuario.getContrasenia().isEmpty())));
            return "El campo Contraseña no puede ser vacio o nulo";
     }
    
}
