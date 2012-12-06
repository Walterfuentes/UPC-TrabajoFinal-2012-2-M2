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

//    private ArrayList<Clientes> Almacenausuarios;
    private ArrayList<Usuarios> usuarios;

    
    
    public AdminUsuario() {
//        Almacenausuarios = new ArrayList<Clientes>();
        usuarios = new ArrayList<Usuarios>();
    }

    public ArrayList<Usuarios> getUsuarios() {
        return usuarios;
    } 
    public boolean validarExistenciaUsuario(String dni) {
        boolean respuesta = false;

        for (Usuarios elemento : usuarios) {
            if (elemento.getDni().equalsIgnoreCase(dni)) {
                respuesta = true;
            }
        }
        if (respuesta == true) {
            System.out.println("Usuario Ya Existe");
        }
        return respuesta;
    }

    public Usuarios Buscar(String dni) {
        for (Usuarios elemento : usuarios) {
            if (elemento.getDni().equals(dni)) {
                return elemento;
            }
        }
        return null;
    }

    public void Adicionar(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String usuario, String correo, String fechaIngreso, String cargo, String rol, String contrasenia, boolean transaccion) {
        if (validarExistenciaUsuario(dni) == false) {
            Usuarios nuevo = new Usuarios(dni, nombre, apellidoPaterno, apellidoMaterno, usuario, correo, fechaIngreso, cargo, rol, contrasenia,transaccion);
            usuarios.add(nuevo);
        }
    }

    public void Editar(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String usuario, String correo, String fechaIngreso, String cargo, String rol, String contrasenia) {
        Usuarios elemento = Buscar(dni);
        if (elemento != null) {
            elemento.setDni(dni);
            elemento.setNombre(nombre);
            elemento.setApellidoPaterno(apellidoPaterno);
            elemento.setApellidoMaterno(apellidoMaterno);
            elemento.setUsuario(usuario);
            elemento.setCorreo(correo);
            elemento.setFechaIngreso(fechaIngreso);
            elemento.setCargo(cargo);
            elemento.setRol(rol);
            elemento.setContrasenia(contrasenia);

        }
    }

    public void Eliminar(String dni) {
        Usuarios elemento = Buscar(dni);
        if ((elemento != null)&&(elemento.isActivo()==false)) {
            usuarios.remove(elemento);
        }else {
            System.out.println("Usuario con TRANSACCION . No se puede Eliminat");
        }
    }

    public int getTotalUsuarios() {
        return usuarios.size();
    }
}
