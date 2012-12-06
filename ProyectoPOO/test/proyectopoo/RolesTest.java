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
        assertEquals(modulo, rol.getModulo());
        assertTrue("SI tiene permiso para acceder", rol.isAcceso());
        assertTrue("SI tiene permiso para adicionar", rol.isAdicionar());
        assertTrue("SI tiene permiso para editar", rol.isEditar());
        assertTrue("SI tiene permiso para eliminar", rol.isEliminar());
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
        String modulo = "Compras";
        boolean acceso = true;
        boolean adicionar = true;
        boolean editar = true;
        boolean eliminar = true;
        
        Roles rol = new Roles(modulo, acceso, adicionar, editar, eliminar);
        
        assertNotNull(rol);
        assertEquals(modulo,rol.getModulo());
        assertTrue("SI tiene permiso para acceder", rol.isAcceso());
        assertTrue("SI tiene permiso para adicionar", rol.isAdicionar());
        assertTrue("SI tiene permiso para editar", rol.isEditar());
        assertTrue("SI tiene permiso para eliminar", rol.isEliminar());
    }
    
    
}
