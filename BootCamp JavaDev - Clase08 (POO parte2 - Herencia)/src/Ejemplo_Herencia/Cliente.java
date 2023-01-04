package Ejemplo_Herencia;

public class Cliente extends Persona { // Relacion de Herencia

	private int nroCliente; 
    private Cuenta cuenta; // ' Cuenta cuenta ' => Relacion 1 a 1. 

    
    
	public Cliente(int nroCliente, Cuenta cuenta, String nombre, int edad, Direccion direccion) {
        super(nombre, edad, direccion);
        this.nroCliente = nroCliente;
        this.cuenta = cuenta;
    }


	
    @Override
    public void Saludar(){
        System.out.println("Hola Mundo desde Clase Cliente");
    };
    
    @Override
    public String toString() {
        return super.toString() + "Cliente{" + "nroCliente=" + nroCliente + ", cuenta=" + cuenta + '}';
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

}
