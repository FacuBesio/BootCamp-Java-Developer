package Ejemplo1_Interfaz;

public class FileCloud implements I_File {

	@Override
	public void setArchivos(Archivo archivo) {
		
		System.out.println("Archivo enviado a NUBE");
		
	}

	@Override
	public String getArchivos(Archivo archivo) {
		
		return "Recuperado desde NUBE: " + archivo.getDatos();
	}


}
