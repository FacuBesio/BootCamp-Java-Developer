package Ejercicio01;

public class Persona {
	
	//Atributos
	private String nombre;
	private String apellido;
	private String sexo;
	private int edad; 
	private Documento documento; 
	private Domicilio domicilio; 
	private String nacionalidad; 
	
	
	//Constructores
	public Persona() {
		
	}

	public Persona(String nombre, String apellido, String sexo, int edad, Documento documento, Domicilio domicilio, String nacionalidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
		this.documento = documento;
		this.domicilio = domicilio;
		this.nacionalidad = nacionalidad;
	}
	
	public Persona(String nombre, String apellido, String sexo, int edad, String tipoDocumento, int nroDocumento, 
			int nroTramite, Domicilio domicilio, String nacionalidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
		documento =  new Documento(tipoDocumento, nroDocumento, nroTramite);
		this.domicilio = domicilio;
		this.nacionalidad = nacionalidad;
		
	}

	
	
	//Métodos
	
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad=" + edad
				+ ", " + documento + ", " + domicilio + ", nacionalidad=" + nacionalidad + "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
	

	
}
