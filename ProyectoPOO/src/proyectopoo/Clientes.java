/*
 Historia Personas Realizado por Walter Fuentes
 * 
 */
package proyectopoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author walterfuentes
 */
public class Clientes extends Personas{
    
   private ArrayList<Personas> AlmacenaClientes;
   private int idCliente;
   private int transacciones;
   private Personas persona;
   
   
    public Clientes(int idCliente, String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni, String telefonofijo, String celular, String fechaIngreso, int transacciones) {
        super(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso);
        this.idCliente = idCliente;
        this.transacciones = transacciones;
    }
    
    public Clientes(){
        AlmacenaClientes = new ArrayList<Personas>(); 
    }
    
 public void IngresaClientesSinProspecto(String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni, String telefonofijo, String celular, String fechaIngreso, int transacciones) {
        int aux = 0; //iD autocliente se autoinicia;
       
        Personas nueva = new Clientes(aux, nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso, transacciones);
        AlmacenaClientes.add(aux, nueva);
        aux++;
 }
 
 
 public void ImprimelistadeClientes() {
        for (Personas aux : AlmacenaClientes) {
            System.out.println(aux.getNombre());
        }
    }
 
 public Personas BuscaCliente(String Dato) { //Ingresar DNI, nombre o Apellido
        for (Personas aux : AlmacenaClientes) 
        if ((Dato.equalsIgnoreCase(aux.getNombre())) || (Dato.equalsIgnoreCase(aux.getApellidoPaterno())) || (Dato.equalsIgnoreCase(aux.getDni()))) 
                return aux;
             return null;
}
        
 
 public boolean MetodoBuscaryAgregarCliente(String Dato){
        String Mensaje = " ";
        boolean respuesta;
        
        BuscaCliente(Dato);
        if(BuscaCliente(Dato)== (null)){
        respuesta = true;   
        Scanner mensaje = new Scanner(System.in);
        Mensaje = " Desea Ingresar cliente";
        String cadena = mensaje.nextLine();
        if(cadena.equalsIgnoreCase("Si"))
        IngresaClientesSinProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso, transacciones);
        
        }else{
           respuesta = false;
        }
        return respuesta;
    }
 
  public void IngresaProspecto(Personas prospecto) {
        AlmacenaClientes.add(prospecto);

    }
 
 }