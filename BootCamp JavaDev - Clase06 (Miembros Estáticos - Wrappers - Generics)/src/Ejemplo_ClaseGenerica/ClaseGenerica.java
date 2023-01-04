package Ejemplo_ClaseGenerica;

public class ClaseGenerica <T>{
	
	private T atributo;
	
	
	public ClaseGenerica() {
	}

	public ClaseGenerica(T atributo) {
		this.atributo = atributo;
	}

		
	@Override
	public String toString() {
		return "ClaseGenerica [atributo=" + atributo + "]";
	}

	public void mostrarTipo (){
        System.out.println("El Objeto T es un: " + atributo.getClass().getName());
        
    }

	public T getAtributo() {
		return atributo;
	}

	public void setAtributo(T atributo) {
		this.atributo = atributo;
	}
	
}
