
package Proyecto;

import java.util.Scanner;


public class Principal {   
   static Scanner entrada = new Scanner(system.in);
   final static int num = 2;//numero de aerpouertos 
   static Aeropuerto aeropuertos[] = new Aeropuerto[num]
     
   public static void main (String [] args){
     //  insertar los datos de los aeropuerto      
   } 
   public static void insertarDatosAeropiuerto(Aeropuerto aero[]){
       aero[0] = new AeropuertoPublico(80000000,"Yariguies","BCA","Colombia");
       aero[0].insertarCompañia(new compañia("AeroDespega"));
       aero[0].insertarCompañia(new compañia("AeroBarranca"));
       
       aero[0].getCompañia("AeroDespega").insertarVuelo
        (new Vuelo("IB20","barrancabermeja","bucaramanga",149.990,150));
       aero[0].getCompañia("AeroDespega").insertarVuelo
        (new Vuelo("INB21","barrancabermeja","barranquilla",180,120));
       aero[0].getCompañia("AeroBarranca").insertarVuelo
        (new Vuelo("FC12","bucaramanga","bogota"169.990,130));
       
     aero[0].getCompañia("AeroDespega").getVuelo("IB20").insertarPasajero
        (new pasajero("Luis","20Bghp","Colombia"));
     aero[0].getCompañia("AeroDespega").getVuelo("IB20").insertarPasajero
        (new pasajero("Maria","PJKL20","Ecuador"));
     aero[0].getCompañia("AeroBarranca").getVuelo("FC12").insertarPasajero
         (new pasajero ("pedro","JH21","colombia"));
   }
}
