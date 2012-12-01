/*
 * Historia de Usuario: Roles
 * Desarrollado: Carlos Ricaldi
 */
package proyectopoo;

public class Roles {
    private String nombre;
    private String descripcion;
    private String modulo;
    private boolean acceso;
    private boolean adicionar;
    private boolean editar;
    private boolean eliminar;

    public Roles(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Roles(String modulo, boolean acceso, boolean adicionar, boolean editar, boolean eliminar) {
        this.modulo = modulo;
        this.acceso = acceso;
        this.adicionar = adicionar;
        this.editar = editar;
        this.eliminar = eliminar;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
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
