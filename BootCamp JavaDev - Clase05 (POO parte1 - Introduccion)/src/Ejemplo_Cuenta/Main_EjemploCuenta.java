package Ejemplo_Cuenta;

import java.util.List;

public class Main_EjemploCuenta {

	public static void main(String[] args) {
		
		System.out.println(" • Class CUENTA: ");
        System.out.println("-- cuenta1 --");
        Cuenta cuenta1=new Cuenta(1, "arg$");
        cuenta1.depositar(80000);
        cuenta1.depositar(160000); //240000
        cuenta1.debitar(25000);	   //215000
        System.out.println(cuenta1);
        
        System.out.println("-- cuenta2 --");
        Cuenta cuenta2=new Cuenta(2,"arg$");
        cuenta2.depositar(350000);
        System.out.println(cuenta2);
        
        System.out.println("");
        System.out.println(" ● Class CLIENTE PERSONA: ");
        System.out.println("-- clientePersona1 --");
        ClientePersona clientePersona1=new ClientePersona(1,"Andres",24,cuenta1);
        /* Para invocar un Método de otra Clase, se debe primero traer el 'Objeto' que tenga el Metodo. 
        En este caso, 'depositar ()' y 'debitar()' son Metodos de la 'Clase Cuenta', no de la 'Clase ClientePersona'. Por este 
        motivo primero se debe llamar el 'Objeto Cuenta' desde el 'Objeto ClientePersona', y recien podremos invocar cualquiera de
        los Métodos 'depositar ()' y 'debitar()' ya que forman parte del 'Objeto Cuenta'.
        */
        clientePersona1.getCuenta().depositar(25000); //240000
        clientePersona1.getCuenta().debitar(10000);   //230000
        clientePersona1.comprar();
        System.out.println("clientePersona1"+ clientePersona1);
        System.out.println("cuenta1" + cuenta1);
        System.out.println("");
    	
        System.out.println("Referencia de un OBJETO A OTRO");
        Cuenta Objeto_Referencia_ClientePersona1 = clientePersona1.getCuenta();
        Objeto_Referencia_ClientePersona1.depositar(20000); // => cuenta1.depositar(20000); =>250000
        Objeto_Referencia_ClientePersona1.debitar(6000); // => cuenta1.debitar(6000);		=>244000
        System.out.println(Objeto_Referencia_ClientePersona1);
        System.out.println(clientePersona1.getCuenta());
        System.out.println(cuenta1);
        
        System.out.println("");
        System.out.println("-- clientePersona2 --");
        ClientePersona clientePersona2=new ClientePersona(2,"Eliana",22,11);
        clientePersona2.getCuenta().depositar(60000);
        clientePersona2.comprar();
        System.out.println(clientePersona2);
        
        System.out.println("");
        System.out.println("-- clientePersona3 --");
        ClientePersona clientePersona3=new ClientePersona(1,"Juan",28,clientePersona2.getCuenta());
        clientePersona3.getCuenta().depositar(60000);
        clientePersona3.getCuenta().debitar(20000);
        System.out.println(clientePersona3);
        System.out.println(clientePersona2.getCuenta());
        
        
        System.out.println("");
        System.out.println(" ● Class ClienteEmpresa: ");
        System.out.println("-- clienteEmpresa1 --");
        ClienteEmpresa clienteEmpresa1=new ClienteEmpresa(1,"Todo Limpio srl","Lima 111");
        List<Cuenta> list=clienteEmpresa1.getCuentas(); //Se hace una Referencia de Objetos. 
        //clienteEmpresa1.getCuentas().add(cuenta1);
        list.add(cuenta1);                          // 244000
        list.add(cuenta2);                          // 1
        list.add(new Cuenta(10,"U$S"));             // 2
        list.get(0).depositar(120000);				// 3640000
        list.get(0).debitar(23000);					// 3410000
        list.get(1).depositar(35000);				// 385000
        list.get(2).depositar(12000);
        //list.remove(1);
        
        System.out.println(list.get(0)); //cuenta1
        System.out.println(list.get(1)); //cuenta2
        System.out.println(list.get(2)); //cuenta10
        clienteEmpresa1.comprar();
        System.out.println(clienteEmpresa1);
        
        
        // ● Class ClienteEmpresa: 
        System.out.println("");
        System.out.println(" ● Class ClientePersonaSocio: ");
        System.out.println("-- clientePersonaSocio1 --");
        
        ClientePersonaSocio clientePersonaSocio1 = new ClientePersonaSocio(1, "Esteban",36); 
        
        System.out.println(clientePersonaSocio1);
        
        clientePersonaSocio1.UsarCuenta(cuenta2);
        clientePersonaSocio1.UsarCuenta(clientePersona1.getCuenta());
        clientePersonaSocio1.DepostiarCuenta(cuenta2, 100000); //485000
        System.out.println(cuenta2); 
        
        
        
	}

}
