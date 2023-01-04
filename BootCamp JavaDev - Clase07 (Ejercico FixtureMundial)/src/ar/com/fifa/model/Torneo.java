package ar.com.fifa.model;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
	
	//Atributos
	private List <Zona> zonas;

	//Constructores
	public Torneo() {
		zonas = new ArrayList<Zona>();
	}
	
	public List<Zona> getZonas() {
		return zonas;
	}


	public void setZonas(List<Zona> zonas) {
		this.zonas = zonas;
	} 
	
	public void setZonas(Zona zona) {
		this.zonas.add(zona);
	}
	
	
	public void ListarZonas() {
		for (Zona z : zonas) {
			System.out.println(z.getNombre_zona());
		}
	}
}
	
	
	
	
	


