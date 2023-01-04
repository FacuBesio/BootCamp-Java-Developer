package Ejemplo_Herencia;

public abstract class Persona {

	private String nombre;
    private int edad;
    private Direccion direccion;

    
    public Persona() {
    }

    public Persona(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    
    //public void Saludar(){
    //	System.out.println("Hola Mundo desde Persona");
    //}
    
    public abstract void Saludar();
/*  Un 'Método Abstracto' solo puede existir en una Clase abstracta. Obliga a las Clases Hijas a sobreescribir el Método 
    abstracto declarado en la Clase Padre. Por este motivo no tiene cuerpo {}. Su función es indicar a las 'Clases Hijas' que deben 
    implementar y sobreescribir el Método de forma obligatoria . 
*/
   
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
}