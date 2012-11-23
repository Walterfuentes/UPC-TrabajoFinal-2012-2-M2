/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;



/**
 *
 * @author Pedro BALAREZO
 */
public class Venta {

    private String factura_boleta;
    private String concepto;
    private int numero;
    private int fecha_emision;
    private String empresa;
    private double subtotal;
    private double igv;
    private double total;
    private String moneda;
    private int fecha_vencimiento;
    private int fecha_pago;
    private String observaciones;
    private String  estado;


    public Venta(String factura_boleta, String concepto, int numero, int fecha_emision, String empresa, double subtotal, double igv, double total, String moneda, int fecha_vencimiento, int fecha_pago, String observaciones, String estado) {
        this.factura_boleta =factura_boleta;
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
        this.factura_boleta=factura_boleta;
        this.estado=estado;
    }
public Venta() {
        
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getFactura_boleta() {
        return factura_boleta;
    }

    public void setFactura_boleta(String factura_boleta) {
        this.factura_boleta = factura_boleta;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
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


}
