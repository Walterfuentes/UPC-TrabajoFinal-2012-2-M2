/*
 Historia Clientes Realizado por Walter Fuentes
 * 
 */
package proyectopoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author walterfuentes
 */
public class AdminClientes extends Clientes{
    
   private ArrayList<Clientes> AlmacenaClientes;
   private int idCliente;
   private int transacciones;
   private Clientes persona;
   
   
    public AdminClientes(int idCliente, String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni, String telefonofijo, String celular, String fechaIngreso, int transacciones) {
        super(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso);
        this.idCliente = idCliente;
        this.transacciones = transacciones;
    }
    
    public AdminClientes(){
        AlmacenaClientes = new ArrayList<Clientes>(); 
    }
    
 public void IngresaClientesSinProspecto(String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni, String telefonofijo, String celular, String fechaIngreso, int transacciones) {
        int aux = 0; //iD autocliente se autoinicia;
       
        Clientes nueva = new AdminClientes(aux, nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso, transacciones);
//        if(nueva.validarDatosProspecto(nueva) == null)
//        if(BuscaCliente(nombre) ==null)
//        AlmacenaClientes.add(aux, nueva);
//        aux++;
 }

 public void ImprimelistadeClientes() {
        for (Clientes aux : AlmacenaClientes) {
            System.out.println(aux.getNombre());
        }
    }
 
 public Clientes BuscaCliente(String Dato) { //Ingresar DNI, nombre o Apellido
        for (Clientes aux : AlmacenaClientes) 
        if ((Dato.equalsIgnoreCase(aux.getNombre())) || (Dato.equalsIgnoreCase(aux.getApellidoPaterno())) || (Dato.equalsIgnoreCase(aux.getDni()))) 
                return aux;
             return null;
}
        
// 
// public boolean MetodoBuscaryAgregarCliente(String Dato){
//        String Mensaje = " ";
//        boolean respuesta;
//        
//        BuscaCliente(Dato);
//        if(BuscaCliente(Dato)== (null)){
//        respuesta = true;   
//        Scanner mensaje = new Scanner(System.in);
//        Mensaje = " Desea Ingresar cliente";
//        String cadena = mensaje.nextLine();
////        if(cadena.equalsIgnoreCase("Si"))
////        IngresaClientesSinProspecto(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular, fechaIngreso, transacciones);
////        
////        }else{
////           respuesta = false;
////        }
//        return respuesta;
//    }
// 
////  public void IngresaProspecto(Clientes prospecto) {
////        AlmacenaClientes.add(prospecto);
////
////    }
//// }
// }}
 
}