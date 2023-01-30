package educacionit.entrega03.Exceptions;

public class RaizCuad_NumNeg_Exception extends Exception{
	
	@Override
	public String toString() {
		return "-- No se puede calcular la Raíz Cuadrada de un número negativo . Intente nuevamente ingresando un número (numA) mayor o igual que 0 (cero). --";
	}

	@Override
	public String getMessage() {
		return "-- No se puede calcular la Raíz Cuadrada de un número negativo . Intente nuevamente ingresando un número (numA) mayor o igual que 0 (cero). --";
	}

}
