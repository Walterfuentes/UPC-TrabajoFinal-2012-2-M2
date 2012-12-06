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
    public void validarNoAgregargruposDuplicados() {
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
        String academia2= "Academia02";
        String curso2="FORESTAL";
        String fechaInicio2= "03/11/2012";
        String fechaFin2= "23/11/2012"; 
        String estado2= "EN PROCESO";
        String instructores2= "Juan Alvarado";
        String linkToSyllabus2= "www.upc.edu.pe/Repo";
        String local2= "San Isidro";
        String Aula2 ="P24";
        String CoordenadasAltitud2 ="1000msm";
        String CoordenadasLatitud2="70° 55' 59";
        
        
        AdminGrupoEstudio nuevo = new AdminGrupoEstudio();
        Assert.assertTrue(nuevo.CrearGrupoEstudios(nombreGrupo, academia, curso, fechaInicio, fechaFin, estado, instructores, linkToSyllabus, local, Aula, CoordenadasAltitud, CoordenadasLatitud));
        Assert.assertFalse(nuevo.CrearGrupoEstudios(nombreGrupo2, academia2, curso2, fechaInicio2, fechaFin2, estado2, instructores2, linkToSyllabus2, local2, Aula2, CoordenadasAltitud2, CoordenadasLatitud2));
     }
     
     
     @Test
    public void validarBuscargruposEstudio() {
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
        
        
        String nombreGrupo2= "GrupoCinco";
        String academia2= "Academia02";
        String curso2="FORESTAL";
        String fechaInicio2= "03/11/2012";
        String fechaFin2= "23/11/2012"; 
        String estado2= "EN PROCESO";
        String instructores2= "Juan Alvarado";
        String linkToSyllabus2= "www.upc.edu.pe/Repo";
        String local2= "San Isidro";
        String Aula2 ="P24";
        String CoordenadasAltitud2 ="1000msm";
        String CoordenadasLatitud2="70° 55' 59";
        
        
        AdminGrupoEstudio nuevo = new AdminGrupoEstudio();
        Assert.assertTrue(nuevo.CrearGrupoEstudios(nombreGrupo, academia, curso, fechaInicio, fechaFin, estado, instructores, linkToSyllabus, local, Aula, CoordenadasAltitud, CoordenadasLatitud));
        Assert.assertTrue(nuevo.CrearGrupoEstudios(nombreGrupo2, academia2, curso2, fechaInicio2, fechaFin2, estado2, instructores2, linkToSyllabus2, local2, Aula2, CoordenadasAltitud2, CoordenadasLatitud2));
        Assert.assertTrue(nuevo.buscarGrupoEstudio("GrupoCinco"));
        
     }
     
      @Test
    public void validarNOBuscargruposEstudio() {
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
        
        
        String nombreGrupo2= "GrupoCinco";
        String academia2= "Academia02";
        String curso2="FORESTAL";
        String fechaInicio2= "03/11/2012";
        String fechaFin2= "23/11/2012"; 
        String estado2= "EN PROCESO";
        String instructores2= "Juan Alvarado";
        String linkToSyllabus2= "www.upc.edu.pe/Repo";
        String local2= "San Isidro";
        String Aula2 ="P24";
        String CoordenadasAltitud2 ="1000msm";
        String CoordenadasLatitud2="70° 55' 59";
        
        
        AdminGrupoEstudio nuevo = new AdminGrupoEstudio();
        Assert.assertTrue(nuevo.CrearGrupoEstudios(nombreGrupo, academia, curso, fechaInicio, fechaFin, estado, instructores, linkToSyllabus, local, Aula, CoordenadasAltitud, CoordenadasLatitud));
        Assert.assertTrue(nuevo.CrearGrupoEstudios(nombreGrupo2, academia2, curso2, fechaInicio2, fechaFin2, estado2, instructores2, linkToSyllabus2, local2, Aula2, CoordenadasAltitud2, CoordenadasLatitud2));
        Assert.assertFalse(nuevo.buscarGrupoEstudio("Grupotres"));
        
     }
      @Test
      public void ValidaBusquedaPorFiltro(){
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
        
        String nombreGrupo2= "GrupoCinco";
        String academia2= "Academia02";
        String curso2="FORESTAL";
        String fechaInicio2= "03/11/2012";
        String fechaFin2= "23/11/2012"; 
        String estado2= "EN PROCESO";
        String instructores2= "Juan Alvarado";
        String linkToSyllabus2= "www.upc.edu.pe/Repo";
        String local2= "San Isidro";
        String Aula2 ="P24";
        String CoordenadasAltitud2 ="1000msm";
        String CoordenadasLatitud2="70° 55' 59";
        
        AdminGrupoEstudio nuevo = new AdminGrupoEstudio();
        Assert.assertTrue(nuevo.CrearGrupoEstudios(nombreGrupo, academia, curso, fechaInicio, fechaFin, estado, instructores, linkToSyllabus, local, Aula, CoordenadasAltitud, CoordenadasLatitud));
        Assert.assertTrue(nuevo.CrearGrupoEstudios(nombreGrupo2, academia2, curso2, fechaInicio2, fechaFin2, estado2, instructores2, linkToSyllabus2, local2, Aula2, CoordenadasAltitud2, CoordenadasLatitud2));
       Assert.assertTrue(nuevo.filtrosBusqueda("GrupoEstudio", "GrupoCinco"));
        
      }
     
    
}
