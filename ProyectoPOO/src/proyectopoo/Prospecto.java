/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.ArrayList;

/**
 *
 * @author anyelomenachoflores
 */
public class Prospecto {
    
    private ArrayList<Cliente> clientes;
    
    public Prospecto() {
        clientes=new ArrayList<Cliente>();
    }

    public void obtenerDatosProspecto(String nombre, String ApellidoPaterno, String ApellidoMaterno, String Correo, String Dni, String telefonofijo, String celular) {
        Cliente cliente=new Cliente(nombre, ApellidoPaterno, ApellidoMaterno, Correo, Dni, telefonofijo, celular);
        clientes.add(cliente);
    }
}
