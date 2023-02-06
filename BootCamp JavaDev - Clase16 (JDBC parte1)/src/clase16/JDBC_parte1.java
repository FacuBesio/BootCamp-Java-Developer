/*
									● JDBC (Java Data Base Connectivity)
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
el propio fabricante del SGBD. Básicamente a través del JDBC se establece una Conexión con el SGBD, y se accede a la información 
de la BBDD. 
Para poder establecer esta Conexión desde una aplicación Java vamos a necesitar dos paquetes, 'java.sql' y 'javax.sql'. 
Estos paquetes tienen en su interior un conjunto de Clases e Interfaces que nos van a permitir realizar la 
Conexión y manipulación de la BBDD desde Java. La Clase más utilizada es DiverManager, y las Interfaces Connection, ResulSet, 
Statement, PreparedStatement, DataSource.

- java.sql: Paquete para acceder y procesar datos almacenados en una fuente de datos (generalmente una base de datos 
relacional).
- javax.sql: Paquete para acceso y procesamiento de fuentes de datos del lado del servidor.

Para llevar a cabo la conexión con la Base de Datos podemos simplificar todo el proceso en 4 pasos:
1. Establecer Conexión con la BBDD.
2. Crear un Objeto Statement.
3. Ejecutar sentencias SQL. 
4. Leer el ResulSet. 

Primero se establece la conexión con la BBDD y a través de la misma podremos crear un Objeto del tipo Statement. Este Objeto esta 
preparado para ejecutar sentencias SQL desde Java hacia el SGBD (indicado en la Conexión). En el caso de que dichas sentencias retornen 
un resultado, el mismo sera retornado a través de un Objeto del tipo ResultSet. A través del mismo se podra acceder a la información 
que nos brindo la BBDD según nuestra consulta.

* 1. CREAR LA CONEXIÓN * 
Establecer Conexión con la BBDD (DriverManager)
Consiste en crear una Clase que se encarge de establecer y contener la Conexión a la BBDD. El Método 'DriverManager.getConnection()' 
será el encargado de establecer la CONEXIÓN con la BBDD. Para ello vamos a crear un Objeto del tipo 'Connection' para contener 
básicamente la conexión que nos retornará DriverManager. 
Para ingresar los parámetros en el método '.getConnection (url, user, pass)' y generar la conexión de una forma ordenada y légible 
se recomienda crear atributos privados y estáticos con la información correspondiente. 
Si bien hay varias formas de establecer la conexión se recomienda crear atributos y métodos estáticos con el constructor de la Clase 
privado para evitar que se creen objetos de la misma y se pueden generar varias 'Conexiones'. De esta forma sin la necesidad de 
instanciar un Objeto de la Clase, se puede acceder a el Método que nos va a devolver la Conexión con la BBDD y nos aseguramos de que 
solamente mediante dicho método controlado se pueda acceder la Conexión.
Todas las Cadenas de Conexion tienen la misma estructura y dependen de la Base de Datos utlizada. 


public class Conector {

    private static Connection conn=null;

    private static String driver="org.mariadb.jdbc.Driver";     // Se obtiene desde las Dependencias. 
    
    private static String url="jdbc:mariadb://localhost:3306/colegio?serverTimezone=UTC";Conecta el servidor con la BBDD.
    
    private static String user="root";          // Usuario

    private static String pass="";              // Password
    
    
    private Conector(){							// Constructor privado
    
    }

    
    
    public synchronized static Connection getConecction(){ 
        try {
            if(conn==null || conn.isClosed()){ 
                Class.forName(driver);         
                conn=DriverManager.getConnection(url, user, pass); 
            }
        } catch (Exception e) {
                System.out.println(e);
            }
    return conn;
    }
}
    
• A través de 'Class.forName(driver)' vamos a indicar donde se encuentra el 'Driver' que va a utilizar nuestra Conexión.
La ruta a ingresar dependerá de cada Driver, pero básicamente en la Librería que estemos utlizando hay que copiar la ruta
hasta la carpeta que contenga el Driver.  
. Ejemplos: 
 
 'org.mariadb.jdbc.Driver'
 
 'com.mysql.cj.jdbc.Driver'
 
Generalmente la Libreria se encuentra en Dependencies o Referenced Libraries.

• Una vez registrado el Driver debemos establecer la conexión a través de del Método estático
'getConnection (String url, String user, String password)' que nos provee la Clase DriverManager. Se envia la url, usuario y password 
y nos retornara la Conexión a la BBDD. Es necesario crear un Objeto Connection para contener la el retorno con la Conexión.

• La URL espera el SGBD, el nombre de la PC o su IP, el Puerto de conexión a la base de datos (por defecto en MariaDB y 
MySQL 3306) y el nombre de la Base de Datos.

• El usuario espera el nombre del usuario que se conecta a la base de datos, por defecto en MariaDB y MySQL es root.

• La Clave espera por defecto la contraseña que posee el usuario, dependiendo del tipo de instalación puede estar vacía o 
una clave colocada al momento de instalar.

 
 * 2. CREAR UN OBJETO STATEMENT * 
El 'Objeto Statement' es un Objeto que contendra los métodos que nos van a permitir ejecutar sentencias SQL y por lo tanto solo lo 
podremos crear a través de una Conexión existente a una BBDD. Es decir, que a través de la conexión creada vamos a poder invorcar 
el método 'createStatement()' y crear un Objeto Statement preparado para interactuar con la Base de Datos especificada en la Conexión. 
La Interfaz 'Statement' nos provee una serie de métodos que nos van a permitir no solo ejecutar sentencias SQL, sino que tambien poder 
acceder a los resultados que producen las sentencias ejecutadas. Con Statement principalmente podremos acceder a los diferentes 
'execute ()', que serán los métodos que van a ejecutar nuestras sentencias SQL en nuestra BBDD.  


* 3. EJECUTAR SENTENCIAS SQL: 'execute()' / 'executeQuery()' *
A través del Objeto Statement podremos utlizar los métodos 'execute("sentencia SQL")' y finalmente ejecutar las sentencias SQL en la 
BBDD. Dependiendo de si utilizamos el método '.execute ()' o '.executeQuery()' es que tendremos un valor de retorno o no. Para aquellas
sentencias SQL que no tengan un valor de retorno y sean simplemente de ejecución (void) vamos a utlizar el método  'execute()', y 
para aquellas sentencias SQL que tengan un valor de retorno vamos a utilizar el método 'executeQuery()'. Este último método nos 
retornara un Objeto tipo ResultSet, motivo por cual habra que crear previamente un Objeto ResultSet para poder contener el resultado. 
Un ResultSet es una especie de tabla virtual que se almacena en la Memoria con información en su interior. 
En resumen, para métodos vacios (void) vamos a utlizar 'execute()', y para métodos que retornen resultados vamos a utlizar 
'executeQuery()' y almacenar el resultado en un Objeto tipo ResultSet. 


	ResultSet rs= Conn.DriverManager.getConnection(url, user, pass).
                       createStatement(). 
                       executeQuery("... sentencia SQ L...");



Tipo        Método                  Descripción
Boolean     execute (String sql)    Ejecuta la instrucción SQL dada, que puede devolver varios resultados.
ResultSet   executeQuery ()         Ejecuta la instrucción SQL dada, que devuelve un solo Objeto ResultSet.
Int         executeUpdate()         Ejecuta la instrucción SQL dada, que debe ser de tipo DML y devuelve uno (1) si se realizo
                                    correctamente o cero (0).

- execute(): Devuelve un Boolean si se utilizo un Insert, Delete, Update = True / False = Select.  

- executeQuery(); Retorna un Objeto ResultSet. Sirve para sentencias Select. Devuelve un Conjunto de Registros.

- executeUpdate():  Retorna un Int. Sirve para sentencias de tipo Insert, Delete, Update. Devuelve un Entero que es la 
cantidad de registro que se modificaron en la Base de Datos. Es decir, si devuelve un 0, no se modifico nada, y si devuelve 
un 1 o mas si. 

- executeLargeUpdate();  Permite ejecutar multiples Consultas separadas por ",".


* 4. LEER el ResulSet *
ResultSet es un conjunto de Registros. Para recuperar la  información de una tabla o un origen de datos tabular Java nos 
proporciona la Interfaz ResultSet. Esta Interfaz nos provee de varios Métodos para obtener los datos de Columna correspondientes
a un Fila, ya que representa una Tabla. Todos ellos tienen el formato ResultSet.getTipoDato(), siendo () el nombre de 
la Columna. Algunos ejemplos de estos métodos son getInt, getLong, getString, getBoolean y etc. Casi todos estos Métodos toman un solo 
parámetro, que es el índice que la Columna tiene dentro del ResultSet o bien el nombre de la Columna.

rs.getInt("id");

El método executeQuery (String sql) de la interfaz Statement nos devuelve dicho objeto. Para poder recuperar cada una de las
Filas del ResulSet comunmente utlizaremos el bucle while colocando como condición el método 'next()' que devuelve un boolean indicando 
si existe una fila que leer (true = hay registros, false = no hay mas registros). De esta forma se podra navegar registro a registro 
utilizando esta 'Tabla' y acceder a la información brindada por la Base de Datos. 

        if(rs.next()) System.out.println(rs.getString("nombre"));  
        

● CONNECTION
  ¨¨¨¨¨¨¨¨¨¨
Esta Interfaz provee una sesión de trabajo con una Base de Datos. Sus métodos, aparte de permitir modificarla y consultar 
sus Tablas, permiten obtener información sobre su estructura.

Tipo                Método                              Descripción
void                commit()                            Confirma los cambios realizados provisionalmente por las 
                                                        transacciones.
void                close()                             Libera la conexión a la base de datos.
Statement           createStatement()                   Crea un objeto Statement para enviar sentencias SQL a la base de 
                                                        datos.
PreparedStatement   prepareStatement(String sql)        Crea un objeto PreparedStatemento para enviar sentencias SQL 
                                                        parametrizadas a la base de datos.
void                rollback()                          Deshace todos los cambios realizados en la transacción actual y 
                                                        libera los bloqueos de la base de datos.
void                setAutoCommit (boolean autoCommit)  Establece el modo de confirmación automática.
boolean             isClosed()                          Recupera si la conexión se ha cerrado.




● DAO - Data Access Object
  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
Para dar una organización entre las Clases, las Conexiónes creadas y la relación que tiene Java con la Base de Datos es que 
se crea un esquema, un patron llamado DAO (Data Access Object). Su función principal sera mediante un esquema poder reflejar 
nuestros Objetos Java en la BBDD. Es decir, la posibilidad de crear Objetos en Java y que estos sean alamacenado de forma 
permanente en una Base de Datos. 
Muchas veces se nos presentaran momentos en los que debemos acceder a los datos desde diferentes fuentes y esto representa la 
implementación de una lógica. Este patrón de diseño viene acompañado de otro patrón el DTO Objeto de Transferencia de Datos (Data 
Transfer Object) que es un patrón que simplemente que propone la creación de un objeto que se encargue de la transferencia de datos 
entre el servidor y el cliente.

Todo patrón de diseño tiene una estructura, el DAO esta representado de la siguiente manera:

- ENTIDADES (Business Object):
Representa un objeto con la lógica de negocio. 'Entidades de negocio' (Persona, Documento, Alumno, etc).
Por un lado se debe crear una Entidad (Clase) que refleje exactamente todo el contenido de nuestra Tabla en la BBDD. Es decir, 
se deberá crear una Entidad por cada Tabla en nuestra BBDD. La idea es que nuestros Objetos (Java) los podamos 
registrar en nuestra BBDD (SQL), por este motivo es importante que las Clases creadas en Java tengan la misma cantidad y tipo 
de Atributos que los Campos de las Tablas creadas en SQL, una debe ser el reflejo de la otra. 
Básicamente las Entidades son la representación en Java de las BBDD SQL. 
Una CLASE en JAVA comienza con MAYUSCULA y va en SINGULAR, por el contrario las TABLAS en SQL comienzan en MINUSCULAS y van 
en PLURAL. Los Objetos en memoria se crean y se destruyen, en la Base de Datos persiste de forma permanente. 

- INTERFAZ DAO o JDBC (Data Access Object):  
Representa una capa de acceso a datos que oculta la fuente y los detalles técnicos para recuperar los datos. Contiene la abstracción 
de los métodos necesarios para acceder, modificar, eliminar e insertar nuestros Objetos en la BBDD.
Podemos sin ningún problema crear una interfaz por cada entidad de negocio pero para simplificar nuestro código nos apoyamos 
en los genéricos. 

- REPOSITORIOS - CLASES DAO o JDBC (Data Source): 
Representan la implementación de la Interfaz. Representada por un Objeto que implementa los algoritmos necesarios y el acceso a 
datos. Es decir, va a estar representada por una Clase que se encargue de crear el Objeto Conecction, establecer la conexión con la 
Base de Datos y realizar la correcta implementación de las Interfaces para realizar acciones en la BBDD . 
Las Clases_Repositories van a ser las encargadas de recibir, enviar y manipular nuestros Objetos Java hacia la Base de Datos.
Es un grupo de Clases que se va a encargar de resolver la persistencia de los Objetos. Van a ser las Claseso JDBC interlocutoras entre 
las 'Entidades' y las 'Tablas'. Todas las acciones/métodos relacionadas a las Persistencia de Datos de 
los Objetos estarán representadas en las Clases Repositories o Clases DAO. 
Se recomienda crear un Interfa de cada Clase_Repository para asegurar la posibilidad de Polimorfismo de técnologías. En el 
caso de que se cambie de tecnologia para guardar los Objetos en la Base de Datos, con que la nueva Clase_Repository 
implemente la misma Interfaz_Repository se asegura el Polimorfismo de una tecnologia a otra, ya que independientemente de
como funcionen internamente sus métodos, todos tendran la misma firma debido a la implementación de la Interfaz. De esta 
forma, solamente se deberan diseñar nuevamente las nuevas Clases_Repository. Brinda mayor desacoplamiento y por lo tanto una mayor 
escalibilidad al proyecto. Utilizando las Interfaces definimos un lenguaje en común, un vocabulario y forma de invocar a los métodos 
con las mismas firmas. 
Básicamente entonces las Clases_Repositories van a ser las encargadas de recibir, enviar y manipular nuestros Objetos Java hacia la 
Base de Datos.

- Transfer Object: 
Representada por una Clase que se encarga de instanciar los objetos para poder interactuar con nuestro origen de datos. Generalemente 
seran nuestra Clase_TestRepositories o el mismo Main.


● Inyección SQL
  ¨¨¨¨¨¨¨¨¨¨¨¨¨
Al generar un sistema de persistencia de la información con una Base de Datos Relacional, se ejecutan sentencias SQL 
concatenando valores, y de esta forma poder enviar la información pertinente al Gestor de Base de Datos. 
Habra muchos casos que se generen sentencias dinámicas donde el usuario completara las sentencias SQL que se terminan enviando a la 
BBDD con el valor ingresado.
El problema es que al ingresar una concatenacion sin validar qué contiene, en la misma se puede introducir un código malicioso 
en las declaraciones SQL que puede perjudicar completamente nuestros datos, técnica conocida como Inyección SQL. Aunque 
existen otros tipos de vulnerabilidades que tienen que ver con la inyección de código nosotros en este modulo aprenderemos a 
evitar las de tipo SQL a través de herramientas que Java nos ofrece. Nos ayudaran a evitar este tipo de vulnerabilidad en el sistema, 
evitando tener que programar una de validación de caracteres cuando se envien comandos SQL ya que el propio Java realizara dicha 
validación. Tambien ayudara a que nuestro código sea mas legible.  


● Prepared Statement (Sentencia Preparada)
  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
Los SGBD Relacionales como MySQL, PostgreSQL, SQL Server, etc, nos proporcionan mecanismos para optimizar el acceso y 
ejecución de sentencias. Uno de estos mecanismos es la 'Declaración Preparada' o 'Prepare Statement'. Dicha sentencia tiene 
una forma en la que indicamos que vamos a utilizar una sentencia SQL para que la guarde y la 'precompile' con las condiciones
necesarias para poder utilizarla. 
Al utilizar una Prepared Statement ademas de poder inyectar los Parámetros y evitar tener que ingresarlos manualmente, Java se
encargara de realizar la validación de Caracteres para evitar inyecciones SQL, evitando tambien tener que programar una 
validación por cada Parámetro que se quiera ingresar. 

El método 'prepareStatement ("sentencia sql")' crea un objeto para enviar sentencias SQL parametrizadas a la Base de Datos, y es
un método contenido dentro de la Interfaz 'Conecction'. Es decir, a partir de un Objeto tipo Conecction, vamos poder crear nuestro
'Prepared Statement'. 
Es importante recordar que dentro de la misma Interfaz tambien vamos a encontrar el método createStatement(), y este tambien
nos va a permitir crear un objeto Statement para enviar sentencias SQL a la Base de Datos, pero la diferencia sera que este
método no solo no inyectará el codigo SQL (se debera ingresar de forma manual) sino que tampoco va a realizar una validación
de Caracteres. Por este motivo es importante diferenciar en que momentos se podra utlizar un Objeto del Tipo Statement y en 
que momentos un Objeto del tipo Prepared Statement. 
PreparedStatement que hereda de Statement, nos provee una serie de métodos que al ser ejecutados nos devuelven los resultados que 
producen dichas sentencias. 

La interfaz nos provee además varios métodos setters para establecer los valores de los parámetro: 

setTipoDato(int indiceParametro, TipoDato valorDato)

Los Parámetros estarán representados por el signo de interrogación “?” en la declaración SQL. Los signos de “?” y la cantidad 
de Parámetros a completar obviamente deben coincidir. Es decir, si se quieren ingresar 5 Parámetros se deben indicar cuales 
seran, y mediante los signo de interrogación “?” vamos a indicar el orden y donde se inyectara posteriormente el valor que 
vamos a ingresar por una serie de Métodos setters. Al usar los métodos setter debemos indicar el índice del signo de 
interrogación “?” que va a tomar su valor comenzando desde el primer signo de interrogación “?” como número 1. 
Java se a encargara de Inyectar los Parámetros, y va a hacer una control de la seguridad sobre esos Parámetros. Va a bloquear 
automáticamente Caracteres considerados raros y que puedan comprometer el sistema de seguridad del Software. Va a permitir solo 
el uso de caracteres seguros. 

String query = "insert into cursos (titulo,profesor,dia,turno) values (?,?,?,?)";
PreparedStatement ps = conn.prepareStatement(query)

    ps.setString(1, curso.getTitulo());
    ps.setString(2, curso.getProfesor());
    ps.setString(3, curso.getDia().toString());
    ps.setString(4, curso.getTurno().toString());
    ps.execute(); //Ejecuto el Codigo

En este caso se indica que el signo de interrogación “?” número 1 sera reemplazo por el valor curso.getTitulo(), y dicho valor
se le asignara al campo 'titulo' de la BBDD.  



(PreparedStatement ps=conn.prepareStatement("update cursos set titulo=?, profesor=?, dia=?, turno=? where id=?") {
            ps.setString(1, curso.getTitulo());
            ps.setString(2, curso.getProfesor());
            ps.setString(3, curso.getDia().toString());
            ps.setString(4, curso.getTurno().toString());
            ps.setInt(5, curso.getId());
            ps.execute();


• BONUS 
Cuando se trabaja con JDBC hay que seleccionar una Base de Datos e inyectar el Driver que corresponda en proyecto. 
Para resolver esta situación se puede optar por varios caminos, a continuacion vamos a específicar solamente dos.
Para descargar o acceder a los diferentes Drives, archivos '.jar' o <dependencies> de los SGBD se recomienda utilizar la 
página de 'Maven Repositories'.

. Java Proyect: 
En el caso de trabajar con un Proyecto Java, se deberá buscar el '.jar' del SGBD y descargar el mismo en el proyecto. 
Generalmente se suele guarar el '.jar' en un carpeta dentro del proyecto llamada 'lib'. Para terminar 
de instalar correctamente las Dependencias del SGBD en nuestro proyecto hay que indicarle al 'build path' que el Driver 
ya esta disponible en el proyecto. Para ello habra que posicionarse sobre el archivo '.jar' y mediante un click derecho seleccionar la 
opcion de 'Add To Build Path'. De esta forma se agregará las 'Refenced Libraries' o 'Dependencies', las depenencias correspondientes
a nuestro proyecto y estará listo para trabajar con el SGBD.   


. Maven Proyect:
Al trabajar con Maven tendremos un archivo de configuración llamado 'pom.xml' en cual se cargan las caracteristicas del proyecto.
La gran ventaja de trabajar con Maven es que mediante este archivo no será necesario instalar los archivos '.jar' en nuestro 
proyecto para que generen las Depencias correspondientes. Maven se encagará de forma automática de gestionar las Dependencias e
instalarlas en el caso de que sea necesario. Solamente en el archivo 'pom.xml' de nuestro proyecto Maven hay que declarar las 
<dependencies><dependency>.....</dependency></dependencies> correctamente y luego Maven se encagará automaticamente de gestionar 
las mismas en nuestro proyecto. 

Ejemplo archivo pom.xml:

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.educacionit</groupId>
  <artifactId>jdbc_parte2</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  
  <dependencies>
   <!-- https://mvnrepository.com/artifact/com.mysql/mysql-connector-j -->
 	<dependency>
	    <groupId>com.mysql</groupId>
	    <artifactId>mysql-connector-j</artifactId>
	    <version>8.0.31</version>
	</dependency>
  </dependencies>
  
</project>

*/

package clase16;

public class JDBC_parte1 {

}
