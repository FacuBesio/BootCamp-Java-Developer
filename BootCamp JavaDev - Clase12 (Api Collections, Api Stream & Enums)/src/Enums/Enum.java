/*
 											● ENUMS: ENUMERADOS
											 ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨  
Muchas veces nos encontramos con la necesidad de definir un tipo de dato en un Objeto y que sus valores esten delimitados por 
una lista de Constantes y únicamente se pueda seleccionar entre esos Valores. 
Para este típo de situaciones es que podremos hacer uso de la Clase 'Enum'. Los 'Objetos Enum' en Java, nos van a permitir 
definir de forma simple Enumerados con una lista de constantes.
'Enum' es una Clase especial que se define de forma particular. En lugar de utilizar la palabra reservada 'class' se debe 
colocar la palabra reservada 'enum' al momento de generar la Clase. Esto le indicara a Java que esta Clase hereda de Enum del 
paquete java.Lang y por lo tanto heredara sus Atributos y Métodos.

public enum Dia {
	LUNES,MARTES,MIERCOLES,JUEVES,VIERNES;
}


Un Objeto Enum son del tipo son TYPE-SAFE (de tipo seguro), lo que significa que solo puede contener los valores definidos por 
la lista. Por lo tanto, una enumeración brinda una manera de definir con precisión un nuevo tipo de dato que tiene una 
determinada catidad de valores válidos.

- MÉTODOS	

Tipo		Método			Descripcion
String 		toString() 		Devuelve una breve descripción del objeto enum.
String 		name() 			Devuelve el nombre del enumerado.
int 		ordinal() 		Devuelve la posición del enum según este declarado comenzando desde cero.
Enum[] 		values() 		Devuelve un arreglo con todos los elementos que se encuentren en el enum.
Enum 		valueOf() 		Devuelve la constante enum del valor de cadena especificado si existe, de lo contrario mostrara un error

 
Aunque los Enum son una Clase, debemos indicar que no podemos instanciarla (Colores color = new Colores();), pero podemos 
crear Variables Tipo Enum (Colores color = Colores.VALOR). Los enumerados tienen los constructores con el acceso privado, 
por eso no se pueden instanciar desde otra Clase.

- ATRIBUTOS EN LOS ENUM
Si quisiéramos podemos darles Atributos a nuestros Objetos Enumerados. Al momento de crear la Clase Enum primero se deben 
ingresar las Constantes de forma obligatoria, y luego podremos declarar los Atributos que tendra cada Constante. Al momento de 
crear las Constantes en los Enums, podemos ingresar el valor de los Atributos entre () en el mismo orden y cantidad de 
Atributos declarados, o generar los Getters y Setter correspondiente para luego instaciar el valor de los Atributos desde un
main. Al igual que en la Clases se deberan generar los constructores correspondientes para ambos casos. 

 
 que soporte dichos atributos y crear los métodos getters para poder obtenerlos.
Primero se declara entre parentesis el valor Enum con sus Atributos, luego se deben declarar las Variables que van a recibir a los
Atributos, despues deberemos crear un Constructor (privado) que soporte dichos Atributos y finalmente crear los métodos getters 
para poder obtenerlos. Solo puede existir un constructor en el enumerado y cada objeto del enum debe poseer siempre la misma 
cantidad de atributos. 

public enum Colores {
	
	NEGRO("000000", "0,0,0"), ROJO ("FF0000", "250,0,0"), VERDE ("008000", "0,128,0"), AZUL ("0000FF", "0,0,250");
	 
 	private String HEX_COD; 
	private String RGB_COD;
	
	private Colores() {
		
	}
	
	private Colores(String hEX_COD, String rGB_COD) {
		HEX_COD = hEX_COD;
		RGB_COD = rGB_COD;
	}
	
		public String getHEX_COD() {
		return HEX_COD;
	}

	public String getRGB_COD() {
		return RGB_COD;
	}

	*/

package Enums;

public enum Enum {
	
	
}
