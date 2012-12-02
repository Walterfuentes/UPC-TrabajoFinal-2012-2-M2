/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;
import java.util.*;
import java.text.*;


/**
 *
 * @author AnyeloMenacho
 */
public class GrupoEstudio {
    
    private String codigoGrupo;
    private String nombreGrupo;
    private String academia;
    private String curso;
    private String fechaInicio;
    private String fechaFin;
    private String estado;

    public GrupoEstudio(String codigoGrupo, String nombreGrupo, String academia, String curso, String fechaInicio, String fechaFin, String estado) {
        this.codigoGrupo = codigoGrupo;
        this.nombreGrupo = nombreGrupo;
        this.academia = academia;
        this.curso = curso;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }
    
    public String getAcademia() {
        return academia;
    }

    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
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
    
    
    
    
}
