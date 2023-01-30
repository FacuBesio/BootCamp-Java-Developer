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
Conexión y manipulación de la BBDD. La Clase más utilizada es DiverManager, y las Interfaces Connection, ResulSet, Statement,
DataSource.

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
básicamente la conexión. 
Para ingresar los parámetros en el método '.getConnection (url, user, pass)' y generar la conexión de una forma ordenada  y légible 
se recomienda crear atributos privados y estáticos con la información correspondiente. 
Si bien hay varias formas de establecer la conexión se recomienda crear atributos y métodos estáticos con el constructor de la Clase 
 como sera privado para evitar que se creen objetos de la misma y se pueden generar varias 'Conexiones'. De esta forma sin la 
 necesidad de instanciar un Objeto de la Clase, se puede acceder a el Método que nos va a devolver la Conexión con la BBDD y nos 
 aseguramos de que solamente mediante dicho método controlado se pueda acceder la Conexión.
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
y nos retornara la Conexion a la BBDD. Se recomienda crear un Objeto Connection para contener la el retorno con la Conexión.

• La URL espera el driver, el nombre de la PC o su IP, el Puerto de conexión a la base de datos (por defecto en MariaDB y 
MySQL 3306) y el nombre de la Base de Datos.

• El usuario espera el nombre del usuario que se conecta a la base de datos, por defecto en MariaDB y MySQL es root.

• La Clave espera por defecto la contraseña que posee el usuario, dependiendo del tipo de instalación puede estar vacía o 
una clave colocada al momento de instalar.

 
 * 2. CREAR UN OBJETO STATEMENT * 
El 'Objeto Statement' es un Objeto que contendra los métodos que nos van a permitir ejecutar sentencias SQL y por lo tanto solo lo 
podremos crear a través de una Conexión a una BBDD. Es decir, que a través de la conexión creada vamos a poder invorcar el método 
'createStatement()' y crear un Objeto Statement preparado para interactuar con la Base de Datos especificada en la Conexión. 
La Interfaz 'Statement' nos provee una serie de métodos que nos van a permitir no solo ejecutar sentencias SQL, sino que tambien poder 
acceder a los resultados que producen las sentencias ejecutadas. Con Statement principalmente podremos acceder a los diferentes 
'execute ()', que serán los métodos que van a ejecutar nuestras sentencias SQL en nuestro SGDB y finalmente en la BBDD.  


* 3. EJECUTAR SENTENCIAS SQL: 'execute()' / 'executeQuery()' *
A través del Objeto Statement podremos utlizar los métodos 'execute("sentencia SQL")' y finalmente ejecutar las sentencias SQL en la 
BBDD. Dependiendo de si utilizamos el método '.execute ()' o '.executeQuery()' es que tendremos un valor de retorno o no. Para aquellas
sentencias SQL que no tengan un valor de retorno y se sean simplemente de ejecución (void ) vamos a utlizar el método  'execute()'. Y 
para aquellas sentencias SQL que tengan un valor de retorno vamos a utilizar el método 'executeQuery()'. Este método nos retornara un 
Objeto tipo ResultSet, motivo por cual habra que crear previamente un Objeto del tipo ResultSet para poder contener el resultado. 
Un ResultSet es una especie de Tabla que se almacena en la Memoria con información en su interior. 
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
ResultSet es un conjunto de Registros. Para recuperar la  información de una tabla o un origen de datos Java nos 
proporciona la Interfaz ResultSet. Esta Interfaz nos provee de varios Métodos para obtener los datos de Columna 
correspondientes a un Fila, ya que representa una Tabla. Todos ellos tienen el formato ResultSet.getTipoDato(), siendo () el nombre de 
la Columna. Algunos ejemplos de estos métodos son getInt, getLong, getString, getBoolean y etc. Casi todos estos Métodos toman un solo 
parámetro, que es el índice que la Columna tiene dentro del ResultSet o bien el nombre de la Columna.
El método executeQuery (String sql) de la interfaz Statement nos devuelve dicho objeto. Para poder recuperar cada una de las
Filas del ResulSet si las hubiera utilizaremos por lo común el bucle while colocando como condición el método next() que 
devuelve un boolean indicando si existe una fila que leer, si existe dicha fila mueve el cursor una fila hacia adelante 
desde su posición actual.

rs.getInt("id")

Para poder leer el Objeto ResultSet contamos con diferentes métodos como 'getString()' y 'next()' entre otros. Utilizando estos 
métodos se podra navegar registro a registro utilizando esta 'Tabla' y acceder a la información brindada por la Base de Datos. 

        if(rs.next()) System.out.println("Se conecto a: " + rs.getString(1));  
        else System.out.println("No se pudo conectar!");

