/*                                     	 ● BOOTCAMP JAVA DEVELOPER - CLASE 1 ●

          											♦ JAVA ♦

JAVA es un lenguaje de programación desarrollado en la decada del 90' por un equipo liderado por JAMES GOSLING dentro de la 
Compañia 'Sun Microsystems'. Posteriormente dicha Compañia fue adquirida por Oracle en 2010.
La primera versión de JAVA fue públicada entre 1995 y 1996. A lo largo de los años se han ido desarrollado muchas herramientas 
dentro del lenguaje para cumplir con un determinado objetivo en particular. Es decir, que seguramente para cada ambiente que 
nos encontremos en un Proyecto, JAVA tendra una serie de Clases y Líbrerias específicas para cumplir dicha funcíón. 

• JRE & JVM: Java Runtime Enviroinment & Java Virtual Machine:
  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
Lo que hizo popular al lenguaje fue la posibilidad de trabajar bajo la premisa de WORA 'write once, run everywhere', es decir, 
compilar una vez y ejecutar el programa donde sea. En ese entonces fue un concepto inovador, ya que anteriomente cuando se 
queria tener un ejecutable en diferentes Sistemas Operativos, el proceso era distinto. Se creaba el archivo en el 
lenguje deseado y cada Sistema Operativo tenia su priopio Compilador de Codigo Fuente a Codigo Binario. Es decir, cada Sistema 
Operativo tenia su propio Compilador y por la tanto tenia su propio ejecutable. Por ejemplo, Windows tendria su propia versión 
del ejecutable, Mac la suya, Linux, etc. Mediante la premisa de WORA, se debía hacer un único Codigo Fuente (escribir una vez) y
esté serviria para todos los Sistemas Operativos sin importar cúal (ejcutar donde sea). El Codigo Fuente seria interpretado en 
primera instancia por una Java Virtual Machine (JVM) y despues ejecutado en el Sistema Operativo. Es decir, a partir de la 
instalacion de la JVM se puede ejecutar el Codigo Fuente en cualquier Sistema Operativo en el que nos encontremos, ya que 
esta misma sera la encargada de interpretar en primera instacia el Codigo y ejecutarlo posteriormente segun corresponda en el 
Sistema. Para poder ejecutar la JVM en cualquier Sistema Operativo se necesitara tener instalado el 'Java Runtime Enviroinment 
(JRE)'. Como su nombre lo dice es el paquete que habra que instalar para crear el ambiente necesario para poder ejecutar 
archivos compilados en Java. Dentro del JRE tendremos incluidos la JVM y otra Librerias (APIs de JAVA). 

• JDK: Java Development Kit (Kit de desarrollo Java):
  ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
Es un conjunto de herramientas para desarrollar y compilar en Java. 
Con el JRE podremos ejecutar cualquier archivo compilado en Java, pero en el caso de querer crear archivos Java vamos a 
necesitar tener el JDK instalado. Al instalar JDK en el sistema vamos a encontrarnos dentro del mismo a: 
. JRE (Java Runtime Enviroinment) [JVM (Java Virtual Machine)y API de Java (Clases y Librerias de Java)]
. javac (Java Compiler - Compilador Java)
. Debugger

- Entonces el proceso completo desde que creamos nuestro proyecto Java hasta el momento en el que lo ejecutamos es el 
siguiente:
Nuestro proyecto y lógica del programa seran todos nuestros archivos con la extension '.java' y a dichos archivos los 
llamaremos CÓDIGO FUENTE.
Como mencionamos dentro del JDK vamos a encontrar el 'javac' (java compiler). Este sera el encargado de convertir nuestro 
Código Fuente (archivos.java) en BYTECODE (archivos.class). Es decir, el 'javac' sera encargado de COMPILAR nuestro CODIGO 
FUENTE (.java) en BYTECODES (.class).
Estos 'archivos.class' son los archivos que posteriormente va a recibir e interpretar la JVM. Posteriormente, sin importar cual 
se el Sistema Operativo que estemos utlizando, a través de la JVM se ejecuta nuetro programa en el Sistema. Es decir, la JVM va 
a interpretar los ByteCodes y a través de esta se ejecutará el Programa según corresponda corresponda.

     _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ 
    |                                                                                                       |
    |                           JDK  (java, javac, jdb, appletviewer, javah, javaw, jar...)                 |
    |    _ _ _ _ _ _ _ _            _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _         |
    |   |                |         |     _ _ _ _ _ _ _ _ _ _ _ _         _ _ _ _ _ _ _ _            |       |
    |   |    'javac'     |         |    |                       |       |                |          |       |
    |   |(Java Compiler) |         |    |         JVM           |       |   Class Loader |          |       |
    |   |_ _ _ _ _ _ _ _ |         |    |  Java Interpreter     |       |   Librerias    |          |       |
    |                              |    |  JIT                  |       |   API Java     |          |       |
    |                              |    |  Garbage Collector    |       |_ _ _ _ _ _ _ _ |          |       |    
    |                              |    |     ...               |                                   |       |
    |                              |    |_ _ _ _ _ _ _ _ _ _ _ _|                                   |       |
    |    _ _ _ _ _ _ _ _           |                                                                |       |
    |   |               |          |    JRE                                                         |       |
    |   |   DEBUGGER    |          | (Class Loader, Byte Code Verifier, Java API, RuntimeLibraries) |       |
    |   |_ _ _ _ _ _ _ _|          |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |       |
    |                                                                                                       |   
    |                                                                                                       |
    |                                                                                                       |
    |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| 


• JAVA SE: Java Standar Edition. Es una plataforma base Java que incluye el JDK y JRE. Es decir, es la plataforma básica 
para poder ejecutar y derrollar Java. 
La version Java SE tiene por default utilidades para desarrollar la interfaz grafica basada en proyectos 'desktop', una 
interfaz grafica que hoy en dia esta en desuso y por este motivo se explica generealmente Java SE utilizando como referencia 
de interfaz grafica una pagina Web (Java SE Web Programming)

• IDE: Integrated Development Enviroment (Eclipse - IntelliJ - Netbeans - JDeveloper). El IDE compila con el JDK y pasa el 
archivo.java a codigo Byte Code en el archivo.class para que finalmente pueda ser ejecutado. 


Los Obejtos en Java tienen Datos y Comportamientos

*/

package Clase01;

public class JDK_JRE {
	
}
