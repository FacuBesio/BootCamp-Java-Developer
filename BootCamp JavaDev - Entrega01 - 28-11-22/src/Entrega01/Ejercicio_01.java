/*
 ● Entrega 01 - Ejercicio 01:
 Cree un programa que evalúe una oración definida en el mismo código, y muestre cual es el carácter que más se repite y cuantas veces 
 lo hace.
Criterios de aceptación:
. Debe contabilizar como un mismo carácter tanto las letras mayúsculas como minúsculas, sin diferenciarlas.
. No debe incluir como carácter a evaluar caracteres especiales como el espacio en blanco, ni puntos o comas.
Ej : “De Esta forma, estoy entendiendo……….” --> Caracter ‘e’, 6 repeticiones

*/

package Entrega01;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		Scanner tecladoIn = new Scanner(System.in);
        int cantidadRepeticiones = 0;
        String cadenaTexto;
        char caracter = ' '; 
        
        //ENTRADA DE DATOS
        System.out.println("Por favor introduzca el Texto a evaluar:");
        cadenaTexto = tecladoIn.nextLine();
        
        //PROCESAMIENTO DE DATOS
        for (int i = 0; i < cadenaTexto.length(); i++) {
            char charAux = cadenaTexto.toLowerCase().charAt(i);
            int contadorAux = 0;
            
            if (charAux == ' ' || charAux == '.' || charAux == ',') {
                continue;
            }
            
            for(int j =0; j < cadenaTexto.length(); j++){
                if (charAux == cadenaTexto.toLowerCase().charAt(j)){
                    contadorAux++;
                }
            }
            
            if (contadorAux > cantidadRepeticiones){
                caracter = cadenaTexto.toLowerCase().charAt(i);
                cantidadRepeticiones=contadorAux;
            }
        }
        
        //SALIDA DE DATOS
        System.out.println("• El caracter con mas repeticiones es:" );
        System.out.println("Caracter '" + caracter + "', "+cantidadRepeticiones+" repeticiones");
    }
}
