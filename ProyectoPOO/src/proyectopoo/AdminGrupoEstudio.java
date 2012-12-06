/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.ArrayList;
import java.util.Comparator;


/**
 *
 * @author AnyeloMenacho
 */
public class AdminGrupoEstudio {
    
    private ArrayList<GrupoEstudio> almacenagrupoestudio;
    private String CampoBusqueda;
    
    public AdminGrupoEstudio() {
        almacenagrupoestudio = new ArrayList<GrupoEstudio>();
        this.CampoBusqueda = "";
        
    }

    public ArrayList<GrupoEstudio> getAlmacenagrupoestudio() {
        return almacenagrupoestudio;
    }
    
    
    public String validarDatosMandatorios(String nombreGrupo, String fechaInicio, String fechaFin) {
        
        String mensaje="correcto";
        
        if(nombreGrupo==null || nombreGrupo.isEmpty()){
            mensaje = "Debe Ingresar Nombre de Grupo";}
        
        if(fechaInicio==null || fechaInicio.isEmpty()){
            mensaje = "Debe Ingresar Fecha de Inicio";}
        
        if(fechaFin==null || fechaFin.isEmpty()){
            mensaje = "Debe ingresar Fecha Final";}
        
        return mensaje;
    }

    public String getCampoBusqueda() {
        return CampoBusqueda;
    }

    public void setCampoBusqueda(String CampoBusqueda) {
        this.CampoBusqueda = CampoBusqueda;
    }
    
    public int obtenerCantidadGrupoDeEstudio() {
        return almacenagrupoestudio.size();
    }
    
    
    public boolean CrearGrupoEstudios(String nombreGrupo, String academia, String curso, String fechaInicio, String fechaFin, String estado, String instructores, String linkToSyllabus, String local, String Aula, String CoordenadasAltitud, String CoordenadasLatitud){
        if(validarDatosMandatorios(nombreGrupo, fechaInicio, fechaFin).equals("correcto") && DuplicidadGrupoEstudio(nombreGrupo)==false){
        GrupoEstudio nuevo = new GrupoEstudio(nombreGrupo, academia, curso, fechaInicio, fechaFin, estado, instructores, linkToSyllabus, local, Aula, CoordenadasAltitud, CoordenadasLatitud);
        almacenagrupoestudio.add(nuevo);
        return true;
        }else{
            return false;
        }
    }
    
    public boolean DuplicidadGrupoEstudio(String nombreGrupo) {
        
        boolean Respuesta = false;
        
        for(GrupoEstudio dato : almacenagrupoestudio) {
            if(dato.getNombreGrupo().equalsIgnoreCase(nombreGrupo)) 
                Respuesta = true;
            }
        
        return Respuesta;
    }   
   
    public boolean filtrosBusqueda(String CampoBusqueda, String DatoBuscar){
        if(CampoBusqueda.equalsIgnoreCase("GrupoEstudio")){
            return buscarGrupoEstudio(DatoBuscar);
        }else{
             return false;
        }
        }
    
    
    
    public Boolean buscarGrupoEstudio(String DatoBusqueda) {
        
        boolean mensaje = false;
        for(GrupoEstudio dato : almacenagrupoestudio) {
            if(dato.getNombreGrupo().equalsIgnoreCase(DatoBusqueda)) {
                System.out.println("Datos Encontrados: " + dato.getNombreGrupo());
                mensaje=true;
            }
        }
        return mensaje;
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
class FechaInicioComparator implements Comparator<GrupoEstudio> {

    @Override
    public int compare(GrupoEstudio uno, GrupoEstudio dos) {
        return uno.getFechaInicio().compareTo(dos.getFechaInicio());
    }
    
   
    
    }