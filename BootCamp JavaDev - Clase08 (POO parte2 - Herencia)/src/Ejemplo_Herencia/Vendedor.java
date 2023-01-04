package Ejemplo_Herencia;

public class Vendedor extends Persona{ // Relacion de Herencia
   
	private int nroLegajo;
	private double sueldoBasico;
	
	
	public Vendedor() {
	}
	
	public Vendedor(int nroLegajo, double sueldoBasico, String nombre, int edad, Direccion direccion) {
	    super(nombre, edad, direccion); 
    /* Llama al 'Construcctor' de la 'Clase Padre' y le envia los Parametros. El llamado debe estar si o si en la primer Linea*/
	    this.nroLegajo = nroLegajo;
	    this.sueldoBasico = sueldoBasico;
	}
	
	
	@Override
	public String toString() {
	    return super.toString()+ "Vendedor{" + "nroLegajo=" + nroLegajo + ", sueldoBasico=" + sueldoBasico + '}';
	    //super.toString() => agraga los 'Atributos' de la 'Clase Padre'
	}
	        
	@Override
	public void Saludar(){
	    System.out.println("Hola mundo desde Class Vendedor");
    }
	
	public int getNroLegajo() {
	    return nroLegajo;
	}
	
	public double getSueldoBasico() {
	    return sueldoBasico;
	}


	}
