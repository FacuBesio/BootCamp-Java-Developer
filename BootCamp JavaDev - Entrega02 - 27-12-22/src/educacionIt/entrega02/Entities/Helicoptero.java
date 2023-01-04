package educacionIt.entrega02.Entities;

import educacionIt.entrega02.Interfaces.Aterrizable;

public class Helicoptero extends Volador implements Aterrizable{
	
	private String color;
	private String marca;
	private String modelo;
	private String tipo;
	
	
	public Helicoptero(String nombre, int velocidad_max, String color, String marca, String modelo, String tipo) {
		super(nombre, velocidad_max);
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
	}

		
	@Override
	public void aterrizar() {
		System.out.println(getMarca() + " " + getModelo()
							+"(" + getTipo()+"), "+ getColor());
	}
	
	@Override
	public String toString() {
		return "Helicoptero [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo
				+ ", getNombre()=" + getNombre() + ", getVelocidad_max()=" + getVelocidad_max() + "]";
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	

	
}
