package curso;

public class Problema1 {

	public static void main(String[] args) {
		// Realizar un Cotizador de Pesos a Dolares (Dolar a $280)
		
		//Entrada de Datos 
				float in_pesos= 1; 
				
				//Proceso de transformación del Dato
				
				float out_Dolares = in_pesos/280;
				
				//Salida de Datos
				System.out.println("El valor de  $"+ in_pesos + " es equivalente a: "+out_Dolares+ " USD");
				
				
				//Proceso inverso
				out_Dolares= 1; 
				
				float out_Pesos= out_Dolares*280;
				
				System.out.println("El valor de "+ out_Dolares + " USD en Pesos es: $"+ out_Pesos);

	}

}
