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

    /*public AutentificacionUsuarios(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String usuario, String correo, String fechaIngreso, String cargo, String rol, String contrasenia) {
        super(dni, nombre, apellidoPaterno, apellidoMaterno, usuario, correo, fechaIngreso, cargo, rol, contrasenia);
    }
    *
    */
    public AutentificacionUsuario() {
        usuarios = new ArrayList<Usuarios>();
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
    
     public String AutentificacionUsuario(String nombre, String contrasenia) {
        if ((nombre==null || nombre.isEmpty() && (contrasenia==null || contrasenia.isEmpty()))) {
            System.out.println("Debe ingresar Usuario y contraseña");
            return "Faltan ambos campos";
        }
        if ((nombre==null || nombre.isEmpty() && (contrasenia !=null))) {
            System.out.println("Dene ingresar Nombre");
            return "Falta Nombre";
        }
        if ((nombre !=null && (contrasenia==null || contrasenia.isEmpty()))) {
            System.out.println("Debe ingresar contraseña");
            return "Falta Contraseña";
        }
        return "Datos completos";
     }
}
