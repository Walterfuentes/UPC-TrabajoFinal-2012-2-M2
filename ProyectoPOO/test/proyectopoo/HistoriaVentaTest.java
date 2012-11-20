/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/*
Pedro Balarezo
 */

public class HistoriaVentaTest {

    @Test
    public void validarAltaVenta() {
        Venta v = new Venta();
        assertEquals("IMPORTANTE !!! LLENAR TODOS LOS CAMPOS", v.valida(" ", " ", 20121201, " ", 100, 18, 118, " ", 20121220, 20121218, " "));
        assertEquals("FECHAS INCOGRUENTES", v.valida("concepto", "10001", 20121221, "empresa", 100, 18, 118, "soles", 20121220, 20121218, "todo bien"));
        assertEquals("concepto 10001 20121201 empresa 100.0 18.0 118.0 soles 20121220 20121218 todo bien   //////// AGREGADO CORRECTAMENTE", v.valida("concepto", "10001", 20121201, "empresa", 100, 18, 118, "soles", 20121220, 20121218, "todo bien"));
        assertEquals("concepto3 10003 20121212 empresa 100.0 18.0 118.0 soles 20121219 20121217 todo bien   //////// AGREGADO CORRECTAMENTE", v.valida("concepto3", "10003", 20121212, "empresa", 100, 18, 118, "soles", 20121219, 20121217, "todo bien"));
        assertEquals("concepto2 10002 20121201 autonomo 100.0 18.0 118.0 dolares 20121230 20121228 perfecto   //////// AGREGADO CORRECTAMENTE", v.valida("concepto2", "10002", 20121201, "autonomo", 100, 18, 118, "dolares", 20121230, 20121228, "perfecto"));
        assertEquals("LLENAR AL MENOS UN CAMPO PARA BUSCAR", v.validaBusqueda(" ", " ", 0, " ", 0, 0));
        assertEquals("concepto 10001 20121201 empresa 20121220 20121218", v.validaBusqueda("concepto", " ", 0, " ", 0, 0));
        assertEquals("concepto3 10003 20121212 empresa 20121219 20121217", v.validaBusqueda(" ", "10003", 0, " ", 0, 0));
        assertEquals("concepto2 10002 20121201 autonomo 20121230 20121228", v.validaBusqueda(" ", "10002", 0, " ", 0, 0));

    }
}

