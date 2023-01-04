/* 													 ● VARIABLES
    												   ¨¨¨¨¨¨¨¨¨      
  Cuando vamos a guardar un dato se tiene que escecificar que tipo de datos se van a guardar en la Memoria, 
  cuanto va a ocupar, y en que lugar de la misma sera almacenado.

  . Memoria RAM: Solo quedan almacenados mientras la memoria recibe alimentacion. La velocidad de procesamiento es
  mucho mas rapido respecto al disco rigido.

  . Disco Rigido: Puede almacenar datos de forma permanente, sin la necesidad de alimentacion constante. El procesador
  va a registrar toda la informacion en la RAM, exepto aquellos datos que necesiten quedar registrados de forma 
  permanente, los cuales iran al disco rigido. 

  MEMORIA RAM 
  |(A = 8)| <- Numero Entero A = 8 (1 byte)
  |(B=8,4)| <- Tipo  Numero 
  |(B=8,4)|     de    Real   (4 Bytes)
  |(B=8,4)|    dato    B 
  |(B=8,4)| <-

  Para guardar un dato en la Memoria, primero debo reservar una porcion de la memoria, indicando el  
  tamaño y nombre del mismo. EL ESPACIO RESERVADO EN MEMORIA DONDE VAMOS A GUARDAR UN DATO SE LLAMA
  VARIABLE. Entonces cada Variable tendra su 'nombre propio' y  'tipo de dato'.

  Una VARIABLE es un nombre que se asocia con una porción de la memoria del ordenador, en donde se
  guarda el valor asignado a dicha variable. Consiste en un elemento al cual le damos un nombre y le
  atribuimos determinado tipo de información. Los datos que se manejan en nuestro programa se almacenan en 
  variables. El concepto de variable debe verse como un contenedor de información. Una variable es
  algo que cambia o varía. En Java, una variable almacena datos.

  .TIPO DE DATOS
              - NUMEROS ENTEROS: 
                          BYTE: -128 a 127. Se pueden almacenar solo numeros enteros dento de este rango. 
                                El byte es la unidad de medida de la Memoria, lo minimo que se puede ocupar.
                          SHORT: -32.768 a 32.767. Ocupa 2 bytes en la memoria. 
                          INT: -2.147.483.648 y 2.147.483.647. Se tiene que reservar 4 bytes en la memoria. 
                          LONG: -9.223.372.036.854.775.808 y 9.223.372.036.854.775.807. (8 bytes).

              - NUMEROS REALES:
                         FLOAT: 4 bytes (entre 6 y 7 cifras decimales equivalentes). Meneja 8 digitos de precision. 
                         Se utiliza el . (punto) para separar la parte entera de la decimal.
                         DOUBLE: 8 bytes (unas 15 cifras decimales equivalentes). Meneja 16 digitos de precision

              - CARACTERES
                         CHAR: Viene de la palabra Caracter y almacena unicamente uno solo. Los datos de tipo Char se representan
                         entre comillas simples 'Dato Char'; ejemplo 'a'. (2 Bytes)
                         STRING: Permite almacenar mas de caracter, puede almacenar texto. Tambien se representa entre comillas 
                         dobles "Dato txt"; ejemplo "hola mundo". (2 bytes por cada caracter).
              - LOGICA
                         BOOLEAN: Solo admite como valor un estado TRUE (verdadero) o un FALSE (falso). (1 byte)

  Se debe crear la variable correcta acorde a el rango correspondiente de dato que se va a ultilizar para administrar de 
  forma eficiente el espacio de la Memoria Ram y evitar que la misma se sature o reserve espacio demas en datos que necesitan 
  menos espacio. 

● DECLARACION DE VARIABLES: 
Para declarar una Variable primero se debe indicar el 'Tipo de Dato' seguido del 'Nombre/Id' (unico) que se le asignara a dicha 
Variable. Es importante recordar que no pueden existir dos Variables iguales. El nombre de la variable puede incluir, pero no 
comenzar por un número y tambien puede comenzar con "_" o "$".
                          (tamaño que va a ocupar en memoria) (nombre p/ ubicar dicho dato en la memoria)
      
  .Sintaxis:
                      ' tipo de variable  identificador; ' 
                          (tipo de dato)    (nombre)                            
      
  . Ejemplo:               byte numENTERObyte;
      
  Una vez declarada la VARIABLE, podremos asignarle un valor, simplemente con el operador de asignacion =.
                          
  Id_Variable = valor ; 
      
  Tambien se puede declarar directamente toda la variable junta en la misma linea ("byte num = 78").
  A ESTE PROCESO SE LO CONOCE COMO INCIAILIZAR UNA VARIABLE.
  

● CLASE STRING
Anteriormente habíamos conocidos los datos primitivos en Java y el tipo de dato string que nos ayuda representar una cadena de 
caracteres. Ahora bien, los String no son un tipo de dato primitivo sino un objeto. Por el momento, los objetos son un tipo de dato 
más complejo, queposee atributos y métodos que nos serán de gran utilidad a lo largo del desarrollo del software.
      
      
  */

