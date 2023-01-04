package Enums;

import java.util.Arrays;

public class Test_Enums {
	
	public static void main(String[] args) {
		
		System.out.println("• ENUM DIA: ");
        System.out.println(Dia.VIERNES);
        
        System.out.println(Dia.JUEVES +", "+ Dia.VIERNES);

        System.out.println("");
        System.out.println("------- d1 -------");
        Dia d1 = Dia.LUNES;    	 
        System.out.println("d1 = " + d1);            

        System.out.println("");
        System.out.println("------- d2 -------");
        Dia d2 = Dia.valueOf("MARTES");		
        System.out.println(d2.toString());					// Devuelve una breve descripción del objeto enum
        System.out.println(d2.name());						// Devuelve el nombre del enumerado.
        System.out.println(d2.ordinal()); 			// Devuelve la posición del enum según este declarado comenzando desde cero
        System.out.println(Arrays.toString(Dia.values())); // Devuelve un arreglo con todos los elementos. 
        System.out.println("d2 = " + d2);		  			
        
        System.out.println("• ENUM COLORES: ");
        System.out.println("------- color1 -------");
        Colores color1 = Colores.ROJO;
        System.out.println("color1 = " + color1);
        System.out.println(color1.getHEX_COD());
        System.out.println(color1.getRGB_COD());
        
        System.out.println("");
        System.out.println("------- color2 -------");
        Colores color2 = Colores.NEGRO;
        System.out.println("color2 = " + color2);
        System.out.println(color2.getHEX_COD());
        System.out.println(color2.getRGB_COD());	
        color2.setHEX_COD("000000");
        color2.setRGB_COD("0, 0, 0");
        System.out.println(color2.getHEX_COD());
        System.out.println(color2.getRGB_COD());	

	}

}
