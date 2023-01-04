package Ejercicio01;

public class MainPersona {

	public static void main(String[] args) {
		
		Documento documento1= new Documento ("dni", 35147852, 000014523654);
		Domicilio domicilio1 = new Domicilio ("Moreno", "1458", 1644, "Victoria", "San Fernando", "Bs. As.");
		Persona persona1 = new Persona("Carlos","Garcia","Masculino", 32, documento1, domicilio1, "Argentino");
		
		System.out.println(persona1);

	}

}
