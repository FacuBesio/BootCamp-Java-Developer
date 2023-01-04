package Ejemplo_Herencia;

public class Direccion {

	private String calle;
    private int numero; 
    private String piso;
    private String departamento; 
    private String ciudad;


	    
    public Direccion(String calle, int numero, String ciudad) {
	    this.calle = calle;
	    this.numero = numero;
	    piso = null;
	    departamento = null;
	    this.ciudad = ciudad;
    }
    
    /**
     * Constructor para direcciones de "Ciudad Autonoma de Buenos Aires".
     */
    public Direccion(String calle, int numero, String piso, String departamento) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.ciudad = "CABA";
    }

	    
    public Direccion(String calle, int numero, String piso, String departamento, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.ciudad = ciudad;
    }

	    
    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", departamento=" + departamento + ", ciudad=" + ciudad + '}';
    }
    
    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String getPiso() {
        return piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

}
