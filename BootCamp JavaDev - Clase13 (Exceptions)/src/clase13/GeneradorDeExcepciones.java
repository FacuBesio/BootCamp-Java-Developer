package clase13;

public class GeneradorDeExcepciones {
	
	//Index Out of Bounds Exception (Excepcion de Indice fuera de Limites)
    public static void generarIndex_Out_of_Bounds_Exception(){
        int[] vector = new int[10];
        vector[20]=5;
    }
    
    //Arithmetic Exception
       public static void generarArithmetic_Exception(){   
    	   System.out.println(10/0);
    }
    
    public static void generarNumber_Format_Exception(String nro){         // Ejemplo: "26x"
        int n=Integer.parseInt(nro);
    }
    
    public static void generarNull_Pointer_Exception(String texto, int index){   // Excepción de puntero nulo 
        System.out.println(texto.charAt(index));// (index)=("hola", 2) => va a tomar el 'Char' indice 2 de "hola". 
    }
    
    
}