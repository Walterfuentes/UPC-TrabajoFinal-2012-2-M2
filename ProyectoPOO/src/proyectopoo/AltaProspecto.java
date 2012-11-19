/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.ArrayList;

/**
 *
 * @author Cynthia
 */
public class AltaProspecto {
    
    private ArrayList<Prospecto> altaprospectos;
    
    public AltaProspecto() {
        altaprospectos=new ArrayList<Prospecto>();
    }
    
    public String validarDatosProspecto (String nombre, String apellidopaterno, String apellidomaterno, String correo, String dni, String telefonofijo, String celular) {
        if(nombre==null || nombre.isEmpty()) {
            return "Debe Ingresar Nombre";
        }
        if(apellidopaterno==null || apellidopaterno.isEmpty()) {
            return "Debe Ingresar Apellido Paterno";
        }
        if(apellidomaterno==null || apellidomaterno.isEmpty()) {
            return "Debe Ingresar Apellido Materno";
        }
        if(correo==null || correo.isEmpty()) {
            return "Debe Ingresar algun correo";
        }
        if(dni==null || dni.isEmpty()) {
            return "Debe Ingresar DNI";
        }
        if(telefonofijo==null || telefonofijo.isEmpty()) {
            return "Debe Ingresar algun Telefono";
        }
        if(celular==null || celular.isEmpty()) {
            return "Debe Ingresar algun Celular";
        }
        
    }

    public void crearNuevoProspecto(String nombre, String apellidopaterno, String apellidomaterno, String correo, String dni, String telefonofijo, String celular) {
        Prospecto nuevoprospecto=new Prospecto(nombre, apellidopaterno, apellidomaterno, correo, dni, telefonofijo, celular);
        altaprospectos.add(nuevoprospecto);
    }
    
    public validarCamposProspecto
    
}
