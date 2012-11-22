/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**

 *
 * @author pcsiecon
 */
public class AltaProspectoTest {
    
    public AltaProspectoTest() {
    }
    
   
    @Test
    public void ValidarDatosAlRegistrar() {
        // Arrange
        String dni = "";
        String apellidoPaterno = "Menacho";
        String apellidoMaterno = "";
        String nombre = "Anyelo";
        String correo = "";
        String telefonofijo = "";
        String celular="";
         String fecha = "081212";
        AltaProspecto admin = new AltaProspecto();        
        admin.registrarProspecto(dni, apellidoPaterno, apellidoMaterno, nombre, correo, telefonofijo, celular, fecha);
    }
    @Test
    public void ValidarDuplicidad() {
        // Arrange
        String dni = "23272090";
        String apellidoPaterno = "Menacho";
        String apellidoMaterno = "Flores";
        String nombre = "Anyelo";
        String correo = "amenacho@atv.com.pe";
        String telefonofijo = "4567890";
        String celular="987654345";
         String fecha = "081212";
        AltaProspecto admin = new AltaProspecto();
        // Act
        admin.registrarProspecto(dni, apellidoPaterno, apellidoMaterno, nombre, correo, telefonofijo, celular,fecha);
         
        admin.registrarProspecto(dni, apellidoPaterno, apellidoMaterno, nombre, correo, telefonofijo, celular, fecha);
        // Assert
        // No se necesita comprobacion por que se espera que suceda
        
   }
}    
  