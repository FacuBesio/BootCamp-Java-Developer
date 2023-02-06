package Calculadora_Ejemplos;

public class DivisionPorCero_Excepcion extends Exception{
	
	@Override
    public String toString() {
        return "toString(): No se puede dividir por cero (ejecutado desde Clase DivisionPorCero_Excepcion)";
    }

    @Override
    public String getMessage(){
    return "getMessage(): No se puede dividir por cero (ejecutado desde Clase DivisionPorCero_Excepcion)";
    }
	
}
