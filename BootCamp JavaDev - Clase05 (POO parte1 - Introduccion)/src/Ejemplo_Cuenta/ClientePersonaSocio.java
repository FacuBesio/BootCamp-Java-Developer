package Ejemplo_Cuenta;

public class ClientePersonaSocio {  
    private int nro; 
    private String nombre; 
    private int edad; 
    //private Cuenta cuenta;
    
    public ClientePersonaSocio(int nro, String nombre, int edad) {
        this.nro = nro;
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public void UsarCuenta(Cuenta cuenta){
        System.out.println("Usa cuenta "+ cuenta);
    }
    
    public void DepostiarCuenta(Cuenta cuenta, int monto){
        cuenta.depositar(monto);
    }
    
    
    
    @Override
    public String toString() {
        return "ClientePersonaSocio{" + "nro=" + nro + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}

