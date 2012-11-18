/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;


/**
 *
 * @author walterfuentes
 */
public class autenticacionUsuarioTest {
    
    public autenticacionUsuarioTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        
    }
    
    @Test
    public void AgregarUsuario(){
        String Nombre = "Juan";
        String Contrasena = "MiContrasena01";
        String Nombre2 = "Jose";
        String Contrasena2 = "MiContrasena02";
        String Nombre3 = "Maria";
        String Contrasena3 = "Micontrasena03";
        String Nombre4 = "Ines";
        String Contrasena4 = "Micontrasena03";
      
      
      AutenticacionUsuarios agregar = new AutenticacionUsuarios();
      agregar.registrarUsuario(Nombre, Contrasena);
      agregar.registrarUsuario(Nombre2, Contrasena2);
      agregar.registrarUsuario(Nombre3, Contrasena3);
      agregar.registrarUsuario(Nombre4, Contrasena4);
      agregar.registrarUsuario(Nombre4, Contrasena4);
      
    }

    @Test
    public void ValidarUsuarioRepetido(){
        String Nombre = "Juan";
        String Contrasena = "MiContrasena01";
        String NombreNoexiste = "Walter";
        
        AutenticacionUsuarios autenticar = new AutenticacionUsuarios();
        autenticar.registrarUsuario(Nombre, Contrasena);
        boolean respuestaEntregada = autenticar.validarExistenciaUsuario(Nombre);
        boolean Respuestadebeser = true;
        assertEquals(respuestaEntregada, Respuestadebeser);
        boolean respuestaEntregada2 = autenticar.validarExistenciaUsuario(NombreNoexiste);
        boolean Respuestadebeser2 = false;
        assertEquals(respuestaEntregada2, Respuestadebeser2);
        
    }
    
    @Test
    public void ValidarAutenticacionUsuario(){
        String Nombre = "Juan";
        String Contrasena = "MiContrasena01";
        String Nombre2 = null;
        String Contrasena2 = "MiContrasena02";
        String Nombre3 = "Maria";
        String Contrasena3 = null;
        String Nombre4 = null;
        String Contrasena4 = null; 
        
        AutenticacionUsuarios agregar = new AutenticacionUsuarios();
        agregar.registrarUsuario(Nombre, Contrasena);
        
        
        String respuestaEsperadaAutenticar1 = "DatosCompletos";        
        String respuestaEsperadaAutenticar2 = "faltaNombre";
        String respuestaEsperadaAutenticar3 = "faltaContrasenia";
        String respuestaEsperadaAutenticar4 = "faltaAmbos";
        agregar.autenticarUsuario(Nombre, Contrasena);
        agregar.autenticarUsuario(Nombre2, Contrasena2);
        agregar.autenticarUsuario(Nombre3, Contrasena3);
        agregar.autenticarUsuario(Nombre4, Contrasena4);
         
    }
}
