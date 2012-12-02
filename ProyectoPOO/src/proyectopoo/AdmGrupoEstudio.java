/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.ArrayList;

/**
 *
 * @author SoporteTI
 */
public class AdmGrupoEstudio {
    
    ArrayList<GrupoEstudio> almacenagrupoestudio;
    private int correlativo;
    private String descripcion;
    private String instructor;
    private String linkSyllabus;
    private String local;
    private String aula;
    private String coodenadas;

    public AdmGrupoEstudio() {
        almacenagrupoestudio = new ArrayList<GrupoEstudio>(); 
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
    

 
    
    
    
    
}
