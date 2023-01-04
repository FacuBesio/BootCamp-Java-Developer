package Ejemplo3_InterfazFuncional;

@FunctionalInterface
public interface Interfaz_Funcional {

	public String metodo_abst(String name);
    
	
    public default String metodo_default1(){
        return  "metodo_default1 - Hello World";
    }

    public default String metodo_default2(){
        return "metodo_default2 - Hola Universo";
    }

    public default String metodo_default3(){
        return "metodo_default3 - Hola Mundo";
    }
	
	
}
