/*
									● JDBC (Java DataBase Connectivity)
  							  		  ¨¨¨¨
* API = Application Programming Interface - Interfaz de Programación de Aplicaciones.
Uno de los principales propósitos de una API consiste en proporcionar un conjunto de funciones de uso general, para poder 
gestionar la comunicación entre componentes de software.

Java Data Base Connectivity (JDBC) es una API de acceso a bases de datos estándar SQL. Proporciona un acceso uniforme 
a una gran variedad de Bases de Datos relacionales desde Java. Va a representar un conjunto de Clases e Interfaces 
predefinidas que nos brindaran un entorno para poder interactuar con la Base de Datos (BBDD) y realizar operaciones desde 
nuestro proyecto Java.
Con el JDBC entonces podremos realizar un procedimiento paso a paso para interactuar desde nuestra aplicación Java con la BBDD. 

Cada Sistema Gestor de Base de Datos (SGBD) tendrá su propio Driver para intertactuar con el JDBC. Este Driver lo proporciona 
el propio fabricante del SGBD. Básicamente a través del JDBC se establece una Conexión con el SGBD, y a través del
SGBD se accede a la información de la BBDD. 
Para poder establecer esta Conexión desde una aplicación Java vamos a necesitar dos paquetes, 'java.sql' y 'javax.sql'. 
Estos paquetes tienen en su interior un conjunto de Clases e Interfaces que nos van a permitir realizar la 
Conexión y manipulación de la BBDD. La Clase más utilizada es DiverManager, y las Interfaces Connection, ResulSet, Statement,
DataSource.


• java.sql: Paquete para acceder y procesar datos almacenados en una fuente de datos (generalmente una base de datos 
relacional).
• javax.sql: Paquete para acceso y procesamiento de fuentes de datos del lado del servidor.

Para llevar a cabo la conexión con la Base de Datos podemos simplificar todo el proceso en 4 pasos:
1. Establecer Conexión con la BBDD.
2. Crear un Objeto Statement.
3. Ejecutar sentencia SQL. 
4. Leer el ResulSet. 
*/

package clase16;

public class JDBC_parte1 {

}
