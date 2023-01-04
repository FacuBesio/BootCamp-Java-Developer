/*
												• API COLLECTIONS
											      ¨¨¨¨¨¨¨¨¨¨¨¨¨¨
La Clase java.util.Collections es una Clase utilitaria que trabaja sobre todos los Objetos que implementen la Interfaz 
Collection sin importar su backend. Todos los Métodos de Collections son Estáticos en su totalidad y trabajan sobre cualquier 
estructurada que implemente la Interfaz de java.util.Collection. 
Esto quiere decir que Collections tiene una serie de Métodos disponibles que nos seran de gran ayuda para manejar nuestras 
Colecciones. Por listar algunos binarySearch, addAll, reverse, reverseOrder.
Es importante recordar que los Métodos relacionados al Orden para ser utlizados con Colecciones con Objetos Propios se debera
hacer a través de las Interfaces Comparable o Comparator. 

//Método sort() ordena la collection
List<Integer> numeros = Arrays.asList(9,7,5,3);
Collections.sort(numeros);
numeros.forEach(System.out::println);

//Método reverse() invierte la collection
Collections.reverse(numeros);
numeros.forEach(System.out::println);

//Método binarySearch() busca un elemento en la lista.
List<Integer> numeros = Arrays.asList(9,7,5,3);
System.out.println(Collections.binarySearch(numeros, 9)); // 0
System.out.println(Collections.binarySearch(numeros, 3)); // 3
System.out.println(Collections.binarySearch(numeros, 2)); // -1*/

package clase13;

public class Api_Colecctions {

}
