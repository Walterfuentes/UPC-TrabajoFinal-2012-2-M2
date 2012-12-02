/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;
import java.util.*;
import java.text.*;

/**
 *
 * @author SoporteTI
 */
public class GrupoEstudio {
    
    private String codigoGrupo;
    private String nombreGrupo;
    private String academia;
    private String curso;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;

    public GrupoEstudio(String codigoGrupo, String nombreGrupo, String academia, String curso, String fechaInicio, String fechaFin, String estado) {
        try {
        this.codigoGrupo = codigoGrupo;
        this.nombreGrupo = nombreGrupo;
        this.academia = academia;
        this.curso = curso;
        this.fechaInicio = new SimpleDateFormat("dd/MM/yyyy").parse(fechaInicio);
        this.fechaFin = new SimpleDateFormat("dd/MM/yyyy").parse(fechaInicio);
        this.estado = estado;
        } catch (Exception e) {
            
        }
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

    public Date getFechaFin() {
        return fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }
    
    
    
    
}
