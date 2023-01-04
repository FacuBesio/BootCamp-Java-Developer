package Ejemplo_Auto;

public class Auto {
	
	// ATRIBUTOS
    String marca;
    String modelo;
    String color;
    int velocidad;
	
    
    // CONSTRUCTORES
    public Auto() {
		
	}
    
    public Auto(String marca, String modelo, String color, int velocidad) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidad = velocidad;
	}
    
    
    // MÉTODOS
    void acelerar(){                                       
        velocidad+=10;      
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

	
    
    

}
