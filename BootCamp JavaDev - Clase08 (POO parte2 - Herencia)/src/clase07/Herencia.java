/*
 												● HERENCIA 
												  ¨¨¨¨¨¨¨¨
En los 'Lenguajes Orientados a Objetos' se pueden HEREDAR caracteristicas (Atributos y Métodos). La idea de HERENCIA es 
permitir la creación de 'Nuevas Clases' basadas en 'Clases Existentes'. Se produce a partir de dos Clases relacionadas.     
Es decir, que habra una 'Clase_Hija' que HEREDARA de otra 'Clase_Padre' sus Métodos y Atributos. La 'Clase_Principal' se 
denomina 'Clase_Padre' o 'Super_Clase'. La 'Clase' que hereda se denomina 'Subclase' o 'Clase_Hija'. Esto representa la 
relación ES-UN:
- Un Compacto ES-UN Auto.
- Un Camión ES-UN Auto.
        
Las 'Clases Hijas' entonces tendran los mismos Atributos y Métodos que su 'Clase Padre', mas sus Atributos y/o Métodos 
particulares que los distingan. Los Atributos y Métodos heredados no se vuelven a codificar, son heredados. Entonces en las 
'Clases Padres' se indicaran los Atributos y/o Metodos mas generales, y se ira especificando hacia sus 'Clases Hijas'. 
Para indicar la 'Herencia' al momento de declarar la 'Clase_Hija' vamos a  utilizar la palabra reservada 'extends' seguido de 
la 'Clase_Padre'.        
        
. SINTAXIS 'MECANISMO DE HERENCIA'

public class Clase_Padre {
}

public class Clase_Hija extends Clase_Padre {
}
    

• CONSTRUCTORES EN HERENCIA
Algo que pasa con los constructores es que no se heredan. Cuando se Instancia un Objeto de una Clase Hija se ejecutara en 
primer lugar el Constructor de la Clase Padre y luego el Constructor de la Clase Hija, y esto hay que representarlo al momento 
de declarar el Constructor de la Clase Hija. 
Esto se hace con la sentencia 'super()', que invoca a los constructores de la Superclase. Es decir, al declarar el 
Constructor de la Clase Hija vamos a poner en la primer linea de forma obligatoria la palabra reservada 'super()' con los 
Parametros del Constructor Padre correspondientes, y luego se ingresaran los Parametros del Constructor de la Clase Hija. 
Es importante recordar que los Constructores deben coicidir y existir. Es decir, no puedo invocar un constructor vacio desde 
la Clase Hija si no existe en la Clase Padre, y si se ingresa con Parametros deben coincidir. 
        
       
public class Clase_Padre {
    //Constructor_Padre
    public Clase_Padre(parametros_padre){
        parametros_padre
    }
}

public class Clase_Hija extends Clase_Padre {
    //Constructor_Hijo
    public Clase_Hija(parametros_hija){
        super(parametros_padre);
        parametros_hija;
    }
} 


● POLIMORFISMO - SOBRECARGA Y SOBREESCRITURA DE MÉTODOS
  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
Polimorfismo desde el concepto cientifico se refiere a aquello que puede adoptar multiples formas. En POO sera la posibilidad 
de que un 'Método' adopte MAS DE UNA FORMA, que pueda modificar su comportamiento de acuerdo a una determinada necesidad o 
situación. Es decir, que un mismo 'Método' pueda ser utilizado desde distintas Clases, y que a su vez cada 'Clase' pueda 
modificar el coportamiento del mismo.

Existen 2 Tipos de Polimorfismo, sin redefinición de Métodos y con redefinición de Métodos, pero en ambos casos los 'Métodos' 
presentaran diferentes funciones. 

• POLIFORMISMO SIN REDEFINICION DE 'MÉTODOS': "METHOD OVERLOADING"
Mas conocido como 'Sobrecarga de Métodos', es la posibilidad de que un 'Método' con la misma firma (nombre)cumpla funciones 
diferentes a través del ingreso de sus 'Parametros'. Es decir, que de acuerdo al tipo y cantidad de 'Parametros' ingresados 
al momento de invocar el Método, hara que este tenga un 'comportamiento' u otro, tome una forma u otra.


• POLIFORMISMO CON REDEFINICION DE 'MÉTODOS': "OVERRIDING METHODS" ==> @Override
La 'Sobreescritura de Métodos', es un concepto que se puede aplicar a partir de la HERENCIA DE CLASES. Cuando se 'hereda' en 
los Lenguajes Orientados a Objetos, una 'Subclase' heredara todos los 'Métodos' accesibles de la 'Clase Padre'. En el caso 
que se necesite modificar la funcionalidad del 'Método Heredado' en la 'Clase Hija' se podra REDEFINIR EL COMPORTAMIENTO de 
los Métodos Heredados conservando la misma 'firma' (nombre).
Es decir, que cuando una 'Clase Padre' le HEREDA el 'Método N' a una 'Clase Hija', la 'Sobreescritura de Métodos' nos dara la 
posibilidad de el que 'Método N' con la misma firma, tenga diferentes comportamientos acorde a la Clase desde la que fue 
invocado. Es decir, que el 'Método N' tendra un determinado comportamiento cuando sea invocada desde un 'Objeto Clase Padre' 
y tendra otro comportamiento cuando sea invocado desde un 'Objeto Clase Hija'.
Es común ver la notación "@Override" en los métodos sobreescritos. Si bien no es obligatoria, siempre es recomendable 
colocarla para identificar fácilmente que el método se encuentra en una de nuestras Clases Padres y ha sido reescrito por el 
desarrollador.
        
public class Clase_Padre {
    
    //Métodos
    
    public void Metodo_Padre(parametros_padre){
            Bloque_Instucciones_Padre
    }
}

public class Clase_Hija extends Clase_Padre {
    
    //Métodos
    
    @Override
    public void Metodo_Padre(parametros_padre){
        Bloque_Instucciones_Hija
    }
} 
        
* Diferencia entre el concepto de 'Sobrecarga' y 'Sobreescritura':
        
- Para 'Sobrecargar un Método' hay que DUPLICAR el método (en la misma Clase) y utilizar SI O SI una lista de 
'Parametros' diferentes. De esta forma acuerdo a los Parametros con los que se invoque el Metodo,tendra un determinado 
comportamiento u otro. 
        
-Al 'Sobreescribir un Método' NO SE DUPLICA el 'Método', se registra con la misma 'firma' en otra Clase_Hija y SI O SI la 
lista de 'Parametros' debe ser igual a la del 'Método Sobreescrito'. Su finilidad sera la cambiar únicamente el compartamiento 
interno del 'Método' pero no su forma de invocar al mismo. Es decir, que el Método conserva su firma y sera invocado exactamente
con los mismos Parametros pero su comportamiento dependera del 'Objeto Clase' desde el que fue invocado.



● toString:        
  ¨¨¨¨¨¨¨¨¨
El Método 'toString' es un Método heredado de la Clase Object (padre de todas las Clases) que devuelve una cadena de 
caracteres con la representación de lo que es el Objeto. 
Por lo que Sobreescribir el Método 'toString' representa la posibidad de generar un 'Método de acceso rápido' que nos retornara 
el contenido de nuestro Objeto (o el que contenido que uno necesite). 
Es conveniente RECORDAR que no es necesario invocar al Método toString con el '.toString()', es decir, colocar el nombre del 
objeto o colocar el nombre del objeto.toString() es equivalente, ambas formas invocan al '.toString' mas cercano en la cadena 
de herencia.
Cuando el Método toString no se encuentra Sobreescrito mostrará el nombre de la Clase del Objeto instanciado, el paquete al 
que pertenece seguido de un arroba y un número hexadecimal que representa el HashCode (un codigo hash que usa Java para 
identificar los Objetos en Memoria): 

com.educacionIT.javase.entidades.Camion@16f65612



● PALABRA RESERVADA 'ABSTRACT':  
  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
• CLASES ABSTRACTAS => PUBLIC ABSTRACT CLASS:  
En determinadas ocasiones, al realizar un Programa vamos diseñar 'Clases Padres' que seran de gran ayuda para poder organizar 
nuestro Proyecto, tendran un gran valor conceptual pero no sera necesario 'Instanciar un Objeto' de dicha 'Clase'. Para 
asegurarnos de que NO SE PUEDAN 'INSTANCIAR OBJETOS' vamos a declrar la 'Clase' como ABSTRACTA mediante la palabra reservada 
'abstract'.
Es decir, pueden existir 'Clases Padres' de las cuales NO SE CREARAN directamente ningún 'OBJETO', pero si se crearan 
'Clases Hijas', y a través de sus 'Clases Hijas' se podran crear 'Objetos'. Las 'Clases Abstractas' van a servir como BASE 
para que otras 'Clases Hijas' HEREDEN de ella sus Atributos y Métodos. En las 'Clases Padres' se indicaran los Atributos 
y/o Métodos mas generales, y se ira especificando hacia sus 'Clases Hijas'. 

public abstract class Clase_Padre {
    
}
        
* BONUS:    
En las 'Clases Abstractas' no se puede crear 'Objetos' con un 'Constructor' de la 'Clase Abstracta', pero dentro de una 
Variable del tipo de 'Clase Padre Abstracta' se puede contener cualquier 'Objeto' de Clase Hija. Se puede utilizar un 
'Constructor' compatible. 
Es decir, se puede crear un Contenedor del tipo 'Clase Padre Abstracta' y en la misma Instanciar un Objeto 
utilizadando el Constructor de la 'Clase Hija'. 
        
Clase_Padre_Abstracta a = new Clase_Hija ();        

En este caso, si bien al momento de instanciar habra compatibilidad hay que tener en cuenta que nuestro Objeto 'a' no podra 
acceder ni a los Atributos y/o Métodos de la Clase Hija ya que esta dentro de un Contenedor Clase Padre. Solamente estaran
disponibles aquellos Atributos y/o Métodos que son Heredados, aunque al momento de crear el objeto se hayan cargados valores
en el constructor de la Clase_Hija. 
En el caso de Castear el objeto 'a' a un contenedor Clase Hija se podra acceder a toda la información ingresada. Es decir, la 
información no se pierde pero se debe acceder desde un Contenedor compatible con dicha información. 

        
• PUBLIC ABSTRACT VOID METHOD:          
Un 'Método Abstracto' es aquel que solo posee 'firma' y no posee el cuerpo (código). Esto completa la idea de la 
Abstracción ya que solamente en las 'Clases Padres Abstractas' se podran declarar 'Métodos Abstractos', y estos deberan 
implementarse de forma obligatoria en todas sus 'Clases Hijas'. Los 'Métodos Abstractos' no poseen cuerpo, motivo por el cual 
en la 'Clase Hija' debera 'Sobreescribir el Método' y agragear el cuerpo correspondiente de forma obligatoria. 
De esta forma nos aseguramos de que todas las 'Clases Hijas' implementen si o si un mismo 'Método' con la misma firma 
(nombre), pero que dicho Método se comporte según lo que la 'Clase Hija' haya indicado. 
Es decir, los 'Métodos Abstractos' nos van a dar la posibilidad de que exista un 'Método' con la misma firma, y segun desde
que 'Clase Hija' haya sido invocado sera el comportamiento.
Es importante recordar que SOLO las 'Clases Abstractas' podran poseer 'Métodos Abstractos'. Esto no quiere decir que una
Clase Abstracta solo tendra 'Métodos Abstractos', pero si que los 'Métodos Abstractos' solo podran ser declarados en Clases 
Abstractas Si se declara un 'Método Abstracto' en una 'Clase Padre' que no lo es, el programa arrojara un error.

public abstract class Clase_Padre {
 
    ....
    
    //Métodos
    
      public abstract void Metodo_sinRetorno();
      
      public abstract String Metodo_ConRetorno();
    
}



● PALABRA RESERVADA 'FINAL':        
  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨  
'final' es una palabra reservada de Java. Tiene una semantica distinta segun donde se la utilice. Puede aplicarse a 'Atributos', 
'Métodos' o 'Clases':

- Cuando se declara 'final ATRIBUTO' transformamos el 'Atributo' en una CONSTANTE. Se colocara el nombre del Atributo en Mayus,
para identificar que es una 'Constante' y por lo tanto el valor del mismo no podra ser modificado.

 final String variable = "valor"; 

- Un 'Método' puede tener la palabra reservada 'final' cuando queremos evitar que las clases derivadas o clases hijas cambien
el comportamiento. Es decir, prohibe que se pueda 'Sobreescribir' dicho 'Método', evitando asi que se realice otra 
implementacion a la declarada. 

 public final void metodo (){
} 

- Cuando una 'Clase' posee la palabra 'final' se elimina la posibilidad de Herencia en dicha 'Clase'. Es decir, se evita la 
posibilidad de que se creen 'Clases Hijas' de la Clase que este declradad como 'final'. 

public final class{

}



*/

package clase07;

public class Herencia {

	public static void main(String[] args) {


	}

}
