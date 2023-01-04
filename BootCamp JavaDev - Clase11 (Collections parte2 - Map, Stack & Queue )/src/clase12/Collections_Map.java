/*
													● INTERFAZ MAP
													  ¨¨¨¨¨¨¨¨¨¨¨¨
La Interfaz Map permite representar un Vector asociativo o un Diccionario. Es decir, nos va a permitir generar un contenedor, 
donde cada Valor tendra su Clave asociada para poder ser identificado mas eficientemente.
En el desarrollo de aplicaciones muchas veces vamos a querer representar los Objetos en una estructura que permita la búsqueda 
de forma fácil y mas optima a través de una CLAVE (key) sin necesidad de recorrer toda la Coleccion. En Java la Interfaz Map 
nos permite almacenar elementos asociando a cada VALOR(value) una CLAVE(key).
La Clave podra ser cualquier tipo de Dato, desde un Integer, String o un Objeto. En el caso de utilzar Valores Nuúmerico como 
Clave, se debera utilzar los Wrappers y no datos Primitivos (por ejemplo int => Integer), ya que se esta trabajando con 
<Generics>.

Map <key,value> id_map;

id_map = new Map_Implementación();

La Interfaz Map NO ADMITE CLAVES DUPLICADAS y es especialmente útil para ir almacenando datos sin la preocupación de que alguna 
de las Claves posea mas de un valor asociado. Es importante igualmente recordar que se puede asignar un mismo Valor a 
diferentes Claves, pero cada Clave tendrá únicamente un Valor. Si tratamos de agregar un nuevo Valor a una Clave ya existente 
lo que hace Map es actualizar el valor asociado por el nuevo.
Si bien no pertenecen al Framework Collections, la Interface Map tambien está estructuradas en una jerarquía. 
A medida que se va descendiendo a niveles más específicos aumentan los requerimientos y comportamientos.
Los mapas permiten tanto Claves como Valores nulos, recordando que los Mapas no permiten claves duplicadas solo puede existir 
un valor asociado a una Clave nula.

					Object
                      ↓
                     Map (Interfaz)
              _ _ _ _ ↓ _ _ _ _	
             ↓                 ↓
(Interfaz)SortedMap       AbstractMap
            ↓                  ↓                  
          TreeMap           HashMap
                               ↓
                          LinkedHashMap

- Métodos Map

Tipo                Método                      Descripción
boolean             isEmpty()                   Devuelve verdadero si este Mapa no contiene elementos.
void                clear()                     Elimina todos los elementos del mapa.
Int                 size()                      Devuelve el número de elementos del mapa.
V                   put(K key, V value)         Asocia el valor especificado con la clave especificada en este mapa, si existía ya  
                                                la clave reemplaza el valor y retorna el objeto reemplazado.
void                putAll(Map<? extends K,?    Agrega todos los elementos del mapa especificado a este mapa.
                    extends V> m) 
V                   get(Object key)             Devuelve el valor que contenga la clave especificada o null si no existe.
boolean             containsKey(Object key)     Devuelve verdadero si este mapa contiene la clave especificada.
boolean             containsValue(Object value) Devuelve verdadero si este mapa contiene el objeto especificado.
boolean             equals(Object o)            Compara el objeto especificado con esta colección para la igualdad.
int                 hashCode()                  Devuelve el valor del código hash para esta colección.
V                   remove(Object key)          Elimina la asignación de una clave de este mapa si esta presenta y retorna el valor
                                                eliminado.
Set<Map.Entry<K,V>> entrySet()                  Devuelve una vista de colección del mapa en una colección
Collection<V>       values()                    Devuelve una colección con los objetos del mapa.
Set<K>              keySet()                    Devuelve en una colección Set las claves del mapa.


• La Clase AbstractMap proporciona una implementación esquelética de la Interfaz Map y simplemente agrega implementaciones para 
los métodos Equals() y HashCode().

• La Interfaz SortedMap permite que las Clases que la implementen tengan los elementos ordenados.

• La Interfaz Map nos proporciona ciertos métodos para acceder a las Claves y Valores, además de permitirnos utilizar el for 
mejorado o for-each para el fácil recorrido del Map, también nos proporciona un método para reemplazar un valores.

• HashMap
Este implementación almacena los elementos en una tabla hash, este acceso hace que esta clase sea ideal para búsqueda, 
inserción y borrado de elementos.
A diferencia de la Colección HashSet esta tabla hash no esta sincronizada lo que permite que existan Claves null. Representa un 
par Clave, Valor donde las Claves son únicas (no puede tener claves duplicadas ) SIN ORDENAR y tiene una iteración más rápida que
otras implementaciones. Es decir, es la implementación más veloz pero NO CONSERVA EL ORDEN INGRESO de los Elementos. La 
implementación Hashtable funciona igual que HashMap pero es LEGACY (obsoleta).

• LinkedHashMap
Esta implementación almacena los elementos en función del orden de inserción lo que la hace un poco más costosa que HashMap.
Define el concepto de elementos añadiendo una lista doblemente enlazada en la ecuación que nos asegura que los elementos siempre 
se recorren de la misma forma. Es decir, almacena Elementos en una lista (clave, valor) enlazada por ORDEN DE INGRESO.

• TreeMap
Esta implementación almacena los elementos ordenándolos en función de sus Claves en una estructura tipo arbol rojo – negro por 
ORDEN NATURAL (alfabético), por lo que es bastante más lento que HashMap pero GARANTIZA UN ORDEN que podrá ser NATURAL 
(alfabético) o ALTERNATIVO (definido). En el caso de utilizar una Clase propia como Clave se deberá implementar la Interface 
Comparable para poder indicar el orden.



*/

