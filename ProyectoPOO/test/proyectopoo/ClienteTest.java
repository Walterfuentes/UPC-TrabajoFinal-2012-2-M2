/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author walterfuentes
 */
public class ClienteTest {
    

    public ClienteTest () {
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

    public void IngresoClienteTest(){
        String nombre =" Juan ";
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        
       Cliente cliente1 = new Cliente(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular);
       
        assertNotNull(cliente1);
        assertEquals(nombre, cliente1.getNombre());        
        assertEquals(ApellidoPaterno, cliente1.getApellidoPaterno());
        assertEquals(ApellidoMaterno, cliente1.getApellidoMaterno());
        assertEquals(Correo, cliente1.getCorreo());
        assertEquals(Dni, cliente1.getDni());
        assertEquals(telefonofijo, cliente1.getTelefonofijo());
        assertEquals(celular, cliente1.getCelular());
       
    }

}