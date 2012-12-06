/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import org.junit.*;
import static org.junit.Assert.*;


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
          int Transacciones = 0;
          AutenticacionUsuario test = new AutenticacionUsuario();
          Assert.assertTrue(test.CrearUsuario(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Correo, FechaIngreso, Usuario, Contrasenia, Cargo, Roll,Transacciones));
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
          int Transacciones = 0;
          AutenticacionUsuario nuevo = new AutenticacionUsuario();
          nuevo.CrearUsuario(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Usuario, Correo, FechaIngreso, Cargo, Roll, Contrasenia,Transacciones);
          Assert.assertEquals("Credenciales Correctas", nuevo.permitirAcceso("Jcastro", "123456"));
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
          int Transacciones = 0;
          AutenticacionUsuario nuevo = new AutenticacionUsuario();
          nuevo.CrearUsuario(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Usuario, Correo, FechaIngreso, Cargo, Roll, Contrasenia,Transacciones);
          Assert.assertEquals("Usuario No Existe", nuevo.permitirAcceso("jcarrasco", Contrasenia));
    }
  
   
   
   @Test
   public void validaCamposContraseniaNombreVacios() {
      String usuario = null;
      String contrasenia = null;
      AutenticacionUsuario nuevo = new AutenticacionUsuario();
      Assert.assertEquals("Debe ingresar Usuario y contraseña", nuevo.validarCamposDeAcceso(usuario, contrasenia));
      
          
   } 
   
    @Test
   public void validaCamposContraseniaVacia() {
      String usuario = "Juan";
      String contrasenia = null;
      AutenticacionUsuario nuevo = new AutenticacionUsuario();
      Assert.assertEquals("Debe ingresar Contraseña", nuevo.validarCamposDeAcceso(usuario, contrasenia));
      
         
   } 
    
    
    @Test
   public void validaCamposNombreVacio() {
      String usuario = null;
      String contrasenia = "Contrasenia";
      AutenticacionUsuario nuevo = new AutenticacionUsuario();
      Assert.assertEquals("Debe ingresar usuario", nuevo.validarCamposDeAcceso(usuario, contrasenia));
      
          
   } 
     
     @Test
   public void validaCamposContraseniaNombreDatosCorrectos() {
      String usuario = "Mario";
      String contrasenia = "Contra";
      AutenticacionUsuario nuevo = new AutenticacionUsuario();
      Assert.assertEquals("Correcto", nuevo.validarCamposDeAcceso(usuario, contrasenia));
      
          
   } 
      
}
