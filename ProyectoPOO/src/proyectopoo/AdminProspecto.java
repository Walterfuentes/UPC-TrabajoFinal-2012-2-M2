/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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

    public ArrayList<Prospecto> getAlmacenaProspectos() {
        return AlmacenaProspectos;
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
    
    
    public int cantidadProspectos(){
        return AlmacenaProspectos.size();
    }
    
    
    public Prospecto buscaProspectos(String Nombre){
        Prospecto nuevo = null;
        for (Prospecto aux: AlmacenaProspectos){
            if(Nombre.equalsIgnoreCase(aux.getNombre())){
                System.out.println("nombre Encontrado " +aux.getNombre()+" "+aux.getApellidoPaterno());
                nuevo = aux;}}
        if (nuevo == null)
        System.out.println("Desea ingresar un nuevo prospecto");
        return nuevo;
    }
    
    public boolean eliminaProspectos(String Nombre){
        Prospecto aux = buscaProspectos(Nombre);
        AlmacenaProspectos.remove(aux);  
        return true;
    }
    
    public boolean listarProspectos(){
        boolean respuesta = false;
        
       for(Prospecto nuevo: AlmacenaProspectos){
        System.out.println(nuevo.getFechaIngreso());
            respuesta = true;
       }
        return respuesta;
    }
    
    public void imprimeTest(String nombre){
        for (Prospecto aux: AlmacenaProspectos)
            if(nombre.equalsIgnoreCase(aux.getNombre()))
            System.out.println(aux.getNombre());
            }
    
   
    
    }
    
    

