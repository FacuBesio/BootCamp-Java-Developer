/*
												● WRAPPER - CLASES ENVOLTORIO
  												  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
(wrapper => envoltura)
Muchas veces vamos a encontrar la necesidad de convertir un dato, por ejemplo un 'valor numérico' a un 'String' o viceversa. 
También nos vamos a encontrar mas adelante con Objetos en Java que no permiten el uso de los valores primitivos.
Java nos provee una forma de 'envolver' los datos primitivos en un Objeto (Wrapper Class) por cada uno de los 8 tipos que 
existe. Además nos dan una variedad de métodos de utilidad que los datos primitivos no poseen, la mayoría de estos están 
relacionados con varias conversiones. Otro punto importante es que nos permite usar el null a diferencia de los primitivos.
        
Los WRAPPER entonces SERAN LA RESPRESENTACIÓN DE LOS VALORES PRIMITIVOS COMO OBJETOS, y seran utilizados para envolver los 
tipos de datos primitivos. En general tienen dos constructores:
- Con los valores Primitivos como parámetro.
- Con los valores como cadena de caracteres como parámetro.
Tienen un método estático valueOf() que retorna un objeto Wrapper.

• CLASE INTEGER
Utilizada para envolver el tipo de dato primitivo 'int'. Es una Sub Clase de java.lang.Number.

Integer miEntero = new Integer(50);
Integer miOtroEntero = Integer.valueOf("50");

        
• CLASE FLOAT
Utilizada para envolver el tipo de dato primitivo 'float'. Es una subclase de java.lang.Number.

Float miPuntoFlotante = new Float(45.67);
Float miOtroPuntoFlotante = Float.valueOf(45.67);


La 'Clase Number' representa el concepto abstracto de un numero en Java. Tiene como objetivo ser la superclase de los
Wrappers de los tipos de dato numéricos primitivos. Es una clase abstracta, es decir que no se puede instanciar.

*/

package clase06;

public class Wrappers {

	public static void main(String[] args) {

	}

}
