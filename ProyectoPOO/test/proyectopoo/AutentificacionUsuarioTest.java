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
          //Assert.assert("Datos correctos", test.validarCamposDeAcceso(nombre, contrasenia));
   }
   
   
   //Anyelo Los test de usuario que haz implementado deberían usar Assert.assertEquals, para validar la salida, porque 
   //al colocar que es NOTNULL le estas diciendo que lo que reciba de validaCamposdeaccesso sea cualquier cosa diferente a null
   // por lo tanto siempre pasaría los test porque siempre devuelve algo. asi sea correcto o nó los datos de entrada
   @Test
   public void validarCamposContraseniaNombre() {
          
          String nombre = null;
          String contrasenia = null;
       
          AutentificacionUsuario test = new AutentificacionUsuario();
          Assert.assertNotNull("Ingrese Nombre y Contrasenia", test.validarCamposDeAcceso(nombre, contrasenia));
   }
   //EJEMPLO
   @Test
   public void TESTvalidarCamposContraseniaNombre() {
       String nombre = "Usuario";
       String contrasenia = null;
       
     AutentificacionUsuario test = new AutentificacionUsuario();
     Assert.assertEquals("Falta Contraseña", test.validarCamposDeAcceso(nombre, contrasenia));  //ESTO ESTA HECHO A PROPOSITO porque debería dar otro mensaje 
   }                                                                                             //Los test te van a guiar a ver si tu código y métodos está correcto       
   
   @Test
   public void validarCampoNombre() {
          
          String nombre = null;
          String contrasenia = "asieslavida";
          
          AutentificacionUsuario test = new AutentificacionUsuario();
          Assert.assertNotNull("Ingrese Nombre", test.validarCamposDeAcceso(nombre, contrasenia));
   }
   
   @Test
   public void validarCampoContrasenia() {
          
          String nombre = "Carlos";
          String contrasenia = null;
          
          AutentificacionUsuario test = new AutentificacionUsuario();
          Assert.assertNotNull("Ingrese Contraseña", test.validarCamposDeAcceso(nombre, contrasenia));
   }
}
      