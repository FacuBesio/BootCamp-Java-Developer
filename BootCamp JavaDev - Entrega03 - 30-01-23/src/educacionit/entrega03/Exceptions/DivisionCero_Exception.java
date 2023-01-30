package educacionit.entrega03.Exceptions;

public class DivisionCero_Exception extends Exception{

	@Override
	public String toString() {
		return "-- No se puede dividir por 0 (cero). Intente nuevamente ingresando un Divisor (numB) distinto de 0 (cero). --";
	}

	@Override
	public String getMessage() {
		return "-- No se puede dividir por 0 (cero). Intente nuevamente ingresando un Divisor (numB) distinto de 0 (cero). --";
	}
}
