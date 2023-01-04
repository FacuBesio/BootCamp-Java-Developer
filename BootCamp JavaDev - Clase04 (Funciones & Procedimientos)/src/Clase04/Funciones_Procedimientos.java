/*
													● METODOS (FUNCIONES Y PROCEDIMIENTOS)   

	Los METODOS son un 'Bloque de Codigos' especifico que cumplen una 'Funcion' en particular dentro del Programa. Ante la 
	necesidad de tener que reiterar el mismo 'Bloque de Codigos', para resolver el mismo problema en diferentes oportunidades, es que se
	van a utilizar los 'METODOS'. Son la accion que daria respuesta a la necesidad de resolver una misma situacion en reiteradas 
	oportunidades, por este motivo generalemente sus nombres se identifican con VERBOS. Es la posibilidad de empaquetar un Bloque de
	Codigos mediante un 'identificador', con el cual se podra invocar. Entonces en un Metodo se encontraran alojados Bloques de Codigos 
	que se ejecutaran al momento en el que Método sea invocado. 
	
	Mediante la utilizacion de 'Metodos' se puede dividir un problema complejo y extenso, en pequeños subproblemas. Permite delegar de 
	una forma mas clara funcionalidades especificas a distintas partes del Programa. Mejora la performance tecnica y hace mas 
	'legible' el Programa. Al momento de querer repetir un Bloque de Codigos en diferentes oportunidades, en lugar de escribir todas las 
	lineas reiteradamente, solo bastara con invocar el Metodo mediante su nombre. 
	
	Los 'Metodos, podemos definirlos en dos grandes grupos:
	
	• PROCEDIMIENTOS:
	  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨
	La caracteristica particular de los 'Procedimientos' es que al terminar la Ejecucion de su 'Bloque de Codigos', NO RETORNARAN
	un valor al regresar al 'main'. Es decir, seran unicamente de Ejecucion. 
	Los Procedimientos pueden recibir o no 'Parametros'. Los Paramentros seran un valor (o grupo de valores), que se podra 
	asignar al momento de invocar el Procedimiento. Dichos Parametros estaran asociado a la ejecucion interna del 'Bloque de Codigos'. 
	Los Parametros entonces seran un valor que los Métodos estaran esperando para ejecutar internamente dentro de su Bloque de Codigos, 
	según haya sido creado Método. Es importante recordar, que si el Procedimiento fue declarado con una determinada cantidad de 
	Parametros, al momento de invocar el mismo es sera hacerlo con la misma cantidad de valores.
	Un Método es tipo procedimiento en Java si comienza con la palabra reservada 'void', ya que la palabra 'void' indica que el Método
	retorna 'vacío', es decir, no tendra ningun retorno.
 
 	. PROCEDIMIENTO QUE NO RECIBE PARAMETROS
	 
		- DECLARACION:
	                 
	        static void Id_Procedimiento(){                                    
	
        		//codigo
        		 
	        }
	
	    - LLAMADO:
	
	            Id_Procedimiento();
	 
	 
	El '(tipo IdVar)' declarado como Parametro del procedimiento sera la variable que se utilizara dentro de su Bloque de Codigo y la misma tendra la 
	paricularidad de que su valor sera el equivalente al valor que se ingrese al momento de llamar al Procedimiento para su ejecucion. Se pueden declarar mas 
	de un Parámetro. Se deben seperar las mismas con , (coma). Siempre se debe escribir primero el 'tipo de dato', por mas que todas las variables a declrar 
	sean compatibles. 

	. PROCEDIMIENTO QUE RECIBE PARAMETROS
       
		- DECLARACION:
	
		    static void Id_Procedimiento (tipo IdVar){
		        	
		        	//codigo                            
		    }
		
		
		    static void NombreProcedimiento (tipo IdVar1, tipo IdVar2, tipo IdVar3 ..... tipo IdVarN){                                                  
		        	
		        	//codigo                            
		    }
	    
	    - LLAMADO:
	
	        Id_Procedimiento (valor);  
	
	        Id_Procedimiento (valor1, valor2, valor3 .... valor N); 

	Es importante recordar, que si el Procedimiento fue declarado con una determinada cantidad de Parametros', al momento de invocar el mismo es necesario hacerlo 
	con la misma cantidad. Es decir, no se podra dejar un 'Parametro' sin completar.
	
	
	• FUNCIONES:
 	  ¨¨¨¨¨¨¨¨¨
	Las FUNCIONES son de igual caracteristicas que los Procemientos, seran capaces de procesar la ejecucion de un 'Bloque de Codigos' pero
	con la diferencia de que si van a RETORNAR UN VALOR al final como resultado del proceso. Es decir, las Funciones podran realizar la
	ejecucion de un 'Bloque de Codigos' y devolver a la 'Linea de Ejecucion Principal' una respuesta como resultado. Esa respuesta sera 
	conocida como 'VALOR DE RETORNO' y tendra la palabra reservada 'RETURN' para accerder al mismo. El 'Valor de Retorno' es 
	una particularidad UNICAMENTE de las 'FUNCIONES'. 
	Una vez finalizado la ejecucion del 'Bloque de Codigo' se indicara mediante la palabra reservada 'RETURN' el valor que se desea que 
	retorne la Funcion a la Linea de Ejecucion Principal. Obviamente en la mayoria de los casos el 'Valor Retornado' estara relacionado 
	con el 'Bloque de Codigo' para que la 'Funcion' tenga sentido. 
	
	A diferencia de los Procedimientos las Funciones se identifican por que comienzan con un tipo de dato u objeto, y este mismo sera el 
	tipo de dato u objeto que retornara al finalizar su ejecución. Las Funciones utilizan 'void', ya que por definición siempre retornan
	un dato.
	
	- DECLARACION de 'FUNCIONES':

   		static Tipodato NombreFuncion (tipo IdVar){    
                ...
                //codigo
                ...
                return IdVarResultado;    Cuando la Funcion termina de ejecutar su bloque de codigos, vuelve a traves del 'Return'
        }                                 con el valor resultante para continuar ejecutando desde el punto del Main en el que fue 
                                          llamada. 


    Cuando se declara una 'Funcion' no se utiliza 'static void' sino 'static TipoDato', ya que el mismo indica al finalizar su ejecucion
    la 'Funcion' devolvera un 'tipo de dato' igual al declarado. Es decir, se acompaña la palabra 'static' con el 'tipo de dato' que la 
    Funcion va a 'Retornar' una vez que la misma finalice la ejecucion de su 'Bloque de Codigo' (ejemplo 'static double' indica que la
    funcion tiene por obejetivo 'Retonar' un 'dato double' cuando la misma finalice su ejecucion). 
    Entonces una vez que la 'Funcion' finalice de ejecutar su 'Bloque de Codigos', volvera a traves del 'return' con un valor para
    continuar ejecutando desde el punto en el que fue llamada desde el 'Main' y dicho valor se encontrara en la Variable indicada en el
    'return'.

    - LLAMADO DE 'FUNCIONES':
 
		Id_Funcion (valor);
	 
 */

