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
 */
public class AdminClientesTest {
    
    public AdminClientesTest() {
    }

    @Test
    public void VerificaAltaCliente() {
        String nombre =" Juan ";
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fecha = "081212";
        int transacciones = 0;
        
        String nombre2 ="Carlos";
        String ApellidoPaterno2 = "flores";
        String ApellidoMaterno2 = "Lopez";
        String Correo2 = "micorreo@micorreo.com";
        String Dni2= "44561980";
        String telefonofijo2 = "3392183";
        String celular2 = "993638347";
         String fecha2 = "081212";
         int transacciones2 = 0;
        
        AdminClientes nuevocliente = new AdminClientes();
        
        Assert.assertEquals("C0001", nuevocliente.IngresaClientesSinProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fecha, transacciones));
        Assert.assertEquals("C0002", nuevocliente.IngresaClientesSinProspecto(nombre2, ApellidoPaterno2, ApellidoMaterno2, Correo2, Dni2, telefonofijo2, celular2, fecha2, transacciones2));
        
        
    }
    
    @Test
    public void EvitaAltaPorAusenciadeNombre() {
        String nombre = null;
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fecha = "081212";
        int transacciones = 0;
        
        AdminClientes nuevocliente = new AdminClientes();
        Assert.assertEquals("Falta Nombre", nuevocliente.IngresaClientesSinProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fecha, transacciones));
        
    }
   
    
    @Test
    public void EvitaAltaPorAusenciadeApellidoPaterno() {
        String nombre = null;
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fecha = "081212";
        int transacciones = 0;
        
        AdminClientes nuevocliente = new AdminClientes();
        Assert.assertEquals("Falta Apellido Materno", nuevocliente.IngresaClientesSinProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fecha, transacciones));
        
    }
    
    @Test
    public void EvitaAltaPorAusenciadeApellidoMaterno() {
        String nombre = null;
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fecha = "081212";
        int transacciones = 0;
        
        AdminClientes nuevocliente = new AdminClientes();
        Assert.assertEquals("Falta Apellido Paterno", nuevocliente.IngresaClientesSinProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fecha, transacciones));
        
    }
    
    @Test
    public void EvitaAltaPorAusenciadeDNI() {
        String nombre = null;
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fecha = "081212";
        int transacciones = 0;
        
        AdminClientes nuevocliente = new AdminClientes();
        Assert.assertEquals("Falta DNI", nuevocliente.IngresaClientesSinProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fecha, transacciones));
        
    }
    
    @Test
    public void EvitaAltaPorAusenciadeCorreo() {
        String nombre = null;
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fecha = "081212";
        int transacciones = 0;
        
        AdminClientes nuevocliente = new AdminClientes();
        Assert.assertEquals("Falta Correo", nuevocliente.IngresaClientesSinProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fecha, transacciones));
        
    }
    
    @Test
    public void EliminarClientes() {
       String nombre =" Juan ";
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fecha = "081212";
        int transacciones = 0;
        
        String nombre2 ="Carlos";
        String ApellidoPaterno2 = "flores";
        String ApellidoMaterno2 = "Lopez";
        String Correo2 = "micorreo@micorreo.com";
        String Dni2= "44561980";
        String telefonofijo2 = "3392183";
        String celular2 = "993638347";
         String fecha2 = "081212";
         int transacciones2 = 0;
        
        AdminClientes nuevocliente = new AdminClientes();
        
        nuevocliente.IngresaClientesSinProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fecha, transacciones);
        nuevocliente.IngresaClientesSinProspecto(nombre2, ApellidoPaterno2, ApellidoMaterno2, Correo2, Dni2, telefonofijo2, celular2, fecha2, transacciones2);
        Assert.assertEquals(2, nuevocliente.cantidaddeClientes());
        nuevocliente.eliminarClientes("Carlos");
        Assert.assertEquals(1, nuevocliente.cantidaddeClientes());
    }
    
    @Test
    public void EliminarClientessinTransaccion() {
       String nombre =" Juan ";
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fecha = "081212";
        int transacciones = 0;
        
        String nombre2 ="Carlos";
        String ApellidoPaterno2 = "flores";
        String ApellidoMaterno2 = "Lopez";
        String Correo2 = "micorreo@micorreo.com";
        String Dni2= "44561980";
        String telefonofijo2 = "3392183";
        String celular2 = "993638347";
         String fecha2 = "081212";
         int transacciones2 = 0;
        
        AdminClientes nuevocliente = new AdminClientes();
        
        nuevocliente.IngresaClientesSinProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fecha, transacciones);
        nuevocliente.IngresaClientesSinProspecto(nombre2, ApellidoPaterno2, ApellidoMaterno2, Correo2, Dni2, telefonofijo2, celular2, fecha2, transacciones2);
        Assert.assertEquals(2, nuevocliente.cantidaddeClientes());
        nuevocliente.eliminarClientes("Carlos");
        Assert.assertEquals(1, nuevocliente.cantidaddeClientes());
    }
 
    @Test
    public void NoEliminarClientesConTransaccion() {
       String nombre ="Juan";
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fecha = "081212";
        int transacciones = 10;
        
        String nombre2 ="Carlos";
        String ApellidoPaterno2 = "flores";
        String ApellidoMaterno2 = "Lopez";
        String Correo2 = "micorreo@micorreo.com";
        String Dni2= "44561980";
        String telefonofijo2 = "3392183";
        String celular2 = "993638347";
         String fecha2 = "081212";
         int transacciones2 = 20;
        
        AdminClientes nuevocliente = new AdminClientes();
        
        nuevocliente.IngresaClientesSinProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fecha, transacciones);
        nuevocliente.IngresaClientesSinProspecto(nombre2, ApellidoPaterno2, ApellidoMaterno2, Correo2, Dni2, telefonofijo2, celular2, fecha2, transacciones2);
        Assert.assertEquals(2, nuevocliente.cantidaddeClientes());
        nuevocliente.eliminarClientes("Carlos");
        nuevocliente.eliminarClientes("Juan");
        Assert.assertEquals(2, nuevocliente.cantidaddeClientes());
    }
    
    @Test
    public void ConvertirClienteaProspecto() {
        String nombre =" Juan ";
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fecha = "081212";
        int transacciones = 0;
        
        String nombre2 ="Carlos";
        String ApellidoPaterno2 = "flores";
        String ApellidoMaterno2 = "Lopez";
        String Correo2 = "micorreo@micorreo.com";
        String Dni2= "44561980";
        String telefonofijo2 = "3392183";
        String celular2 = "993638347";
         String fecha2 = "081212";
         int transacciones2 = 0;
        
        AdminClientes nuevocliente = new AdminClientes();
        
        Assert.assertEquals("C0001", nuevocliente.IngresaClientesSinProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fecha, transacciones));
        Assert.assertEquals("C0002", nuevocliente.IngresaClientesSinProspecto(nombre2, ApellidoPaterno2, ApellidoMaterno2, Correo2, Dni2, telefonofijo2, celular2, fecha2, transacciones2));
        Assert.assertEquals("P0001", nuevocliente.DarBajaaCliente("Carlos"));
        Assert.assertEquals("P0001", nuevocliente.DarBajaaCliente("Juan"));
    }
}
