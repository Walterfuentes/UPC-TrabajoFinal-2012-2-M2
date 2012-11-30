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
        assertEquals(acceso, rol.getmodulo());
        assertFalse("No puede acceder", rol.getAcceso());
        assertFalse("No puede editar", editar);
    }
}
