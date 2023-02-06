package Calculadora_Ejemplos;

public class Test_Calculadora {

	public static void main(String[] args) {
		int a = 4;
		int b = 0;
		Calculadora c1 = new Calculadora();
        
//      c1.Dividir(a,b); => Es CHECKED, el sistema obliga a tratar el Metodo, ya que tiene declarado que hay Excepcion a tratar. 
        
		
        try {
            c1.Dividir(a,b);

        } catch (DivisionPorCero_Excepcion e) {
            //Usa los Metodos de la Clase DivisionPorCero.
            System.out.println(e.getMessage());
            System.out.println(e);
          
            //e.printStackTrace();
        } 
        System.out.println("... CONTINUACION DE EJECUCION DE PROGRAMA");
        
        System.out.println();
        try {
            c1.Dividir2(a,b);

        } catch (Calculadora2Excepcion e) {

            System.out.println(e.getMessage());
            System.out.println(e);
        } 
        System.out.println("... CONTINUACION DE EJECUCION DE PROGRAMA");

	}

}
