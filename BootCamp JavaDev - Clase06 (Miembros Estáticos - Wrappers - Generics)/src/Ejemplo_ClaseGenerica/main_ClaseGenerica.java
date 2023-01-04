package Ejemplo_ClaseGenerica;

public class main_ClaseGenerica {

	public static void main(String[] args) {
		
		//CLASE GENERICA 
		System.out.println("******** CLASE GENERICA ********");
		System.out.println("------- obj_genString1  -------");
		ClaseGenerica<String> obj_genString1 = new ClaseGenerica<String>();
		obj_genString1.setAtributo("Hola Mundo");
		System.out.println(obj_genString1.getAtributo());
		System.out.println(obj_genString1.toString());
		obj_genString1.mostrarTipo();
		
		System.out.println("");
		System.out.println("------- obj_genString2  -------");
		ClaseGenerica<String> obj_genString2 = new ClaseGenerica<String>("Hola Universo");
		System.out.println(obj_genString2.getAtributo());
		System.out.println(obj_genString2.toString());
		obj_genString2.mostrarTipo();
		
		System.out.println("");
		System.out.println("------- obj_genString3  -------");
		ClaseGenerica obj_genString3= new ClaseGenerica("Hola Galaxia");
		System.out.println(obj_genString3.getAtributo());
		System.out.println(obj_genString3.toString());
		obj_genString3.mostrarTipo();
		
		System.out.println("");
		System.out.println("------- obj_genInteger1  -------");
		ClaseGenerica<Integer> obj_genInteger1 = new ClaseGenerica<Integer>(8);
		System.out.println(obj_genInteger1.getAtributo());
		System.out.println(obj_genInteger1.toString());
		obj_genInteger1.mostrarTipo();
		
		
		//CLASE GENERICA02 
		System.out.println("");
		System.out.println("******** CLASE GENERICA02 ********");
        System.out.println("------- telefono_generic -------");
		ClaseGenerica02 <Integer, Integer> telefono_generic = new ClaseGenerica02<>(11, 1136452514 );
		System.out.println( telefono_generic.getCodigo());
		System.out.println(telefono_generic.getNumero());
        
        System.out.println("");
		System.out.println("------- documento -------");
        ClaseGenerica02 <String, String> documento = new ClaseGenerica02<>("DNI" , "32852456");
        System.out.println(documento.getCodigo());
        System.out.println(documento.getNumero());
        
        
        System.out.println("");
		System.out.println("------- dirreccion -------");
        ClaseGenerica02 <String, Integer> dirreccion = new ClaseGenerica02<>( "España", 248);
        System.out.println(dirreccion.getCodigo());
        System.out.println(dirreccion.getNumero());
        
        
        //CLASE GENERICA03
        System.out.println("");
		System.out.println("******** CLASE GENERICA03 ********");
		System.out.println("------ Clase Generica 2 ------");
		ClaseGenerica03 objeto_gen = new ClaseGenerica03();
        System.out.println(objeto_gen);
        
        System.out.println("");
        ClaseGenerica03 <String, Integer, String, Double> objeto_gen2 = new ClaseGenerica03("Mito",8,"Code",32.0);
        System.out.println(objeto_gen2);
        objeto_gen2.mostrarTipo();
        
        
   }

}
