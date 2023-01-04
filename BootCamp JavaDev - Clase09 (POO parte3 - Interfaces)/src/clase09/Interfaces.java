/*
 													● INTERFACES:
 													¨¨¨¨¨¨¨¨¨¨¨¨¨¨
El concepto de Abstracción se puede ampliar mucho mas ya que podemos pensar en 'Clases' totalmente 'Abstractas' a la hora de 
analizar un problema y definir una serie de 'Métodos Genericos' (sin cuerpo) pero que CONCEPTUALMENTE indiquen la accion que
habria que reallizar.  
Cuando hablamos de CLASES totalmente ABSTRACTAS podemos recurrir a una variante de las 'Clases' llamadas INTERFACES. 
Una INTERFAZ entonces sera un contrato entre un concepto y una implementación. Se aplica para Clases que están distribuidas en 
el sistema que no necesariamente esten relacionadas por herencia pero necesitan tener un comportamiento similar en 
determinadas circunstancias, necesitan realizar las mismas acciones. Es una declaración de VOCABULARIO, un conjunto de métodos 
sin su implementación donde se define el nombre de la firma de los Métodos y cual sera la función que tendra conceptualmente. 
Posteriormente la Clase que implemente la Interface terminara de definir como sera el comportamiento del Método 
sobreescribiendo el mismo de forma obligatoria. Con las Interfaces entonces vamos a definir un 'protocolo de comportamientos 
(acciones)' entre Clases que no tengan relación de Herencia. 
Una Interfaz puede heredar de otras Interfaces. Recordemos que Java solo permite la Herencia Simple (heredar de una sola Clase) 
pero con las Interfaces podemos simular la 'Herencia Multiple'. Una Clase podra tener solamente una 'Clase Padre', pero 
podra Implementar la cantidad de 'Interfaces' que se desee. 
Otra de las ventajas de trabajar con Interfaces sera que al utlizar la mismas se puede omitir el modificador de acceso 'public', 
la palabra reservada 'static' o 'final', ya que por definición todos los 'Métodos' seran 'Abstractos' y de acceso Público, y 
todos los 'Atributos' seran tambien 'Estáticos' o 'Constantes' (finales). 
Las INTERFACES no tendran 'Constructores propios', ya que como en las Clases Abstractas no se podran instanciar Objetos
de la misma, pero si se podran instanciar desde cualquier Clase que la Implemente. 

Una INTERFACE entonces sera una declaración de COMPORTAMIENTO y VOCBULARIO  en común, es decir, un CONJUNTO DE MÉTODOS sin su 
implementación (sin cuerpo) destinado a un conjunto de Clases que no esten relacionadas por Herencia pero necesiten realizar
las mismas acciones. Todas las 'Clases' que Implementen la 'Interfaz' estaran obligadas a Implementar los Métodos de
la Interfaz y Sobreescribir los mismos segun corresponda. Esto principalmente va a permitir que todas las Clases que 
implementen la Interfaz tengan la misma Firma para realizar las mismas funciones, pero cada Clase implementara el Método de 
forma propia.
Las Interfaces por lo tanto no tendran Codigo y seran sus implementaciones quienes definan el comportamiento. En otras 
palabras las INTERFACES NOS VAN A PERMITIR TRABAJAR CON POLIMORFISMO Y DEFINEN EL VOCABULARIO. 

Para indicar que una 'Clase' implementara una INTERFACE se utilizara la palabra reservada 'implement'


.Sintaxis: 
    
.DECLARACIÖN NUEVA INTERFACE:

public interface id_Interface {    
        
    metodo_abst(Parámetro id_par);      -----> Los Metodos se declaran sin {} ya que no tiene Codigo. Solo se declara la 
}                                       Firma. (Id_ Metodo + Parametros). 

        
.CLASE QUE IMPLEMENTA LA INTERFAZ:

public class id_Clase implements id_Interface { 

    @Override
    public metodo_abst(Parámetro id_par){
        
       ---> Implemtancion (Código) <---
    };
}


♦ OBJETOS INTERFACES COMO PARÁMETRO:
Cualquier Clase que implemente una Interfaz estara obligada a implementar y sobreescribir sus Métodos. Por este motivo es que 
se podrán usar 'Objetos Abstractos' de la Interfaz con sus respectivos Métodos Abstractos al momento de escribir codigos. Es 
decir, un 'Objeto Abstracto' hace referencia a que únicamente se podra ingresar como Parámetro un Objeto instanciado desde 
cualquier Clase que Implemente la Interfaz. Por definición este 'Objeto instanciado' tendra si o si entre sus Métodos 
disponibles, al 'Método Abstracto' de la Interfaz Sobreescrito.
Si bien al momento de hacer codigo es de gran utilidad poder usar un 'Objeto Abstracto' para hacer referencia al 'Método 
Abstracto', es importante recordar que el Comportamiento del Método estará determinado por la Clase que instancio el Objeto.


    public void Método (Interfaz obj_gen){
        .....
        obj_gen.metodo_gen();      
        .....
    }                                    


♦ MÉTODOS DEFAULT:
Solo se permiten introducir en Interfaces, por lo tanto no existen en Clases. Estos Métodos, al igual que todos los demás en 
las Interfaces, son de manera implícita públicos. Su principal diferencia es que no son Abstractos como el resto y 
proporcionan una implementación. 
Los Métodos Default ya estarán disponibles en las Clases que implementen la Interfaz, sin haberlos sobreescrito, ni 
tampoco con la obligación de hacerlo. Otra característica es que no sera necesario instanciar un Objeto de la Clase, solamente 
con crear un Contendor de la Interfaz sera sufuciente para poder hacer uso de estos Métodos Default. 

public interface id_Interface {    
        
    metodo_abst(Parámetro id_par);

     public default metodo_default(){
        .......
        Bloque de Codigos
        .......
    }
} 



● INTERFACES FUNCIONALES (Java 8):
  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
Es toda aquella Interfaz que tenga solamente un 'Método Abstracto'. Es decir, puede implementar uno o mas métodos default, 
pero deberá tener forzosamente un ÚNICO Método Abstracto.
Una de las pricipales ventajas de trabajar con Interfaces Funcionales sera que sus Métodos NO necesitan una Clase para poder 
Implmentarse. Es decir, que para poder ejecutar los Métodos de las Interfaz Funcional, no será necesario instanciar un 
Objeto ni ninguna Clase que implmente la Interfaz. Simplemente con crear una Variable Contendor de la Interfaz sera 
suficiente para poder hacer uso del Método Abstracto a través de una Expresion Lambda, o utlizar cualquiera de sus Métodos 
Default. 
Cuando una 'Expresion Lambda' es asignada a una Interfaz Funcional, esta siempre sera implementada en el 'Metodo Abstracto', 
es por esta razón que solo puede existir un único Método Abstracto y muchos Defaults. Una forma de asegurarnos de que estamos 
definiendo correctamente una Interface Funcional, es anotarla con @FunctionalInterface, ya que al anotarla el IDE 
automáticamente nos arrojara un error si no cumplimos con las reglas de una Interface Funcional.      

. EJEMPLO: 

@FunctionalInterface
public interface Interfaz_Funcional {

    public String metodo_abst(String name);  <----- MÉTODO ABSTRACTO
    
		
    public default String metodo_default1(){
        return  "Hello World";
    }

    public default String metodo_default2(){
        return "Hola Universo";
    }

    public default String metodo_default3(){
        return "Hola Mundo";
    }
}


public class Test_InterfazFuncional {

	public static void main(String[] args) {
		
        Interfaz_Funcional in_fun1 = (name) -> "Hello " + name;     <--- SE DECLARA DIRECTAMENTE COMO SE VA IMPLEMENTAR EL 
                                                                         MÉTODO ABSTRACTO DE LA 'Interfaz_Funcional'
        System.out.println(in_fun1.metodo_abst("Juan Rosales"));

        System.out.println(in_fun1.metodo_default1());
        System.out.println(in_fun1.metodo_default2());
        System.out.println(in_fun1.metodo_default3());
        
	}

}

Se declara la Expresion Lambda '(name) -> "Hello " + name;' que indica como el Parámetro (name) será implementado. Luego esta 
expresión sera asignada al de Método Abstracto del Objeto 'in_fun1', que es del tipo Interfaz_Funcional. Es decir, cuando se 
invoque el Método Abstracto de 'in_fun1' tomara la lógica de la 'Expresion Lambda' asignada.

Como vemos la expresion Lambda siempre se asigna al 'Método Abstracto', mientras que los métodos 'metodo_default1, 2, 3 ' 
continuan con la misma implementación que viene desde la Interface. Es por esta razón por la que solo puede existir un único 
Método Abstracto y muchos Defaults.
*/

package clase09;

public interface Interfaces {

}
