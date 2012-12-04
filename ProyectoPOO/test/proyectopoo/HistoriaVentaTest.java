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
    public void validarCamposVacions ()throws BusinessException{
        }
    @Test 
    public void validarFechasIncongruentes ()throws BusinessException{
    String factura_boleta = "0001";
        String concepto = "libros";
        int numero = 100;
        int fecha_emision = 20121220;
        String empresa = "empresa1";
        double subtotal = 500;
        double igv = 512;
        double total = 5486;
        String moneda = "soles";
        int fecha_vencimiento = 20121214;
        int fecha_pago = 20121213;
        String estado = "bien";
        String observaciones = "provando";
        
        Venta v = new Venta(factura_boleta, concepto, numero, fecha_emision, empresa, subtotal, igv, total, moneda, fecha_vencimiento, fecha_pago, observaciones, estado);
        VentasAdmin vd = new VentasAdmin();

        vd.Alta(factura_boleta, concepto, numero, fecha_emision, empresa, subtotal, igv, total, moneda, fecha_vencimiento, fecha_pago, observaciones, estado);

}
    @Test
    public void validarAltaVenta() throws BusinessException {

        String factura_boleta = "0001";
        String concepto = "libros";
        int numero = 100;
        int fecha_emision = 20121210;
        String empresa = "empresa1";
        double subtotal = 500;
        double igv = 512;
        double total = 5486;
        String moneda = "soles";
        int fecha_vencimiento = 20121214;
        int fecha_pago = 20121213;
        String estado = "bien";
        String observaciones = "provando";

        String factura_boleta1 = "0002";
        String concepto1 = "mesa";
        int numero1 = 10;
        int fecha_emision1 = 20121210;
        String empresa1 = "empresa2";
        double subtotal1 = 500;
        double igv1 = 512;
        double total1 = 5486;
        String moneda1 = "dolares";
        int fecha_vencimiento1 = 20121212;
        int fecha_pago1 = 20121217;
        String observaciones1 = "provando";
        String estado1 = "regular";

        String factura_boleta2 = "0003";
        String concepto2 = "libros";
        int numero2 = 90;
        int fecha_emision2 = 20121210;
        String empresa2 = "empresa3";
        double subtotal2 = 500;
        double igv2 = 512;
        double total2 = 5486;
        String moneda2 = "soles";
        int fecha_vencimiento2 = 20121213;
        int fecha_pago2 = 20121214;
        String observaciones2 = "provando";
        String estado2 = "mal";

        Venta v = new Venta(factura_boleta, concepto, numero, fecha_emision, empresa, subtotal, igv, total, moneda, fecha_vencimiento, fecha_pago, observaciones, estado);
        VentasAdmin vd = new VentasAdmin();

        vd.Alta(factura_boleta, concepto, numero, fecha_emision, empresa, subtotal, igv, total, moneda, fecha_vencimiento, fecha_pago, observaciones, estado);
        vd.Alta(factura_boleta1, concepto1, numero1, fecha_emision1, empresa1, subtotal1, igv1, total1, moneda1, fecha_vencimiento1, fecha_pago1, observaciones1, estado1);
        vd.Alta(factura_boleta2, concepto2, numero2, fecha_emision2, empresa2, subtotal2, igv2, total2, moneda2, fecha_vencimiento2, fecha_pago2, observaciones2, estado2);

        vd.BuscarConcepto("mesa");
        vd.BuscarNumero(10);
        vd.BuscarEmpresa("empresa3");
        vd.BuscarEstado("mal");
        vd.BuscarFechaEmision(20121210);
        vd.BuscarFechaVencimiento(fecha_vencimiento2);
        vd.BuscarFechaPago(20121217);

        assertNotNull(v);
        assertEquals(factura_boleta, v.getFactura_boleta());
        assertEquals(concepto, v.getConcepto());
        assertEquals(fecha_emision, v.getFecha_emision());
        assertEquals(fecha_vencimiento, v.getFecha_vencimiento());
        assertEquals(subtotal, v.getSubtotal(), 0.0);
        assertEquals(igv, v.getIgv(), 0.0);
        assertEquals(total, v.getTotal(), 0.0);
        assertEquals(moneda, v.getMoneda());
        assertEquals(observaciones, v.getObservaciones());


    }
}