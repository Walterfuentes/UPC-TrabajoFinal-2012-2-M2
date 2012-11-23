/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import static org.junit.Assert.*;
import org.junit.Test;
/*
 Pedro Balarezo
 */

public class HistoriaVentaTest {

    @Test
    public void validarAltaVenta() {

    String factura_boleta="0001";
    String concepto="Libros";
    int numero=10;
    int fecha_emision=20121012;
    String empresa="empresa1";
    double subtotal=500;
    double igv=512;
    double total=5486;
    String moneda="soles";
    int fecha_vencimiento=20121512;
    int fecha_pago=20121612;
    String estado="bien";
    String observaciones="provando";

     Venta v = new Venta(factura_boleta, concepto, numero, fecha_emision, empresa, subtotal, igv, total, moneda, fecha_vencimiento, fecha_pago, observaciones, moneda);
////       VentasAdmin vd = new VentasAdmin();
//
////       vd.Alta(factura_boleta, concepto, numero, fecha_emision, empresa, subtotal, igv, total, moneda, fecha_vencimiento, fecha_pago, observaciones, moneda);
//
////
////
        
        assertNotNull(v);
        assertEquals(factura_boleta, v.getFactura_boleta());
        assertEquals(concepto, v.getConcepto());
        assertEquals(fecha_emision, v.getFecha_emision());
        assertEquals(fecha_vencimiento, v.getFecha_vencimiento());
        assertEquals(subtotal, v.getSubtotal(),0.0);
        assertEquals(igv, v.getIgv(), 0.0);
        assertEquals(total, v.getTotal(), 0.0);
        assertEquals(moneda, v.getMoneda());
        assertEquals(observaciones, v.getObservaciones());
        
    }
}
