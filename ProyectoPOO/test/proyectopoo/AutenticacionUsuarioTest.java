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
    
   @Test 
   public void validarCamposNombreContrasenia() {
          String Dni = "574839304";
          String Nombre = "Juana";
          String ApellidoPaterno = "Diaz";
          String ApellidoMaterno = "Manrique";
          String Usuario = "jdiaz";
          String Correo = "jdiaz@quemiras.com";
          String FechaIngreso = "02/12/12";
          String Cargo = "Analista";
          String Roll = "Analiza";
          String Contrasenia = "123456";
          AutenticacionUsuario test = new AutenticacionUsuario();
          Assert.assertTrue(test.CrearUsuario(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Correo, FechaIngreso, Usuario, Contrasenia, Cargo, Roll,true));
    }   
          
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
          String Roll = "Supervisa";
          String Contrasenia = "123456";
          AutenticacionUsuario nuevo = new AutenticacionUsuario();
          nuevo.CrearUsuario(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Usuario, Correo, FechaIngreso, Cargo, Roll, Contrasenia,true);
          Assert.assertTrue(nuevo.permitirAcceso("jcastro", "123456"));
    }
   
    @Test
    public void validarNoPermitirAcceso() {
          String Dni = "236478272";
          String Nombre = "Jorge";
          String ApellidoPaterno = "Vilchez";
          String ApellidoMaterno = "Quispe";
          String Usuario = "jvilchez";
          String Correo = "jvilchez@quemiras.com";
          String FechaIngreso = "02/12/12";
          String Cargo = "Colsultor";
          String Roll = "Consulta";
          String Contrasenia = "123456";
          AutenticacionUsuario nuevo = new AutenticacionUsuario();
          nuevo.CrearUsuario(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Usuario, Correo, FechaIngreso, Cargo, Roll, Contrasenia,true);
          Assert.assertFalse(nuevo.permitirAcceso("jcarrasco", Contrasenia));
    }
}   
   
   
//   @Test
//   public void validarCamposContraseniaNombre() {
//          String nombre = null;
//          String contrasenia = null;
//       
//          AutenticacionUsuario test1 = new AutenticacionUsuario();
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
//          AutenticacionUsuario test = new AutenticacionUsuario();
//          Assert.assertEquals("Falta Nombre", test.validarCamposDeAcceso(nombre, contrasenia));
//   }
//   
//   @Test
//   public void validarCampoContrasenia() {
//          String nombre = "Carlos";
//          String contrasenia = null;
//          
//          AutenticacionUsuario test = new AutenticacionUsuario();
//          Assert.assertEquals("Falta Contraseña", test.validarCamposDeAcceso(nombre, contrasenia));
//   }
//   
//   @Test
//   public void validarExistenciaDeUsuario() {
//          AutenticacionUsuario test = new AutenticacionUsuario();
//          
//          
//   }
//   
//   
//}      