package Ejemplo_Auto;

public class Auto_Encapsulado {
	
	// ATRIBUTOS
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
	
    
    // CONSTRUCTORES
    public Auto_Encapsulado() {
		
	}
    
    public Auto_Encapsulado(String marca, String modelo, String color, int velocidad) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidad = velocidad;
	}
    
    
    // MÉTODOS
    void acelerar(int kilometros){                         
        velocidad+=kilometros;
        if(velocidad>100) velocidad=100;
    }
    
            
    void frenar(){                                         
        velocidad-=10;      
        if(velocidad<0) velocidad=0;
    }
    
    int obtenerVelocidad(){        
        return velocidad;           
    }

   
    String getEstado(){
        return marca+" "+modelo+" "+color+", "+velocidad;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	
    
    

}


