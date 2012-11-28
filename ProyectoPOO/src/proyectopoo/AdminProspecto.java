/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.ArrayList;

/**
 *
 * @author walterfuentes
 */
public class AdminProspecto {
    
    
    
    ArrayList<Prospecto> AlmacenaProspectos;
    private int aumentaNumeroProspecto;

    public AdminProspecto() {
        AlmacenaProspectos = new ArrayList<Prospecto>();
        this.aumentaNumeroProspecto = 0;
    }
    
    public String agregarProspecto(String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni, String telefonofijo, String celular, String fechaIngreso){
        String codigoProspecto = String.format("P"+"%04d", ++aumentaNumeroProspecto); 
        Prospecto nuevo = new Prospecto(codigoProspecto,nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso);
        return codigoProspecto;
    }
    
    public String validarDatos (String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni, String telefonofijo, String celular, String fechaIngreso){
        
        if (nombre == null || nombre.isEmpty())  {
            
            return "Falta Nombre";
        }
        if (ApellidoPaterno == null || ApellidoPaterno.isEmpty()) {
           
            return "Falta Apellido Paterno";
        }
        if (ApellidoMaterno== null || ApellidoMaterno.isEmpty()) {
            
            return "Falta Apellido Materno";
        }
        
        if (Correo== null || Correo.isEmpty()) {
           
            return "Falta Correo";
        }
        
        return "DatosCompletos";
    }
    }
    
    

