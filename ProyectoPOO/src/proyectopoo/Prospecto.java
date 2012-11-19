/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.Date;

/**
 *
 * @author anyelomenachoflores
 */
public class Prospecto {
    
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String Correo;
    private String Dni;
    private String TelefonoFijo;
    private String Celular;
    private Date FechaContacto;

    public Prospecto(String nombre, String apellidopaterno, String apellidomaterno, String correo, String dni, String telefonofijo, String celular) {
        this.Nombre = nombre;
        this.ApellidoPaterno = apellidopaterno;
        this.ApellidoMaterno = apellidomaterno;
        this.Correo = correo;
        this.Dni = dni;
        this.TelefonoFijo = telefonofijo;
        this.Celular = celular;
        this.FechaContacto = new Date();
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String apellidomaterno) {
        this.ApellidoMaterno = apellidomaterno;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String apellidopaterno) {
        this.ApellidoPaterno = apellidopaterno;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        this.Correo = correo;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        this.Dni = dni;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        this.Celular = celular;
    }

    public Date getFechaContacto() {
        return FechaContacto;
    }

    public void setFechaIngreso(Date fechacontacto) {
        this.FechaContacto = fechacontacto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getTelefonofijo() {
        return TelefonoFijo;
    }

    public void setTelefonofijo(String telefonofijo) {
        this.TelefonoFijo = telefonofijo;
    }
}
