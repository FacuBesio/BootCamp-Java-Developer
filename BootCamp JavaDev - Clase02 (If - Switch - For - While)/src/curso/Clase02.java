package curso;

public class Clase02 {

	public static void main(String[] args) {
		
		/*El método main es el hace a una Clase ejecutable. */
		
		// • Arrays
		
		int[]array1= {1,2,3,4,5,67,43};
		
		int[]array2= new int[10];
		
		array2[0] = 8;
		array2[1] = 4;
		
		// • Estructuras Iterativas
		
		boolean value=true; 
		
		for(int i=0;i<array2.length;i++) {
			System.out.println("array2["+i+"]="+array2[i]);
		}
		
		System.out.println("");
		/*Se ingresa argumentos a través del Parámetro 'args' del Método main, desde 
		Run (Run configuration).*/
		String[]array3= new String[args.length];
		
		for(int i=0;i<array3.length;i++) {
			array3[i]=args[i];
			System.out.println("array3["+i+"]="+array3[i]);
		}
	}

}
