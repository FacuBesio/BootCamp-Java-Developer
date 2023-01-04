package Ejemplo_ClaseGenerica;

public class ClaseGenerica02 <K,V>{
	
	private K codigo;
	private V numero;
	
	
	public ClaseGenerica02() {
		
	}
	
	public ClaseGenerica02(K codigo, V numero) {
		this.codigo = codigo;
		this.numero = numero;
	}
	
	
	public K getCodigo() {
		return codigo;
	}

	public void setCodigo(K codigo) {
		this.codigo = codigo;
	}

	public V getNumero() {
		return numero;
	}

	public void setNumero(V numero) {
		this.numero = numero;
	}
	
}
