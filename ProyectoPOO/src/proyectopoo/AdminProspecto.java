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
        String codigoProspecto = "nada"; 
        
        if(validarDatos(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso).equalsIgnoreCase("OK")){
        codigoProspecto = String.format("P"+"%04d", ++aumentaNumeroProspecto);
        Prospecto nuevo = new Prospecto(codigoProspecto,nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso);
        AlmacenaProspectos.add(nuevo);
        }else{
            codigoProspecto = validarDatos(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso);
        }
        return  codigoProspecto;
    }
    
    public String validarDatos (String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni, String telefonofijo, String celular, String fechaIngreso){
        
        String Respuesta = "OK";
        
        if (nombre == null || nombre.isEmpty())
            
            Respuesta = "Falta Nombre";
        
        if (ApellidoPaterno == null || ApellidoPaterno.isEmpty())
           
            Respuesta = "Falta Apellido Paterno";
        
        if (ApellidoMaterno== null || ApellidoMaterno.isEmpty()) 
            
            Respuesta = "Falta Apellido Materno";
        
        
        if (Correo== null || Correo.isEmpty()) 
            Respuesta = "Falta Correo";
        
        
        return Respuesta;
    }
    
    
    
    
    }
    
    

