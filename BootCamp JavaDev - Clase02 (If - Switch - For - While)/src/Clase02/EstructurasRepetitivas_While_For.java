/* 									
  									● ESTRUCTURAS DE CONTROL DE FLUJO: 'REPETITIVAS'
    								¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
. BLUCLE: Permiten REPETIR la ejecución de un bloque determinado de código. Sirven para el caso de querer ejecutar una determinada 
cantidad de veces un 'Bloque de codigos'. Se puede ejecutar una cantidad específica de veces o hasta que se cumpla una Condición 
determinada.


● BUCLE 'WHILE'
Permite ejecutar un bloque de código en forma repetitiva 'MIENTRAS' (while) se cumpla la 'Condición'. La 'Condición' se evalúa al inicio 
del ciclo. Si la condición es 'Verdadera', ingresa en el 'Bucle While' y se ejecutara el 'Bloque de Sentencias' correspondientes. Al
finalizar la ejecución del Bloque de Codigo se reevaluara la 'Condicion' nuevamente para verificar resultado tantas veces como sea 
necesario. Siempre que el resultado de la condición sea 'true' se volvera a ejecutar el Bloque de Codigo y se volvera a 
evaluar el resultado de la Condicion. UNICAMENTE cuando la condición de como resultado un valor 'false', dejara de ejecutar el bloque
de sentencias mencionado y continuara con el resto del programa.               

. Sintaxis 
                
    while(condición){

    	Bloque de Codigos;
	}
	
•  BUCLE DO WHILE
Esta Bucle es igual a la anterior, con la diferencia que la 'Condicion' se evalúa al final. La condición se evalúa al final 
del ciclo. El Bloque de Código se ejecutara al menos una vez, y luego se evaluara la 'Condicion'. Al igual que el 'While' 
cuando deje de cumplirse la condición, el programa saldra del Bucle y continúara con el resto. Entonces la única diferencia 
práctica entre el 'While' y 'Do-while' es que en este ultimo su 'Bloque de Codigos' se ejecutará como minimo una vez.
           
. Sintaxis BUCLE DO WHILE    

    do {
    
		Bloque de Codigos;
    	
	}      
    while(condición);
    

● BUCLE FOR
Es otra estructura de repeticion y la sentencia “for” realiza un bucle un determinado número de veces. Se puede explicar el 
funcionamiento del 'BUCLE FOR' a traves del 'While'.

        byte x=1;                   	// Inicializacion
        
        while (x<=15)                	// Condicion
        {   System.out.println(x);  	// Accion       (Condicion TRUE)
            ++x;                    	// Postaccion   (Condicion TRUE)
        }

        
    
El 'BUCLE FOR' es una Estructura de Repeticion pensada de forma tal que en el encabezado del mismo se defina la cantidad de veces 
que se ejecutara el Bloque de Codigos de una forma bastante legible y practica.        
Se lee de forma horizontal, en la 'Inicializacion' se declaran 'Variables' con su valor incial, en la 'Condicion' vamos a definir
generalmente la cantidad de veces que se ejecutara el bucle mediante algun Operador de Comparacion, en la 'Accion' las 
sentencias que se ejecutaran en bucle y en 'Postaccion' la última sentencia (antes de evaluar nuevamente si se cumple o no la 
Condición).

En el campo 'Inicializacion' se pueden declarar mas de una variable seprando las mismas con , (coma).
Las Variables que se declaran en la 'Inicializacion' del 'FOR', sirven solamente para usarse mientras se ejecuta
el Bucle. Una vez finalizado el mismo se liberan dichas Variables y en el caso de querer volver a usarlas, se deben 
declarar nuevamente desde cero.
En el campo de la 'Postaccion' se puede declarar mas de una sentencia seprando las mismas con , (coma). En el campo de la 
'Accion' se puede declarar mas de una sentencia agrupando las mismas entre {} (llaves). 

.Sintaxis:
                
        for (Incializacion; Condicion; Postaccion){
         
            Accion;
        }
        
        .Ejemplo:
        
        for (byte i; i > valor; ++i){
        
        	sentencia_for;
        
        }
        
.Cuando en la Variables de Incialización empiezan a contar desde 1 (uno) y queremos hacer un numero determinado de cantidad de cuentas
se utiliza el operador igual (=) :  
									1 <= N (numero de cuentas)
                                    1 <= 15 (se realizaran 15 cuentas hasta llegar al resultado).
.Cuando se empieza a contar desde 0 (cero) y queremos hacer un numero determinado de cantidad de cuentas no se utiliza el operador (=):      0 < N (numero de cuentas)
                                    0 < 15 (se realizaran 15 cuentas hasta llegar al resultado).
                                    
La estructura de 'FOR' en una solo linea reune toda la infromacion del bucle, visualmente es mas claro para hacer CONTADORES.
En los casos en que la cantidad de repeticiones del BUCLE deben ser exactas se utiliza 'FOR', ya que en 'WHILE' es mas dificil
calcular la cantidad de veces que se quedara repitiendo el bucle.

Entonces cuando la cantidad de repeticiones no esta controlada por un 'Contador' se aconseja usar 'WHILE', mientras
que para los casos en los que la cantidad de repeticiones necesiten ser exactas se aconseja utilizar 'FOR'.


● BREAK AND CONTINUE
La manera estándar para salir de una estructura de bucle es que la condición de prueba principal se convierta en falsa, pero a veces es
necesario interrumpir la ejecución de un bucle for, while o do-while.
Los comandos especiales de Break y Continue ofrecen una salida lateral opcional de todos los tipos de bucles.
El comando 'break' sale del bucle más interno que la contiene. Hace que salga inmediatamente del bloque que se está ejecutando. Es 
válido para bifurcaciones y bucles.
El comando 'continue' salta hasta el final de la iteración actual del bucle más interno que lo contiene. Válido solo para bucles. 
Fuerza una próxima iteración sin ejecutar todas las sentencias que están después. Es decir, La sentencia continue fuerza al bucle a
comenzar la siguiente iteración desde el principio.

[code]
for (inicialización; expresionBooleana;
postAccion)
{
Sentencias;
break;
Sentencias;
}
[/code]

[code]
for (inicialización; expresionBooleana;
postAccion)
{
Sentencias;
continue;
Sentencias;
}
[/code]



*/
package Clase02;

public class EstructurasRepetitivas_While_For {

	public static void main(String[] args) {
		
		System.out.println("● BLUCE 'WHILE':");
        	
        int num_while=0;
        
        while (num_while<= 20){              
           System.out.println(num_while);  
            num_while++;
        }

//      System.out.println("");
//      System.out.println("• BLUCLE DO WHILE:");
//      
//      java.util.Scanner teclado = new java.util.Scanner (System.in);
//
//      int num_in; 
//      int suma=0;
//
//	    do{   
//	    	System.out.println("Ingrese un numero para sumar y cuando desee finalizar la suma ingrese -1");
//	        num_in= teclado.nextInt();
//	        
//	        if (num_in >= 0)
//	            suma += num_in;
//	    }
//	    while (num_in != -1);
//	    
//	    System.out.println("Bucle y sumatoria finalizada");
//      System.out.println("Total: " + suma);
//      System.out.println("");

	
        System.out.println("");
        System.out.println("• ESTRUCTURA FOR:");
        
        for (byte i=0; i<20; ++i){
		        
		 	System.out.println(i);
		 
		 }
     
	}
}
