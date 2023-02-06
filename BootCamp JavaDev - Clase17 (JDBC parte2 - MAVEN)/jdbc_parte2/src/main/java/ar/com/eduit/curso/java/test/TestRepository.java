package ar.com.eduit.curso.java.test;

import java.util.List;

import ar.com.eduit.curso.java.connectors.Connector;
import ar.com.eduit.curso.java.entities.Curso;
import ar.com.eduit.curso.java.enums.Dia;
import ar.com.eduit.curso.java.enums.Turno;
import ar.com.eduit.curso.java.repositories.interfaces.I_CursoRepository;
import ar.com.eduit.curso.java.repositories.jdbc.CursoRepositoryDao;

public class TestRepository {

	public static void main(String[] args) {

		I_CursoRepository cr = new CursoRepositoryDao(Connector.conexion_bbdd());
        
	// • SAVE - INSERT:
	/*	System.out.println("• save(): ");
        Curso curso1=new Curso("PHP", "GOMEZ", Dia.VIERNES, Turno.TARDE);
        System.out.println(curso1); // No tiene id.
        cr.save(curso1);
        System.out.println(curso1); // Se se guardo correctamente en la BBDD, debería tener un id.
        
        Curso curso2=new Curso("HTML", "TORRES", Dia.JUEVES, Turno.NOCHE);
        cr.save(curso2);
        
        Curso curso3=new Curso("JAVA", "SENHEISER", Dia.MIERCOLES, Turno.MAÑANA);
        cr.save(curso3);
        
        Curso curso4=new Curso("JS", "AYALA", Dia.MARTES, Turno.TARDE);
        cr.save(curso4);
        
        Curso curso5=new Curso("PHYTON", "MERCADO", Dia.LUNES, Turno.MAÑANA);
        cr.save(curso5);
        System.out.println("**************************************************");
        */
	// • SELECT * FROM .... :
        System.out.println("");
        System.out.println(". getAll(): ");
        List<Curso>list=cr.getAll();
        list.forEach(System.out::println);
        System.out.println("**************************************************");
        
     // • SELECT * FROM ... WHERE ID =?:
        System.out.println();
        System.out.println(". getById(): ");
        System.out.println(cr.getById(3));
        System.out.println("**************************************************");

    // • DELETE FROM ... WHERE ID=?:
        System.out.println();
        System.out.println(". remove(): ");
        System.out.println(cr.getById(2));
        cr.remove(cr.getById(2));
        System.out.println(cr.getById(2));
        System.out.println("**************************************************");
    
    // • UPDATE:
        System.out.println();
        System.out.println(". update(): ");
    /*Se obtiene el Curso que se quiere actualizar y se copia a un Objeto que lo contenga, se modifican los Parámetros 
    deseados, y mediante el Método 'update(Curso curso)' se ingresa el Curso con la o las actualizaciones realizadas. 
    */
	    Curso curso_update= cr.getById(5);
	    curso_update.setProfesor("Segovia_Update");
	    curso_update.setDia(Dia.VIERNES);
	    curso_update.setTurno(Turno.TARDE);
	    cr.update(curso_update);
	    System.out.println(cr.getById(5));
	System.out.println("**************************************************");
    
	// • SELECT * FROM ... WHERE ... LIKE %..%:
	System.out.println();
	System.out.println(". getLikeTitulo('ja'): "); 
    list=cr.getLikeTitulo("ja");
    list.forEach(System.out::println);
    
    System.out.println(". getLikeTitulo('av'): "); 
    list=cr.getLikeTitulo("av");
    list.forEach(System.out::println);
   
    System.out.println(". getLikeTitulo('j'): "); 
    list=cr.getLikeTitulo("j");
    list.forEach(System.out::println);
    
    System.out.println("**************************************************");
	
	}
}
