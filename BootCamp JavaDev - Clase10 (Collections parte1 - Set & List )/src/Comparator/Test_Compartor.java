package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test_Compartor {

	public static void main(String[] args) {

		Persona p1 = new Persona("Oscar", 32);
        Persona p2 = new Persona("Juan", 22);
        Persona p3 = new Persona("Marta", 21);
        Persona p4 = new Persona("Juan", 18);
        Persona p5 = new Persona("Marta", 30);
        Persona p6 = new Persona("Martin", 30);
        Persona p7 = new Persona("Oscar", 28);
        Persona p8 = new Persona("Juana", 32);
        
        List<Persona> list = new ArrayList<Persona>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        
        //Opcion 1
        System.out.println("Opcion 1");
        Collections.sort(list, new Clase_Comparator());
        list.forEach(System.out::println);
        
        //Opcion 2
        System.out.println("");
        System.out.println("Opcion 2");
        Collections.sort(list, new Comparator<Persona>(){
                @Override
                public int compare(Persona p1, Persona p2) {

                    return p1.getNombre().compareTo(p2.getNombre()) *-1;
                }
        
            }
        );
        list.forEach(System.out::println);
        
        //Opcion 3
        System.out.println("");
        System.out.println("Opcion 3");
        list.stream().sorted(new Clase_Comparator()).forEach(System.out::println);

	}

}
