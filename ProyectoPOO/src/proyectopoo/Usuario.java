/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

/**
 *
 * @author walterfuentes
 */
public class Usuario {
    
    private String nombre;
    private String contrasenia;

    public Usuario(String nombre, String contrasenia) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }


    public String getNombre() {
        return nombre;
    }

   
    
    
    
}
