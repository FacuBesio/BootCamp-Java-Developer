/*
 												● FRAMEWORK COLECCTIONS
												  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
• COLECCIONES 
Es un modo de agrupar Objetos (de manera similar al concepto de Array) y brindarles las mismas Carectiricas (Métodos). Las 
Colecciones seran como un Contenedor de Objetos. Las Colecciones no solo brindaran la oportunidad de agrupar Objetos del mismo
Tipo y con alguna relación entre sí, sino que tambien brindaran la posibilidad  de generar Colecciones que reciban 
distintos Tipos de Objetos y no tengan relación entre sí. 

A través de los Arrays podemos agrupar bajo un mismo identificador una cantidad grande de elementos, pero el problema es 
que debemos saber de antemano el tamaño del mismo Array, ya que una vez creado este no varía. No se pueden añadir elementos 
nuevos ni eliminar. Tienen almacenamiento ESTATICO.
Para poder AGRUPAR elementos de forma DINÁMICA, Java nos proporciona el conjunto de Interfaces y Clases llamadas COLLECTIONS
FRAMEWORK. A través de las mismas podremos agregar o eliminar Objetos sin indicar un tamaño único o inicial. También reduce el
esfuerzo de programación al mismo tiempo que aumenta el rendimiento.
Estas Clases e Interfaces  están estructuradas en una jerarquía. La Interfaz 'Collection' es la raíz de donde 
heredan las mayoría de las Interfaces utilizadas para el manejo de las Colecciones. 



					     					COLLECTION (Interfaz)
					          					  ↓
					   					AbstractCollection 
         _ _ _ _ _ _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ ↓ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  
	    ↓										  ↓												  ↓	
       SET (Interfaz)	         	        LIST (Interfaz)				                        QUEUE (Interfaz)
        ↓	                                      ↓                                       _ _ _ _ ↓ _ _ _ _ _ _ _ 
    AbstractSet				                AbstractList				                 ↓                       ↓
    _ _ ↓ _ _ _			     	          _ _ _ _ ↓ _ _ _ _                     ------→Deque (Interfaz)    AbstractQueue
  ↓            ↓                          ↓                 ↓                   ↑         ↓                       ↓  
HashSet        SortedSet(Interfaz)    ArrayList  AbstractSequentialList_ _ _ _↑      ArrayDeque             PriorityQueue                                                                                                   
  ↓                ↓                                        ↓
LinkedHashSet   TreeSet                                  LinkedList


Para poder crear una 'Colecction' y poder acceder a los Métodos de la Interface COLECTION, se debera instanciar la misma desde 
alguna Clase que la Implemente directa o inderectamente. Dependiendo de que tipo de Colection necesitemos crear es desde la 
Clase que vamos a Instaciar, cada una estara diseñada con diferentes fines y propósitos.
A medida que se va descendiendo en la cadena de herencia aumentará la cantidad de Métodos que nuestra Coleccion tendra 
disponible y seran más específicos.

 

Ejemplo1 :

Colecction c1; 
c1 = new ArrayList();
c1.add(); 
.....

Ejemplo2

List lista1;                   
lista1 = new ArrayList();
lista1.add(); 
.....

♦ Genericos:
Las Colecciones tienen <Genéricos> por lo que debemos indicarles el tipo de Objeto a almacenar. 
Con los Diamante "<>" se indica el 'Tipo de Dato/ Tipo de Objeto' que sera la 'Colecction' creada. Es decir, que en dicha 
'Colecction' solo se podran agregar los 'Tipo de Objetos' declarados entre los diamantes "<>". Hacer el correcto uso de los 
<Genericos> en las Colecciones, nos ayudara a evitar escribir validaciones, ya que por defincion se asegura que la Coleccion 
reciba únicamente un determinado tipo de Objeto. Siempre se hace referencia a una Clase (que se pueda instanciar). Se 
utiliza la 'Clase Object' para el uso de cualquier Elemento <Object>. 
Si no se ingresa ningun generic <> el sistema por default asume que se trata de un Elemento <Object>. Es decir, si no se 
ingresa ningun <Generic> o se ingresa <Object>, la Coleccion podra recibir cualquier Objeto. 
    
Ejemplo1:

Collection<Object> c1; 
c1 = new ArrayList<Object>();

Ejemplo2:
List<Object> lista1;                         	
lista1 = new ArrayList<Object>();

Ejemplo3:
List <Auto> lista2;
lista2=new ArrayList<Auto>();  ----> Se indica que 'lista2' unicamente podra recirbir Objetos dle tipo <Auto>.


- MÉTODOS COLECTION
Tipo 		Método                              Descripción
boolean	        add(E e)                            Asegura que esta colección contiene el elemento especificado (operación opcional).
boolean 	addAll(Collection<? extends E> c)   Agrega todos los elementos de la colección especificada a esta colección.
void 		clear()                             Elimina todos los elementos de esta colección (operación opcional).
boolean 	contains(Object o)                  Devuelve verdadero si esta colección contiene el elemento especificado.
boolean 	containsAll(Collection<?> c)        Devuelve verdadero si esta colección contiene todos los elementos de la colección especificada.
boolean 	equals(Object o)                    Compara el objeto especificado con esta colección para la igualdad.
int 		hashCode()                          Devuelve el valor del código hash para esta colección.
boolean 	isEmpty()                           Devuelve verdadero si esta colección no contiene elementos.
Iterator<E>     iterator()                          Devuelve un iterador sobre los elementos de esta colección.
boolean 	remove(Object o)                    Elimina una sola instancia del elemento especificado de esta colección, si está existe.
boolean 	removeAll(Collection<?> c)          Elimina de este conjunto todos sus elementos que están contenidos en la colección especificada
Int 		size()                              Devuelve el número de elementos en esta colección.
Object[] 	toArray()                           Devuelve una matriz que contiene todos los elementos de este conjunto
<T> T[] 	toArray(T[] a)                      Devuelve una matriz que contiene todos los elementos de este conjunto; el tipo de tiempo de 
                                                    ejecución de la matriz devuelta es el de la matriz especificada.


● INTERFACE LIST:
  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨ 
La Interfaz 'LIST' representa una Lista tipo Array con índices, pero a diferencia de los Arrays, la 'Interface List' y sus 
implentaciones serán DINAMICAS. Es decir, que una vez creada la 'List' se pueden agregar mas Elementos de los declarados 
incialmente.     

La Interfaz List admite Elementos duplicados y sus Elementos se basan en un índice. Es decir, tiene un acceso 'posicional' a 
sus Elementos, por lo que respetara el orden en el que sus Elementos fueron declarados.   
Sobrecarga con índices los Métodos add(i), remove(i) y get(i) ofreciendo la posibilidad de acceder posicionalmente a ejecutar
el Método deseado. 
La 'Interfaz List' entonces tiene acceso posicional a sus elementos, manipula elementos en función de su posición en la lista. 
Tienen la capacidad de buscar un elemento concreto de la lista y devolver su posición.
Para  poder crear un Objeto que contenga los Métodos de la Interface List, se debera instanciar el Objeto desde alguna de sus
implementaciones, como por ejemplo 'Arraylist'.

					
         LIST (Interfaz)					
                ↓                            
    	   AbstractList						         
    	_ _ _ _ ↓ _ _ _ _                   
       ↓                 ↓                    
  ArrayList     AbstractSequentialList------→Deque (Interfaz)
                         ↓
                     LinkedList


- ArrayList es la implementacion que mejor Performance tiene en condiciones normales. Intermente utiliza un Array para 
alamacenar los Elementos que tiene adentro. Es la implementación mas típica de la Interfaz. Se basa en un Array 
redimensionable que aumenta su tamaño según crece la Colección de elementos o disminuye a medida que los mismo se vayan 
eliminando. Es la que mejor rendimiento tiene sobre la mayoría de situaciones y como podemos observar se parece mucho a la 
forma que trabajan los Arreglos comunes con acceso por índice. Arraylist es mas performante para Agregar y Quitar Elementos. 

- LinkedList en líneas generales es un poco mas lenta que ArrayList, pero es una lista doblemente enlazada. Cada Elemento que 
pertence al LinkedList tiene un puntero apuntando a el proximo Elemento y su Elemento anterior. Linkedlist es mas performante 
para recorrer el listado. 

- La 'Clase AbstractList' proporciona una implementación esquelética de la Interfaz dándole comportamiento a los nuevos métodos 
que utilizaremos.

- La 'Clase AbstractSequentialList' proporciona una implementación esquelética de la Interfaz dándole acceso secuencial a la
colección.

Las implementaciones mas conocidas son Arraylist y LinkedList. 

♦ ¿Si estas dos implementaciones recorren la Colección como fueron insertados cual debo usar?
LinkedList: Permite inserciones o eliminaciones en mejor tiempo utilizando los iteradores, pero solo ACCESO SECUENCIAL de 
elementos.
ArrayList: Permite un ACCESO de lectura ALEATORIO rápido, para que puedas obtener cualquier elemento en un tiempo mas optimo. 
Pero agregar o eliminar desde cualquier lugar menos el final requiere desplazar todos los últimos elementos.


● MÉTODOS DE LA INTERFAZ 'LIST':
Adicionalmente de los métodos que nos proporciona la Interfaz Collection, List y AbstractList añaden unos nuevos:

Tipo 			Método 					Descripción
void                add(int index, E element)               Inserta el elemento especificado en la posición especificada en 
                                                            esta lista.
E                   get(int index)                          Devuelve el elemento en la posición especificada en esta lista.
E                   set(int index, E element)               Reemplaza el elemento en la posición especificada en esta lista 
                                                            con el elemento especificado.
E                   remove (int index)                      Elimina el elemento en la posición especificada en esta lista.
int                 indexOf (Object o)                      Devuelve el índice de la primera aparición del elemento 
                                                            especificado en esta lista, o -1 si esta lista no contiene el 
                                                            elemento.
ListIterator<E>     listIterator()                          Devuelve un iterador de lista sobre los elementos de esta lista.
ListIterator<E>     listIterator (int index)                Devuelve un iterador de lista sobre los elementos de esta lista, 
                                                            comenzando en la posición indicada.
List<E>             subList (int fromIndex, int toIndex)    Devuelve una lista de la parte de esta lista entre el especificado 
                                                            fromIndex, el inclusivo y el toIndex exclusivo.
default void        sort (Comparator<? super E> c)          Ordena esta lista según el orden inducido por el especificado 
                                                            Comparator.
 
*/

