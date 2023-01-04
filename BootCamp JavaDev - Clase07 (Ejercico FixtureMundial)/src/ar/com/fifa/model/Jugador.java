package ar.com.fifa.model;


public class Jugador {
	
	//Atributos
	private String name;
	private int edad;
	private String puesto;
	private String clubPertenencia;
	
	//Atributos Estadísticos
	private int goles;
	private int foulsRecibidos;
	private int tarjetasAmarillas;
	private int tarjetasRojas;
	

	//Constructores
	public Jugador() {
	}

	public Jugador(String name, int edad, String puesto, String clubPertenencia) {
		this.name = name;
		this.edad = edad;
		this.puesto = puesto;
		this.clubPertenencia = clubPertenencia;
	}
	
	
	//Métodos
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getClubPertenencia() {
		return clubPertenencia;
	}

	public void setClubPertenencia(String clubPertenencia) {
		this.clubPertenencia = clubPertenencia;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public int getFoulsRecibidos() {
		return foulsRecibidos;
	}

	public void setFoulsRecibidos(int foulsRecibidos) {
		this.foulsRecibidos = foulsRecibidos;
	}

	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}

	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

	public int getTarjetasRojas() {
		return tarjetasRojas;
	}

	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}

	@Override
	public String toString() {
		return  name + ", " + edad + " - " + puesto + ", "+ clubPertenencia + " (goles:" + goles + ", foulsRecibidos: " 
				+ foulsRecibidos + ", tarjetasAmarillas: "+ tarjetasAmarillas + ", tarjetasRojas: " + tarjetasRojas+")";
	}

	

	

	

}
