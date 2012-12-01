/*
 * Historia de Usuario: Roles Test
 * Desarrollado: Carlos Ricaldi
 */
package proyectopoo;

import org.junit.Test;
import static org.junit.Assert.*;

public class RolesTest {

     public RolesTest() {
    }
    
    @Test
    public void rolesDebeCrearseConNombreYDescripcion(){
        String nombre = "Administrador";
        String descripcion = "Role asignado al Administrador";
        
        Roles rol = new Roles(nombre, descripcion);
        
        assertNotNull(rol);
        assertEquals(nombre, rol.getNombre());
        assertEquals(descripcion, rol.getDescripcion());
    }
    
    @Test
    public void rolesDebeCrearseConModuloYAutorizacion(){
        String modulo = "Compras";
        boolean acceso = true;
        boolean adicionar = true;
        boolean editar = true;
        boolean eliminar = true;
   
        Roles rol = new Roles(modulo,acceso,adicionar,editar,eliminar);
        
        assertNotNull(rol);
        assertEquals(acceso, rol.getModulo());
        assertFalse("No tiene permiso para acceder", rol.isAcceso());
        assertFalse("No tiene permiso para adicionar", rol.isAdicionar());
        assertFalse("No tiene permiso para editar", rol.isEditar());
        assertFalse("No tiene permiso para eliminar", rol.isEliminar());
    }
    
    @Test
    public void rolesDebeEditarNombreYDescripcion(){
        String nombre = "Admin";
        String descripcion = "Role asignado al Administrador";
        
        Roles rol = new Roles(nombre, descripcion);
        
        assertNotNull(rol);
        assertEquals(nombre, rol.getNombre());
        assertEquals(descripcion, rol.getDescripcion());
    }
    
    @Test
    public void rolesDebeEditarModuloYAutorizacion(){
        
    }
}
