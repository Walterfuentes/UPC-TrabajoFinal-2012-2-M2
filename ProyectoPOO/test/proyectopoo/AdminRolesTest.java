/*
 * Historia de Usuario: AdminRoles Test
 * Desarrollado: Carlos Ricaldi
 */
package proyectopoo;

import junit.framework.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

public class AdminRolesTest {

    
    @Test
    public void CreaNuevoRol(){
        String nombreRol = "ROL ADMIN"; 
        String Descripcion= "BLA";
        
        AdminRoles nuevo = new AdminRoles();
        Assert.assertTrue(nuevo.AgregarRoles(nombreRol, Descripcion, true, true, true, true));
     }
    
    @Test
    public void ValidadeNombre(){
        String nombreRol = "MM"; 
        String Descripcion= "BLA";
        
        AdminRoles nuevo = new AdminRoles();
        Assert.assertEquals("Datos Correctos", nuevo.ValidaRCamposRol(nombreRol, Descripcion));
     }
    
    @Test
    public void Validadescripcion(){
        String nombreRol = "MM"; 
        String Descripcion= null;
        
        AdminRoles nuevo = new AdminRoles();
        Assert.assertEquals("Falta Descripción", nuevo.ValidaRCamposRol(nombreRol, Descripcion));
     }
    
    @Test
    public void NoCreaNuevoRol(){
        String nombreRol = "ROL ADMIN"; 
        String Descripcion= null;
        
        AdminRoles nuevo = new AdminRoles();
        Assert.assertFalse(nuevo.AgregarRoles(nombreRol, Descripcion, true, true, true, true));
     }
}
