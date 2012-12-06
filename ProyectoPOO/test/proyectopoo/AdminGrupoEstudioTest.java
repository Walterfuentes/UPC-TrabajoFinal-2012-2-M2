/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author walterfuentes
 */
public class AdminGrupoEstudioTest {
    
    public AdminGrupoEstudioTest() {
    }


    @Test
    public void ValidaAltaGrupoEstudio() {
        String nombreGrupo= "Grupo01";
        String academia= "Academia01";
        String curso ="POO";
        String fechaInicio= "03/11/2012";
        String fechaFin = "23/11/2012"; 
        String estado= "CANCELADO";
        String instructores= "Juan Alvarado";
        String linkToSyllabus= "www.upc.edu.pe/Repo";
        String local= "San Isidro";
        String Aula ="H24";
        String CoordenadasAltitud ="1000msm";
        String CoordenadasLatitud ="70° 55' 59";
        
        AdminGrupoEstudio nuevo = new AdminGrupoEstudio();
        Assert.assertTrue(nuevo.CrearGrupoEstudios(nombreGrupo, academia, curso, fechaInicio, fechaFin, estado, instructores, linkToSyllabus, local, Aula, CoordenadasAltitud, CoordenadasLatitud));
    }
    
    @Test
    public void ValidaCampoObligatorioNombreGupo() {
        String nombreGrupo= null;
        String academia= "Academia01";
        String curso ="POO";
        String fechaInicio= "03/11/2012";
        String fechaFin = "23/11/2012"; 
        String estado= "CANCELADO";
        String instructores= "Juan Alvarado";
        String linkToSyllabus= "www.upc.edu.pe/Repo";
        String local= "San Isidro";
        String Aula ="H24";
        String CoordenadasAltitud ="1000msm";
        String CoordenadasLatitud ="70° 55' 59";
        
        AdminGrupoEstudio nuevo = new AdminGrupoEstudio();
        Assert.assertFalse(nuevo.CrearGrupoEstudios(nombreGrupo, academia, curso, fechaInicio, fechaFin, estado, instructores, linkToSyllabus, local, Aula, CoordenadasAltitud, CoordenadasLatitud));
    }
    
    
    @Test
    public void ValidaCampoObligatorioFechaInicio() {
        String nombreGrupo= "Grupo01";
        String academia= "Academia01";
        String curso ="POO";
        String fechaInicio= null;
        String fechaFin = "23/11/2012"; 
        String estado= "CANCELADO";
        String instructores= "Juan Alvarado";
        String linkToSyllabus= "www.upc.edu.pe/Repo";
        String local= "San Isidro";
        String Aula ="H24";
        String CoordenadasAltitud ="1000msm";
        String CoordenadasLatitud ="70° 55' 59";
        
        AdminGrupoEstudio nuevo = new AdminGrupoEstudio();
        Assert.assertFalse(nuevo.CrearGrupoEstudios(nombreGrupo, academia, curso, fechaInicio, fechaFin, estado, instructores, linkToSyllabus, local, Aula, CoordenadasAltitud, CoordenadasLatitud));
    }
    
    
    @Test
    public void ValidaCampoObligatorioFechaFin() {
        String nombreGrupo= "NombreGrupo";
        String academia= "Academia01";
        String curso ="POO";
        String fechaInicio= "03/11/2012";
        String fechaFin = null; 
        String estado= "CANCELADO";
        String instructores= "Juan Alvarado";
        String linkToSyllabus= "www.upc.edu.pe/Repo";
        String local= "San Isidro";
        String Aula ="H24";
        String CoordenadasAltitud ="1000msm";
        String CoordenadasLatitud ="70° 55' 59";
        
        AdminGrupoEstudio nuevo = new AdminGrupoEstudio();
        Assert.assertFalse(nuevo.CrearGrupoEstudios(nombreGrupo, academia, curso, fechaInicio, fechaFin, estado, instructores, linkToSyllabus, local, Aula, CoordenadasAltitud, CoordenadasLatitud));
    }
    
     @Test
    public void ValidaBusquedaporEstado() {
        String nombreGrupo= "grupoNuevo";
        String academia= "Academia01";
        String curso ="POO";
        String fechaInicio= "03/11/2012";
        String fechaFin = "23/11/2012"; 
        String estado= "CANCELADO";
        String instructores= "Juan Alvarado";
        String linkToSyllabus= "www.upc.edu.pe/Repo";
        String local= "San Isidro";
        String Aula ="H24";
        String CoordenadasAltitud ="1000msm";
        String CoordenadasLatitud ="70° 55' 59";
        
        
        String nombreGrupo2= "grupoNuevo";
        String academia2= "Academia01";
        String curso2="POO";
        String fechaInicio2= "03/11/2012";
        String fechaFin2= "23/11/2012"; 
        String estado2= "CANCELADO";
        String instructores2= "Juan Alvarado";
        String linkToSyllabus2= "www.upc.edu.pe/Repo";
        String local2= "San Isidro";
        String Aula2 ="H24";
        String CoordenadasAltitud2 ="1000msm";
        String CoordenadasLatitud2="70° 55' 59";
        
        AdminGrupoEstudio nuevo = new AdminGrupoEstudio();
        
    }
    
}
