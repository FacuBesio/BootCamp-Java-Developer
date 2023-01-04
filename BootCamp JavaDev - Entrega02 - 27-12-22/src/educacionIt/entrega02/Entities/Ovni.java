package educacionIt.entrega02.Entities;


public class Ovni extends Volador{
	
	private String nave_espacial;
	private String color;
	
	
	public Ovni(String nombre, int velocidad_max, String nave_espacial, String color) {
		super(nombre, velocidad_max);
		this.nave_espacial = nave_espacial;
		this.color = color;
	}

	
	public void aterrizar_ovni() {
		System.out.println("Aterriza OVNI - " + getNombre() + " | " + getNave_espacial() + ", " +getColor());
	}
	
	@Override
	public String toString() {
		return "Ovni [nave_espacial=" + nave_espacial + ", color=" + color + ", getNombre()=" + getNombre()
				+ ", getVelocidad_max()=" + getVelocidad_max() + "]";
	}


	public String getNave_espacial() {
		return nave_espacial;
	}


	public void setNave_espacial(String nave_espacial) {
		this.nave_espacial = nave_espacial;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
}
