/*
 ● Entrega 01 - Ejercicio 02:
 
 El programa solicitará el ingreso la cantidad de alumnos a procesar.
Para cada alumno se deberá ingresar los siguientes datos:
- nombre String
- nota que obtuvo el alumno (numérico >=0 <=

Al finalizar la carga de datos, se procederá a listar la siguiente información:
. Alumno/s con la calificación mas alta
. Alumno/s con la calificación mas baja
. Cantidad de alumnos que promocionan (promedio >= 7)
. Cantidad de alumnos que deben recursar la materia (promedio < 7)
 
 */

package Entrega01;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		int notaMasAlta=0;
        int notaMasBaja=10;
        
        //ENTRADA DE DATOS
        Scanner tecladoIn = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad Total de Alumnos que va a registrar: ");
        int cantidadAlumnos = tecladoIn.nextInt();
        String [] alumnos = new String [cantidadAlumnos];
        int [] notas = new int [cantidadAlumnos];
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese NOMBRE del Alumno ["+(i+1)+"]:");
            alumnos[i] = tecladoIn.next();
            System.out.println("Ingrese NOTA del Alumno ["+(i+1)+"]:");
            notas[i] = tecladoIn.nextInt();
        }
         
        //PROCESAMIENTO DE DATOS
        //NOTA MAS ALTA
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]>notaMasAlta){
            notaMasAlta = notas[i];
            }
        }
        
        //NOTA MAS BAJA
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]<=notaMasBaja){
            notaMasBaja = notas[i];
            }
        }
        
        //SALIDA DE DATOS
        System.out.println("*************************************************************************************************");
        //NOTA MAS ALTA
        System.out.println("• NOTA MAS ALTA: " + notaMasAlta);
        System.out.println(". Alumnos con Nota mas alta: ");
        for (int i = 0; i < notas.length; i++) {
            if (notaMasAlta == notas[i]){
                System.out.println(alumnos[i]);
            }
        }
        
        //NOTA MAS BAJA
        System.out.println("• NOTA MAS BAJA: " + notaMasBaja);
        System.out.println(". Alumnos con Nota mas baja: ");
        for (int i = 0; i < notas.length; i++) {
            if (notaMasBaja == notas[i]){
                System.out.println(alumnos[i]);
            }
        }
        
        //ALUMNOS QUE PROMOCIONAN CON PROMEDIO >= 7
        System.out.println("• ALUMNOS QUE PROMOCIONAN CON PROMEDIO >= 7");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 7){
                System.out.println(alumnos[i]+ ", nota " + notas[i]);
            }
        }
        
        //ALUMNOS QUE DEBERAN RECURSAR
        System.out.println("• ALUMNOS QUE DEBERAN RECURSAR < 7");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 7){
                System.out.println(alumnos[i] + ", nota " + notas[i]);
            }
        }

    }
}