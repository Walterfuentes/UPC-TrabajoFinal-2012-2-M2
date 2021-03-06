
package proyectopoo;

/**
 *
 * @author AnyeloMenacho
 */
public class Usuarios {
    
     
    private String Dni;
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String Usuario;
    private String Correo;
    private String FechaIngreso;
    private String Cargo;
    private String Rol;
    private String Contrasenia;
    private int transacciones;

    public Usuarios(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String usuario, String correo, String fechaIngreso, String cargo, String rol, String contrasenia, int transacciones) {
        this.Dni= dni ;
        this.Nombre= nombre;
        this.ApellidoPaterno= apellidoPaterno;
        this.ApellidoMaterno = apellidoMaterno;
        this.Usuario= usuario;
        this.Correo = correo;
        this.FechaIngreso = fechaIngreso;
        this.Cargo= cargo;
        this.Rol = rol;
        this.Contrasenia = contrasenia;
        this.transacciones= transacciones;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.ApellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.ApellidoMaterno = apellidoMaterno;
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

    public int getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(int transacciones) {
        this.transacciones = transacciones;
    }

    
    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.FechaIngreso = fechaIngreso;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        this.Usuario = usuario;
    }
    
    public String getCargo() {
        return Cargo;
    }
    
    public void setCargo(String cargo) {
        this.Cargo=cargo;
    }
    

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        this.Rol = rol;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.Contrasenia = contrasenia;
    }
    
}
