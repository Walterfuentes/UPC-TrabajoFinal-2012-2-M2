/*
 //Agregando autenticación de usuario WalterFuentes
 */
package proyectopoo;

import java.util.ArrayList;

/**
 *
 * @author Pedro Balarezo
 */
public class AdminUsuario {

    
    private ArrayList<Personas> Almacenausuarios;

    public AdminUsuario() {
        Almacenausuarios = new ArrayList<Personas>();
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

        for (Personas aux : Almacenausuarios) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                respuesta = true;
            }
        }
        if (respuesta == true) {
            System.out.println("Usuario Ya Existe");
        }
        return respuesta;
    }

    public void registrarUsuario(String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni, String fechaIngreso, String nombreUsuario, String cargo, String rol, String contrasenia ) {
        if (validarExistenciaUsuario(nombre) == false) {
            Personas nuevoUsuario = new Personas(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, fechaIngreso, nombreUsuario, cargo, rol, contrasenia);
            Almacenausuarios.add(nuevoUsuario);
        } else {
            System.out.println("No se Puede Agregar Usuario ya Existe");
        }
    }
    
    public void Buscar(String usuario) {
    }

    public void Adicionar() {
    }

    public void Editar() {
    }

    public void Eliminar() {
    }

    public void ValidarUsuario() {
    }
}
