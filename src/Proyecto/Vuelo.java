
package Proyecto;


public class Vuelo {
  private String identificador;
  private String ciudadOrigen;
  private String ciudadDestino;
  private double precio;
  private int numMaxpasajeros;
  private int numActualpasajeros;
  private pasajero listaPasajeros[];

    public Vuelo(String identificador, String ciudadOrigen,String ciudadDestino,
double precio, int numMaxpasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxpasajeros = numMaxpasajeros;
        
        this.numActualpasajeros = 0;
        this.listaPasajeros = new pasajero[numMaxpasajeros];
    }
  
  public void insertarPasajero(Pasajero Pasajero){
      
      listaPasajeros[numActualpasajeros] = pasajero; 
      numActualpasajeros++;
  }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaxpasajeros() {
        return numMaxpasajeros;
    }

    public int getNumActualpasajeros() {
        return numActualpasajeros;
    }
  
  
    public pasajero getpasajero(int i){
    return listapasajeros[i];    
        
        
    }
    
    public pasajero getPasajero(String pasaporte){
        boolean encontrado = false;
        int i = 0;
        Pasajero pas=null;
        while((encontrado==false)&&(i<listapasajero.length));
        if (Pasaporte.equals(listapasajeros[i].getpasaporte())){
            
            encontrado = true;
            pas =listapasajeros[i];
        }
        i++;
    }
    return pas;

    Object getIdentificador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