package Clase01;

public class TipoDeDatos_Operadores {
	
	public static void main(String[] args){


 
	//	• NUMEROS ENTEROS:    
		System.out.println("● TIPO DE DATOS:");
		System.out.println("");
		System.out.println("• NUMEROS ENTEROS");
        System.out.println(". BYTE (-128 a 127): ");

        byte numENTERObyte;   //  (tipo de dato) (Nombre) 
      
        numENTERObyte = 78;   //  (Nombre/Id) = (Valor)     

        System.out.println ("numENTERObyte = " + numENTERObyte);    

    /*  Si vuelvo a cargar un dato sobre la misma posicion de memoria el compilador arrojara ambos datos, en forma secuencial. 
  		Cargara primero uno, y luego el otro.   
	*/ 

        numENTERObyte = 79; System.out.println("numENTERObyte = " + numENTERObyte);

        numENTERObyte = 80; System.out.println("numENTERObyte = " + numENTERObyte);
      
        System.out.println("");
        System.out.println(". SHORT (-32.768 a 32.767): ");
 
        short numENTEROshort = 203; System.out.println("numENTEROshort = " + numENTEROshort);

    /*  • NUMEROS REALES
      	Los NUMERO REALES se deben escribir con . (punto) y no con , (coma).   8.440 = SI    
                                                                               8,440 = NO
      	Por default al ingresar un valor el Compilador tomara cualquier NUMERO REAL como un DOUBLE. Si se desea ocupar 
      	solamente en memoria el espacio de un dato FLOAT, se debe aclarar al final del mismo con una 'f', de lo contrario el 
      	programa arrojara error.
      	EJEMPLO: float numeroReal = 8.6542  --> Error de compilacion NO.
                 float numeroReal = 8.6542f --> SI.                                                              
    */
      
        System.out.println("");        
        System.out.println(" • NUMEROS REALES");
        System.out.println(". FLOAT (4 bytes - Maximo 8 digitos despues de la coma):");
      
      
        float numREALfloat =  8.6542f; System.out.println("numREALfloat = " + numREALfloat);
      
        float numREALfloatb = 0.1234567890123456789f; System.out.println("numREALfloatb = " + numREALfloatb); 
      
    //  El FLOAT trabaja como maximo con 8 digitos despues de la coma (redondeando el ultimo)
      
        System.out.println("");
        System.out.println(". DOUBLE (8 bytes - Maximo 17 digitos despues de la coma):");
      
        double numREALdouble = 8.6542; System.out.println("numREALdouble = " + numREALdouble);
      
        double numREALdoubleb = 8.65421234567890123456789; System.out.println("numREALdoubleB = " + numREALdoubleb);
      
        double numREALdoublec = 0.12345678901234567890123; System.out.println("numREALdoubleC = " + numREALdoublec);
      
    //  El DOUBLE como maximo trabaja con 17 digitos despues de la coma (redondeando el ultimo)

     
      
    //  • CARACTERES:
    //      .CHAR: (Tiene la capacidad para almacenar solamente un Caracter).
        System.out.println("");        
		System.out.println("• CARACTERES");
		System.out.println(". CHAR:");
		char dato_char; 
		
		dato_char = 'a'; // al asignar un Caracter a una Variable se debe ingresarlo entre '(caracter)' (comillas simples).                             */
		System.out.println("dato_char: " + dato_char);
		                 
		                                        
		System.out.println(". STRING:");

    //	- STRING: Perminte almacenar un conjunto (cadena) de caracteres       
                      
		String dato_String;  /* El Comando String se debe escribir con la 'S' mayuscula, porque no viene definido en el
                          	lenguaje. Es una construccion externa llamada "Clase". */
      
		dato_String = "Hola mundo"; /* al asignar un Texto a una Variable se debe ingresarlo entre "(texto)" (comillas 
                                  dobles).  */
      
		System.out.println("dato_String: " + dato_String);
                      
                      
      
	//  • LOGICA (BOOLEAN):  Tipo de dato Verdedero o Falso unicamente ( 1 o 0).       

		System.out.println("");        
		System.out.println("• LOGICOS");
		System.out.println(". BOOLEANS:");

      
		boolean  variableLogica = true; 
		System.out.println("variableLogica = " + variableLogica); 
      
		boolean  variableLogicaB = false; 
		System.out.println("variableLogicaB = " + variableLogicaB); 
      
      
	/*
		• CONSTANTES: Asi como se pueden declarar variables (donde el valor se puede modificar infinitamente dentro de nuestro
	   	programa), tambien se pueden declarar CONSTANTES (espacio de memoria que una vez declarado en el proyecto
	   	ocupara ese espacio, nombre y tendra ese valor constantemente). Para declarar dicho espacio de la memoria 
	   	y el valor seleccionado como constante, hay que agregar la palabra resservada 'final'.
	   	Las VARIABLES generalmente se escriben con  minuscula (byte variable = 8) mientras que las CONSTANTES en Mayuscula
	  	(final byte CONSTANTE = 8). Una vez declarada la CONSTANTE no se podra modicar su valor.
  	 
   */
		System.out.println("");        
		System.out.println("• CONSTANTES: ");
		final byte CONSTANTE = 8; 
		System.out.println("CONSTANTE = " + CONSTANTE);
      
		final float PIb = 3.14f; 
		System.out.println("PI = " + PIb);
      
	// 	CONSTANTE = 6; => Error. 

	/* *********************************************************************************************************************************

	● OPERADORES:
      	Un 'Operador' es un símbolo especial que indica al compilador que debe efectuar una 'Operación'
		matemática o lógica. En todo lenguaje de programación existen un conjunto de Operadores que permiten realizar
		Operaciones con los Datos. Nos referimos a operaciones aritméticas, comparaciones, operaciones lógicas y otras 
		operaciones (por ejemplo, concatenación de cadenas, operaciones algebraicas entre valores númericos, etc.).
	      
		• OPERADORES ARITMETICOS:
			                      SUMA: + 
			                      RESTA: -
			                      MULTIPLICACION: *
			                      DIVISION: /
			                      MODULO o RESTO DE LA DIVISON: %

		Todos estos operadores son 'Operadores Binarios', es decir, que funcionan con dos Operando.
		
		   op1       *            op2
		(Operando1) OPERADOR(*) (Operando2)
		      
		OPERANDOS: Tipo de dato => NUMERICO
		RESULTADO: Tipo de dato => NUMERICO
		      
		En las Operacines Aritmeticas el tipo de datos de los OPERANDO va a ser siempre NUMERICO y por lo tanto el resultad siempre sera 
		tambien un valor NUMERICO. 
	 */

		System.out.println("");
		System.out.println("● OPERADORES:");
		System.out.println("");
		System.out.println("• OPERADORES ARITMETICOS:");   
		
		byte resultado;
		
		resultado = 4+5; 
		System.out.println(". Suma: 4+5 = " + resultado);
      
		resultado = 4-5; 
		System.out.println(". Resta: 4-5 = " + resultado);
      
		resultado = 4*5; 
		System.out.println(". Multiplicacion: 4* 5= " + resultado);
      
		resultado = 4/4; 
		System.out.println(". Division: 4/4 = " + resultado);
      
      /* 
       	Ejercicio: Superficie de un Circulo (SupCir): 
      
      	SupCir = pi*r2 (pi x radio al cuadrado) ; pi = 3.14 ; radio = 5,02 cm
              
      */
		System.out.println("");
		System.out.println("* Ejercicio: Calcular Superficie de un Circulo");
      
		final float PI = 3.14f;
      
		double radio = 5.02; 
      
		double supcir = PI * radio * radio; System.out.println("SupCir = " + supcir + " cm2" ); 
      
      
	/*  	
  		• OPERADORES DE CONCATENACION       
     	Si el operador '+' en cualquiera de sus 'Operando' tiene un 'String' o 'Char', el sistema automaticamente
	    utilizara al '+' como CONCATENADOR y no como OPERADOR ARITMETICO. Es decir, al sumar cualquier tipo dato 
	    con un dato String/Char el resultado sera la CONCATENACION de ambos datos.  
    */

		System.out.println("");
		System.out.println("• OPERADORES DE CONCATENACION:");   
      
		byte Conca1 = 8;
      
		String Conca2 = "Texto: OCHO = ";
      
		System.out.println ("Conca2 + Conca1=> " + (Conca2 + Conca1));
      
		System.out.println("Ocho: " + Conca1);
      
		System.out.println(Conca1 + " : Ocho");
      
		System.out.println( 7 + 7);
      	
		System.out.println("Hola " + "Mundo");
      
      
    
	/*  
	 	• OPERADORES DE ASIGNACION:
      	Operadores Aritmeticos (+,-,/,*) + Operador asignacion (=)
      	Los operadores de asigacion van operar aritmeticamente al valor ORIGINAL de la Variable con el valor asignado.

                              += ; -= ; /= ; *=                                      
      	.Ejemplo:
      
  		a += b ;            =>  a = a + b    Al valor original de 'a' se le suma 'b' y ese resultado es el  el nuevo valor de 'a'.                              
      
	 */
      
		System.out.println("");
		System.out.println("● OPERADORES DE ASIGNACION: ");
      
		byte a = 10; System.out.println("a original: " + a);
      
		a += 5; /* a = a + 5; En este caso al valor original de 'a' se le suman 5 y ese resultado
                            es el  el nuevo valor de 'a'.                              */
		System.out.println("a += 5: " + a);
      
      
      
	/*  
	  	• OPERADORES DE INCREMENTO/DECREMENTO:
  		Son operadores que trabajan con un solo Operando, Incrementan/Decrementan una unidad respectivamente: 

  		.Sintaxis: 

  		.Incremento:  a++ ;        => a = a + 1

  		.Decremento:  a-- ;        => a = a - 1
      
  */

		System.out.println("");
		System.out.println("● OPERADORES DE INCREMENTO/DECREMENTO: ");
		
		byte b = 10; System.out.println("b: " + b);
      
		b ++; // b = b + 1
      
		System.out.println("b ++: " + b);
      
		b --; // b = b - 1
      
		System.out.println("b --: "+ b);
      
		/* Al momento de visualizar el valor de una variable, se debe tener en cuenta en donde se escribe el operador, 
      	ya que no es lo mismo escribir "System.out.println(++a);", que "System.out.println(a++);". 
      	En el primer caso se incrementara el valor de en 1 y luego se visualizara en la consola dicho valor. 
      	Pero en el segundo caso primero enviara el valor de 'a' a la consola para que se visualice y luego incrementara 
      	el valor del mismo (pero dicho incremento no se vera reflejado en la consola). */

		int aa=0;
		System.out.println("");
		System.out.println("aa = " + aa);
		System.out.println(" System.out.println(++aa): " + ++aa);
      
		aa=0;
		System.out.println("aa= " + aa);
		System.out.println(" System.out.println(aa++): " + aa++);
		System.out.println(" System.out.println(aa): " + aa);
      

	/* 	• OPERADORES RELACIONALES (de comparacion):        
      
                              < Menor
                              > Mayor
                              <= Menor o Igual
                              >= Mayor o Igual
                              ==  Igual  ------> solamente el = (igual) es reconocido como un operador de asignacion no 
                              de igualdad. Para comprar la igualdad de una valor con otro se utiliza "==". 
                              !=  Distinto

                              op1 > op2
      
		Analizan la relacion de la cantidad entre los dos Operando (NUMERICO), y como resultado va indicaran solo si la 
		condicion se cumple o no, por lo tanto el RESULTADO siempre sera BOOLEAN (True/False).
		
	*/


		System.out.println("");        
		System.out.println(" ● OPERADORES RELACIONALES (de comparacion): ");
		boolean resultadoboolean; 
		byte n=25;
      
		resultadoboolean = 10 < 20; System.out.println("10 < 20 = " + resultadoboolean);
      
		resultadoboolean = 10 > 20; System.out.println("10 > 20 = " + resultadoboolean);
        	
		resultadoboolean = 10 <= 10; System.out.println("10 <= 10 = " + resultadoboolean);
      
		resultadoboolean = 10 >= 10; System.out.println ("10 >= 10 = " + resultadoboolean);
      
		System.out.println("n = 25");
      
		resultadoboolean = n > 20 ; System.out.println("n > 20 = " + resultadoboolean);
      
		resultadoboolean = n < 20 ; System.out.println("n < 20 = " +resultadoboolean);
      
		resultadoboolean = n == 25 ; System.out.println("n == 25 = " +resultadoboolean);
      
		resultadoboolean = n == 24 ; System.out.println("n == 24 = " +resultadoboolean);
      
		resultadoboolean = n != 25 ; System.out.println("n != 25 = " + resultadoboolean);
      
		resultadoboolean = n != 22 ; System.out.println("n != 22 = " + resultadoboolean);
      
  /*  
  		• OPERADORES LOGICOS: 
      
                  	   A   B   AND    OR   XOR
                     | F | F |  F  |  F  |  F  |    
                     | F | V |  F  |  V  |  V  |
                     | V | F |  F  |  V  |  V  |
                     | V | V |  V  |  V  |  F  |
      
		. AND: VERDADERO unicamente en el caso de que AMBOS casos sean Verdaderos, caso contrario Falso. 
		. OR: Con que UNA de las dos variables sea VERDADERO, el resultado sera Verdadero. 
		. XOR: Verdadero unicamente si SOLO UNA de las variables es verdadero, en el caso de que ambas variables sean iguales sera falso.
		      
		. NOT: Genera el resultado contrario al original.
		      
		        A   NOT
		      | F |  V  |
		      | V |  F  |
		      
		. Sintaxis: 	&: AND
		                |: OR
		              	^: XOR                                             
		              	!: NOT
		
		      Op1        &         Op2
		 (operando1) oprerador (operando2)
		
		Operandos => BOOLEAN
		Resultado => BOOLEAN
      
  */

      
      System.out.println("");
      System.out.println("• OPERADORES LOGICOS");

      boolean log1=true, log2=false, log3=true, log4=false, resulAND;  // declaro todos los tipo de dato boolean juntos. 
      
      System.out.println(". AND (&): VERDADERO unicamente en el caso de que AMBOS casos sean Verdaderos, caso contrario FALSO");
      
      resulAND = log2 & log4; System.out.println("AND = false & false = " + resulAND);
      
      resulAND = log1 & log2; System.out.println("AND = true & false = " + resulAND);
      
      resulAND = log2 & log1; System.out.println("AND = false & true = " + resulAND);
             
      resulAND = log1 & log3;  System.out.println("AND = true & true = " +resulAND);
      
      System.out.println("");
      System.out.println(". OR (|): Con que UNA de las dos variables sea VERDADERO, el resultado sera VERDADERO. ");
      
      boolean resulOR;
      
      
      resulOR = log2 | log4; System.out.println("OR = false & false = " + resulOR);
      
      resulOR = log1 | log2; System.out.println("OR = true & false = " + resulOR);
      
      resulOR = log2 | log1; System.out.println("OR = false & true = " + resulOR);
             
      resulOR = log1 | log3;  System.out.println("OR = true & true = " +resulOR);
      
      
      System.out.println("");
      System.out.println(". XOR (|): VERDADERO solo si UNA de las variables es VERDADERO, en el caso de que ambas variables"
                                     + " sean iguales sera FALSO.");
      
      boolean resulXOR;
      
      
      resulXOR = log2 ^ log4; System.out.println("XOR = false & false = " + resulXOR);
      
      resulXOR = log1 ^ log2; System.out.println("XOR = true & false = " + resulXOR);
      
      resulXOR = log2 ^ log1; System.out.println("XOR = false & true = " + resulXOR);
             
      resulXOR = log1 ^ log3;  System.out.println("XOR = true & true = " +resulXOR);
      
      
         System.out.println("");
      System.out.println(". NOT (!): Genera el resultado contrario al original. ");
      
      boolean resulNOT;
                      
      resulNOT = !log2; System.out.println("NOT = false = " + resulNOT);
      
      resulNOT = !log3; System.out.println("NOT = true = " + resulNOT);

             
      System.out.println("Hola\nMundo");
      
  }
  
} 