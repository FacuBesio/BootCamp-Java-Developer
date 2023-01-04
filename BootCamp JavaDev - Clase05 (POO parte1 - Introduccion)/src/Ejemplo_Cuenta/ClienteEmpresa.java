package Ejemplo_Cuenta;

import java.util.ArrayList;
import java.util.List;

public class ClienteEmpresa {
	  private int nro;
	    private String razonSocial;
	    private String direccion;
	    //private Cuenta[] cuentas=new Cuenta[10];
	    private List<Cuenta> cuentas=new ArrayList<Cuenta>();

	    
	    public ClienteEmpresa(int nro, String razonSocial, String direccion) {
	        this.nro = nro;
	        this.razonSocial = razonSocial;
	        this.direccion = direccion;
	    }
	    
	    public ClienteEmpresa(int nro, String razonSocial, String direccion, Cuenta cuenta) {
	        this.nro = nro;
	        this.razonSocial = razonSocial;
	        this.direccion = direccion;
	        this.cuentas.add(cuenta);
	    }
	    
	    public void comprar(){
	        System.out.println("Cliente Empresa realiza una compra");
	    }

	    @Override
	    public String toString() {
	        return "ClienteEmpresa{" + "nro=" + nro + ", razonSocial=" + razonSocial + '}';
	    }

	    
	    public int getNro() {
	        return nro;
	    }

	    public String getRazonSocial() {
	        return razonSocial;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public List<Cuenta> getCuentas() {
	        return cuentas;
	    }

	}
