package curso;

public class Problema2 {

	// Calcular de Grados a Radianes a través del uso de la Clase Math y realizar el proceso inverso tambien.
	
	public static void main(String[] args) {
		
		double grados = 1;
		
		double radianes = Math.toRadians(grados);
		
		System.out.println("El equivalente a "+ grados +"° son "+ radianes +" radianes");
		
		radianes = 1;
		
		grados = Math.toDegrees(radianes);
		
		System.out.println("El equivalente a "+ radianes +" radian son "+ grados +"°");
	}

}
