/*
 											● GENÉRICOS<>
  											  ¨¨¨¨¨¨¨¨¨
Definición: Perteneciente o relativo al conjunto de los miembros de una Clase. Denota el Conjunto de los miembros de una Clase. 
Java es un lenguaje de tipado fuerte lo que quiere decir que debemos asignar un Tipo de Dato a nuestros Atributos y eso 
permite que en tiempo de compilación no se asigne un valor distinto al Tipo de Dato declarado. Esto tiene sus ventajas, pero 
en muchos casos se va a necesitar una estructura (Clase) genérica que nos ayude a solventar varios problemas. A partir de Java
1.5 se agregaron una serie de extensiones al lenguaje y una de ellas fueron los Genéricos. Los Genéricos permiten abstraerse 
de los Tipos de Datos. 
Se podria resolver el problema declarando las Variables como Object ya que por polimorfismo se convierte en cualquiera de sus 
hijos, incluyendo estructuras nuevas. El problema es que con las Variables tipo Object debemos hacer validaciones constantes 
para que no asignen Tipos de Dato incorrectos al deseado. Recordemos Object puede convertirse en cualquiera de sus hijos, 
incluyendo todos los datos primitivos, lo que exigiría mas código para castear cada caso de uso, o preguntar si el Objeto es 
una instancia del Tipo de Dato que necesita nuestra lógica del programa. Los Genericos restringen al código para que los 
Tipos de Datos se conviertan en tiempo de compilación, en lugar de tiempo de ejecución. Dado este hecho, si un tipo no es 
“convertible” se detecta en tiempo de compilación y no de ejecución. Los Generics aseguran un mejor diseño de software.
El operador diamante '<>' nos va indicar el Tipo de Dato que va se va a implementar. Es importante recordar que los Genéricos 
en Java sólo funcionan con Objetos como Parámetros. En el caso de querer utilizar Datos Primitivos habra que recurrir a las 
Clases Wrapper. 

Java nos brinda Esteoreotipos para poder trabajar con los Genericos, y de esta forma poder indicar que Tipo de Objeto se 
espera.

<E> - Element (principalmente utlizado en la API Colecctions)
<K> - Key
<N> - Number
<T> - Type
<V> - Value
<S,U,V> - 2nd,3rd,4th types


Por ejemplo:

* Se crea una Clase y entre los <> se ingresaran la cantidad de Objetos 'Genericos' que va a recibir la Clase representados 
por la letra correspondiente. 

public class ClaseGenerica <K, V>{
    private K atributo1; 
    private V atributo2; 
}

En este caso se indica que la ClaseGenerica tendra dos atributos, K y V. El primero etara asociado a una KEY(clave) y segundo 
a un VALUE(valor). Al momento de instanciar un Objeto de la ClaseGenerica se debera indicar entre los <> que tipo de Dato 
seran K y V, pudiento adoptar diferentes tipos de datos en cada caso.

public class Test_Genericos2 {
    
    public static void main(String[] args) {

        ClaseGenerica <Integer, Integer> telefono_generic = new ClaseGenerica<>();
        telefono_generic.getAtributo1();
        telefono_generic.getAtributo2();
        
        ClaseGenerica <Integer, Integer> documento = new ClaseGenerica<>();
        documento.getAtributo1();
        documento.getAtributo2();
        
        ClaseGenerica <Integer, Integer> dirreccion = new ClaseGenerica<>();
        dirreccion.getAtributo1();
        dirreccion.getAtributo2();
        
        ClaseGenerica <String, String> dirreccion_String = new ClaseGenerica<>();
        dirreccion_String.getAtributo1();
        dirreccion_String.getAtributo2();
        
        ClaseGenerica <String, Integer> dirreccion_String_Int = new ClaseGenerica<>();
        dirreccion_String_Int.getAtributo1();
        dirreccion_String_Int.getAtributo2();

}

De esta forma aseguraramos que se ingrese solamente el Tipo de Dato deseado, sin necesidad de realizar validaciones. Es decir,
Java no va a permitir compilar si se esta ingresando un tipo de dato distinto. Es una gran ventaja poder limitar los Tipos de 
Datos ingresados en determinadas circunstancias, y mediante el correcto uso de los Genericos se le podra indicar de forma 
clara a Java que realice las validaciones correspondientes en tiempo de Compilación. 

Aquí es donde entran las Clases Genéricas que nos permiten crear Clases, Interfaces y Métodos en los que los Tipos de Datos 
sobre los que queremos operar se envían como argumentos al instanciar la Clase, de esta forma la Clase trabajará el dato
que le enviamos


♦ LIMITACIONES EN LOS PARÁMETROS DE TIPO:
Existen situaciones en las cuales se desea limitar los Parámetros que se puedan asignar a un Genérico cuando se declara
un Objeto. Para esto Java provee un mecanismo a través de las Cadenas de Herencia que permite establecer un límite de manera 
tal que un Parámetro, se le pueda asignar un Tipo sólo si pertenece a la Cadena de Herencia declarada.
Para declarar el límite en un Parámetro Generico, se debe escribir el nombre de éste, seguido de la palabra clave extends 
más la Super Clase que se desea establecer como de su límite superior. 
Es decir, que al establecer en los Genericos un límite de Parámetros con una Super Clase, solo se aceptaran Objetos 
instanciados desde Clases que pertenezcan a la Cadena de Herencia. 
En el siguiente ejemplo con Number se esta indicando que el Génerico U solo podrá ser reemplazado por un Objetos instanciado
desde cualquier Clase que extienda de Number. 

public class Test<T> {
    public <U extends Number> void inspeccionar(U u) {
    System.out.println("T: " + t.getClass().getName());
    System.out.println("U: " + u.getClass().getName());
    }
}

♦ PARÁMETROS DESCONOCIDOS DECLARADOS CON CARACTERES COMODINES:
Al codificar se presentan situaciones en las que se necesita crear un Parámetro Genérico limitado para declarar una referencia
pero se desconoce la Subclase o la Superclase. Java admite estos dos estilos de declaraciones usando un carácter de comodín, 
el símbolo '?' en su reemplazo. 

. Cuando se desconoce la Subclase, pero se quiere límitar el parámetro la declaración es:
<? extends A>
El parámetro es un Tipo desconocido es A o una subclase de A

.Cuando lo que se desconoce es la Superclase, la declaración se transforma en:
<? super D>
El Parámetro es un tipo desconocido que es D o una Superclase de D.

*/

package clase06;

public class Generics {

}
