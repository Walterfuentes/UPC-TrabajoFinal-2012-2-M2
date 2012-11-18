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

    private ArrayList<Usuarios> usuarios;
    

    public autenticacionUsuario() {
        usuarios = new ArrayList<Usuarios>();
        
    }

  

    public String validarCamposUsuario(String nombre, String contrasenia) {
        String respuesta = " ";

        if ((nombre == null || nombre.isEmpty()) && (contrasenia == null || contrasenia.isEmpty()))
        System.out.println("Debe Ingresar Usuario y contraseña");
        respuesta = "faltaAmbos";
        if ((nombre == null || nombre.isEmpty()) && (contrasenia != null))
         System.out.println( "Debe Ingresar Nombre");
        respuesta= "faltaNombre";
        if((nombre != null) && ( contrasenia == null || contrasenia.isEmpty())) System.out.println("Debe Ingresar contraseña");
        respuesta ="faltaContrasenia";
        if((nombre != null) && ( contrasenia != null)) System.out.println("Debe Ingresar contraseña");
        respuesta = "DatosCompletos";
        return respuesta;    
    }

    public boolean validarExistenciaUsuario(String nombre) {
        boolean respuesta = false;

        for (Usuarios aux : usuarios) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                respuesta = true;
            }
        }
        if(respuesta == true) System.out.println("Usuario Ya Existe");
        return respuesta;
    }

    public void registrarUsuario(String nombre, String contrasenia) { 
        if(validarExistenciaUsuario(nombre)== false){
        Usuarios nuevoUsuario = new Usuarios(nombre, contrasenia);
        usuarios.add(nuevoUsuario);}else{
            System.out.println("No se Puede Agregar Usuario ya Existe");
        }
        
    }
    
    public void autenticarUsuario(String nombre, String contrasenia){
        String respuestaUsuario = " ";  
        if (validarCamposUsuario(nombre, contrasenia).equalsIgnoreCase("DatosCompletos")){
        for(Usuarios aux: usuarios){  
            if((aux.getNombre().equalsIgnoreCase(nombre)) && (aux.getContrasenia().equalsIgnoreCase(contrasenia)))
                System.out.println( "Autenticado");
        }
        }else{
            System.out.println(validarCamposUsuario(nombre, contrasenia));
        }
        
    }
}
