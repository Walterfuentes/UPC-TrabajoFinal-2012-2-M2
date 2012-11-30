/*
 //Agregando autenticación de usuario AnyeloMenacho
 */
package proyectopoo;

import java.util.ArrayList;

/**
 *
 * @author Pedro Balarezo
 */
public class AdminUsuario {

    private ArrayList<Clientes> Almacenausuarios;
    private ArrayList<Usuarios> usuarios;

    public AdminUsuario() {
        Almacenausuarios = new ArrayList<Clientes>();
        usuarios = new ArrayList<Usuarios>();
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
        return "Datos Completos";
    }

    public boolean validarExistenciaUsuario(String nombre) {
        boolean respuesta = false;

        for (Clientes aux : Almacenausuarios) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                respuesta = true;
            }
        }
        if (respuesta == true) {
            System.out.println("Usuario Ya Existe");
        }
        return respuesta;
    }


  public Usuarios Buscar(String dni) {
        for (Usuarios  elemento: usuarios) {
            if (elemento.getDni().equals(dni)) {
                return elemento;
            }
        }
        return null;
    }

    public void Adicionar(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String usuario, String correo, String fechaIngreso, String cargo, String rol, String contrasenia) 
    {
        if (validarExistenciaUsuario(dni)==false){
            Usuarios nuevo= new Usuarios(dni, nombre, apellidoPaterno, apellidoMaterno, usuario, correo, fechaIngreso, cargo, rol, contrasenia);
            usuarios.add(nuevo);
         }
    }

    public void Editar() {
    }

    public void Eliminar() {
    }
}
