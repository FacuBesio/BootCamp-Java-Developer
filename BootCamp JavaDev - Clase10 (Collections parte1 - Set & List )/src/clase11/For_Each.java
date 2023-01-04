/*
 											● .FOREACH()
 											
 • For como forEach (JDK5):
 A partir del JDK 5 se introdujo el concepto de 'forEach' en Java. En este caso el mismo 'for' actuara como un 'forEach'.

.Ejemplo:
			for(Auto i:autos){System.out.println(i);}
	    
Por cada Elemento de Lista 'autos' se va generar un Objeto 'i' del tipo Auto. Es decir, se encarga de darme un Objeto 
'i' del tipo <Auto> por cada elemento de que tenga la lista 'autos'. A su vez por cada Objeto 'i' generado se ejecutara
el bloque de codigos declarado entre los {}. Es una forma de recorrer un conjunto de Elementos, sin estar pensando en índices.


• Método Default de Colecctions (JDK 8 o sup): .forEach() 
A partir de Java 8, con la incorporacion de Interfaces Funcionales, a través de los Métodos Default, las Interfaces pueden 
tener código. En la Interface 'Colecction' se escribio un Método Default llamado 'forEach' que nos va a permitir 
recorrer las Colecciones. Este Método es herado a cualquier Clase que implemente la Interfaz 'Colecction', y se recomienda 
utilzar este Método para recorrer Colecciones. El Método en su interior debe ser completado con una expresión Lamda.
    
La expresión con 'for':
    for(Object o:lista1){System.out.println(o)};
    
Es equivalente a: 
    lista1.forEach(o->{System.out.println(o)});
    
Por cada Elemento de la 'lista1' se va a generar un Objeto 'o' y se ejecutara el bloque de codigos declarado entre los 
{}. No hace falta aclarar el <tipo de dato> del Objeto 'o', porque Java reonoce automaticamente el tipo de dato que tiene la 
Coleccion a utilizar. Es decir, por cada elemento de la Coleccion voy a tener un Objeto del tipo 'o', y con dicha variable se 
realizaran las sentencias comprendidas entre las {}. 
    
Tambien hay una version reducida del mismo Método, se comienza escribiendo directamente el bloque de código a realizar
por cada Elemento de la Lista con los '::' se indica que el Objeto 'o' sera inyectado en la expresion. 

lista1.forEach(System.out::println);        

Donde los :: indican el 'o' implicito se va a inyectar como Parametro del método. 



*/

package clase11;

import java.util.ArrayList;
import java.util.List;

public class For_Each {
	public static void main(String[] args) {
		
		Auto auto1 = new Auto ("FIAT", "PALIO", "NEGRO");
        Auto auto2 = new Auto ("RENAULT", "CLIO", "GRIS");
        Auto auto3 = new Auto ("VOLSWAGEN", "GOL", "AZUL");
        Auto auto4 = new Auto ("FORD", "KA", "VIOLETA" );
        
        List<Auto> autos_lista = new ArrayList<Auto>();
        autos_lista.add(auto1);
        autos_lista.add(auto2);
        autos_lista.add(auto3);
        autos_lista.add(auto4);
        
	
        System.out.println(". For como forEach: ");
        
        for(Auto i:autos_lista) System.out.println(i);
        
        System.out.println("");
        System.out.println(". Método Default .forEach() de Colecctions: ");
        
        autos_lista.forEach(o->System.out.println(o));
        
        System.out.println("");
        System.out.println("Opcion 2 (expresion reducida): ");
        
        autos_lista.forEach(System.out::println);
	        

	    	
		
	}
	
}
