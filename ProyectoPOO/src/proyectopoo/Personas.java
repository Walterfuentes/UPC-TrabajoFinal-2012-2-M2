
package proyectopoo;

import java.util.ArrayList;

/**
 *
 * @author walterfuentes
 */
public class Personas {
    
    protected String nombre;
    protected String ApellidoPaterno;
    protected String ApellidoMaterno;
    protected String Correo;
    protected String Dni;
    protected String telefonofijo;
    protected String celular;
    protected String fechaIngreso;
    protected String nombreUsuario;
    protected String rol;
    protected String cargo;
    protected String contrasenia;
    

    public Personas(String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni, String telefonofijo, String celular, String fecha) {
        this.nombre = nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Correo = Correo;
        this.Dni = Dni;
        this.telefonofijo = telefonofijo;
        this.celular = celular;
        this.fechaIngreso = fecha;
    }

    public Personas(String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni, String fechaIngreso, String nombreUsuario, String cargo, String rol, String contrasenia) {
        this.nombre = nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Correo = Correo;
        this.Dni = Dni;
        this.fechaIngreso = fechaIngreso;
        this.nombreUsuario = nombreUsuario;
        this.cargo = cargo;
        this.rol = rol;
        this.contrasenia = contrasenia;
    }
    
    
    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefonofijo() {
        return telefonofijo;
    }

    public void setTelefonofijo(String telefonofijo) {
        this.telefonofijo = telefonofijo;
    }

    public String getCargo() {
        return cargo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getRol() {
        return rol;
    }
    
    
    public String validarDatosProspecto (Personas validar) {
        
        if(validar.getNombre()==null || validar.getNombre().isEmpty())
            return "Debe Ingresar Nombre";
        
        if(validar.getApellidoPaterno()==null || validar.getApellidoPaterno().isEmpty()) 
            return "Debe Ingresar Apellido Paterno";
        
        if(validar.getApellidoMaterno()==null || validar.getApellidoMaterno().isEmpty()) 
            return "Debe Ingresar Apellido Materno";
        
        if(validar.getCorreo()==null || validar.getCorreo().isEmpty()) 
            return "Debe Ingresar algun correo";
        
        if(validar.getDni()==null || validar.getDni().isEmpty()) 
            return "Debe Ingresar DNI";
        
        if(validar.getTelefonofijo()==null || validar.getTelefonofijo().isEmpty()) 
            return "Debe Ingresar algun Telefono";
        
        if(validar.getCelular()==null || validar.getCelular().isEmpty()) 
            return "Debe Ingresar algun Celular";  
        
        return null;
    }
   

public Personas BuscarDatos(ArrayList<Personas> nuevo, String datoEncontrar){
    for (Personas aux: nuevo)
        if(aux.getNombre().equals(datoEncontrar))
            return aux;
        
    return null;
}
   
}
