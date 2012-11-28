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
    
}
