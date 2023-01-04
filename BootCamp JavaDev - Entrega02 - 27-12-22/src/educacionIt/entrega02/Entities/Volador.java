package educacionIt.entrega02.Entities;

public class Volador {
	
	private String nombre;
	private int velocidad_max;
	
	
	public Volador() {
		
	}
	
	public Volador(String nombre, int velocidad_max) {
		this.nombre = nombre;
		this.velocidad_max = velocidad_max;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVelocidad_max() {
		return velocidad_max;
	}

	public void setVelocidad_max(int velocidad_max) {
		this.velocidad_max = velocidad_max;
	}
	
}
