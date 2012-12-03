/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import junit.framework.Assert;





/**
 *
 * @author walterfuentes
 */
public class ClientesTest {
    

    public ClientesTest () {
    }

   

    public void IngresoClienteTest(){
        String codigoCLiente = "C0001";
        String nombre =" Juan ";
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        String fecha = "081212";
        int transacciones = 0;
        
       Clientes cliente1 = new Clientes(codigoCLiente, nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fecha, transacciones);
        Assert.assertNotNull(cliente1);
        Assert.assertEquals(nombre, cliente1.getNombre());        
        Assert.assertEquals(ApellidoPaterno, cliente1.getApellidoPaterno());
        Assert.assertEquals(ApellidoMaterno, cliente1.getApellidoMaterno());
        Assert.assertEquals(Correo, cliente1.getCorreo());
        Assert.assertEquals(Dni, cliente1.getDni());
        Assert.assertEquals(telefonofijo, cliente1.getTelefonofijo());
        Assert.assertEquals(celular, cliente1.getCelular());
       
       
       
    }

}