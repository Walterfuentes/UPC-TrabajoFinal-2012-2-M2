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
   public void AutentificarNombreContrasenia() {
          String nombre=null;
          String contrasenia="campeon";
       
          AutentificacionUsuario test =new AutentificacionUsuario();
          Assert.assertEquals("Falta el campo Nombre", test.AutentificarUsuario(nombre, contrasenia));
   }
 }