package Clase04;

public class Funciones_Procedimientos {
	
		//• PROCEDIMIENTOS:
		// DECLARACION DE PROCEDIMIENTO
		static void Saludos()
	    {
	        System.out.println(" Hola Mundo desde 'Procedimiento Saludos ()' ");
	    }
		
		// DECLARACION DE PROCEDIMIENTO CON PARAMETROS
		static void ParImpar ( int num )
	    {
	        if (num%2 == 0)
	            System.out.println("PAR");
	        else
	            System.out.println("IMPAR");
	    }
		
		static void ParImparVarN ( int num1, int num2 )
	    {
	        if (num1%2 == 0)
	            System.out.println("num1: PAR");
	        else
	            System.out.println("num1: IMPAR");
	        if (num2%2 == 0)
	            System.out.println("num2: PAR");
	        else
	            System.out.println("num2: IMPAR");
	    }
		
		//• FUNCIONES:
			static double Sum ( double num1, double num2 ){
		        double resultado;
		        resultado = num1 + num2;
		        return resultado;                    
		    }
		
		
	

	// MAIN
	public static void main(String[] args) {
		
		//• PROCEDIMIENTOS:
		//LLAMADO DE PROCEDIMIENTO
		System.out.println("Saludos():");
		Saludos();
			
		//LLAMADO DE PROCEDIMIENTO CON PARAMETROS
		System.out.println("");
		System.out.println("ParImpar(x):");
		ParImpar(2);
		ParImpar(1);
		ParImpar(8);
		
		System.out.println("");
		System.out.println("ParImparVarN(x, y):");
		ParImparVarN(1, 2);
		ParImparVarN(4, 8);
		
		//• FUNCIONES:
		System.out.println("");
		System.out.println("Sum(x, y):");
		
		System.out.println(Sum(1, 1));
		System.out.println(Sum(2, 1));
		System.out.println(Sum(2, 4));
		System.out.println(Sum(4, 4));
		
		
		
		
		
		
		
		
	}

}
