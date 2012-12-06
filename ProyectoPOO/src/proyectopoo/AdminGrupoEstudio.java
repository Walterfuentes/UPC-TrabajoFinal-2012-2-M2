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
    
    ArrayList<GrupoEstudio> almacenagrupoestudio;
    
    public AdminGrupoEstudio() {
        almacenagrupoestudio = new ArrayList<GrupoEstudio>();
        
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
    
    public int obtenerCantidadGrupoDeEstudio() {
        return almacenagrupoestudio.size();
    }
    
    
    public boolean CrearGrupoEstudios(String nombreGrupo, String academia, String curso, String fechaInicio, String fechaFin, String estado, String instructores, String linkToSyllabus, String local, String Aula, String CoordenadasAltitud, String CoordenadasLatitud){
        if(validarDatosMandatorios(nombreGrupo, fechaInicio, fechaFin).equals("correcto")){
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
            if(dato.getNombreGrupo().equalsIgnoreCase(nombreGrupo)) {
                Respuesta = true;
            }
        }if(Respuesta==true) {
            System.out.println("Grupo de Estudio ya Existe");
         }   
        return Respuesta;
    }   
   
    public GrupoEstudio buscarGrupoEstudio(String nombreGrupo) {
        
        GrupoEstudio mensaje = null;
        for(GrupoEstudio dato : almacenagrupoestudio) {
            if(dato.getNombreGrupo().equalsIgnoreCase(nombreGrupo)) {
                System.out.println("Datos Encontrados: " + dato.getNombreGrupo());
                mensaje=dato;
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