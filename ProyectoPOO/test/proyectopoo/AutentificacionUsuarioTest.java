/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import org.junit.*;
import static org.junit.Assert.*;
import java.*;

/**
 *
 * @author AnyeloMenacho
 */
public class AutentificacionUsuarioTest {
    
   @Test
   public void AutentificarUsuarioContrasenia() {
        AutentificacionUsuario usuario=new AutentificacionUsuario("anyelo", "campeones");
        Assert.assertEquals("anyelo", usuario.getNombre());
        Assert.assertEquals("campeones", usuario.getContrasenia());
        
   }
    
   
}
