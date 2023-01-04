package Clase02;

public class RelojDigital {

	public static void main(String[] args) {
		
		System.out.println(" ● Reloj Digital: ");
		
		for (int d = 0 ; d < 30 ; d++) {
			String day;
			if (d < 10) {day= "0" + d;} else {day = String.valueOf(d);}
			
			for (int h = 0 ; h < 24 ; h++) {
				String hora;
				if (h < 10) {hora= "0" + h;} else {hora = String.valueOf(h);}
				
				for (int min = 0 ; min < 60 ; min++) {
					String minuto;
					if (min < 10) {minuto= "0" + min;} else {minuto =String.valueOf(min);}
					
					for (int seg = 0 ; seg < 60 ; seg++) {
						String segundo;
						if (seg < 10) {segundo= "0" + seg;} else {segundo = String.valueOf(seg);}
						
						System.out.println( "Día: " + day + " - "+ "Hora: " + hora +" : "+ minuto+" : "+ segundo );
						
						// emula la duracion de 1000 ms => milisegundos; 1 segundo
						try {
							Thread.sleep (1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						} 
					}
				}
			}
		}

	}

}
