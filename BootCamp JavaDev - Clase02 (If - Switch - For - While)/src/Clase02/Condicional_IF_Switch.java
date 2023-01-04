/*  
        
 										ESTRUCTURA DE CONTROL DE FLUJO: 'CONDICIONALES'
									   ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
	En informatica se conoce como 'FLUJO' a el recorrido que va haciendo un programa en funcion de las instrucciones que va  
	ejecutando. En otras palabras, el orden en el se que ejecutan la instrucciones. 
	Las 'ESTRUCTURAS DE CONTROL DE FLUJO' son aquellas sentencias que a partir de una 'Condicion' van a ejecutar una opcion u otra. 
	Son sentencias que nos permiten tomar decisiones acerca de qué opcion debe ejecutar el programa, en base a una 
	'Condición/Expresión' Booleana (True/False). Mediante el resultado de una 'Condicion', se tomara un camino u otro, generenado 
	asi las llamadas Bifurcaciones, una apertura de dos caminos o mas, a partir de uno.

    
    ● CONDICIONAL 'IF':
        
	.Sintaxis:
        
    if  (condicion) {
    
        sentenciaTRUE;
    }
                            
	La estructura de control 'IF' permite decidir entre dos opciones resultantes de la evaluación de una CONDICIÓN. Si la condición
	es 'verdadera'(true) se ejecutaran las sentencias contenidas dentro sus {}. Por el contraio si el resultado de la condición es 
	'falso'(false) no se ejecutará el código declarado en su interior. 
	La CONDICIÓN siempre sera una OPERACIÓN LÓGICA o de COMPARACIÓN con un resultado BOOLEAN. Es decir, el resultado de la condicion 
	siempre sera un booleano verdadero o falso. Dicha 'Condicion' sera declarada dentro del () de la Sentencia IF. Siempre que el 
	resultado de la Condicion sea 'Verdadero' se ejecutara el bloque de codigos contenido, hasta que el resultado de la Condicion
	sea 'Falso'. En dicho momento simplemente el programa ignorara las sentencias contenidas dentro de las {} del 'IF' y continuara 
	con la ejecucion del programa.

    if (condicion)sentenciasTrue; => para una sola línea. 
    
	
	• CONDICIONAL 'IF ELSE'(si...sino/de lo contrario...):
	Es la extensión del Condicional 'IF'. Agrega el 'ELSE' que significa “sino / de lo contrario”. Como en el 'IF' en el caso de que 
	la Condicion sea 'true' ejecutara el bloque de codigo declarado dento de las {}, pero en el caso de que el resultado de la 
	Condicion sea 'false' va a ejecutar otro Bloque de Código definido. Es decir, que a diferencia del anterior 'if' cada Condicion 
	tendra su Bloque de Codigo, esto asegurara que el programa al pasar por un 'IF ELSE' ejecute un Bloque de Codigo si o si.
	
	.Sintaxis:

	if  (condicion){       
	
	    sentenciaTRUE;           
	
	}else{                  
	
	    sentenciaFALSE;     
	
	}
	
	'SI' se cumple esta CONDICION ejecuta sentenciaTRUE 'SINO' ejecuta sentenciaFALSE.
	
	
	• ESTRUCTURA 'IF ELSE IF ELSE' / 'ELSE IF:
	La estructura 'elseif' nos brinda una posibilidad de evaluar mas de una 'Condicion' mediante la concatenación de 'If Else' mas
	otros 'If Else'. Se pueden añidar tantos 'If ElSe' como se crea necesario, es decir, se pueden evaluar la cantidad de 
	'Condiciones' que se desee. Esta estructura es conocida com 'ELSE IF', pero es solo visual, no es otro tipo de estructura o 
	una nueva, sigue siendo 'IF ELSE'. El funcionamiento sera exactamente el mismo.                        
	
	.Sintaxis:

        if      (condicion 1)
                 sentencia1;
        
        else if (condicion 2) 
                 sentencia2;
        
        else if (condicion 3)
                {sentencia3;}
        
        else if (condicion N)
              {sentencia_IF_N;}
              
        else {sentencia_ELSE_N;} 
        
         
   	● ESTRUCTURA SWITCH
    La estructura 'Switch' admite múltiples Caminos a partir de la evaluación de una sola 'Expresión'. Dicha expresión se escribe
	como valor entre () y debera ser una Variable. Luego se comparara la 'Expresion' contra la 'Condicion' indicada para cada caso 
	(llamado 'Case') y a su vez cada 'Case' tendra su sentencia independiente. Tan pronto como el Valor de la Expresion sea 
	coincidente con la 'Condicion' de un 'Case', se ejecutaran las sentencias indicadas del mismo. Por ultimo se ejecutara el 'break'
	que nos sacara fuera del SWITCH para continuar con el programa. 
	Cabe aclarar que en el caso de que el valor ingresado en la 'Expresion' NO este comprendido en ninguna de las 'Condiciones' de 
	los 'Case', se ejecutara el 'DEFAULT' y su correspondiente sentencia. 
	Los unicos tipo de datos que permite la 'expresion' del 'Switch' son Numeros enteros, Char, String. 
	Su principal característica es que permite establecer muchas Opciones según el valor de una Variable (o expresión), a diferencia
	de la sentencia 'if', donde solo hay dos opciones (Verdadero – Falso).
    
    . Sintaxis: 
        
    switch (expresion){       
        case 1:
            sentencia1;
            break;        				El break marca el final de la sentencia del bloque de codigo, y nos saca fuera del switch.
        case 2:
            sentencia2;
            break;
        case 3:
            sentencia3;
            break; 
        case N:
            sentenciaN;
        default:               	 		En el caso de que ningun dato sea coincidente con el contenido dento de la 
            sentenciaDEFAULT;   		(expresion/opcion), el programa continuara por el camino 'default' y ejecutara la sentencia
            break;              		del mismo ('sentenciaDEFAULT')
    }


        
*/

