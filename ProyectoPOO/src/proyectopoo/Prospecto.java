/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

/**
 *
 * @author walterfuentes
 */
public class Prospecto {
    
    private String codigoProspecto;
    private String nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String Correo;
    private String Dni;
    private String telefonofijo;
    private String celular;
    private String fechaIngreso;

    public Prospecto( String codigoProspecto, String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni, String telefonofijo, String celular, String fechaIngreso) {
        this.codigoProspecto = " ";
        this.nombre = nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Correo = Correo;
        this.Dni = Dni;
        this.telefonofijo = telefonofijo;
        this.celular = celular;
        this.fechaIngreso = fechaIngreso;
    }

    public String getCodigoProspecto() {
        return codigoProspecto;
    }

    public void setCodigoProspecto(String codigoProspecto) {
        this.codigoProspecto = codigoProspecto;
    }
    
    
    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getDni() {
        return Dni;
    }

    public String getCelular() {
        return celular;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefonofijo() {
        return telefonofijo;
    }
    
    
}