Preguntamos si 'rs' tuvo algun tipo de resultado. Si la Conexión se logro relizar satisfactoriamente 'rs' va indicar el valor
de la version a la estemos conectados. 



● DAO - Data Access Object
  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
Para dar una organización entre las Clases, las Conexiónes creadas y la relación que tiene Java con la Base de Datos es que 
se crea un esquema, un patron llamado DAO (Data Access Object). Su función principal sera mediante un esquema poder reflejar 
nuestros Objetos Java en la BBDD. Es decir, la posibilidad de crear Objetos en Java y que estos sean alamacenado de forma 
permanente en una Base de Datos. 
Muchas veces se nos presentaran mommentos en los que debemos acceder a los datos desde diferentes fuentes y esto representa la 
implementación de una lógica. Este patrón de diseño viene acompañado de otro patrón el DTO Objeto de Transferencia de Datos (Data 
Transfer Object) es un patrón simple que propone la creación de un objeto que se encargue de la transferencia de datos entre el 
servidor y el cliente.

Todo patrón de diseño tiene una estructura, el DAO esta representado de la siguiente manera:

- ENTIDADES (Business Object):
Representa un objeto con la lógica de negocio. 'Entidades de negocio' (Persona, Documento, Alumno, etc).
Por un lado se debe crear una Entidad (Clase) que refleje exactamente todo el contenido de nuestra Tabla en la BBDD. Es 
decir, se debera crear una Entidad por cada Tabla en nuestra BBDD. La idea es que nuestros Objetos (Java) los podamos 
registrar en nuestra BBDD (SQL), por este motivo es importante que las Clases creadas en Java tengan la misma cantidad y tipo 
de Atributos que los Campos de las Tablas creadas en SQL, una debe ser el reflejo de la otra. 
Básicamente las Entidades son la representación de en Java de las BBDD SQL. 
Una CLASE en JAVA comienza con MAYUSCULA y va en SINGULAR, por el contrario las TABLAS en SQL comienzan en MINUSCULAS y van 
en PLURAL. Los Objetos en memoria se crean y se destruyen, en la Base de Datos persiste de forma permanente. 

- INTERFAZ DAO o JDBC (Data Access Object):  
Representa una capa de acceso a datos que oculta la fuente y los detalles técnicos para recuperar los datos. Contiene la abstracción 
de los métodos necesarios para acceder, modificar, eliminar e insertar nuestros Objetos en la BBDD.
Podemos sin ningún problema crear una interfaz por cada entidad de negocio pero para simplificar nuestro código nos apoyamos 
en los genéricos. 

- REPOSITORIOS - CLASES DAO (Data Source): 
Representan la implementación de la Interfaz. Representada por un Objeto que implementa los algoritmos necesarios y el acceso a 
datos. Es decir, va a estar representada por una Clase que se encargue de crear el Objeto Conecction, establecer la conexión con la 
Base de Datos y realizar la correcta implementación de las Interfaces para realizar acciones en la BBDD . 
Las Clases_Repositories van a ser las encargadas de recibir, enviar y manipular nuestros Objetos Java hacia la Base de Datos.
Es un grupo de Clases que se va a encargar de resolver la persistencia de los Objetos en la BBDD. Van a ser las Clases 
interlocutoras entre las 'Entidades' y las 'Tablas'. Todas las acciones/métodos relacionadas a las Persistencia de Datos de 
los Objetos estaran representadas en las Clases Repositories o Clases DAO. 
Se recomienda crear un Interfaz_Repository de cada Clase_Repository para asegurar la posibilidad de Polimorfismo. En el 
caso de que se cambie de tecnologia para guardar los Objetos en la Base de Datos, con que la nueva Clase_Repository 
implemente la misma Interfaz_Repository se asegura el Polimorfismo de una tecnologia a otra, ya que independientemente de
como funcionen internamente sus métodos, todos tendran la misma firma debido a la implementación de la Interfaz. De esta 
forma, solamente se deberan diseñar nuevamente las nuevas Clases_Repository. Le brinda mayor desacoplamiento y por lo tanto una mayor 
escalibilidad al proyecto. Utilizando las Interfaces definimos un lenguaje en común, un vocabulario y forma de invocar a los métodos 
con las mismas firmas. 
Básicamente entonces las Clases_Repositories van a ser las encargadas de recibir, enviar y manipular nuestros Objetos Java hacia la 
Base de Datos.

- Transfer Object: 
Representada por una Clase que se encarga de instanciar los objetos para poder interactuar con nuestro origen de datos. Generalemente 
seran nuestra Clase_TestRepositories o el mismo Main.

*/

package clase16;

public class JDBC_parte1 {

}
