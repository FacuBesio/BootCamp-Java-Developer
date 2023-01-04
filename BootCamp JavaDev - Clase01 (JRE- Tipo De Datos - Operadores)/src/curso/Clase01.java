package curso;

import java.util.Scanner;

public class Clase01 {
	
public static void main(String[] args){
		
		/*Programar es basicamente un proceso donde hay datos de entrada que tienen que ser transformados para producir una salida. */
		
		//Entrada
		/*¿Cual es el dato que entra?*/
		
		//Proceso
		/*¿Como  se va a transformar el dato?*/
		
		//Salida
		/*El datos transformado*/
		System.out.println("Hello World");	
		
		
		// • Scanner
		Scanner entradaDato = new Scanner(System.in); 
		
		System.out.println("Por favor ingrese un valor númerico");
		
		int in = entradaDato.nextInt();
		
		System.out.println("Usted ha ingresado el número: "+in);
		
		
		// • Clase Math sirve para realizar operaciones Matematicas.
		double potencia = Math.pow(4, 2); // Por ejemplo potencia (4 elevado a la 2) 
		
		System.out.println(potencia);
	} 

}
