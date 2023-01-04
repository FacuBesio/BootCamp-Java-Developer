package ar.com.fifa.model;

import java.util.ArrayList;
import java.util.List;

public class CuerpoTecnico {

	//Atributos
	private String coach_name;
	private List <String> assistance;
	
	
	//Constructores
	public CuerpoTecnico() {
		assistance = new ArrayList<String>();
	}
	
	
	//Métodos
	public String getCoach_name() {
		return coach_name;
	}
	
	public void setCoach_name(String coach_name) {
		this.coach_name = coach_name;
	}
	public List<String> getAssistance() {
		return assistance;
	}
	public void setAssistance(List<String> assistance) {
		this.assistance = assistance;
	}
	
	public void setAssistance(String assistance) {
		this.assistance.add(assistance);
	}

	@Override
	public String toString() {
		return coach_name + ", assistance: " + assistance + "]";
	}
	
	
	
	
}
