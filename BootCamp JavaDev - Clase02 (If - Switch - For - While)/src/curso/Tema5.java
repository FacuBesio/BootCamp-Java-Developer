package curso;

/**
 * 
 * Clasificar valores entre pares e impares. 
 *
 */

public class Tema5 {
	public static void main(String[] args) {
		
		boolean v = true;
		boolean f = false;
		
		//==
		//<
		//>
		//<=
		//>=
		
		/* Se ingresa datos desde Run, Run Configuration*/
		
		int[] mult= new int[args.length];
		int[] noMult= new int[args.length];
		
		for(int i=0;i<args.length;i++) {
			
			int num = Integer.parseInt(args[i]); 
			
			boolean value= (num%2)>0;
			
			if(value) {
				noMult[i]=num;
			}else{
				mult[i]=num;
			}
		
		}
		
		System.out.println(".Números Pares");
		for(int i=0;i<args.length;i++) {
			if(mult[i]!=0) {
			System.out.println(mult[i]);
			}
		}
		
		System.out.println("");
		System.out.println(".Números Impares");
		for(int i=0;i<args.length;i++) {
			if(noMult[i]!=0) {
			System.out.println(noMult[i]);
			}
		}
		
		}
		
	}

