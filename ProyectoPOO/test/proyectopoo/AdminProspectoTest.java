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
    public void DarAltaProspecto(){
        String nombre =" Juan ";
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fechaIngreso = "08/12/2012";
        
        String nombre2 =" Mario ";
        String ApellidoPaterno2 = "Gonzales";
        String ApellidoMaterno2 = "Perez";
        String Correo2 = "micorreo2@correo.com";
        String Dni2= "41334340";
        String telefonofijo2 = "2118800";
        String celular2 = "994578347";
        String fechaIngreso2 = "08/12/2012";
         
        
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
        String fechaIngreso = "08/12/2012";  
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
        String fechaIngreso = "08/12/2012";  
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
        String fechaIngreso = "08/12/2012";  
        AdminProspecto nuevo = new AdminProspecto(); 

        Assert.assertEquals("Falta Apellido Materno", nuevo.validarDatos(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso));
        }
    
     @Test
    public void ValidaCampoEmail(){
        String nombre ="Juan";
        String ApellidoPaterno = "Cammio";
        String ApellidoMaterno = "Jimenez";
        String Correo = null;
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fechaIngreso = "08/12/2012";  
        AdminProspecto nuevo = new AdminProspecto(); 
        
        Assert.assertEquals("Falta Correo", nuevo.validarDatos(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso));
        }
    
   
    @Test
    public void NoDarAltaDeProspecto(){
        String nombre ="Juan";
        String ApellidoPaterno = null;
        String ApellidoMaterno = "Jimenez";
        String Correo = "mmsms@test.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fechaIngreso = "08/12/2012";
        
        AdminProspecto prospecto = new AdminProspecto(); 
        Assert.assertEquals(prospecto.validarDatos(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso), prospecto.agregarProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso));
        }
    
    
    @Test
    public void validaBusquedadeProspecto(){
        String nombre ="Juan";
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fechaIngreso = "08/12/2012";
        
        String nombre2 =" Mario ";
        String ApellidoPaterno2 = "Gonzales";
        String ApellidoMaterno2 = "Perez";
        String Correo2 = "micorreo2@correo.com";
        String Dni2= "41334340";
        String telefonofijo2 = "2118800";
        String celular2 = "994578347";
        String fechaIngreso2 = "08/12/2012";
         
        String nombre3 ="Juan";
        String ApellidoPaterno3 = "Perez";
        String ApellidoMaterno3 = "Jimenez";
        String Correo3 = "micorreo@correo.com";
        String Dni3= "41334980";
        String telefonofijo3 = "4502183";
        String celular3 = "994578347";
        String fechaIngreso3 = "08/12/2012";
         
        
        AdminProspecto nuevo = new AdminProspecto(); 
        nuevo.agregarProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso);
        nuevo.agregarProspecto(nombre2, ApellidoPaterno2, ApellidoMaterno2, Correo2, Dni2, telefonofijo2, celular2, fechaIngreso2);
        nuevo.agregarProspecto(nombre3, ApellidoPaterno3, ApellidoMaterno3, Correo3, Dni3, telefonofijo3, celular3, fechaIngreso3);
        
        Assert.assertNotNull(nuevo.buscaProspectos("Juan"));
    }
    
    
    @Test
    public void validaBusquedadeProspectoNoExistente(){
        String nombre ="Juan";
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fechaIngreso = "08/12/2012";
        
        String nombre2 ="Mario";
        String ApellidoPaterno2 = "Gonzales";
        String ApellidoMaterno2 = "Perez";
        String Correo2 = "micorreo2@correo.com";
        String Dni2= "41334340";
        String telefonofijo2 = "2118800";
        String celular2 = "994578347";
        String fechaIngreso2 = "08/12/2012";
        
        
        AdminProspecto nuevo = new AdminProspecto(); 
        nuevo.agregarProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso);
        nuevo.agregarProspecto(nombre2, ApellidoPaterno2, ApellidoMaterno2, Correo2, Dni2, telefonofijo2, celular2, fechaIngreso2);
        Assert.assertNull(nuevo.buscaProspectos("Pedro"));
        
    }
    
    @Test
    public void ValidaDatosClienteExistente(){
        AdminProspecto nuevo = new AdminProspecto(); 
        nuevo.listarProspectos();
    }
    
    @Test
    public void ValidarEliminacionProspecto(){
        String nombre ="Juan";
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fechaIngreso = "08/12/2012";
        
        String nombre2 ="Mario";
        String ApellidoPaterno2 = "Gonzales";
        String ApellidoMaterno2 = "Perez";
        String Correo2 = "micorreo2@correo.com";
        String Dni2= "41334340";
        String telefonofijo2 = "2118800";
        String celular2 = "994578347";
        String fechaIngreso2 = "08/12/2012";
         
        
        AdminProspecto nuevo = new AdminProspecto(); 
        nuevo.agregarProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso);
        nuevo.agregarProspecto(nombre2, ApellidoPaterno2, ApellidoMaterno2, Correo2, Dni2, telefonofijo2, celular2, fechaIngreso2);
        Assert.assertEquals(2, nuevo.cantidadProspectos());
        Assert.assertTrue(nuevo.eliminaProspectos("Juan"));
        Assert.assertEquals(1,nuevo.cantidadProspectos());
    }
    
    @Test
    public void ValidarListaProspectos(){
        String nombre =" Juan ";
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fechaIngreso = "08/12/2012";
        
        String nombre2 =" Mario ";
        String ApellidoPaterno2 = "Gonzales";
        String ApellidoMaterno2 = "Perez";
        String Correo2 = "micorreo2@correo.com";
        String Dni2= "41334340";
        String telefonofijo2 = "2118800";
        String celular2 = "994578347";
        String fechaIngreso2 = "08/12/2012";
         
        
        AdminProspecto nuevo = new AdminProspecto(); 
        nuevo.agregarProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso);
        nuevo.agregarProspecto(nombre2, ApellidoPaterno2, ApellidoMaterno2, Correo2, Dni2, telefonofijo2, celular2, fechaIngreso2);
        Assert.assertTrue(nuevo.listarProspectos());   
    }
        
    @Test
    public void ValidarNoListaProspectos(){
      AdminProspecto nuevo = new AdminProspecto(); 
      Assert.assertFalse(nuevo.listarProspectos());   
    }
    
    @Test
    public void validarOrdenarPorFecha(){
        AdminProspecto nuevo = new AdminProspecto(); 
        Assert.assertTrue(nuevo.listarProspectos());
    }
    
}
