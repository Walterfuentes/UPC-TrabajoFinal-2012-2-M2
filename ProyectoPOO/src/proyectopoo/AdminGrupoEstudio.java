/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.ArrayList;
import java.util.*;
import java.text.*;

/**
 *
 * @author AnyeloMenacho
 */
public class AdminGrupoEstudio {
    
    ArrayList<GrupoEstudio> almacenagrupoestudio;
    private int correlativo;
    private String descripcion;
    private String instructor;
    private String linkSyllabus;
    private String local;
    private String aula;
    private String coodenadas;

    public AdminGrupoEstudio() {
        this.correlativo=0;
        this.descripcion = descripcion;
        this.instructor = instructor;
        this.linkSyllabus = linkSyllabus;
        this.local = local;
        this.aula = aula;
        this.coodenadas = coodenadas;
        
    }

    public ArrayList<GrupoEstudio> getAlmacenagrupoestudio() {
        return almacenagrupoestudio;
    }
    
    public String validarDatosMandatorios(String codigoGrupo, String nombreGrupo, String academia, String curso, String fechaInicio, String fechaFin, String estado) {
        
        String mensaje="correcto";
        
        if(nombreGrupo==null || nombreGrupo.isEmpty())
            mensaje = "Debe Ingresar Nombre de Grupo";
        
        if(fechaInicio==null || fechaFin.isEmpty())
            mensaje = "Debe Ingresar Fecha de Inicio";
        
        if(fechaFin==null || fechaFin.isEmpty())
            mensaje = "Debe ingresar Fecha Final";
        
        return mensaje;
    }
    
    public int obtenerCantidadGrupoDeEstudio() {
        return almacenagrupoestudio.size();
    }
    
    public boolean existeGrupoEstudio(String nombreGrupo) {
        
        boolean mensaje = false;
        for(GrupoEstudio dato : almacenagrupoestudio) {
            if(dato.getNombreGrupo().equalsIgnoreCase(nombreGrupo)) {
                mensaje = true;
                break;
            }
        }if(mensaje==true) {
            System.out.println("Grupo de Estudio ya Existe");
         }   
        return mensaje;
    }   
    
    public boolean existeGrupoEstudio(GrupoEstudio grupoe, String nombreGrupo) {
        
        boolean mensaje = false;
        for(GrupoEstudio dato : almacenagrupoestudio) {
             if(!grupoe.equals(dato)) {
                 if(dato.getNombreGrupo().equalsIgnoreCase(nombreGrupo)) {
                     mensaje = true;
                     break;
                 }
             }
        }if(mensaje==true) {
            System.out.println("Grupo de Estudio ya Existe");
        }
        return mensaje;
    }
    
    public GrupoEstudio buscarGrupoEstudio(String nombreGrupo) {
        
        GrupoEstudio mensaje = null;
        for(GrupoEstudio dato : almacenagrupoestudio) {
            if(dato.getNombreGrupo().equalsIgnoreCase(nombreGrupo)) {
                System.out.println("Datos Encontrados: " + dato.getNombreGrupo());
                mensaje=dato;
                break;
            }
        }
        return mensaje;
    }
    
    public boolean eliminarGrupoEstudio(String nombreGrupo) {
        
        boolean mensaje = false;
        GrupoEstudio dato = buscarGrupoEstudio(nombreGrupo);
        if(dato != null)
        almacenagrupoestudio.remove(dato);
        System.out.println("Datos Eliminados");
        return true;
    }

    public void listarGrupoEstudio() {
       
        for(GrupoEstudio dato : almacenagrupoestudio) {
            System.out.println(dato.getNombreGrupo() + " | "
                             + dato.getAcademia() + " | "
                             + dato.getCurso() + " | "
                             + dato.getFechaInicio() + " | "
                             + dato.getFechaFin() + " | "
                             + dato.getEstado());
         return;         
        }
     
    }
}