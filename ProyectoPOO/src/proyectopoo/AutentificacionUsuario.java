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
    
    
    public String AutentificacionUsuario(String nombre, String contrasenia) {
        if ((nombre==null || nombre.isEmpty() && (contrasenia==null || contrasenia.isEmpty()))) {
            System.out.println("Debe ingresar Usuario y contraseña");
            return "Faltan ambos datos";
        }
        if ((nombre==null || nombre.isEmpty() && (contrasenia !=null))) {
            System.out.println("Debe ingresar Nombre");
            return "Falta Nombre";
        }
        if ((nombre !=null && (contrasenia==null || contrasenia.isEmpty()))) {
            System.out.println("Debe ingresar contraseña");
            return "Falta Contraseña";
        }
        return "Datos completos";
     }
     
     
}
