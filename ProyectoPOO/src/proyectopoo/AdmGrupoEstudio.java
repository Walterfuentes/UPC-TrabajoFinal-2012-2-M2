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
    
    

 
    
    
    
    
}
