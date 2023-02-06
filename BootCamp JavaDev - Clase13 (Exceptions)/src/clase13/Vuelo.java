package clase13;

public class Vuelo {
    
    private String nombreVuelo;
    private int cantidadPasajes;

    public Vuelo(String nombreVuelo, int cantidadPasajes) {
        this.nombreVuelo = nombreVuelo;
        this.cantidadPasajes = cantidadPasajes;
    }
    
    public synchronized void venderPasajes(int cantidadPasajesPedidos) throws NoHayMasPasajesException {
        if(cantidadPasajesPedidos>cantidadPasajes) {
            throw new NoHayMasPasajesException(nombreVuelo, cantidadPasajes, cantidadPasajesPedidos);
        }else{cantidadPasajes-=cantidadPasajesPedidos;}
    }
    
    @Override
    public String toString() {
        return "Vuelo{" + "nombreVuelo=" + nombreVuelo + ", cantidadPasajes=" + cantidadPasajes + '}';
    }

    public String getNombreVuelo() {
        return nombreVuelo;
    }

    public int getCantidadPasajes() {
        return cantidadPasajes;
    }
}
