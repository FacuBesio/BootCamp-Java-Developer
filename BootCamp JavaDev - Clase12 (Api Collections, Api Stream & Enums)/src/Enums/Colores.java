package Enums;

public enum Colores {
	
	NEGRO, ROJO ("FF0000", "250,0,0"), VERDE ("008000", "0,128,0"), AZUL ("0000FF", "0,0,250");

	private String HEX_COD;
	private String RGB_COD;
	
	
	private Colores() {
		
	}
	
	private Colores(String a, String b) {
		this.HEX_COD = a;
		this.RGB_COD = b;
	}

	
	public String getHEX_COD() {
		return HEX_COD;
	}

	public void setHEX_COD(String hEX_COD) {
		HEX_COD = hEX_COD;
	}

	public String getRGB_COD() {
		return RGB_COD;
	}

	public void setRGB_COD(String rGB_COD) {
		RGB_COD = rGB_COD;
	}
	
}
