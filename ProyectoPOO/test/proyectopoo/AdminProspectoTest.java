/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import junit.framework.Assert;
import org.junit.Test;


/**
 *
 * @author walterfuentes
 */
public class AdminProspectoTest {
    
    public AdminProspectoTest() {
        
    }

    @Test
    public void AgregarNuevoProspecto(){
        String nombre =" Juan ";
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fechaIngreso = "081212";
        
        String nombre2 =" Mario ";
        String ApellidoPaterno2 = "Gonzales";
        String ApellidoMaterno2 = "Perez";
        String Correo2 = "micorreo2@correo.com";
        String Dni2= "41334340";
        String telefonofijo2 = "2118800";
        String celular2 = "994578347";
        String fechaIngreso2 = "091212";
         
        
        AdminProspecto nuevo = new AdminProspecto(); 
        Assert.assertEquals("P0001", nuevo.agregarProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso));
        Assert.assertEquals("P0002", nuevo.agregarProspecto(nombre2, ApellidoPaterno2, ApellidoMaterno2, Correo2, Dni2, telefonofijo2, celular2, fechaIngreso2));
    }
    
     @Test
    public void ValidaCampoNombre(){
        String nombre = null;
        String ApellidoPaterno = "Lopez";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fechaIngreso = "081212";  
        AdminProspecto nuevo = new AdminProspecto(); 
        
        Assert.assertEquals("Falta Nombre", nuevo.validarDatos(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso));
        }
     
    @Test
    public void ValidaCampoApellidoPaterno(){
        String nombre =" Juan ";
        String ApellidoPaterno = null;
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fechaIngreso = "081212";  
        AdminProspecto nuevo = new AdminProspecto(); 
        
        Assert.assertEquals("Falta Apellido Paterno", nuevo.validarDatos(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso));
        }
    
   
    
    
    @Test
    public void ValidaCampoApellidoMaterno(){
        String nombre =" Juan ";
        String ApellidoPaterno = "Ruiz";
        String ApellidoMaterno = null;
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fechaIngreso = "081212";  
        AdminProspecto nuevo = new AdminProspecto(); 

        Assert.assertEquals("Falta Apellido Materno", nuevo.validarDatos(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso));
        }
    
     @Test
    public void ValidaCampoEmail(){
        String nombre =" Juan ";
        String ApellidoPaterno = "Cammio";
        String ApellidoMaterno = "Jimenez";
        String Correo = null;
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fechaIngreso = "081212";  
        AdminProspecto nuevo = new AdminProspecto(); 
        
        Assert.assertEquals("Falta Correo", nuevo.validarDatos(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso));
        }
    
   
    @Test
    public void NoAgregarNuevoProspecto(){
        String nombre =" Juan ";
        String ApellidoPaterno = null;
        String ApellidoMaterno = "Jimenez";
        String Correo = "mmsms@test.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fechaIngreso = "081212";
        
        AdminProspecto prospecto = new AdminProspecto(); 
        Assert.assertEquals(prospecto.validarDatos(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso), prospecto.agregarProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso));
        }
    
    
    @Test
    public void ValidarAltaProspecto(){
        
    }
    
    @Test
    public void ValidarNoAltaProspecto(){
        
    }
    
    @Test
    public void validaBusquedadeClienteExistente(){
        
    }
    
    
    @Test
    public void validaBusquedadeClienteNoExistente(){
        
    }
    
    @Test
    public void ValidaDatosClienteExistente(){
        
    }
    
    @Test
    public void ValidarEliminacionProspecto(){
        
    }
    
    
}
