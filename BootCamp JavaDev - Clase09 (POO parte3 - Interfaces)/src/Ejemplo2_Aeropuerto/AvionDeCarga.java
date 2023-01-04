package Ejemplo2_Aeropuerto;

public class AvionDeCarga implements Volador {
	
	private String tipo;

    @Override
    public void aterrizar(){
            System.out.println("Aterriza AVION DE CARGA");
    }

    @Override
    public String toString() {
        return "AvionDeCarga{" + "tipo=" + tipo + '}';
    }
    
    public String getTipo(){
    return tipo;
    }

    public void setTipo(String tipo){
    this.tipo = tipo;
    }

}
