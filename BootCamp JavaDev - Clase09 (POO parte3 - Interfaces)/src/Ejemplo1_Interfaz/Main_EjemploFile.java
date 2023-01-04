package Ejemplo1_Interfaz;

import java.util.Scanner;

public class Main_EjemploFile {

	public static void main(String[] args) {
		
		Archivo archivo1 = new Archivo("Hola desde archivo1");
		
		
		I_File file=null; // Un Contenedor 'Interfaz' se puede  incializar con cualquier Clase que la Implemente.   
	    
	    System.out.println("-------- FileDiscoDuro --------");    
		file=new FileDiscoDuro(); // --> Inicializacion
		
		file.setArchivos(archivo1);
		System.out.println(file.getArchivos(archivo1)); 
		file.info();
		
		System.out.println("");
		System.out.println("-------- FileCloud --------");
		file=new FileCloud(); // --> Inicializacion
		
		file.setArchivos(archivo1);
		System.out.println(file.getArchivos(archivo1));
		file.info();
		
		/*
		En este caso 'file' sera compatible para ser incializada tanto desde de 'FileDiscoDuro' como 'FileCloud' porque ambas Clases
		implementan I_File.
        De esta forma se puede hacer facilmente Polimorfismo cambiando solamente la Inicialización de 'file'.
        Si se incializa desde  'FileDiscoDuro()' los métodos 'setArchivos()' y 'getArchivos()' tendran un determinado comportamiento, 
        y si se incializa desde 'FileCloud' estos mismo métodos tendran otro comportamiento. Es decir, sera posible hacer Polimorfismo
        con cada Clase que implemente la Interdaz 'I_File' ya que se asegura que cada Clase tenga sobreescrito sus Métodos de forma 
        obligatoria.
		 */
		
		System.out.println("Ingrese el texto a registrar y presione 'Enter':");
		
		String input=new Scanner(System.in).nextLine();
		
		Archivo archivo2 = new Archivo(input);
		//System.out.println(input);
		
		
		System.out.println("Ingrese en donde desea guardar el Archivo: 'disco' o 'nube'");
		input=new Scanner(System.in).next();
		
		if(input.equalsIgnoreCase("disco")) { 
			file=new FileDiscoDuro();
		}
        else if(input.equalsIgnoreCase("nube")) {
        	file=new FileCloud(); 
        }
        else System.out.println("Vuelva a inciar el Programa e ingrese solamente 'texto' o 'nube' para guardar el Archivo");
		
		file.setArchivos(archivo2);
		System.out.println(file.getArchivos(archivo2));
		
        
	}
}
