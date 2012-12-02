/*
 * Proyecto de POO - 2012 - 2
 */
package proyectopoo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//       int dato = 0;
//       String nuevo = String.format("%05d", ++dato);
//       
//       System.out.println(nuevo);
//       
//       
//       nuevo = String.format("P"+"%04d", ++dato);
//      
//       System.out.println(nuevo);
//       System.out.println(nuevo);
//    }



        //Date TestFecha;

        // TestFecha = new java.util.Date();

        //TestFecha = new Date();

        //        for(int i = 0; i < 5; i++){
//        System.out.println(TestFecha);
//    }
        // System.out.println(TestFecha);


        String [] datos = {"10/11/2012","09/11/2012","07/11/2012","15/09/2012"};

        for(int i = 0; i < datos.length; i++){
        try {
            Date birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(datos[i]);
            System.out.println(birthDate);
        } catch (Exception e) {
        }

        }
     

}
}
