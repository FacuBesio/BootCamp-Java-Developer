package ar.com.fifa;

import ar.com.fifa.model.CuerpoTecnico;
import ar.com.fifa.model.Equipo;
import ar.com.fifa.model.Fecha;
import ar.com.fifa.model.Jugador;
import ar.com.fifa.model.Partido;
import ar.com.fifa.model.Torneo;
import ar.com.fifa.model.Zona;

public class MainFifa2022 {
	
	public static void main(String[] args) {
		
		System.out.println("**************** EQUIPO 1 - ARGENTINA ****************");
		//• JUGADORES - ARGENTINA
		Jugador jugadorArg1 = new Jugador("Messi", 35,"Delantero","PSG");
		Jugador jugadorArg2 = new Jugador("jugadorArg2", 25,"Defensor","Real Madrid");
		Jugador jugadorArg3 = new Jugador("jugadorArg3", 24,"Arquero","Barcelona");
		Jugador jugadorArg4 = new Jugador("jugadorArg4", 28,"Delantero","PSG");
		
		//• CUERPO TECNICO - ARGENTINA
		CuerpoTecnico ctArgentina = new CuerpoTecnico();
		ctArgentina.setCoach_name("DT Argentina");
		ctArgentina.setAssistance("asistenteArg1");
		ctArgentina.setAssistance("asistenteArg2");
		ctArgentina.setAssistance("asistenteArg3");
		
		//• EQUIPO - ARGENTINA
		Equipo equipoA = new Equipo();
		equipoA.setPais("Argentina");
		equipoA.setJugadores(jugadorArg1);
		equipoA.setJugadores(jugadorArg2);
		equipoA.setJugadores(jugadorArg3);
		equipoA.setJugadores(jugadorArg4);
		
		equipoA.setCuerpoTecnico(ctArgentina);
		
		System.out.println(equipoA);
		System.out.println("");
		System.out.println("• JUGADORES:");
		for (Jugador j : equipoA.getJugadores()) {
			System.out.println(j);
		}
		System.out.println("• CUERPO TECNICO:");
		System.out.println(equipoA.getCuerpoTecnico());
		 
		System.out.println("**************** EQUIPO 2 - BRASIL ****************");
		//• CUERPO TECNICO - BRASIL
		CuerpoTecnico ctBrasil = new CuerpoTecnico();
		ctBrasil.setCoach_name("DT Brasil");
		ctBrasil.setAssistance("asistenteBra1");
		ctBrasil.setAssistance("asistenteBra2");
		ctBrasil.setAssistance("asistenteBra3");
		
		//• EQUIPO - BRASIL
		Equipo equipoB = new Equipo("Brasil");
		equipoB.setJugadores(new Jugador("Neymar jr", 30,"Delantero","PSG"));
		equipoB.setJugadores(new Jugador("JugadorBra2", 28,"Defensor","Barcelona"));
		equipoB.setJugadores(new Jugador("JugadorBra3", 24,"Delantero","Real Madrid"));
		equipoB.setJugadores(new Jugador("JugadorBra4", 25,"Arquero","PSG"));
		equipoB.setCuerpoTecnico(ctBrasil);
		
		System.out.println(equipoB);
		System.out.println("");
		System.out.println("• JUGADORES:");
		for (Jugador j : equipoB.getJugadores()) {
			System.out.println(j);
		}
		System.out.println("• CUERPO TECNICO:");
		System.out.println(equipoB.getCuerpoTecnico());
		
		//• PARTIDO
		System.out.println("");
		System.out.println("**************** PARTIDO 1 ****************");
		Partido partido1 = new Partido(equipoA, equipoB);
		
		System.out.println("EquipoA: " + partido1.getEquipo1().getPais());
		System.out.println("EquipoB: " + partido1.getEquipo2().getPais());
		
		System.out.println("RESULTADO: ");
		partido1.Resultado_Partido(2, 1);
		
		System.out.println("**************** PARTIDO 2 ****************");
		Equipo equipoC = new Equipo("España");
		Equipo equipoD = new Equipo("Francia");
		
		Partido partido2 = new Partido(equipoC, equipoD);
		System.out.println("Equipo3: " + partido2.getEquipo1().getPais());
		System.out.println("Equipo4: " + partido2.getEquipo2().getPais());
		System.out.println("RESULTADO: ");
		partido2.Resultado_Partido(0, 1);
		
		System.out.println("**************** PARTIDO 3 ****************");
		Equipo equipoE = new Equipo("Colombia");
		Equipo equipoF = new Equipo("Ecuador");
		
		Partido partido3 = new Partido(equipoE, equipoF);
		System.out.println("Equipo5: " + partido3.getEquipo1().getPais());
		System.out.println("Equipo6: " + partido3.getEquipo2().getPais());
		System.out.println("RESULTADO: ");
		partido3.Resultado_Partido(0, 0);
		
		System.out.println("************* PARTIDOS 4, 5 & 6 *************");
		Partido partido4 = new Partido(equipoA, equipoD);
		Partido partido5 = new Partido(equipoB, equipoE);
		Partido partido6 = new Partido(equipoC, equipoF);
		
		
		System.out.println("");
		System.out.println("**************** FECHA 1 ****************");
		Fecha fecha1 = new Fecha();
		fecha1.setPartidos(partido1);
		fecha1.setPartidos(partido2);
		fecha1.setPartidos(partido3);
		
		fecha1.ListarPartidos();
		
		System.out.println("");
		System.out.println("**************** FECHA 2 ****************");
		Fecha fecha2 = new Fecha();
		fecha2.setPartidos(partido4);
		fecha2.setPartidos(partido5);
		fecha2.setPartidos(partido6);
		
		fecha2.ListarPartidos();
		
		System.out.println("");
		System.out.println("**************** ZONA A ****************");
		Zona zonaA = new Zona();
		zonaA.setNombre_zona("ZONA A");
		zonaA.setFechas(fecha1);
		zonaA.setFechas(fecha2);
		
		zonaA.ListarFechas();

		// ZONA B
		Zona zonaB = new Zona();
		zonaB.setNombre_zona("ZONA B");
		
		System.out.println("");
		System.out.println("**************** TORNEO ****************");
		Torneo torneo_mundial = new Torneo();
		torneo_mundial.setZonas(zonaA);
		torneo_mundial.setZonas(zonaB);
		
		torneo_mundial.ListarZonas();
		
	}

}

