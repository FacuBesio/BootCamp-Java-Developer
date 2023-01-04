package Ejemplo2_Aeropuerto;

public class AvionDePasajeros implements Volador {

	private String aerolinea;

	
	public AvionDePasajeros(String aerolinea) {
		this.aerolinea = aerolinea;
	}
	
	
	@Override
	public void aterrizar() {
		System.out.println("Aterriza AVION DE PASAJEROS");
		
	} 
	
	@Override
	public String toString() {
		return "AvionDePasajeros [aerolinea=" + aerolinea + "]";
	}


	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	
	
	
	
	
}
