/*
 * Test de la Historia de Usuario: Compras
 * Desarrollado: Carlos Ricaldi
 */
package proyectopoo;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComprasTest {

    public ComprasTest() {
    }
    @Test
    public void ventaDebeIngresarCampos(){
        // Arrange
        // Preparar los datos de pruebas
        String concepto = "Venta 1";
        String fechaEmision ="03/11/2012";
        String fechaVencimiento = "31/11/2012";
        double subtotal = 100.00;
        double igv = 0.0;
        double total = 0.0;
        String moneda = "Nuevos Soles";
        // Act
        // Ejecutar los métodos a probar
        Compras venta = new Compras(concepto, fechaEmision, fechaVencimiento, subtotal, igv, total, moneda);
        // Assert
        // Comprobar el resultado
        assertNotNull(venta);
        assertEquals(concepto, venta.getConcepto());
        assertEquals(fechaEmision, venta.getFechaEmision());
        assertEquals(fechaVencimiento, venta.getFechaVencimiento());
        assertEquals(subtotal, venta.getSubtotal(),0.0);
        assertEquals(igv, venta.getIgv(), 0.0);
        assertEquals(total, venta.getTotal(), 0.0);
        assertEquals(moneda, venta.getMoneda());
    }
}
    

