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
 *
 * @author Pedro BALAREZO
 */
public class Venta {



    private String concepto;
    private String numero;
    private int fecha_emision;
    private String empresa;
    private double subtotal;
    private double igv;
    private double total;
    private String moneda;
    private int fecha_vencimiento;
    private int fecha_pago;
    private String observaciones;
    private ArrayList<Venta> items;
    

    public Venta() {
        this.concepto = concepto;
        this.numero = numero;
        this.fecha_emision = fecha_emision;
        this.empresa = empresa;
        this.subtotal = subtotal;
        this.igv = igv;
        this.total = total;
        this.moneda = moneda;
        this.fecha_vencimiento = fecha_vencimiento;
        this.fecha_pago = fecha_pago;
        this.observaciones = observaciones;

        items = new ArrayList<Venta>();
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(int fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public int getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(int fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public int getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(int fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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

        items.add(AltaVenta);


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

    public String validaBusqueda(String concepto, String numero, int fecha_emision, String empresa, int fecha_vencimiento, int fecha_pago) {
        if (concepto.equals(" ") && numero.equals(" ") && fecha_emision == 0 && empresa.equals(" ") && fecha_vencimiento == 0 && fecha_pago == 0) {
            System.out.println("LLENAR AL MENOS UN CAMPO PARA BUSCAR");
            return ("LLENAR AL MENOS UN CAMPO PARA BUSCAR");
        } else {
            if (concepto.equals(" ")) {
            } else {
                System.out.println(busquedaConcepto(concepto));
                return (busquedaConcepto(concepto));
            }
            if (numero.equals(" ")) {
            } else {
                System.out.println(busquedaNumero(numero));
                return (busquedaNumero(numero));

            }
//
//            if (empresa.equals(" ")) {
//            } else {
//                System.out.println(busquedaEmpresa(empresa));
//                return (busquedaEmpresa(empresa));
//            }

        }

        return null;
    }

    public String busquedaConcepto(String concepto) {
        for (Venta aux : items) {
            if (aux.getConcepto().equals(concepto)) {
                return (aux.getConcepto() + " " + aux.getNumero() + " "
                        + aux.getFecha_emision() + " " + aux.getEmpresa() + " "
                        + aux.getFecha_vencimiento() + " " + aux.getFecha_pago());
            }
        }
        return null;
    }

    public String busquedaNumero(String numero) {
        for (Venta aux : items) {
            if (aux.getNumero().equals(numero))
                return (aux.getConcepto() + " " + aux.getNumero() + " "
                        + aux.getFecha_emision() + " " + aux.getEmpresa() + " "
                        + aux.getFecha_vencimiento() + " " + aux.getFecha_pago());

        }
    return null;
    }
}
