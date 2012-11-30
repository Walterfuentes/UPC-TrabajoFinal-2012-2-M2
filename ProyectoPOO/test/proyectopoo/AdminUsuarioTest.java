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
    public void DebeRegistrarUsuario() {
        String Dni = "123456789";
        String Nombre = "Gianina";
        String ApellidoPaterno = "Quispe";
        String ApellidoMaterno = "Rosas";
        String Usuario = "u0001";
        String Correo = "123@gmail.com";
        String FechaIngreso = "10/10/2012";
        String Cargo = "jefe";
        String Rol = "rol1";
        String Contrasenia = "1234";

        AdminUsuario adminUsuario = new AdminUsuario();
        adminUsuario.Adicionar(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Usuario, Correo, FechaIngreso, Cargo, Rol, Contrasenia);

        Usuarios elemento = adminUsuario.Buscar(Dni);
        assertNotNull(elemento);
        assertEquals(Dni, elemento.getDni());
        assertEquals(Nombre, elemento.getNombre());
        assertEquals(ApellidoPaterno, elemento.getApellidoPaterno());
        assertEquals(ApellidoMaterno, elemento.getApellidoMaterno());
        assertEquals(Usuario, elemento.getUsuario());
        assertEquals(Correo, elemento.getCorreo());
        assertEquals(FechaIngreso, elemento.getFechaIngreso());
        assertEquals(Cargo, elemento.getCargo());
        assertEquals(Rol, elemento.getRol());
        assertEquals(Contrasenia, elemento.getContrasenia());


    }

    @Test
    public void deberiaValidar() {
        String Dni = "123456789";
        String Nombre = "Gianina";
        String ApellidoPaterno = "Quispe";
        String ApellidoMaterno = "Rosas";
        String Usuario = "u0001";
        String Correo = "123@gmail.com";
        String FechaIngreso = "10/10/2012";
        String Cargo = "jefe";
        String Rol = "rol1";
        String Contrasenia = "1234";

        String Dni1 = "123456789";
        String Nombre1 = "Gianina";
        String ApellidoPaterno1 = "Quispe";
        String ApellidoMaterno1 = "Rosas";
        String Usuario1 = "u0001";
        String Correo1 = "123@gmail.com";
        String FechaIngreso1 = "10/10/2012";
        String Cargo1 = "jefe";
        String Rol1 = "rol1";
        String Contrasenia1 = "1234";
        
        AdminUsuario adminUsuario = new AdminUsuario();
        adminUsuario.Adicionar(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Usuario, Correo, FechaIngreso, Cargo, Rol, Contrasenia);
        adminUsuario.Adicionar(Dni1, Nombre1, ApellidoPaterno1, ApellidoMaterno1, Usuario1, Correo1, FechaIngreso1, Cargo1, Rol1, Contrasenia1);

        int totalRetornado = adminUsuario.getTotalUsuarios();
        assertEquals(totalRetornado,1);
        
    }
    
    @Test
    public void deberiaEliminarUsuario(){
        String Dni = "123456789";
        String Nombre = "Gianina";
        String ApellidoPaterno = "Quispe";
        String ApellidoMaterno = "Rosas";
        String Usuario = "u0001";
        String Correo = "123@gmail.com";
        String FechaIngreso = "10/10/2012";
        String Cargo = "jefe";
        String Rol = "rol1";
        String Contrasenia = "1234";
        
        AdminUsuario adminUsuario = new AdminUsuario();
        adminUsuario.Adicionar(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Usuario, Correo, FechaIngreso, Cargo, Rol, Contrasenia);        
    
        adminUsuario.Eliminar(Dni);
        Usuarios elemento= adminUsuario.Buscar(Dni);
        assertNull(elemento);
        
        
        
        
    } 
    
    @Test 
    public void deveriaEditar (){
        String Dni = "123456789";
        String Nombre = "Gianina";
        String ApellidoPaterno = "Quispe";
        String ApellidoMaterno = "Rosas";
        String Usuario = "u0001";
        String Correo = "123@gmail.com";
        String FechaIngreso = "10/10/2012";
        String Cargo = "jefe";
        String Rol = "rol1";
        String Contrasenia = "1234";
        
        String Correo_Editado = "789@gmail.com";
        String FechaIngreso_Editado = "19/11/2012";
        String Nombre_Editado = "Claudia";
    
        AdminUsuario adminUsuario = new AdminUsuario ();
        adminUsuario.Editar(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Usuario, Correo, FechaIngreso, Cargo, Rol, Contrasenia);
        
        Usuarios elemento = adminUsuario.Buscar(Dni);
        assertNotNull(elemento);
        assertEquals(Dni, elemento.getDni());
        assertEquals(Nombre, elemento.getNombre());
        assertEquals(ApellidoPaterno, elemento.getApellidoPaterno());
        assertEquals(ApellidoMaterno, elemento.getApellidoMaterno());
        assertEquals(Usuario, elemento.getUsuario());
        assertEquals(Correo, elemento.getCorreo());
        assertEquals(FechaIngreso, elemento.getFechaIngreso());
        assertEquals(Cargo, elemento.getCargo());
        assertEquals(Rol, elemento.getRol());
        assertEquals(Contrasenia, elemento.getContrasenia());
        
                
        adminUsuario.Editar(Dni, Nombre_Editado, ApellidoPaterno, ApellidoMaterno, Usuario, Correo_Editado, FechaIngreso_Editado, Cargo, Rol, Contrasenia);
        
        Usuarios elemento_Editado = adminUsuario.Buscar(Dni);
        assertNotNull(elemento);
        assertEquals(Dni, elemento_Editado.getDni());
        assertEquals(Nombre_Editado, elemento_Editado.getNombre());
        assertEquals(ApellidoPaterno, elemento_Editado.getApellidoPaterno());
        assertEquals(ApellidoMaterno, elemento_Editado.getApellidoMaterno());
        assertEquals(Usuario, elemento_Editado.getUsuario());
        assertEquals(Correo_Editado, elemento_Editado.getCorreo());
        assertEquals(FechaIngreso_Editado, elemento_Editado.getFechaIngreso());
        assertEquals(Cargo, elemento_Editado.getCargo());
        assertEquals(Rol, elemento_Editado.getRol());
        assertEquals(Contrasenia, elemento_Editado.getContrasenia());
    
    }
}
