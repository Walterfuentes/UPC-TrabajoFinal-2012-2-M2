/*
 * Test de la Historia de Usuario: Compras
 * Desarrollado: Carlos Ricaldi
 */
package proyectopoo;

import static org.junit.Assert.*;
import org.junit.Test;

public class ComprasTest {

   public ComprasTest() {
    }
    @Test   
    public void ventaDebeIngresarCampos(){

        String factura = "001-00001";
        String concepto = "Venta 1";
        String fechaEmision ="03/11/2012";
        String fechaVencimiento = "31/11/2012";
        double subtotal = 100.00;
        double igv = 10.00;
        double total = 110.0;
        String moneda = "Nuevos Soles";

        Compras compra = new Compras(factura, concepto, fechaEmision, fechaVencimiento, subtotal, igv, total, moneda);

        assertNotNull(compra);
        assertEquals(factura, compra.getFactura());
        assertEquals(concepto, compra.getConcepto());
        assertEquals(fechaEmision, compra.getFechaEmision());
        assertEquals(fechaVencimiento, compra.getFechaVencimiento());
        assertEquals(subtotal, compra.getSubtotal(),0.0);
        assertEquals(igv, compra.getIgv(), 0.0);
        assertEquals(total, compra.getTotal(), 0.0);
        assertEquals(moneda, compra.getMoneda());
    }
    
}
    

