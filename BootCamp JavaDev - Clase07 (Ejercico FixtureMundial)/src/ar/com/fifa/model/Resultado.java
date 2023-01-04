package ar.com.fifa.model;

public class Resultado {
	
	//Atributos
	private Equipo equipo1;
	private int cantGoles_equipo1;
	private Equipo equipo2;
	private int cantGoles_equipo2;
	
	
	
	
	public Resultado(Equipo equipo1, int cantGoles_equipo1, Equipo equipo2, int cantGoles_equipo2) {
		this.equipo1 = equipo1;
		this.cantGoles_equipo1 = cantGoles_equipo1;
		this.equipo2 = equipo2;
		this.cantGoles_equipo2 = cantGoles_equipo2;
	}
	
	
	
	//Métodos
	public String Resultado_Final() {
		if (cantGoles_equipo1 > cantGoles_equipo2) {
			return equipo1.getPais();
		}else if (cantGoles_equipo2 > cantGoles_equipo1) {
			return equipo2.getPais();
		}else {
			return "EMPATE";
		}
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public int getCantGoles_equipo1() {
		return cantGoles_equipo1;
	}

	public void setCantGoles_equipo1(int cantGoles_equipo1) {
		this.cantGoles_equipo1 = cantGoles_equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public int getCantGoles_equipo2() {
		return cantGoles_equipo2;
	}

	public void setCantGoles_equipo2(int cantGoles_equipo2) {
		this.cantGoles_equipo2 = cantGoles_equipo2;
	}
	
	
	
	
	
	
	
	
}
