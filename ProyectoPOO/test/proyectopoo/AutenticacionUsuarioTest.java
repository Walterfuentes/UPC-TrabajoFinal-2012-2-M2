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
public class AutenticacionUsuarioTest {
    
   public AutenticacionUsuarioTest() {
       
   }
    
//   @Test 
//   public void validarCamposNombreContrasenia() {
//          String Dni = "123456789";
//          String Nombre = "Juan";
//          String ApellidoPaterno = "Castro";
//          String ApellidoMaterno = "Quispe";
//          String Usuario = "jcastro";
//          String Correo = "jcastro@quemiras.com";
//          String FechaIngreso = "02/12/12";
//          String Cargo = "Supervisor";
//          String Roll = "Consulta";
//          String Contrasenia = "123456";
//          
//          AdminUsuario nuevo = new AdminUsuario();
//          AutentificacionUsuario test = new AutentificacionUsuario();
//          nuevo.Adicionar(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Usuario, Correo, FechaIngreso, Cargo, Roll, Contrasenia);
//          
//          Assert.assertEquals("Datos completos", test.validarCamposDeAcceso(nuevo));
//          
//    }   
          
    @Test
    public void validarPermitirAcceso() {
          String Dni = "123456789";
          String Nombre = "Juan";
          String ApellidoPaterno = "Castro";
          String ApellidoMaterno = "Quispe";
          String Usuario = "jcastro";
          String Correo = "jcastro@quemiras.com";
          String FechaIngreso = "02/12/12";
          String Cargo = "Supervisor";
          String Roll = "Consulta";
          String Contrasenia = "123456";
          AdminUsuario nuevo = new AdminUsuario();
          nuevo.Adicionar(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Usuario, Correo, FechaIngreso, Cargo, Roll, Contrasenia);
          
          AutenticacionUsuario test = new AutenticacionUsuario();
          Assert.assertEquals(test.permitirAcceso("jcastro", "123456"), true);
    }
   
   
   
   
   
   
   
   
//   
//   @Test
//   public void validarCamposContraseniaNombre() {
//          String nombre = null;
//          String contrasenia = null;
//       
//          AutentificacionUsuario test1 = new AutentificacionUsuario();
//          Assert.assertEquals("Datos Incompletos", test1.validarCamposDeAcceso(nombre, contrasenia));
//      
//          
//   }                                                                                            
//   
//   @Test
//   public void validarCampoNombre() { 
//          String nombre = null;
//          String contrasenia = "asieslavida";
//          
//          AutentificacionUsuario test = new AutentificacionUsuario();
//          Assert.assertEquals("Falta Nombre", test.validarCamposDeAcceso(nombre, contrasenia));
//   }
//   
//   @Test
//   public void validarCampoContrasenia() {
//          String nombre = "Carlos";
//          String contrasenia = null;
//          
//          AutentificacionUsuario test = new AutentificacionUsuario();
//          Assert.assertEquals("Falta Contraseña", test.validarCamposDeAcceso(nombre, contrasenia));
//   }
//   
//   @Test
//   public void validarExistenciaDeUsuario() {
//          AutentificacionUsuario test = new AutentificacionUsuario();
//          
//          
//   }
   
   
}      