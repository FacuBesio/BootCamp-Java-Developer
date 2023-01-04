package ar.com.fifa.model;

public class Partido {
	
	//Atributos
	private Equipo equipo1;
	private Equipo equipo2;
	private Resultado resultado;
	
	
	//Constructores
	public Partido(Equipo equipo1, Equipo equipo2) {
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}


	//Métodos
	public void Resultado_Partido(int cantGoles_equipo1, int cantGoles_equipo2) {
		
		resultado = new Resultado (equipo1, cantGoles_equipo1, equipo2, cantGoles_equipo2);
		System.out.println(equipo1.getPais() +" "+ cantGoles_equipo1 + " - " + equipo2.getPais() +" "+ cantGoles_equipo2);
		
		if (resultado.Resultado_Final().equalsIgnoreCase("EMPATE")){
			System.out.println("EMPATE");
		}else {
			System.out.println("GANADOR: " + resultado.Resultado_Final());	
		}
	}
	
	
	
	@Override
	public String toString() {
		return "equipo1:" + equipo1.getPais() + " - equipo2:" + equipo2.getPais();
	}


	public Equipo getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}
	public Equipo getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}
	public Resultado getResultado() {
		return resultado;
	}
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	} 
	
	
	
	

	 
	

	

}
