package Ejercicio01;

public class Domicilio {
	
	//Atributos
	private String calle;
	private String direccion;
	private int cp;
	private String zona;
	private String ciudad;
	private String provincia;
	
	//Constructores
	public Domicilio() {
		
	}

	public Domicilio(String calle, String direccion, int cp, String zona, String ciudad, String provincia) {
		this.calle = calle;
		this.direccion = direccion;
		this.cp = cp;
		this.zona = zona;
		this.ciudad = ciudad;
		this.provincia = provincia;
	}

	
	
	
	//Métodos
	
	
	public String getCalle() {
		return calle;
	}

	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", direccion=" + direccion + ", cp=" + cp + ", zona=" + zona + ", ciudad="
				+ ciudad + ", provincia=" + provincia + "]";
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	

	
}
