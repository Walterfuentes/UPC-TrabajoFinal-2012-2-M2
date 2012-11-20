/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.ArrayList;

/**
 * @author Pedro Balarezo
 */
public class VentasAdmin {
    private ArrayList<Venta> ventas;

    public VentasAdmin() {
        ventas = new ArrayList<Venta>();
    }
    public String valida(String concepto, String numero, int fecha_emision, String empresa, double subtotal, double igv, double total, String moneda, int fecha_vencimiento, int fecha_pago, String observaciones) {
        if (concepto.equals(" ") || numero.equals(" ") || fecha_emision == 0 || subtotal == 0 || igv == 0 || total == 0 || moneda.equals(" ") || fecha_vencimiento == 0 || fecha_pago == 0 || observaciones.equals(" ")) {
            System.out.println("IMPORTANTE !!! LLENAR TODOS LOS CAMPOS");
            return ("IMPORTANTE !!! LLENAR TODOS LOS CAMPOS");
        }
        if ((fecha_emision > fecha_pago) || (fecha_emision > fecha_vencimiento)) {
            System.out.println("FECHAS INCOGRUENTES");
            return ("FECHAS INCOGRUENTES");
        }
        return Alta(concepto, numero, fecha_emision, empresa, subtotal, igv, total, moneda, fecha_vencimiento, fecha_pago, observaciones);
    }
    
    public String Alta(String concepto, String numero, int fecha_emision, String empresa, double subtotal, double igv, double total, String moneda, int fecha_vencimiento, int fecha_pago, String observaciones) {
        Venta AltaVenta = new Venta();
        AltaVenta.setConcepto(concepto);
        AltaVenta.setNumero(numero);
        AltaVenta.setFecha_emision(fecha_emision);
        AltaVenta.setEmpresa(empresa);
        AltaVenta.setSubtotal(subtotal);
        AltaVenta.setIgv(igv);
        AltaVenta.setTotal(total);
        AltaVenta.setMoneda(moneda);
        AltaVenta.setFecha_vencimiento(fecha_vencimiento);
        AltaVenta.setFecha_pago(fecha_pago);
        AltaVenta.setObservaciones(observaciones);

        ventas.add(AltaVenta);


        System.out.println(AltaVenta.getConcepto() + " " + AltaVenta.getNumero() + " "
                + AltaVenta.getFecha_emision() + " " + AltaVenta.getEmpresa() + " "
                + AltaVenta.getSubtotal() + " " + AltaVenta.getIgv() + " "
                + AltaVenta.getTotal() + " " + AltaVenta.getMoneda() + " "
                + AltaVenta.getFecha_vencimiento() + " " + AltaVenta.getFecha_pago() + " "
                + AltaVenta.getObservaciones()
                + "   //////// AGREGADO CORRECTAMENTE");


        return (AltaVenta.getConcepto() + " " + AltaVenta.getNumero() + " "
                + AltaVenta.getFecha_emision() + " " + AltaVenta.getEmpresa() + " "
                + AltaVenta.getSubtotal() + " " + AltaVenta.getIgv() + " "
                + AltaVenta.getTotal() + " " + AltaVenta.getMoneda() + " "
                + AltaVenta.getFecha_vencimiento() + " " + AltaVenta.getFecha_pago() + " "
                + AltaVenta.getObservaciones()
                + "   //////// AGREGADO CORRECTAMENTE");

   
    }

    
}
