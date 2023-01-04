/*
  													● EXCEPCIONES 
  													 ¨¨¨¨¨¨¨¨¨¨¨¨
En los sistemas pueden ocurrir 'Eventos Excepcionales' que corten el flujo programado y provoquen comportamientos inesperados.
Una Excepción es un evento que ocurre durante la ejecución de un programa, que interrumpe el flujo normal de ejecución. 
Java entonces utilizara las EXCEPCIONES para el manejo de errores, por lo tanto, una EXCEPCIÓN sera un ERROR que se presenta 
en nuestro software. En Java hay Excepciones que no se pueden evitar pero se pueden gestionar y evitar la interrupción abrupta
de nuestro sistema, tratando de una forma mas personalizada el problema y así tener un software más robusto y estable. Cuando 
se da un Error la JVM crea un Objeto de la 'Clase Exception'.  

Las 'Excepciones' entonces son una forma de gestionar las 'condiciones de error' que se dan en los programas. Java utiliza un 
mecanismo de Excepciones, que seran 'Objetos' que se lanzan (throw) cuando se produce una condición de error. Todas las 
Excepciones heredan de la 'Clase THROWABLE' subdividiéndose en 'ERROR' y 'EXCEPTION', las primeras son condiciones de error 
del sistema y las segundas condiciones de error del programa. 
Las Excepciones de la Clase Error son en las que el sistema no puede hacer nada con ellas, son clasificadas como errores 
irreversibles y que en su mayoría provienen desde la JVM.
La Clase EXCEPTION la podremos dividir entres las Excepciones CHECKED y UNCHECKED. 
Cuando queramos forzar al Usuario a que trate la 'Excepcion' antes de ejecutar el Programa usaremos las Excepciones CHECKED, 
que seran Subclases directas de 'Exception'. Es decir, el usuario no podra ejecutar el programa, sin capturar y controlar la
Excepcion que pueda llegar a presentarse. 
Cuando el usuario no tiene la obligacion de controlar la Excepcion utilzaremos las Excepciones UNCHECKED, que seran subclases 
de 'RunTimeException'. En este caso el usuario podra ejecutar el Programa y en el caso de surgir una Excepcion el mismo se 
vera interrumpido si no se trato el error. Es decir, el Error surgira en Tiempo de Ejecucion.


• UNCHECKED:
  ¨¨¨¨¨¨¨¨¨¨
Las EXCEPTION UNCHECKED seran aquellas Excepciones que NO heredan directamente de la Clase Exception, sino que heredan de la
Clase RUNTIMEEXCEPTION. Van a tener la particularidad de que NO ES OBLIGATORIO CONTROLARLAS(capturarlas) para poder compilar 
el programa, ya que se tratan de Excepciones que pueden producirse en 'Tiempo de Ejecución'. Es decir, vamos a poder 
compilar nuestro programa pero al momento de ejecutar el mismo sera en donde suceda estas Excepciones. En ese caso se 
cortara el flujo de ejecución sino estan controladas mediante un bloque TRY-CATCH..

Unchecked Exception
      -- NullPointerException
      -- ArrayIndexOutofBound
      -- IllegalArgument Exception
      -- ClassCastException
      -- IllegalStateException
      -- ConcurrentModificationException


• CHECKED:
  ¨¨¨¨¨¨¨¨
Las EXCEPTION CHECKED heredan directamente de la 'Clase Exception' y seran aquellas Excepciones que el compilador fuerza a que
sean capturadas (catch) sin poder ignorarse antes de ejecutar el programa. A diferencia de las Unchecked, el Programa no 
permitira compilar cuando cualquiera de estas Excepciones pueda llegar a presentarse, nos obligara a tratarlas mediante el 
bloque TRY-CATCH. Entonces seran aquellas Excepciones que el sistema NOS OBLIGA A CONTROLAR PARA PODER COMPILAR Y EJECUTAR.

Checked Exception 
      -- FileNotFoundException
      -- ParseException
      -- ClassNotFoundException
      -- CloneNotSupportException
      -- SQLException 


• TRY - CATCH - FINALLY:
  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
Este Bloque está diseñado para CAPTURAR LAS EXCEPCIONES y ejecutar las instrucciones deseadas acorde al 'error' sucedido. De
esta forma se evita la interrupción abrupta de la ejecución del programa, para que el mismo pueda terminar de compilar. El
bloque nos va permitir tambien poder diferenciar las Excepciones para dar a cada una el tratamiento correspondiente. 
       
. Sintaxis

    try {

    //--> Bloque de Codigo a analizar <--

    } catch (Exception e) {

    //--> Bloque de Codigo correctivo para las Excepciones <--

    } finally {
    
    //--> Bloque que se ejecuta SIEMPRE <--

    }
        
  
    try {                                                                            //Obligatorio
    Contendrá las Instrucciones que pueden provocar la Excepcion (error). Aquí va el código de proceso y si todo va bien no se 
    lanzara ninguna Excepción, pero si hay algún inconveniente se lanzara una Excepción la cual será capturada en el bloque 
    Catch.
    
    . Colocar las sentencias que pueden arrojar una Exception (Error) aquí .
    . Estas sentencias tienen mayor costo de hardware.
    . Si se puede ejecutar sin errores, termina el bloque try exitosamente y no se ejecuta el Bloque Catch.
    . En caso de Exception (error) se detiene el 'Control del Bloque Try' e inicia el 'Control del Bloque Catch.
    . Si se produce una Excepcion los comandos ubicados debajo de la línea del error no se ejecutaran. 

    } catch (Exception e) {                                                         //Obligatorio
    Contendrá el código necesario para gestionar la Excepcion (error). Aquí va el código de tratamiento de error, las 
    medidas correctivas. Si se presenta un error en el 'Bloque try' el 'catch' lo capturara creando un 'Objeto e'. 
    El objeto 'e' contiene toda información sobre la Excepción ocurrida y contiene Métodos para poder transmitir la misma.
    El Bloque Catch nos va a brindar la posibilidad de discriminar los diferentes tipos de Excepciones y que cada Excepcion 
    tenga su bloque de codigos correctivo a ejecutar por separado. Es importante recordar que todas las Excepciones seran 
    hijas de la Clase Exception, es decir, si no se especifíca un tipo de Excepción en particular, toda Excepción que ocurra 
    sera capturada capturada y procesada como un Obejto de la Clase Exception.

    . Este Bloque se ejecuta en caso de Exception (error) y NO detiene la ejecución.
    . Se recibe como Parametro un 'Objeto e' de la 'Clase Exception' con los detalles del error, y acorde a los resgitrado 
    para dicha Excepcion se toman medidas o no, pero lo importante es que se registra la Excepcion y continua con la 
    ejecución del Programa.
    . Si se quiere discriminar el error, se debe hacer un catch por cada tipo de error.
    . Los 'Objetos' o 'Variables' declarados en Try no son visibles (fuera de scope).

    } finally {                                                            //Opcional
    Contendrá el código que se ejecutara suceda o no un error. Su función mas importante es cerrar todo tipo de conexiones.
    
        . Este bloque se ejecuta SIEMPRE, exista Exception o no.
        . Los Objetos o Variables declarados en bloque try o catch, no son accesible (fuera de scope).
        . Generalmente se utliza para 'liberar recursos', ya que es una sentencia que se ejecutara si o si. Es decir, se 
        colocaran sentencias que se tengan que ejecutar si o si para terminar un proceso. 
        . Este bloque es OPCIONAL.
    }


Es importante recordar que los Objetos o Variables declarados en bloque try, catch o finally, no son accesible desde fuera de 
la estructa, ni entre ellos mismos (fuera de scope), como sucede por ejemplo con la variables declaradas dentro de una 
estructura 'for'.

• MÉTODOS
Cuando se captura un error a traves del 'Bloque Catch', se creara un 'Objeto e' lo cual nos permitira acceder a todos los 
'Métodos' de la 'Clase EXCEPCION' para tener un detalle más amplio del error.
   
. Sintaxis
        
    try {

    } catch (Exception e) {
            e.toString();
            e.getClass();
            e.getMessage();
            e.getCause();
            e.printStackTrace();
    }


    TIPO             MÉTODO                                DESCRIPCIÓN
   String          toString()              Devuelve una breve descripción del Objeto que capturó el error.
   String          getClass()              Devuelve la Clase que capturó el error.
   String          getMessage()            Devuelve un mensaje con un detalle del error capturado.
   void            printStackTrace()       Imprime la pila de errores que se produjo .
   String          getCause()              Devuelve la causa del error o null si la causa es inexistente o desconocida.


*/

