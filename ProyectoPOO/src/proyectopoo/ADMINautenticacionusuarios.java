/*
 Historia de Usuario.
 */
package proyectopoo;

import java.util.ArrayList;

/**
 *
 * @author walterfuentes
 */
public class ADMINautenticacionusuarios {

    private ArrayList<Usuario> usuarios;

    public ADMINautenticacionusuarios() {
        usuarios = new ArrayList<Usuario>();

    }

    public String validarCamposUsuario(String nombre, String contrasenia) {

        if ((nombre == null || nombre.isEmpty()) && (contrasenia == null || contrasenia.isEmpty())) {
            System.out.println("Debe Ingresar Usuario y contraseña");
            return "FaltaAmbos";
        }
        if ((nombre == null || nombre.isEmpty()) && (contrasenia != null)) {
            System.out.println("Debe Ingresar Nombre");
            return "FALTANOMBRE";
        }
        if ((nombre != null) && (contrasenia == null || contrasenia.isEmpty())) {
            System.out.println("Debe Ingresar contraseña");
            return "faltaContrasenia";
        }
        if ((nombre != null) && (contrasenia != null)) {
            System.out.println("Debe Ingresar contraseña");
        }
        return "DatosCompletos";
    }

    public boolean validarExistenciaUsuario(String nombre) {
        boolean respuesta = false;

        for (Usuario aux : usuarios) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                respuesta = true;
            }
        }
        if (respuesta == true) {
            System.out.println("Usuario Ya Existe");
        }
        return respuesta;
    }

    public void registrarUsuario(String nombre, String contrasenia) {
        if (validarExistenciaUsuario(nombre) == false) {
            Usuario nuevoUsuario = new Usuario(nombre, contrasenia);
            usuarios.add(nuevoUsuario);
        } else {
            System.out.println("No se Puede Agregar Usuario ya Existe");
        }
    }

    public void autenticarUsuario(String nombre, String contrasenia) {

        if (validarCamposUsuario(nombre, contrasenia).equalsIgnoreCase("DatosCompletos")) {
            for (Usuario aux : usuarios) {
                if ((aux.getNombre().equalsIgnoreCase(nombre)) && (aux.getContrasenia().equalsIgnoreCase(contrasenia))) {
                    System.out.println("Autenticado");
                }
            }
        } else {
            System.out.println(validarCamposUsuario(nombre, contrasenia));
        }

    }
}
