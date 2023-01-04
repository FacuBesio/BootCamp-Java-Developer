package ar.com.fifa.model;

import java.util.ArrayList;
import java.util.List;

public class Fecha {
	
	//Atributos
	private List<Partido> partidos;

	
	//Constructores
	public Fecha() {
		partidos = new ArrayList<Partido>();
	}

	public Fecha(List<Partido> partidos) {
		this.partidos = partidos;
	}
	
	
	//Métodos
	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	} 
	
	public void setPartidos(Partido partido) {
		this.partidos.add(partido);
	}

	 
	
	public void ListarPartidos() {
		for (Partido p : partidos) {
			System.out.println(p.getEquipo1().getPais()+ " - " + p.getEquipo2().getPais());
			
		}
	}
	
	
	

}
