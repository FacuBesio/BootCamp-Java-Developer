package Calculadora_Ejemplos;

public class Calculadora {

	public int Dividir(int a, int b) throws DivisionPorCero_Excepcion{
        if (b==0){
            throw new DivisionPorCero_Excepcion(); // Invoca a un Metodo de la Exepcion. 
        }
        System.out.println(a/b);
        return (a/b);
    }
    
	
	public int Dividir2(int a, int b) throws Calculadora2Excepcion{
        if (b==0){
            throw new Calculadora2Excepcion("No se puede dividir por Cero desde Calculadora2Excepcion");
            // Invoca al Constructor de la Exepcion. 
        }
        System.out.println(a/b);
        
    return (a/b);
    }
}


