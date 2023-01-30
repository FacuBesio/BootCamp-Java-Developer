package educacionit.entrega03.Entities;

import educacionit.entrega03.Exceptions.DivisionCero_Exception;
import educacionit.entrega03.Exceptions.RaizCuad_NumNeg_Exception;

public class Calculadora {
	
	private static double resultado;
	
	
	// • SUMA
	public static void Suma(double numA, double numB) {
		resultado = numA + numB;
		imprimirResultado_Consola(numA, "+", numB);
	}
	
	// • RESTA
	public static void Resta(double numA, double numB) {
		resultado = numA - numB;
		imprimirResultado_Consola(numA, "-", numB);
	}

	// • MULTIPLICACIÓN
	public static void Multiplicacion(double numA, double numB) {
		resultado = numA * numB;
		imprimirResultado_Consola(numA, "*", numB);
    }
	
	// • DIVISIÓN
	public static void Division(double numA, double numB) throws DivisionCero_Exception {
		if (numB == 0) {
			throw new DivisionCero_Exception();
		}
		resultado = numA / numB;
		imprimirResultado_Consola(numA, "/", numB);
    }
	
	// • POTENCIA
	public static void Potencia(double numA, double numB) {
		resultado = Math.pow(numA, numB);
		imprimirResultado_Consola(numA, "^", numB);
	}
	
	// • RAÍZ CUADRADA
	public static void RaizCuadrada(double numA) throws RaizCuad_NumNeg_Exception {
		if (numA < 0) {
			throw new RaizCuad_NumNeg_Exception();
		}
		resultado = Math.sqrt(numA);
		imprimirResultado_Consola(numA, "√", 0);
	}
	

	//	Método para diferenciar e imprimir por Consola de una forma más legible entre números enteros y decimales.
	public static void imprimirResultado_Consola (double numA, String simbolo, double numB) {
		
		int parte_EnteraA = (int) numA;
		double parte_decimalA = numA - parte_EnteraA;
		
		int parte_EnteraB = (int) numB;
		double parte_decimalB = numB - parte_EnteraB;
		
		int parte_EnteraResultado = (int) resultado;
		double parte_decimalResultado = resultado - parte_EnteraResultado;
		
		if(parte_decimalA == 0) {
			System.out.print(parte_EnteraA);
		} else {
			System.out.print(numA);
		}
		
		System.out.print(" "+simbolo+" ");
		
		if(!(simbolo.equalsIgnoreCase("√")) & parte_decimalB == 0) {
			System.out.print(parte_EnteraB);
		} else if(!(simbolo.equalsIgnoreCase("√"))){
			System.out.print(numB);
		}
		
		if(parte_decimalResultado == 0) {
			System.out.println(" = " + parte_EnteraResultado);
		} else {
			System.out.println(" = " + resultado);
		}
		System.out.println();
	}
}