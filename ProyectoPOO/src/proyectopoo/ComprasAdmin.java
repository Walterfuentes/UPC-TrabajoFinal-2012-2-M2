/*
 * Historia de Usuario: ComprasAdmin
 * Desarrollado: Carlos Ricaldi
 */
package proyectopoo;

import java.util.ArrayList;

public class ComprasAdmin {
    private ArrayList<Compras> compras;

    public ComprasAdmin() {
        compras = new ArrayList<Compras>();
    }
    
    public ArrayList<Compras> getCompras(){
        return compras;
    }
    
    private void validarDatosIncompletos(String factura, String concepto, String fechaEmision, String fechaVencimiento, double subtotal, double igv, double total, String moneda)
                throws BusinessException{
        String msg = "";
        if(factura == null || factura.isEmpty())
            msg = "El Nro de Factura no puede ser vacio o nulo";
        if(concepto == null || concepto.isEmpty())
            msg = "El concepto no puede ser vacio o nulo";
        if(fechaEmision == null || fechaEmision.isEmpty())
            msg += "La fecha de Emision no puede ser vacio o nulo";
        if(fechaVencimiento == null || fechaVencimiento.isEmpty())
            msg += "La fecha de Vencimiento no puede ser vacio o nulo";
        if(subtotal <=0)
            msg += "El subtotal no puede ser menor a 0";
        if(igv <=0 )
            msg += "El IGV no puede ser menor a 0";
        if(total <=0 )
            msg += "El total no puede ser menor a 0";
        if(moneda == null || moneda.isEmpty())
            msg += "La moneda no puede ser vacio o nulo";
        if(! msg.isEmpty())
            throw new BusinessException(msg);
    }
    
    private void validarDuplicidad(String factura)throws BusinessException{
        if(buscar(factura) != null){
            String msg = "La factura "+ factura + " ya existe";
            throw new BusinessException(msg);
        }
    }
    
    public void registrarCompra(String factura, String concepto, String fechaEmision, String fechaVencimiento, double subtotal, double igv, double total, String moneda)
           throws BusinessException{
        validarDatosIncompletos(factura, concepto, fechaEmision, fechaVencimiento, subtotal, igv, total, moneda);
        validarDuplicidad(concepto);
        getCompras().add(new Compras(factura, concepto, fechaEmision, fechaVencimiento, subtotal, igv, total, moneda));
    }
    
    public Compras buscar(String factura){
        for(Compras compras : getCompras())
            if(compras.getFactura().equals(factura))
                return compras;
        return null;
    }
    
}
