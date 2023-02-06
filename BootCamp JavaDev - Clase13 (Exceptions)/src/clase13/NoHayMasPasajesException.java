package clase13;

public class NoHayMasPasajesException extends Exception {
    
    private String nombreVuelo;
    private int cantidadPasajes;
    private int cantidadPasajesPedidos;

    public NoHayMasPasajesException(String nombreVuelo, int cantidadPasajes, int cantidadPasajesPedidos) {
        this.nombreVuelo = nombreVuelo;
        this.cantidadPasajes = cantidadPasajes;
        this.cantidadPasajesPedidos = cantidadPasajesPedidos;
    }

    @Override
    public String toString() {
        return "El vuelo " + nombreVuelo + ", no tiene " + cantidadPasajesPedidos + ", solo tiene " + cantidadPasajes;
    }

    @Override
    public String getMessage() {
        return this.toString();
    }
    
    
    public String getNombreVuelo() {
        return nombreVuelo;
    }

    public int getCantidadPasajes() {
        return cantidadPasajes;
    }

    public int getCantidadPasajesPedidos() {
        return cantidadPasajesPedidos;
    }
    
    
    
    
}
