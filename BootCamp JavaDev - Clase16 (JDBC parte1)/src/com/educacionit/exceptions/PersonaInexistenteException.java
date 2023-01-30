package com.educacionit.exceptions;

public class PersonaInexistenteException extends Exception {
	
	@Override
	public String getMessage() {

		return "No existe el auto entre los registros de la DB";
	}

}
