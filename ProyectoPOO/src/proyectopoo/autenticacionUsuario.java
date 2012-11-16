/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.ArrayList;

/**
 *
 * @author walterfuentes
 */
public class autenticacionUsuario {
    private String nombre;
    private String contrasena;
    private ArrayList<autenticacionUsuario> autenticacion;

    public autenticacionUsuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.autenticacion = autenticacion;
    }

    public ArrayList<autenticacionUsuario> getAutenticacion() {
        return autenticacion;
    }

    public void setAutenticacion(ArrayList<autenticacionUsuario> autenticacion) {
        this.autenticacion = autenticacion;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
    
   
    public String registrarUsuario(){
        return " ";
    }
    
    public void validarUsuario(){
        
    }
}
