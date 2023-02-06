package Calculadora_Ejemplos;

public class Calculadora2Excepcion extends Exception{
	
	private String descripcion; 
    
    
    public Calculadora2Excepcion(String descripcion) {
        this.descripcion = descripcion;
      
    }

    @Override
    public String toString() {
        return "toString() : Calculadora2Excepcion{" + "descripcion=" + descripcion + '}';
    }

    @Override
    public String getMessage(){
    return "getMessage(): " + getDescripcion();
    }  
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

}
