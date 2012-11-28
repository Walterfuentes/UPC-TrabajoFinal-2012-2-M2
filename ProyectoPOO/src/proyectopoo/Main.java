/*
 * Proyecto de POO - 2012 - 2
 */
package proyectopoo;

public class Main {
    
    public static void main(String[] args) {
       int dato = 0;
       String nuevo = String.format("%05d", ++dato);
       
       System.out.println(nuevo);
       
       
       nuevo = String.format("P"+"%04d", ++dato);
      
       System.out.println(nuevo);
       System.out.println(nuevo);
    }
    
}
