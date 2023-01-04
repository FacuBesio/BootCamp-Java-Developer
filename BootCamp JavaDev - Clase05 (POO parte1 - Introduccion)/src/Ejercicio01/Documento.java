package Ejercicio01;

public class Documento {

	//Atributos
	private String tipoDocumento;
	private int nroDocumento;
	private int nroTramite;
	
	
	//Constructores
	public Documento() {
		
	}
	
	public Documento(String tipoDocumento, int nroDocumento, int nroTramite) {
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.nroTramite = nroTramite;
	}

	
	//Métodos
	
	
	
	public String getTipoDocumento() {
		return tipoDocumento;
	}

	@Override
	public String toString() {
		return "Documento [tipoDocumento=" + tipoDocumento + ", nroDocumento=" + nroDocumento + ", nroTramite="
				+ nroTramite + "]";
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public int getNroTramite() {
		return nroTramite;
	}

	public void setNroTramite(int nroTramite) {
		this.nroTramite = nroTramite;
	}
	
	
	
	
	
}
