/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;
import java.util.*;
import java.text.*;



public class GrupoEstudio {
    
    
    private String nombreGrupo;
    private String academia;
    private String curso;
    private String fechaInicio;
    private String fechaFin;
    private String estado;
    private String instructores;
    private String linkToSyllabus;
    private String local;
    private String Aula;
    private String CoordenadasAltitud;
    private String CoordenadasLatitud;

    public GrupoEstudio(String nombreGrupo, String academia, String curso, String fechaInicio, String fechaFin, String estado, String instructores, String linkToSyllabus, String local, String Aula, String CoordenadasAltitud, String CoordenadasLatitud) {
        this.nombreGrupo = nombreGrupo;
        this.academia = academia;
        this.curso = curso;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.instructores = instructores;
        this.linkToSyllabus = linkToSyllabus;
        this.local = local;
        this.Aula = Aula;
        this.CoordenadasAltitud = CoordenadasAltitud;
        this.CoordenadasLatitud = CoordenadasLatitud;
    }

    public String getAula() {
        return Aula;
    }

    public String getCoordenadasAltitud() {
        return CoordenadasAltitud;
    }

    public String getCoordenadasLatitud() {
        return CoordenadasLatitud;
    }

    public String getAcademia() {
        return academia;
    }

    public String getCurso() {
        return curso;
    }

    public String getEstado() {
        return estado;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getInstructores() {
        return instructores;
    }

    public String getLinkToSyllabus() {
        return linkToSyllabus;
    }

    public String getLocal() {
        return local;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    
    
    
    
    
}
