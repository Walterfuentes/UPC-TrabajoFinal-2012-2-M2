/*
 * Historia de Usuario: AdminCompras
 * Desarrollado: Carlos Ricaldi
 */
package proyectopoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AdminCompras {
     private ArrayList<Compras> compras;

    public AdminCompras() {
        compras = new ArrayList<Compras>();
    }
    
    public ArrayList<Compras> getCompras(){
        return compras;
    }
    
    private void validarDatosIncompletos(String factura, String concepto, String fechaEmision, String fechaVencimiento, double subtotal, double igv, double total, String moneda)
                throws BusinessException{
        String msg = "";
        if(factura == null || factura.isEmpty())
            msg = "Debe ingresar el Nro de Factura";
        if(concepto == null || concepto.isEmpty())
            msg = "Debe ingresar el Concepto de la Factura";
        if(fechaEmision == null || fechaEmision.isEmpty())
            msg += "Debe ingresar la Fecha de Emisión de la Factura";
        if(fechaVencimiento == null || fechaVencimiento.isEmpty())
            msg += "Debe ingresar la Fecha de Vencimiento";
        if(subtotal <=0)
            msg += "El subtotal presenta inconsistencia en su calculo";
        if(igv <=0 )
            msg += "El IGV presenta inconsistencia en su calculo";
        if(total <=0 )
            msg += "El calculo del Total presenta inconsistencia";
        if(moneda == null || moneda.isEmpty())
            msg += "Debe asignar un tipo de moneda";
        if(! msg.isEmpty())
            throw new BusinessException(msg);
    }
    
    private void validarDuplicidad(String factura)throws BusinessException{
        if(buscar(factura) != null){
            String msg = "El Nro de Factura "+ factura + " ya existe";
            throw new BusinessException(msg);
        }
    }
    
    public void registrarCompra(String factura, String concepto, String fechaEmision, String fechaVencimiento, double subtotal, double igv, double total, String moneda)
           throws BusinessException{
        validarDatosIncompletos(factura, concepto, fechaEmision, fechaVencimiento, subtotal, igv, total, moneda);
        validarDuplicidad(concepto);
        getCompras().add(new Compras(factura, concepto, fechaEmision, fechaVencimiento, subtotal, igv, total, moneda));
    }
    
    public void editarCompra(String factura, String concepto, String fechaEmision, String fechaVencimiento, double subtotal, double igv, double total, String moneda)
           throws BusinessException{
        validarDatosIncompletos(factura, concepto, fechaEmision, fechaVencimiento, subtotal, igv, total, moneda);
        validarDuplicidad(concepto);
        getCompras().add(new Compras(factura, concepto, fechaEmision, fechaVencimiento, subtotal, igv, total, moneda));
    }
    
    public Compras buscar(String factura){
        for(Compras lstcompras : getCompras())
            if(lstcompras.getFactura().equals(factura))
                return lstcompras;
        return null;
    }
    
    public boolean listarCompras() {
        boolean respuesta = false;
        Collections.sort(compras, new ComprasFechaVencimientoComparator());
        for (Compras nuevo : compras) {
            System.out.println(nuevo.getFechaEmision());
            respuesta = true;
        }
        return respuesta;
    }
    
    class ComprasFechaVencimientoComparator implements Comparator<Compras> {

        @Override
        public int compare(Compras o1, Compras o2) {
            return o1.getFechaVencimiento().compareTo(o2.getFechaVencimiento());
        }
    
   
    
    }
}
