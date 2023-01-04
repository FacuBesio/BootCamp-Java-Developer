/*  
    												● ARRAYS / ARREGLOS:
  													  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨          
    Un 'Array/Arreglo' es un sconjunto de Variables indexadas de forma tal que forman una sola "VARIABLE" (super variable).
    El conjunto de variables debe ser del mismo 'Tipo de Dato' para poder agruparlos. Dicho conjunto estara agrupado bajo un
    mismo 'Nombre_Array' y se podran distinguir internamente unas de otras por un número único (índice). Es decir,
    que para poder acceder a la 'informacion' que hay en cada 'variable interna' se accederá a través de la posición que ocupan 
    dentro del 'Array'. Dicha posicion estara determinada por el 'Indice'. Este concepto también es conocido como VECTOR. 
    En todos los Arrays siempre la primer posicion sera la numero 0.
    El tamaño que va a ocupar el Array en Memoria se establece cuando se crea, ya que el mismo estara determinado por la cantidad 
    de 'Variables' y 'Tipo de Dato' que la conformaran.

        
              *Mismo tipo de dato*
               'VARIABLE ARRAY []'  ej 'Temperaturas [] (float)'       
    0   |(datos)|   variable1           temp1 (float)               
    1   |       |   variable2           temp2 (float)               
    2   |       |   variable3           temp3 (float)               
    3   |       |   variable4           temp4 (float)              
    4   |       |   variable5           temp5 (float)               
    5   |       |   variable6           temp6 (float)               
    ... ....                                                            
    N    |       |  variableN          temp10 (float)
        
        
    .Sintaxis:
        
    1°  tipo de dato [] id_Array;  => Se declara que se creara un 'Conjunto de Variables' llamado 'id_Array []' 
                                     y dicho 'Conjunto' estara compuesto por Variables del tipo de dato indicado.
        
    2°  id_Array = new tipo dato [n°] => Se inicaliza el 'Conjunto de Variables' y se indica la cantidad de 
                                        variables que va a tener el Array (n°).
                                                   
   Tambien se puede declarar un Array en una sola línea: 
   
    tipo de dato [] identificador = new tipo de dato [n°]
    
   
    • INGRESO DE DATOS EN UNA VARIABLE DENTRO DEL ARRAY:  
  	 ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
    Para guardar un dato en una de las 'Variables' del Array, hay que referirse a dicha variable con el 'Nombre del Array'
    seguido de un 'Subfijo/Indice' entre [] (corchetes) que indicaran la posición que va a ocupar dentro del Array.
    Es importante recordar que la cantidad de posiciones que estaran disponibles se determinan al momento de crear el Array. 
    En todos los Arrays la primer posicion de variable siempre sera la numero [0]. Ante la posibilidad de ingresar un [subfijo] 
    inexistente el programa no lo marcara como un error de sintaxis, pero arrojara un error al mommento de la ejecución.
    Tambien es importante recordar que el tipo de valor ingresado debe ser coincidente con el tipo de dato que pueda alojar el Array. 
    
    . Sintaxis:  
        
        id_Array [sub_indice] = valor;
        
    Asi como se pueden 'INICIALIZAR Variables' tambien se pueden 'INICIALIZAR Arrays'. Es decir, se puede asignar valores a 
    todas las variables en el mismo momento que estoy declarando el Array. Para ello se debe se debe escribir cada dato separado 
    por ',' (coma) dentro de unas {}. 

    . Sintaxis
    
    tipo de dato [] identificador = {dato1 , dato2, dato3, dato4... datoN};
                                        0       1      2      3        N

    
    La cantidad de 'Datos/Valores' que se escriban entre las {} (llaves) seran la cantidad de variables que conformaran al 
    Array, y seran ingresados en el mismo orden que fueron declarados. El primer dato estara en el indice [0]. 
    Es importante recordar que como se comienza a contar desde la posicion [0], habra un desfasaje entre la cantidad de 
    posiciones y la cantidad de datos. Es decir, el 'dato1' estara en la 'posicion [0]', y asi sucesivamente, es por este 
    motivo que se puede decir que la ultima posicion sera [cantidad de datos - 1] o que la cantidad de datos sera 
    [ultima posicion + 1 ]. 
    
    Como se puede observar, recordar la cantidad de variables o posiciones que componen cada Array puede resultar ser poco 
    practico. Es por este motivo que existe la propiedad ' id_array.length '
    
   	
   	• ' array.length ' :
    
    Todos los Arrays tiene un campo interno llamado 'LENGTH' que nos dara la longitud del Array, es decir, la cantidad de 
    datos internos que componen el Array. Es decir, que el tamaño del 'Array' puede obtenerse utilizando la propiedad 
    'id_array.length.' Es importante recordar la diferencia de 1 entre las posiciones y datos:
    
    - Cantidad de 'datos' del Array = id_arreglo.length

    - Cantidad de 'posicines' del Array = id_arreglo.length - 1
    
    
    • VISUALIZACION DE UN ARRAY/ARREGLO CON 'FOR': 
  	 ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
	Para acceder y visualizar todo el contenido del 'Array' no se podra hacer de la forma 'System.out.println(nombrearreglo)' ya que no se 
	esta indicando al sistema una 'ubicacion especifica', sino que se esta indicando la 'ubicacion' de un grupo de 'Variables'. Por este motivo 
	hay que entender lo que el nombre de un arreglo representa. En el Array se guarda la informacion de la 'ubicacion' en la que se encuentra 
	ese Conjunto de Variables en Memoria. Es importante distinguir que los 'datos' no estan guardados en el 'Array', sino que los 'datos' estan 
	guardados en variables de la Memoria Ram y la informacion que esta guardada en el 'Array' es solamente la 'ubicacion' de dichos datos en 
	Memoria. 
	
	Como se puede observar que al ingresar 'System.out.println(id_array [subindice])' el sistema puede accerder a la 'posicion de 
	la memoria' deseada y acceder de forma independiente al 'valor' de la 'variable' que esta dentro del 'Arreglo', ya que en este caso si
	se le esta brindando al Sistema un ubicación específica para acceder a la información. Resulta obvio que recorrer todas las posiciones 
	del Array de una forma manual seria muy poco practico, y es por motivo que se recurre a los iteradores para poder recorrer el Array.  
	Entonces si al [subindice] lo llamos '[i]', y mediante un 'FOR' se automatiza a [i] de forma tal que este pase por todos los valores de
	posiciones que tiene el Array, se podra acceder de forma automatizada a toda la informacion contenida dentro del Array. Al momento de 
	definir las condiciones del 'For' vamos a utlizar la propiedad 'id_Array.length' para establecer una relación directa entre el 
	'For' y el tamaño del Array.
	
	• COPIA DE UN ARREGLO:
      ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
	Para poder 'COPIAR' un 'Array_Oringen' primero se debe crear el 'Array_Destino' y al declarar el mismo se debera crear con la cantidad de 
	Variables que conformar a 'Array_Origen.length', para asegurarse siempre compatibilidad. Es importante recordar que ademas de la cantidad 
	de posiciones, deben coincidir tambien en 'tipo de dato'.
	
	Por el mismo motivo que no se puede realizar 'System.out.println(Nombre_Array)' tampoco se puede copiar de un Array a otro simplemente
	igualando los mismos 'Array_Origen = Array_Destino '. De la misma forma que se tuvo que accerder a cada dato del Array para visualizar
	 su contenido, se debera iterar a cada dato para copiar su contenido.  
	
	 Array_Destino [i] = Arreglo_Origen [i]
	
*/


