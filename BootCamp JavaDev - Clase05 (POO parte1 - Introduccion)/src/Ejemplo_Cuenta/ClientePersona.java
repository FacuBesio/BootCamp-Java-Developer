package Ejemplo_Cuenta;

public class ClientePersona {

	//Atributos
    private int nro;
    private String nombre;
    private int edad;
    private Cuenta cuenta;
    
    
    //Constructores
    public ClientePersona(int nro, String nombre, int edad, Cuenta cuenta) {
        this.nro = nro;
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = cuenta;
    }
    
    
    public ClientePersona(int nro, String nombre, int edad,int nroCuenta){
        this.nro = nro;
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = new Cuenta(nroCuenta,"arg$");
    }


    //Métodos
    public void comprar(){
        System.out.println("Cliente Persona realiza una compra");
    }

    @Override
    public String toString() {
        return "ClientePersona{" + "nro=" + nro + ", nombre=" + nombre + ", edad=" + edad + ", cuenta=" + cuenta + '}';
    }

    public int getNro() {
        return nro;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

}
