package Ejemplo_Herencia;

public class Main_EjemploHerencia {

	public static void main(String[] args) {

		
		System.out.println(" ● Class DIRECCION: ");
        System.out.println("-- direccion1 --");
        Direccion direccion1=new Direccion ("Moreno", 2800, "VICENTE LOPEZ");
        System.out.println(direccion1);

        System.out.println("-- direccion2 --");
        Direccion direccion2=new Direccion ("Juncal", 222,"1", "A");
        System.out.println(direccion2);

        System.out.println("-- direccion3 --");
        Direccion direccion3=new Direccion ("Peron", 456,"PB", "A", "MORON");
        System.out.println(direccion3);
        
        System.out.println("");
        
        /*
        
        La 'Clase Persona' es 'Abstracta', no puedo crear objetos de una clase Abstracta. De todas formas se testeo la 'Clase', 
        y luego se hizo abstracta nuevamente para su correcto uso. 
                     
        System.out.println("● Class PERSONA");
        System.out.println("-- persona1 --");
        Persona persona1=new Persona("Alan", 27, direccion1);
        persona1.Saludar();
        System.out.println(persona1);

        System.out.println("-- persona2 --");
        Persona persona2=new Persona("Lisando", 22, direccion1);
        persona2.Saludar();
        System.out.println(persona2);
        
        System.out.println("-- persona3 --");
        Persona persona3=new Persona("Debora", 23, new Direccion("Peña", 2485, "4", "E"));
        persona3.Saludar();
        System.out.println(persona3);
        
        
        //Ejemplo: Lisandro se muda a casa de Debora
        System.out.println("");
        System.out.println("Ejemplo: Lisandro se muda a casa de Debora");
        persona2.setDireccion(persona3.getDireccion());
        System.out.println(persona2);
         
         */
        
        System.out.println("");
        System.out.println(" • Class VENDEDOR: ");
        System.out.println("-- vendedor1 --");
        Vendedor vendedor1 = new Vendedor(1, 350000, "Cristian", 36, direccion2);
        vendedor1.Saludar();
        System.out.println(vendedor1.getNombre());
        System.out.println(vendedor1.getDireccion().getCiudad());
        System.out.println(vendedor1);
        
        System.out.println("-- vendedor2 --");
        Vendedor vendedor2 = new Vendedor(2, 400000, "Lorena", 35, direccion1);
        vendedor2.Saludar();
        System.out.println(vendedor2.getNombre());
        System.out.println(vendedor2.getDireccion().getCiudad());
        System.out.println(vendedor2);
        
        System.out.println("-- vendedor3 --");
        Vendedor vendedor3 = new Vendedor(3, 380000, "Angel", 33, new Direccion ("Peña", 2485, "4", "E") );
        vendedor3.Saludar();
        System.out.println(vendedor3.getNombre());
        System.out.println(vendedor3.getDireccion().getCiudad());
        System.out.println(vendedor3);
        
        
        
        System.out.println("");
        System.out.println(" ● Class CLIENTE / CUENTA: ");
        
        System.out.println("-- cuenta1 --");
        Cuenta cuenta1=new Cuenta(1, "arg$");
        cuenta1.depositar(280000);
        System.out.println(cuenta1);

        System.out.println("-- cliente1 --");
        Cliente cliente1 = new Cliente(1, cuenta1, "Juan", 44, direccion1);
        cliente1.Saludar();
        System.out.println(cliente1);
        
        System.out.println("-- cliente2 --");
        Cliente cliente2 = new Cliente(1, new Cuenta(10, "ars$"), "Juan", 44, new Direccion("Av. Libertador", 3600, "SAN ISIDRO"));
        cliente2.Saludar();
        cliente2.getCuenta().depositar(100000);
        System.out.println(cliente2);
        System.out.println(cliente2.getClass());
        System.out.println(cliente2.getNroCliente());
        System.out.println(cliente2.getNombre());
        System.out.println(cliente2.getEdad());
        System.out.println(cliente2.getDireccion());
        System.out.println(cliente2.getDireccion().getCiudad());
        System.out.println(cliente2.getDireccion().getCalle());
        System.out.println(cliente2.getDireccion().getNumero());
        System.out.println(cliente2.getCuenta());
        System.out.println(cliente2.getCuenta().getSaldo());
        
	}

}
