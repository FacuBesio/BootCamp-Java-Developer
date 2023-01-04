package Ejemplo3_InterfazFuncional;

public class Test_InterfazFuncional {

	public static void main(String[] args) {
		
		System.out.println("-------- in_fun1 --------");
        
        Interfaz_Funcional in_fun1 = (name) -> "Hello " + name;
        System.out.println(in_fun1.metodo_abst("Juan Rosales"));
        
        System.out.println(in_fun1.metodo_default1());
        System.out.println(in_fun1.metodo_default2());
        System.out.println(in_fun1.metodo_default3());
        
        System.out.println("");
        System.out.println("-------- in_fun2 --------");
        
        Interfaz_Funcional in_fun2 = (name) -> name;
        System.out.println(in_fun2.metodo_abst("Juan Manuel"));
        
        System.out.println(in_fun2.metodo_default1());
        System.out.println(in_fun2.metodo_default2());
        System.out.println(in_fun2.metodo_default3());
        
        System.out.println("");
        System.out.println("-------- in_fun3 --------");
        Interfaz_Funcional in_fun3 = (name) -> "Hola " + name;
        System.out.println(in_fun3.metodo_abst("Juan Rosales"));
        System.out.println(in_fun3.metodo_default1());
        System.out.println(in_fun3.metodo_default2());
        System.out.println(in_fun3.metodo_default3());

	}

}
