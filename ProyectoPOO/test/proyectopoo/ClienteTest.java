/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;



import static org.junit.Assert.*;

/**
 *
 * @author walterfuentes
 */
public class ClienteTest {
    

    public ClienteTest () {
    }

   

    public void IngresoClienteTest(){
        String nombre =" Juan ";
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
         String fecha = "081212";
        
       Cliente cliente1 = new Cliente(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fecha);
       
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