package clase11;

import java.util.ArrayList;
import java.util.List;

public class Collections_Introduccion_LIST {
	
	public static void main(String[] args) {
		
		System.out.println("● FRAMEWORK COLECCTIONS");
		System.out.println("● INTERFACE LIST");
        System.out.println(". --- lista1 ---");
    	
        Auto auto1 = new Auto ("FIAT", "PALIO", "NEGRO");
        List<Object> lista1 = new ArrayList<Object>();  
                                        
        lista1.add(auto1);           								//0
        lista1.add(new Auto ("VOLSWAGEN", "GOLF", "NEGRO"));        //1
        lista1.add(new Auto ("RENAULT", "SANDERO", "NARANJA"));     //2
        lista1.add(new Auto ("FIAT", "UNO", "GRIS"));               //3
        lista1.add("Hola Mundo");                           		//4 
        lista1.add(8);                                              //5 
        lista1.add("Hola Mundo prueba2");                           //6
        lista1.add("Hola Mundo prueba3");    						//7
        lista1.remove(3);                                           // Va a borrar lista1.add(new Auto ("FIAT", "UNO", "GRIS"));     
        lista1.add(2, "Hola Mundo Posicion 2");                     // Lo va a ingresar entre en "1" y el "2"
        lista1.remove("Hola Mundo prueba2");                        // Va a borrar "Hola Mundo prueba2".
        
        System.out.println("System.out.println(lista1.get(i)):");
        System.out.println(lista1.get(0));
        System.out.println(lista1.get(1));
        System.out.println(lista1.get(2));
        System.out.println(lista1.get(3));
        System.out.println(lista1.get(4));
        System.out.println(lista1.get(5));
        System.out.println(lista1.get(6));

        System.out.println("");
        System.out.println("lista1.size(): " + lista1.size());		// Devuelve el tamaño de lista1
        System.out.println("lista1.isEmpty(): " + lista1.isEmpty());
        System.out.println("lista1.indexOf(Hola Mundo): " + lista1.indexOf("Hola Mundo"));
        System.out.println("lista1.indexOf(8): " + lista1.indexOf(8));
        System.out.println("lista1.indexOf(new Auto (VOLSWAGEN, GOLF,  NEGRO): " + lista1.indexOf(new Auto 
        ("VOLSWAGEN", "GOLF", "NEGRO")));
        
        
        System.out.println("");
        System.out.println(". --- lista1 ---");
        for(Object i:lista1) System.out.println(i);
        

        //● GENERICS: Uso de generics <> Defincion Diamante. 
        // <Auto> se indica que la Lista es del tipo AUTO (tiene un tipo de datos), solo se podran agregar Objetos tipo Clase Auto.
        System.out.println("");
        System.out.println(". GENERICS:");
        System.out.println(". --- lista2 ---");
        
        List<Auto> lista2=new ArrayList<Auto>();   
        
        lista2.add(new Auto("Citroen","C4","Bordo"));
        lista2.add(new Auto ("FIAT", "UNO", "GRIS"));
        lista2.add(new Auto("Citroen","Berlingo","Negro"));
        lista2.forEach(System.out::println);
        System.out.println("");
        

        // CASTING
        System.out.println("*************************************************");
        System.out.println(". --- auto5,6, 7 CASTING ---");
        Auto auto5=(Auto)lista1.get(0);      // Lo devuelve en un Contenedor Object, por eso hay que 'Castear', para indcar que
                                             // el Objeto de la lista1 es un Objeto del tipo AUTO
        Auto auto6=lista2.get(0);            // La lista2 ya devuelve por definicion un tipo Auto por el uso de <Auto>, por eso
        Auto auto7=lista2.get(1);            // NO se Castea. 
        System.out.println(auto5);
        System.out.println(auto6);
        System.out.println(auto7);
        
        System.out.println("");
        System.out.println(". Copiar Objetos de una Lista a otra: ");

        lista1.forEach(o->{
        
        	if(o instanceof Auto) lista2.add((Auto)o); 
        
        });
        
        lista2.forEach(System.out::println);
/*      
        Si no se agrega la if(o instanceof Auto) se corre el riesgo de Castear datos incompatibles y que nos de Error en tiempo
        de Ejecucion.  
*/
       
        System.out.println("");
        System.out.println(". --- lista3 ---");
        
        List<String> lista3=new ArrayList<String>();   
        
        lista1.forEach(o->{
            if(o instanceof String) lista3.add((String)o); 
        });
        lista3.forEach(System.out::println); 
        
        System.out.println("");
        System.out.println(". --- lista4 ---");
        
        List<Integer> lista4=new ArrayList<Integer>();   
        
         lista1.forEach(o->{
            if(o instanceof Integer) lista4.add((Integer)o); 
        });
        lista4.forEach(System.out::println); 
        
        System.out.println("*************************************************");
	}

}
