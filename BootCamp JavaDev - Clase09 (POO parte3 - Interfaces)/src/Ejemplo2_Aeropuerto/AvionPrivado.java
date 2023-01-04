package Ejemplo2_Aeropuerto;

public class AvionPrivado implements Volador{
	
	private String licencia;

    
    public AvionPrivado(String licencia) {
        this.licencia = licencia;
    }

	
    @Override
    public void aterrizar(){
            System.out.println("Aterriza AVION PRIVADO");
    }

    @Override
    public String toString() {
        return "AvionPrivado{" + "licencia=" + licencia + '}';
    }
    
    public String getLicencia(){
    return licencia;
    }

    public void setLicencia(String lic){
    this.licencia = lic;
    }
}


