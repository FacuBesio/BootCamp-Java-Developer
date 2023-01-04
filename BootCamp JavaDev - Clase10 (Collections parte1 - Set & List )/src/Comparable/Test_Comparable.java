package Comparable;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test_Comparable {

	public static void main(String[] args) {
 
		//. Orden de los Elementos con Objetos de Clases Propias.
		System.out.println(". --- set2_TreeSet <Auto> Orden propio establecido ---");
        Set<Auto> set_TreeSet = new TreeSet();
        set_TreeSet.add(new Auto("Peugeot","Partner","Azul"));
        set_TreeSet.add(new Auto("Citroen","C4","Bordo"));
        set_TreeSet.add(new Auto ("FIAT", "UNO", "Gris"));
        set_TreeSet.add(new Auto("Citroen","Berlingo","Negro"));
        set_TreeSet.forEach(System.out::println);
        
        
        
        
        
    }

}
