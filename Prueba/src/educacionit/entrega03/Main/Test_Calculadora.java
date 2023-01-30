package educacionit.entrega03.Main;

import java.util.InputMismatchException;
import java.util.Scanner;

import educacionit.entrega03.Entities.Calculadora;
import educacionit.entrega03.Exceptions.DivisionCero_Exception;
import educacionit.entrega03.Exceptions.RaizCuad_NumNeg_Exception;


public class Test_Calculadora {
	
	public static void main(String[] args)  {
		
		String operacion;
		double numA;
		double numB;
	    boolean testigo = true; 
	    
	    System.out.println("• CALCULADORA");
	    System.out.println("* En caso de utilizar números decimales recordar que los mismos deberan ser ingresados con ',' (coma). *");
	    System.out.println();
	    
	    while (testigo) {
	    	
	    	try {
	    		Scanner tecladoIn = new Scanner(System.in);
	    		System.out.println("Ingrese numA:");
		    	numA = tecladoIn.nextDouble();
		    	
				System.out.println("Operación aritmética (ingrese el símbolo):");
			    System.out.println("'+' (Suma) | '-' (Resta) | '*' (Multiplicación) | '/' (División) | '^' (Potencia) "
			    			     + "| '√' (Raíz cuadrada) | 'fin' (finalizar Calculadora)");
			    
			    operacion = tecladoIn.next();
			    if (	!(operacion.equalsIgnoreCase("+") | operacion.equalsIgnoreCase("-") | operacion.equalsIgnoreCase("*")
			    		| operacion.equalsIgnoreCase("/") | operacion.equalsIgnoreCase("^")) 
			    		|| operacion.equalsIgnoreCase("√") || operacion.equalsIgnoreCase("fin") ) {
			    	numB=0;
			    }else {
			    	System.out.println("Ingrese numB:");
					numB = tecladoIn.nextDouble();
				}
			    
			    switch (operacion){   
			    	case "+":
			    		Calculadora.Suma(numA, numB);
			    		break;
			        case "-":
			        	Calculadora.Resta(numA, numB);
			    		break;
			        case "*":
			        	Calculadora.Multiplicacion(numA, numB);
			            break;
			        case "/":
			        	Calculadora.Division(numA, numB);
			            break;
			        case "^":
			        	Calculadora.Potencia(numA, numB);
			            break;
			        case "√":
			        	Calculadora.RaizCuadrada(numA);
			            break;
			        case "fin":
			        	System.out.println("---- Fin Calculadora ----");
			        	tecladoIn.close();
			            testigo = false;
			            break;
			        default:
			        	System.out.println("-- Por favor ingrese únicamente el símbolo de la Operación Aritmética que desea realizar. "
			        			+ "Por ejemplo si desea Sumar, ingrese únicamente el símbolo '+'. Intente nuevamente. --");
			            break; 
			    }
	    	} catch (DivisionCero_Exception e) {
	    		System.out.println(e);
	    	} catch (RaizCuad_NumNeg_Exception e) {
	    		System.out.println(e);
	    	} catch (InputMismatchException e) {
	    		System.out.println("numA y numB solamente admiten valores númericos. Intente nuevamente.");
	    	} catch (Exception e) {
				System.out.println(e);
			}
	    }
	}

}


