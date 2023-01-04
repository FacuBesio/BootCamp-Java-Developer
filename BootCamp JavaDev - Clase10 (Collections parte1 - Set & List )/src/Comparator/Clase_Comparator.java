package Comparator;

import java.util.Comparator;

public class Clase_Comparator implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {

		int orden_nombre = p1.getNombre().compareTo(p2.getNombre());
        if (orden_nombre == 0){
            return (p1.getEdad() - p2.getEdad());
        }
		
		return orden_nombre;
	}

}
