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
    
   public AutentificacionUsuarioTest() {
       
   }
    
   @Test 
   public void validarCamposNombreContrasenia() {
          String nombre = "Anyelo";
          String contrasenia = "campeon";
        
          AutentificacionUsuario test = new AutentificacionUsuario();
          Assert.assertEquals(true, test.validarCamposDeAcceso(nombre, contrasenia));
   }
   
   @Test
   public void validarCamposContraseniaNombre() {
          String nombre = null;
          String contrasenia = null;
       
          AutentificacionUsuario test = new AutentificacionUsuario();
          Assert.assertEquals(false, test.validarCamposDeAcceso(nombre, contrasenia));
   }                                                                                            
   
   @Test
   public void validarCampoNombre() { 
          String nombre = null;
          String contrasenia = "asieslavida";
          
          AutentificacionUsuario test = new AutentificacionUsuario();
          Assert.assertEquals("Falta Nombre", test.validarCamposDeAcceso(nombre, contrasenia));
   }
   
   @Test
   public void validarCampoContrasenia() {
          String nombre = "Carlos";
          String contrasenia = null;
          
          AutentificacionUsuario test = new AutentificacionUsuario();
          Assert.assertEquals("Falta Contraseña", test.validarCamposDeAcceso(nombre, contrasenia));
   }
   
   @Test
   public void validarExistenciaDeUsuario() {
          AutentificacionUsuario test = new AutentificacionUsuario();
          
          
   }
   
   @Test
   public void validarPermitirAcceso() {
          String nombre = "Jorge";
          String contrasenia = "comotuninguna"; 
          
          AutentificacionUsuario test = new AutentificacionUsuario();
          Assert.assertEquals(test.permitirAcceso("Jorge", "comotuninguna"), true);
          
   }
}      