package Ejemplo_ClaseGenerica;

public class ClaseGenerica03 <K,T,V,E> {
    
    private K atributoK;
    private T atributoT;
    private V atributoV;
    private E atributoE;
	
    
    
    public ClaseGenerica03() {
	}

    public ClaseGenerica03(K atributoK, T atributoT, V atributoV, E atributoE) {
		this.atributoK = atributoK;
		this.atributoT = atributoT;
		this.atributoV = atributoV;
		this.atributoE = atributoE;
	}

	@Override
	public String toString() {
		return "ClaseGenerica03 [atributoK=" + atributoK + ", atributoT=" + atributoT + ", atributoV=" + atributoV
				+ ", atributoE=" + atributoE + "]";
	}
	
	public void mostrarTipo (){
        System.out.println("El Objeto K es un: " + atributoK.getClass().getName());
        System.out.println("El Objeto T es un: " + atributoT.getClass().getName());
        System.out.println("El Objeto V es un: " + atributoV.getClass().getName());
        System.out.println("El Objeto E es un: " + atributoE.getClass().getName());
    }

	public K getAtributoK() {
		return atributoK;
	}

	public void setAtributoK(K atributoK) {
		this.atributoK = atributoK;
	}

	public T getAtributoT() {
		return atributoT;
	}

	public void setAtributoT(T atributoT) {
		this.atributoT = atributoT;
	}

	public V getAtributoV() {
		return atributoV;
	}

	public void setAtributoV(V atributoV) {
		this.atributoV = atributoV;
	}

	public E getAtributoE() {
		return atributoE;
	}

	public void setAtributoE(E atributoE) {
		this.atributoE = atributoE;
	}
    
}