package Clase03;

public class Arrays {

	public static void main(String[] args) {
		
		System.out.println("● ARRAYS / ARREGLOS: ");
        
        // * EJEMPLO:         

	    int [] array;
	    
	    array = new int [10];
	    

	    // * EJEMPLO2: 

	    float[]array2 = new float [8]; 
	        
	    //• INGRESO DE DATO EN UNA VARIABLE DENTRO DEL ARRAY:
	    
	    array[0]=8;
	    array[1]=4;
	    array[2]=10;
	    
	    array2[0]=10.88f;
	    
	    System.out.println(" array[0]= "+ array[0]);
	    System.out.println(" array[1]= "+ array[1]);
	    System.out.println(" array[2]= "+ array[2]);
	    
	    System.out.println(" array2[0]= "+ array2[0]);
	    
        int[] nums = {10, 20, 30, 40, 50, 60};
    //      		   0   1   2   3   4   5
        
        System.out.println("");
        System.out.println("nums [0]: " + nums [0]);   
        System.out.println("nums [1]: " + nums [1]);   
        System.out.println("nums [2]: " + nums [2]);   
        System.out.println("nums [3]: " + nums [3]);   
        System.out.println("nums [4]: " + nums [4]);   
        System.out.println("nums [5]: " + nums [5]);   

        // • ' array.length ' :
        System.out.println("");
        System.out.println("• 'array.length : ");
        System.out.println("nums.length: " + nums.length);
		System.out.println("'nums []' tiene 6 'dato', es decir, 5 'posiciones' ");
        System.out.println("array.length: " + array.length);
        System.out.println("array2.length: " + array2.length);
        
        
        //• VISUALIZACION DE UN ARRAY CON 'FOR':
        System.out.println("");
        System.out.println("• VISUALIZACION DE UN ARRAY CON 'FOR':");
        
        for( byte i = 0; i < nums.length; ++i) {            
        	System.out.println(nums[i]);
        }
        
        System.out.println("");
        System.out.println("- nombres []:");
                
        String [] nombres = new String[15];        

        nombres [8] = "Maria Juana";
        nombres [10] = "Carla Nieves";
        nombres [13] = "Juan McFly";
        nombres [14] = "John Gomez";
            
        System.out.println("nombres.length: " + nombres.length);
        for( byte i = 0; i<nombres.length; ++i)
            System.out.println(nombres[i]);
        
        
        //• COPIA DE UN ARRAY A OTRO CON 'FOR':
        System.out.println("");
        System.out.println("• COPIA DE ARRAYS");


        char [] Array_Origen = {'a', 'b', 'c','e', '*','&'};

        char [] Array_Destino = new char [Array_Origen.length];
        
        System.out.println("Arreglo_Origen [i]:");        
        for (byte i=0;  i<Array_Origen.length; i++)
        System.out.println("Array_Origen [" + i + "]: "+ Array_Origen[i]);
                
        System.out.println("");
        Array_Destino [0] = Array_Origen [0]; 
        Array_Destino [1] = Array_Origen [1]; 
        Array_Destino [2] = Array_Origen [2];
        System.out.println("Array_Destino [0]: " + Array_Destino [0]);
        System.out.println("Array_Destino [1]: " + Array_Destino [1]);  
        System.out.println("Array_Destino [2]: " + Array_Destino [2]);
        
        
        System.out.println("");
        System.out.println("● COPIA DE UNA ARRAY A OTRO CON BUCLE 'FOR':");
    	
        for (byte i=0;  i<Array_Origen.length; i++){
            Array_Destino [i] = Array_Origen [i];
            System.out.println("Array_destino [" + i + "] :"+ Array_Destino[i]);}

	}

}