package Clase02;

import java.util.Scanner;

public class Condicional_IF_Switch {

	public static void main(String[] args) {
		
		System.out.println("● ESTRUCTURA DE CONTROL DE FLUJO: 'CONDICIONALES'");
		System.out.println("• CONDICIONAL 'IF':");

		byte num =15, num2=25;
		
		// Ejemplo1:
		System.out.println(". Ejemplo1:");
		if( num < 20 ) {
			
			System.out.println("TRUE"); // Al cumplirse la condicion se ejecuta el comando indicado para la condicion 'True'.
		}
		
		System.out.println("Sentencia fuera del 'if'");
		
		// Ejemplo2:
		System.out.println();
		System.out.println(". Ejemplo2:");
		if( num2 < 20 ) {
			
			System.out.println("TRUE"); // Al cumplirse la condicion se ejecuta el comando indicado para la condicion 'True'.
		}
		
		System.out.println("Sentencia fuera del 'if'");
		
		/*En caso de no cumplirse con la Condicion y que el resultado sea 'FALSE' no se no ejecutara el bloque de codigos contenido 
		 dentro del 'if' y se continuara ejecutando el programa a partir del comando inmediato.*/
	
		System.out.println();
		System.out.println("• CONDICIONAL 'IF ELSE':");
		
		 
		//Ejemplo3
		System.out.println(".Ejemplo3:");
		if( num < 20 ) {
			
			 System.out.println("sentenciaTRUE");
		 
		 }else {               
		
			 System.out.println("sentenciaFALSE");
		 
		 }
		
		//Ejemplo4
		System.out.println();
		System.out.println(".Ejemplo4:");
		if( num2 < 20 ) {
			
			 System.out.println("sentenciaTRUE");
		 
		 }else {               
		
			 System.out.println("sentenciaFALSE");
		 
		 }
		
		
		System.out.println();
		System.out.println("• CONDICIONAL 'IF ELSE IF ELSE / ELSE IF':");
		 byte x=0;

	        if (x==10)
	            System.out.println("DIEZ");
	        else if (x ==20)
	            System.out.println("VEINTE");
	        else if (x==30)
	            System.out.println("TREINTA");
	        else
	            System.out.println("NINGUNO");
	        
	        
	        System.out.println("");
	        System.out.println(".ESTRUCTURA SWITCH");
	        System.out.println(". EJEMPLO A: ");

	        byte num_switch;
	        
	        num_switch = 8;
	        
	        switch (num_switch){   
        		case 10:
	                System.out.println("DIEZ");
	                break;
	            case 9:
	                System.out.println("NUEVE");
	                break;
	            case 8:
	                System.out.println("OCHO");
	                break;
	            case 7:
	                System.out.println("SIETE");
	                break;
	            default:
	                System.out.println("DEFAULT");
	                break; 
	        }
	        
	        System.out.println("");
	        System.out.println(". EJEMPLO B:");
	        
	        String string_switch;
	        
	        string_switch = "Hola Mundo!";
	        
	        switch (string_switch){   
        		case "a":
	                System.out.println("a");
	                break;
	            case "b":
	                System.out.println("b");
	                break;
	            case "c":
	                System.out.println("c");
	                break;
	            case "Hola Mundo!":
	                System.out.println("Hola Mundo!");
	                break;
	            default:
	                System.out.println("DEFAULT");
	                break; 
	        }
	        
	        
	        System.out.println("");
	        System.out.println(". EJEMPLO C:");
	        
	        string_switch = "c"; 
	        System.out.println(string_switch);
	        
	        switch (string_switch){                              // Se pueden agrupar dos condiciones para una misma sentencia. 
	            case "a":
	            case "b":
	                System.out.println("a o b");
	                break;
	            case "c":
	            case "d":
	                System.out.println("c o d");
	                break;
	            case "e":
	            case "f":
	                System.out.println("e o f");
	                break;
	            case "g":
	                System.out.println("g");
	                break;
	            default:
	                System.out.println("DEFAULT");
	                break; 
	        }
	        
	        System.out.println("");
	        System.out.println("EJEMPLO D: ");
	        
	        byte x_sw;
	        Scanner teclado = new Scanner(System.in);
	        
	        System.out.println("Ingrese Numero: ");
	        
	        x_sw = teclado.nextByte();
	        
	        switch (x_sw){   
	        	case 10:
	                System.out.println("DIEZ");
	                break;
	            case 9:
	                System.out.println("NUEVE");
	                break;
	            case 8:
	                System.out.println("OCHO");
	                break;
	            case 7:
	                System.out.println("SIETE");
	                break;
	            default:
	                System.out.println("DEFAULT");
	                break; 
            }
	        
	        System.out.println("");
	        System.out.println(". EJEMPLO E:");
	        
	        string_switch = "c"; 
	        System.out.println("Se ingreso el valor: " + string_switch);
	        
	        switch (string_switch){                              // Se puede 'compartir' el break, hasta que el sistema no encuentre un  
	            case "a":										 // va a ejecutar todas las sentencias. 													
	            	System.out.println("a");
	            case "b":
	                System.out.println("b");
	                break;
	            case "c":										
	            	System.out.println("c");
	            case "d":
	                System.out.println("d");
	                break;
	            default:
	                System.out.println("DEFAULT");
	                break; 
	        }
		
	}

}
