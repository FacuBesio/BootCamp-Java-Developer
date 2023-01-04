package ar.com.fifa.model;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	//Atributos
	private String pais;
	
	//Atributos Estadísticos
	private int puntos;
	private int partidosGanados;
	private int partidosPerdidos;
	
	private List <Jugador> jugadores; 
	private CuerpoTecnico cuerpoTecnico;
	
	
	//Constructores
	
	public Equipo() {
		jugadores = new ArrayList<Jugador>();
	}
	
	public Equipo(String pais) {
		this.pais = pais;
		jugadores = new ArrayList<Jugador>();
	}
	
	
	//Métodos
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getPartidosGanados() {
		return partidosGanados;
	}
	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}
	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}
	public void setPartidosPerdidos(int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}
	public List<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public CuerpoTecnico getCuerpoTecnico() {
		return cuerpoTecnico;
	}
	public void setCuerpoTecnico(CuerpoTecnico cuerpoTecnico) {
		this.cuerpoTecnico = cuerpoTecnico;
	}


	
	public void setJugadores(Jugador jugador) {
		this.jugadores.add(jugador);
	}
	
	
	@Override
	public String toString() {
		return  pais + " - puntos:" + puntos + ", partidosGanados:" + partidosGanados
				+ ", partidosPerdidos:" + partidosPerdidos;
	}


	
	
	
	
	
	
}
