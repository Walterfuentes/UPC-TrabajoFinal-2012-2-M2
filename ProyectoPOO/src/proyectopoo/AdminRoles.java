/*
 * Historia de Usuario: AdminRoles
 * Desarrollado: Carlos Ricaldi
 */
package proyectopoo;

import java.util.ArrayList;

public class AdminRoles {
    
    private ArrayList<Roles> listaRoles;
      ArrayList<Boolean> Permisos;
    
    
    public AdminRoles(){
        listaRoles = new ArrayList<Roles>();
        Permisos = new ArrayList<Boolean>();
        
        
    }
    
    public boolean AgregarRoles(String NombreRol ,String descripcion, boolean Acceso, boolean Adicionar, boolean Eliminar, boolean Editar){
        if (ValidaRCamposRol(NombreRol, descripcion).equalsIgnoreCase("Datos Correctos")){
        AgregarPermisos(Acceso, Adicionar, Eliminar, Editar);
        Roles nuevoRol = new Roles(NombreRol, descripcion, Permisos);
        listaRoles.add(nuevoRol);
        return true;
        }else{
        return false;
        }
    }
    
  
    public boolean AgregarPermisos(boolean Acceso, boolean Adicionar, boolean Eliminar, boolean Editar){
         
        Permisos.add(Acceso);
        Permisos.add(Adicionar);
        Permisos.add(Eliminar);
        Permisos.add(Editar) ;
        
        return false;
    }
    
    
    
    public String ValidaRCamposRol(String NombreRol ,String descripcion){
        
         String Respuesta = "Datos Correctos";

        if (NombreRol == null || NombreRol.isEmpty()) {
            Respuesta = "Falta Nombre del Rol";
        }

        if (descripcion == null || descripcion.isEmpty()) {
            Respuesta = "Falta Descripción";
        }

        if (NombreRol == null || NombreRol.isEmpty() && (descripcion == null || descripcion.isEmpty())) {
            Respuesta = "Falta Llenar Campos Nombre Rol y Descripción";
        }

        return Respuesta;
    }
    
    
    public boolean buscarRoles(String NombreRol){
        for(Roles aux: listaRoles){
            if(NombreRol.equalsIgnoreCase(aux.getNombre()))
                return true;
        }
        return false;
    }
    
    
     public boolean imprimeRoles(String NombreRol){
        for(Roles aux: listaRoles){
            if(NombreRol.equalsIgnoreCase(aux.getNombre()))
                System.out.println(aux.getNombre());
                return true;
        }
        return false;
    }

}
