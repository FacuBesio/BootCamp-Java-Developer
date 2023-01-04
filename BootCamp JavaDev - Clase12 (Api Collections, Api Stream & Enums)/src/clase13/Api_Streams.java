/*
 											● API STREAM
											  ¨¨¨¨¨¨¨¨¨
Las Colecciones poseen el Método Stream() que retorna el un flujo con el contenido de la Colección.
API STREAM nos provee Interfaces y Clases para procesar datos en la Colecciones de manera Funcional a través de las Expresiones
Lambda. Estas funciones nos ayudaran a transformar, filtrar y reducir una Colección dada a través de la Programación Funcional. 



?La Interfaz BaseStream provee un flujo de Objetos que permite el procesamiento paralelo y secuencial de dicho flujo.
La Interfaz Stream provee los métodos necesarios para hacer operaciones, aunque suele ser confundida con una Colección 
sabemos que tienen objetivos muy diferentes, las colecciones proporcionan una manera eficaz de acceso y modificación de datos
y los flujos de operaciones.?????

Algunos ejemplos de los métodos mas conocidos que Api Stream nos ofrece: 

    
    
    public void filtrarTexto(String texto){
        lista.stream().filter(a->a.contains(texto)).forEach(System.out::println);
    }
    
    public void filtrarStarWith(String texto){
        lista.stream().filter(a->a.startsWith(texto)||a.startsWith(texto.toUpperCase())).forEach(System.out::println);
    }
    
    public void ordenar(){
        lista.stream().sorted().forEach(System.out::println); 
    }
    
    public void ordenarInversa(){
        lista.stream().sorted((x,y)-> y.compareToIgnoreCase(x)).forEach(System.out::println);
    }
    
    La opcion de 'map' se utiliza generalmente para transformar los Elementos.
    public void trasformarMayus(){
        //lista.stream().map(a -> a.toUpperCase()).forEach(System.out::println);
        lista.stream().map(String::toUpperCase).forEach(System.out::println);
    }
    
    public void trasformarMinus(){
        //lista.stream().map(a -> a.toUpperCase()).forEach(System.out::println);
        lista.stream().map(String::toLowerCase).forEach(System.out::println);
    }
    
    
    public void trasformarEntero(){
        numeros.stream().map(x->Integer.parseInt(x)+1).forEach(System.out::println);
    }
    
    public void limitar(){
        lista.stream().limit(3).forEach(System.out::println);
        numeros.stream().limit(2).forEach(System.out::println);
    }
    
    public void limitarOrdenado(){
        lista.stream().sorted().limit(3).forEach(System.out::println);
        numeros.stream().sorted().limit(2).forEach(System.out::println);
    }
    
    public void contar(){
        long listaLength = lista.stream().count();
        System.out.println("listaLength: " + listaLength);
        
    }
*/

package clase13;

import java.util.ArrayList;
import java.util.List;

public class Api_Streams {
 
	public static void main(String[] args) {
		
		List <Auto> lista = new ArrayList<Auto>();
		lista.add(new Auto("Renault","Duster","Gris"));
		lista.add(new Auto("Volkswagen","Fox","Gris"));
		lista.add(new Auto("Renault","Oroch","Negro"));
		lista.add(new Auto("Toyota","Etios","Blanco"));
		
		//• API STREAM
		// Métodos equivalentes a SQL
		
		// select * from autos
		lista.stream().forEach(System.out::println);
		
		// select * from autos where color = 'Gris'
		System.out.println("");
		lista.stream().filter(a->a.getColor().equalsIgnoreCase("Gris")).forEach(System.out::println);
		


	}
}
