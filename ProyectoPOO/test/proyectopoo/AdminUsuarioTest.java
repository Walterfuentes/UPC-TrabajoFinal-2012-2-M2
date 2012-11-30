/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author walterfuentes
 * @author PedroBalarezo
 */
public class AdminUsuarioTest {
    
     @Test
   public void DebeRegistrarUsuario (){
     String Dni="123456789";
     String Nombre="Gianina";
     String ApellidoPaterno="Quispe";
     String ApellidoMaterno="Rosas";
     String Usuario="u0001";
     String Correo="123@gmail.com";
     String FechaIngreso="10/10/2012";
     String Cargo="jefe";
     String Rol="rol1";
     String Contrasenia="1234";
     
     AdminUsuario adminUsuario=new AdminUsuario();
     adminUsuario.Adicionar(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Usuario, Correo, FechaIngreso, Cargo, Rol, Contrasenia);
   
     Usuarios elemento = adminUsuario.Buscar(Dni);
     assertNotNull(elemento);
     assertEquals(Dni,elemento.getDni());
     assertEquals(Nombre,elemento.getNombre());
     assertEquals(ApellidoPaterno,elemento.getApellidoPaterno());
     assertEquals(ApellidoMaterno,elemento.getApellidoMaterno());
     assertEquals(Usuario,elemento.getUsuario());
     assertEquals(Correo,elemento.getCorreo());
     assertEquals(FechaIngreso,elemento.getFechaIngreso());
     assertEquals(Cargo,elemento.getCargo());
     assertEquals(Rol,elemento.getRol());
     assertEquals(Contrasenia,elemento.getContrasenia());
     
     
   }

}
