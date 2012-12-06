/*
 * Historia de Usuario: Roles
 * Desarrollado: Carlos Ricaldi
 */
package proyectopoo;

import java.util.ArrayList;

public class Roles {
    private String nombreRol;
    private String descripcion;
    private String modulo;
    private ArrayList<Boolean> permisos;
    
    private boolean acceso;
    private boolean adicionar;
    private boolean editar;
    private boolean eliminar;

    public Roles(String nombreRol, String descripcion) {
        this.nombreRol = nombreRol;
        this.descripcion = descripcion;
    }

    public Roles(String modulo, boolean acceso, boolean adicionar, boolean editar, boolean eliminar) {
        this.modulo = modulo;
        this.acceso = acceso;
        this.adicionar = adicionar;
        this.editar = editar;
        this.eliminar = eliminar;
    }
    
    public Roles(String nombreRol, String descripcion, ArrayList<Boolean> Permisos) {
        this.nombreRol = nombreRol;
        this.descripcion = descripcion;
        permisos = new ArrayList<Boolean>();
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombreRol;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public boolean isAdicionar() {
        return adicionar;
    }

    public boolean isEditar() {
        return editar;
    }

    public boolean isEliminar() {
        return eliminar;
    }

    public String getModulo() {
        return modulo;
    }
    
    
}
