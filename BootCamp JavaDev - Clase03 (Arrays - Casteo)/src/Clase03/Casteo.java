/*				
 * 								 CASTEO: CONVERSION DE TIPOS DE DATOS        
  								¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
  								
Java es un Lenguaje de tipado fuerte, cada Variable u Objeto tendra su 'Tipo de Dato' asociado, se definen como poseedores de un tipo de 
dato específico. Muchas veces nos encontraremos con la necesidad de convertir un tipo de dato a otro, y en estos casos es que utlizaremos la 
herramienta de CASTEO. Es decir, que el CASTEO sera una herramienta para lograr la conversion de un tipo de dato a otro tipo de dato. 
El 'Casteo' (casting) entonces es un procedimiento para transformar una variable primitiva de un tipo a otro, o transformar un 
objeto de una Clase a otra Clase, siempre y cuando haya una relación de herencia entre ambas.

Existen dos tipos de casteo implícito y explícito:

● CASTEO ÍMPLICITO 
Esto ocurre cuando necesitamos convertir un tipo de dato más pequeño en otro más grande. No se necesita escribir código para que se lleve a 
cabo. Ocurre cuando se realiza una conversión ancha – widening casting – es decir, cuando se coloca un valor pequeño en un contenedor mas 
grande. (Wide = amplio/a).

Algo particular que pasa con los char, es que podemos asignarlos directamente a un int o a un numérico más grande, ya que Java
devolverá el valor ASCII del carácter dado.



● CASTEO EXPLÍCITO (Narrowing Casting)
Se produce cuando se realiza una conversión estrecha (narrow = estrcho/a), es decir, cuando se coloca un valor grande en un
contenedor mas pequeño. Son suceptibles de perdida de datos y deben realizarse a través de código fuente, de forma explicita. 
Necesariamente tenemos que escribir entre paréntesis el tipo de dato al que queremos convertir (CASTEAR). Si se castean Datos 
incompatibles,  no dara un error en tiempo de compilacion pero arojarra valores erroroneos.


int a = (int) b; => mediante la aclaracion de '(int)' le estamos indicando a Java que convierta ese valor de b forzosamente a un int. 

 ***************************************************************************************************************************************




 */


package Clase03;

public class Casteo {

	public static void main(String[] args) {
		
		
		// ● Casteo Ímplicito
		
		// 	Un byte es el elemento numerico mas pequeño en Java, por lo tanto se puede pasar a cualquier 'contenedor', y así sucesivamente.
		byte miByte = 37;

		short miShort = miByte;

		int miInt = miShort;

		long miLong = miInt;

		float miFloat = miLong;

		double miDouble = miFloat;
		
		System.out.println("● Casteo Implicito");

		System.out.println(miInt);
		System.out.println(miDouble);

		// un caracter tambien representa un numero entero ASCII por lo que podemos igualar un numerico a un caracter
		char miChar = 'P';
		miInt = miChar;
		
		System.out.println(miInt);
		
		//miChar = miInt; => Error no puede hacer la transformación inversa sin castear. 

		

		// ● Casteo Explicito
		System.out.println();
		System.out.println("● Casteo Explicito");
		System.out.println(". Ejemplo 1:");
		// un double el elemento numerico mas grande en Java
		double miDouble2 = 2.9856;
		
		System.out.println("miDouble2 = "+miDouble2);

		float miFloat2 = (float) miDouble2;
		System.out.println("miFloat2 = "+miFloat2);

		long miLong2 = (long) miFloat2;
		System.out.println("miLong2 = "+miLong2);

		int miInt2 = (int) miLong2;
		System.out.println("miInt2 = "+miInt2);
		

		short miShort2 = (short) miInt2;
		System.out.println("miShort2 = "+miShort2);

		byte miByte2 = (byte) miShort2;
		System.out.println("miByte2 = "+miByte2);

		char miChar2 = (char) miInt2; // Al castear el valor se puede realizar la conversion inversa.
		System.out.println("miChar2 = "+miChar2);
		
		System.out.println();
		System.out.println(". Ejemplo 2:");
		//Define una variable del tipo int con el valor 250
		int numeroEntero = 250;
		System.out.println("numeroEntero= "+numeroEntero);
		//Define una variable del tipo short y se castea la variable numeroEntero, asegurando que la conversion sera posible. 
		short s = (short) numeroEntero;
		System.out.println("s: " + s);

		//Si se castea Datos incompatibles, no dara un error en tiempo de compilación pero arojarra valores erroroneos.

		int numeroEntero2 = 250000000;
		System.out.println("numeroEntero2= "+numeroEntero2);
		short s2 = (short) numeroEntero2;
		System.out.println("s2 (con dato fuera de alcance): " + s2);
	
	}
}
