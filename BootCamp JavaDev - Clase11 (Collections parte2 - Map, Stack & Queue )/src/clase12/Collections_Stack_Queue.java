/*
 											● STACK (PILA) y QUEUE (COLA)
											  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
En el desarrollo de aplicaciones se nos puede presentar la necesidad de implementar un sistema de colas y/o pilas, las 
estructuras que veremos a continuación nos proporcionan métodos para facilitar el proceso de desarrollo.
Las Colas y Pilas representan una estructura lineal de Objetos en los que se pueden agregar o eliminar los elementos únicamente 
por uno de los dos extremos.
Los elementos de una Cola (queue) se eliminan de la Colección en la misma forma en que fueron insertados, a esta estructura se
les conoce como FIFO (First In, First Out).
Los elementos de una Pila (Stack) se eliminan de la Colección en el orden inverso al que se insertaron, a esta estructura se
conoce como LIFO (Last Input, First Out).
Para las Pilas se creo la Clase Stack que hereda de la Clase Vector que implementa la Interface LIST. Para las Colas existe la
Interfaz QUEUE. 



● CLASE STACK (PILA)
  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
LIFO => Last In First Out => El ultimo Elemento en agregarse a la Pila (apilar), sera el Primer Elemento que saldra (desapilar). 
Como por ejemplo una Pila de platos. Es decir, solo se pueden agregar Elementos al final de la Pila y solo se podran sacar 
Elementos del final de la Pila. 
Para apilar utlizaremos el comando 'pila.add()' o 'pila.push()' y para desapilar utilzaremos el comando 'pila.pop()'.
     
 →→→ 
     ↓
      *D →→→ (Ultimo en entrar, Primero en salir)
    | *C  |  
    | *B  |  
    | *A  |  
    -------

En este caso *D es el ultimo Elemento que se agrego (apilo), y es el primer Elemento que se puede sacar (desapilar). 

La Clase Stack Hereda de la Clase Vector que implementa a la Interface List. 



● INTERFAZ QUEUE (COLA)
  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨ 
Los Elementos de una Cola se eliminan de la Colección en la misma forma en que fueron insertados, a esta estructura se la
conoce como FIFO (First In, First Out).

 *F
  ↓  _______________
  ↓
 *E → *D → *C → *B →→*A (Primero en entrar, Primero en salir)
     _______________


              QUEUE (Interfaz)
    _ _ _ _ _ _ ↓ _ _ _ _ _ _	 
    ↓                        ↓
  Deque (Interfaz)     AbstractQueue     
    ↓                        ↓              
 ArrayDeque            PriorityQueue                                                                                                   


• La interfaz QUEUE tiene una peculiaridad y es que ofrece métodos para poder trabajar con Colas (Queue en Ingles). 
 
- Métodos Queue
Adicionalmente de los métodos que nos proporciona la interfaz Collection, Queue añade unos nuevos:

Tipo         Método         Descripción
E           element()       Devuelve el elemento que se encuentre al principio de la cola.
boolean     offer(E e)      Inserta un elemento al final de la cola.
E           peek()          Elimina el elemento que se encuentre al principio de la cola.
E           poll()          Elimina el elemento que se encuentre al principio de la cola.

•  La Clase AbstractQueue proporciona una implementación esquelética de la interfaz Queue y simplemente agrega implementaciones 
para los métodos Equals() y HashCode().

• La Interfaz Deque (double ended queue) o cola de dos extremos proporciona a sus implementaciones métodos para la eliminación e 
inserción de elementos tanto al comienzo como al final de las colas, la Colección LinkedList también implementa esta interfaz.

 - Métodos Deque:
Adicionalmente de los métodos que nos proporciona la interfaz Collection y Queue, Deque añade unos nuevos:
Tipo            Método              Descripción
boolean         offerFirst(E e)     Inserta un elemento al principio de la cola.
boolean         offerLast(E e)      Inserta un elemento al final de la cola.
E               peekFirst()         Elimina el elemento que se encuentre al principio de la cola.
E               pollFirst()         Elimina el elemento que se encuentre al principio de la cola.
E               peekLast()          Elimina el elemento que se encuentre al final de la cola.
E               pollLast()          Elimina el elemento que se encuentre al final de la cola.

• PriorityQueue
Este implementación almacena los elementos y los ordena según una prioridad dada, si no se le asigna prioridad asumirá que el 
orden de los objetos será por el orden natural.

• ArrayDeque
Este implementación almacena los elementos para trabajarlos como colas si se declaran como Queue o como colas y pilas si se 
declaran como Deque o ArrayDeque.


*/

package clase12;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Collections_Stack_Queue {

	public static void main(String[] args) {
		
		//● Clase STACK - PILA (LIFO -  Last In First Out)
        System.out.println("● Clase STACK (PILA): ");
        System.out.println(". --- pilaAutos --- ");
        
        Stack<Auto> pilaAutos=new Stack<Auto>();
        
        // El Método .push() apila un Elemento. 
        pilaAutos.push(new Auto("Fiat","Idea","Blanco"));
        pilaAutos.push(new Auto("Ford","Ka","Negro"));
        pilaAutos.push(new Auto("Peugeot","2008","Verde"));
        pilaAutos.push(new Auto("Renault","Clio","Rojo"));
        
        pilaAutos.forEach(System.out::println);
        System.out.println("pilaAutos.size(): "+ pilaAutos.size());
        
        // El Método .pop() desapila un Elemento. 
        System.out.println("");
        System.out.println(pilaAutos.pop());
        System.out.println("Longitud de pila: "+pilaAutos.size());
        
        System.out.println("");
        while(!pilaAutos.isEmpty()){                             // Mientras la pilaAutos no este vacia
        System.out.println(pilaAutos.pop());
        } 
        System.out.println("Longitud de pila: "+pilaAutos.size());
        System.out.println("*************************************************");
        
        //● Interface QUEUE - COLA (FIFO - First In First Out)
        System.out.println("");
        System.out.println("● Interface QUEUE (COLA): ");
        System.out.println(". --- colaAutos --- ");
        
        Queue<Auto>colaAutos=new ArrayDeque<Auto>();
        
        // El Método .offer() Encola un Elemento
        colaAutos.offer(new Auto("Fiat","Idea","Blanco"));
        colaAutos.offer(new Auto("Ford","Ka","Negro"));
        colaAutos.offer(new Auto("Peugeot","2008","Verde"));
        colaAutos.offer(new Auto("Renault","Clio","Rojo"));
        colaAutos.forEach(System.out::println);
        System.out.println("colaAutos.size(): "+ colaAutos.size());
        
        // El Método .poll() desencola un elemento
        System.out.println("");
        System.out.println(colaAutos.poll());
        System.out.println("colaAutos.size(): "+ colaAutos.size());
        
        System.out.println("");
        while(!colaAutos.isEmpty()){
            System.out.println(colaAutos.poll());
            
        }
        System.out.println("colaAutos.size(): "+ colaAutos.size());
        System.out.println("****************************************************");
        

	}

}
