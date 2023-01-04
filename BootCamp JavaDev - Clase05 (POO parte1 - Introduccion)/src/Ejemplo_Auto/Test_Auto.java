package Ejemplo_Auto;

public class Test_Auto {

	public static void main(String[] args) {
		
		
		//  â—? CLASS AUTO:
		System.out.println("â—? CLASS AUTO:");
		System.out.println("-- auto1 --");
        Auto auto1=new Auto();          //se construye un Objeto de la Clase Auto. 
        auto1.marca="Fiat";
        auto1.modelo="Cronos";
        auto1.color="Rojo";
        auto1.acelerar();       //10
        auto1.acelerar();       //20
        auto1.acelerar();       //30
        auto1.frenar();         //20
        System.out.println("auto1.velocidad = " + auto1.velocidad);
        
        System.out.println(auto1.marca+" "+auto1.modelo+" "+auto1.color+" "+auto1.velocidad);
        
        System.out.println("-- auto2 --");
        Auto auto2=new Auto();
        auto2.marca="Citroen";
        auto2.modelo="Berlingo";
        auto2.color="Verde";
        
        for(int a=0;a<=50;a++) auto2.acelerar(); 
        System.out.println("auto2.velocidad = " + auto2.obtenerVelocidad());
        System.out.println(auto2.getEstado());
        
        System.out.println("-- auto3 --");
        Auto auto3=new Auto("Peugeot","206","Gris",0);
        System.out.println(auto3.getEstado());
        System.out.println("");
        
        System.out.println("************************************************************");
        
        //  â—? CLASS AUTO_ENCAPSULADO:
        System.out.println("");
        System.out.println("â—? CLASS AUTO_ENCAPSULADO: ");
		System.out.println("-------- auto_e1 --------  ");
		Auto_Encapsulado auto_e1 = new Auto_Encapsulado();
		auto_e1.setColor ("Negro");
		auto_e1.setMarca ("HONDA");
		auto_e1.setModelo("CIVIC");
		auto_e1.setVelocidad(0);
		System.out.println(auto_e1.getEstado());
		
		auto_e1.setVelocidad(100);
		System.out.println(auto_e1.getEstado());
		
		System.out.println("-------- auto_e2 --------  ");
		Auto_Encapsulado auto_e2 = new Auto_Encapsulado("Renault","Clio","Azul", 0);
		System.out.println(auto_e2.getEstado());
		
		auto_e2.acelerar(80);
		System.out.println(auto_e2.getEstado());
		

	}

}
