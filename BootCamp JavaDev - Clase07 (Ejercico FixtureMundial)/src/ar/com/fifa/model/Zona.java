package ar.com.fifa.model;

import java.util.ArrayList;
import java.util.List;

public class Zona {
	
	//Atributos
	private String nombre_zona;
	private List <Fecha> fechas;
	
	
	//Constructores
	public Zona() {
		fechas = new ArrayList<Fecha>();
	}

	
	//Métodos
	public List<Fecha> getFechas() {
		return fechas;
	}

	public void setFechas(List<Fecha> fechas) {
		this.fechas = fechas;
	}
	
	public void setFechas(Fecha fecha) {
		this.fechas.add(fecha);
	}
	
	
	public String getNombre_zona() {
		return nombre_zona;
	}


	public void setNombre_zona(String nombre_zona) {
		this.nombre_zona = nombre_zona;
	}


	public void ListarFechas() {
		int i = 0;
		for (Fecha f : fechas) {
			i++;
			System.out.println(". Fecha " + i);
			f.ListarPartidos();
		}
	}
}
