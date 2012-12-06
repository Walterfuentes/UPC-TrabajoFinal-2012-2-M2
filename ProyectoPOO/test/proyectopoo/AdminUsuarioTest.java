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
        int Transacciones = 0;

        AdminUsuario adminUsuario = new AdminUsuario();
        adminUsuario.Adicionar(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Usuario, Correo, FechaIngreso, Cargo, Rol, Contrasenia, Transacciones);
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
    public void deberiaValidarNoIngresarUsuarioDuplicado() {
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
        int Transacciones = 0;

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
        int Transacciones1 = 0;
        
        AdminUsuario adminUsuario = new AdminUsuario();
        adminUsuario.Adicionar(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Usuario, Correo, FechaIngreso, Cargo, Rol, Contrasenia,Transacciones);
        adminUsuario.Adicionar(Dni1, Nombre1, ApellidoPaterno1, ApellidoMaterno1, Usuario1, Correo1, FechaIngreso1, Cargo1, Rol1, Contrasenia1,Transacciones1);
        assertEquals(1, adminUsuario.getTotalUsuarios());
        
    }
    
    @Test
    public void deberiaEliminarUsuariosinTransacciones(){
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
        int Transacciones = 0;
        
        String Dni1 = "277473112";
        String Nombre1 = "Maria";
        String ApellidoPaterno1 = "Jimenez";
        String ApellidoMaterno1 = "Rosas";
        String Usuario1 = "u0001";
        String Correo1 = "123@gmail.com";
        String FechaIngreso1 = "10/10/2012";
        String Cargo1 = "jefe";
        String Rol1 = "rol1";
        String Contrasenia1 = "1234";
        int Transacciones1 = 0;
        
        AdminUsuario adminUsuario = new AdminUsuario();
        adminUsuario.Adicionar(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Usuario, Correo, FechaIngreso, Cargo, Rol, Contrasenia,Transacciones);
        adminUsuario.Adicionar(Dni1, Nombre1, ApellidoPaterno1, ApellidoMaterno1, Usuario1, Correo1, FechaIngreso1, Cargo1, Rol1, Contrasenia1,Transacciones1);
        Assert.assertEquals(2, adminUsuario.getTotalUsuarios());
        adminUsuario.Eliminar(Dni);
        Assert.assertEquals(1, adminUsuario.getTotalUsuarios());
         
        
    } 
    
    @Test
    public void NodeberiaEliminarUsuarioconTransacciones(){
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
        int Transacciones = 2;
        
        String Dni1 = "277473112";
        String Nombre1 = "Maria";
        String ApellidoPaterno1 = "Jimenez";
        String ApellidoMaterno1 = "Rosas";
        String Usuario1 = "u0001";
        String Correo1 = "123@gmail.com";
        String FechaIngreso1 = "10/10/2012";
        String Cargo1 = "jefe";
        String Rol1 = "rol1";
        String Contrasenia1 = "1234";
        int Transacciones1 = 2;
        
        AdminUsuario adminUsuario = new AdminUsuario();
        adminUsuario.Adicionar(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Usuario, Correo, FechaIngreso, Cargo, Rol, Contrasenia,Transacciones);
        adminUsuario.Adicionar(Dni1, Nombre1, ApellidoPaterno1, ApellidoMaterno1, Usuario1, Correo1, FechaIngreso1, Cargo1, Rol1, Contrasenia1,Transacciones1);
        Assert.assertEquals(2, adminUsuario.getTotalUsuarios());
        adminUsuario.Eliminar(Dni);
        Assert.assertEquals(2, adminUsuario.getTotalUsuarios());
          } 
    
    @Test 
    public void deBeriaEditar (){
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
        int Transacciones = 0;
        
        String Correo_Editado = "789@gmail.com";
        String FechaIngreso_Editado = "19/11/2012";
        String Nombre_Editado = "Claudia";
    
        AdminUsuario adminUsuario = new AdminUsuario ();
        adminUsuario.Adicionar(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Usuario, Correo, FechaIngreso, Cargo, Rol, Contrasenia,Transacciones);
        
        Usuarios elemento = adminUsuario.Buscar(Dni);
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
    
    @Test 
    public void Buscar (){
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
        int Transacciones = 0;

        String Dni1 = "98765432";
        String Nombre1 = "Jorge";
        String ApellidoPaterno1 = "Mamani";
        String ApellidoMaterno1 = "Shereiber";
        String Usuario1 = "u0002";
        String Correo1 = "rew@gmail.com";
        String FechaIngreso1 = "10/09/2012";
        String Cargo1 = "lider";
        String Rol1 = "rol2";
        String Contrasenia1 = "1564";
        int Transacciones1 = 0;
        
        AdminUsuario adminUsuario = new AdminUsuario();
        adminUsuario.Adicionar(Dni, Nombre, ApellidoPaterno, ApellidoMaterno, Usuario, Correo, FechaIngreso, Cargo, Rol, Contrasenia,Transacciones);
        adminUsuario.Adicionar(Dni1, Nombre1, ApellidoPaterno1, ApellidoMaterno1, Usuario1, Correo1, FechaIngreso1, Cargo1, Rol1, Contrasenia1,Transacciones1);
        
        Usuarios elemento = adminUsuario.Buscar(Dni);
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
}
