/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.ArrayList;
import java.util.Collections ;
import java.util.List ;
import java.util.Comparator;
/**
 * @author Pedro Balarezo
 */
public class VentasAdmin {

    private ArrayList<Venta> ventas;
    private ArrayList<Venta> aux;

    public VentasAdmin() {
        ventas = new ArrayList<Venta>();
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }


    public void valida(String factura_boleta, String concepto, int numero, int fecha_emision, String empresa, double subtotal, double igv, double total, String moneda, int fecha_vencimiento, int fecha_pago, String observaciones, String estado)
            throws BusinessException {
        String mensaje ="";
        if (    factura_boleta==null
                || concepto == null
                || numero <= 0
                || fecha_emision <= 0
                || subtotal <= 0
                || igv <= 0
                || total <= 0
                || moneda == null
                || fecha_vencimiento <= 0
                || fecha_pago <= 0
                || observaciones == null
                || estado == null) {
            mensaje = "IMPORTANTE !!! LLENAR TODOS LOS CAMPOS";
        }
        if ((fecha_emision > fecha_pago) || (fecha_emision > fecha_vencimiento)) {
            mensaje = ("FECHAS INCOGRUENTES");
        }
        if(! mensaje.isEmpty())
        throw new BusinessException(mensaje);

    }

    public void Alta(String factura_boleta, String concepto, int numero, int fecha_emision, String empresa, double subtotal, double igv, double total, String moneda, int fecha_vencimiento, int fecha_pago, String observaciones, String estado)
            throws BusinessException {
            valida(factura_boleta, concepto, numero, fecha_emision, empresa, subtotal, igv, total, moneda, fecha_vencimiento, fecha_pago, observaciones, estado);
            getVentas().add(new Venta(factura_boleta, concepto, numero, fecha_emision, empresa, subtotal, igv, total, moneda, fecha_vencimiento, fecha_pago, observaciones, estado));
            //comparador //
    }


}


