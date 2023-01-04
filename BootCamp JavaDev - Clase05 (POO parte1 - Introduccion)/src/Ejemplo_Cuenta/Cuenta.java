package Ejemplo_Cuenta;

public class Cuenta {
	
	// Atributos
    private int nro;
    private String moneda;
    private double saldo;

    
    // Constructores
    public Cuenta(int nro, String moneda) {
        this.nro = nro;
        this.moneda = moneda;
        saldo=0; 
    }
    
    
    // Métodos
    public void depositar(double monto){
        saldo+=monto;
    }
    
    public void debitar(double monto){
        if(saldo>=monto)
            saldo-=monto;
        else
            System.out.println("Saldo Insuficiente!");
    }

    
    @Override
    public String toString() {
        return "Cuenta{" + "nro=" + nro + ", moneda=" + moneda + ", saldo=" + saldo + '}';
    }

    public int getNro() {
        return nro;
    }

    public String getMoneda() {
        return moneda;
    }

    public double getSaldo() {
        return saldo;
    }

}
