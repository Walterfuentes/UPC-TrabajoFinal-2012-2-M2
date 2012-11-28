/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.ArrayList;
import java.util.Collections;
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
        String mensaje = "";
        if (factura_boleta == null
                || concepto == null
                || numero <= 0
                || fecha_emision <= 0
                || empresa == null
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
        if (!mensaje.isEmpty()) {
            throw new BusinessException(mensaje);
        }

    }

    public void Alta(String factura_boleta, String concepto, int numero, int fecha_emision, String empresa, double subtotal, double igv, double total, String moneda, int fecha_vencimiento, int fecha_pago, String observaciones, String estado)
            throws BusinessException {
        valida(factura_boleta, concepto, numero, fecha_emision, empresa, subtotal, igv, total, moneda, fecha_vencimiento, fecha_pago, observaciones, estado);
        getVentas().add(new Venta(factura_boleta, concepto, numero, fecha_emision, empresa, subtotal, igv, total, moneda, fecha_vencimiento, fecha_pago, observaciones, estado));
        Collections.sort(ventas, new Fecha_Vencimiento_Comparator());
        //comparador //
    }

    public void BuscarConcepto(String concepto) {
        for (Venta v : ventas) {
            if (v.getConcepto().equals(concepto)) {
                System.out.println(v.getFactura_boleta() + " "
                        + v.getConcepto() + " "
                        + v.getNumero() + " "
                        + v.getFecha_emision() + " "
                        + v.getEmpresa() + " "
                        + v.getSubtotal() + " "
                        + v.getIgv() + " "
                        + v.getTotal() + " "
                        + v.getMoneda() + " "
                        + v.getFecha_vencimiento() + " "
                        + v.getFecha_pago() + " "
                        + v.getObservaciones() + " "
                        + v.getEstado() + " " + " \n");
            }
        }


    }

    public void BuscarNumero(int numero) {
        for (Venta v : ventas) {
            if (v.getNumero() == numero) {
                System.out.println(v.getFactura_boleta() + " "
                        + v.getConcepto() + " "
                        + v.getNumero() + " "
                        + v.getFecha_emision() + " "
                        + v.getEmpresa() + " "
                        + v.getSubtotal() + " "
                        + v.getIgv() + " "
                        + v.getTotal() + " "
                        + v.getMoneda() + " "
                        + v.getFecha_vencimiento() + " "
                        + v.getFecha_pago() + " "
                        + v.getObservaciones() + " "
                        + v.getEstado() + " " + " \n");
            }
        }


    }
    
  public void BuscarEmpresa(String empresa) {
        for (Venta v : ventas) {
            if (v.getEmpresa().equals(empresa))
             {
                System.out.println(v.getFactura_boleta() + " "
                        + v.getConcepto() + " "
                        + v.getNumero() + " "
                        + v.getFecha_emision() + " "
                        + v.getEmpresa() + " "
                        + v.getSubtotal() + " "
                        + v.getIgv() + " "
                        + v.getTotal() + " "
                        + v.getMoneda() + " "
                        + v.getFecha_vencimiento() + " "
                        + v.getFecha_pago() + " "
                        + v.getObservaciones() + " "
                        + v.getEstado() + " " + " \n");
            }
        }


    }
   public void BuscarEstado(String estado) {
        for (Venta v : ventas) {
            if (v.getEstado().equals(estado))
             {
                System.out.println(v.getFactura_boleta() + " "
                        + v.getConcepto() + " "
                        + v.getNumero() + " "
                        + v.getFecha_emision() + " "
                        + v.getEmpresa() + " "
                        + v.getSubtotal() + " "
                        + v.getIgv() + " "
                        + v.getTotal() + " "
                        + v.getMoneda() + " "
                        + v.getFecha_vencimiento() + " "
                        + v.getFecha_pago() + " "
                        + v.getObservaciones() + " "
                        + v.getEstado() + " " + " \n");
            }
        }


    }
}

class Fecha_Vencimiento_Comparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Venta v1 = (Venta) o1;
        Venta v2 = (Venta) o2;
        return v1.getFecha_vencimiento() - v2.getFecha_vencimiento();
    }
}



