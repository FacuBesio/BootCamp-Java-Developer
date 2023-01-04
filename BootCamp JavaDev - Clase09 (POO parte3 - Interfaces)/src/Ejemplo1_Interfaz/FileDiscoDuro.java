package Ejemplo1_Interfaz;

public class FileDiscoDuro implements I_File {

	@Override
	public void setArchivos(Archivo archivo) {
		
		System.out.println("Archivo enviado a DISCO DURO");
	}

	@Override
	public String getArchivos(Archivo archivo) {
		
		return "Recuperado desde DISCO DURO: " + archivo.getDatos();
		
	}

}
