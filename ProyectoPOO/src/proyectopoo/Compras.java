
/*
 * Historia de Usuario: Compras
 * Desarrollado: Carlos Ricaldi
 */
package proyectopoo;

public class Compras {
    
    private String factura;
    private String concepto;
    private String fechaEmision;
    private String fechaVencimiento;
    private double subtotal;
    private double igv;
    private double total;
    private String moneda;

    public String getFactura() {
        return factura;
    }

    public Compras(String factura, String concepto, String fechaEmision, String fechaVencimiento, double subtotal, double igv, double total, String moneda) {
        this.factura = factura;
        this.concepto = concepto;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.subtotal = subtotal;
        this.igv = igv;
        this.total = total;
        this.moneda = moneda;
    }
    
    public String getConcepto() {
        return concepto;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public double getIgv() {
        return igv;
    }

    public String getMoneda() {
        return moneda;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotal() {
        return total;
    }
    
    
}