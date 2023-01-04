/*
 
 ● INTERFACE SET: 
 ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
Representa una Lista SIN ÍNDICES, el mismo Objeto almacenado es el Índice. Por este motivo, NO HAY OBJETOS DUPLICADOS en SET. 
Es decir, ninguna implementación de la Interface SET va a permitir elementos con índices, ni tampoco tendra elementos 
duplicados. 
En este tipo de Interfaz, si habra diferencias más notorias entre sus implementaciones. Es decir, la Colección SET tendra un 
comportamiento diferente que dependera de la implementación desde donde fue instanciada. 
La Interfaz Set antes de agregar ejecuta el Método 'equals (Object obj)' contra todos los demas Objetos, si todos los 
resultados de las comparaciones retornan falso, quiere decir que el Objeto no esta Duplicado y por lo tanto lo agrega, pero si
alguna de las comparaciones retorna con valor verdadero, entonces no va a agregar el Objeto ya que lo considera Duplicado. 
Por lo tanto para que cualquier Clase (propia, creada por nosotros mismos) que implemente la Interfez Set funcione 
correctamente y no admita datos duplicados, es importante recordar que se debera Sobreescribir el 'Método equals()' y tambien 
el metodo 'hashCode() '.

Las implementaciones mas conocidas son HashSet, LinkedHashSet y TreeSet.


		 SET (Interfaz)									 
		  ↓	                                     
             AbstractSet								
	   _ _ _ _↓ _ _ _ _								
	  ↓                ↓                              
        HashSet        SortedSet (Interfaz)            
	  ↓                ↓              
      LinkedHashSet     TreeSet 


-HASHSET: Es la Implementación que mejor performance tiene dentro de la Interfaz Set, pero NO conservara el orden en el que 
los Elementos fueron ingresados. Almacena todos los Elementos en una Tabla Hash y es la implementación mas veloz. 
Para los casos en los que se necesite crear una Coleccion en la que no se puedan repetir Elementos, NO se necesite conservar 
un orden y manejar un caudal de Elementos grande, 'HashSet' sera la opcion mas adecuada.

- LINKEDHASHSET: Almacena los Elementos en una Lista Set enlazada, no es tan veloz como HashSet, pero CONSERVA EL ORDEN DE 
INGRESO de los Elementos. Cuando se recuperen los datos, no habra Elementos duplicados y van mantener el mismo 
orden en el que fueron ingresados. 

- TREESET: No admite Elementos Duplicados y alcemacena los Elementos en un 'Arbol' por orden natural (alfabético) o un 
determinado orden establecido.  Es un poco mas lenta ya que almacena sus Elementos en una Estructura de Arbol rojo-negro, pero
PROVEE ORDEN en los Elementos. El TreeSet a medida que se le agregan mas Elementos la Performance va decreciendo en velocidad,
pero conservara el orden indicado.
En el caso de utilizar Clases Propias se debe definir como Ordenar los Objetos de la misma. Es decir, hay que definir cual es 
orden y en Java vamos a definirlo implementando la Interfaz Comparable, y Sobreescribiendo el Método compareTo();

- La Clase 'AbstractSet' Proporciona una implementación esquelética de la Interfaz Set y simplemente agrega implementaciones 
para los Métodos 'Equals' y 'HashCode'.

- La Interfaz 'SortedSet' permite que las Clases que la implementen tengas los elementos ordenados.


• COMPARATOR (Orden Alternativo) 
Para hacer uso de esta Interfaz se debera crear una Nueva Clase que implemente a Comparator, para luego poder implementar 
el método .compare() de la Interfaz y sobreescribir el mismo. Tambien se debe ingresar entre '<>' el tipo de Objeto que se va 
a comparar. A través de la implementación del método .compare(), se van a comparar dos Objetos que ingresaran como Parámetro 
(o1 y o2). Para que el método funcione correctamente se debe seguir la lógica de comparación anteriormente mencionada y 
definir el Orden deseado.
Si o1 es Mayor que o2 el médoto debe retonar un Entreo Positivo, si o1 es Igual a o2 debe retornar un 0(cero) y si o1 es
Menor que o2 debe retornar un Entero Negativo. 
Posteriormente por ejemplo al utilizar la API Collections.sort(list,new Clase_Comparator()) se establecera el Orden deseado en
nuestras Colecciones. 

public class Clase_Comparator implements Comparator <Object> {

@Override
    public int compare(Object o1, Object o2) {

        return o1.parametro().compareTo(o2.parametro());
    }
}


public static void main(String[] args) {	
    .....
    Collections.sort(list, new Clase_Comparator());
    ....
}



Tambien se puede sobreescribir el método directamente con Api Collections, sin la neceidad de una Clase adicional.


        Collections.sort(list, new Comparator<Persona>(){
                @Override
                public int compare(Persona p1, Persona p2) {

                    return p1.getNombre().compareTo(p2.getNombre());
                }
        
            }
        );


• COMPARABLE (Orden Natural) 
Esta Interfaz debe ser implementada por la misma Clase en la que se desee establecer un criterio de orden. A través de la 
Interfaz Comparable se podra implementar el método .compareTo() y se debera sobreescribir el mismo estableciendo un criterio 
de Orden. A través de la implementación del método .compareTo(), se van a comparar dos Objetos (.this y o2 que ingresa como
Parámetro). Para que el método funcione correctamente se debe seguir la lógica de comparación anteriormente mencionada y 
definir el Orden deseado. Si .this es Mayor que o2 el método debe retonar un Entreo Positivo, si .this es Igual a o2 debe 
retornar un 0(cero) y si .this es Menor que o2 debe retornar un Entero Negativo. 



● MÉTODO EQUALS () Y HASCODE() 
  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
Es importante recordar que la Clase OBJECT es Padre de todas las Clases, es decir todas las Clases heredan de OBJECT. Cuando 
no se indica la Herencia, heredan directamente de OBJECT. Es decir, en OBJECT hay escrito un comportamiento que va a ser 
heredado a todas las Clases. 

. ' hashCode ()':
 ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨        
El método 'public native int hashCode ()' es uno de ellos, es un método heredado de OBJECT. Es un método 'nativo' (el codigo 
no se ve, esta escrito en lenguaje C). Basicamente este método devuelve un 'id' del Objeto. Cada Objecto en Memoria en Java 
tiene un identificador, un 'id', un número de Objeto. Si bien este 'id' no es el número de posición de Memoria, es un
un identificador que nos sera util para ubicar dicho Objeto en Memoria, y entonces a nivel 'Object' podemos afirmar que si dos
Objetos devuelven el mismo Codigo estan en el mismo lugar de Memoria.

. 'equals ()':
 ¨¨¨¨¨¨¨¨¨¨¨¨       
'public boolean equals (Object obj){
    return (this == obj);
  }'
        
Tambien tenemos el método 'public boolean equals (Object object)' que compara Objetos. Si devuelve 'true' significa que es el 
mismo Objeto. Para hacer uso de este Método en Clases nuevas se debe sobreescribir el método. 
Ocurre que si solamente nos fijamos en el codigo Hash, dos Objetos con el mismo 'Estado' que esten ocupando diferentes lugares
de Memoria tendran un 'hashCode ()' diferente, y por lo tanto no seran considerados iguales.


. Sobreescritura método 'hashCode () & equals ()':
  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨        
Cuando se necesita que dos Objetos con el mismo 'Estado' sean considerados el mismo Objeto hay que sobreescribir el método
'equals () y hashCode ()'. 

    @Override
    public int hashCode() {
        return toString().hashCode();
    }
    
Se retorna Hash Code del toString(). Es decir, un identificador de la suma de sus atributos. Esto hace que dos Objetos con el 
mismo Estado devuelvan el mismo 'hashCode ()'. Se consideran los dos Objetos iguales, porque mas alla de estar en lugares 
diferentes de Memoria van generar el mismo Codigo Hash.
        
     @Override
    public boolean equals(Object obj) {
    if (!(obj instanceof Clase))return false; 
        return toString().hashCode()== obj.hashCode();
    }
        
Ya sobreescrito el el método 'hashCode ()', se sobreescribe el método ' equals ()' y se indica que si ingresa un objeto que  
tenga el mismo Codigo Hash sean considerados iguales. El codigo Hash esta sobreescrito como un identificador de la suma de 
sus Atributos y esto hace que dos Objetos con el mismo Estado devuelvan el mismo 'hashCode ()', mas alla de que no esten en 
el mismo lugar de Memoria. En este caso se sobreescribe el el método 'equals ()' acorde al método 'hashCode ()'. 


Entonces en el caso de crear una Coleccion del tipo SET y utilzar la misma con Elementos de una Clase Nueva (creada por 
nosotros mismos), se debera indicar a Java bajo que condición se va a considerar que un Objeto de la Clase Nueva es igual 
a otro. Esta validación claramente refiere a su contenido y no al nombre, ya que por definición no podemos crear dos Objetos 
de la misma Clase con el mismo nombre. 

Set<ClaseNueva> n = new HashSet<>();

La Interfaz Set (y todas sus implementaciones) antes de agregar un Objeto a la Colección ejecuta el Metodo 'equals (Object
obj)' contra todos los demas Objetos, si todos los resultados de las comparaciones retornan falso, quiere decir que el Objeto
no esta Duplicado y por lo tanto lo agrega, pero si por el contrario alguna de las comparaciones retorna con valor verdadero,
entonces no va a agregar el Objeto ya que lo considera Duplicado. 
Por lo tanto, para que cualquier implementacion la Interfez Set funcione correctamente, y no admita datos duplicados, es
importante recordar que se debera Sobreescribir el 'Metodo Equals()' y tambien el metodo 'hashCode() '.

 @Override
    public int hashCode() {
        return toString().hashCode();
    }

 @Override
    public boolean equals(Object obj) {
    if (!(obj instanceof Auto))return false; 
        return toString().hashCode()== obj.hashCode();
    }




*/package clase11;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collections_SET_Comparable_Comparator {
	
	public static void main(String[] args) {
		 
		 System.out.println("● INTERFACE SET");
        System.out.println("");
        System.out.println("● HashSet: NO se admiten Elementos Duplicados y NO se garantiza el orden de ingreso");
        System.out.println(". --- set1_HashSet---");
        Set<Object> set1_HashSet;
        set1_HashSet = new HashSet<Object>();
        
        set1_HashSet.add("Hola Mundo");
        set1_HashSet.add("Hola Universo");
        set1_HashSet.add("Hola Galaxia");
        set1_HashSet.add("Hola Mundo");
        set1_HashSet.add("Hola Universo");
        System.out.println(set1_HashSet);
        System.out.println(set1_HashSet.size());
        
        System.out.println("");
        System.out.println(". --- set2_HashSet---");
        Set<String> set2_HashSet = new HashSet<String>();
        set2_HashSet.add("Lunes");
        set2_HashSet.add("Martes");
        set2_HashSet.add("Lunes");
        set2_HashSet.add("Miercoles");
        set2_HashSet.add("Jueves");
        set2_HashSet.add("Viernes");
        set2_HashSet.forEach(System.out::println);
        
        /*HashSet no ingresa Elementos duplicados, pero no respeta el orden de los Elementos ingresados, ni tampoco tiene un
         Orden interno.*/
        
        //. Elementos duplicados, con Objetos de Clases Propias. Desde HashSet pero Idem TreeSet.
        System.out.println("");
        System.out.println(". Elementos duplicados, con Objetos de Clases Propias. Desde HashSet pero Idem TreeSet.");
        System.out.println(". --- set4_HashSet ---");  
        
        HashSet<Auto> set4_HashSet = new HashSet<Auto>();
        
        Auto auto8 = new Auto("Auto8","Auto8","Auto8");
        Auto auto8_prueba = new Auto("Auto8","Auto8","Auto8");
        
        System.out.println("auto8.hashCode(): "+auto8.hashCode());                  // Tienen el mismo codigo Hash, ya que 
        System.out.println("auto8_prueba.hashCode(): "+auto8_prueba.hashCode());    // tiene el Método Sobreescrito.
        
        set4_HashSet.add(auto8);
        System.out.println(set4_HashSet);
        System.out.println("set4.size(): " + set4_HashSet.size());
        
        set4_HashSet.add(auto8_prueba);									//no lo agrega.
        System.out.println(set4_HashSet);
        System.out.println("set4_HashSet.size(): " + set4_HashSet.size());

        
        System.out.println("");
        System.out.println("● LinkedHashSet: NO se admiten Elementos Duplicados pero SI se garantiza el orden de ingreso");
        System.out.println(". --- set2_LinkedHashSet ---");
        Set<String> set2_LinkedHashSet = new LinkedHashSet<String>();
        
        set2_LinkedHashSet.add("Lunes");
        set2_LinkedHashSet.add("Martes");
        set2_LinkedHashSet.add("Lunes");
        set2_LinkedHashSet.add("Miercoles");
        set2_LinkedHashSet.add("Jueves");
        set2_LinkedHashSet.add("Lunes");
        set2_LinkedHashSet.add("Viernes");
        
        set2_LinkedHashSet.forEach(System.out::println);
        
        System.out.println("");
        System.out.println("● TreeSet: NO se admiten Elementos Duplicados, y el Orden natural (alfabético)");
        System.out.println("--- set1_TreeSet <String> Orden natural (alfabético) ---");
        Set<String> set1_TreeSet = new TreeSet<String>();
        
        set1_TreeSet.add("Miercoles");
        set1_TreeSet.add("Lunes");
        set1_TreeSet.add("Martes");
        set1_TreeSet.add("Jueves");
        set1_TreeSet.add("Lunes");
        set1_TreeSet.add("Viernes");

        set1_TreeSet.forEach(System.out::println);
        
        
        System.out.println("");
        System.out.println("--- set2_TreeSet <String> Orden natural (alfabético) ---");
        
        Set<String> set2_TreeSet = new TreeSet<String>();
        
        set2_TreeSet.add("efgh");									
        System.out.println(set2_TreeSet);
        set2_TreeSet.add("abcd");
        System.out.println(set2_TreeSet);
        set2_TreeSet.add("vwxyz");
        System.out.println(set2_TreeSet);
        set2_TreeSet.add("hijkl");
        System.out.println(set2_TreeSet); // Ordena los Elementos por Orden Alfabetico.	
                                  
        System.out.println("set3_TreeSet.size(): " + set2_TreeSet.size());
        
        System.out.println("");
        for(Object i:set2_TreeSet) {
        	if(i.equals("abcd"))
        			System.out.println("Pureba selecinonar solo 'abcd': "+ i);
    	}
        
        for(Object i:set2_TreeSet) {
        	if(i.equals("abcd"))
        			System.out.print("Pureba selecinonar solo 'abcd': "+ i + " ");
        	else if(i.equals("efgh"))
        		System.out.println(" y tambien selecinonar solo 'efgh': "+ i);
    	}
        
        
        System.out.println("--- set3_TreeSet <Integer> Orden natural ---");
        Set<Integer> set3_TreeSet = new TreeSet<Integer>();
        set3_TreeSet.add(8);
        set3_TreeSet.add(16);
        set3_TreeSet.add(10);
        set3_TreeSet.add(9);
        set3_TreeSet.add(11);
        set3_TreeSet.add(32);
        set3_TreeSet.add(24);
        set3_TreeSet.forEach(System.out::println);
        
        
      //● DecimalFormat (); 
        System.out.println("");
        System.out.println("● DecimalFormat (): ");
        int edad1 = 9;
        int edad2 = 11;

        DecimalFormat dfEdad = new DecimalFormat("000");
        System.out.println("edad1 : " + dfEdad.format(edad1));
        System.out.println("edad2 : " + dfEdad.format(edad2));
        
        int millon = 1000000;
        DecimalFormat dfMillon_conDecimal = new DecimalFormat("###,###,###.00");
        System.out.println("millon : " + dfMillon_conDecimal.format(millon));
        System.out.println("edad1 : " + dfMillon_conDecimal.format(edad1));
        System.out.println("edad2 : " + dfMillon_conDecimal.format(edad2));

        
        System.out.println("--- set4_TreeSet <String> con DecimalFormat ---");
        Set<String> set4_TreeSet = new TreeSet<String>();
        
        int edad3 = 10;
        int edad4 = 8;
        int edad5 = 18;
        int edad6 = 7;
        set4_TreeSet.add(dfEdad.format(edad3));
        set4_TreeSet.add(dfEdad.format(edad4));
        set4_TreeSet.add(dfEdad.format(edad5));
        set4_TreeSet.add(dfEdad.format(edad6));
        set4_TreeSet.forEach(System.out::println);
        
    	
	}

}
