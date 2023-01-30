/*
 										● MIEMBROS DE INSTANCIA Y CLASE
										 ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
       
• ATRIBUTOS Y METODOS DE INSTANCIA
Son aquellos Atributos y Métodos que para acceder a los mismos se debera crear un 'Objeto' de la 'Clase', es decir una
Instancia de la 'Clase'. Pertenecen a un 'Objeto' de la 'Clase', y solamente mediante este Obejeto se podra acceder a los
mismos.

• ATRIBUTOS Y METODOS DE CLASE : "STATIC"
Son aquellos Artibutos y/o Métodos que  no sera necesario 'Instanciar' un 'Objeto' de la 'Clase' para acceder a los mismos. 
Pertenecen a la Clase y no a un Objeto (o Instancia). Se podra acceder a través de la misma Clase. Para declarar un Atributo 
o Método de Clase se utilizara la palabra reservada 'static'.

'static' se usa principalmente para el manejo eficiente de la memoria de nuestro programa. Se usa en la mayoría de los casos 
para datos en común, por ejemplo, el nombre de la empresa, la versión del programa, etc. Obtiene el dato en memoria solo una 
vez al momento de la carga de la 'Clase'. Con una constante estática asignamos un solo espacio de memoria para todos los 
Objetos, en cambio cuando esa constante la hacemos miembro de instancia (único para cada objeto) reserva un espacio de memoria 
por cada objeto. Es una palabra reservada adicional y no limita que se le pueda asignar un modificador de 
acceso según sea nuestro requerimiento. 
        
. Métodos Estáticos:
Conocidos también como 'Métodos de Clase', se puede acceder al Método sin la necesidad de crear un 'Objeto de la Clase'. Un 
'Método Estático' puede acceder a un 'Atributo Estático' y cambiar su valor.
Hay dos cosas importantes a tener en cuenta:
1. El método estático no puede utilizar Atributos no estáticos ni llamar directamente a un Método no estático.
2. this y super no se pueden utilizar en un contexto estático.
        
. Bloques Estáticos: 
Es posible declarar 'Bloques' de código como 'estáticos', de tal manera que sean ejecutados cuando se cargue la Clase. Se 
utiliza para inicializar el miembro de datos estáticos. Se ejecuta antes que el Método principal en el momento de la carga de 
Clases.
Si no se declara un Bloque de este tipo de forma explícita, la JVM combina todos los campos estáticos en un bloque y los 
ejecuta durante la carga de Clases.

*/

package clase06;

public class Miembros_Estaticos {

	public static void main(String[] args) {
		
		// EJEMPLO
		
		//Atributos
		System.out.println(Clase_Estatica.variableString_Estatica);
		Clase_Estatica.variableString_Estatica = "asd";
		System.out.println(Clase_Estatica.variableString_Estatica);
		//Métodos
		Clase_Estatica.metodo_Estatico();

	}

}
