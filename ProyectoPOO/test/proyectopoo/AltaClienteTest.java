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
public class AltaClienteTest {
    
    public AltaClienteTest() {
    }


    @Test
    public void VerificaAltaTest() {
        String nombre =" Juan ";
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        
        Cliente cliente1 = new Cliente(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular);
        AltaCliente alta01 = new AltaCliente();
        alta01.RegistarAltacliente(cliente1);
        boolean respuestaEsperada = true;
        boolean respuestaRetornada = alta01.getMensaje();
        assertEquals(respuestaEsperada,respuestaRetornada);
        
        
        
        String nombre2 =" Carlos ";
        String ApellidoPaterno2 = null;
        String ApellidoMaterno2 = "Lopez";
        String Correo2 = null;
        String Dni2= "44561980";
        String telefonofijo2 = "3392183";
        String celular2 = "993638347";
        
        Cliente cliente2 = new Cliente(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular);
        AltaCliente alta02 = new AltaCliente();
        alta01.RegistarAltacliente(cliente2);
        boolean respuestaEsperada2 = false;
        boolean respuestaRetornada2 = alta02.getMensaje();
        assertEquals(respuestaEsperada,respuestaRetornada);
        
    }
    
    @Test
    public void VerificaBusquedaDatos() {
        String nombre ="Juan";
        String ApellidoPaterno = "Flores";
        String ApellidoMaterno = "Jimenez";
        String Correo = "micorreo@correo.com";
        String Dni= "41334980";
        String telefonofijo = "4502183";
        String celular = "994578347";
        
        Cliente cliente1 = new Cliente(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular);
        AltaCliente nuevaAlta = new AltaCliente();
        String buscaNombre ="Juan";
        nuevaAlta.buscarProspectos(buscaNombre);
        
        
        
    }
    }
