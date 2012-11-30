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
        AutentificacionUsuario usuario1=new AutentificacionUsuario("anyelo", "campeon");
        AutentificacionUsuario usuario2=new AutentificacionUsuario("marlon", "asieslavida");
        AutentificacionUsuario usuario3=new AutentificacionUsuario("wilmer", "comotuninguna");
        AutentificacionUsuario usuario4=new AutentificacionUsuario("eber", "unparmas");
        Assert.assertEquals("anyelo", usuario1.getNombre());
        Assert.assertEquals("campeon", usuario1.getContrasenia());
        System.out.println("Nombre y contraseña de usuario1 correctas");
        
        Assert.assertNotSame("", usuario2.getNombre());
        Assert.assertEquals("asieslavida", usuario2.getContrasenia());
        System.out.println("Nombre de usuario2 incorrecto");
        
        Assert.assertEquals("wilmer", usuario3.getNombre());
        Assert.assertNotSame("", usuario3.getContrasenia());
        System.out.println("Contraseña de usuario3 incorrecta");
        
        Assert.assertNotSame("ss", usuario4.getNombre());
        Assert.assertNotSame("ss", usuario4.getContrasenia());
        System.out.println("Nombre y Contraseña de usuario4 incorrectas");
        
   }
 
   
   
    
  
}