package clase13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {
	
	public static void main(String[] args) {
		
		System.out.println("♦ EXCEPCIONES: ");
	    System.out.println("•Ejemplo a/0 :  ");
	    int a=10;
        int b=0; 
    
        try {
            System.out.println(a/b);
            System.out.println("Esta linea no se ejecuta, si en la línea anterior hubo un error!");

        } catch (Exception e) {
            System.out.println("Se produjo un Error PITER!");
            System.out.println(e.toString());
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e);
            //e.printStackTrace();
        } 
        System.out.println("... Continuacion de ejecución del programa ");
        
        System.out.println("");
        System.out.println("• UNCHECKED: ");
        /* Cualquier Método de la Clase GeneradorDeExcepciones puede ejecutarse sin estar controlado por una estructura
        try-catch, ya que se tratan de Exceptions Uncheked, es decir, Exceptions que daran error en tiempo de Ejecución.
        */
        System.out.println("- GeneradorDeExcepciiones1: ");   
        
        try {
                GeneradorDeExcepciones.generarIndex_Out_of_Bounds_Exception();  //Excepcion de Indice fuera de Limites
        		//GeneradorDeExcepciones.generarArithmetic_Exception();           // Arithmetic Exception
                //GeneradorDeExcepciones.generarNumber_Format_Exception("26x");   // Illegal Argument Exception 
                //GeneradorDeExcepciones.generarNull_Pointer_Exception(null, 20); // Excepción de Puntero nulo
        } catch (Exception e) {
                System.out.println(e);
        } 
        System.out.println("El programa termina normalmente!");
        
        System.out.println("");
        System.out.println("- GeneradorDeExcepciiones2: ");   
      
        try {
            GeneradorDeExcepciones.generarIndex_Out_of_Bounds_Exception();  
    		//GeneradorDeExcepciones.generarArithmetic_Exception();           
            //GeneradorDeExcepciones.generarNumber_Format_Exception("26x");    
            //GeneradorDeExcepciones.generarNull_Pointer_Exception(null, 20);      
        
        } catch (IndexOutOfBoundsException e) {       System.out.println("Excepcion índice fuera de Limites");
        } catch (ArithmeticException e) {             System.out.println("Excepcion de Aritmetica. No se puede dividir por Cero");
        } catch (NumberFormatException e) {           System.out.println("Excepcion de Formato de Número");
        } catch (NullPointerException e) {            System.out.println("Excepción de Puntero nulo");
        } catch (Exception e) {
                System.out.println(e);
        } 
        System.out.println("El programa termina normalmente!!");
        
        System.out.println("");
        System.out.println("• CHECKED: ");
        /* El sistema no permite compilar si la incializacion del Objeto File esta controlado mediante una estructura 
        try-catch, ya que en el la Clase FileReader esta declarada la posibilidad de una Exception a través del 
        
        public FileReader(File file) throws FileNotFoundException {
        
        ...
        
        }
        */
        
        try {
			FileReader in = new FileReader(new File("texto.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	
	}
	
}