package clase12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collections_Map {

	public static void main(String[] args) {
		
		System.out.println("● Interface MAP ");
		//• HashMap 
		// No conserva el orden de ingreso, pero es mas veloz. 
        System.out.println("• HashMap: ");
        
        Map<String,String> map = new HashMap<String,String>();
        
        map.put("lu", "Lunes");
        map.put("ma", "Martes");
        map.put("mi", "Miércoles");
        map.put("ju", "Jueves");
        map.put("vi", "Viernes");
        map.put("sa", "Sábado");
        map.put("do", "Domingo");
        
        map.forEach((k,v)->System.out.println(k +" - "+ v));
        
        System.out.println("");
        System.out.println(". map.get(vi): ");
        System.out.println(map.get("vi"));
        
		//. Ejemplo de cambio de idioma, conservando la misma Clave. 
        System.out.println("");
        Map<String,String> map_english = new HashMap<String,String>();
        
        map_english.put("lu", "Monday");
        map_english.put("ma", "Tuesday");
        map_english.put("mi", "Wednesday");
        map_english.put("ju", "Thursday");
        map_english.put("vi", "Friday");
        map_english.put("sa", "Saturday");
        map_english.put("do", "Sunday");
        
        map.putAll(map_english);
        System.out.println(". map.get(vi): ");
        System.out.println(map.get("vi"));
        map.forEach((k,v)->System.out.println(k +" - "+ v));
        
        System.out.println("");
        System.out.println(". Clases Propias como Claves)");
        //No necesita que la Clase implemente Comparable, porque no tiene orden.  
        Map<Auto,String> map_ClasePropia = new HashMap<Auto,String>();
        Auto auto1 = new Auto("Renault","Duster","Gris");
        Auto auto2 = new Auto("Volkswagen","Fox","Gris");
        Auto auto3 = new Auto("Renault","Oroch","Negro");
        Auto auto4 = new Auto("Toyota","Etios","Blanco");
        
        map_ClasePropia.put(auto1, "personaA");
        map_ClasePropia.put(auto2, "personaB");
        map_ClasePropia.put(auto3, "personaC");
        map_ClasePropia.put(auto4, "personaD");
        
        map_ClasePropia.forEach((k,v)->System.out.println(k+" - "+v));
        
        System.out.println(map_ClasePropia.get(auto2));
        System.out.println("****************************************************");
        
        //• LinkedHashMap
        // Almacena Elementos en una lista asociativa y CONSERVA EL ORDEN DE INGRESO.
        System.out.println("");
        System.out.println("•LinkedHashMap");

        map=new LinkedHashMap<String,String>();
        
        map.put("lu", "Lunes");
        map.put("ma", "Martes");
        map.put("mi", "Miércoles");
        map.put("ju", "Jueves");
        map.put("vi", "Viernes");
        map.put("sa", "Sábado");
        map.put("do", "Domingo");
        
        map.forEach((k,v)->System.out.println(k +" - "+ v));
        System.out.println("****************************************************");
        
        //•TreeMap
        // Almacena en una estructura tipo arbol por ORDEN NATURAL de claves (alfabético) o ALTERNATIVO (definido).
        // Si se utiliza una Clase propia como Clave, la misma debera implementar la Interface Comparable.
        System.out.println(""); 
        System.out.println("• TreeMap");
        System.out.println(". ORDEN NATURAL de claves (alfabético):");
        
        map=new TreeMap<String,String>();
        
        map.put("lu", "Lunes");
        map.put("ma", "Martes");
        map.put("mi", "Miércoles");
        map.put("ju", "Jueves");
        map.put("vi", "Viernes");
        map.put("sa", "Sábado");
        map.put("do", "Domingo");
        
        map.forEach((k,v)->System.out.println(k+" - "+v));
        
        System.out.println("");
        System.out.println(". ORDEN ALTERNATIVO de claves (Clases propias):");
        //Necesita que la Clase implemente Comparable, porque tiene que definir un orden.
        map_ClasePropia = new TreeMap<Auto,String>();
        
        map_ClasePropia.put(auto1, "personaA");
        map_ClasePropia.put(auto2, "personaB");
        map_ClasePropia.put(auto3, "personaC");
        map_ClasePropia.put(auto4, "personaD");
        
        map_ClasePropia.forEach((k,v)->System.out.println(k+" - "+v));
    
	}
}
